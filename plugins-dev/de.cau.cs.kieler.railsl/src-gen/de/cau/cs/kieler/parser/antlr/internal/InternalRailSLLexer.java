package de.cau.cs.kieler.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRailSLLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalRailSLLexer() {;} 
    public InternalRailSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRailSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRailSL.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:11:7: ( 'Start:' )
            // InternalRailSL.g:11:9: 'Start:'
            {
            match("Start:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:12:7: ( 'End.' )
            // InternalRailSL.g:12:9: 'End.'
            {
            match("End."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:13:7: ( 'Loop.' )
            // InternalRailSL.g:13:9: 'Loop.'
            {
            match("Loop."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:14:7: ( 'Set track' )
            // InternalRailSL.g:14:9: 'Set track'
            {
            match("Set track"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:15:7: ( ',' )
            // InternalRailSL.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:16:7: ( 'to' )
            // InternalRailSL.g:16:9: 'to'
            {
            match("to"); 


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
            // InternalRailSL.g:17:7: ( '.' )
            // InternalRailSL.g:17:9: '.'
            {
            match('.'); 

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
            // InternalRailSL.g:18:7: ( 'full' )
            // InternalRailSL.g:18:9: 'full'
            {
            match("full"); 


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
            // InternalRailSL.g:19:7: ( 'slow' )
            // InternalRailSL.g:19:9: 'slow'
            {
            match("slow"); 


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
            // InternalRailSL.g:20:7: ( 'reverse' )
            // InternalRailSL.g:20:9: 'reverse'
            {
            match("reverse"); 


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
            // InternalRailSL.g:21:7: ( 'stop' )
            // InternalRailSL.g:21:9: 'stop'
            {
            match("stop"); 


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
            // InternalRailSL.g:22:7: ( 'Set point' )
            // InternalRailSL.g:22:9: 'Set point'
            {
            match("Set point"); 


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
            // InternalRailSL.g:23:7: ( 'straight' )
            // InternalRailSL.g:23:9: 'straight'
            {
            match("straight"); 


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
            // InternalRailSL.g:24:7: ( 'branch' )
            // InternalRailSL.g:24:9: 'branch'
            {
            match("branch"); 


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
            // InternalRailSL.g:25:7: ( 'Wait for' )
            // InternalRailSL.g:25:9: 'Wait for'
            {
            match("Wait for"); 


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
            // InternalRailSL.g:26:7: ( 'seconds.' )
            // InternalRailSL.g:26:9: 'seconds.'
            {
            match("seconds."); 


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
            // InternalRailSL.g:27:7: ( 'Reach' )
            // InternalRailSL.g:27:9: 'Reach'
            {
            match("Reach"); 


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
            // InternalRailSL.g:28:7: ( 'Pass' )
            // InternalRailSL.g:28:9: 'Pass'
            {
            match("Pass"); 


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
            // InternalRailSL.g:29:7: ( 'contact of' )
            // InternalRailSL.g:29:9: 'contact of'
            {
            match("contact of"); 


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
            // InternalRailSL.g:30:7: ( 'Open' )
            // InternalRailSL.g:30:9: 'Open'
            {
            match("Open"); 


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
            // InternalRailSL.g:31:7: ( 'Close' )
            // InternalRailSL.g:31:9: 'Close'
            {
            match("Close"); 


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
            // InternalRailSL.g:32:7: ( 'crossing.' )
            // InternalRailSL.g:32:9: 'crossing.'
            {
            match("crossing."); 


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
            // InternalRailSL.g:33:7: ( 'Turn light' )
            // InternalRailSL.g:33:9: 'Turn light'
            {
            match("Turn light"); 


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
            // InternalRailSL.g:34:7: ( 'on' )
            // InternalRailSL.g:34:9: 'on'
            {
            match("on"); 


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
            // InternalRailSL.g:35:7: ( 'off' )
            // InternalRailSL.g:35:9: 'off'
            {
            match("off"); 


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
            // InternalRailSL.g:36:7: ( 'Branch:' )
            // InternalRailSL.g:36:9: 'Branch:'
            {
            match("Branch:"); 


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
            // InternalRailSL.g:37:7: ( 'If' )
            // InternalRailSL.g:37:9: 'If'
            {
            match("If"); 


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
            // InternalRailSL.g:38:7: ( 'is reached first, do' )
            // InternalRailSL.g:38:9: 'is reached first, do'
            {
            match("is reached first, do"); 


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
            // InternalRailSL.g:39:7: ( 'first' )
            // InternalRailSL.g:39:9: 'first'
            {
            match("first"); 


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
            // InternalRailSL.g:40:7: ( 'second' )
            // InternalRailSL.g:40:9: 'second'
            {
            match("second"); 


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
            // InternalRailSL.g:41:7: ( 'KH_ST_0' )
            // InternalRailSL.g:41:9: 'KH_ST_0'
            {
            match("KH_ST_0"); 


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
            // InternalRailSL.g:42:7: ( 'KH_ST_1' )
            // InternalRailSL.g:42:9: 'KH_ST_1'
            {
            match("KH_ST_1"); 


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
            // InternalRailSL.g:43:7: ( 'KH_ST_2' )
            // InternalRailSL.g:43:9: 'KH_ST_2'
            {
            match("KH_ST_2"); 


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
            // InternalRailSL.g:44:7: ( 'KH_ST_3' )
            // InternalRailSL.g:44:9: 'KH_ST_3'
            {
            match("KH_ST_3"); 


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
            // InternalRailSL.g:45:7: ( 'KH_ST_4' )
            // InternalRailSL.g:45:9: 'KH_ST_4'
            {
            match("KH_ST_4"); 


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
            // InternalRailSL.g:46:7: ( 'KH_ST_5' )
            // InternalRailSL.g:46:9: 'KH_ST_5'
            {
            match("KH_ST_5"); 


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
            // InternalRailSL.g:47:7: ( 'KH_ST_6' )
            // InternalRailSL.g:47:9: 'KH_ST_6'
            {
            match("KH_ST_6"); 


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
            // InternalRailSL.g:48:7: ( 'KH_LN_0' )
            // InternalRailSL.g:48:9: 'KH_LN_0'
            {
            match("KH_LN_0"); 


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
            // InternalRailSL.g:49:7: ( 'KH_LN_1' )
            // InternalRailSL.g:49:9: 'KH_LN_1'
            {
            match("KH_LN_1"); 


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
            // InternalRailSL.g:50:7: ( 'KH_LN_2' )
            // InternalRailSL.g:50:9: 'KH_LN_2'
            {
            match("KH_LN_2"); 


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
            // InternalRailSL.g:51:7: ( 'KH_LN_3' )
            // InternalRailSL.g:51:9: 'KH_LN_3'
            {
            match("KH_LN_3"); 


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
            // InternalRailSL.g:52:7: ( 'KH_LN_4' )
            // InternalRailSL.g:52:9: 'KH_LN_4'
            {
            match("KH_LN_4"); 


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
            // InternalRailSL.g:53:7: ( 'KH_LN_5' )
            // InternalRailSL.g:53:9: 'KH_LN_5'
            {
            match("KH_LN_5"); 


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
            // InternalRailSL.g:54:7: ( 'KH_LN_6' )
            // InternalRailSL.g:54:9: 'KH_LN_6'
            {
            match("KH_LN_6"); 


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
            // InternalRailSL.g:55:7: ( 'KH_LN_7' )
            // InternalRailSL.g:55:9: 'KH_LN_7'
            {
            match("KH_LN_7"); 


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
            // InternalRailSL.g:56:7: ( 'KH_LN_8' )
            // InternalRailSL.g:56:9: 'KH_LN_8'
            {
            match("KH_LN_8"); 


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
            // InternalRailSL.g:57:7: ( 'KIO_LN_0' )
            // InternalRailSL.g:57:9: 'KIO_LN_0'
            {
            match("KIO_LN_0"); 


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
            // InternalRailSL.g:58:7: ( 'KIO_LN_1' )
            // InternalRailSL.g:58:9: 'KIO_LN_1'
            {
            match("KIO_LN_1"); 


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
            // InternalRailSL.g:59:7: ( 'OC_ST_0' )
            // InternalRailSL.g:59:9: 'OC_ST_0'
            {
            match("OC_ST_0"); 


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
            // InternalRailSL.g:60:7: ( 'OC_ST_1' )
            // InternalRailSL.g:60:9: 'OC_ST_1'
            {
            match("OC_ST_1"); 


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
            // InternalRailSL.g:61:7: ( 'OC_ST_2' )
            // InternalRailSL.g:61:9: 'OC_ST_2'
            {
            match("OC_ST_2"); 


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
            // InternalRailSL.g:62:7: ( 'OC_ST_3' )
            // InternalRailSL.g:62:9: 'OC_ST_3'
            {
            match("OC_ST_3"); 


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
            // InternalRailSL.g:63:7: ( 'OC_ST_4' )
            // InternalRailSL.g:63:9: 'OC_ST_4'
            {
            match("OC_ST_4"); 


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
            // InternalRailSL.g:64:7: ( 'OC_LN_0' )
            // InternalRailSL.g:64:9: 'OC_LN_0'
            {
            match("OC_LN_0"); 


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
            // InternalRailSL.g:65:7: ( 'OC_LN_1' )
            // InternalRailSL.g:65:9: 'OC_LN_1'
            {
            match("OC_LN_1"); 


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
            // InternalRailSL.g:66:7: ( 'OC_LN_2' )
            // InternalRailSL.g:66:9: 'OC_LN_2'
            {
            match("OC_LN_2"); 


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
            // InternalRailSL.g:67:7: ( 'OC_LN_3' )
            // InternalRailSL.g:67:9: 'OC_LN_3'
            {
            match("OC_LN_3"); 


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
            // InternalRailSL.g:68:7: ( 'OC_LN_4' )
            // InternalRailSL.g:68:9: 'OC_LN_4'
            {
            match("OC_LN_4"); 


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
            // InternalRailSL.g:69:7: ( 'OC_LN_5' )
            // InternalRailSL.g:69:9: 'OC_LN_5'
            {
            match("OC_LN_5"); 


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
            // InternalRailSL.g:70:7: ( 'IC_ST_0' )
            // InternalRailSL.g:70:9: 'IC_ST_0'
            {
            match("IC_ST_0"); 


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
            // InternalRailSL.g:71:7: ( 'IC_ST_1' )
            // InternalRailSL.g:71:9: 'IC_ST_1'
            {
            match("IC_ST_1"); 


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
            // InternalRailSL.g:72:7: ( 'IC_ST_2' )
            // InternalRailSL.g:72:9: 'IC_ST_2'
            {
            match("IC_ST_2"); 


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
            // InternalRailSL.g:73:7: ( 'IC_ST_3' )
            // InternalRailSL.g:73:9: 'IC_ST_3'
            {
            match("IC_ST_3"); 


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
            // InternalRailSL.g:74:7: ( 'IC_ST_4' )
            // InternalRailSL.g:74:9: 'IC_ST_4'
            {
            match("IC_ST_4"); 


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
            // InternalRailSL.g:75:7: ( 'IC_LN_0' )
            // InternalRailSL.g:75:9: 'IC_LN_0'
            {
            match("IC_LN_0"); 


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
            // InternalRailSL.g:76:7: ( 'IC_LN_1' )
            // InternalRailSL.g:76:9: 'IC_LN_1'
            {
            match("IC_LN_1"); 


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
            // InternalRailSL.g:77:7: ( 'IC_LN_2' )
            // InternalRailSL.g:77:9: 'IC_LN_2'
            {
            match("IC_LN_2"); 


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
            // InternalRailSL.g:78:7: ( 'IC_LN_3' )
            // InternalRailSL.g:78:9: 'IC_LN_3'
            {
            match("IC_LN_3"); 


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
            // InternalRailSL.g:79:7: ( 'IC_LN_4' )
            // InternalRailSL.g:79:9: 'IC_LN_4'
            {
            match("IC_LN_4"); 


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
            // InternalRailSL.g:80:7: ( 'IC_LN_5' )
            // InternalRailSL.g:80:9: 'IC_LN_5'
            {
            match("IC_LN_5"); 


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
            // InternalRailSL.g:81:7: ( 'OC_JCT_0' )
            // InternalRailSL.g:81:9: 'OC_JCT_0'
            {
            match("OC_JCT_0"); 


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
            // InternalRailSL.g:82:7: ( 'IC_JCT_0' )
            // InternalRailSL.g:82:9: 'IC_JCT_0'
            {
            match("IC_JCT_0"); 


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
            // InternalRailSL.g:83:7: ( 'OI_LN_0' )
            // InternalRailSL.g:83:9: 'OI_LN_0'
            {
            match("OI_LN_0"); 


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
            // InternalRailSL.g:84:7: ( 'OI_LN_1' )
            // InternalRailSL.g:84:9: 'OI_LN_1'
            {
            match("OI_LN_1"); 


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
            // InternalRailSL.g:85:7: ( 'OI_LN_2' )
            // InternalRailSL.g:85:9: 'OI_LN_2'
            {
            match("OI_LN_2"); 


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
            // InternalRailSL.g:86:7: ( 'IO_LN_0' )
            // InternalRailSL.g:86:9: 'IO_LN_0'
            {
            match("IO_LN_0"); 


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
            // InternalRailSL.g:87:7: ( 'IO_LN_1' )
            // InternalRailSL.g:87:9: 'IO_LN_1'
            {
            match("IO_LN_1"); 


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
            // InternalRailSL.g:88:7: ( 'IO_LN_2' )
            // InternalRailSL.g:88:9: 'IO_LN_2'
            {
            match("IO_LN_2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:1367:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRailSL.g:1367:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRailSL.g:1367:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRailSL.g:1367:11: '^'
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

            // InternalRailSL.g:1367:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRailSL.g:
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
            	    break loop2;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:1369:10: ( ( '0' .. '9' )+ )
            // InternalRailSL.g:1369:12: ( '0' .. '9' )+
            {
            // InternalRailSL.g:1369:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRailSL.g:1369:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:1371:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRailSL.g:1371:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRailSL.g:1371:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRailSL.g:1371:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRailSL.g:1371:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRailSL.g:1371:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRailSL.g:1371:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:1371:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRailSL.g:1371:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRailSL.g:1371:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRailSL.g:1371:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:1373:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRailSL.g:1373:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRailSL.g:1373:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRailSL.g:1373:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:1375:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRailSL.g:1375:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRailSL.g:1375:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRailSL.g:1375:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalRailSL.g:1375:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRailSL.g:1375:41: ( '\\r' )? '\\n'
                    {
                    // InternalRailSL.g:1375:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRailSL.g:1375:41: '\\r'
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
            // InternalRailSL.g:1377:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRailSL.g:1377:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRailSL.g:1377:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRailSL.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalRailSL.g:1379:16: ( . )
            // InternalRailSL.g:1379:18: .
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
        // InternalRailSL.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=85;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalRailSL.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalRailSL.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalRailSL.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalRailSL.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalRailSL.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalRailSL.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalRailSL.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalRailSL.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalRailSL.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalRailSL.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalRailSL.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalRailSL.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalRailSL.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalRailSL.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalRailSL.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalRailSL.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalRailSL.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalRailSL.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalRailSL.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalRailSL.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalRailSL.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalRailSL.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalRailSL.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalRailSL.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalRailSL.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalRailSL.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalRailSL.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalRailSL.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalRailSL.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalRailSL.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalRailSL.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalRailSL.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalRailSL.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalRailSL.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalRailSL.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalRailSL.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalRailSL.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalRailSL.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalRailSL.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalRailSL.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalRailSL.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalRailSL.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalRailSL.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalRailSL.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalRailSL.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalRailSL.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalRailSL.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalRailSL.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalRailSL.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalRailSL.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalRailSL.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalRailSL.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalRailSL.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalRailSL.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalRailSL.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalRailSL.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalRailSL.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalRailSL.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalRailSL.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalRailSL.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalRailSL.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalRailSL.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalRailSL.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalRailSL.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalRailSL.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalRailSL.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalRailSL.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalRailSL.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalRailSL.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // InternalRailSL.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // InternalRailSL.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // InternalRailSL.g:1:436: T__82
                {
                mT__82(); 

                }
                break;
            case 73 :
                // InternalRailSL.g:1:442: T__83
                {
                mT__83(); 

                }
                break;
            case 74 :
                // InternalRailSL.g:1:448: T__84
                {
                mT__84(); 

                }
                break;
            case 75 :
                // InternalRailSL.g:1:454: T__85
                {
                mT__85(); 

                }
                break;
            case 76 :
                // InternalRailSL.g:1:460: T__86
                {
                mT__86(); 

                }
                break;
            case 77 :
                // InternalRailSL.g:1:466: T__87
                {
                mT__87(); 

                }
                break;
            case 78 :
                // InternalRailSL.g:1:472: T__88
                {
                mT__88(); 

                }
                break;
            case 79 :
                // InternalRailSL.g:1:478: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 80 :
                // InternalRailSL.g:1:486: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 81 :
                // InternalRailSL.g:1:495: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 82 :
                // InternalRailSL.g:1:507: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 83 :
                // InternalRailSL.g:1:523: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 84 :
                // InternalRailSL.g:1:539: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 85 :
                // InternalRailSL.g:1:547: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\3\41\1\uffff\1\41\1\uffff\20\41\1\36\2\uffff\3\36\2\uffff\2\41\1\uffff\2\41\1\uffff\1\112\1\uffff\21\41\1\135\2\41\1\140\5\41\5\uffff\4\41\1\uffff\22\41\1\uffff\1\176\1\41\1\uffff\2\41\1\uffff\3\41\2\uffff\1\41\1\u008b\1\41\1\u008d\1\u008e\6\41\1\u0095\2\41\1\u0098\6\41\1\uffff\11\41\4\uffff\1\u00a8\2\uffff\4\41\1\uffff\1\u00ad\1\uffff\2\41\1\uffff\4\41\1\u00b4\1\uffff\10\41\2\uffff\1\41\1\u00bf\1\41\1\u00c1\1\uffff\6\41\1\uffff\12\41\1\uffff\1\u00f6\1\uffff\2\41\1\u00f9\1\u00fa\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102\1\u0103\1\41\1\u0105\1\u0106\1\u0107\1\uffff\1\u0108\1\u0109\1\u010a\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111\1\u0112\1\41\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b\1\u011c\1\u011d\1\u011e\1\u011f\1\u0120\1\u0121\1\u0122\1\u0123\1\u0124\1\u0125\1\u0126\1\41\1\u0129\3\uffff\1\41\13\uffff\1\u012b\16\uffff\1\u012c\23\uffff\1\u012d\1\u012e\6\uffff";
    static final String DFA12_eofS =
        "\u012f\uffff";
    static final String DFA12_minS =
        "\1\0\1\145\1\156\1\157\1\uffff\1\157\1\uffff\1\151\2\145\1\162\1\141\1\145\1\141\1\157\1\103\1\154\1\165\1\146\1\162\1\103\1\163\1\110\1\101\2\uffff\2\0\1\52\2\uffff\1\141\1\164\1\uffff\1\144\1\157\1\uffff\1\60\1\uffff\1\154\1\162\2\157\1\143\1\166\1\141\1\151\1\141\1\163\1\156\1\157\1\145\2\137\1\157\1\162\1\60\1\146\1\141\1\60\2\137\1\40\1\137\1\117\5\uffff\1\162\1\40\1\56\1\160\1\uffff\1\154\1\163\1\167\1\160\1\141\1\157\1\145\1\156\1\164\1\143\1\163\1\164\1\163\1\156\1\112\1\114\1\163\1\156\1\uffff\1\60\1\156\1\uffff\1\112\1\114\1\uffff\1\114\1\137\1\164\1\160\1\uffff\1\56\1\60\1\164\2\60\1\151\1\156\1\162\1\143\1\40\1\150\1\60\1\141\1\163\1\60\1\124\1\116\1\103\1\116\1\145\1\40\1\uffff\1\143\1\124\1\116\1\103\1\116\1\124\1\116\1\114\1\72\4\uffff\1\60\2\uffff\1\147\1\144\1\163\1\150\1\uffff\1\60\1\uffff\1\143\1\151\1\uffff\2\137\1\124\1\137\1\60\1\uffff\1\150\2\137\1\124\3\137\1\116\2\uffff\1\150\1\60\1\145\1\60\1\uffff\1\164\1\156\2\60\1\137\1\60\1\uffff\1\72\2\60\1\137\3\60\1\137\1\164\1\56\1\uffff\1\60\1\uffff\1\40\1\147\17\60\1\uffff\41\60\3\uffff\1\56\13\uffff\1\60\16\uffff\1\60\23\uffff\2\60\6\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\164\1\156\1\157\1\uffff\1\157\1\uffff\1\165\1\164\1\145\1\162\1\141\1\145\1\141\1\162\1\160\1\154\1\165\1\156\1\162\1\146\1\163\1\111\1\172\2\uffff\2\uffff\1\57\2\uffff\1\141\1\164\1\uffff\1\144\1\157\1\uffff\1\172\1\uffff\1\154\1\162\1\157\1\162\1\143\1\166\1\141\1\151\1\141\1\163\1\156\1\157\1\145\2\137\1\157\1\162\1\172\1\146\1\141\1\172\2\137\1\40\1\137\1\117\5\uffff\1\162\1\40\1\56\1\160\1\uffff\1\154\1\163\1\167\1\160\1\141\1\157\1\145\1\156\1\164\1\143\1\163\1\164\1\163\1\156\1\123\1\114\1\163\1\156\1\uffff\1\172\1\156\1\uffff\1\123\1\114\1\uffff\1\123\1\137\2\164\1\uffff\1\56\1\172\1\164\2\172\1\151\1\156\1\162\1\143\1\40\1\150\1\172\1\141\1\163\1\172\1\124\1\116\1\103\1\116\1\145\1\40\1\uffff\1\143\1\124\1\116\1\103\1\116\1\124\1\116\1\114\1\72\4\uffff\1\172\2\uffff\1\147\1\144\1\163\1\150\1\uffff\1\172\1\uffff\1\143\1\151\1\uffff\2\137\1\124\1\137\1\172\1\uffff\1\150\2\137\1\124\3\137\1\116\2\uffff\1\150\1\172\1\145\1\172\1\uffff\1\164\1\156\1\64\1\65\1\137\1\62\1\uffff\1\72\1\64\1\65\1\137\1\62\1\66\1\70\1\137\1\164\1\56\1\uffff\1\172\1\uffff\1\40\1\147\13\172\1\60\3\172\1\uffff\13\172\1\60\23\172\1\61\1\172\3\uffff\1\56\13\uffff\1\172\16\uffff\1\172\23\uffff\2\172\6\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\5\1\uffff\1\7\21\uffff\1\117\1\120\3\uffff\1\124\1\125\2\uffff\1\117\2\uffff\1\5\1\uffff\1\7\32\uffff\1\120\1\121\1\122\1\123\1\124\4\uffff\1\6\22\uffff\1\30\2\uffff\1\33\2\uffff\1\34\4\uffff\1\2\25\uffff\1\31\11\uffff\1\4\1\14\1\3\1\10\1\uffff\1\11\1\13\4\uffff\1\17\1\uffff\1\22\2\uffff\1\24\5\uffff\1\27\10\uffff\1\1\1\35\4\uffff\1\21\6\uffff\1\25\12\uffff\1\36\1\uffff\1\16\21\uffff\1\32\41\uffff\1\20\1\12\1\23\1\uffff\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\uffff\1\111\1\112\1\113\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\uffff\1\114\1\115\1\116\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\2\uffff\1\15\1\26\1\107\1\110\1\57\1\60";
    static final String DFA12_specialS =
        "\1\1\31\uffff\1\2\1\0\u0113\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\32\4\36\1\33\4\36\1\4\1\36\1\6\1\34\12\31\7\36\1\30\1\23\1\20\1\30\1\2\3\30\1\24\1\30\1\26\1\3\2\30\1\17\1\15\1\30\1\14\1\1\1\21\2\30\1\13\3\30\3\36\1\27\1\30\1\36\1\30\1\12\1\16\2\30\1\7\2\30\1\25\5\30\1\22\2\30\1\11\1\10\1\5\6\30\uff85\36",
            "\1\40\16\uffff\1\37",
            "\1\42",
            "\1\43",
            "",
            "\1\45",
            "",
            "\1\50\13\uffff\1\47",
            "\1\53\6\uffff\1\51\7\uffff\1\52",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61\2\uffff\1\62",
            "\1\64\5\uffff\1\65\46\uffff\1\63",
            "\1\66",
            "\1\67",
            "\1\71\7\uffff\1\70",
            "\1\72",
            "\1\74\13\uffff\1\75\26\uffff\1\73",
            "\1\76",
            "\1\77\1\100",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\102",
            "\0\102",
            "\1\103\4\uffff\1\104",
            "",
            "",
            "\1\106",
            "\1\107",
            "",
            "\1\110",
            "\1\111",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116\2\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\136",
            "\1\137",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "",
            "",
            "",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\172\1\uffff\1\171\6\uffff\1\170",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\177",
            "",
            "\1\u0082\1\uffff\1\u0081\6\uffff\1\u0080",
            "\1\u0083",
            "",
            "\1\u0085\6\uffff\1\u0084",
            "\1\u0086",
            "\1\u0087",
            "\1\u0089\3\uffff\1\u0088",
            "",
            "\1\u008a",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008c",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0096",
            "\1\u0097",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "",
            "\1\u00bd",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\22\41\1\u00be\7\41",
            "\1\u00c0",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8",
            "\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce",
            "\1\u00cf",
            "\1\u00d0\1\u00d1\1\u00d2",
            "",
            "\1\u00d3",
            "\1\u00d4\1\u00d5\1\u00d6\1\u00d7\1\u00d8",
            "\1\u00d9\1\u00da\1\u00db\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df",
            "\1\u00e0\1\u00e1\1\u00e2",
            "\1\u00e3\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9",
            "\1\u00ea\1\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00f7",
            "\1\u00f8",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0104",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0113",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0127\1\u0128",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "\1\u012a",
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
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
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

    class DFA12 extends DFA {

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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_27 = input.LA(1);

                        s = -1;
                        if ( ((LA12_27>='\u0000' && LA12_27<='\uFFFF')) ) {s = 66;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='S') ) {s = 1;}

                        else if ( (LA12_0=='E') ) {s = 2;}

                        else if ( (LA12_0=='L') ) {s = 3;}

                        else if ( (LA12_0==',') ) {s = 4;}

                        else if ( (LA12_0=='t') ) {s = 5;}

                        else if ( (LA12_0=='.') ) {s = 6;}

                        else if ( (LA12_0=='f') ) {s = 7;}

                        else if ( (LA12_0=='s') ) {s = 8;}

                        else if ( (LA12_0=='r') ) {s = 9;}

                        else if ( (LA12_0=='b') ) {s = 10;}

                        else if ( (LA12_0=='W') ) {s = 11;}

                        else if ( (LA12_0=='R') ) {s = 12;}

                        else if ( (LA12_0=='P') ) {s = 13;}

                        else if ( (LA12_0=='c') ) {s = 14;}

                        else if ( (LA12_0=='O') ) {s = 15;}

                        else if ( (LA12_0=='C') ) {s = 16;}

                        else if ( (LA12_0=='T') ) {s = 17;}

                        else if ( (LA12_0=='o') ) {s = 18;}

                        else if ( (LA12_0=='B') ) {s = 19;}

                        else if ( (LA12_0=='I') ) {s = 20;}

                        else if ( (LA12_0=='i') ) {s = 21;}

                        else if ( (LA12_0=='K') ) {s = 22;}

                        else if ( (LA12_0=='^') ) {s = 23;}

                        else if ( (LA12_0=='A'||LA12_0=='D'||(LA12_0>='F' && LA12_0<='H')||LA12_0=='J'||(LA12_0>='M' && LA12_0<='N')||LA12_0=='Q'||(LA12_0>='U' && LA12_0<='V')||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||(LA12_0>='d' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='n')||(LA12_0>='p' && LA12_0<='q')||(LA12_0>='u' && LA12_0<='z')) ) {s = 24;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 25;}

                        else if ( (LA12_0=='\"') ) {s = 26;}

                        else if ( (LA12_0=='\'') ) {s = 27;}

                        else if ( (LA12_0=='/') ) {s = 28;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 29;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0=='-'||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFF')) ) {s = 66;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}