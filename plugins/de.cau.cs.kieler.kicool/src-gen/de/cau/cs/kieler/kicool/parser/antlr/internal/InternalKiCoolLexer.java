package de.cau.cs.kieler.kicool.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKiCoolLexer extends Lexer {
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
    public static final int RULE_INT=7;
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
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=9;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=6;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__120=120;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NUMBER=14;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalKiCoolLexer() {;} 
    public InternalKiCoolLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKiCoolLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKiCool.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:11:7: ( 'public' )
            // InternalKiCool.g:11:9: 'public'
            {
            match("public"); 


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
            // InternalKiCool.g:12:7: ( 'developer' )
            // InternalKiCool.g:12:9: 'developer'
            {
            match("developer"); 


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
            // InternalKiCool.g:13:7: ( 'simulation' )
            // InternalKiCool.g:13:9: 'simulation'
            {
            match("simulation"); 


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
            // InternalKiCool.g:14:7: ( 'system' )
            // InternalKiCool.g:14:9: 'system'
            {
            match("system"); 


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
            // InternalKiCool.g:15:7: ( 'label' )
            // InternalKiCool.g:15:9: 'label'
            {
            match("label"); 


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
            // InternalKiCool.g:16:7: ( 'start' )
            // InternalKiCool.g:16:9: 'start'
            {
            match("start"); 


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
            // InternalKiCool.g:17:7: ( 'config' )
            // InternalKiCool.g:17:9: 'config'
            {
            match("config"); 


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
            // InternalKiCool.g:18:7: ( 'intermediate' )
            // InternalKiCool.g:18:9: 'intermediate'
            {
            match("intermediate"); 


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
            // InternalKiCool.g:19:7: ( 'alias' )
            // InternalKiCool.g:19:9: 'alias'
            {
            match("alias"); 


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
            // InternalKiCool.g:20:7: ( '[' )
            // InternalKiCool.g:20:9: '['
            {
            match('['); 

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
            // InternalKiCool.g:21:7: ( ']' )
            // InternalKiCool.g:21:9: ']'
            {
            match(']'); 

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
            // InternalKiCool.g:22:7: ( 'pre' )
            // InternalKiCool.g:22:9: 'pre'
            {
            match("pre"); 


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
            // InternalKiCool.g:23:7: ( 'process' )
            // InternalKiCool.g:23:9: 'process'
            {
            match("process"); 


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
            // InternalKiCool.g:24:7: ( 'post' )
            // InternalKiCool.g:24:9: 'post'
            {
            match("post"); 


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
            // InternalKiCool.g:25:7: ( 'silent' )
            // InternalKiCool.g:25:9: 'silent'
            {
            match("silent"); 


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
            // InternalKiCool.g:26:7: ( '|' )
            // InternalKiCool.g:26:9: '|'
            {
            match('|'); 

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
            // InternalKiCool.g:27:7: ( 'scope' )
            // InternalKiCool.g:27:9: 'scope'
            {
            match("scope"); 


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
            // InternalKiCool.g:28:7: ( '{' )
            // InternalKiCool.g:28:9: '{'
            {
            match('{'); 

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
            // InternalKiCool.g:29:7: ( '}' )
            // InternalKiCool.g:29:9: '}'
            {
            match('}'); 

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
            // InternalKiCool.g:30:7: ( 'expression' )
            // InternalKiCool.g:30:9: 'expression'
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
            // InternalKiCool.g:31:7: ( 'json' )
            // InternalKiCool.g:31:9: 'json'
            {
            match("json"); 


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
            // InternalKiCool.g:32:7: ( 'const' )
            // InternalKiCool.g:32:9: 'const'
            {
            match("const"); 


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
            // InternalKiCool.g:33:7: ( 'input' )
            // InternalKiCool.g:33:9: 'input'
            {
            match("input"); 


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
            // InternalKiCool.g:34:7: ( 'output' )
            // InternalKiCool.g:34:9: 'output'
            {
            match("output"); 


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
            // InternalKiCool.g:35:7: ( 'global' )
            // InternalKiCool.g:35:9: 'global'
            {
            match("global"); 


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
            // InternalKiCool.g:36:7: ( 'static' )
            // InternalKiCool.g:36:9: 'static'
            {
            match("static"); 


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
            // InternalKiCool.g:37:7: ( 'signal' )
            // InternalKiCool.g:37:9: 'signal'
            {
            match("signal"); 


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
            // InternalKiCool.g:38:7: ( ',' )
            // InternalKiCool.g:38:9: ','
            {
            match(','); 

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
            // InternalKiCool.g:39:7: ( ';' )
            // InternalKiCool.g:39:9: ';'
            {
            match(';'); 

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
            // InternalKiCool.g:40:7: ( 'host' )
            // InternalKiCool.g:40:9: 'host'
            {
            match("host"); 


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
            // InternalKiCool.g:41:7: ( '(' )
            // InternalKiCool.g:41:9: '('
            {
            match('('); 

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
            // InternalKiCool.g:42:7: ( ')' )
            // InternalKiCool.g:42:9: ')'
            {
            match(')'); 

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
            // InternalKiCool.g:43:7: ( '()' )
            // InternalKiCool.g:43:9: '()'
            {
            match("()"); 


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
            // InternalKiCool.g:44:7: ( 'schedule' )
            // InternalKiCool.g:44:9: 'schedule'
            {
            match("schedule"); 


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
            // InternalKiCool.g:45:7: ( 'ref' )
            // InternalKiCool.g:45:9: 'ref'
            {
            match("ref"); 


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
            // InternalKiCool.g:46:7: ( '.' )
            // InternalKiCool.g:46:9: '.'
            {
            match('.'); 

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
            // InternalKiCool.g:47:7: ( '<' )
            // InternalKiCool.g:47:9: '<'
            {
            match('<'); 

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
            // InternalKiCool.g:48:7: ( '>' )
            // InternalKiCool.g:48:9: '>'
            {
            match('>'); 

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
            // InternalKiCool.g:49:7: ( 'extern' )
            // InternalKiCool.g:49:9: 'extern'
            {
            match("extern"); 


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
            // InternalKiCool.g:50:7: ( '=' )
            // InternalKiCool.g:50:9: '='
            {
            match('='); 

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
            // InternalKiCool.g:51:7: ( 'combine' )
            // InternalKiCool.g:51:9: 'combine'
            {
            match("combine"); 


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
            // InternalKiCool.g:52:7: ( 'print' )
            // InternalKiCool.g:52:9: 'print'
            {
            match("print"); 


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
            // InternalKiCool.g:53:7: ( 'randomize' )
            // InternalKiCool.g:53:9: 'randomize'
            {
            match("randomize"); 


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
            // InternalKiCool.g:54:7: ( '||' )
            // InternalKiCool.g:54:9: '||'
            {
            match("||"); 


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
            // InternalKiCool.g:55:7: ( '&&' )
            // InternalKiCool.g:55:9: '&&'
            {
            match("&&"); 


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
            // InternalKiCool.g:56:7: ( '^' )
            // InternalKiCool.g:56:9: '^'
            {
            match('^'); 

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
            // InternalKiCool.g:57:7: ( '&' )
            // InternalKiCool.g:57:9: '&'
            {
            match('&'); 

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
            // InternalKiCool.g:58:7: ( '<<' )
            // InternalKiCool.g:58:9: '<<'
            {
            match("<<"); 


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
            // InternalKiCool.g:59:7: ( '>>' )
            // InternalKiCool.g:59:9: '>>'
            {
            match(">>"); 


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
            // InternalKiCool.g:60:7: ( '>>>' )
            // InternalKiCool.g:60:9: '>>>'
            {
            match(">>>"); 


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
            // InternalKiCool.g:61:7: ( '+' )
            // InternalKiCool.g:61:9: '+'
            {
            match('+'); 

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
            // InternalKiCool.g:62:7: ( '-' )
            // InternalKiCool.g:62:9: '-'
            {
            match('-'); 

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
            // InternalKiCool.g:63:7: ( '*' )
            // InternalKiCool.g:63:9: '*'
            {
            match('*'); 

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
            // InternalKiCool.g:64:7: ( '/' )
            // InternalKiCool.g:64:9: '/'
            {
            match('/'); 

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
            // InternalKiCool.g:65:7: ( '%' )
            // InternalKiCool.g:65:9: '%'
            {
            match('%'); 

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
            // InternalKiCool.g:66:7: ( ':' )
            // InternalKiCool.g:66:9: ':'
            {
            match(':'); 

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
            // InternalKiCool.g:67:7: ( '->' )
            // InternalKiCool.g:67:9: '->'
            {
            match("->"); 


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
            // InternalKiCool.g:68:7: ( 'fby' )
            // InternalKiCool.g:68:9: 'fby'
            {
            match("fby"); 


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
            // InternalKiCool.g:69:7: ( 'sfby' )
            // InternalKiCool.g:69:9: 'sfby'
            {
            match("sfby"); 


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
            // InternalKiCool.g:70:7: ( '\\'' )
            // InternalKiCool.g:70:9: '\\''
            {
            match('\''); 

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
            // InternalKiCool.g:71:7: ( 'random' )
            // InternalKiCool.g:71:9: 'random'
            {
            match("random"); 


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
            // InternalKiCool.g:72:7: ( 'to' )
            // InternalKiCool.g:72:9: 'to'
            {
            match("to"); 


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
            // InternalKiCool.g:73:7: ( '_' )
            // InternalKiCool.g:73:9: '_'
            {
            match('_'); 

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
            // InternalKiCool.g:74:7: ( 'null' )
            // InternalKiCool.g:74:9: 'null'
            {
            match("null"); 


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
            // InternalKiCool.g:75:7: ( '#' )
            // InternalKiCool.g:75:9: '#'
            {
            match('#'); 

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
            // InternalKiCool.g:76:7: ( '@' )
            // InternalKiCool.g:76:9: '@'
            {
            match('@'); 

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
            // InternalKiCool.g:77:7: ( 'conflicting' )
            // InternalKiCool.g:77:9: 'conflicting'
            {
            match("conflicting"); 


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
            // InternalKiCool.g:78:7: ( 'commuting' )
            // InternalKiCool.g:78:9: 'commuting'
            {
            match("commuting"); 


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
            // InternalKiCool.g:79:7: ( '+=' )
            // InternalKiCool.g:79:9: '+='
            {
            match("+="); 


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
            // InternalKiCool.g:80:7: ( '-=' )
            // InternalKiCool.g:80:9: '-='
            {
            match("-="); 


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
            // InternalKiCool.g:81:7: ( '*=' )
            // InternalKiCool.g:81:9: '*='
            {
            match("*="); 


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
            // InternalKiCool.g:82:7: ( '/=' )
            // InternalKiCool.g:82:9: '/='
            {
            match("/="); 


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
            // InternalKiCool.g:83:7: ( '%=' )
            // InternalKiCool.g:83:9: '%='
            {
            match("%="); 


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
            // InternalKiCool.g:84:7: ( '&=' )
            // InternalKiCool.g:84:9: '&='
            {
            match("&="); 


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
            // InternalKiCool.g:85:7: ( '|=' )
            // InternalKiCool.g:85:9: '|='
            {
            match("|="); 


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
            // InternalKiCool.g:86:7: ( '^=' )
            // InternalKiCool.g:86:9: '^='
            {
            match("^="); 


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
            // InternalKiCool.g:87:7: ( '<<=' )
            // InternalKiCool.g:87:9: '<<='
            {
            match("<<="); 


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
            // InternalKiCool.g:88:7: ( '>>=' )
            // InternalKiCool.g:88:9: '>>='
            {
            match(">>="); 


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
            // InternalKiCool.g:89:7: ( '>>>=' )
            // InternalKiCool.g:89:9: '>>>='
            {
            match(">>>="); 


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
            // InternalKiCool.g:90:7: ( 'min=' )
            // InternalKiCool.g:90:9: 'min='
            {
            match("min="); 


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
            // InternalKiCool.g:91:7: ( 'max=' )
            // InternalKiCool.g:91:9: 'max='
            {
            match("max="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:92:7: ( '++' )
            // InternalKiCool.g:92:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:93:7: ( '--' )
            // InternalKiCool.g:93:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:94:8: ( '==' )
            // InternalKiCool.g:94:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:95:8: ( '<=' )
            // InternalKiCool.g:95:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:96:8: ( '>=' )
            // InternalKiCool.g:96:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:97:8: ( '!=' )
            // InternalKiCool.g:97:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:98:8: ( '~' )
            // InternalKiCool.g:98:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:99:8: ( '!' )
            // InternalKiCool.g:99:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:100:8: ( 'val' )
            // InternalKiCool.g:100:10: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:101:8: ( '?' )
            // InternalKiCool.g:101:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:102:8: ( 'pure' )
            // InternalKiCool.g:102:10: 'pure'
            {
            match("pure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:103:8: ( 'bool' )
            // InternalKiCool.g:103:10: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:104:8: ( 'int' )
            // InternalKiCool.g:104:10: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:105:8: ( 'float' )
            // InternalKiCool.g:105:10: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:106:8: ( 'string' )
            // InternalKiCool.g:106:10: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:107:8: ( 'struct' )
            // InternalKiCool.g:107:10: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:108:8: ( 'class' )
            // InternalKiCool.g:108:10: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:109:8: ( 'enum' )
            // InternalKiCool.g:109:10: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:110:8: ( 'none' )
            // InternalKiCool.g:110:10: 'none'
            {
            match("none"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:111:8: ( 'max' )
            // InternalKiCool.g:111:10: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:112:8: ( 'min' )
            // InternalKiCool.g:112:10: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:113:8: ( 'protected' )
            // InternalKiCool.g:113:10: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:114:8: ( 'private' )
            // InternalKiCool.g:114:10: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:115:8: ( 'void' )
            // InternalKiCool.g:115:10: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:116:8: ( '!&' )
            // InternalKiCool.g:116:10: '!&'
            {
            match("!&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "RULE_HOSTCODE"
    public final void mRULE_HOSTCODE() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:13734:15: ( '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`' )
            // InternalKiCool.g:13734:17: '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`'
            {
            match('`'); 
            // InternalKiCool.g:13734:21: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )*
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
            	    // InternalKiCool.g:13734:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKiCool.g:13734:63: ~ ( ( '\\\\' | '`' ) )
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
            // InternalKiCool.g:13736:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalKiCool.g:13736:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalKiCool.g:13736:33: ( options {greedy=false; } : . )*
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
            	    // InternalKiCool.g:13736:61: .
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
            // InternalKiCool.g:13738:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalKiCool.g:13738:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKiCool.g:13738:31: ( options {greedy=false; } : . )*
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
            	    // InternalKiCool.g:13738:59: .
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
            // InternalKiCool.g:13740:28: ( '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKiCool.g:13740:30: '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//*"); 

            // InternalKiCool.g:13740:36: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKiCool.g:13740:36: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalKiCool.g:13740:52: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKiCool.g:13740:53: ( '\\r' )? '\\n'
                    {
                    // InternalKiCool.g:13740:53: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalKiCool.g:13740:53: '\\r'
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
            // InternalKiCool.g:13742:17: ( '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKiCool.g:13742:19: '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKiCool.g:13742:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKiCool.g:13742:31: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalKiCool.g:13742:47: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKiCool.g:13742:48: ( '\\r' )? '\\n'
                    {
                    // InternalKiCool.g:13742:48: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalKiCool.g:13742:48: '\\r'
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
            // InternalKiCool.g:13744:22: ( '0' .. '9' )
            // InternalKiCool.g:13744:24: '0' .. '9'
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
            // InternalKiCool.g:13746:10: ( ( RULE_NUMBER )+ )
            // InternalKiCool.g:13746:12: ( RULE_NUMBER )+
            {
            // InternalKiCool.g:13746:12: ( RULE_NUMBER )+
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
            	    // InternalKiCool.g:13746:12: RULE_NUMBER
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
            // InternalKiCool.g:13748:12: ( ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' ) )
            // InternalKiCool.g:13748:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            {
            // InternalKiCool.g:13748:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalKiCool.g:13748:15: ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // InternalKiCool.g:13748:15: ( RULE_NUMBER )+
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
                    	    // InternalKiCool.g:13748:15: RULE_NUMBER
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
                    // InternalKiCool.g:13748:32: ( RULE_NUMBER )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalKiCool.g:13748:32: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalKiCool.g:13748:45: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalKiCool.g:13748:46: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalKiCool.g:13748:56: ( '+' | '-' )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0=='+'||LA13_0=='-') ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalKiCool.g:
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

                            // InternalKiCool.g:13748:67: ( RULE_NUMBER )+
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
                            	    // InternalKiCool.g:13748:67: RULE_NUMBER
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

                    // InternalKiCool.g:13748:82: ( 'f' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='f') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalKiCool.g:13748:82: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalKiCool.g:13748:87: ( RULE_NUMBER )+ 'f'
                    {
                    // InternalKiCool.g:13748:87: ( RULE_NUMBER )+
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
                    	    // InternalKiCool.g:13748:87: RULE_NUMBER
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
            // InternalKiCool.g:13750:14: ( ( 'true' | 'false' ) )
            // InternalKiCool.g:13750:16: ( 'true' | 'false' )
            {
            // InternalKiCool.g:13750:16: ( 'true' | 'false' )
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
                    // InternalKiCool.g:13750:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalKiCool.g:13750:24: 'false'
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
            // InternalKiCool.g:13752:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalKiCool.g:13752:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalKiCool.g:13752:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalKiCool.g:13752:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKiCool.g:13752:61: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalKiCool.g:13754:9: ( ( '^' )? ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKiCool.g:13754:11: ( '^' )? ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKiCool.g:13754:11: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKiCool.g:13754:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // InternalKiCool.g:13754:16: ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='_') ) {
                switch ( input.LA(2) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt25=2;
                    }
                    break;
                case '_':
                    {
                    alt25=3;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt25=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA25_0>='A' && LA25_0<='Z')||(LA25_0>='a' && LA25_0<='z')) ) {
                alt25=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalKiCool.g:13754:17: ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' )
                    {
                    // InternalKiCool.g:13754:17: ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' )
                    int alt24=2;
                    switch ( input.LA(1) ) {
                    case '_':
                        {
                        int LA24_1 = input.LA(2);

                        if ( ((LA24_1>='A' && LA24_1<='Z')) ) {
                            alt24=2;
                        }
                        else if ( ((LA24_1>='a' && LA24_1<='z')) ) {
                            alt24=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt24=1;
                        }
                        break;
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                        {
                        alt24=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // InternalKiCool.g:13754:18: ( '_' )? 'a' .. 'z'
                            {
                            // InternalKiCool.g:13754:18: ( '_' )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0=='_') ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // InternalKiCool.g:13754:18: '_'
                                    {
                                    match('_'); 

                                    }
                                    break;

                            }

                            matchRange('a','z'); 

                            }
                            break;
                        case 2 :
                            // InternalKiCool.g:13754:32: ( '_' )? 'A' .. 'Z'
                            {
                            // InternalKiCool.g:13754:32: ( '_' )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0=='_') ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // InternalKiCool.g:13754:32: '_'
                                    {
                                    match('_'); 

                                    }
                                    break;

                            }

                            matchRange('A','Z'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalKiCool.g:13754:47: '_' '0' .. '9'
                    {
                    match('_'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 3 :
                    // InternalKiCool.g:13754:60: '__'
                    {
                    match("__"); 


                    }
                    break;

            }

            // InternalKiCool.g:13754:66: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKiCool.g:
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
            	    break loop26;
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
            // InternalKiCool.g:13756:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKiCool.g:13756:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKiCool.g:13756:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKiCool.g:
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
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
            // InternalKiCool.g:13758:16: ( . )
            // InternalKiCool.g:13758:18: .
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
        // InternalKiCool.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER )
        int alt28=118;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // InternalKiCool.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalKiCool.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalKiCool.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalKiCool.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalKiCool.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalKiCool.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalKiCool.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalKiCool.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalKiCool.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalKiCool.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalKiCool.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalKiCool.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalKiCool.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalKiCool.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalKiCool.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalKiCool.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalKiCool.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalKiCool.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalKiCool.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalKiCool.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalKiCool.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalKiCool.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalKiCool.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalKiCool.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalKiCool.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalKiCool.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalKiCool.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalKiCool.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalKiCool.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalKiCool.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalKiCool.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalKiCool.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalKiCool.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalKiCool.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalKiCool.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalKiCool.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalKiCool.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalKiCool.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalKiCool.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalKiCool.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalKiCool.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalKiCool.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalKiCool.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalKiCool.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalKiCool.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalKiCool.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalKiCool.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalKiCool.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalKiCool.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalKiCool.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalKiCool.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalKiCool.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalKiCool.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalKiCool.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalKiCool.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalKiCool.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalKiCool.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalKiCool.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalKiCool.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalKiCool.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalKiCool.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // InternalKiCool.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // InternalKiCool.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // InternalKiCool.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // InternalKiCool.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // InternalKiCool.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // InternalKiCool.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // InternalKiCool.g:1:412: T__84
                {
                mT__84(); 

                }
                break;
            case 69 :
                // InternalKiCool.g:1:418: T__85
                {
                mT__85(); 

                }
                break;
            case 70 :
                // InternalKiCool.g:1:424: T__86
                {
                mT__86(); 

                }
                break;
            case 71 :
                // InternalKiCool.g:1:430: T__87
                {
                mT__87(); 

                }
                break;
            case 72 :
                // InternalKiCool.g:1:436: T__88
                {
                mT__88(); 

                }
                break;
            case 73 :
                // InternalKiCool.g:1:442: T__89
                {
                mT__89(); 

                }
                break;
            case 74 :
                // InternalKiCool.g:1:448: T__90
                {
                mT__90(); 

                }
                break;
            case 75 :
                // InternalKiCool.g:1:454: T__91
                {
                mT__91(); 

                }
                break;
            case 76 :
                // InternalKiCool.g:1:460: T__92
                {
                mT__92(); 

                }
                break;
            case 77 :
                // InternalKiCool.g:1:466: T__93
                {
                mT__93(); 

                }
                break;
            case 78 :
                // InternalKiCool.g:1:472: T__94
                {
                mT__94(); 

                }
                break;
            case 79 :
                // InternalKiCool.g:1:478: T__95
                {
                mT__95(); 

                }
                break;
            case 80 :
                // InternalKiCool.g:1:484: T__96
                {
                mT__96(); 

                }
                break;
            case 81 :
                // InternalKiCool.g:1:490: T__97
                {
                mT__97(); 

                }
                break;
            case 82 :
                // InternalKiCool.g:1:496: T__98
                {
                mT__98(); 

                }
                break;
            case 83 :
                // InternalKiCool.g:1:502: T__99
                {
                mT__99(); 

                }
                break;
            case 84 :
                // InternalKiCool.g:1:508: T__100
                {
                mT__100(); 

                }
                break;
            case 85 :
                // InternalKiCool.g:1:515: T__101
                {
                mT__101(); 

                }
                break;
            case 86 :
                // InternalKiCool.g:1:522: T__102
                {
                mT__102(); 

                }
                break;
            case 87 :
                // InternalKiCool.g:1:529: T__103
                {
                mT__103(); 

                }
                break;
            case 88 :
                // InternalKiCool.g:1:536: T__104
                {
                mT__104(); 

                }
                break;
            case 89 :
                // InternalKiCool.g:1:543: T__105
                {
                mT__105(); 

                }
                break;
            case 90 :
                // InternalKiCool.g:1:550: T__106
                {
                mT__106(); 

                }
                break;
            case 91 :
                // InternalKiCool.g:1:557: T__107
                {
                mT__107(); 

                }
                break;
            case 92 :
                // InternalKiCool.g:1:564: T__108
                {
                mT__108(); 

                }
                break;
            case 93 :
                // InternalKiCool.g:1:571: T__109
                {
                mT__109(); 

                }
                break;
            case 94 :
                // InternalKiCool.g:1:578: T__110
                {
                mT__110(); 

                }
                break;
            case 95 :
                // InternalKiCool.g:1:585: T__111
                {
                mT__111(); 

                }
                break;
            case 96 :
                // InternalKiCool.g:1:592: T__112
                {
                mT__112(); 

                }
                break;
            case 97 :
                // InternalKiCool.g:1:599: T__113
                {
                mT__113(); 

                }
                break;
            case 98 :
                // InternalKiCool.g:1:606: T__114
                {
                mT__114(); 

                }
                break;
            case 99 :
                // InternalKiCool.g:1:613: T__115
                {
                mT__115(); 

                }
                break;
            case 100 :
                // InternalKiCool.g:1:620: T__116
                {
                mT__116(); 

                }
                break;
            case 101 :
                // InternalKiCool.g:1:627: T__117
                {
                mT__117(); 

                }
                break;
            case 102 :
                // InternalKiCool.g:1:634: T__118
                {
                mT__118(); 

                }
                break;
            case 103 :
                // InternalKiCool.g:1:641: T__119
                {
                mT__119(); 

                }
                break;
            case 104 :
                // InternalKiCool.g:1:648: T__120
                {
                mT__120(); 

                }
                break;
            case 105 :
                // InternalKiCool.g:1:655: T__121
                {
                mT__121(); 

                }
                break;
            case 106 :
                // InternalKiCool.g:1:662: T__122
                {
                mT__122(); 

                }
                break;
            case 107 :
                // InternalKiCool.g:1:669: RULE_HOSTCODE
                {
                mRULE_HOSTCODE(); 

                }
                break;
            case 108 :
                // InternalKiCool.g:1:683: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 109 :
                // InternalKiCool.g:1:707: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 110 :
                // InternalKiCool.g:1:723: RULE_SL_COMMENT_ANNOTATION
                {
                mRULE_SL_COMMENT_ANNOTATION(); 

                }
                break;
            case 111 :
                // InternalKiCool.g:1:750: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 112 :
                // InternalKiCool.g:1:766: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 113 :
                // InternalKiCool.g:1:775: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 114 :
                // InternalKiCool.g:1:786: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 115 :
                // InternalKiCool.g:1:799: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 116 :
                // InternalKiCool.g:1:811: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 117 :
                // InternalKiCool.g:1:819: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 118 :
                // InternalKiCool.g:1:827: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA28 dfa28 = new DFA28(this);
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
    static final String[] DFA18_transitionS = DFA18_transitionS_.DFA18_transitionS;
    private static final class DFA18_transitionS_ {
        static final String[] DFA18_transitionS = {
                "\12\1",
                "\1\2\1\uffff\12\1\54\uffff\1\3",
                "",
                ""
        };
    }

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

    static class DFA18 extends DFA {

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
            return "13748:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA28_eotS =
        "\1\uffff\7\72\2\uffff\1\112\2\uffff\4\72\2\uffff\1\72\1\126\1\uffff\1\72\1\uffff\1\135\1\140\1\142\1\145\1\147\1\152\1\156\1\160\1\164\1\166\1\uffff\1\72\1\uffff\1\72\1\176\1\72\2\uffff\1\72\1\u0087\1\uffff\1\72\1\uffff\1\72\1\66\1\u008e\1\66\4\uffff\3\72\1\uffff\13\72\7\uffff\5\72\2\uffff\1\72\3\uffff\2\72\1\uffff\1\u00b4\2\uffff\1\u00b7\31\uffff\3\72\1\uffff\1\u00bf\1\72\1\uffff\2\72\2\uffff\2\72\4\uffff\2\72\1\uffff\1\72\2\uffff\1\u008e\3\uffff\2\72\1\u00ca\21\72\1\u00e3\11\72\1\u00ed\1\72\2\uffff\1\u00f0\6\uffff\1\u00f1\2\72\1\uffff\3\72\1\u00f8\1\u00fa\1\u00fb\3\72\1\u00ff\1\uffff\4\72\1\u0104\13\72\1\u0110\7\72\1\uffff\4\72\1\u011d\1\u011e\2\72\1\u0121\1\uffff\1\72\3\uffff\2\72\1\u0125\1\u0126\1\u0127\5\uffff\1\u0128\1\u0129\1\72\1\uffff\2\72\1\u012d\1\72\1\uffff\5\72\1\u0134\3\72\1\u0138\1\72\1\uffff\1\u013a\2\72\1\u013d\2\72\1\u0140\1\72\1\u0142\1\u0143\2\72\2\uffff\2\72\1\uffff\1\72\1\u0149\1\u0125\5\uffff\1\u014a\2\72\1\uffff\3\72\1\u0150\1\u0151\1\u0152\1\uffff\1\u0153\1\u0154\1\u0155\1\uffff\1\72\1\uffff\1\u0157\1\72\1\uffff\2\72\1\uffff\1\72\2\uffff\1\72\1\u015d\1\u015e\1\u015f\1\u0161\2\uffff\1\u0162\1\72\1\u0164\2\72\6\uffff\1\72\1\uffff\1\72\1\u0169\3\72\3\uffff\1\72\2\uffff\1\72\1\uffff\2\72\1\u0171\1\72\1\uffff\4\72\1\u0177\1\u0178\1\72\1\uffff\1\72\1\u017b\2\72\1\u017e\2\uffff\1\u017f\1\72\1\uffff\1\72\1\u0182\2\uffff\1\u0183\1\72\2\uffff\1\u0185\1\uffff";
    static final String DFA28_eofS =
        "\u0186\uffff";
    static final String DFA28_minS =
        "\1\0\1\157\1\145\1\143\1\141\1\154\1\156\1\154\2\uffff\1\75\2\uffff\1\156\1\163\1\165\1\154\2\uffff\1\157\1\51\1\uffff\1\141\1\uffff\1\74\2\75\1\46\1\75\1\53\1\55\1\75\1\52\1\75\1\uffff\1\141\1\uffff\1\157\1\60\1\157\2\uffff\1\141\1\46\1\uffff\1\141\1\uffff\1\157\1\0\1\56\1\0\4\uffff\1\142\1\145\1\163\1\uffff\1\166\1\147\1\163\1\141\1\150\2\142\1\155\1\141\1\160\1\151\7\uffff\1\160\1\165\1\157\1\164\1\157\2\uffff\1\163\3\uffff\1\146\1\156\1\uffff\1\75\2\uffff\1\75\23\uffff\2\0\4\uffff\1\171\1\157\1\154\1\uffff\1\60\1\165\1\uffff\1\154\1\156\2\uffff\1\156\1\170\4\uffff\1\154\1\151\1\uffff\1\157\2\uffff\1\56\3\uffff\1\154\1\145\1\60\1\143\1\156\1\164\1\145\1\165\1\145\1\156\1\164\1\162\1\151\1\160\1\145\1\171\1\145\1\146\1\142\1\163\1\60\1\165\1\141\1\162\1\145\1\155\1\156\1\160\1\142\1\164\1\60\1\144\2\uffff\1\75\6\uffff\1\60\1\141\1\163\1\uffff\1\145\1\154\1\145\3\60\1\144\1\154\1\151\1\60\1\uffff\2\145\1\164\1\141\1\60\2\154\1\156\1\141\1\145\1\164\1\151\1\156\1\143\1\145\1\144\1\60\1\154\1\151\1\164\1\151\1\165\1\163\1\162\1\uffff\1\164\1\163\1\145\1\162\2\60\1\165\1\141\1\60\1\uffff\1\157\3\uffff\1\164\1\145\3\60\5\uffff\2\60\1\143\1\uffff\1\163\1\143\1\60\1\164\1\uffff\1\157\1\141\1\164\1\154\1\155\1\60\1\143\1\147\1\164\1\60\1\165\1\uffff\1\60\1\147\1\151\1\60\1\156\1\164\1\60\1\155\2\60\1\163\1\156\2\uffff\1\164\1\154\1\uffff\1\155\2\60\5\uffff\1\60\1\163\1\164\1\uffff\1\145\1\160\1\164\3\60\1\uffff\3\60\1\uffff\1\154\1\uffff\1\60\1\143\1\uffff\1\145\1\151\1\uffff\1\145\2\uffff\1\163\4\60\2\uffff\1\60\1\145\1\60\1\145\1\151\6\uffff\1\145\1\uffff\1\164\1\60\1\156\1\144\1\151\3\uffff\1\172\2\uffff\1\144\1\uffff\1\162\1\157\1\60\1\151\1\uffff\1\147\1\151\1\157\1\145\2\60\1\156\1\uffff\1\156\1\60\1\141\1\156\1\60\2\uffff\1\60\1\147\1\uffff\1\164\1\60\2\uffff\1\60\1\145\2\uffff\1\60\1\uffff";
    static final String DFA28_maxS =
        "\1\uffff\1\165\1\145\1\171\1\141\1\157\1\156\1\154\2\uffff\1\174\2\uffff\1\170\1\163\1\165\1\154\2\uffff\1\157\1\51\1\uffff\1\145\1\uffff\1\75\1\76\2\75\1\172\1\75\1\76\3\75\1\uffff\1\154\1\uffff\1\162\1\172\1\165\2\uffff\1\151\1\75\1\uffff\1\157\1\uffff\1\157\1\uffff\1\146\1\uffff\4\uffff\1\162\1\157\1\163\1\uffff\1\166\1\155\1\163\1\162\1\157\2\142\1\156\1\141\1\164\1\151\7\uffff\1\164\1\165\1\157\1\164\1\157\2\uffff\1\163\3\uffff\1\146\1\156\1\uffff\1\75\2\uffff\1\76\23\uffff\2\uffff\4\uffff\1\171\1\157\1\154\1\uffff\1\172\1\165\1\uffff\1\154\1\156\2\uffff\1\156\1\170\4\uffff\1\154\1\151\1\uffff\1\157\2\uffff\1\146\3\uffff\1\154\1\145\1\172\1\164\1\166\1\164\1\145\1\165\1\145\1\156\2\164\1\165\1\160\1\145\1\171\1\145\1\163\1\155\1\163\1\172\1\165\1\141\1\162\1\145\1\155\1\156\1\160\1\142\1\164\1\172\1\144\2\uffff\1\75\6\uffff\1\172\1\141\1\163\1\uffff\1\145\1\154\1\145\3\172\1\144\1\154\1\151\1\172\1\uffff\2\145\1\164\1\141\1\172\2\154\1\156\1\141\1\145\1\164\1\151\1\156\1\143\1\145\1\144\1\172\2\154\1\164\1\151\1\165\1\163\1\162\1\uffff\1\164\1\163\1\145\1\162\2\172\1\165\1\141\1\172\1\uffff\1\157\3\uffff\1\164\1\145\3\172\5\uffff\2\172\1\143\1\uffff\1\163\1\143\1\172\1\164\1\uffff\1\157\1\141\1\164\1\154\1\155\1\172\1\143\1\147\1\164\1\172\1\165\1\uffff\1\172\1\147\1\151\1\172\1\156\1\164\1\172\1\155\2\172\1\163\1\156\2\uffff\1\164\1\154\1\uffff\1\155\2\172\5\uffff\1\172\1\163\1\164\1\uffff\1\145\1\160\1\164\3\172\1\uffff\3\172\1\uffff\1\154\1\uffff\1\172\1\143\1\uffff\1\145\1\151\1\uffff\1\145\2\uffff\1\163\4\172\2\uffff\1\172\1\145\1\172\1\145\1\151\6\uffff\1\145\1\uffff\1\164\1\172\1\156\1\144\1\151\3\uffff\1\172\2\uffff\1\144\1\uffff\1\162\1\157\1\172\1\151\1\uffff\1\147\1\151\1\157\1\145\2\172\1\156\1\uffff\1\156\1\172\1\141\1\156\1\172\2\uffff\1\172\1\147\1\uffff\1\164\1\172\2\uffff\1\172\1\145\2\uffff\1\172\1\uffff";
    static final String DFA28_acceptS =
        "\10\uffff\1\12\1\13\1\uffff\1\22\1\23\4\uffff\1\34\1\35\2\uffff\1\40\1\uffff\1\44\12\uffff\1\70\1\uffff\1\74\3\uffff\1\101\1\102\2\uffff\1\130\1\uffff\1\133\4\uffff\2\164\1\165\1\166\3\uffff\1\164\13\uffff\1\12\1\13\1\54\1\113\1\20\1\22\1\23\5\uffff\1\34\1\35\1\uffff\1\41\1\37\1\40\2\uffff\1\44\1\uffff\1\125\1\45\1\uffff\1\126\1\46\1\124\1\50\1\55\1\112\1\57\1\114\1\56\1\105\1\122\1\63\1\71\1\106\1\123\1\64\1\107\1\65\1\110\2\uffff\1\66\1\111\1\67\1\70\3\uffff\1\74\2\uffff\1\77\2\uffff\1\101\1\102\2\uffff\1\127\1\152\1\131\1\130\2\uffff\1\133\1\uffff\1\153\1\160\1\uffff\1\161\1\163\1\165\40\uffff\1\115\1\60\1\uffff\1\116\1\61\1\154\1\155\1\156\1\157\3\uffff\1\76\12\uffff\1\14\30\uffff\1\136\11\uffff\1\43\1\uffff\1\117\1\62\1\72\5\uffff\1\120\1\146\1\121\1\145\1\132\3\uffff\1\134\4\uffff\1\16\13\uffff\1\73\14\uffff\1\143\1\25\2\uffff\1\36\3\uffff\1\162\1\100\1\144\1\151\1\135\3\uffff\1\52\6\uffff\1\6\3\uffff\1\21\1\uffff\1\5\2\uffff\1\26\2\uffff\1\142\1\uffff\1\27\1\11\5\uffff\1\137\1\1\5\uffff\1\17\1\33\1\4\1\32\1\140\1\141\1\uffff\1\7\5\uffff\1\47\1\30\1\31\1\uffff\1\75\1\15\1\uffff\1\150\4\uffff\1\51\7\uffff\1\42\5\uffff\1\147\1\2\2\uffff\1\104\2\uffff\1\53\1\3\2\uffff\1\24\1\103\1\uffff\1\10";
    static final String DFA28_specialS =
        "\1\1\57\uffff\1\0\1\uffff\1\2\77\uffff\1\3\1\4\u0112\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\66\2\65\2\66\1\65\22\66\1\65\1\53\1\62\1\50\1\66\1\41\1\33\1\44\1\24\1\25\1\37\1\35\1\21\1\36\1\27\1\40\12\61\1\42\1\22\1\30\1\32\1\31\1\56\1\51\32\64\1\10\1\66\1\11\1\34\1\46\1\60\1\7\1\57\1\5\1\2\1\15\1\43\1\20\1\23\1\6\1\16\1\63\1\4\1\52\1\47\1\17\1\1\1\63\1\26\1\3\1\45\1\63\1\55\4\63\1\13\1\12\1\14\1\54\uff81\66",
            "\1\71\2\uffff\1\70\2\uffff\1\67",
            "\1\73",
            "\1\77\2\uffff\1\100\2\uffff\1\74\12\uffff\1\76\4\uffff\1\75",
            "\1\101",
            "\1\103\2\uffff\1\102",
            "\1\104",
            "\1\105",
            "",
            "",
            "\1\111\76\uffff\1\110",
            "",
            "",
            "\1\116\11\uffff\1\115",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "",
            "\1\124",
            "\1\125",
            "",
            "\1\131\3\uffff\1\130",
            "",
            "\1\133\1\134",
            "\1\137\1\136",
            "\1\141",
            "\1\143\26\uffff\1\144",
            "\1\146\3\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\151\21\uffff\1\150",
            "\1\155\17\uffff\1\154\1\153",
            "\1\157",
            "\1\162\4\uffff\1\163\15\uffff\1\161",
            "\1\165",
            "",
            "\1\172\1\170\11\uffff\1\171",
            "",
            "\1\174\2\uffff\1\175",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0080\5\uffff\1\177",
            "",
            "",
            "\1\u0084\7\uffff\1\u0083",
            "\1\u0086\26\uffff\1\u0085",
            "",
            "\1\u0089\15\uffff\1\u008a",
            "",
            "\1\u008c",
            "\0\u008d",
            "\1\u0090\1\uffff\12\u008f\54\uffff\1\u0090",
            "\0\u0091",
            "",
            "",
            "",
            "",
            "\1\u0093\17\uffff\1\u0094",
            "\1\u0095\3\uffff\1\u0097\5\uffff\1\u0096",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009c\4\uffff\1\u009b\1\u009a",
            "\1\u009d",
            "\1\u009e\20\uffff\1\u009f",
            "\1\u00a1\6\uffff\1\u00a0",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a5\1\u00a4",
            "\1\u00a6",
            "\1\u00a8\3\uffff\1\u00a7",
            "\1\u00a9",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00aa\3\uffff\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "",
            "\1\u00b0",
            "",
            "",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "",
            "",
            "\1\u00b6\1\u00b5",
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
            "\52\u00b9\1\u00b8\uffd5\u00b9",
            "\52\u00bb\1\u00ba\uffd5\u00bb",
            "",
            "",
            "",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "",
            "",
            "\1\u0090\1\uffff\12\u008f\54\uffff\1\u0090",
            "",
            "",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00cb\20\uffff\1\u00cc",
            "\1\u00cd\7\uffff\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5\1\uffff\1\u00d6",
            "\1\u00d7\13\uffff\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd\14\uffff\1\u00de",
            "\1\u00df\12\uffff\1\u00e0",
            "\1\u00e1",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\4\72\1\u00e2\25\72",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00ee",
            "",
            "",
            "\1\u00ef",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\72\3\uffff\1\u00f7\3\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\3\uffff\1\u00f9\3\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0111",
            "\1\u0112\2\uffff\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u011f",
            "\1\u0120",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u0122",
            "",
            "",
            "",
            "\1\u0123",
            "\1\u0124",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\u012c",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u012e",
            "",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0139",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u013b",
            "\1\u013c",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u013e",
            "\1\u013f",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0141",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0144",
            "\1\u0145",
            "",
            "",
            "\1\u0146",
            "\1\u0147",
            "",
            "\1\u0148",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u014b",
            "\1\u014c",
            "",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u0156",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0158",
            "",
            "\1\u0159",
            "\1\u015a",
            "",
            "\1\u015b",
            "",
            "",
            "\1\u015c",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\10\72\1\u0160\21\72",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0163",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0165",
            "\1\u0166",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0167",
            "",
            "\1\u0168",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "",
            "",
            "",
            "\1\u016d",
            "",
            "",
            "\1\u016e",
            "",
            "\1\u016f",
            "\1\u0170",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0172",
            "",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0179",
            "",
            "\1\u017a",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u017c",
            "\1\u017d",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0180",
            "",
            "\1\u0181",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0184",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_48 = input.LA(1);

                        s = -1;
                        if ( ((LA28_48>='\u0000' && LA28_48<='\uFFFF')) ) {s = 141;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_0 = input.LA(1);

                        s = -1;
                        if ( (LA28_0=='p') ) {s = 1;}

                        else if ( (LA28_0=='d') ) {s = 2;}

                        else if ( (LA28_0=='s') ) {s = 3;}

                        else if ( (LA28_0=='l') ) {s = 4;}

                        else if ( (LA28_0=='c') ) {s = 5;}

                        else if ( (LA28_0=='i') ) {s = 6;}

                        else if ( (LA28_0=='a') ) {s = 7;}

                        else if ( (LA28_0=='[') ) {s = 8;}

                        else if ( (LA28_0==']') ) {s = 9;}

                        else if ( (LA28_0=='|') ) {s = 10;}

                        else if ( (LA28_0=='{') ) {s = 11;}

                        else if ( (LA28_0=='}') ) {s = 12;}

                        else if ( (LA28_0=='e') ) {s = 13;}

                        else if ( (LA28_0=='j') ) {s = 14;}

                        else if ( (LA28_0=='o') ) {s = 15;}

                        else if ( (LA28_0=='g') ) {s = 16;}

                        else if ( (LA28_0==',') ) {s = 17;}

                        else if ( (LA28_0==';') ) {s = 18;}

                        else if ( (LA28_0=='h') ) {s = 19;}

                        else if ( (LA28_0=='(') ) {s = 20;}

                        else if ( (LA28_0==')') ) {s = 21;}

                        else if ( (LA28_0=='r') ) {s = 22;}

                        else if ( (LA28_0=='.') ) {s = 23;}

                        else if ( (LA28_0=='<') ) {s = 24;}

                        else if ( (LA28_0=='>') ) {s = 25;}

                        else if ( (LA28_0=='=') ) {s = 26;}

                        else if ( (LA28_0=='&') ) {s = 27;}

                        else if ( (LA28_0=='^') ) {s = 28;}

                        else if ( (LA28_0=='+') ) {s = 29;}

                        else if ( (LA28_0=='-') ) {s = 30;}

                        else if ( (LA28_0=='*') ) {s = 31;}

                        else if ( (LA28_0=='/') ) {s = 32;}

                        else if ( (LA28_0=='%') ) {s = 33;}

                        else if ( (LA28_0==':') ) {s = 34;}

                        else if ( (LA28_0=='f') ) {s = 35;}

                        else if ( (LA28_0=='\'') ) {s = 36;}

                        else if ( (LA28_0=='t') ) {s = 37;}

                        else if ( (LA28_0=='_') ) {s = 38;}

                        else if ( (LA28_0=='n') ) {s = 39;}

                        else if ( (LA28_0=='#') ) {s = 40;}

                        else if ( (LA28_0=='@') ) {s = 41;}

                        else if ( (LA28_0=='m') ) {s = 42;}

                        else if ( (LA28_0=='!') ) {s = 43;}

                        else if ( (LA28_0=='~') ) {s = 44;}

                        else if ( (LA28_0=='v') ) {s = 45;}

                        else if ( (LA28_0=='?') ) {s = 46;}

                        else if ( (LA28_0=='b') ) {s = 47;}

                        else if ( (LA28_0=='`') ) {s = 48;}

                        else if ( ((LA28_0>='0' && LA28_0<='9')) ) {s = 49;}

                        else if ( (LA28_0=='\"') ) {s = 50;}

                        else if ( (LA28_0=='k'||LA28_0=='q'||LA28_0=='u'||(LA28_0>='w' && LA28_0<='z')) ) {s = 51;}

                        else if ( ((LA28_0>='A' && LA28_0<='Z')) ) {s = 52;}

                        else if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {s = 53;}

                        else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\u001F')||LA28_0=='$'||LA28_0=='\\'||(LA28_0>='\u007F' && LA28_0<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_50 = input.LA(1);

                        s = -1;
                        if ( ((LA28_50>='\u0000' && LA28_50<='\uFFFF')) ) {s = 145;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_114 = input.LA(1);

                        s = -1;
                        if ( (LA28_114=='*') ) {s = 184;}

                        else if ( ((LA28_114>='\u0000' && LA28_114<=')')||(LA28_114>='+' && LA28_114<='\uFFFF')) ) {s = 185;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_115 = input.LA(1);

                        s = -1;
                        if ( (LA28_115=='*') ) {s = 186;}

                        else if ( ((LA28_115>='\u0000' && LA28_115<=')')||(LA28_115>='+' && LA28_115<='\uFFFF')) ) {s = 187;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}