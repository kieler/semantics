package de.cau.rtsys.peu.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRailSLLexer extends Lexer {
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int RULE_SEG_NAME=5;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_BLOCK_END=4;
    public static final int T__20=20;
    public static final int T__21=21;

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

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:12:7: ( 'Set track' )
            // InternalRailSL.g:12:9: 'Set track'
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
            // InternalRailSL.g:13:7: ( 'to' )
            // InternalRailSL.g:13:9: 'to'
            {
            match("to"); 


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
            // InternalRailSL.g:14:7: ( '.' )
            // InternalRailSL.g:14:9: '.'
            {
            match('.'); 

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
            // InternalRailSL.g:15:7: ( 'reverse' )
            // InternalRailSL.g:15:9: 'reverse'
            {
            match("reverse"); 


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
            // InternalRailSL.g:16:7: ( 'go' )
            // InternalRailSL.g:16:9: 'go'
            {
            match("go"); 


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
            // InternalRailSL.g:17:7: ( 'slow' )
            // InternalRailSL.g:17:9: 'slow'
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
            // InternalRailSL.g:18:7: ( 'stop' )
            // InternalRailSL.g:18:9: 'stop'
            {
            match("stop"); 


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
            // InternalRailSL.g:19:7: ( 'Set point' )
            // InternalRailSL.g:19:9: 'Set point'
            {
            match("Set point"); 


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
            // InternalRailSL.g:20:7: ( 'straight' )
            // InternalRailSL.g:20:9: 'straight'
            {
            match("straight"); 


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
            // InternalRailSL.g:21:7: ( 'branch' )
            // InternalRailSL.g:21:9: 'branch'
            {
            match("branch"); 


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
            // InternalRailSL.g:22:7: ( 'Wait for' )
            // InternalRailSL.g:22:9: 'Wait for'
            {
            match("Wait for"); 


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
            // InternalRailSL.g:23:7: ( 'seconds.' )
            // InternalRailSL.g:23:9: 'seconds.'
            {
            match("seconds."); 


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
            // InternalRailSL.g:24:7: ( 'Reach' )
            // InternalRailSL.g:24:9: 'Reach'
            {
            match("Reach"); 


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
            // InternalRailSL.g:25:7: ( 'Pass' )
            // InternalRailSL.g:25:9: 'Pass'
            {
            match("Pass"); 


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
            // InternalRailSL.g:26:7: ( 'first' )
            // InternalRailSL.g:26:9: 'first'
            {
            match("first"); 


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
            // InternalRailSL.g:27:7: ( 'second' )
            // InternalRailSL.g:27:9: 'second'
            {
            match("second"); 


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
            // InternalRailSL.g:28:7: ( 'contact of' )
            // InternalRailSL.g:28:9: 'contact of'
            {
            match("contact of"); 


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
            // InternalRailSL.g:29:7: ( 'Open' )
            // InternalRailSL.g:29:9: 'Open'
            {
            match("Open"); 


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
            // InternalRailSL.g:30:7: ( 'Close' )
            // InternalRailSL.g:30:9: 'Close'
            {
            match("Close"); 


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
            // InternalRailSL.g:31:7: ( 'crossing.' )
            // InternalRailSL.g:31:9: 'crossing.'
            {
            match("crossing."); 


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
            // InternalRailSL.g:32:7: ( 'Turn light' )
            // InternalRailSL.g:32:9: 'Turn light'
            {
            match("Turn light"); 


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
            // InternalRailSL.g:33:7: ( 'on' )
            // InternalRailSL.g:33:9: 'on'
            {
            match("on"); 


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
            // InternalRailSL.g:34:7: ( 'off' )
            // InternalRailSL.g:34:9: 'off'
            {
            match("off"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "RULE_BLOCK_END"
    public final void mRULE_BLOCK_END() throws RecognitionException {
        try {
            int _type = RULE_BLOCK_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:757:16: ( ( 'End.' | 'Loop.' ) )
            // InternalRailSL.g:757:18: ( 'End.' | 'Loop.' )
            {
            // InternalRailSL.g:757:18: ( 'End.' | 'Loop.' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='E') ) {
                alt1=1;
            }
            else if ( (LA1_0=='L') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRailSL.g:757:19: 'End.'
                    {
                    match("End."); 


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:757:26: 'Loop.'
                    {
                    match("Loop."); 


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
    // $ANTLR end "RULE_BLOCK_END"

    // $ANTLR start "RULE_SEG_NAME"
    public final void mRULE_SEG_NAME() throws RecognitionException {
        try {
            int _type = RULE_SEG_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailSL.g:759:15: ( ( 'KH_ST_0' | 'KH_ST_1' | 'KH_ST_2' | 'KH_ST_3' | 'KH_ST_4' | 'KH_ST_5' | 'KH_ST_6' | 'KH_LN_0' | 'KH_LN_1' | 'KH_LN_2' | 'KH_LN_3' | 'KH_LN_4' | 'KH_LN_5' | 'KH_LN_6' | 'KH_LN_7' | 'KH_LN_8' | 'KIO_LN_0' | 'KIO_LN_1' | 'OC_ST_0' | 'OC_ST_1' | 'OC_ST_2' | 'OC_ST_3' | 'OC_ST_4' | 'OC_LN_0' | 'OC_LN_1' | 'OC_LN_2' | 'OC_LN_3' | 'OC_LN_4' | 'OC_LN_5' | 'IC_ST_0' | 'IC_ST_1' | 'IC_ST_2' | 'IC_ST_3' | 'IC_ST_4' | 'IC_LN_0' | 'IC_LN_1' | 'IC_LN_2' | 'IC_LN_3' | 'IC_LN_4' | 'IC_LN_5' | 'OC_JCT_0' | 'IC_JCT_0' | 'OI_LN_0' | 'OI_LN_1' | 'OI_LN_2' | 'IO_LN_0' | 'IO_LN_1' | 'IO_LN_2' ) )
            // InternalRailSL.g:759:17: ( 'KH_ST_0' | 'KH_ST_1' | 'KH_ST_2' | 'KH_ST_3' | 'KH_ST_4' | 'KH_ST_5' | 'KH_ST_6' | 'KH_LN_0' | 'KH_LN_1' | 'KH_LN_2' | 'KH_LN_3' | 'KH_LN_4' | 'KH_LN_5' | 'KH_LN_6' | 'KH_LN_7' | 'KH_LN_8' | 'KIO_LN_0' | 'KIO_LN_1' | 'OC_ST_0' | 'OC_ST_1' | 'OC_ST_2' | 'OC_ST_3' | 'OC_ST_4' | 'OC_LN_0' | 'OC_LN_1' | 'OC_LN_2' | 'OC_LN_3' | 'OC_LN_4' | 'OC_LN_5' | 'IC_ST_0' | 'IC_ST_1' | 'IC_ST_2' | 'IC_ST_3' | 'IC_ST_4' | 'IC_LN_0' | 'IC_LN_1' | 'IC_LN_2' | 'IC_LN_3' | 'IC_LN_4' | 'IC_LN_5' | 'OC_JCT_0' | 'IC_JCT_0' | 'OI_LN_0' | 'OI_LN_1' | 'OI_LN_2' | 'IO_LN_0' | 'IO_LN_1' | 'IO_LN_2' )
            {
            // InternalRailSL.g:759:17: ( 'KH_ST_0' | 'KH_ST_1' | 'KH_ST_2' | 'KH_ST_3' | 'KH_ST_4' | 'KH_ST_5' | 'KH_ST_6' | 'KH_LN_0' | 'KH_LN_1' | 'KH_LN_2' | 'KH_LN_3' | 'KH_LN_4' | 'KH_LN_5' | 'KH_LN_6' | 'KH_LN_7' | 'KH_LN_8' | 'KIO_LN_0' | 'KIO_LN_1' | 'OC_ST_0' | 'OC_ST_1' | 'OC_ST_2' | 'OC_ST_3' | 'OC_ST_4' | 'OC_LN_0' | 'OC_LN_1' | 'OC_LN_2' | 'OC_LN_3' | 'OC_LN_4' | 'OC_LN_5' | 'IC_ST_0' | 'IC_ST_1' | 'IC_ST_2' | 'IC_ST_3' | 'IC_ST_4' | 'IC_LN_0' | 'IC_LN_1' | 'IC_LN_2' | 'IC_LN_3' | 'IC_LN_4' | 'IC_LN_5' | 'OC_JCT_0' | 'IC_JCT_0' | 'OI_LN_0' | 'OI_LN_1' | 'OI_LN_2' | 'IO_LN_0' | 'IO_LN_1' | 'IO_LN_2' )
            int alt2=48;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalRailSL.g:759:18: 'KH_ST_0'
                    {
                    match("KH_ST_0"); 


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:759:28: 'KH_ST_1'
                    {
                    match("KH_ST_1"); 


                    }
                    break;
                case 3 :
                    // InternalRailSL.g:759:38: 'KH_ST_2'
                    {
                    match("KH_ST_2"); 


                    }
                    break;
                case 4 :
                    // InternalRailSL.g:759:48: 'KH_ST_3'
                    {
                    match("KH_ST_3"); 


                    }
                    break;
                case 5 :
                    // InternalRailSL.g:759:58: 'KH_ST_4'
                    {
                    match("KH_ST_4"); 


                    }
                    break;
                case 6 :
                    // InternalRailSL.g:759:68: 'KH_ST_5'
                    {
                    match("KH_ST_5"); 


                    }
                    break;
                case 7 :
                    // InternalRailSL.g:759:78: 'KH_ST_6'
                    {
                    match("KH_ST_6"); 


                    }
                    break;
                case 8 :
                    // InternalRailSL.g:759:88: 'KH_LN_0'
                    {
                    match("KH_LN_0"); 


                    }
                    break;
                case 9 :
                    // InternalRailSL.g:759:98: 'KH_LN_1'
                    {
                    match("KH_LN_1"); 


                    }
                    break;
                case 10 :
                    // InternalRailSL.g:759:108: 'KH_LN_2'
                    {
                    match("KH_LN_2"); 


                    }
                    break;
                case 11 :
                    // InternalRailSL.g:759:118: 'KH_LN_3'
                    {
                    match("KH_LN_3"); 


                    }
                    break;
                case 12 :
                    // InternalRailSL.g:759:128: 'KH_LN_4'
                    {
                    match("KH_LN_4"); 


                    }
                    break;
                case 13 :
                    // InternalRailSL.g:759:138: 'KH_LN_5'
                    {
                    match("KH_LN_5"); 


                    }
                    break;
                case 14 :
                    // InternalRailSL.g:759:148: 'KH_LN_6'
                    {
                    match("KH_LN_6"); 


                    }
                    break;
                case 15 :
                    // InternalRailSL.g:759:158: 'KH_LN_7'
                    {
                    match("KH_LN_7"); 


                    }
                    break;
                case 16 :
                    // InternalRailSL.g:759:168: 'KH_LN_8'
                    {
                    match("KH_LN_8"); 


                    }
                    break;
                case 17 :
                    // InternalRailSL.g:759:178: 'KIO_LN_0'
                    {
                    match("KIO_LN_0"); 


                    }
                    break;
                case 18 :
                    // InternalRailSL.g:759:189: 'KIO_LN_1'
                    {
                    match("KIO_LN_1"); 


                    }
                    break;
                case 19 :
                    // InternalRailSL.g:759:200: 'OC_ST_0'
                    {
                    match("OC_ST_0"); 


                    }
                    break;
                case 20 :
                    // InternalRailSL.g:759:210: 'OC_ST_1'
                    {
                    match("OC_ST_1"); 


                    }
                    break;
                case 21 :
                    // InternalRailSL.g:759:220: 'OC_ST_2'
                    {
                    match("OC_ST_2"); 


                    }
                    break;
                case 22 :
                    // InternalRailSL.g:759:230: 'OC_ST_3'
                    {
                    match("OC_ST_3"); 


                    }
                    break;
                case 23 :
                    // InternalRailSL.g:759:240: 'OC_ST_4'
                    {
                    match("OC_ST_4"); 


                    }
                    break;
                case 24 :
                    // InternalRailSL.g:759:250: 'OC_LN_0'
                    {
                    match("OC_LN_0"); 


                    }
                    break;
                case 25 :
                    // InternalRailSL.g:759:260: 'OC_LN_1'
                    {
                    match("OC_LN_1"); 


                    }
                    break;
                case 26 :
                    // InternalRailSL.g:759:270: 'OC_LN_2'
                    {
                    match("OC_LN_2"); 


                    }
                    break;
                case 27 :
                    // InternalRailSL.g:759:280: 'OC_LN_3'
                    {
                    match("OC_LN_3"); 


                    }
                    break;
                case 28 :
                    // InternalRailSL.g:759:290: 'OC_LN_4'
                    {
                    match("OC_LN_4"); 


                    }
                    break;
                case 29 :
                    // InternalRailSL.g:759:300: 'OC_LN_5'
                    {
                    match("OC_LN_5"); 


                    }
                    break;
                case 30 :
                    // InternalRailSL.g:759:310: 'IC_ST_0'
                    {
                    match("IC_ST_0"); 


                    }
                    break;
                case 31 :
                    // InternalRailSL.g:759:320: 'IC_ST_1'
                    {
                    match("IC_ST_1"); 


                    }
                    break;
                case 32 :
                    // InternalRailSL.g:759:330: 'IC_ST_2'
                    {
                    match("IC_ST_2"); 


                    }
                    break;
                case 33 :
                    // InternalRailSL.g:759:340: 'IC_ST_3'
                    {
                    match("IC_ST_3"); 


                    }
                    break;
                case 34 :
                    // InternalRailSL.g:759:350: 'IC_ST_4'
                    {
                    match("IC_ST_4"); 


                    }
                    break;
                case 35 :
                    // InternalRailSL.g:759:360: 'IC_LN_0'
                    {
                    match("IC_LN_0"); 


                    }
                    break;
                case 36 :
                    // InternalRailSL.g:759:370: 'IC_LN_1'
                    {
                    match("IC_LN_1"); 


                    }
                    break;
                case 37 :
                    // InternalRailSL.g:759:380: 'IC_LN_2'
                    {
                    match("IC_LN_2"); 


                    }
                    break;
                case 38 :
                    // InternalRailSL.g:759:390: 'IC_LN_3'
                    {
                    match("IC_LN_3"); 


                    }
                    break;
                case 39 :
                    // InternalRailSL.g:759:400: 'IC_LN_4'
                    {
                    match("IC_LN_4"); 


                    }
                    break;
                case 40 :
                    // InternalRailSL.g:759:410: 'IC_LN_5'
                    {
                    match("IC_LN_5"); 


                    }
                    break;
                case 41 :
                    // InternalRailSL.g:759:420: 'OC_JCT_0'
                    {
                    match("OC_JCT_0"); 


                    }
                    break;
                case 42 :
                    // InternalRailSL.g:759:431: 'IC_JCT_0'
                    {
                    match("IC_JCT_0"); 


                    }
                    break;
                case 43 :
                    // InternalRailSL.g:759:442: 'OI_LN_0'
                    {
                    match("OI_LN_0"); 


                    }
                    break;
                case 44 :
                    // InternalRailSL.g:759:452: 'OI_LN_1'
                    {
                    match("OI_LN_1"); 


                    }
                    break;
                case 45 :
                    // InternalRailSL.g:759:462: 'OI_LN_2'
                    {
                    match("OI_LN_2"); 


                    }
                    break;
                case 46 :
                    // InternalRailSL.g:759:472: 'IO_LN_0'
                    {
                    match("IO_LN_0"); 


                    }
                    break;
                case 47 :
                    // InternalRailSL.g:759:482: 'IO_LN_1'
                    {
                    match("IO_LN_1"); 


                    }
                    break;
                case 48 :
                    // InternalRailSL.g:759:492: 'IO_LN_2'
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
            // InternalRailSL.g:761:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRailSL.g:761:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRailSL.g:761:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRailSL.g:761:11: '^'
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

            // InternalRailSL.g:761:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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
            // InternalRailSL.g:763:10: ( ( '0' .. '9' )+ )
            // InternalRailSL.g:763:12: ( '0' .. '9' )+
            {
            // InternalRailSL.g:763:12: ( '0' .. '9' )+
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
            	    // InternalRailSL.g:763:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalRailSL.g:765:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRailSL.g:765:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRailSL.g:765:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRailSL.g:765:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRailSL.g:765:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRailSL.g:765:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRailSL.g:765:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:765:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRailSL.g:765:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRailSL.g:765:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRailSL.g:765:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalRailSL.g:767:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRailSL.g:767:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRailSL.g:767:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRailSL.g:767:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalRailSL.g:769:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRailSL.g:769:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRailSL.g:769:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRailSL.g:769:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalRailSL.g:769:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRailSL.g:769:41: ( '\\r' )? '\\n'
                    {
                    // InternalRailSL.g:769:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalRailSL.g:769:41: '\\r'
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
            // InternalRailSL.g:771:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRailSL.g:771:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRailSL.g:771:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalRailSL.g:773:16: ( . )
            // InternalRailSL.g:773:18: .
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
        // InternalRailSL.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_BLOCK_END | RULE_SEG_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=33;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalRailSL.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalRailSL.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalRailSL.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalRailSL.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalRailSL.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalRailSL.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalRailSL.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalRailSL.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalRailSL.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalRailSL.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalRailSL.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalRailSL.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalRailSL.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalRailSL.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalRailSL.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalRailSL.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalRailSL.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalRailSL.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalRailSL.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalRailSL.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalRailSL.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalRailSL.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalRailSL.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalRailSL.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalRailSL.g:1:154: RULE_BLOCK_END
                {
                mRULE_BLOCK_END(); 

                }
                break;
            case 26 :
                // InternalRailSL.g:1:169: RULE_SEG_NAME
                {
                mRULE_SEG_NAME(); 

                }
                break;
            case 27 :
                // InternalRailSL.g:1:183: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // InternalRailSL.g:1:191: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // InternalRailSL.g:1:200: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // InternalRailSL.g:1:212: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // InternalRailSL.g:1:228: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // InternalRailSL.g:1:244: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // InternalRailSL.g:1:252: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA2_eotS =
        "\134\uffff";
    static final String DFA2_eofS =
        "\134\uffff";
    static final String DFA2_minS =
        "\1\111\1\110\2\103\1\137\1\117\4\137\1\114\1\137\1\112\1\114\1\112\1\114\1\124\1\116\1\114\1\124\1\116\1\uffff\1\116\1\124\1\116\1\uffff\1\116\2\137\1\116\6\137\2\60\1\137\6\60\20\uffff\1\60\36\uffff";
    static final String DFA2_maxS =
        "\1\117\2\111\1\117\1\137\1\117\4\137\1\123\1\137\1\123\1\114\1\123\1\114\1\124\1\116\1\114\1\124\1\116\1\uffff\1\116\1\124\1\116\1\uffff\1\116\2\137\1\116\6\137\1\66\1\70\1\137\1\64\1\65\1\62\1\64\1\65\1\62\20\uffff\1\61\36\uffff";
    static final String DFA2_acceptS =
        "\25\uffff\1\51\3\uffff\1\52\23\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\53\1\54\1\55\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\56\1\57\1\60\1\21\1\22";
    static final String DFA2_specialS =
        "\134\uffff}>";
    static final String[] DFA2_transitionS = {
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

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "759:17: ( 'KH_ST_0' | 'KH_ST_1' | 'KH_ST_2' | 'KH_ST_3' | 'KH_ST_4' | 'KH_ST_5' | 'KH_ST_6' | 'KH_LN_0' | 'KH_LN_1' | 'KH_LN_2' | 'KH_LN_3' | 'KH_LN_4' | 'KH_LN_5' | 'KH_LN_6' | 'KH_LN_7' | 'KH_LN_8' | 'KIO_LN_0' | 'KIO_LN_1' | 'OC_ST_0' | 'OC_ST_1' | 'OC_ST_2' | 'OC_ST_3' | 'OC_ST_4' | 'OC_LN_0' | 'OC_LN_1' | 'OC_LN_2' | 'OC_LN_3' | 'OC_LN_4' | 'OC_LN_5' | 'IC_ST_0' | 'IC_ST_1' | 'IC_ST_2' | 'IC_ST_3' | 'IC_ST_4' | 'IC_LN_0' | 'IC_LN_1' | 'IC_LN_2' | 'IC_LN_3' | 'IC_LN_4' | 'IC_LN_5' | 'OC_JCT_0' | 'IC_JCT_0' | 'OI_LN_0' | 'OI_LN_1' | 'OI_LN_2' | 'IO_LN_0' | 'IO_LN_1' | 'IO_LN_2' )";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\2\37\1\uffff\21\37\1\34\2\uffff\3\34\2\uffff\2\37\1\uffff\1\102\1\uffff\1\37\1\104\17\37\1\125\7\37\5\uffff\2\37\1\uffff\1\37\1\uffff\20\37\1\uffff\1\162\7\37\1\uffff\1\37\1\u0080\1\u0081\5\37\1\u0087\3\37\1\u008b\6\37\2\uffff\11\37\2\uffff\1\37\2\uffff\3\37\1\uffff\1\u009e\1\uffff\1\u009f\2\37\1\uffff\4\37\1\u00a6\1\uffff\7\37\1\uffff\2\37\1\u00b1\1\u00b2\2\uffff\6\37\1\uffff\7\37\1\u00e4\2\37\2\uffff\2\37\13\u00e9\1\37\23\u00e9\1\37\13\u00e9\1\37\3\u00e9\1\uffff\1\u00ee\2\uffff\1\37\1\uffff\4\u00e9\2\uffff";
    static final String DFA14_eofS =
        "\u00f0\uffff";
    static final String DFA14_minS =
        "\1\0\1\145\1\157\1\uffff\1\145\1\157\1\145\1\162\1\141\1\145\1\141\1\151\1\157\1\103\1\154\1\165\1\146\1\156\1\157\1\110\1\103\1\101\2\uffff\2\0\1\52\2\uffff\1\141\1\164\1\uffff\1\60\1\uffff\1\166\1\60\2\157\1\143\1\141\1\151\1\141\1\163\1\162\1\156\1\157\1\145\2\137\1\157\1\162\1\60\1\146\1\144\1\157\1\137\1\117\2\137\5\uffff\1\162\1\40\1\uffff\1\145\1\uffff\1\167\1\160\1\141\1\157\1\156\1\164\1\143\2\163\1\164\1\163\1\156\1\112\1\114\1\163\1\156\1\uffff\1\60\1\56\1\160\1\114\1\137\1\112\1\114\1\164\1\160\1\162\2\60\1\151\1\156\1\143\1\40\1\150\1\60\1\164\1\141\1\163\1\60\1\124\1\116\1\103\1\116\1\145\1\40\2\uffff\1\56\1\124\1\116\1\114\1\124\1\116\1\103\1\116\1\72\2\uffff\1\163\2\uffff\1\147\1\144\1\150\1\uffff\1\60\1\uffff\1\60\1\143\1\151\1\uffff\2\137\1\124\1\137\1\60\1\uffff\2\137\1\116\2\137\1\124\1\137\1\uffff\1\145\1\150\2\60\2\uffff\1\164\1\156\2\60\1\137\1\60\1\uffff\2\60\1\137\2\60\1\137\2\60\1\164\1\56\2\uffff\1\40\1\147\57\60\1\uffff\1\60\2\uffff\1\56\1\uffff\4\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\164\1\157\1\uffff\1\145\1\157\1\164\1\162\1\141\1\145\1\141\1\151\1\162\1\160\1\154\1\165\2\156\1\157\1\111\1\117\1\172\2\uffff\2\uffff\1\57\2\uffff\1\141\1\164\1\uffff\1\172\1\uffff\1\166\1\172\1\157\1\162\1\143\1\141\1\151\1\141\1\163\1\162\1\156\1\157\1\145\2\137\1\157\1\162\1\172\1\146\1\144\1\157\1\137\1\117\2\137\5\uffff\1\162\1\40\1\uffff\1\145\1\uffff\1\167\1\160\1\141\1\157\1\156\1\164\1\143\2\163\1\164\1\163\1\156\1\123\1\114\1\163\1\156\1\uffff\1\172\1\56\1\160\1\123\1\137\1\123\1\114\2\164\1\162\2\172\1\151\1\156\1\143\1\40\1\150\1\172\1\164\1\141\1\163\1\172\1\124\1\116\1\103\1\116\1\145\1\40\2\uffff\1\56\1\124\1\116\1\114\1\124\1\116\1\103\1\116\1\72\2\uffff\1\163\2\uffff\1\147\1\144\1\150\1\uffff\1\172\1\uffff\1\172\1\143\1\151\1\uffff\2\137\1\124\1\137\1\172\1\uffff\2\137\1\116\2\137\1\124\1\137\1\uffff\1\145\1\150\2\172\2\uffff\1\164\1\156\1\64\1\65\1\137\1\62\1\uffff\1\66\1\70\1\137\1\64\1\65\1\137\1\62\1\172\1\164\1\56\2\uffff\1\40\1\147\13\172\1\60\23\172\1\61\13\172\1\60\3\172\1\uffff\1\172\2\uffff\1\56\1\uffff\4\172\2\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\4\22\uffff\1\33\1\34\3\uffff\1\40\1\41\2\uffff\1\33\1\uffff\1\4\31\uffff\1\34\1\35\1\36\1\37\1\40\2\uffff\1\3\1\uffff\1\6\20\uffff\1\27\34\uffff\1\30\1\31\11\uffff\1\2\1\11\1\uffff\1\7\1\10\3\uffff\1\14\1\uffff\1\17\3\uffff\1\23\5\uffff\1\26\7\uffff\1\1\4\uffff\1\16\1\20\6\uffff\1\24\12\uffff\1\21\1\13\61\uffff\1\5\1\uffff\1\15\1\22\1\uffff\1\32\4\uffff\1\12\1\25";
    static final String DFA14_specialS =
        "\1\1\27\uffff\1\0\1\2\u00d6\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\30\4\34\1\31\6\34\1\3\1\32\12\27\7\34\2\26\1\16\1\26\1\21\3\26\1\24\1\26\1\23\1\22\2\26\1\15\1\12\1\26\1\11\1\1\1\17\2\26\1\10\3\26\3\34\1\25\1\26\1\34\1\26\1\7\1\14\2\26\1\13\1\5\7\26\1\20\2\26\1\4\1\6\1\2\6\26\uff85\34",
            "\1\36\16\uffff\1\35",
            "\1\40",
            "",
            "\1\42",
            "\1\43",
            "\1\46\6\uffff\1\44\7\uffff\1\45",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54\2\uffff\1\55",
            "\1\57\5\uffff\1\60\46\uffff\1\56",
            "\1\61",
            "\1\62",
            "\1\64\7\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\67\1\70",
            "\1\71\13\uffff\1\72",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\74",
            "\0\74",
            "\1\75\4\uffff\1\76",
            "",
            "",
            "\1\100",
            "\1\101",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\103",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\105",
            "\1\106\2\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\156\1\uffff\1\155\6\uffff\1\154",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\163",
            "\1\164",
            "\1\166\6\uffff\1\165",
            "\1\167",
            "\1\172\1\uffff\1\171\6\uffff\1\170",
            "\1\173",
            "\1\174",
            "\1\176\3\uffff\1\175",
            "\1\177",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "",
            "\1\163",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "",
            "\1\u009a",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\22\37\1\u00b0\7\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9",
            "\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf",
            "\1\u00c0",
            "\1\u00c1\1\u00c2\1\u00c3",
            "",
            "\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca",
            "\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\u00d3",
            "\1\u00d4",
            "\1\u00d5\1\u00d6\1\u00d7\1\u00d8\1\u00d9",
            "\1\u00da\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df",
            "\1\u00e0",
            "\1\u00e1\1\u00e2\1\u00e3",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00ea",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00eb\1\u00ec",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00ed",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u00ef",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_BLOCK_END | RULE_SEG_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_24 = input.LA(1);

                        s = -1;
                        if ( ((LA14_24>='\u0000' && LA14_24<='\uFFFF')) ) {s = 60;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='S') ) {s = 1;}

                        else if ( (LA14_0=='t') ) {s = 2;}

                        else if ( (LA14_0=='.') ) {s = 3;}

                        else if ( (LA14_0=='r') ) {s = 4;}

                        else if ( (LA14_0=='g') ) {s = 5;}

                        else if ( (LA14_0=='s') ) {s = 6;}

                        else if ( (LA14_0=='b') ) {s = 7;}

                        else if ( (LA14_0=='W') ) {s = 8;}

                        else if ( (LA14_0=='R') ) {s = 9;}

                        else if ( (LA14_0=='P') ) {s = 10;}

                        else if ( (LA14_0=='f') ) {s = 11;}

                        else if ( (LA14_0=='c') ) {s = 12;}

                        else if ( (LA14_0=='O') ) {s = 13;}

                        else if ( (LA14_0=='C') ) {s = 14;}

                        else if ( (LA14_0=='T') ) {s = 15;}

                        else if ( (LA14_0=='o') ) {s = 16;}

                        else if ( (LA14_0=='E') ) {s = 17;}

                        else if ( (LA14_0=='L') ) {s = 18;}

                        else if ( (LA14_0=='K') ) {s = 19;}

                        else if ( (LA14_0=='I') ) {s = 20;}

                        else if ( (LA14_0=='^') ) {s = 21;}

                        else if ( ((LA14_0>='A' && LA14_0<='B')||LA14_0=='D'||(LA14_0>='F' && LA14_0<='H')||LA14_0=='J'||(LA14_0>='M' && LA14_0<='N')||LA14_0=='Q'||(LA14_0>='U' && LA14_0<='V')||(LA14_0>='X' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='a'||(LA14_0>='d' && LA14_0<='e')||(LA14_0>='h' && LA14_0<='n')||(LA14_0>='p' && LA14_0<='q')||(LA14_0>='u' && LA14_0<='z')) ) {s = 22;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 23;}

                        else if ( (LA14_0=='\"') ) {s = 24;}

                        else if ( (LA14_0=='\'') ) {s = 25;}

                        else if ( (LA14_0=='/') ) {s = 26;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 27;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='-')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_25 = input.LA(1);

                        s = -1;
                        if ( ((LA14_25>='\u0000' && LA14_25<='\uFFFF')) ) {s = 60;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}