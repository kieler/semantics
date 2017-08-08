package de.cau.cs.kieler.scl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSCLLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int T__37=37;
    public static final int RULE_SL_COMMENT_ANNOTATION=11;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=9;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=7;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NUMBER=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalSCLLexer() {;} 
    public InternalSCLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSCLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSCL.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:11:7: ( 'module' )
            // InternalSCL.g:11:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:12:7: ( '{' )
            // InternalSCL.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:13:7: ( ';' )
            // InternalSCL.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:14:7: ( '}' )
            // InternalSCL.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:15:7: ( ':' )
            // InternalSCL.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:16:7: ( '[' )
            // InternalSCL.g:16:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:17:7: ( ']' )
            // InternalSCL.g:17:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:18:7: ( '=' )
            // InternalSCL.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:19:7: ( 'if' )
            // InternalSCL.g:19:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:20:7: ( 'then' )
            // InternalSCL.g:20:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:21:7: ( 'else' )
            // InternalSCL.g:21:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:22:7: ( 'end' )
            // InternalSCL.g:22:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:23:7: ( 'goto' )
            // InternalSCL.g:23:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:24:7: ( 'thread' )
            // InternalSCL.g:24:9: 'thread'
            {
            match("thread"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:25:7: ( 'fork' )
            // InternalSCL.g:25:9: 'fork'
            {
            match("fork"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:26:7: ( 'par' )
            // InternalSCL.g:26:9: 'par'
            {
            match("par"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:27:7: ( 'join' )
            // InternalSCL.g:27:9: 'join'
            {
            match("join"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:28:7: ( 'pause' )
            // InternalSCL.g:28:9: 'pause'
            {
            match("pause"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:29:7: ( 'scope' )
            // InternalSCL.g:29:9: 'scope'
            {
            match("scope"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:30:7: ( 'expression' )
            // InternalSCL.g:30:9: 'expression'
            {
            match("expression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:31:7: ( 'const' )
            // InternalSCL.g:31:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:32:7: ( 'input' )
            // InternalSCL.g:32:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:33:7: ( 'output' )
            // InternalSCL.g:33:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:34:7: ( 'static' )
            // InternalSCL.g:34:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:35:7: ( 'signal' )
            // InternalSCL.g:35:9: 'signal'
            {
            match("signal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:36:7: ( ',' )
            // InternalSCL.g:36:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:37:7: ( 'ref' )
            // InternalSCL.g:37:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:38:7: ( 'extern' )
            // InternalSCL.g:38:9: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:39:7: ( 'schedule' )
            // InternalSCL.g:39:9: 'schedule'
            {
            match("schedule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:40:7: ( 'prio' )
            // InternalSCL.g:40:9: 'prio'
            {
            match("prio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:41:7: ( 'combine' )
            // InternalSCL.g:41:9: 'combine'
            {
            match("combine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:42:7: ( '(' )
            // InternalSCL.g:42:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:43:7: ( ')' )
            // InternalSCL.g:43:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:44:7: ( '()' )
            // InternalSCL.g:44:9: '()'
            {
            match("()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:45:7: ( '<' )
            // InternalSCL.g:45:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:46:7: ( '>' )
            // InternalSCL.g:46:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:47:7: ( 'print' )
            // InternalSCL.g:47:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:48:7: ( '||' )
            // InternalSCL.g:48:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:49:7: ( '&&' )
            // InternalSCL.g:49:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:50:7: ( '|' )
            // InternalSCL.g:50:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:51:7: ( '&' )
            // InternalSCL.g:51:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:52:7: ( '+' )
            // InternalSCL.g:52:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:53:7: ( '-' )
            // InternalSCL.g:53:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:54:7: ( '*' )
            // InternalSCL.g:54:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:55:7: ( '/' )
            // InternalSCL.g:55:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:56:7: ( '%' )
            // InternalSCL.g:56:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:57:7: ( '\\'' )
            // InternalSCL.g:57:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:58:7: ( '.' )
            // InternalSCL.g:58:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:59:7: ( '!' )
            // InternalSCL.g:59:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:60:7: ( '@' )
            // InternalSCL.g:60:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:61:7: ( '#' )
            // InternalSCL.g:61:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:62:7: ( 'conflict' )
            // InternalSCL.g:62:9: 'conflict'
            {
            match("conflict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:63:7: ( 'confluent' )
            // InternalSCL.g:63:9: 'confluent'
            {
            match("confluent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:64:7: ( '+=' )
            // InternalSCL.g:64:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:65:7: ( '-=' )
            // InternalSCL.g:65:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:66:7: ( '*=' )
            // InternalSCL.g:66:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:67:7: ( '/=' )
            // InternalSCL.g:67:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:68:7: ( '%=' )
            // InternalSCL.g:68:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:69:7: ( '&=' )
            // InternalSCL.g:69:9: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:70:7: ( '|=' )
            // InternalSCL.g:70:9: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:71:7: ( '^=' )
            // InternalSCL.g:71:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:72:7: ( 'min=' )
            // InternalSCL.g:72:9: 'min='
            {
            match("min="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:73:7: ( 'max=' )
            // InternalSCL.g:73:9: 'max='
            {
            match("max="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:74:7: ( '++' )
            // InternalSCL.g:74:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:75:7: ( '--' )
            // InternalSCL.g:75:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:76:7: ( '==' )
            // InternalSCL.g:76:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:77:7: ( '<=' )
            // InternalSCL.g:77:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:78:7: ( '>=' )
            // InternalSCL.g:78:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:79:7: ( '!=' )
            // InternalSCL.g:79:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:80:7: ( 'pre' )
            // InternalSCL.g:80:9: 'pre'
            {
            match("pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:81:7: ( 'val' )
            // InternalSCL.g:81:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:82:7: ( 'pure' )
            // InternalSCL.g:82:9: 'pure'
            {
            match("pure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:83:7: ( 'bool' )
            // InternalSCL.g:83:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:84:7: ( 'unsigned' )
            // InternalSCL.g:84:9: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:85:7: ( 'int' )
            // InternalSCL.g:85:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:86:7: ( 'float' )
            // InternalSCL.g:86:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:87:7: ( 'string' )
            // InternalSCL.g:87:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:88:7: ( 'host' )
            // InternalSCL.g:88:9: 'host'
            {
            match("host"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:89:7: ( 'none' )
            // InternalSCL.g:89:9: 'none'
            {
            match("none"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:90:7: ( 'max' )
            // InternalSCL.g:90:9: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:91:7: ( 'min' )
            // InternalSCL.g:91:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "RULE_HOSTCODE"
    public final void mRULE_HOSTCODE() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:7676:15: ( '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`' )
            // InternalSCL.g:7676:17: '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`'
            {
            match('`'); 
            // InternalSCL.g:7676:21: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='_')||(LA1_0>='a' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSCL.g:7676:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalSCL.g:7676:63: ~ ( ( '\\\\' | '`' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HOSTCODE"

    // $ANTLR start "RULE_COMMENT_ANNOTATION"
    public final void mRULE_COMMENT_ANNOTATION() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_ANNOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:7678:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalSCL.g:7678:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalSCL.g:7678:33: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSCL.g:7678:61: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_ANNOTATION"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:7680:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalSCL.g:7680:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSCL.g:7680:31: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSCL.g:7680:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT_ANNOTATION"
    public final void mRULE_SL_COMMENT_ANNOTATION() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT_ANNOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:7682:28: ( '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSCL.g:7682:30: '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//*"); 

            // InternalSCL.g:7682:36: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSCL.g:7682:36: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSCL.g:7682:52: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSCL.g:7682:53: ( '\\r' )? '\\n'
                    {
                    // InternalSCL.g:7682:53: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSCL.g:7682:53: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT_ANNOTATION"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:7684:17: ( '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSCL.g:7684:19: '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSCL.g:7684:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSCL.g:7684:31: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalSCL.g:7684:47: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSCL.g:7684:48: ( '\\r' )? '\\n'
                    {
                    // InternalSCL.g:7684:48: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSCL.g:7684:48: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            // InternalSCL.g:7686:22: ( '0' .. '9' )
            // InternalSCL.g:7686:24: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:7688:10: ( ( RULE_NUMBER )+ )
            // InternalSCL.g:7688:12: ( RULE_NUMBER )+
            {
            // InternalSCL.g:7688:12: ( RULE_NUMBER )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSCL.g:7688:12: RULE_NUMBER
            	    {
            	    mRULE_NUMBER(); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:7690:12: ( ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' ) )
            // InternalSCL.g:7690:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            {
            // InternalSCL.g:7690:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalSCL.g:7690:15: ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // InternalSCL.g:7690:15: ( RULE_NUMBER )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSCL.g:7690:15: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    match('.'); 
                    // InternalSCL.g:7690:32: ( RULE_NUMBER )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSCL.g:7690:32: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalSCL.g:7690:45: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSCL.g:7690:46: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalSCL.g:7690:56: ( '+' | '-' )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0=='+'||LA13_0=='-') ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalSCL.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // InternalSCL.g:7690:67: ( RULE_NUMBER )+
                            int cnt14=0;
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalSCL.g:7690:67: RULE_NUMBER
                            	    {
                            	    mRULE_NUMBER(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt14 >= 1 ) break loop14;
                                        EarlyExitException eee =
                                            new EarlyExitException(14, input);
                                        throw eee;
                                }
                                cnt14++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalSCL.g:7690:82: ( 'f' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='f') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSCL.g:7690:82: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalSCL.g:7690:87: ( RULE_NUMBER )+ 'f'
                    {
                    // InternalSCL.g:7690:87: ( RULE_NUMBER )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalSCL.g:7690:87: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    match('f'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:7692:14: ( ( 'true' | 'false' ) )
            // InternalSCL.g:7692:16: ( 'true' | 'false' )
            {
            // InternalSCL.g:7692:16: ( 'true' | 'false' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='t') ) {
                alt19=1;
            }
            else if ( (LA19_0=='f') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSCL.g:7692:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalSCL.g:7692:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:7694:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalSCL.g:7694:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalSCL.g:7694:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\\') ) {
                    alt20=1;
                }
                else if ( ((LA20_0>='\u0000' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSCL.g:7694:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalSCL.g:7694:61: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:7696:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSCL.g:7696:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSCL.g:7696:11: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSCL.g:7696:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSCL.g:7696:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSCL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:7698:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSCL.g:7698:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSCL.g:7698:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSCL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCL.g:7700:16: ( . )
            // InternalSCL.g:7700:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSCL.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER )
        int alt24=93;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // InternalSCL.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalSCL.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalSCL.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalSCL.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalSCL.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalSCL.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalSCL.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalSCL.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalSCL.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalSCL.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalSCL.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalSCL.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalSCL.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalSCL.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalSCL.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalSCL.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalSCL.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalSCL.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalSCL.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalSCL.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalSCL.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalSCL.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalSCL.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalSCL.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalSCL.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalSCL.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalSCL.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalSCL.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalSCL.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalSCL.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalSCL.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalSCL.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalSCL.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalSCL.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalSCL.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalSCL.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalSCL.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalSCL.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalSCL.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalSCL.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalSCL.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalSCL.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalSCL.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalSCL.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalSCL.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalSCL.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalSCL.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalSCL.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalSCL.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalSCL.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalSCL.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalSCL.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalSCL.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalSCL.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalSCL.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalSCL.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalSCL.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalSCL.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalSCL.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalSCL.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalSCL.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // InternalSCL.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // InternalSCL.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // InternalSCL.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // InternalSCL.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // InternalSCL.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // InternalSCL.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // InternalSCL.g:1:412: T__84
                {
                mT__84(); 

                }
                break;
            case 69 :
                // InternalSCL.g:1:418: T__85
                {
                mT__85(); 

                }
                break;
            case 70 :
                // InternalSCL.g:1:424: T__86
                {
                mT__86(); 

                }
                break;
            case 71 :
                // InternalSCL.g:1:430: T__87
                {
                mT__87(); 

                }
                break;
            case 72 :
                // InternalSCL.g:1:436: T__88
                {
                mT__88(); 

                }
                break;
            case 73 :
                // InternalSCL.g:1:442: T__89
                {
                mT__89(); 

                }
                break;
            case 74 :
                // InternalSCL.g:1:448: T__90
                {
                mT__90(); 

                }
                break;
            case 75 :
                // InternalSCL.g:1:454: T__91
                {
                mT__91(); 

                }
                break;
            case 76 :
                // InternalSCL.g:1:460: T__92
                {
                mT__92(); 

                }
                break;
            case 77 :
                // InternalSCL.g:1:466: T__93
                {
                mT__93(); 

                }
                break;
            case 78 :
                // InternalSCL.g:1:472: T__94
                {
                mT__94(); 

                }
                break;
            case 79 :
                // InternalSCL.g:1:478: T__95
                {
                mT__95(); 

                }
                break;
            case 80 :
                // InternalSCL.g:1:484: T__96
                {
                mT__96(); 

                }
                break;
            case 81 :
                // InternalSCL.g:1:490: T__97
                {
                mT__97(); 

                }
                break;
            case 82 :
                // InternalSCL.g:1:496: RULE_HOSTCODE
                {
                mRULE_HOSTCODE(); 

                }
                break;
            case 83 :
                // InternalSCL.g:1:510: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 84 :
                // InternalSCL.g:1:534: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 85 :
                // InternalSCL.g:1:550: RULE_SL_COMMENT_ANNOTATION
                {
                mRULE_SL_COMMENT_ANNOTATION(); 

                }
                break;
            case 86 :
                // InternalSCL.g:1:577: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 87 :
                // InternalSCL.g:1:593: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 88 :
                // InternalSCL.g:1:602: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 89 :
                // InternalSCL.g:1:613: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 90 :
                // InternalSCL.g:1:626: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 91 :
                // InternalSCL.g:1:638: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 92 :
                // InternalSCL.g:1:646: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 93 :
                // InternalSCL.g:1:654: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA18_eotS =
        "\4\uffff";
    static final String DFA18_eofS =
        "\4\uffff";
    static final String DFA18_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA18_maxS =
        "\1\71\1\146\2\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA18_specialS =
        "\4\uffff}>";
    static final String[] DFA18_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\54\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "7690:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\1\64\6\uffff\1\74\12\64\1\uffff\1\64\1\124\1\uffff\1\127\1\131\1\134\1\137\1\142\1\145\1\147\1\153\1\155\2\uffff\1\161\2\uffff\1\60\5\64\1\60\1\173\1\60\3\uffff\3\64\11\uffff\1\u0083\23\64\1\uffff\1\64\42\uffff\5\64\3\uffff\1\173\2\uffff\1\64\1\u00ab\1\u00ad\1\uffff\1\64\1\u00af\4\64\1\u00b4\6\64\1\u00bb\2\64\1\u00bf\12\64\1\u00cb\4\uffff\1\u00cc\5\64\4\uffff\1\64\1\uffff\1\u00d3\1\64\1\u00d5\1\u00d6\1\uffff\2\64\1\u00d9\1\u00da\2\64\1\uffff\1\64\1\u00de\1\64\1\uffff\1\u00e0\1\u00e1\11\64\2\uffff\1\u00eb\1\64\1\u00ed\1\u00ee\1\64\1\u00f0\1\uffff\1\64\2\uffff\2\64\2\uffff\1\u00f4\1\u00d5\1\u00f5\1\uffff\1\u00f6\2\uffff\1\u00f7\4\64\1\u00fc\3\64\1\uffff\1\64\2\uffff\1\u0102\1\uffff\1\u0103\1\64\1\u0105\4\uffff\1\64\1\u0107\1\u0108\1\u0109\1\uffff\3\64\1\u010d\1\64\2\uffff\1\64\1\uffff\1\64\3\uffff\2\64\1\u0113\1\uffff\2\64\1\u0116\1\u0117\1\64\1\uffff\1\u0119\1\64\2\uffff\1\u011b\1\uffff\1\u011c\2\uffff";
    static final String DFA24_eofS =
        "\u011d\uffff";
    static final String DFA24_minS =
        "\1\0\1\141\6\uffff\1\75\1\146\1\150\1\154\1\157\2\141\1\157\1\143\1\157\1\165\1\uffff\1\145\1\51\1\uffff\3\75\1\46\1\53\1\55\1\75\1\52\1\75\2\uffff\1\75\2\uffff\1\75\1\141\1\157\1\156\2\157\1\0\1\56\1\0\3\uffff\1\144\1\156\1\170\11\uffff\1\60\1\160\1\145\1\165\1\163\1\144\1\160\1\164\1\162\1\157\1\154\1\162\1\145\1\162\1\151\1\150\1\141\1\147\1\155\1\164\1\uffff\1\146\26\uffff\2\0\12\uffff\1\154\1\157\2\163\1\156\3\uffff\1\56\2\uffff\1\165\2\60\1\uffff\1\165\1\60\1\156\3\145\1\60\1\162\1\145\1\157\1\153\1\141\1\163\1\60\1\163\1\156\1\60\1\145\1\156\1\160\1\145\1\164\1\151\1\156\1\146\1\142\1\160\1\60\4\uffff\1\60\1\154\1\151\1\164\1\145\1\154\4\uffff\1\164\1\uffff\1\60\1\141\2\60\1\uffff\1\145\1\162\2\60\1\164\1\145\1\uffff\1\145\1\60\1\164\1\uffff\2\60\1\145\1\144\1\151\1\156\1\141\1\164\1\154\1\151\1\165\2\uffff\1\60\1\147\2\60\1\145\1\60\1\uffff\1\144\2\uffff\1\163\1\156\2\uffff\3\60\1\uffff\1\60\2\uffff\1\60\1\165\1\143\1\147\1\154\1\60\1\151\1\156\1\164\1\uffff\1\156\2\uffff\1\60\1\uffff\1\60\1\163\1\60\4\uffff\1\154\3\60\1\uffff\1\143\2\145\1\60\1\145\2\uffff\1\151\1\uffff\1\145\3\uffff\1\164\1\156\1\60\1\uffff\1\144\1\157\2\60\1\164\1\uffff\1\60\1\156\2\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\157\6\uffff\1\75\1\156\1\162\1\170\2\157\1\165\1\157\1\164\1\157\1\165\1\uffff\1\145\1\51\1\uffff\2\75\1\174\6\75\2\uffff\1\75\2\uffff\1\172\1\141\1\157\1\156\2\157\1\uffff\1\146\1\uffff\3\uffff\1\144\1\156\1\170\11\uffff\1\172\1\164\1\162\1\165\1\163\1\144\2\164\1\162\1\157\1\154\1\165\1\151\1\162\1\151\1\157\1\162\1\147\1\156\1\164\1\uffff\1\146\26\uffff\2\uffff\12\uffff\1\154\1\157\2\163\1\156\3\uffff\1\146\2\uffff\1\165\2\172\1\uffff\1\165\1\172\1\156\3\145\1\172\1\162\1\145\1\157\1\153\1\141\1\163\1\172\1\163\1\157\1\172\1\145\1\156\1\160\1\145\1\164\1\151\1\156\1\163\1\142\1\160\1\172\4\uffff\1\172\1\154\1\151\1\164\1\145\1\154\4\uffff\1\164\1\uffff\1\172\1\141\2\172\1\uffff\1\145\1\162\2\172\1\164\1\145\1\uffff\1\145\1\172\1\164\1\uffff\2\172\1\145\1\144\1\151\1\156\1\141\1\164\1\154\1\151\1\165\2\uffff\1\172\1\147\2\172\1\145\1\172\1\uffff\1\144\2\uffff\1\163\1\156\2\uffff\3\172\1\uffff\1\172\2\uffff\1\172\1\165\1\143\1\147\1\154\1\172\1\165\1\156\1\164\1\uffff\1\156\2\uffff\1\172\1\uffff\1\172\1\163\1\172\4\uffff\1\154\3\172\1\uffff\1\143\2\145\1\172\1\145\2\uffff\1\151\1\uffff\1\145\3\uffff\1\164\1\156\1\172\1\uffff\1\144\1\157\2\172\1\164\1\uffff\1\172\1\156\2\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\13\uffff\1\32\2\uffff\1\41\11\uffff\1\57\1\60\1\uffff\1\62\1\63\11\uffff\1\133\1\134\1\135\3\uffff\1\133\1\2\1\3\1\4\1\5\1\6\1\7\1\102\1\10\24\uffff\1\32\1\uffff\1\42\1\40\1\41\1\103\1\43\1\104\1\44\1\46\1\74\1\50\1\47\1\73\1\51\1\66\1\100\1\52\1\67\1\101\1\53\1\70\1\54\1\71\2\uffff\1\55\1\72\1\56\1\57\1\60\1\105\1\61\1\62\1\63\1\75\5\uffff\1\122\1\127\1\130\1\uffff\1\132\1\134\3\uffff\1\11\34\uffff\1\123\1\124\1\125\1\126\6\uffff\1\76\1\121\1\77\1\120\1\uffff\1\113\4\uffff\1\14\6\uffff\1\20\3\uffff\1\106\13\uffff\1\33\1\107\6\uffff\1\12\1\uffff\1\131\1\13\2\uffff\1\15\1\17\3\uffff\1\36\1\uffff\1\110\1\21\11\uffff\1\111\1\uffff\1\116\1\117\1\uffff\1\26\3\uffff\1\114\1\22\1\45\1\23\4\uffff\1\25\5\uffff\1\1\1\16\1\uffff\1\34\1\uffff\1\30\1\115\1\31\3\uffff\1\27\5\uffff\1\37\2\uffff\1\35\1\64\1\uffff\1\112\1\uffff\1\65\1\24";
    static final String DFA24_specialS =
        "\1\1\52\uffff\1\0\1\uffff\1\3\73\uffff\1\2\1\4\u00b2\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\42\1\55\1\44\1\60\1\37\1\32\1\40\1\25\1\26\1\35\1\33\1\23\1\34\1\41\1\36\12\54\1\5\1\3\1\27\1\10\1\30\1\60\1\43\32\56\1\6\1\60\1\7\1\45\1\56\1\53\1\56\1\47\1\21\1\56\1\13\1\15\1\14\1\51\1\11\1\17\2\56\1\1\1\52\1\22\1\16\1\56\1\24\1\20\1\12\1\50\1\46\4\56\1\2\1\31\1\4\uff82\60",
            "\1\63\7\uffff\1\62\5\uffff\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\73",
            "\1\75\7\uffff\1\76",
            "\1\77\11\uffff\1\100",
            "\1\101\1\uffff\1\102\11\uffff\1\103",
            "\1\104",
            "\1\107\12\uffff\1\106\2\uffff\1\105",
            "\1\110\20\uffff\1\111\2\uffff\1\112",
            "\1\113",
            "\1\114\5\uffff\1\116\12\uffff\1\115",
            "\1\117",
            "\1\120",
            "",
            "\1\122",
            "\1\123",
            "",
            "\1\126",
            "\1\130",
            "\1\133\76\uffff\1\132",
            "\1\135\26\uffff\1\136",
            "\1\141\21\uffff\1\140",
            "\1\144\17\uffff\1\143",
            "\1\146",
            "\1\151\4\uffff\1\152\15\uffff\1\150",
            "\1\154",
            "",
            "",
            "\1\160",
            "",
            "",
            "\1\164\3\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\0\172",
            "\1\174\1\uffff\12\175\54\uffff\1\174",
            "\0\176",
            "",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0084\3\uffff\1\u0085",
            "\1\u0086\14\uffff\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b\3\uffff\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091\2\uffff\1\u0092",
            "\1\u0094\3\uffff\1\u0093",
            "\1\u0095",
            "\1\u0096",
            "\1\u0098\6\uffff\1\u0097",
            "\1\u0099\20\uffff\1\u009a",
            "\1\u009b",
            "\1\u009d\1\u009c",
            "\1\u009e",
            "",
            "\1\u009f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\u00a1\1\u00a0\uffd5\u00a1",
            "\52\u00a3\1\u00a2\uffd5\u00a3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "",
            "",
            "\1\174\1\uffff\12\175\54\uffff\1\174",
            "",
            "",
            "\1\u00a9",
            "\12\64\3\uffff\1\u00aa\3\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\3\uffff\1\u00ac\3\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u00ae",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00bc",
            "\1\u00be\1\u00bd",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c8\14\uffff\1\u00c7",
            "\1\u00c9",
            "\1\u00ca",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "",
            "",
            "",
            "\1\u00d2",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00df",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00ec",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00ef",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u00f1",
            "",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00fd\13\uffff\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\1\u0101",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0104",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\1\u0106",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u010e",
            "",
            "",
            "\1\u010f",
            "",
            "\1\u0110",
            "",
            "",
            "",
            "\1\u0111",
            "\1\u0112",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0114",
            "\1\u0115",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0118",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u011a",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_43 = input.LA(1);

                        s = -1;
                        if ( ((LA24_43>='\u0000' && LA24_43<='\uFFFF')) ) {s = 122;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='m') ) {s = 1;}

                        else if ( (LA24_0=='{') ) {s = 2;}

                        else if ( (LA24_0==';') ) {s = 3;}

                        else if ( (LA24_0=='}') ) {s = 4;}

                        else if ( (LA24_0==':') ) {s = 5;}

                        else if ( (LA24_0=='[') ) {s = 6;}

                        else if ( (LA24_0==']') ) {s = 7;}

                        else if ( (LA24_0=='=') ) {s = 8;}

                        else if ( (LA24_0=='i') ) {s = 9;}

                        else if ( (LA24_0=='t') ) {s = 10;}

                        else if ( (LA24_0=='e') ) {s = 11;}

                        else if ( (LA24_0=='g') ) {s = 12;}

                        else if ( (LA24_0=='f') ) {s = 13;}

                        else if ( (LA24_0=='p') ) {s = 14;}

                        else if ( (LA24_0=='j') ) {s = 15;}

                        else if ( (LA24_0=='s') ) {s = 16;}

                        else if ( (LA24_0=='c') ) {s = 17;}

                        else if ( (LA24_0=='o') ) {s = 18;}

                        else if ( (LA24_0==',') ) {s = 19;}

                        else if ( (LA24_0=='r') ) {s = 20;}

                        else if ( (LA24_0=='(') ) {s = 21;}

                        else if ( (LA24_0==')') ) {s = 22;}

                        else if ( (LA24_0=='<') ) {s = 23;}

                        else if ( (LA24_0=='>') ) {s = 24;}

                        else if ( (LA24_0=='|') ) {s = 25;}

                        else if ( (LA24_0=='&') ) {s = 26;}

                        else if ( (LA24_0=='+') ) {s = 27;}

                        else if ( (LA24_0=='-') ) {s = 28;}

                        else if ( (LA24_0=='*') ) {s = 29;}

                        else if ( (LA24_0=='/') ) {s = 30;}

                        else if ( (LA24_0=='%') ) {s = 31;}

                        else if ( (LA24_0=='\'') ) {s = 32;}

                        else if ( (LA24_0=='.') ) {s = 33;}

                        else if ( (LA24_0=='!') ) {s = 34;}

                        else if ( (LA24_0=='@') ) {s = 35;}

                        else if ( (LA24_0=='#') ) {s = 36;}

                        else if ( (LA24_0=='^') ) {s = 37;}

                        else if ( (LA24_0=='v') ) {s = 38;}

                        else if ( (LA24_0=='b') ) {s = 39;}

                        else if ( (LA24_0=='u') ) {s = 40;}

                        else if ( (LA24_0=='h') ) {s = 41;}

                        else if ( (LA24_0=='n') ) {s = 42;}

                        else if ( (LA24_0=='`') ) {s = 43;}

                        else if ( ((LA24_0>='0' && LA24_0<='9')) ) {s = 44;}

                        else if ( (LA24_0=='\"') ) {s = 45;}

                        else if ( ((LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||LA24_0=='a'||LA24_0=='d'||(LA24_0>='k' && LA24_0<='l')||LA24_0=='q'||(LA24_0>='w' && LA24_0<='z')) ) {s = 46;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 47;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='$'||LA24_0=='?'||LA24_0=='\\'||(LA24_0>='~' && LA24_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_105 = input.LA(1);

                        s = -1;
                        if ( (LA24_105=='*') ) {s = 160;}

                        else if ( ((LA24_105>='\u0000' && LA24_105<=')')||(LA24_105>='+' && LA24_105<='\uFFFF')) ) {s = 161;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_45 = input.LA(1);

                        s = -1;
                        if ( ((LA24_45>='\u0000' && LA24_45<='\uFFFF')) ) {s = 126;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_106 = input.LA(1);

                        s = -1;
                        if ( (LA24_106=='*') ) {s = 162;}

                        else if ( ((LA24_106>='\u0000' && LA24_106<=')')||(LA24_106>='+' && LA24_106<='\uFFFF')) ) {s = 163;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}