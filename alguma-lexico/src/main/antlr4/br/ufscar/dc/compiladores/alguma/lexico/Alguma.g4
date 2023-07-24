grammar Alguma;

// Ignora
COMENTARIO:
    '{' ~('\n' | '}' | '\r')* '}' { skip(); } ;
WS:
    ( ' ' | '\t' | '\r' | '\n' ) { skip(); } ;


// Identificadores
IDENT: ([a-zA-Z]) ([a-zA-Z] | [0-9] | '_')*;
variavel: identificador (',' identificador)* ':' tipo;
identificador: IDENT ('.' IDENT)* dimensao;
dimensao: ('[' exp_aritmetica ']')*;

//Constantes
CADEIA: '"' ~('\n' | '"' | '\\')* '"';
NUM_INT: ('0'..'9')+;
NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?;
valor_constante: CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso';

//tipos
tipo_basico: 'literal' | 'inteiro' | 'real' | 'logico' | 'tipo' | 'var' ;
tipo_basico_ident: tipo_basico | IDENT;
tipo_estendido: '^'? tipo_basico_ident;
registro: 'registro' variavel* 'fim_registro';
tipo: registro | tipo_estendido;

// Opera��es
op1: '+' | '-';
op2: '*' | '/';
op3: '%';
op_unario: '-';
op_relacional: '>' | '>=' | '<' | '<=' | '<>' | '=';
op_logico_1:  'ou';
op_logico_2: 'e';
parcela_unario: '^'? identificador |
    IDENT '(' expressao (',' expressao)* ')' |
    NUM_INT |
    NUM_REAL |
    '(' expressao ')';
parcela_nao_unario: '&' identificador | CADEIA;
parcela: op_unario? parcela_unario | parcela_nao_unario;
fator: parcela (op3 parcela)*;
termo: fator (op2 fator)*;
exp_aritmetica: termo (op1 termo)*;
exp_relacional: exp_aritmetica (op_relacional exp_aritmetica)?;
parcela_logica: 'verdadeiro' | 'falso' | exp_relacional;
fator_logico: 'nao'? parcela_logica;
termo_logico: fator_logico (op_logico_2 fator_logico)*;
expressao: termo_logico (op_logico_1 termo_logico)*;


numero_intervalo: op_unario? NUM_INT ('..' op_unario? NUM_INT)?;
constantes: numero_intervalo (',' numero_intervalo)*;
item_selecao: constantes ':' cmd*;
selecao: item_selecao*;
cmdCaso: 'caso' exp_aritmetica 'seja' selecao ('senao' cmd*)? 'fim_caso';


// Comandos
cmdSe: 'se' expressao 'entao' cmd* ('senao' cmd*)? 'fim_se';
cmdPara: 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' cmd* 'fim_para';
cmdEnquanto: 'enquanto' expressao 'faca' cmd* 'fim_enquanto';
cmdFaca: 'faca' cmd* 'ate' expressao;
cmdAtribuicao: '^'? identificador '<-' expressao;
cmdChamada: IDENT '(' expressao (',' expressao)* ')';
cmdRetorne: 'retorne' expressao;
cmd: cmdLeia | cmdEscreva | cmdSe | cmdCaso | cmdPara | cmdEnquanto | cmdFaca | cmdAtribuicao | cmdChamada | cmdRetorne;
cmdLeia: 'leia' '(' '^'? identificador (',' '^'? identificador)* ')';
cmdEscreva: 'escreva' '(' expressao (',' expressao)* ')';


//parametros
parametro: 'var'? identificador (',' identificador)* ':' tipo_estendido;
parametros: parametro (',' parametro)*;

//declaráveis
declaracao_local: declaracao_variavel | declaracao_constante | declaracao_tipo;
declaracao_variavel: 'declare' variavel;
declaracao_constante: 'constante' IDENT ':' tipo_basico '=' valor_constante;
declaracao_tipo: 'tipo' IDENT ':' tipo;
corpo: declaracao_local* cmd*;


declaracao_global:
    'procedimento' IDENT '(' parametros? ')' corpo 'fim_procedimento' |
    'funcao' IDENT '(' parametros? ')' ':' tipo_estendido corpo 'fim_funcao' ;

declaracoes: (declaracao_local | declaracao_global)*;
//Começo e fim do programa e declarações
programa: declaracoes 'algoritmo' corpo 'fim_algoritmo';

// Erros poss�veis
CADEIA_NAO_FECHADA: '"' ~('"')* '\n';

COMENTARIO_NAO_FECHADO: '{' ~('}')* '\n';

SIMBOLO_NAO_IDENTIFICADO: '~' | '$' | '#' | '@' | '!' | '|' | '`';