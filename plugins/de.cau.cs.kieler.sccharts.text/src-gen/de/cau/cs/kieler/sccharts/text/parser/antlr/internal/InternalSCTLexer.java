package de.cau.cs.kieler.sccharts.text.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSCTLexer extends Lexer {
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
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int T__37=37;
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
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
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
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=12;
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

    public InternalSCTLexer() {;} 
    public InternalSCTLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSCTLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSCT.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCT.g:11:7: ( '#' )
            // InternalSCT.g:11:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCT.g:12:7: ( 'version' )
            // InternalSCT.g:12:9: 'version'
            {
            match("version"); 


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
            // InternalSCT.g:13:7: ( 'director' )
            // InternalSCT.g:13:9: 'director'
            {
            match("director"); 


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
            // InternalSCT.g:14:7: ( 'SCX' )
            // InternalSCT.g:14:9: 'SCX'
            {
            match("SCX"); 


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
            // InternalSCT.g:15:7: ( 'SCT' )
            // InternalSCT.g:15:9: 'SCT'
            {
            match("SCT"); 


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
            // InternalSCT.g:16:7: ( 'SCCharts' )
            // InternalSCT.g:16:9: 'SCCharts'
            {
            match("SCCharts"); 


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
            // InternalSCT.g:17:7: ( 'Enforcer' )
            // InternalSCT.g:17:9: 'Enforcer'
            {
            match("Enforcer"); 


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
            // InternalSCT.g:18:7: ( 'scchart' )
            // InternalSCT.g:18:9: 'scchart'
            {
            match("scchart"); 


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
            // InternalSCT.g:19:7: ( '{' )
            // InternalSCT.g:19:9: '{'
            {
            match('{'); 

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
            // InternalSCT.g:20:7: ( '}' )
            // InternalSCT.g:20:9: '}'
            {
            match('}'); 

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
            // InternalSCT.g:21:7: ( 'initial' )
            // InternalSCT.g:21:9: 'initial'
            {
            match("initial"); 


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
            // InternalSCT.g:22:7: ( 'final' )
            // InternalSCT.g:22:9: 'final'
            {
            match("final"); 


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
            // InternalSCT.g:23:7: ( 'violation' )
            // InternalSCT.g:23:9: 'violation'
            {
            match("violation"); 


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
            // InternalSCT.g:24:7: ( 'connector' )
            // InternalSCT.g:24:9: 'connector'
            {
            match("connector"); 


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
            // InternalSCT.g:25:7: ( 'state' )
            // InternalSCT.g:25:9: 'state'
            {
            match("state"); 


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
            // InternalSCT.g:26:7: ( 'immediate' )
            // InternalSCT.g:26:9: 'immediate'
            {
            match("immediate"); 


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
            // InternalSCT.g:27:7: ( 'deferred' )
            // InternalSCT.g:27:9: 'deferred'
            {
            match("deferred"); 


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
            // InternalSCT.g:28:7: ( 'if' )
            // InternalSCT.g:28:9: 'if'
            {
            match("if"); 


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
            // InternalSCT.g:29:7: ( 'do' )
            // InternalSCT.g:29:9: 'do'
            {
            match("do"); 


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
            // InternalSCT.g:30:7: ( ';' )
            // InternalSCT.g:30:9: ';'
            {
            match(';'); 

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
            // InternalSCT.g:31:7: ( 'entry' )
            // InternalSCT.g:31:9: 'entry'
            {
            match("entry"); 


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
            // InternalSCT.g:32:7: ( 'during' )
            // InternalSCT.g:32:9: 'during'
            {
            match("during"); 


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
            // InternalSCT.g:33:7: ( 'exit' )
            // InternalSCT.g:33:9: 'exit'
            {
            match("exit"); 


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
            // InternalSCT.g:34:7: ( 'weak' )
            // InternalSCT.g:34:9: 'weak'
            {
            match("weak"); 


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
            // InternalSCT.g:35:7: ( 'suspend' )
            // InternalSCT.g:35:9: 'suspend'
            {
            match("suspend"); 


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
            // InternalSCT.g:36:7: ( 'iterate' )
            // InternalSCT.g:36:9: 'iterate'
            {
            match("iterate"); 


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
            // InternalSCT.g:37:7: ( 'init' )
            // InternalSCT.g:37:9: 'init'
            {
            match("init"); 


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
            // InternalSCT.g:38:7: ( 'region' )
            // InternalSCT.g:38:9: 'region'
            {
            match("region"); 


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
            // InternalSCT.g:39:7: ( ':' )
            // InternalSCT.g:39:9: ':'
            {
            match(':'); 

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
            // InternalSCT.g:40:7: ( 'dataflow' )
            // InternalSCT.g:40:9: 'dataflow'
            {
            match("dataflow"); 


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
            // InternalSCT.g:41:7: ( '=' )
            // InternalSCT.g:41:9: '='
            {
            match('='); 

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
            // InternalSCT.g:42:7: ( '(' )
            // InternalSCT.g:42:9: '('
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
            // InternalSCT.g:43:7: ( ')' )
            // InternalSCT.g:43:9: ')'
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
            // InternalSCT.g:44:7: ( 'scope' )
            // InternalSCT.g:44:9: 'scope'
            {
            match("scope"); 


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
            // InternalSCT.g:45:7: ( 'expression' )
            // InternalSCT.g:45:9: 'expression'
            {
            match("expression"); 


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
            // InternalSCT.g:46:7: ( 'const' )
            // InternalSCT.g:46:9: 'const'
            {
            match("const"); 


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
            // InternalSCT.g:47:7: ( 'input' )
            // InternalSCT.g:47:9: 'input'
            {
            match("input"); 


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
            // InternalSCT.g:48:7: ( 'output' )
            // InternalSCT.g:48:9: 'output'
            {
            match("output"); 


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
            // InternalSCT.g:49:7: ( 'static' )
            // InternalSCT.g:49:9: 'static'
            {
            match("static"); 


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
            // InternalSCT.g:50:7: ( 'signal' )
            // InternalSCT.g:50:9: 'signal'
            {
            match("signal"); 


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
            // InternalSCT.g:51:7: ( ',' )
            // InternalSCT.g:51:9: ','
            {
            match(','); 

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
            // InternalSCT.g:52:7: ( 'ref' )
            // InternalSCT.g:52:9: 'ref'
            {
            match("ref"); 


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
            // InternalSCT.g:53:7: ( 'extern' )
            // InternalSCT.g:53:9: 'extern'
            {
            match("extern"); 


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
            // InternalSCT.g:54:7: ( '[' )
            // InternalSCT.g:54:9: '['
            {
            match('['); 

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
            // InternalSCT.g:55:7: ( ']' )
            // InternalSCT.g:55:9: ']'
            {
            match(']'); 

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
            // InternalSCT.g:56:7: ( 'combine' )
            // InternalSCT.g:56:9: 'combine'
            {
            match("combine"); 


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
            // InternalSCT.g:57:7: ( '()' )
            // InternalSCT.g:57:9: '()'
            {
            match("()"); 


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
            // InternalSCT.g:58:7: ( '<' )
            // InternalSCT.g:58:9: '<'
            {
            match('<'); 

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
            // InternalSCT.g:59:7: ( '>' )
            // InternalSCT.g:59:9: '>'
            {
            match('>'); 

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
            // InternalSCT.g:60:7: ( '\\'' )
            // InternalSCT.g:60:9: '\\''
            {
            match('\''); 

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
            // InternalSCT.g:61:7: ( '.' )
            // InternalSCT.g:61:9: '.'
            {
            match('.'); 

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
            // InternalSCT.g:62:7: ( '!' )
            // InternalSCT.g:62:9: '!'
            {
            match('!'); 

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
            // InternalSCT.g:63:7: ( '&' )
            // InternalSCT.g:63:9: '&'
            {
            match('&'); 

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
            // InternalSCT.g:64:7: ( '@' )
            // InternalSCT.g:64:9: '@'
            {
            match('@'); 

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
            // InternalSCT.g:65:7: ( '-' )
            // InternalSCT.g:65:9: '-'
            {
            match('-'); 

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
            // InternalSCT.g:66:7: ( 'go to' )
            // InternalSCT.g:66:9: 'go to'
            {
            match("go to"); 


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
            // InternalSCT.g:67:7: ( 'abort to' )
            // InternalSCT.g:67:9: 'abort to'
            {
            match("abort to"); 


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
            // InternalSCT.g:68:7: ( 'join to' )
            // InternalSCT.g:68:9: 'join to'
            {
            match("join to"); 


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
            // InternalSCT.g:69:7: ( 'reset' )
            // InternalSCT.g:69:9: 'reset'
            {
            match("reset"); 


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
            // InternalSCT.g:70:7: ( 'shallow history' )
            // InternalSCT.g:70:9: 'shallow history'
            {
            match("shallow history"); 


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
            // InternalSCT.g:71:7: ( 'history' )
            // InternalSCT.g:71:9: 'history'
            {
            match("history"); 


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
            // InternalSCT.g:72:7: ( '+=' )
            // InternalSCT.g:72:9: '+='
            {
            match("+="); 


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
            // InternalSCT.g:73:7: ( '-=' )
            // InternalSCT.g:73:9: '-='
            {
            match("-="); 


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
            // InternalSCT.g:74:7: ( '*=' )
            // InternalSCT.g:74:9: '*='
            {
            match("*="); 


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
            // InternalSCT.g:75:7: ( '/=' )
            // InternalSCT.g:75:9: '/='
            {
            match("/="); 


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
            // InternalSCT.g:76:7: ( '%=' )
            // InternalSCT.g:76:9: '%='
            {
            match("%="); 


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
            // InternalSCT.g:77:7: ( '&=' )
            // InternalSCT.g:77:9: '&='
            {
            match("&="); 


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
            // InternalSCT.g:78:7: ( '|=' )
            // InternalSCT.g:78:9: '|='
            {
            match("|="); 


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
            // InternalSCT.g:79:7: ( '^=' )
            // InternalSCT.g:79:9: '^='
            {
            match("^="); 


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
            // InternalSCT.g:80:7: ( '++' )
            // InternalSCT.g:80:9: '++'
            {
            match("++"); 


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
            // InternalSCT.g:81:7: ( '--' )
            // InternalSCT.g:81:9: '--'
            {
            match("--"); 


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
            // InternalSCT.g:82:7: ( '==' )
            // InternalSCT.g:82:9: '=='
            {
            match("=="); 


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
            // InternalSCT.g:83:7: ( '<=' )
            // InternalSCT.g:83:9: '<='
            {
            match("<="); 


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
            // InternalSCT.g:84:7: ( '>=' )
            // InternalSCT.g:84:9: '>='
            {
            match(">="); 


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
            // InternalSCT.g:85:7: ( '!=' )
            // InternalSCT.g:85:9: '!='
            {
            match("!="); 


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
            // InternalSCT.g:86:7: ( 'pre' )
            // InternalSCT.g:86:9: 'pre'
            {
            match("pre"); 


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
            // InternalSCT.g:87:7: ( '|' )
            // InternalSCT.g:87:9: '|'
            {
            match('|'); 

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
            // InternalSCT.g:88:7: ( '+' )
            // InternalSCT.g:88:9: '+'
            {
            match('+'); 

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
            // InternalSCT.g:89:7: ( '*' )
            // InternalSCT.g:89:9: '*'
            {
            match('*'); 

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
            // InternalSCT.g:90:7: ( '%' )
            // InternalSCT.g:90:9: '%'
            {
            match('%'); 

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
            // InternalSCT.g:91:7: ( '/' )
            // InternalSCT.g:91:9: '/'
            {
            match('/'); 

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
            // InternalSCT.g:92:7: ( 'val' )
            // InternalSCT.g:92:9: 'val'
            {
            match("val"); 


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
            // InternalSCT.g:93:7: ( '||' )
            // InternalSCT.g:93:9: '||'
            {
            match("||"); 


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
            // InternalSCT.g:94:7: ( '&&' )
            // InternalSCT.g:94:9: '&&'
            {
            match("&&"); 


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
            // InternalSCT.g:95:8: ( 'pure' )
            // InternalSCT.g:95:10: 'pure'
            {
            match("pure"); 


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
            // InternalSCT.g:96:8: ( 'bool' )
            // InternalSCT.g:96:10: 'bool'
            {
            match("bool"); 


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
            // InternalSCT.g:97:8: ( 'unsigned' )
            // InternalSCT.g:97:10: 'unsigned'
            {
            match("unsigned"); 


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
            // InternalSCT.g:98:8: ( 'int' )
            // InternalSCT.g:98:10: 'int'
            {
            match("int"); 


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
            // InternalSCT.g:99:8: ( 'float' )
            // InternalSCT.g:99:10: 'float'
            {
            match("float"); 


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
            // InternalSCT.g:100:8: ( 'string' )
            // InternalSCT.g:100:10: 'string'
            {
            match("string"); 


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
            // InternalSCT.g:101:8: ( 'host' )
            // InternalSCT.g:101:10: 'host'
            {
            match("host"); 


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
            // InternalSCT.g:102:8: ( 'none' )
            // InternalSCT.g:102:10: 'none'
            {
            match("none"); 


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
            // InternalSCT.g:103:8: ( 'max' )
            // InternalSCT.g:103:10: 'max'
            {
            match("max"); 


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
            // InternalSCT.g:104:8: ( 'min' )
            // InternalSCT.g:104:10: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "RULE_HOSTCODE"
    public final void mRULE_HOSTCODE() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCT.g:7799:15: ( '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`' )
            // InternalSCT.g:7799:17: '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`'
            {
            match('`'); 
            // InternalSCT.g:7799:21: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )*
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
            	    // InternalSCT.g:7799:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalSCT.g:7799:63: ~ ( ( '\\\\' | '`' ) )
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
            // InternalSCT.g:7801:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalSCT.g:7801:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalSCT.g:7801:33: ( options {greedy=false; } : . )*
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
            	    // InternalSCT.g:7801:61: .
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
            // InternalSCT.g:7803:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalSCT.g:7803:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSCT.g:7803:31: ( options {greedy=false; } : . )*
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
            	    // InternalSCT.g:7803:59: .
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

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            // InternalSCT.g:7805:22: ( '0' .. '9' )
            // InternalSCT.g:7805:24: '0' .. '9'
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
            // InternalSCT.g:7807:10: ( ( RULE_NUMBER )+ )
            // InternalSCT.g:7807:12: ( RULE_NUMBER )+
            {
            // InternalSCT.g:7807:12: ( RULE_NUMBER )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSCT.g:7807:12: RULE_NUMBER
            	    {
            	    mRULE_NUMBER(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalSCT.g:7809:12: ( ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' ) )
            // InternalSCT.g:7809:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            {
            // InternalSCT.g:7809:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalSCT.g:7809:15: ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // InternalSCT.g:7809:15: ( RULE_NUMBER )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSCT.g:7809:15: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    match('.'); 
                    // InternalSCT.g:7809:32: ( RULE_NUMBER )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSCT.g:7809:32: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalSCT.g:7809:45: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSCT.g:7809:46: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalSCT.g:7809:56: ( '+' | '-' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='+'||LA7_0=='-') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // InternalSCT.g:
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

                            // InternalSCT.g:7809:67: ( RULE_NUMBER )+
                            int cnt8=0;
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalSCT.g:7809:67: RULE_NUMBER
                            	    {
                            	    mRULE_NUMBER(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt8 >= 1 ) break loop8;
                                        EarlyExitException eee =
                                            new EarlyExitException(8, input);
                                        throw eee;
                                }
                                cnt8++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalSCT.g:7809:82: ( 'f' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='f') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSCT.g:7809:82: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalSCT.g:7809:87: ( RULE_NUMBER )+ 'f'
                    {
                    // InternalSCT.g:7809:87: ( RULE_NUMBER )+
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
                    	    // InternalSCT.g:7809:87: RULE_NUMBER
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
            // InternalSCT.g:7811:14: ( ( 'true' | 'false' ) )
            // InternalSCT.g:7811:16: ( 'true' | 'false' )
            {
            // InternalSCT.g:7811:16: ( 'true' | 'false' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='t') ) {
                alt13=1;
            }
            else if ( (LA13_0=='f') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSCT.g:7811:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalSCT.g:7811:24: 'false'
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
            // InternalSCT.g:7813:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalSCT.g:7813:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalSCT.g:7813:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    alt14=1;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSCT.g:7813:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalSCT.g:7813:61: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop14;
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
            // InternalSCT.g:7815:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSCT.g:7815:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSCT.g:7815:11: ( '^' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='^') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSCT.g:7815:11: '^'
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

            // InternalSCT.g:7815:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSCT.g:
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
            	    break loop16;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCT.g:7817:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSCT.g:7817:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSCT.g:7817:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSCT.g:7817:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop17;
                }
            } while (true);

            // InternalSCT.g:7817:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSCT.g:7817:41: ( '\\r' )? '\\n'
                    {
                    // InternalSCT.g:7817:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalSCT.g:7817:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCT.g:7819:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSCT.g:7819:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSCT.g:7819:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSCT.g:
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // InternalSCT.g:7821:16: ( . )
            // InternalSCT.g:7821:18: .
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
        // InternalSCT.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=105;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalSCT.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalSCT.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalSCT.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalSCT.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalSCT.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalSCT.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalSCT.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalSCT.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalSCT.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalSCT.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalSCT.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalSCT.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalSCT.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalSCT.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalSCT.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalSCT.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalSCT.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalSCT.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalSCT.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalSCT.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalSCT.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalSCT.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalSCT.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalSCT.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalSCT.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalSCT.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalSCT.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalSCT.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalSCT.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalSCT.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalSCT.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalSCT.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // InternalSCT.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // InternalSCT.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // InternalSCT.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // InternalSCT.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // InternalSCT.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // InternalSCT.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // InternalSCT.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // InternalSCT.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // InternalSCT.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // InternalSCT.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // InternalSCT.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // InternalSCT.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // InternalSCT.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // InternalSCT.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // InternalSCT.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // InternalSCT.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // InternalSCT.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // InternalSCT.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // InternalSCT.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // InternalSCT.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // InternalSCT.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // InternalSCT.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // InternalSCT.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // InternalSCT.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // InternalSCT.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // InternalSCT.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // InternalSCT.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // InternalSCT.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // InternalSCT.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // InternalSCT.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // InternalSCT.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // InternalSCT.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // InternalSCT.g:1:394: T__80
                {
                mT__80(); 

                }
                break;
            case 66 :
                // InternalSCT.g:1:400: T__81
                {
                mT__81(); 

                }
                break;
            case 67 :
                // InternalSCT.g:1:406: T__82
                {
                mT__82(); 

                }
                break;
            case 68 :
                // InternalSCT.g:1:412: T__83
                {
                mT__83(); 

                }
                break;
            case 69 :
                // InternalSCT.g:1:418: T__84
                {
                mT__84(); 

                }
                break;
            case 70 :
                // InternalSCT.g:1:424: T__85
                {
                mT__85(); 

                }
                break;
            case 71 :
                // InternalSCT.g:1:430: T__86
                {
                mT__86(); 

                }
                break;
            case 72 :
                // InternalSCT.g:1:436: T__87
                {
                mT__87(); 

                }
                break;
            case 73 :
                // InternalSCT.g:1:442: T__88
                {
                mT__88(); 

                }
                break;
            case 74 :
                // InternalSCT.g:1:448: T__89
                {
                mT__89(); 

                }
                break;
            case 75 :
                // InternalSCT.g:1:454: T__90
                {
                mT__90(); 

                }
                break;
            case 76 :
                // InternalSCT.g:1:460: T__91
                {
                mT__91(); 

                }
                break;
            case 77 :
                // InternalSCT.g:1:466: T__92
                {
                mT__92(); 

                }
                break;
            case 78 :
                // InternalSCT.g:1:472: T__93
                {
                mT__93(); 

                }
                break;
            case 79 :
                // InternalSCT.g:1:478: T__94
                {
                mT__94(); 

                }
                break;
            case 80 :
                // InternalSCT.g:1:484: T__95
                {
                mT__95(); 

                }
                break;
            case 81 :
                // InternalSCT.g:1:490: T__96
                {
                mT__96(); 

                }
                break;
            case 82 :
                // InternalSCT.g:1:496: T__97
                {
                mT__97(); 

                }
                break;
            case 83 :
                // InternalSCT.g:1:502: T__98
                {
                mT__98(); 

                }
                break;
            case 84 :
                // InternalSCT.g:1:508: T__99
                {
                mT__99(); 

                }
                break;
            case 85 :
                // InternalSCT.g:1:514: T__100
                {
                mT__100(); 

                }
                break;
            case 86 :
                // InternalSCT.g:1:521: T__101
                {
                mT__101(); 

                }
                break;
            case 87 :
                // InternalSCT.g:1:528: T__102
                {
                mT__102(); 

                }
                break;
            case 88 :
                // InternalSCT.g:1:535: T__103
                {
                mT__103(); 

                }
                break;
            case 89 :
                // InternalSCT.g:1:542: T__104
                {
                mT__104(); 

                }
                break;
            case 90 :
                // InternalSCT.g:1:549: T__105
                {
                mT__105(); 

                }
                break;
            case 91 :
                // InternalSCT.g:1:556: T__106
                {
                mT__106(); 

                }
                break;
            case 92 :
                // InternalSCT.g:1:563: T__107
                {
                mT__107(); 

                }
                break;
            case 93 :
                // InternalSCT.g:1:570: T__108
                {
                mT__108(); 

                }
                break;
            case 94 :
                // InternalSCT.g:1:577: T__109
                {
                mT__109(); 

                }
                break;
            case 95 :
                // InternalSCT.g:1:584: RULE_HOSTCODE
                {
                mRULE_HOSTCODE(); 

                }
                break;
            case 96 :
                // InternalSCT.g:1:598: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 97 :
                // InternalSCT.g:1:622: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 98 :
                // InternalSCT.g:1:638: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 99 :
                // InternalSCT.g:1:647: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 100 :
                // InternalSCT.g:1:658: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 101 :
                // InternalSCT.g:1:671: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 102 :
                // InternalSCT.g:1:683: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 103 :
                // InternalSCT.g:1:691: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 104 :
                // InternalSCT.g:1:707: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 105 :
                // InternalSCT.g:1:715: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA12_eotS =
        "\4\uffff";
    static final String DFA12_eofS =
        "\4\uffff";
    static final String DFA12_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA12_maxS =
        "\1\71\1\146\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\4\uffff}>";
    static final String[] DFA12_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\54\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    static class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "7809:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA21_eotS =
        "\2\uffff\5\72\2\uffff\3\72\1\uffff\3\72\1\uffff\1\130\1\132\1\uffff\1\72\3\uffff\1\141\1\143\2\uffff\1\147\1\152\1\uffff\1\156\4\72\1\166\1\170\1\174\1\176\1\u0081\1\65\5\72\1\65\1\u008b\1\72\1\65\4\uffff\3\72\1\uffff\2\72\1\u0096\11\72\2\uffff\2\72\1\u00a8\5\72\1\uffff\4\72\6\uffff\1\72\22\uffff\5\72\17\uffff\7\72\3\uffff\1\u008b\1\72\2\uffff\2\72\1\u00c9\2\72\1\uffff\2\72\1\u00ce\1\u00cf\13\72\1\u00db\1\72\1\uffff\14\72\1\u00ea\2\72\1\uffff\4\72\2\uffff\1\u00f1\4\72\1\u00f6\1\u00f7\3\72\1\uffff\4\72\2\uffff\11\72\1\u010a\1\72\1\uffff\11\72\1\u0115\2\72\1\u0118\1\72\1\uffff\5\72\1\u011f\1\uffff\1\u0120\1\u0121\1\72\1\u0123\2\uffff\1\u0124\11\72\1\u012e\1\u012f\6\72\1\uffff\1\u0136\2\72\1\u0139\1\u013a\1\u0124\1\72\1\u013c\1\72\1\u013e\1\uffff\2\72\1\uffff\1\72\1\u0142\2\72\1\uffff\1\72\3\uffff\1\72\2\uffff\4\72\1\u014b\4\72\2\uffff\1\u0150\1\u0151\1\72\1\u0153\2\72\1\uffff\2\72\2\uffff\1\72\1\uffff\1\72\1\uffff\1\72\1\u015b\1\u015c\1\uffff\1\u015d\1\uffff\2\72\1\u0160\3\72\1\uffff\3\72\1\u0167\2\uffff\1\u0168\1\uffff\1\72\1\u016a\1\72\1\u016c\1\72\1\u016e\1\72\3\uffff\1\u0170\1\72\1\uffff\1\72\1\u0173\1\u0174\1\u0175\1\u0176\1\u0177\4\uffff\1\72\1\uffff\1\72\1\uffff\1\72\1\uffff\1\u017b\1\u017c\5\uffff\1\u017d\1\u017e\1\72\4\uffff\1\u0180\1\uffff";
    static final String DFA21_eofS =
        "\u0181\uffff";
    static final String DFA21_minS =
        "\1\0\1\uffff\2\141\1\103\1\156\1\143\2\uffff\1\146\1\141\1\157\1\uffff\1\156\2\145\1\uffff\1\75\1\51\1\uffff\1\165\3\uffff\2\75\2\uffff\1\75\1\46\1\uffff\1\55\1\157\1\142\1\157\1\151\1\53\1\75\1\52\3\75\1\162\1\157\1\156\1\157\1\141\1\0\1\56\1\162\1\0\4\uffff\1\162\1\157\1\154\1\uffff\1\162\1\146\1\60\1\162\1\164\1\103\1\146\1\143\1\141\1\163\1\147\1\141\2\uffff\1\151\1\155\1\60\1\145\1\156\1\157\1\154\1\155\1\uffff\1\164\1\151\1\141\1\146\6\uffff\1\164\22\uffff\1\40\1\157\1\151\2\163\6\uffff\1\0\10\uffff\1\145\1\162\1\157\1\163\1\156\1\170\1\156\3\uffff\1\56\1\165\2\uffff\1\163\1\154\1\60\2\145\1\uffff\1\151\1\141\2\60\1\150\1\157\1\150\1\160\1\164\1\151\1\160\1\156\1\154\1\164\1\165\1\60\1\145\1\uffff\1\162\2\141\1\163\1\156\1\142\1\162\1\164\1\162\1\145\1\153\1\151\1\60\1\145\1\160\1\uffff\1\162\1\156\2\164\2\uffff\1\60\1\145\1\154\1\151\1\145\2\60\1\145\1\151\1\141\1\uffff\1\143\1\162\1\156\1\146\2\uffff\1\141\1\162\1\141\2\145\1\156\1\145\1\141\1\154\1\60\1\164\1\uffff\1\144\1\141\1\154\1\164\2\145\1\164\1\151\1\171\1\60\1\145\1\162\1\60\1\157\1\uffff\1\164\1\165\1\164\1\40\1\157\1\60\1\uffff\2\60\1\147\1\60\2\uffff\1\60\1\157\2\164\1\162\1\147\1\154\1\162\1\143\1\162\2\60\1\143\1\147\1\156\1\154\1\157\1\141\1\uffff\1\60\1\151\1\164\3\60\1\143\1\60\1\156\1\60\1\uffff\1\163\1\156\1\uffff\1\156\1\60\1\164\1\40\1\uffff\1\162\3\uffff\1\156\2\uffff\1\156\1\151\1\157\1\145\1\60\1\157\1\164\1\145\1\164\2\uffff\2\60\1\144\1\60\1\167\1\154\1\uffff\1\141\1\145\2\uffff\1\164\1\uffff\1\145\1\uffff\1\163\2\60\1\uffff\1\60\1\uffff\1\171\1\145\1\60\1\157\1\162\1\144\1\uffff\1\167\1\163\1\162\1\60\2\uffff\1\60\1\uffff\1\40\1\60\1\164\1\60\1\157\1\60\1\151\3\uffff\1\60\1\144\1\uffff\1\156\5\60\4\uffff\1\145\1\uffff\1\162\1\uffff\1\157\1\uffff\2\60\5\uffff\2\60\1\156\4\uffff\1\60\1\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\uffff\1\151\1\165\1\103\1\156\1\165\2\uffff\1\164\1\154\1\157\1\uffff\1\170\2\145\1\uffff\1\75\1\51\1\uffff\1\165\3\uffff\2\75\2\uffff\2\75\1\uffff\1\75\1\157\1\142\2\157\4\75\1\174\1\172\1\165\1\157\1\156\1\157\1\151\1\uffff\1\146\1\162\1\uffff\4\uffff\1\162\1\157\1\154\1\uffff\1\162\1\146\1\172\1\162\1\164\1\130\1\146\1\157\1\162\1\163\1\147\1\141\2\uffff\1\164\1\155\1\172\1\145\1\156\1\157\1\154\1\156\1\uffff\2\164\1\141\1\163\6\uffff\1\164\22\uffff\1\40\1\157\1\151\2\163\6\uffff\1\uffff\10\uffff\1\145\1\162\1\157\1\163\1\156\1\170\1\156\3\uffff\1\146\1\165\2\uffff\1\163\1\154\1\172\2\145\1\uffff\1\151\1\141\2\172\1\150\1\157\1\150\1\160\1\164\1\151\1\160\1\156\1\154\1\164\1\165\1\172\1\145\1\uffff\1\162\2\141\2\163\1\142\1\162\1\164\1\162\1\145\1\153\1\151\1\172\1\145\1\160\1\uffff\1\162\1\156\2\164\2\uffff\1\172\1\145\1\154\1\151\1\145\2\172\1\145\1\151\1\141\1\uffff\1\143\1\162\1\156\1\146\2\uffff\1\141\1\162\1\141\1\145\1\151\1\156\1\145\1\141\1\154\1\172\1\164\1\uffff\1\144\1\141\1\154\1\164\2\145\1\164\1\151\1\171\1\172\1\145\1\162\1\172\1\157\1\uffff\1\164\1\165\1\164\1\40\1\157\1\172\1\uffff\2\172\1\147\1\172\2\uffff\1\172\1\157\2\164\1\162\1\147\1\154\1\162\1\143\1\162\2\172\1\143\1\147\1\156\1\154\1\157\1\141\1\uffff\1\172\1\151\1\164\3\172\1\143\1\172\1\156\1\172\1\uffff\1\163\1\156\1\uffff\1\156\1\172\1\164\1\40\1\uffff\1\162\3\uffff\1\156\2\uffff\1\156\1\151\1\157\1\145\1\172\1\157\1\164\1\145\1\164\2\uffff\2\172\1\144\1\172\1\167\1\154\1\uffff\1\141\1\145\2\uffff\1\164\1\uffff\1\145\1\uffff\1\163\2\172\1\uffff\1\172\1\uffff\1\171\1\145\1\172\1\157\1\162\1\144\1\uffff\1\167\1\163\1\162\1\172\2\uffff\1\172\1\uffff\1\40\1\172\1\164\1\172\1\157\1\172\1\151\3\uffff\1\172\1\144\1\uffff\1\156\5\172\4\uffff\1\145\1\uffff\1\162\1\uffff\1\157\1\uffff\2\172\5\uffff\2\172\1\156\4\uffff\1\172\1\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\5\uffff\1\11\1\12\3\uffff\1\24\3\uffff\1\35\2\uffff\1\41\1\uffff\1\51\1\54\1\55\2\uffff\1\62\1\63\2\uffff\1\66\24\uffff\1\146\1\150\1\151\1\1\3\uffff\1\146\14\uffff\1\11\1\12\10\uffff\1\24\4\uffff\1\35\1\110\1\37\1\57\1\40\1\41\1\uffff\1\51\1\54\1\55\1\111\1\60\1\112\1\61\1\62\1\63\1\113\1\64\1\103\1\124\1\65\1\66\1\77\1\107\1\67\5\uffff\1\76\1\106\1\116\1\100\1\117\1\101\1\uffff\1\147\1\121\1\102\1\120\1\104\1\123\1\115\1\105\7\uffff\1\137\1\142\1\143\2\uffff\1\145\1\150\5\uffff\1\23\21\uffff\1\22\17\uffff\1\70\4\uffff\1\140\1\141\12\uffff\1\122\4\uffff\1\4\1\5\13\uffff\1\130\16\uffff\1\52\6\uffff\1\114\4\uffff\1\135\1\136\22\uffff\1\33\12\uffff\1\27\2\uffff\1\30\4\uffff\1\72\1\uffff\1\133\1\125\1\126\1\uffff\1\134\1\144\11\uffff\1\42\1\17\6\uffff\1\45\2\uffff\1\14\1\131\1\uffff\1\44\1\uffff\1\25\3\uffff\1\73\1\uffff\1\71\6\uffff\1\26\4\uffff\1\47\1\132\1\uffff\1\50\7\uffff\1\53\1\34\1\46\2\uffff\1\2\6\uffff\1\10\1\31\1\74\1\13\1\uffff\1\32\1\uffff\1\56\1\uffff\1\75\2\uffff\1\3\1\21\1\36\1\6\1\7\3\uffff\1\127\1\15\1\20\1\16\1\uffff\1\43";
    static final String DFA21_specialS =
        "\1\0\56\uffff\1\3\2\uffff\1\2\107\uffff\1\1\u0106\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\65\2\64\2\65\1\64\22\65\1\64\1\34\1\62\1\1\1\65\1\47\1\35\1\32\1\22\1\23\1\45\1\44\1\25\1\37\1\33\1\46\12\60\1\20\1\14\1\30\1\21\1\31\1\65\1\36\4\63\1\5\15\63\1\4\7\63\1\26\1\65\1\27\1\51\1\63\1\57\1\41\1\53\1\13\1\3\1\15\1\12\1\40\1\43\1\11\1\42\2\63\1\56\1\55\1\24\1\52\1\63\1\17\1\6\1\61\1\54\1\2\1\16\3\63\1\7\1\50\1\10\uff82\65",
            "",
            "\1\71\3\uffff\1\67\3\uffff\1\70",
            "\1\77\3\uffff\1\74\3\uffff\1\73\5\uffff\1\75\5\uffff\1\76",
            "\1\100",
            "\1\101",
            "\1\102\4\uffff\1\106\1\105\12\uffff\1\103\1\104",
            "",
            "",
            "\1\113\6\uffff\1\112\1\111\5\uffff\1\114",
            "\1\117\7\uffff\1\115\2\uffff\1\116",
            "\1\120",
            "",
            "\1\122\11\uffff\1\123",
            "\1\124",
            "\1\125",
            "",
            "\1\127",
            "\1\131",
            "",
            "\1\134",
            "",
            "",
            "",
            "\1\140",
            "\1\142",
            "",
            "",
            "\1\146",
            "\1\151\26\uffff\1\150",
            "",
            "\1\155\17\uffff\1\154",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162\5\uffff\1\163",
            "\1\165\21\uffff\1\164",
            "\1\167",
            "\1\172\4\uffff\1\173\15\uffff\1\171",
            "\1\175",
            "\1\177\76\uffff\1\u0080",
            "\1\u0082\3\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0083\2\uffff\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088\7\uffff\1\u0089",
            "\0\u008a",
            "\1\u008c\1\uffff\12\u008d\54\uffff\1\u008c",
            "\1\u008e",
            "\0\u008f",
            "",
            "",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0097",
            "\1\u0098",
            "\1\u009b\20\uffff\1\u009a\3\uffff\1\u0099",
            "\1\u009c",
            "\1\u009d\13\uffff\1\u009e",
            "\1\u009f\20\uffff\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "",
            "\1\u00a4\6\uffff\1\u00a5\3\uffff\1\u00a6",
            "\1\u00a7",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ae\1\u00ad",
            "",
            "\1\u00af",
            "\1\u00b0\6\uffff\1\u00b1\3\uffff\1\u00b2",
            "\1\u00b3",
            "\1\u00b5\1\u00b4\13\uffff\1\u00b6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b7",
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
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\u00be\1\u00bd\uffd5\u00be",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "",
            "",
            "\1\u008c\1\uffff\12\u008d\54\uffff\1\u008c",
            "\1\u00c6",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1\4\uffff\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103\3\uffff\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\10\72\1\u0109\21\72",
            "\1\u010b",
            "",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0116",
            "\1\u0117",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0122",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0137",
            "\1\u0138",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u013b",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u013d",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u013f",
            "\1\u0140",
            "",
            "\1\u0141",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0143",
            "\1\u0144",
            "",
            "\1\u0145",
            "",
            "",
            "",
            "\1\u0146",
            "",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0152",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0154",
            "\1\u0155",
            "",
            "\1\u0156",
            "\1\u0157",
            "",
            "",
            "\1\u0158",
            "",
            "\1\u0159",
            "",
            "\1\u015a",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u015e",
            "\1\u015f",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u0169",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u016b",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u016d",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u016f",
            "",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0171",
            "",
            "\1\u0172",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "",
            "\1\u0178",
            "",
            "\1\u0179",
            "",
            "\1\u017a",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u017f",
            "",
            "",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='#') ) {s = 1;}

                        else if ( (LA21_0=='v') ) {s = 2;}

                        else if ( (LA21_0=='d') ) {s = 3;}

                        else if ( (LA21_0=='S') ) {s = 4;}

                        else if ( (LA21_0=='E') ) {s = 5;}

                        else if ( (LA21_0=='s') ) {s = 6;}

                        else if ( (LA21_0=='{') ) {s = 7;}

                        else if ( (LA21_0=='}') ) {s = 8;}

                        else if ( (LA21_0=='i') ) {s = 9;}

                        else if ( (LA21_0=='f') ) {s = 10;}

                        else if ( (LA21_0=='c') ) {s = 11;}

                        else if ( (LA21_0==';') ) {s = 12;}

                        else if ( (LA21_0=='e') ) {s = 13;}

                        else if ( (LA21_0=='w') ) {s = 14;}

                        else if ( (LA21_0=='r') ) {s = 15;}

                        else if ( (LA21_0==':') ) {s = 16;}

                        else if ( (LA21_0=='=') ) {s = 17;}

                        else if ( (LA21_0=='(') ) {s = 18;}

                        else if ( (LA21_0==')') ) {s = 19;}

                        else if ( (LA21_0=='o') ) {s = 20;}

                        else if ( (LA21_0==',') ) {s = 21;}

                        else if ( (LA21_0=='[') ) {s = 22;}

                        else if ( (LA21_0==']') ) {s = 23;}

                        else if ( (LA21_0=='<') ) {s = 24;}

                        else if ( (LA21_0=='>') ) {s = 25;}

                        else if ( (LA21_0=='\'') ) {s = 26;}

                        else if ( (LA21_0=='.') ) {s = 27;}

                        else if ( (LA21_0=='!') ) {s = 28;}

                        else if ( (LA21_0=='&') ) {s = 29;}

                        else if ( (LA21_0=='@') ) {s = 30;}

                        else if ( (LA21_0=='-') ) {s = 31;}

                        else if ( (LA21_0=='g') ) {s = 32;}

                        else if ( (LA21_0=='a') ) {s = 33;}

                        else if ( (LA21_0=='j') ) {s = 34;}

                        else if ( (LA21_0=='h') ) {s = 35;}

                        else if ( (LA21_0=='+') ) {s = 36;}

                        else if ( (LA21_0=='*') ) {s = 37;}

                        else if ( (LA21_0=='/') ) {s = 38;}

                        else if ( (LA21_0=='%') ) {s = 39;}

                        else if ( (LA21_0=='|') ) {s = 40;}

                        else if ( (LA21_0=='^') ) {s = 41;}

                        else if ( (LA21_0=='p') ) {s = 42;}

                        else if ( (LA21_0=='b') ) {s = 43;}

                        else if ( (LA21_0=='u') ) {s = 44;}

                        else if ( (LA21_0=='n') ) {s = 45;}

                        else if ( (LA21_0=='m') ) {s = 46;}

                        else if ( (LA21_0=='`') ) {s = 47;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 48;}

                        else if ( (LA21_0=='t') ) {s = 49;}

                        else if ( (LA21_0=='\"') ) {s = 50;}

                        else if ( ((LA21_0>='A' && LA21_0<='D')||(LA21_0>='F' && LA21_0<='R')||(LA21_0>='T' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='k' && LA21_0<='l')||LA21_0=='q'||(LA21_0>='x' && LA21_0<='z')) ) {s = 51;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 52;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='$'||LA21_0=='?'||LA21_0=='\\'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_122 = input.LA(1);

                        s = -1;
                        if ( (LA21_122=='*') ) {s = 189;}

                        else if ( ((LA21_122>='\u0000' && LA21_122<=')')||(LA21_122>='+' && LA21_122<='\uFFFF')) ) {s = 190;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_50 = input.LA(1);

                        s = -1;
                        if ( ((LA21_50>='\u0000' && LA21_50<='\uFFFF')) ) {s = 143;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_47 = input.LA(1);

                        s = -1;
                        if ( ((LA21_47>='\u0000' && LA21_47<='\uFFFF')) ) {s = 138;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}