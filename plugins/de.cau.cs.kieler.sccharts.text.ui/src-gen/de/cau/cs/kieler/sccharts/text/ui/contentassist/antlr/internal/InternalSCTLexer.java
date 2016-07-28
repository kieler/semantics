package de.cau.cs.kieler.sccharts.text.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


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
    public static final int RULE_ID=6;
    public static final int RULE_INT=7;
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
    public static final int RULE_BOOLEAN=5;
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
    public static final int RULE_HOSTCODE=9;
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
    public static final int RULE_STRING=4;
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
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
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
            // InternalSCT.g:11:7: ( 'pre' )
            // InternalSCT.g:11:9: 'pre'
            {
            match("pre"); 


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
            // InternalSCT.g:12:7: ( '|' )
            // InternalSCT.g:12:9: '|'
            {
            match('|'); 

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
            // InternalSCT.g:13:7: ( '&' )
            // InternalSCT.g:13:9: '&'
            {
            match('&'); 

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
            // InternalSCT.g:14:7: ( '!' )
            // InternalSCT.g:14:9: '!'
            {
            match('!'); 

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
            // InternalSCT.g:15:7: ( '+' )
            // InternalSCT.g:15:9: '+'
            {
            match('+'); 

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
            // InternalSCT.g:16:7: ( '-' )
            // InternalSCT.g:16:9: '-'
            {
            match('-'); 

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
            // InternalSCT.g:17:7: ( '*' )
            // InternalSCT.g:17:9: '*'
            {
            match('*'); 

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
            // InternalSCT.g:18:7: ( '%' )
            // InternalSCT.g:18:9: '%'
            {
            match('%'); 

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
            // InternalSCT.g:19:7: ( '/' )
            // InternalSCT.g:19:9: '/'
            {
            match('/'); 

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
            // InternalSCT.g:20:7: ( 'val' )
            // InternalSCT.g:20:9: 'val'
            {
            match("val"); 


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
            // InternalSCT.g:21:7: ( '||' )
            // InternalSCT.g:21:9: '||'
            {
            match("||"); 


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
            // InternalSCT.g:22:7: ( '&&' )
            // InternalSCT.g:22:9: '&&'
            {
            match("&&"); 


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
            // InternalSCT.g:23:7: ( 'SCX' )
            // InternalSCT.g:23:9: 'SCX'
            {
            match("SCX"); 


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
            // InternalSCT.g:24:7: ( 'SCT' )
            // InternalSCT.g:24:9: 'SCT'
            {
            match("SCT"); 


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
            // InternalSCT.g:25:7: ( 'SCCharts' )
            // InternalSCT.g:25:9: 'SCCharts'
            {
            match("SCCharts"); 


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
            // InternalSCT.g:26:7: ( 'Enforcer' )
            // InternalSCT.g:26:9: 'Enforcer'
            {
            match("Enforcer"); 


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
            // InternalSCT.g:27:7: ( '()' )
            // InternalSCT.g:27:9: '()'
            {
            match("()"); 


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
            // InternalSCT.g:28:7: ( 'go to' )
            // InternalSCT.g:28:9: 'go to'
            {
            match("go to"); 


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
            // InternalSCT.g:29:7: ( 'abort to' )
            // InternalSCT.g:29:9: 'abort to'
            {
            match("abort to"); 


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
            // InternalSCT.g:30:7: ( 'join to' )
            // InternalSCT.g:30:9: 'join to'
            {
            match("join to"); 


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
            // InternalSCT.g:31:7: ( 'reset' )
            // InternalSCT.g:31:9: 'reset'
            {
            match("reset"); 


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
            // InternalSCT.g:32:7: ( 'shallow history' )
            // InternalSCT.g:32:9: 'shallow history'
            {
            match("shallow history"); 


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
            // InternalSCT.g:33:7: ( 'history' )
            // InternalSCT.g:33:9: 'history'
            {
            match("history"); 


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
            // InternalSCT.g:34:7: ( '=' )
            // InternalSCT.g:34:9: '='
            {
            match('='); 

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
            // InternalSCT.g:35:7: ( '+=' )
            // InternalSCT.g:35:9: '+='
            {
            match("+="); 


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
            // InternalSCT.g:36:7: ( '-=' )
            // InternalSCT.g:36:9: '-='
            {
            match("-="); 


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
            // InternalSCT.g:37:7: ( '*=' )
            // InternalSCT.g:37:9: '*='
            {
            match("*="); 


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
            // InternalSCT.g:38:7: ( '/=' )
            // InternalSCT.g:38:9: '/='
            {
            match("/="); 


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
            // InternalSCT.g:39:7: ( '%=' )
            // InternalSCT.g:39:9: '%='
            {
            match("%="); 


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
            // InternalSCT.g:40:7: ( '&=' )
            // InternalSCT.g:40:9: '&='
            {
            match("&="); 


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
            // InternalSCT.g:41:7: ( '|=' )
            // InternalSCT.g:41:9: '|='
            {
            match("|="); 


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
            // InternalSCT.g:42:7: ( '^=' )
            // InternalSCT.g:42:9: '^='
            {
            match("^="); 


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
            // InternalSCT.g:43:7: ( '++' )
            // InternalSCT.g:43:9: '++'
            {
            match("++"); 


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
            // InternalSCT.g:44:7: ( '--' )
            // InternalSCT.g:44:9: '--'
            {
            match("--"); 


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
            // InternalSCT.g:45:7: ( '==' )
            // InternalSCT.g:45:9: '=='
            {
            match("=="); 


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
            // InternalSCT.g:46:7: ( '<' )
            // InternalSCT.g:46:9: '<'
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
            // InternalSCT.g:47:7: ( '<=' )
            // InternalSCT.g:47:9: '<='
            {
            match("<="); 


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
            // InternalSCT.g:48:7: ( '>' )
            // InternalSCT.g:48:9: '>'
            {
            match('>'); 

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
            // InternalSCT.g:49:7: ( '>=' )
            // InternalSCT.g:49:9: '>='
            {
            match(">="); 


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
            // InternalSCT.g:50:7: ( '!=' )
            // InternalSCT.g:50:9: '!='
            {
            match("!="); 


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
            // InternalSCT.g:51:7: ( 'pure' )
            // InternalSCT.g:51:9: 'pure'
            {
            match("pure"); 


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
            // InternalSCT.g:52:7: ( 'bool' )
            // InternalSCT.g:52:9: 'bool'
            {
            match("bool"); 


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
            // InternalSCT.g:53:7: ( 'unsigned' )
            // InternalSCT.g:53:9: 'unsigned'
            {
            match("unsigned"); 


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
            // InternalSCT.g:54:7: ( 'int' )
            // InternalSCT.g:54:9: 'int'
            {
            match("int"); 


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
            // InternalSCT.g:55:7: ( 'float' )
            // InternalSCT.g:55:9: 'float'
            {
            match("float"); 


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
            // InternalSCT.g:56:7: ( 'string' )
            // InternalSCT.g:56:9: 'string'
            {
            match("string"); 


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
            // InternalSCT.g:57:7: ( 'host' )
            // InternalSCT.g:57:9: 'host'
            {
            match("host"); 


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
            // InternalSCT.g:58:7: ( 'none' )
            // InternalSCT.g:58:9: 'none'
            {
            match("none"); 


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
            // InternalSCT.g:59:7: ( 'max' )
            // InternalSCT.g:59:9: 'max'
            {
            match("max"); 


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
            // InternalSCT.g:60:7: ( 'min' )
            // InternalSCT.g:60:9: 'min'
            {
            match("min"); 


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
            // InternalSCT.g:61:7: ( '#' )
            // InternalSCT.g:61:9: '#'
            {
            match('#'); 

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
            // InternalSCT.g:62:7: ( ',' )
            // InternalSCT.g:62:9: ','
            {
            match(','); 

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
            // InternalSCT.g:63:7: ( 'scchart' )
            // InternalSCT.g:63:9: 'scchart'
            {
            match("scchart"); 


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
            // InternalSCT.g:64:7: ( '{' )
            // InternalSCT.g:64:9: '{'
            {
            match('{'); 

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
            // InternalSCT.g:65:7: ( '}' )
            // InternalSCT.g:65:9: '}'
            {
            match('}'); 

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
            // InternalSCT.g:66:7: ( 'state' )
            // InternalSCT.g:66:9: 'state'
            {
            match("state"); 


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
            // InternalSCT.g:67:7: ( 'is' )
            // InternalSCT.g:67:9: 'is'
            {
            match("is"); 


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
            // InternalSCT.g:68:7: ( '(' )
            // InternalSCT.g:68:9: '('
            {
            match('('); 

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
            // InternalSCT.g:69:7: ( ')' )
            // InternalSCT.g:69:9: ')'
            {
            match(')'); 

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
            // InternalSCT.g:70:7: ( 'if' )
            // InternalSCT.g:70:9: 'if'
            {
            match("if"); 


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
            // InternalSCT.g:71:7: ( 'do' )
            // InternalSCT.g:71:9: 'do'
            {
            match("do"); 


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
            // InternalSCT.g:72:7: ( ';' )
            // InternalSCT.g:72:9: ';'
            {
            match(';'); 

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
            // InternalSCT.g:73:7: ( 'entry' )
            // InternalSCT.g:73:9: 'entry'
            {
            match("entry"); 


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
            // InternalSCT.g:74:7: ( 'during' )
            // InternalSCT.g:74:9: 'during'
            {
            match("during"); 


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
            // InternalSCT.g:75:7: ( 'exit' )
            // InternalSCT.g:75:9: 'exit'
            {
            match("exit"); 


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
            // InternalSCT.g:76:7: ( 'suspend' )
            // InternalSCT.g:76:9: 'suspend'
            {
            match("suspend"); 


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
            // InternalSCT.g:77:7: ( 'iterate' )
            // InternalSCT.g:77:9: 'iterate'
            {
            match("iterate"); 


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
            // InternalSCT.g:78:7: ( 'init' )
            // InternalSCT.g:78:9: 'init'
            {
            match("init"); 


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
            // InternalSCT.g:79:7: ( 'final' )
            // InternalSCT.g:79:9: 'final'
            {
            match("final"); 


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
            // InternalSCT.g:80:7: ( 'region' )
            // InternalSCT.g:80:9: 'region'
            {
            match("region"); 


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
            // InternalSCT.g:81:7: ( ':' )
            // InternalSCT.g:81:9: ':'
            {
            match(':'); 

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
            // InternalSCT.g:82:7: ( 'dataflow' )
            // InternalSCT.g:82:9: 'dataflow'
            {
            match("dataflow"); 


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
            // InternalSCT.g:83:7: ( 'scope' )
            // InternalSCT.g:83:9: 'scope'
            {
            match("scope"); 


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
            // InternalSCT.g:84:7: ( 'expression' )
            // InternalSCT.g:84:9: 'expression'
            {
            match("expression"); 


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
            // InternalSCT.g:85:7: ( 'ref' )
            // InternalSCT.g:85:9: 'ref'
            {
            match("ref"); 


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
            // InternalSCT.g:86:7: ( 'extern' )
            // InternalSCT.g:86:9: 'extern'
            {
            match("extern"); 


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
            // InternalSCT.g:87:7: ( '[' )
            // InternalSCT.g:87:9: '['
            {
            match('['); 

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
            // InternalSCT.g:88:7: ( ']' )
            // InternalSCT.g:88:9: ']'
            {
            match(']'); 

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
            // InternalSCT.g:89:7: ( 'combine' )
            // InternalSCT.g:89:9: 'combine'
            {
            match("combine"); 


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
            // InternalSCT.g:90:7: ( '\\'' )
            // InternalSCT.g:90:9: '\\''
            {
            match('\''); 

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
            // InternalSCT.g:91:7: ( '.' )
            // InternalSCT.g:91:9: '.'
            {
            match('.'); 

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
            // InternalSCT.g:92:7: ( '@' )
            // InternalSCT.g:92:9: '@'
            {
            match('@'); 

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
            // InternalSCT.g:93:7: ( 'version' )
            // InternalSCT.g:93:9: 'version'
            {
            match("version"); 


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
            // InternalSCT.g:94:7: ( 'director' )
            // InternalSCT.g:94:9: 'director'
            {
            match("director"); 


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
            // InternalSCT.g:95:8: ( 'import' )
            // InternalSCT.g:95:10: 'import'
            {
            match("import"); 


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
            // InternalSCT.g:96:8: ( 'symbols' )
            // InternalSCT.g:96:10: 'symbols'
            {
            match("symbols"); 


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
            // InternalSCT.g:97:8: ( 'symbol' )
            // InternalSCT.g:97:10: 'symbol'
            {
            match("symbol"); 


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
            // InternalSCT.g:98:8: ( 'initial' )
            // InternalSCT.g:98:10: 'initial'
            {
            match("initial"); 


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
            // InternalSCT.g:99:8: ( 'violation' )
            // InternalSCT.g:99:10: 'violation'
            {
            match("violation"); 


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
            // InternalSCT.g:100:8: ( 'connector' )
            // InternalSCT.g:100:10: 'connector'
            {
            match("connector"); 


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
            // InternalSCT.g:101:8: ( 'immediate' )
            // InternalSCT.g:101:10: 'immediate'
            {
            match("immediate"); 


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
            // InternalSCT.g:102:8: ( 'deferred' )
            // InternalSCT.g:102:10: 'deferred'
            {
            match("deferred"); 


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
            // InternalSCT.g:103:8: ( 'weak' )
            // InternalSCT.g:103:10: 'weak'
            {
            match("weak"); 


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
            // InternalSCT.g:104:8: ( 'const' )
            // InternalSCT.g:104:10: 'const'
            {
            match("const"); 


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
            // InternalSCT.g:105:8: ( 'input' )
            // InternalSCT.g:105:10: 'input'
            {
            match("input"); 


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
            // InternalSCT.g:106:8: ( 'output' )
            // InternalSCT.g:106:10: 'output'
            {
            match("output"); 


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
            // InternalSCT.g:107:8: ( 'static' )
            // InternalSCT.g:107:10: 'static'
            {
            match("static"); 


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
            // InternalSCT.g:108:8: ( 'signal' )
            // InternalSCT.g:108:10: 'signal'
            {
            match("signal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "RULE_HOSTCODE"
    public final void mRULE_HOSTCODE() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSCT.g:23463:15: ( '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`' )
            // InternalSCT.g:23463:17: '`' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )* '`'
            {
            match('`'); 
            // InternalSCT.g:23463:21: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '`' ) ) )*
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
            	    // InternalSCT.g:23463:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalSCT.g:23463:63: ~ ( ( '\\\\' | '`' ) )
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
            // InternalSCT.g:23465:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalSCT.g:23465:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalSCT.g:23465:33: ( options {greedy=false; } : . )*
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
            	    // InternalSCT.g:23465:61: .
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
            // InternalSCT.g:23467:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalSCT.g:23467:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSCT.g:23467:31: ( options {greedy=false; } : . )*
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
            	    // InternalSCT.g:23467:59: .
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
            // InternalSCT.g:23469:22: ( '0' .. '9' )
            // InternalSCT.g:23469:24: '0' .. '9'
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
            // InternalSCT.g:23471:10: ( ( RULE_NUMBER )+ )
            // InternalSCT.g:23471:12: ( RULE_NUMBER )+
            {
            // InternalSCT.g:23471:12: ( RULE_NUMBER )+
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
            	    // InternalSCT.g:23471:12: RULE_NUMBER
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
            // InternalSCT.g:23473:12: ( ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' ) )
            // InternalSCT.g:23473:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            {
            // InternalSCT.g:23473:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalSCT.g:23473:15: ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // InternalSCT.g:23473:15: ( RULE_NUMBER )+
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
                    	    // InternalSCT.g:23473:15: RULE_NUMBER
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
                    // InternalSCT.g:23473:32: ( RULE_NUMBER )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSCT.g:23473:32: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalSCT.g:23473:45: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSCT.g:23473:46: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalSCT.g:23473:56: ( '+' | '-' )?
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

                            // InternalSCT.g:23473:67: ( RULE_NUMBER )+
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
                            	    // InternalSCT.g:23473:67: RULE_NUMBER
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

                    // InternalSCT.g:23473:82: ( 'f' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='f') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSCT.g:23473:82: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalSCT.g:23473:87: ( RULE_NUMBER )+ 'f'
                    {
                    // InternalSCT.g:23473:87: ( RULE_NUMBER )+
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
                    	    // InternalSCT.g:23473:87: RULE_NUMBER
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
            // InternalSCT.g:23475:14: ( ( 'true' | 'false' ) )
            // InternalSCT.g:23475:16: ( 'true' | 'false' )
            {
            // InternalSCT.g:23475:16: ( 'true' | 'false' )
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
                    // InternalSCT.g:23475:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalSCT.g:23475:24: 'false'
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
            // InternalSCT.g:23477:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalSCT.g:23477:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalSCT.g:23477:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalSCT.g:23477:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalSCT.g:23477:61: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalSCT.g:23479:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSCT.g:23479:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSCT.g:23479:11: ( '^' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='^') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSCT.g:23479:11: '^'
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

            // InternalSCT.g:23479:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalSCT.g:23481:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSCT.g:23481:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSCT.g:23481:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSCT.g:23481:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSCT.g:23481:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSCT.g:23481:41: ( '\\r' )? '\\n'
                    {
                    // InternalSCT.g:23481:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalSCT.g:23481:41: '\\r'
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
            // InternalSCT.g:23483:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSCT.g:23483:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSCT.g:23483:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalSCT.g:23485:16: ( . )
            // InternalSCT.g:23485:18: .
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
        // InternalSCT.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=109;
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
                // InternalSCT.g:1:584: T__110
                {
                mT__110(); 

                }
                break;
            case 96 :
                // InternalSCT.g:1:591: T__111
                {
                mT__111(); 

                }
                break;
            case 97 :
                // InternalSCT.g:1:598: T__112
                {
                mT__112(); 

                }
                break;
            case 98 :
                // InternalSCT.g:1:605: T__113
                {
                mT__113(); 

                }
                break;
            case 99 :
                // InternalSCT.g:1:612: RULE_HOSTCODE
                {
                mRULE_HOSTCODE(); 

                }
                break;
            case 100 :
                // InternalSCT.g:1:626: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 101 :
                // InternalSCT.g:1:650: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 102 :
                // InternalSCT.g:1:666: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 103 :
                // InternalSCT.g:1:675: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 104 :
                // InternalSCT.g:1:686: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 105 :
                // InternalSCT.g:1:699: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 106 :
                // InternalSCT.g:1:711: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 107 :
                // InternalSCT.g:1:719: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 108 :
                // InternalSCT.g:1:735: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 109 :
                // InternalSCT.g:1:743: RULE_ANY_OTHER
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
            return "23473:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\1\70\1\73\1\76\1\100\1\103\1\106\1\110\1\112\1\116\3\70\1\125\6\70\1\143\1\65\1\146\1\150\6\70\5\uffff\1\70\1\uffff\1\70\3\uffff\1\70\3\uffff\2\70\1\65\1\u008d\1\70\1\65\3\uffff\2\70\27\uffff\5\70\2\uffff\14\70\7\uffff\3\70\1\u00b3\1\u00b4\10\70\5\uffff\1\u00be\4\70\1\uffff\2\70\3\uffff\1\70\3\uffff\2\70\2\uffff\1\u008d\1\uffff\1\70\2\uffff\1\u00cc\1\70\2\uffff\1\u00ce\2\70\1\u00d1\1\u00d2\2\70\1\uffff\4\70\1\u00d9\14\70\1\u00e6\2\70\2\uffff\7\70\1\u00f0\1\u00f1\1\uffff\15\70\1\uffff\1\u0100\1\uffff\2\70\2\uffff\6\70\1\uffff\11\70\1\u0113\1\u0114\1\70\1\uffff\1\u0117\7\70\1\u011f\2\uffff\5\70\1\u0125\5\70\1\u012b\1\70\1\u012d\1\uffff\5\70\1\uffff\1\u0133\3\70\1\u0137\2\70\1\u013a\4\70\2\uffff\2\70\1\uffff\1\u0141\3\70\1\u0145\1\u0146\1\u012d\1\uffff\4\70\1\u014b\1\uffff\4\70\1\u0150\1\uffff\1\70\1\uffff\4\70\2\uffff\1\u0156\1\70\1\u0158\1\uffff\1\u0159\1\70\1\uffff\1\70\1\u015d\1\u015e\3\70\1\uffff\1\70\1\u0163\1\70\2\uffff\1\u0165\3\70\1\uffff\1\70\1\u016a\2\70\1\uffff\1\u016d\1\u016e\3\70\1\uffff\1\70\2\uffff\1\u0173\1\u0174\1\u0175\2\uffff\1\u0176\1\70\1\u0178\1\u0179\1\uffff\1\70\1\uffff\4\70\1\uffff\1\u017f\1\70\2\uffff\1\70\1\u0182\1\u0183\5\uffff\1\u0184\2\uffff\1\70\1\u0186\1\u0187\1\u0188\1\70\1\uffff\1\70\1\u018b\3\uffff\1\u018c\3\uffff\1\70\1\u018e\2\uffff\1\u018f\2\uffff";
    static final String DFA21_eofS =
        "\u0190\uffff";
    static final String DFA21_minS =
        "\1\0\1\162\1\75\1\46\1\75\1\53\1\55\2\75\1\52\1\141\1\103\1\156\1\51\1\157\1\142\1\157\1\145\1\143\1\151\4\75\1\157\1\156\1\146\1\141\1\157\1\141\5\uffff\1\141\1\uffff\1\156\3\uffff\1\157\3\uffff\1\145\1\165\1\0\1\56\1\162\1\0\3\uffff\1\145\1\162\24\uffff\1\0\2\uffff\1\154\1\162\1\157\1\103\1\146\2\uffff\1\40\1\157\1\151\1\146\2\141\1\143\1\163\1\155\1\147\2\163\7\uffff\1\157\1\163\1\151\2\60\1\145\1\155\1\157\1\156\1\154\1\156\1\170\1\156\5\uffff\1\60\1\162\1\164\1\162\1\146\1\uffff\1\164\1\151\3\uffff\1\155\3\uffff\1\141\1\164\2\uffff\1\56\1\uffff\1\165\2\uffff\1\60\1\145\2\uffff\1\60\1\163\1\154\2\60\1\150\1\157\1\uffff\1\162\1\156\1\145\1\151\1\60\1\154\1\151\1\164\1\150\2\160\1\142\1\156\2\164\1\154\1\151\1\60\1\164\1\165\2\uffff\1\162\1\157\1\145\2\141\1\163\1\145\2\60\1\uffff\1\151\1\141\2\145\1\162\1\164\1\162\1\145\1\142\1\156\1\153\1\160\1\145\1\uffff\1\60\1\uffff\1\151\1\141\2\uffff\1\141\1\162\1\164\1\40\1\164\1\157\1\uffff\1\154\1\156\1\145\1\141\2\145\1\157\1\141\1\157\2\60\1\147\1\uffff\1\60\1\164\1\141\1\162\1\144\1\164\1\154\1\145\1\60\2\uffff\1\156\1\146\1\143\1\162\1\171\1\60\1\145\1\162\1\151\1\145\1\164\1\60\1\165\1\60\1\uffff\1\157\1\164\1\162\1\143\1\40\1\uffff\1\60\1\156\1\157\1\147\1\60\1\143\1\162\1\60\1\156\2\154\1\162\2\uffff\1\156\1\141\1\uffff\1\60\2\164\1\151\3\60\1\uffff\1\147\1\154\1\164\1\162\1\60\1\uffff\1\163\2\156\1\143\1\60\1\uffff\1\164\1\uffff\1\156\1\151\1\164\1\145\2\uffff\1\60\1\167\1\60\1\uffff\1\60\1\164\1\uffff\1\144\2\60\1\171\1\145\1\154\1\uffff\1\145\1\60\1\141\2\uffff\1\60\2\157\1\145\1\uffff\1\163\1\60\1\145\1\164\1\uffff\2\60\1\157\1\163\1\162\1\uffff\1\40\2\uffff\3\60\2\uffff\1\60\1\144\2\60\1\uffff\1\164\1\uffff\1\167\1\162\1\144\1\151\1\uffff\1\60\1\157\2\uffff\1\156\2\60\5\uffff\1\60\2\uffff\1\145\3\60\1\157\1\uffff\1\162\1\60\3\uffff\1\60\3\uffff\1\156\1\60\2\uffff\1\60\2\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\165\1\174\7\75\1\151\1\103\1\156\1\51\1\157\1\142\1\157\1\145\1\171\1\157\1\75\1\172\2\75\1\157\1\156\1\164\1\154\1\157\1\151\5\uffff\1\165\1\uffff\1\170\3\uffff\1\157\3\uffff\1\145\1\165\1\uffff\1\146\1\162\1\uffff\3\uffff\1\145\1\162\24\uffff\1\uffff\2\uffff\1\154\1\162\1\157\1\130\1\146\2\uffff\1\40\1\157\1\151\1\163\1\141\1\162\1\157\1\163\1\155\1\147\2\163\7\uffff\1\157\1\163\1\164\2\172\1\145\1\160\1\157\1\156\1\154\1\156\1\170\1\156\5\uffff\1\172\1\162\1\164\1\162\1\146\1\uffff\2\164\3\uffff\1\156\3\uffff\1\141\1\164\2\uffff\1\146\1\uffff\1\165\2\uffff\1\172\1\145\2\uffff\1\172\1\163\1\154\2\172\1\150\1\157\1\uffff\1\162\1\156\1\145\1\151\1\172\1\154\1\151\1\164\1\150\2\160\1\142\1\156\2\164\1\154\1\151\1\172\1\164\1\165\2\uffff\1\162\1\157\1\145\2\141\1\163\1\145\2\172\1\uffff\1\151\1\141\2\145\1\162\1\164\1\162\1\145\1\142\1\163\1\153\1\160\1\145\1\uffff\1\172\1\uffff\1\151\1\141\2\uffff\1\141\1\162\1\164\1\40\1\164\1\157\1\uffff\1\154\1\156\1\151\1\141\2\145\1\157\1\141\1\157\2\172\1\147\1\uffff\1\172\1\164\1\141\1\162\1\144\1\164\1\154\1\145\1\172\2\uffff\1\156\1\146\1\143\1\162\1\171\1\172\1\145\1\162\1\151\1\145\1\164\1\172\1\165\1\172\1\uffff\1\157\1\164\1\162\1\143\1\40\1\uffff\1\172\1\156\1\157\1\147\1\172\1\143\1\162\1\172\1\156\2\154\1\162\2\uffff\1\156\1\141\1\uffff\1\172\2\164\1\151\3\172\1\uffff\1\147\1\154\1\164\1\162\1\172\1\uffff\1\163\2\156\1\143\1\172\1\uffff\1\164\1\uffff\1\156\1\151\1\164\1\145\2\uffff\1\172\1\167\1\172\1\uffff\1\172\1\164\1\uffff\1\144\2\172\1\171\1\145\1\154\1\uffff\1\145\1\172\1\141\2\uffff\1\172\2\157\1\145\1\uffff\1\163\1\172\1\145\1\164\1\uffff\2\172\1\157\1\163\1\162\1\uffff\1\40\2\uffff\3\172\2\uffff\1\172\1\144\2\172\1\uffff\1\164\1\uffff\1\167\1\162\1\144\1\151\1\uffff\1\172\1\157\2\uffff\1\156\2\172\5\uffff\1\172\2\uffff\1\145\3\172\1\157\1\uffff\1\162\1\172\3\uffff\1\172\3\uffff\1\156\1\172\2\uffff\1\172\2\uffff";
    static final String DFA21_acceptS =
        "\36\uffff\1\63\1\64\1\66\1\67\1\73\1\uffff\1\76\1\uffff\1\107\1\115\1\116\1\uffff\1\120\1\121\1\122\6\uffff\1\152\1\154\1\155\2\uffff\1\152\1\13\1\37\1\2\1\14\1\36\1\3\1\50\1\4\1\31\1\41\1\5\1\32\1\42\1\6\1\33\1\7\1\35\1\10\1\34\1\uffff\1\153\1\11\5\uffff\1\21\1\72\14\uffff\1\43\1\30\1\40\1\45\1\44\1\47\1\46\15\uffff\1\63\1\64\1\66\1\67\1\73\5\uffff\1\76\2\uffff\1\107\1\115\1\116\1\uffff\1\120\1\121\1\122\2\uffff\1\143\1\146\1\uffff\1\147\1\uffff\1\151\1\154\2\uffff\1\144\1\145\7\uffff\1\22\24\uffff\1\71\1\74\11\uffff\1\75\15\uffff\1\1\1\uffff\1\12\2\uffff\1\15\1\16\6\uffff\1\113\14\uffff\1\54\11\uffff\1\61\1\62\16\uffff\1\51\5\uffff\1\24\14\uffff\1\57\1\52\2\uffff\1\104\7\uffff\1\60\5\uffff\1\101\5\uffff\1\135\1\uffff\1\150\4\uffff\1\23\1\25\3\uffff\1\70\2\uffff\1\111\6\uffff\1\137\3\uffff\1\55\1\105\4\uffff\1\77\4\uffff\1\136\5\uffff\1\106\1\uffff\1\56\1\141\3\uffff\1\127\1\142\4\uffff\1\125\1\uffff\1\100\4\uffff\1\114\2\uffff\1\140\1\123\3\uffff\1\26\1\65\1\102\1\126\1\27\1\uffff\1\130\1\103\5\uffff\1\117\2\uffff\1\17\1\20\1\53\1\uffff\1\110\1\124\1\134\2\uffff\1\131\1\133\1\uffff\1\132\1\112";
    static final String DFA21_specialS =
        "\1\2\56\uffff\1\1\2\uffff\1\0\31\uffff\1\3\u0143\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\65\2\64\2\65\1\64\22\65\1\64\1\4\1\62\1\36\1\65\1\10\1\3\1\52\1\15\1\42\1\7\1\5\1\37\1\6\1\53\1\11\12\60\1\46\1\44\1\26\1\24\1\27\1\65\1\54\4\63\1\14\15\63\1\13\7\63\1\47\1\65\1\50\1\25\1\63\1\57\1\17\1\30\1\51\1\43\1\45\1\33\1\16\1\23\1\32\1\20\2\63\1\35\1\34\1\56\1\1\1\63\1\21\1\22\1\61\1\31\1\12\1\55\3\63\1\40\1\2\1\41\uff82\65",
            "\1\66\2\uffff\1\67",
            "\1\72\76\uffff\1\71",
            "\1\74\26\uffff\1\75",
            "\1\77",
            "\1\102\21\uffff\1\101",
            "\1\105\17\uffff\1\104",
            "\1\107",
            "\1\111",
            "\1\114\4\uffff\1\115\15\uffff\1\113",
            "\1\117\3\uffff\1\120\3\uffff\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\134\4\uffff\1\132\1\137\12\uffff\1\133\1\135\3\uffff\1\136",
            "\1\140\5\uffff\1\141",
            "\1\142",
            "\1\144\3\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\145",
            "\1\147",
            "\1\151",
            "\1\152",
            "\1\155\6\uffff\1\157\1\153\4\uffff\1\154\1\156",
            "\1\162\7\uffff\1\161\2\uffff\1\160",
            "\1\163",
            "\1\164\7\uffff\1\165",
            "",
            "",
            "",
            "",
            "",
            "\1\175\3\uffff\1\177\3\uffff\1\176\5\uffff\1\173\5\uffff\1\174",
            "",
            "\1\u0081\11\uffff\1\u0082",
            "",
            "",
            "",
            "\1\u0086",
            "",
            "",
            "",
            "\1\u008a",
            "\1\u008b",
            "\0\u008c",
            "\1\u008f\1\uffff\12\u008e\54\uffff\1\u008f",
            "\1\u0090",
            "\0\u0091",
            "",
            "",
            "",
            "\1\u0093",
            "\1\u0094",
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
            "\52\u0096\1\u0095\uffd5\u0096",
            "",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009c\20\uffff\1\u009b\3\uffff\1\u009a",
            "\1\u009d",
            "",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a3\1\u00a2\13\uffff\1\u00a1",
            "\1\u00a4",
            "\1\u00a6\20\uffff\1\u00a5",
            "\1\u00a7\13\uffff\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b1\6\uffff\1\u00b2\3\uffff\1\u00b0",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00b5",
            "\1\u00b7\2\uffff\1\u00b6",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4\6\uffff\1\u00c5\3\uffff\1\u00c6",
            "",
            "",
            "",
            "\1\u00c7\1\u00c8",
            "",
            "",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "",
            "\1\u008f\1\uffff\12\u008e\54\uffff\1\u008f",
            "",
            "\1\u00cb",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00cd",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00cf",
            "\1\u00d0",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb\4\uffff\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u0101",
            "\1\u0102",
            "",
            "",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b\3\uffff\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0115",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u0116\21\70",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u012c",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0138",
            "\1\u0139",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "",
            "\1\u013f",
            "\1\u0140",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u0151",
            "",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0157",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u015a",
            "",
            "\1\u015b",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u015c\7\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "",
            "\1\u0162",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0164",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "",
            "\1\u0169",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u016b",
            "\1\u016c",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "",
            "\1\u0172",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0177",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u017a",
            "",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0180",
            "",
            "",
            "\1\u0181",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\1\u0185",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0189",
            "",
            "\1\u018a",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "\1\u018d",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
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
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_50 = input.LA(1);

                        s = -1;
                        if ( ((LA21_50>='\u0000' && LA21_50<='\uFFFF')) ) {s = 145;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_47 = input.LA(1);

                        s = -1;
                        if ( ((LA21_47>='\u0000' && LA21_47<='\uFFFF')) ) {s = 140;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='p') ) {s = 1;}

                        else if ( (LA21_0=='|') ) {s = 2;}

                        else if ( (LA21_0=='&') ) {s = 3;}

                        else if ( (LA21_0=='!') ) {s = 4;}

                        else if ( (LA21_0=='+') ) {s = 5;}

                        else if ( (LA21_0=='-') ) {s = 6;}

                        else if ( (LA21_0=='*') ) {s = 7;}

                        else if ( (LA21_0=='%') ) {s = 8;}

                        else if ( (LA21_0=='/') ) {s = 9;}

                        else if ( (LA21_0=='v') ) {s = 10;}

                        else if ( (LA21_0=='S') ) {s = 11;}

                        else if ( (LA21_0=='E') ) {s = 12;}

                        else if ( (LA21_0=='(') ) {s = 13;}

                        else if ( (LA21_0=='g') ) {s = 14;}

                        else if ( (LA21_0=='a') ) {s = 15;}

                        else if ( (LA21_0=='j') ) {s = 16;}

                        else if ( (LA21_0=='r') ) {s = 17;}

                        else if ( (LA21_0=='s') ) {s = 18;}

                        else if ( (LA21_0=='h') ) {s = 19;}

                        else if ( (LA21_0=='=') ) {s = 20;}

                        else if ( (LA21_0=='^') ) {s = 21;}

                        else if ( (LA21_0=='<') ) {s = 22;}

                        else if ( (LA21_0=='>') ) {s = 23;}

                        else if ( (LA21_0=='b') ) {s = 24;}

                        else if ( (LA21_0=='u') ) {s = 25;}

                        else if ( (LA21_0=='i') ) {s = 26;}

                        else if ( (LA21_0=='f') ) {s = 27;}

                        else if ( (LA21_0=='n') ) {s = 28;}

                        else if ( (LA21_0=='m') ) {s = 29;}

                        else if ( (LA21_0=='#') ) {s = 30;}

                        else if ( (LA21_0==',') ) {s = 31;}

                        else if ( (LA21_0=='{') ) {s = 32;}

                        else if ( (LA21_0=='}') ) {s = 33;}

                        else if ( (LA21_0==')') ) {s = 34;}

                        else if ( (LA21_0=='d') ) {s = 35;}

                        else if ( (LA21_0==';') ) {s = 36;}

                        else if ( (LA21_0=='e') ) {s = 37;}

                        else if ( (LA21_0==':') ) {s = 38;}

                        else if ( (LA21_0=='[') ) {s = 39;}

                        else if ( (LA21_0==']') ) {s = 40;}

                        else if ( (LA21_0=='c') ) {s = 41;}

                        else if ( (LA21_0=='\'') ) {s = 42;}

                        else if ( (LA21_0=='.') ) {s = 43;}

                        else if ( (LA21_0=='@') ) {s = 44;}

                        else if ( (LA21_0=='w') ) {s = 45;}

                        else if ( (LA21_0=='o') ) {s = 46;}

                        else if ( (LA21_0=='`') ) {s = 47;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 48;}

                        else if ( (LA21_0=='t') ) {s = 49;}

                        else if ( (LA21_0=='\"') ) {s = 50;}

                        else if ( ((LA21_0>='A' && LA21_0<='D')||(LA21_0>='F' && LA21_0<='R')||(LA21_0>='T' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='k' && LA21_0<='l')||LA21_0=='q'||(LA21_0>='x' && LA21_0<='z')) ) {s = 51;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 52;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='$'||LA21_0=='?'||LA21_0=='\\'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_76 = input.LA(1);

                        s = -1;
                        if ( (LA21_76=='*') ) {s = 149;}

                        else if ( ((LA21_76>='\u0000' && LA21_76<=')')||(LA21_76>='+' && LA21_76<='\uFFFF')) ) {s = 150;}

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