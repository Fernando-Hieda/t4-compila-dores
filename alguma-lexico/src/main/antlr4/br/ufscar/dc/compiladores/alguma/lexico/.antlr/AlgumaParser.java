// Generated from c:\Users\fehie\OneDrive\Área de Trabalho\Faculdade\Compiladores\t3\t3-compila-dores\alguma-lexico\src\main\antlr4\br\u005Cufscar\dc\compiladores\alguma\lexico\Alguma.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		COMENTARIO=60, WS=61, IDENT=62, CADEIA=63, NUM_INT=64, NUM_REAL=65, CADEIA_NAO_FECHADA=66, 
		COMENTARIO_NAO_FECHADO=67, SIMBOLO_NAO_IDENTIFICADO=68;
	public static final int
		RULE_variavel = 0, RULE_identificador = 1, RULE_dimensao = 2, RULE_valor_constante = 3, 
		RULE_tipo_basico = 4, RULE_tipo_basico_ident = 5, RULE_tipo_estendido = 6, 
		RULE_registro = 7, RULE_tipo = 8, RULE_op1 = 9, RULE_op2 = 10, RULE_op3 = 11, 
		RULE_op_unario = 12, RULE_op_relacional = 13, RULE_op_logico_1 = 14, RULE_op_logico_2 = 15, 
		RULE_parcela_unario = 16, RULE_parcela_nao_unario = 17, RULE_parcela = 18, 
		RULE_fator = 19, RULE_termo = 20, RULE_exp_aritmetica = 21, RULE_exp_relacional = 22, 
		RULE_parcela_logica = 23, RULE_fator_logico = 24, RULE_termo_logico = 25, 
		RULE_expressao = 26, RULE_numero_intervalo = 27, RULE_constantes = 28, 
		RULE_item_selecao = 29, RULE_selecao = 30, RULE_cmdCaso = 31, RULE_cmdSe = 32, 
		RULE_cmdPara = 33, RULE_cmdEnquanto = 34, RULE_cmdFaca = 35, RULE_cmdAtribuicao = 36, 
		RULE_cmdChamada = 37, RULE_cmdRetorne = 38, RULE_cmd = 39, RULE_cmdLeia = 40, 
		RULE_cmdEscreva = 41, RULE_parametro = 42, RULE_parametros = 43, RULE_declaracao_local = 44, 
		RULE_declaracao_variavel = 45, RULE_declaracao_constante = 46, RULE_declaracao_tipo = 47, 
		RULE_corpo = 48, RULE_declaracao_global = 49, RULE_declaracoes = 50, RULE_programa = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"variavel", "identificador", "dimensao", "valor_constante", "tipo_basico", 
			"tipo_basico_ident", "tipo_estendido", "registro", "tipo", "op1", "op2", 
			"op3", "op_unario", "op_relacional", "op_logico_1", "op_logico_2", "parcela_unario", 
			"parcela_nao_unario", "parcela", "fator", "termo", "exp_aritmetica", 
			"exp_relacional", "parcela_logica", "fator_logico", "termo_logico", "expressao", 
			"numero_intervalo", "constantes", "item_selecao", "selecao", "cmdCaso", 
			"cmdSe", "cmdPara", "cmdEnquanto", "cmdFaca", "cmdAtribuicao", "cmdChamada", 
			"cmdRetorne", "cmd", "cmdLeia", "cmdEscreva", "parametro", "parametros", 
			"declaracao_local", "declaracao_variavel", "declaracao_constante", "declaracao_tipo", 
			"corpo", "declaracao_global", "declaracoes", "programa"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "'.'", "'['", "']'", "'verdadeiro'", "'falso'", "'literal'", 
			"'inteiro'", "'real'", "'logico'", "'tipo'", "'var'", "'^'", "'registro'", 
			"'fim_registro'", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'>='", "'<'", 
			"'<='", "'<>'", "'='", "'ou'", "'e'", "'('", "')'", "'&'", "'nao'", "'..'", 
			"'caso'", "'seja'", "'senao'", "'fim_caso'", "'se'", "'entao'", "'fim_se'", 
			"'para'", "'<-'", "'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", 
			"'retorne'", "'leia'", "'escreva'", "'declare'", "'constante'", "'procedimento'", 
			"'fim_procedimento'", "'funcao'", "'fim_funcao'", "'algoritmo'", "'fim_algoritmo'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"COMENTARIO", "WS", "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "CADEIA_NAO_FECHADA", 
			"COMENTARIO_NAO_FECHADO", "SIMBOLO_NAO_IDENTIFICADO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgumaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			identificador();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(105);
				match(T__0);
				setState(106);
				identificador();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__1);
			setState(113);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(AlgumaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(AlgumaParser.IDENT, i);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IDENT);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(116);
				match(T__2);
				setState(117);
				match(IDENT);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			dimensao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensaoContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(125);
				match(T__3);
				setState(126);
				exp_aritmetica();
				setState(127);
				match(T__4);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(AlgumaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(AlgumaParser.NUM_REAL, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__6 - 6)) | (1L << (CADEIA - 6)) | (1L << (NUM_INT - 6)) | (1L << (NUM_REAL - 6)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_basicoContext extends ParserRuleContext {
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo_basico_ident);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(142);
				match(T__13);
				}
			}

			setState(145);
			tipo_basico_ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegistroContext extends ParserRuleContext {
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__14);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(148);
				variavel();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				registro();
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				tipo_estendido();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op1Context extends ParserRuleContext {
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op2Context extends ParserRuleContext {
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op3Context extends ParserRuleContext {
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_unarioContext extends ParserRuleContext {
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_logico_1Context extends ParserRuleContext {
		public Op_logico_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_1; }
	}

	public final Op_logico_1Context op_logico_1() throws RecognitionException {
		Op_logico_1Context _localctx = new Op_logico_1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_op_logico_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_logico_2Context extends ParserRuleContext {
		public Op_logico_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_2; }
	}

	public final Op_logico_2Context op_logico_2() throws RecognitionException {
		Op_logico_2Context _localctx = new Op_logico_2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_op_logico_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode NUM_INT() { return getToken(AlgumaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(AlgumaParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parcela_unario);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(174);
					match(T__13);
					}
				}

				setState(177);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(IDENT);
				setState(179);
				match(T__29);
				setState(180);
				expressao();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(181);
					match(T__0);
					setState(182);
					expressao();
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(188);
				match(T__30);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(T__29);
				setState(193);
				expressao();
				setState(194);
				match(T__30);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parcela_nao_unario);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(T__31);
				setState(199);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(CADEIA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parcela);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__17:
			case T__29:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(203);
					op_unario();
					}
				}

				setState(206);
				parcela_unario();
				}
				break;
			case T__31:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				parcela_nao_unario();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			parcela();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(211);
				op3();
				setState(212);
				parcela();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			fator();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18 || _la==T__19) {
				{
				{
				setState(220);
				op2();
				setState(221);
				fator();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			termo();
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(229);
					op1();
					setState(230);
					termo();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			exp_aritmetica();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) {
				{
				setState(238);
				op_relacional();
				setState(239);
				exp_aritmetica();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_logicaContext extends ParserRuleContext {
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parcela_logica);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(T__6);
				}
				break;
			case T__13:
			case T__17:
			case T__29:
			case T__31:
			case IDENT:
			case CADEIA:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				exp_relacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(248);
				match(T__32);
				}
			}

			setState(251);
			parcela_logica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Op_logico_2Context> op_logico_2() {
			return getRuleContexts(Op_logico_2Context.class);
		}
		public Op_logico_2Context op_logico_2(int i) {
			return getRuleContext(Op_logico_2Context.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			fator_logico();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(254);
				op_logico_2();
				setState(255);
				fator_logico();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Op_logico_1Context> op_logico_1() {
			return getRuleContexts(Op_logico_1Context.class);
		}
		public Op_logico_1Context op_logico_1(int i) {
			return getRuleContext(Op_logico_1Context.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			termo_logico();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(263);
				op_logico_1();
				setState(264);
				termo_logico();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(AlgumaParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(AlgumaParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(271);
				op_unario();
				}
			}

			setState(274);
			match(NUM_INT);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(275);
				match(T__33);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(276);
					op_unario();
					}
				}

				setState(279);
				match(NUM_INT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			numero_intervalo();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(283);
				match(T__0);
				setState(284);
				numero_intervalo();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			constantes();
			setState(291);
			match(T__1);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__34) | (1L << T__38) | (1L << T__41) | (1L << T__44) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDENT))) != 0)) {
				{
				{
				setState(292);
				cmd();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==NUM_INT) {
				{
				{
				setState(298);
				item_selecao();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCasoContext extends ParserRuleContext {
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCaso; }
	}

	public final CmdCasoContext cmdCaso() throws RecognitionException {
		CmdCasoContext _localctx = new CmdCasoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(T__34);
			setState(305);
			exp_aritmetica();
			setState(306);
			match(T__35);
			setState(307);
			selecao();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(308);
				match(T__36);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__34) | (1L << T__38) | (1L << T__41) | (1L << T__44) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDENT))) != 0)) {
					{
					{
					setState(309);
					cmd();
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(317);
			match(T__37);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSeContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__38);
			setState(320);
			expressao();
			setState(321);
			match(T__39);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__34) | (1L << T__38) | (1L << T__41) | (1L << T__44) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDENT))) != 0)) {
				{
				{
				setState(322);
				cmd();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(328);
				match(T__36);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__34) | (1L << T__38) | (1L << T__41) | (1L << T__44) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDENT))) != 0)) {
					{
					{
					setState(329);
					cmd();
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(337);
			match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdParaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPara; }
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(T__41);
			setState(340);
			match(IDENT);
			setState(341);
			match(T__42);
			setState(342);
			exp_aritmetica();
			setState(343);
			match(T__43);
			setState(344);
			exp_aritmetica();
			setState(345);
			match(T__44);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__34) | (1L << T__38) | (1L << T__41) | (1L << T__44) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDENT))) != 0)) {
				{
				{
				setState(346);
				cmd();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(T__45);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEnquantoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__46);
			setState(355);
			expressao();
			setState(356);
			match(T__44);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__34) | (1L << T__38) | (1L << T__41) | (1L << T__44) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDENT))) != 0)) {
				{
				{
				setState(357);
				cmd();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(T__47);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdFacaContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFaca; }
	}

	public final CmdFacaContext cmdFaca() throws RecognitionException {
		CmdFacaContext _localctx = new CmdFacaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__44);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__34) | (1L << T__38) | (1L << T__41) | (1L << T__44) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDENT))) != 0)) {
				{
				{
				setState(366);
				cmd();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(T__43);
			setState(373);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cmdAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(375);
				match(T__13);
				}
			}

			setState(378);
			identificador();
			setState(379);
			match(T__42);
			setState(380);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdChamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public CmdChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamada; }
	}

	public final CmdChamadaContext cmdChamada() throws RecognitionException {
		CmdChamadaContext _localctx = new CmdChamadaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(IDENT);
			setState(383);
			match(T__29);
			setState(384);
			expressao();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(385);
				match(T__0);
				setState(386);
				expressao();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdRetorneContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdRetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRetorne; }
	}

	public final CmdRetorneContext cmdRetorne() throws RecognitionException {
		CmdRetorneContext _localctx = new CmdRetorneContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(T__48);
			setState(395);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdLeiaContext cmdLeia() {
			return getRuleContext(CmdLeiaContext.class,0);
		}
		public CmdEscrevaContext cmdEscreva() {
			return getRuleContext(CmdEscrevaContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdCasoContext cmdCaso() {
			return getRuleContext(CmdCasoContext.class,0);
		}
		public CmdParaContext cmdPara() {
			return getRuleContext(CmdParaContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdFacaContext cmdFaca() {
			return getRuleContext(CmdFacaContext.class,0);
		}
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
		}
		public CmdChamadaContext cmdChamada() {
			return getRuleContext(CmdChamadaContext.class,0);
		}
		public CmdRetorneContext cmdRetorne() {
			return getRuleContext(CmdRetorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cmd);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(401);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(402);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(403);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(404);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(405);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(406);
				cmdRetorne();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdLeiaContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(T__49);
			setState(410);
			match(T__29);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(411);
				match(T__13);
				}
			}

			setState(414);
			identificador();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(415);
				match(T__0);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(416);
					match(T__13);
					}
				}

				setState(419);
				identificador();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEscrevaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public CmdEscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreva; }
	}

	public final CmdEscrevaContext cmdEscreva() throws RecognitionException {
		CmdEscrevaContext _localctx = new CmdEscrevaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(T__50);
			setState(428);
			match(T__29);
			setState(429);
			expressao();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(430);
				match(T__0);
				setState(431);
				expressao();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
			match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(439);
				match(T__12);
				}
			}

			setState(442);
			identificador();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(443);
				match(T__0);
				setState(444);
				identificador();
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(450);
			match(T__1);
			setState(451);
			tipo_estendido();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			parametro();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(454);
				match(T__0);
				setState(455);
				parametro();
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_localContext extends ParserRuleContext {
		public Declaracao_variavelContext declaracao_variavel() {
			return getRuleContext(Declaracao_variavelContext.class,0);
		}
		public Declaracao_constanteContext declaracao_constante() {
			return getRuleContext(Declaracao_constanteContext.class,0);
		}
		public Declaracao_tipoContext declaracao_tipo() {
			return getRuleContext(Declaracao_tipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_declaracao_local);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				declaracao_variavel();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				declaracao_constante();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				declaracao_tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_variavelContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Declaracao_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_variavel; }
	}

	public final Declaracao_variavelContext declaracao_variavel() throws RecognitionException {
		Declaracao_variavelContext _localctx = new Declaracao_variavelContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_declaracao_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(T__51);
			setState(467);
			variavel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_constanteContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public Declaracao_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_constante; }
	}

	public final Declaracao_constanteContext declaracao_constante() throws RecognitionException {
		Declaracao_constanteContext _localctx = new Declaracao_constanteContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_declaracao_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(T__52);
			setState(470);
			match(IDENT);
			setState(471);
			match(T__1);
			setState(472);
			tipo_basico();
			setState(473);
			match(T__26);
			setState(474);
			valor_constante();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_tipoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_tipo; }
	}

	public final Declaracao_tipoContext declaracao_tipo() throws RecognitionException {
		Declaracao_tipoContext _localctx = new Declaracao_tipoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_declaracao_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T__11);
			setState(477);
			match(IDENT);
			setState(478);
			match(T__1);
			setState(479);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__51) | (1L << T__52))) != 0)) {
				{
				{
				setState(481);
				declaracao_local();
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__34) | (1L << T__38) | (1L << T__41) | (1L << T__44) | (1L << T__46) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << IDENT))) != 0)) {
				{
				{
				setState(487);
				cmd();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_declaracao_global);
		int _la;
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(T__53);
				setState(494);
				match(IDENT);
				setState(495);
				match(T__29);
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==IDENT) {
					{
					setState(496);
					parametros();
					}
				}

				setState(499);
				match(T__30);
				setState(500);
				corpo();
				setState(501);
				match(T__54);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(T__55);
				setState(504);
				match(IDENT);
				setState(505);
				match(T__29);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==IDENT) {
					{
					setState(506);
					parametros();
					}
				}

				setState(509);
				match(T__30);
				setState(510);
				match(T__1);
				setState(511);
				tipo_estendido();
				setState(512);
				corpo();
				setState(513);
				match(T__56);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<Declaracao_globalContext> declaracao_global() {
			return getRuleContexts(Declaracao_globalContext.class);
		}
		public Declaracao_globalContext declaracao_global(int i) {
			return getRuleContext(Declaracao_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55))) != 0)) {
				{
				setState(519);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
				case T__51:
				case T__52:
					{
					setState(517);
					declaracao_local();
					}
					break;
				case T__53:
				case T__55:
					{
					setState(518);
					declaracao_global();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			declaracoes();
			setState(525);
			match(T__57);
			setState(526);
			corpo();
			setState(527);
			match(T__58);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u0214\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\2\7\2n\n\2\f\2\16\2q\13\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\7\3y\n\3\f\3\16\3|\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0084\n\4\f\4"+
		"\16\4\u0087\13\4\3\5\3\5\3\6\3\6\3\7\3\7\5\7\u008f\n\7\3\b\5\b\u0092\n"+
		"\b\3\b\3\b\3\t\3\t\7\t\u0098\n\t\f\t\16\t\u009b\13\t\3\t\3\t\3\n\3\n\5"+
		"\n\u00a1\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\5\22\u00b2\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00ba"+
		"\n\22\f\22\16\22\u00bd\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00c7\n\22\3\23\3\23\3\23\5\23\u00cc\n\23\3\24\5\24\u00cf\n\24\3\24"+
		"\3\24\5\24\u00d3\n\24\3\25\3\25\3\25\3\25\7\25\u00d9\n\25\f\25\16\25\u00dc"+
		"\13\25\3\26\3\26\3\26\3\26\7\26\u00e2\n\26\f\26\16\26\u00e5\13\26\3\27"+
		"\3\27\3\27\3\27\7\27\u00eb\n\27\f\27\16\27\u00ee\13\27\3\30\3\30\3\30"+
		"\3\30\5\30\u00f4\n\30\3\31\3\31\3\31\5\31\u00f9\n\31\3\32\5\32\u00fc\n"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u0104\n\33\f\33\16\33\u0107\13"+
		"\33\3\34\3\34\3\34\3\34\7\34\u010d\n\34\f\34\16\34\u0110\13\34\3\35\5"+
		"\35\u0113\n\35\3\35\3\35\3\35\5\35\u0118\n\35\3\35\5\35\u011b\n\35\3\36"+
		"\3\36\3\36\7\36\u0120\n\36\f\36\16\36\u0123\13\36\3\37\3\37\3\37\7\37"+
		"\u0128\n\37\f\37\16\37\u012b\13\37\3 \7 \u012e\n \f \16 \u0131\13 \3!"+
		"\3!\3!\3!\3!\3!\7!\u0139\n!\f!\16!\u013c\13!\5!\u013e\n!\3!\3!\3\"\3\""+
		"\3\"\3\"\7\"\u0146\n\"\f\"\16\"\u0149\13\"\3\"\3\"\7\"\u014d\n\"\f\"\16"+
		"\"\u0150\13\"\5\"\u0152\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\7#\u015e\n"+
		"#\f#\16#\u0161\13#\3#\3#\3$\3$\3$\3$\7$\u0169\n$\f$\16$\u016c\13$\3$\3"+
		"$\3%\3%\7%\u0172\n%\f%\16%\u0175\13%\3%\3%\3%\3&\5&\u017b\n&\3&\3&\3&"+
		"\3&\3\'\3\'\3\'\3\'\3\'\7\'\u0186\n\'\f\'\16\'\u0189\13\'\3\'\3\'\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u019a\n)\3*\3*\3*\5*\u019f\n*\3"+
		"*\3*\3*\5*\u01a4\n*\3*\7*\u01a7\n*\f*\16*\u01aa\13*\3*\3*\3+\3+\3+\3+"+
		"\3+\7+\u01b3\n+\f+\16+\u01b6\13+\3+\3+\3,\5,\u01bb\n,\3,\3,\3,\7,\u01c0"+
		"\n,\f,\16,\u01c3\13,\3,\3,\3,\3-\3-\3-\7-\u01cb\n-\f-\16-\u01ce\13-\3"+
		".\3.\3.\5.\u01d3\n.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\7\62\u01e5\n\62\f\62\16\62\u01e8\13\62\3\62\7"+
		"\62\u01eb\n\62\f\62\16\62\u01ee\13\62\3\63\3\63\3\63\3\63\5\63\u01f4\n"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01fe\n\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u0206\n\63\3\64\3\64\7\64\u020a\n\64\f\64\16"+
		"\64\u020d\13\64\3\65\3\65\3\65\3\65\3\65\3\65\2\2\66\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2"+
		"\7\4\2\b\tAC\3\2\n\17\3\2\23\24\3\2\25\26\3\2\30\35\2\u0221\2j\3\2\2\2"+
		"\4u\3\2\2\2\6\u0085\3\2\2\2\b\u0088\3\2\2\2\n\u008a\3\2\2\2\f\u008e\3"+
		"\2\2\2\16\u0091\3\2\2\2\20\u0095\3\2\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2"+
		"\2\2\26\u00a4\3\2\2\2\30\u00a6\3\2\2\2\32\u00a8\3\2\2\2\34\u00aa\3\2\2"+
		"\2\36\u00ac\3\2\2\2 \u00ae\3\2\2\2\"\u00c6\3\2\2\2$\u00cb\3\2\2\2&\u00d2"+
		"\3\2\2\2(\u00d4\3\2\2\2*\u00dd\3\2\2\2,\u00e6\3\2\2\2.\u00ef\3\2\2\2\60"+
		"\u00f8\3\2\2\2\62\u00fb\3\2\2\2\64\u00ff\3\2\2\2\66\u0108\3\2\2\28\u0112"+
		"\3\2\2\2:\u011c\3\2\2\2<\u0124\3\2\2\2>\u012f\3\2\2\2@\u0132\3\2\2\2B"+
		"\u0141\3\2\2\2D\u0155\3\2\2\2F\u0164\3\2\2\2H\u016f\3\2\2\2J\u017a\3\2"+
		"\2\2L\u0180\3\2\2\2N\u018c\3\2\2\2P\u0199\3\2\2\2R\u019b\3\2\2\2T\u01ad"+
		"\3\2\2\2V\u01ba\3\2\2\2X\u01c7\3\2\2\2Z\u01d2\3\2\2\2\\\u01d4\3\2\2\2"+
		"^\u01d7\3\2\2\2`\u01de\3\2\2\2b\u01e6\3\2\2\2d\u0205\3\2\2\2f\u020b\3"+
		"\2\2\2h\u020e\3\2\2\2jo\5\4\3\2kl\7\3\2\2ln\5\4\3\2mk\3\2\2\2nq\3\2\2"+
		"\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\4\2\2st\5\22\n\2t\3\3\2"+
		"\2\2uz\7@\2\2vw\7\5\2\2wy\7@\2\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2"+
		"\2{}\3\2\2\2|z\3\2\2\2}~\5\6\4\2~\5\3\2\2\2\177\u0080\7\6\2\2\u0080\u0081"+
		"\5,\27\2\u0081\u0082\7\7\2\2\u0082\u0084\3\2\2\2\u0083\177\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\7\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0088\u0089\t\2\2\2\u0089\t\3\2\2\2\u008a\u008b\t"+
		"\3\2\2\u008b\13\3\2\2\2\u008c\u008f\5\n\6\2\u008d\u008f\7@\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008d\3\2\2\2\u008f\r\3\2\2\2\u0090\u0092\7\20\2\2\u0091"+
		"\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\5\f"+
		"\7\2\u0094\17\3\2\2\2\u0095\u0099\7\21\2\2\u0096\u0098\5\2\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\22\2\2\u009d\21\3\2\2"+
		"\2\u009e\u00a1\5\20\t\2\u009f\u00a1\5\16\b\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\t\4\2\2\u00a3\25\3\2\2\2\u00a4"+
		"\u00a5\t\5\2\2\u00a5\27\3\2\2\2\u00a6\u00a7\7\27\2\2\u00a7\31\3\2\2\2"+
		"\u00a8\u00a9\7\24\2\2\u00a9\33\3\2\2\2\u00aa\u00ab\t\6\2\2\u00ab\35\3"+
		"\2\2\2\u00ac\u00ad\7\36\2\2\u00ad\37\3\2\2\2\u00ae\u00af\7\37\2\2\u00af"+
		"!\3\2\2\2\u00b0\u00b2\7\20\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00c7\5\4\3\2\u00b4\u00b5\7@\2\2\u00b5\u00b6"+
		"\7 \2\2\u00b6\u00bb\5\66\34\2\u00b7\u00b8\7\3\2\2\u00b8\u00ba\5\66\34"+
		"\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7!\2\2\u00bf"+
		"\u00c7\3\2\2\2\u00c0\u00c7\7B\2\2\u00c1\u00c7\7C\2\2\u00c2\u00c3\7 \2"+
		"\2\u00c3\u00c4\5\66\34\2\u00c4\u00c5\7!\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00b1\3\2\2\2\u00c6\u00b4\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c1\3\2"+
		"\2\2\u00c6\u00c2\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00cc"+
		"\5\4\3\2\u00ca\u00cc\7A\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"%\3\2\2\2\u00cd\u00cf\5\32\16\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2"+
		"\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\5\"\22\2\u00d1\u00d3\5$\23\2\u00d2"+
		"\u00ce\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\'\3\2\2\2\u00d4\u00da\5&\24\2"+
		"\u00d5\u00d6\5\30\r\2\u00d6\u00d7\5&\24\2\u00d7\u00d9\3\2\2\2\u00d8\u00d5"+
		"\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		")\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e3\5(\25\2\u00de\u00df\5\26\f\2"+
		"\u00df\u00e0\5(\25\2\u00e0\u00e2\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e5"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4+\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00ec\5*\26\2\u00e7\u00e8\5\24\13\2\u00e8\u00e9\5"+
		"*\26\2\u00e9\u00eb\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed-\3\2\2\2\u00ee\u00ec\3\2\2\2"+
		"\u00ef\u00f3\5,\27\2\u00f0\u00f1\5\34\17\2\u00f1\u00f2\5,\27\2\u00f2\u00f4"+
		"\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4/\3\2\2\2\u00f5"+
		"\u00f9\7\b\2\2\u00f6\u00f9\7\t\2\2\u00f7\u00f9\5.\30\2\u00f8\u00f5\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\61\3\2\2\2\u00fa\u00fc"+
		"\7#\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\5\60\31\2\u00fe\63\3\2\2\2\u00ff\u0105\5\62\32\2\u0100\u0101\5"+
		" \21\2\u0101\u0102\5\62\32\2\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\65\3\2\2"+
		"\2\u0107\u0105\3\2\2\2\u0108\u010e\5\64\33\2\u0109\u010a\5\36\20\2\u010a"+
		"\u010b\5\64\33\2\u010b\u010d\3\2\2\2\u010c\u0109\3\2\2\2\u010d\u0110\3"+
		"\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\67\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0113\5\32\16\2\u0112\u0111\3\2\2\2\u0112\u0113\3"+
		"\2\2\2\u0113\u0114\3\2\2\2\u0114\u011a\7B\2\2\u0115\u0117\7$\2\2\u0116"+
		"\u0118\5\32\16\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3"+
		"\2\2\2\u0119\u011b\7B\2\2\u011a\u0115\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"9\3\2\2\2\u011c\u0121\58\35\2\u011d\u011e\7\3\2\2\u011e\u0120\58\35\2"+
		"\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122;\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\5:\36\2\u0125"+
		"\u0129\7\4\2\2\u0126\u0128\5P)\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2"+
		"\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a=\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012c\u012e\5<\37\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130?\3\2\2\2\u0131\u012f\3\2\2\2"+
		"\u0132\u0133\7%\2\2\u0133\u0134\5,\27\2\u0134\u0135\7&\2\2\u0135\u013d"+
		"\5> \2\u0136\u013a\7\'\2\2\u0137\u0139\5P)\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013e\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u0136\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\7(\2\2\u0140A\3\2\2\2\u0141\u0142\7)\2\2\u0142"+
		"\u0143\5\66\34\2\u0143\u0147\7*\2\2\u0144\u0146\5P)\2\u0145\u0144\3\2"+
		"\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0151\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014e\7\'\2\2\u014b\u014d\5P"+
		")\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u014a\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7+\2\2\u0154"+
		"C\3\2\2\2\u0155\u0156\7,\2\2\u0156\u0157\7@\2\2\u0157\u0158\7-\2\2\u0158"+
		"\u0159\5,\27\2\u0159\u015a\7.\2\2\u015a\u015b\5,\27\2\u015b\u015f\7/\2"+
		"\2\u015c\u015e\5P)\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0163\7\60\2\2\u0163E\3\2\2\2\u0164\u0165\7\61\2\2\u0165\u0166\5\66\34"+
		"\2\u0166\u016a\7/\2\2\u0167\u0169\5P)\2\u0168\u0167\3\2\2\2\u0169\u016c"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u016e\7\62\2\2\u016eG\3\2\2\2\u016f\u0173\7/\2\2"+
		"\u0170\u0172\5P)\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0177\7.\2\2\u0177\u0178\5\66\34\2\u0178I\3\2\2\2\u0179\u017b\7\20\2"+
		"\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d"+
		"\5\4\3\2\u017d\u017e\7-\2\2\u017e\u017f\5\66\34\2\u017fK\3\2\2\2\u0180"+
		"\u0181\7@\2\2\u0181\u0182\7 \2\2\u0182\u0187\5\66\34\2\u0183\u0184\7\3"+
		"\2\2\u0184\u0186\5\66\34\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u018a\u018b\7!\2\2\u018bM\3\2\2\2\u018c\u018d\7\63\2\2\u018d\u018e"+
		"\5\66\34\2\u018eO\3\2\2\2\u018f\u019a\5R*\2\u0190\u019a\5T+\2\u0191\u019a"+
		"\5B\"\2\u0192\u019a\5@!\2\u0193\u019a\5D#\2\u0194\u019a\5F$\2\u0195\u019a"+
		"\5H%\2\u0196\u019a\5J&\2\u0197\u019a\5L\'\2\u0198\u019a\5N(\2\u0199\u018f"+
		"\3\2\2\2\u0199\u0190\3\2\2\2\u0199\u0191\3\2\2\2\u0199\u0192\3\2\2\2\u0199"+
		"\u0193\3\2\2\2\u0199\u0194\3\2\2\2\u0199\u0195\3\2\2\2\u0199\u0196\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019aQ\3\2\2\2\u019b\u019c"+
		"\7\64\2\2\u019c\u019e\7 \2\2\u019d\u019f\7\20\2\2\u019e\u019d\3\2\2\2"+
		"\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a8\5\4\3\2\u01a1\u01a3"+
		"\7\3\2\2\u01a2\u01a4\7\20\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2"+
		"\u01a4\u01a5\3\2\2\2\u01a5\u01a7\5\4\3\2\u01a6\u01a1\3\2\2\2\u01a7\u01aa"+
		"\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01ac\7!\2\2\u01acS\3\2\2\2\u01ad\u01ae\7\65\2\2"+
		"\u01ae\u01af\7 \2\2\u01af\u01b4\5\66\34\2\u01b0\u01b1\7\3\2\2\u01b1\u01b3"+
		"\5\66\34\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2"+
		"\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8"+
		"\7!\2\2\u01b8U\3\2\2\2\u01b9\u01bb\7\17\2\2\u01ba\u01b9\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c1\5\4\3\2\u01bd\u01be\7\3"+
		"\2\2\u01be\u01c0\5\4\3\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c4\u01c5\7\4\2\2\u01c5\u01c6\5\16\b\2\u01c6W\3\2\2\2\u01c7\u01cc"+
		"\5V,\2\u01c8\u01c9\7\3\2\2\u01c9\u01cb\5V,\2\u01ca\u01c8\3\2\2\2\u01cb"+
		"\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cdY\3\2\2\2"+
		"\u01ce\u01cc\3\2\2\2\u01cf\u01d3\5\\/\2\u01d0\u01d3\5^\60\2\u01d1\u01d3"+
		"\5`\61\2\u01d2\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3"+
		"[\3\2\2\2\u01d4\u01d5\7\66\2\2\u01d5\u01d6\5\2\2\2\u01d6]\3\2\2\2\u01d7"+
		"\u01d8\7\67\2\2\u01d8\u01d9\7@\2\2\u01d9\u01da\7\4\2\2\u01da\u01db\5\n"+
		"\6\2\u01db\u01dc\7\35\2\2\u01dc\u01dd\5\b\5\2\u01dd_\3\2\2\2\u01de\u01df"+
		"\7\16\2\2\u01df\u01e0\7@\2\2\u01e0\u01e1\7\4\2\2\u01e1\u01e2\5\22\n\2"+
		"\u01e2a\3\2\2\2\u01e3\u01e5\5Z.\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2"+
		"\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01ec\3\2\2\2\u01e8"+
		"\u01e6\3\2\2\2\u01e9\u01eb\5P)\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2"+
		"\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01edc\3\2\2\2\u01ee\u01ec"+
		"\3\2\2\2\u01ef\u01f0\78\2\2\u01f0\u01f1\7@\2\2\u01f1\u01f3\7 \2\2\u01f2"+
		"\u01f4\5X-\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2"+
		"\2\u01f5\u01f6\7!\2\2\u01f6\u01f7\5b\62\2\u01f7\u01f8\79\2\2\u01f8\u0206"+
		"\3\2\2\2\u01f9\u01fa\7:\2\2\u01fa\u01fb\7@\2\2\u01fb\u01fd\7 \2\2\u01fc"+
		"\u01fe\5X-\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2"+
		"\2\u01ff\u0200\7!\2\2\u0200\u0201\7\4\2\2\u0201\u0202\5\16\b\2\u0202\u0203"+
		"\5b\62\2\u0203\u0204\7;\2\2\u0204\u0206\3\2\2\2\u0205\u01ef\3\2\2\2\u0205"+
		"\u01f9\3\2\2\2\u0206e\3\2\2\2\u0207\u020a\5Z.\2\u0208\u020a\5d\63\2\u0209"+
		"\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020cg\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f"+
		"\5f\64\2\u020f\u0210\7<\2\2\u0210\u0211\5b\62\2\u0211\u0212\7=\2\2\u0212"+
		"i\3\2\2\2\67oz\u0085\u008e\u0091\u0099\u00a0\u00b1\u00bb\u00c6\u00cb\u00ce"+
		"\u00d2\u00da\u00e3\u00ec\u00f3\u00f8\u00fb\u0105\u010e\u0112\u0117\u011a"+
		"\u0121\u0129\u012f\u013a\u013d\u0147\u014e\u0151\u015f\u016a\u0173\u017a"+
		"\u0187\u0199\u019e\u01a3\u01a8\u01b4\u01ba\u01c1\u01cc\u01d2\u01e6\u01ec"+
		"\u01f3\u01fd\u0205\u0209\u020b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}