package de.cau.cs.kieler.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRailSLLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_SEG_NAME=4;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:11:7: ( 'End.' )
            // InternalRailSL.g:11:9: 'End.'
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
            // InternalRailSL.g:12:7: ( 'Loop.' )
            // InternalRailSL.g:12:9: 'Loop.'
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
            // InternalRailSL.g:13:7: ( 'stop' )
            // InternalRailSL.g:13:9: 'stop'
            {
            match("stop"); 


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
            // InternalRailSL.g:14:7: ( 'full' )
            // InternalRailSL.g:14:9: 'full'
            {
            match("full"); 


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
            // InternalRailSL.g:15:7: ( 'slow' )
            // InternalRailSL.g:15:9: 'slow'
            {
            match("slow"); 


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
            // InternalRailSL.g:16:7: ( 'straight' )
            // InternalRailSL.g:16:9: 'straight'
            {
            match("straight"); 


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
            // InternalRailSL.g:17:7: ( 'branch' )
            // InternalRailSL.g:17:9: 'branch'
            {
            match("branch"); 


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
            // InternalRailSL.g:18:7: ( 'Reach' )
            // InternalRailSL.g:18:9: 'Reach'
            {
            match("Reach"); 


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
            // InternalRailSL.g:19:7: ( 'Pass' )
            // InternalRailSL.g:19:9: 'Pass'
            {
            match("Pass"); 


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
            // InternalRailSL.g:20:7: ( 'Open' )
            // InternalRailSL.g:20:9: 'Open'
            {
            match("Open"); 


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
            // InternalRailSL.g:21:7: ( 'Close' )
            // InternalRailSL.g:21:9: 'Close'
            {
            match("Close"); 


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
            // InternalRailSL.g:22:7: ( 'on' )
            // InternalRailSL.g:22:9: 'on'
            {
            match("on"); 


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
            // InternalRailSL.g:23:7: ( 'off' )
            // InternalRailSL.g:23:9: 'off'
            {
            match("off"); 


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
            // InternalRailSL.g:24:7: ( 'first' )
            // InternalRailSL.g:24:9: 'first'
            {
            match("first"); 


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
            // InternalRailSL.g:25:7: ( 'second' )
            // InternalRailSL.g:25:9: 'second'
            {
            match("second"); 


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
            // InternalRailSL.g:26:7: ( 'Start:' )
            // InternalRailSL.g:26:9: 'Start:'
            {
            match("Start:"); 


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
            // InternalRailSL.g:27:7: ( 'Set track' )
            // InternalRailSL.g:27:9: 'Set track'
            {
            match("Set track"); 


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
            // InternalRailSL.g:28:7: ( 'to' )
            // InternalRailSL.g:28:9: 'to'
            {
            match("to"); 


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
            // InternalRailSL.g:29:7: ( '.' )
            // InternalRailSL.g:29:9: '.'
            {
            match('.'); 

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
            // InternalRailSL.g:30:7: ( ', ' )
            // InternalRailSL.g:30:9: ', '
            {
            match(", "); 


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
            // InternalRailSL.g:31:7: ( 'and' )
            // InternalRailSL.g:31:9: 'and'
            {
            match("and"); 


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
            // InternalRailSL.g:32:7: ( ', and' )
            // InternalRailSL.g:32:9: ', and'
            {
            match(", and"); 


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
            // InternalRailSL.g:33:7: ( 'reverse' )
            // InternalRailSL.g:33:9: 'reverse'
            {
            match("reverse"); 


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
            // InternalRailSL.g:34:7: ( 'Set point' )
            // InternalRailSL.g:34:9: 'Set point'
            {
            match("Set point"); 


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
            // InternalRailSL.g:35:7: ( 'Wait for' )
            // InternalRailSL.g:35:9: 'Wait for'
            {
            match("Wait for"); 


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
            // InternalRailSL.g:36:7: ( 'seconds.' )
            // InternalRailSL.g:36:9: 'seconds.'
            {
            match("seconds."); 


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
            // InternalRailSL.g:37:7: ( 'contact of' )
            // InternalRailSL.g:37:9: 'contact of'
            {
            match("contact of"); 


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
            // InternalRailSL.g:38:7: ( 'crossing.' )
            // InternalRailSL.g:38:9: 'crossing.'
            {
            match("crossing."); 


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
            // InternalRailSL.g:39:7: ( 'Turn light' )
            // InternalRailSL.g:39:9: 'Turn light'
            {
            match("Turn light"); 


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
            // InternalRailSL.g:40:7: ( 'Branch:' )
            // InternalRailSL.g:40:9: 'Branch:'
            {
            match("Branch:"); 


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
            // InternalRailSL.g:41:7: ( 'If' )
            // InternalRailSL.g:41:9: 'If'
            {
            match("If"); 


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
            // InternalRailSL.g:42:7: ( 'is reached first, do' )
            // InternalRailSL.g:42:9: 'is reached first, do'
            {
            match("is reached first, do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_SEG_NAME"
    public final void mRULE_SEG_NAME() throws RecognitionException {
        try {
            int _type = RULE_SEG_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:2933:15: ( ( 'KH_ST_0' | 'KH_ST_1' | 'KH_ST_2' | 'KH_ST_3' | 'KH_ST_4' | 'KH_ST_5' | 'KH_ST_6' | 'KH_LN_0' | 'KH_LN_1' | 'KH_LN_2' | 'KH_LN_3' | 'KH_LN_4' | 'KH_LN_5' | 'KH_LN_6' | 'KH_LN_7' | 'KH_LN_8' | 'KIO_LN_0' | 'KIO_LN_1' | 'OC_ST_0' | 'OC_ST_1' | 'OC_ST_2' | 'OC_ST_3' | 'OC_ST_4' | 'OC_LN_0' | 'OC_LN_1' | 'OC_LN_2' | 'OC_LN_3' | 'OC_LN_4' | 'OC_LN_5' | 'IC_ST_0' | 'IC_ST_1' | 'IC_ST_2' | 'IC_ST_3' | 'IC_ST_4' | 'IC_LN_0' | 'IC_LN_1' | 'IC_LN_2' | 'IC_LN_3' | 'IC_LN_4' | 'IC_LN_5' | 'OC_JCT_0' | 'IC_JCT_0' | 'OI_LN_0' | 'OI_LN_1' | 'OI_LN_2' | 'IO_LN_0' | 'IO_LN_1' | 'IO_LN_2' ) )
            // InternalRailSL.g:2933:17: ( 'KH_ST_0' | 'KH_ST_1' | 'KH_ST_2' | 'KH_ST_3' | 'KH_ST_4' | 'KH_ST_5' | 'KH_ST_6' | 'KH_LN_0' | 'KH_LN_1' | 'KH_LN_2' | 'KH_LN_3' | 'KH_LN_4' | 'KH_LN_5' | 'KH_LN_6' | 'KH_LN_7' | 'KH_LN_8' | 'KIO_LN_0' | 'KIO_LN_1' | 'OC_ST_0' | 'OC_ST_1' | 'OC_ST_2' | 'OC_ST_3' | 'OC_ST_4' | 'OC_LN_0' | 'OC_LN_1' | 'OC_LN_2' | 'OC_LN_3' | 'OC_LN_4' | 'OC_LN_5' | 'IC_ST_0' | 'IC_ST_1' | 'IC_ST_2' | 'IC_ST_3' | 'IC_ST_4' | 'IC_LN_0' | 'IC_LN_1' | 'IC_LN_2' | 'IC_LN_3' | 'IC_LN_4' | 'IC_LN_5' | 'OC_JCT_0' | 'IC_JCT_0' | 'OI_LN_0' | 'OI_LN_1' | 'OI_LN_2' | 'IO_LN_0' | 'IO_LN_1' | 'IO_LN_2' )
            {
            // InternalRailSL.g:2933:17: ( 'KH_ST_0' | 'KH_ST_1' | 'KH_ST_2' | 'KH_ST_3' | 'KH_ST_4' | 'KH_ST_5' | 'KH_ST_6' | 'KH_LN_0' | 'KH_LN_1' | 'KH_LN_2' | 'KH_LN_3' | 'KH_LN_4' | 'KH_LN_5' | 'KH_LN_6' | 'KH_LN_7' | 'KH_LN_8' | 'KIO_LN_0' | 'KIO_LN_1' | 'OC_ST_0' | 'OC_ST_1' | 'OC_ST_2' | 'OC_ST_3' | 'OC_ST_4' | 'OC_LN_0' | 'OC_LN_1' | 'OC_LN_2' | 'OC_LN_3' | 'OC_LN_4' | 'OC_LN_5' | 'IC_ST_0' | 'IC_ST_1' | 'IC_ST_2' | 'IC_ST_3' | 'IC_ST_4' | 'IC_LN_0' | 'IC_LN_1' | 'IC_LN_2' | 'IC_LN_3' | 'IC_LN_4' | 'IC_LN_5' | 'OC_JCT_0' | 'IC_JCT_0' | 'OI_LN_0' | 'OI_LN_1' | 'OI_LN_2' | 'IO_LN_0' | 'IO_LN_1' | 'IO_LN_2' )
            int alt1=48;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalRailSL.g:2933:18: 'KH_ST_0'
                    {
                    match("KH_ST_0"); 


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:2933:28: 'KH_ST_1'
                    {
                    match("KH_ST_1"); 


                    }
                    break;
                case 3 :
                    // InternalRailSL.g:2933:38: 'KH_ST_2'
                    {
                    match("KH_ST_2"); 


                    }
                    break;
                case 4 :
                    // InternalRailSL.g:2933:48: 'KH_ST_3'
                    {
                    match("KH_ST_3"); 


                    }
                    break;
                case 5 :
                    // InternalRailSL.g:2933:58: 'KH_ST_4'
                    {
                    match("KH_ST_4"); 


                    }
                    break;
                case 6 :
                    // InternalRailSL.g:2933:68: 'KH_ST_5'
                    {
                    match("KH_ST_5"); 


                    }
                    break;
                case 7 :
                    // InternalRailSL.g:2933:78: 'KH_ST_6'
                    {
                    match("KH_ST_6"); 


                    }
                    break;
                case 8 :
                    // InternalRailSL.g:2933:88: 'KH_LN_0'
                    {
                    match("KH_LN_0"); 


                    }
                    break;
                case 9 :
                    // InternalRailSL.g:2933:98: 'KH_LN_1'
                    {
                    match("KH_LN_1"); 


                    }
                    break;
                case 10 :
                    // InternalRailSL.g:2933:108: 'KH_LN_2'
                    {
                    match("KH_LN_2"); 


                    }
                    break;
                case 11 :
                    // InternalRailSL.g:2933:118: 'KH_LN_3'
                    {
                    match("KH_LN_3"); 


                    }
                    break;
                case 12 :
                    // InternalRailSL.g:2933:128: 'KH_LN_4'
                    {
                    match("KH_LN_4"); 


                    }
                    break;
                case 13 :
                    // InternalRailSL.g:2933:138: 'KH_LN_5'
                    {
                    match("KH_LN_5"); 


                    }
                    break;
                case 14 :
                    // InternalRailSL.g:2933:148: 'KH_LN_6'
                    {
                    match("KH_LN_6"); 


                    }
                    break;
                case 15 :
                    // InternalRailSL.g:2933:158: 'KH_LN_7'
                    {
                    match("KH_LN_7"); 


                    }
                    break;
                case 16 :
                    // InternalRailSL.g:2933:168: 'KH_LN_8'
                    {
                    match("KH_LN_8"); 


                    }
                    break;
                case 17 :
                    // InternalRailSL.g:2933:178: 'KIO_LN_0'
                    {
                    match("KIO_LN_0"); 


                    }
                    break;
                case 18 :
                    // InternalRailSL.g:2933:189: 'KIO_LN_1'
                    {
                    match("KIO_LN_1"); 


                    }
                    break;
                case 19 :
                    // InternalRailSL.g:2933:200: 'OC_ST_0'
                    {
                    match("OC_ST_0"); 


                    }
                    break;
                case 20 :
                    // InternalRailSL.g:2933:210: 'OC_ST_1'
                    {
                    match("OC_ST_1"); 


                    }
                    break;
                case 21 :
                    // InternalRailSL.g:2933:220: 'OC_ST_2'
                    {
                    match("OC_ST_2"); 


                    }
                    break;
                case 22 :
                    // InternalRailSL.g:2933:230: 'OC_ST_3'
                    {
                    match("OC_ST_3"); 


                    }
                    break;
                case 23 :
                    // InternalRailSL.g:2933:240: 'OC_ST_4'
                    {
                    match("OC_ST_4"); 


                    }
                    break;
                case 24 :
                    // InternalRailSL.g:2933:250: 'OC_LN_0'
                    {
                    match("OC_LN_0"); 


                    }
                    break;
                case 25 :
                    // InternalRailSL.g:2933:260: 'OC_LN_1'
                    {
                    match("OC_LN_1"); 


                    }
                    break;
                case 26 :
                    // InternalRailSL.g:2933:270: 'OC_LN_2'
                    {
                    match("OC_LN_2"); 


                    }
                    break;
                case 27 :
                    // InternalRailSL.g:2933:280: 'OC_LN_3'
                    {
                    match("OC_LN_3"); 


                    }
                    break;
                case 28 :
                    // InternalRailSL.g:2933:290: 'OC_LN_4'
                    {
                    match("OC_LN_4"); 


                    }
                    break;
                case 29 :
                    // InternalRailSL.g:2933:300: 'OC_LN_5'
                    {
                    match("OC_LN_5"); 


                    }
                    break;
                case 30 :
                    // InternalRailSL.g:2933:310: 'IC_ST_0'
                    {
                    match("IC_ST_0"); 


                    }
                    break;
                case 31 :
                    // InternalRailSL.g:2933:320: 'IC_ST_1'
                    {
                    match("IC_ST_1"); 


                    }
                    break;
                case 32 :
                    // InternalRailSL.g:2933:330: 'IC_ST_2'
                    {
                    match("IC_ST_2"); 


                    }
                    break;
                case 33 :
                    // InternalRailSL.g:2933:340: 'IC_ST_3'
                    {
                    match("IC_ST_3"); 


                    }
                    break;
                case 34 :
                    // InternalRailSL.g:2933:350: 'IC_ST_4'
                    {
                    match("IC_ST_4"); 


                    }
                    break;
                case 35 :
                    // InternalRailSL.g:2933:360: 'IC_LN_0'
                    {
                    match("IC_LN_0"); 


                    }
                    break;
                case 36 :
                    // InternalRailSL.g:2933:370: 'IC_LN_1'
                    {
                    match("IC_LN_1"); 


                    }
                    break;
                case 37 :
                    // InternalRailSL.g:2933:380: 'IC_LN_2'
                    {
                    match("IC_LN_2"); 


                    }
                    break;
                case 38 :
                    // InternalRailSL.g:2933:390: 'IC_LN_3'
                    {
                    match("IC_LN_3"); 


                    }
                    break;
                case 39 :
                    // InternalRailSL.g:2933:400: 'IC_LN_4'
                    {
                    match("IC_LN_4"); 


                    }
                    break;
                case 40 :
                    // InternalRailSL.g:2933:410: 'IC_LN_5'
                    {
                    match("IC_LN_5"); 


                    }
                    break;
                case 41 :
                    // InternalRailSL.g:2933:420: 'OC_JCT_0'
                    {
                    match("OC_JCT_0"); 


                    }
                    break;
                case 42 :
                    // InternalRailSL.g:2933:431: 'IC_JCT_0'
                    {
                    match("IC_JCT_0"); 


                    }
                    break;
                case 43 :
                    // InternalRailSL.g:2933:442: 'OI_LN_0'
                    {
                    match("OI_LN_0"); 


                    }
                    break;
                case 44 :
                    // InternalRailSL.g:2933:452: 'OI_LN_1'
                    {
                    match("OI_LN_1"); 


                    }
                    break;
                case 45 :
                    // InternalRailSL.g:2933:462: 'OI_LN_2'
                    {
                    match("OI_LN_2"); 


                    }
                    break;
                case 46 :
                    // InternalRailSL.g:2933:472: 'IO_LN_0'
                    {
                    match("IO_LN_0"); 


                    }
                    break;
                case 47 :
                    // InternalRailSL.g:2933:482: 'IO_LN_1'
                    {
                    match("IO_LN_1"); 


                    }
                    break;
                case 48 :
                    // InternalRailSL.g:2933:492: 'IO_LN_2'
                    {
                    match("IO_LN_2"); 


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
    // $ANTLR end "RULE_SEG_NAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:2935:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRailSL.g:2935:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRailSL.g:2935:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRailSL.g:2935:11: '^'
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

            // InternalRailSL.g:2935:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
            // InternalRailSL.g:2937:10: ( ( '0' .. '9' )+ )
            // InternalRailSL.g:2937:12: ( '0' .. '9' )+
            {
            // InternalRailSL.g:2937:12: ( '0' .. '9' )+
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
            	    // InternalRailSL.g:2937:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:2939:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRailSL.g:2939:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRailSL.g:2939:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRailSL.g:2939:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRailSL.g:2939:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRailSL.g:2939:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRailSL.g:2939:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:2939:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRailSL.g:2939:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRailSL.g:2939:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRailSL.g:2939:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalRailSL.g:2941:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRailSL.g:2941:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRailSL.g:2941:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRailSL.g:2941:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalRailSL.g:2943:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRailSL.g:2943:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRailSL.g:2943:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRailSL.g:2943:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalRailSL.g:2943:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRailSL.g:2943:41: ( '\\r' )? '\\n'
                    {
                    // InternalRailSL.g:2943:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRailSL.g:2943:41: '\\r'
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
            // InternalRailSL.g:2945:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRailSL.g:2945:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRailSL.g:2945:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalRailSL.g:2947:16: ( . )
            // InternalRailSL.g:2947:18: .
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
        // InternalRailSL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_SEG_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=40;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalRailSL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalRailSL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalRailSL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalRailSL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalRailSL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalRailSL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalRailSL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalRailSL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalRailSL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalRailSL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalRailSL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalRailSL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalRailSL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalRailSL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalRailSL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalRailSL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalRailSL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalRailSL.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalRailSL.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalRailSL.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalRailSL.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalRailSL.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalRailSL.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalRailSL.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalRailSL.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalRailSL.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalRailSL.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalRailSL.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalRailSL.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalRailSL.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalRailSL.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalRailSL.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalRailSL.g:1:202: RULE_SEG_NAME
                {
                mRULE_SEG_NAME(); 

                }
                break;
            case 34 :
                // InternalRailSL.g:1:216: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalRailSL.g:1:224: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalRailSL.g:1:233: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalRailSL.g:1:245: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalRailSL.g:1:261: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalRailSL.g:1:277: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalRailSL.g:1:285: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA1_eotS =
        "\134\uffff";
    static final String DFA1_eofS =
        "\134\uffff";
    static final String DFA1_minS =
        "\1\111\1\110\2\103\1\137\1\117\4\137\1\114\1\137\1\112\1\114\1\112\1\114\1\124\1\116\1\114\1\124\1\116\1\uffff\1\116\1\124\1\116\1\uffff\1\116\2\137\1\116\6\137\2\60\1\137\6\60\20\uffff\1\60\36\uffff";
    static final String DFA1_maxS =
        "\1\117\2\111\1\117\1\137\1\117\4\137\1\123\1\137\1\123\1\114\1\123\1\114\1\124\1\116\1\114\1\124\1\116\1\uffff\1\116\1\124\1\116\1\uffff\1\116\2\137\1\116\6\137\1\66\1\70\1\137\1\64\1\65\1\62\1\64\1\65\1\62\20\uffff\1\61\36\uffff";
    static final String DFA1_acceptS =
        "\25\uffff\1\51\3\uffff\1\52\23\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\53\1\54\1\55\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\56\1\57\1\60\1\21\1\22";
    static final String DFA1_specialS =
        "\134\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\1\uffff\1\1\3\uffff\1\2",
            "\1\4\1\5",
            "\1\6\5\uffff\1\7",
            "\1\10\13\uffff\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\21\6\uffff\1\20",
            "\1\22",
            "\1\25\1\uffff\1\24\6\uffff\1\23",
            "\1\26",
            "\1\31\1\uffff\1\30\6\uffff\1\27",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\63",
            "\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74",
            "\1\75",
            "\1\76\1\77\1\100\1\101\1\102",
            "\1\103\1\104\1\105\1\106\1\107\1\110",
            "\1\111\1\112\1\113",
            "\1\114\1\115\1\116\1\117\1\120",
            "\1\121\1\122\1\123\1\124\1\125\1\126",
            "\1\127\1\130\1\131",
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
            "\1\132\1\133",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "2933:17: ( 'KH_ST_0' | 'KH_ST_1' | 'KH_ST_2' | 'KH_ST_3' | 'KH_ST_4' | 'KH_ST_5' | 'KH_ST_6' | 'KH_LN_0' | 'KH_LN_1' | 'KH_LN_2' | 'KH_LN_3' | 'KH_LN_4' | 'KH_LN_5' | 'KH_LN_6' | 'KH_LN_7' | 'KH_LN_8' | 'KIO_LN_0' | 'KIO_LN_1' | 'OC_ST_0' | 'OC_ST_1' | 'OC_ST_2' | 'OC_ST_3' | 'OC_ST_4' | 'OC_LN_0' | 'OC_LN_1' | 'OC_LN_2' | 'OC_LN_3' | 'OC_LN_4' | 'OC_LN_5' | 'IC_ST_0' | 'IC_ST_1' | 'IC_ST_2' | 'IC_ST_3' | 'IC_ST_4' | 'IC_LN_0' | 'IC_LN_1' | 'IC_LN_2' | 'IC_LN_3' | 'IC_LN_4' | 'IC_LN_5' | 'OC_JCT_0' | 'IC_JCT_0' | 'OI_LN_0' | 'OI_LN_1' | 'OI_LN_2' | 'IO_LN_0' | 'IO_LN_1' | 'IO_LN_2' )";
        }
    }
    static final String DFA13_eotS =
        "\1\uffff\14\41\1\uffff\1\37\11\41\1\37\2\uffff\3\37\2\uffff\1\41\1\uffff\15\41\1\127\3\41\1\133\1\uffff\1\135\7\41\1\145\5\41\5\uffff\17\41\1\uffff\1\174\2\41\3\uffff\1\177\6\41\1\uffff\2\41\1\uffff\2\41\1\uffff\1\41\1\u008e\1\41\1\u0090\1\41\1\u0092\3\41\1\u0096\1\u0097\5\41\1\uffff\1\41\2\uffff\15\41\2\uffff\1\41\1\uffff\1\41\1\uffff\1\u00af\1\41\1\u00b1\2\uffff\4\41\1\u00b6\1\41\2\uffff\1\41\1\uffff\2\41\1\uffff\11\41\1\u00c5\1\uffff\1\u00c6\1\uffff\4\41\2\uffff\15\41\2\uffff\13\u00fc\1\41\3\u00fc\1\u00fe\2\41\1\uffff\13\u00fc\1\41\23\u00fc\1\41\1\u0104\2\uffff\1\u00fc\2\uffff\1\41\3\u00fc\2\uffff";
    static final String DFA13_eofS =
        "\u0106\uffff";
    static final String DFA13_minS =
        "\1\0\1\156\1\157\1\145\1\151\1\162\1\145\1\141\1\103\1\154\1\146\1\145\1\157\1\uffff\1\40\1\156\1\145\1\141\1\157\1\165\1\162\1\103\1\163\1\110\1\101\2\uffff\2\0\1\52\2\uffff\1\144\1\uffff\3\157\1\143\1\154\1\162\2\141\1\163\1\145\2\137\1\157\1\60\1\146\1\141\1\164\1\60\1\uffff\1\141\1\144\1\166\1\151\1\156\1\157\1\162\1\141\1\60\2\137\1\40\1\137\1\117\5\uffff\1\56\2\160\1\141\1\167\1\157\1\154\1\163\1\156\1\143\1\163\1\156\1\112\1\114\1\163\1\uffff\1\60\1\162\1\40\3\uffff\1\60\1\145\2\164\1\163\2\156\1\uffff\1\112\1\114\1\uffff\1\114\1\137\1\uffff\1\56\1\60\1\151\1\60\1\156\1\60\1\164\1\143\1\150\2\60\1\124\1\116\1\103\1\116\1\145\1\uffff\1\164\1\160\1\uffff\1\162\1\40\1\141\1\163\1\40\1\143\1\124\1\116\1\103\1\116\1\124\1\116\1\114\2\uffff\1\147\1\uffff\1\144\1\uffff\1\60\1\150\1\60\2\uffff\2\137\1\124\1\137\1\60\1\72\2\uffff\1\163\1\uffff\1\143\1\151\1\uffff\1\150\2\137\1\124\3\137\1\116\1\150\1\60\1\uffff\1\60\1\uffff\2\60\1\137\1\60\2\uffff\1\145\1\164\1\156\1\72\2\60\1\137\3\60\1\137\1\164\1\56\2\uffff\20\60\1\40\1\147\1\uffff\41\60\2\uffff\1\60\2\uffff\1\56\3\60\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\156\1\157\1\164\1\165\1\162\1\145\1\141\1\160\1\154\1\156\1\164\1\157\1\uffff\1\40\1\156\1\145\1\141\1\162\1\165\1\162\1\146\1\163\1\111\1\172\2\uffff\2\uffff\1\57\2\uffff\1\144\1\uffff\1\157\1\162\1\157\1\143\1\154\1\162\2\141\1\163\1\145\2\137\1\157\1\172\1\146\1\141\1\164\1\172\1\uffff\1\141\1\144\1\166\1\151\1\156\1\157\1\162\1\141\1\172\2\137\1\40\1\137\1\117\5\uffff\1\56\2\160\1\141\1\167\1\157\1\154\1\163\1\156\1\143\1\163\1\156\1\123\1\114\1\163\1\uffff\1\172\1\162\1\40\3\uffff\1\172\1\145\2\164\1\163\2\156\1\uffff\1\123\1\114\1\uffff\1\123\1\137\1\uffff\1\56\1\172\1\151\1\172\1\156\1\172\1\164\1\143\1\150\2\172\1\124\1\116\1\103\1\116\1\145\1\uffff\2\164\1\uffff\1\162\1\40\1\141\1\163\1\40\1\143\1\124\1\116\1\103\1\116\1\124\1\116\1\114\2\uffff\1\147\1\uffff\1\144\1\uffff\1\172\1\150\1\172\2\uffff\2\137\1\124\1\137\1\172\1\72\2\uffff\1\163\1\uffff\1\143\1\151\1\uffff\1\150\2\137\1\124\3\137\1\116\1\150\1\172\1\uffff\1\172\1\uffff\1\64\1\65\1\137\1\62\2\uffff\1\145\1\164\1\156\1\72\1\64\1\65\1\137\1\62\1\66\1\70\1\137\1\164\1\56\2\uffff\13\172\1\60\4\172\1\40\1\147\1\uffff\13\172\1\60\23\172\1\61\1\172\2\uffff\1\172\2\uffff\1\56\3\172\2\uffff";
    static final String DFA13_acceptS =
        "\15\uffff\1\23\13\uffff\1\42\1\43\3\uffff\1\47\1\50\1\uffff\1\42\22\uffff\1\23\16\uffff\1\43\1\44\1\45\1\46\1\47\17\uffff\1\14\3\uffff\1\22\1\26\1\24\7\uffff\1\37\2\uffff\1\40\2\uffff\1\1\20\uffff\1\15\2\uffff\1\25\15\uffff\1\2\1\3\1\uffff\1\5\1\uffff\1\4\3\uffff\1\11\1\12\6\uffff\1\21\1\30\1\uffff\1\31\2\uffff\1\35\12\uffff\1\16\1\uffff\1\10\4\uffff\1\13\1\20\15\uffff\1\17\1\7\22\uffff\1\36\41\uffff\1\32\1\41\1\uffff\1\27\1\33\4\uffff\1\6\1\34";
    static final String DFA13_specialS =
        "\1\0\32\uffff\1\1\1\2\u00e9\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\4\37\1\34\4\37\1\16\1\37\1\15\1\35\12\32\7\37\1\31\1\24\1\11\1\31\1\1\3\31\1\25\1\31\1\27\1\2\2\31\1\10\1\7\1\31\1\6\1\13\1\23\2\31\1\21\3\31\3\37\1\30\1\31\1\37\1\17\1\5\1\22\2\31\1\4\2\31\1\26\5\31\1\12\2\31\1\20\1\3\1\14\6\31\uff85\37",
            "\1\40",
            "\1\42",
            "\1\45\6\uffff\1\44\7\uffff\1\43",
            "\1\47\13\uffff\1\46",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\54\5\uffff\1\55\46\uffff\1\53",
            "\1\56",
            "\1\60\7\uffff\1\57",
            "\1\62\16\uffff\1\61",
            "\1\63",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71\2\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\76\13\uffff\1\77\26\uffff\1\75",
            "\1\100",
            "\1\101\1\102",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\104",
            "\0\104",
            "\1\105\4\uffff\1\106",
            "",
            "",
            "\1\110",
            "",
            "\1\111",
            "\1\112\2\uffff\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\134",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "",
            "",
            "",
            "",
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
            "\1\171\1\uffff\1\170\6\uffff\1\167",
            "\1\172",
            "\1\173",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\175",
            "\1\176",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\u0088\1\uffff\1\u0087\6\uffff\1\u0086",
            "\1\u0089",
            "",
            "\1\u008b\6\uffff\1\u008a",
            "\1\u008c",
            "",
            "\1\u008d",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008f",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0091",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009f\3\uffff\1\u009e",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b0",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b7",
            "",
            "",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\22\41\1\u00c4\7\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb",
            "\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1",
            "\1\u00d2",
            "\1\u00d3\1\u00d4\1\u00d5",
            "",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da\1\u00db\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4",
            "\1\u00e5",
            "\1\u00e6\1\u00e7\1\u00e8",
            "\1\u00e9\1\u00ea\1\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef",
            "\1\u00f0\1\u00f1\1\u00f2\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
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
            "\1\u00fd",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00ff",
            "\1\u0100",
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
            "\1\u0101",
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
            "\1\u0102\1\u0103",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u0105",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_SEG_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='E') ) {s = 1;}

                        else if ( (LA13_0=='L') ) {s = 2;}

                        else if ( (LA13_0=='s') ) {s = 3;}

                        else if ( (LA13_0=='f') ) {s = 4;}

                        else if ( (LA13_0=='b') ) {s = 5;}

                        else if ( (LA13_0=='R') ) {s = 6;}

                        else if ( (LA13_0=='P') ) {s = 7;}

                        else if ( (LA13_0=='O') ) {s = 8;}

                        else if ( (LA13_0=='C') ) {s = 9;}

                        else if ( (LA13_0=='o') ) {s = 10;}

                        else if ( (LA13_0=='S') ) {s = 11;}

                        else if ( (LA13_0=='t') ) {s = 12;}

                        else if ( (LA13_0=='.') ) {s = 13;}

                        else if ( (LA13_0==',') ) {s = 14;}

                        else if ( (LA13_0=='a') ) {s = 15;}

                        else if ( (LA13_0=='r') ) {s = 16;}

                        else if ( (LA13_0=='W') ) {s = 17;}

                        else if ( (LA13_0=='c') ) {s = 18;}

                        else if ( (LA13_0=='T') ) {s = 19;}

                        else if ( (LA13_0=='B') ) {s = 20;}

                        else if ( (LA13_0=='I') ) {s = 21;}

                        else if ( (LA13_0=='i') ) {s = 22;}

                        else if ( (LA13_0=='K') ) {s = 23;}

                        else if ( (LA13_0=='^') ) {s = 24;}

                        else if ( (LA13_0=='A'||LA13_0=='D'||(LA13_0>='F' && LA13_0<='H')||LA13_0=='J'||(LA13_0>='M' && LA13_0<='N')||LA13_0=='Q'||(LA13_0>='U' && LA13_0<='V')||(LA13_0>='X' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='d' && LA13_0<='e')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='n')||(LA13_0>='p' && LA13_0<='q')||(LA13_0>='u' && LA13_0<='z')) ) {s = 25;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 26;}

                        else if ( (LA13_0=='\"') ) {s = 27;}

                        else if ( (LA13_0=='\'') ) {s = 28;}

                        else if ( (LA13_0=='/') ) {s = 29;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 30;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||LA13_0=='-'||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_27 = input.LA(1);

                        s = -1;
                        if ( ((LA13_27>='\u0000' && LA13_27<='\uFFFF')) ) {s = 68;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_28 = input.LA(1);

                        s = -1;
                        if ( ((LA13_28>='\u0000' && LA13_28<='\uFFFF')) ) {s = 68;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}