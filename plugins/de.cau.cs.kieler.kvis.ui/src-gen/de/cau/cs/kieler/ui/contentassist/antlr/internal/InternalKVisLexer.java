package de.cau.cs.kieler.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKVisLexer extends Lexer {
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=12;
    public static final int RULE_DIGIT=8;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_FLOAT=5;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalKVisLexer() {;} 
    public InternalKVisLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKVisLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKVis.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKVis.g:11:7: ( '=' )
            // InternalKVis.g:11:9: '='
            {
            match('='); 

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
            // InternalKVis.g:12:7: ( '<' )
            // InternalKVis.g:12:9: '<'
            {
            match('<'); 

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
            // InternalKVis.g:13:7: ( '<=' )
            // InternalKVis.g:13:9: '<='
            {
            match("<="); 


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
            // InternalKVis.g:14:7: ( '>' )
            // InternalKVis.g:14:9: '>'
            {
            match('>'); 

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
            // InternalKVis.g:15:7: ( '>=' )
            // InternalKVis.g:15:9: '>='
            {
            match(">="); 


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
            // InternalKVis.g:16:7: ( '!=' )
            // InternalKVis.g:16:9: '!='
            {
            match("!="); 


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
            // InternalKVis.g:17:7: ( 'set color' )
            // InternalKVis.g:17:9: 'set color'
            {
            match("set color"); 


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
            // InternalKVis.g:18:7: ( 'set text' )
            // InternalKVis.g:18:9: 'set text'
            {
            match("set text"); 


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
            // InternalKVis.g:19:7: ( 'rotate' )
            // InternalKVis.g:19:9: 'rotate'
            {
            match("rotate"); 


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
            // InternalKVis.g:20:7: ( 'move' )
            // InternalKVis.g:20:9: 'move'
            {
            match("move"); 


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
            // InternalKVis.g:21:7: ( 'set visible' )
            // InternalKVis.g:21:9: 'set visible'
            {
            match("set visible"); 


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
            // InternalKVis.g:22:7: ( 'image' )
            // InternalKVis.g:22:9: 'image'
            {
            match("image"); 


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
            // InternalKVis.g:23:7: ( ':' )
            // InternalKVis.g:23:9: ':'
            {
            match(':'); 

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
            // InternalKVis.g:24:7: ( 'animate' )
            // InternalKVis.g:24:9: 'animate'
            {
            match("animate"); 


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
            // InternalKVis.g:25:7: ( '{' )
            // InternalKVis.g:25:9: '{'
            {
            match('{'); 

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
            // InternalKVis.g:26:7: ( '}' )
            // InternalKVis.g:26:9: '}'
            {
            match('}'); 

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
            // InternalKVis.g:27:7: ( 'using' )
            // InternalKVis.g:27:9: 'using'
            {
            match("using"); 


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
            // InternalKVis.g:28:7: ( ',' )
            // InternalKVis.g:28:9: ','
            {
            match(','); 

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
            // InternalKVis.g:29:7: ( 'is' )
            // InternalKVis.g:29:9: 'is'
            {
            match("is"); 


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
            // InternalKVis.g:30:7: ( '..' )
            // InternalKVis.g:30:9: '..'
            {
            match(".."); 


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
            // InternalKVis.g:31:7: ( 'when' )
            // InternalKVis.g:31:9: 'when'
            {
            match("when"); 


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
            // InternalKVis.g:32:7: ( '[' )
            // InternalKVis.g:32:9: '['
            {
            match('['); 

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
            // InternalKVis.g:33:7: ( ']' )
            // InternalKVis.g:33:9: ']'
            {
            match(']'); 

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
            // InternalKVis.g:34:7: ( '.' )
            // InternalKVis.g:34:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalKVis.g:2495:21: ( '0' .. '9' )
            // InternalKVis.g:2495:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKVis.g:2497:10: ( ( RULE_DIGIT )+ )
            // InternalKVis.g:2497:12: ( RULE_DIGIT )+
            {
            // InternalKVis.g:2497:12: ( RULE_DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKVis.g:2497:12: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
            // InternalKVis.g:2499:12: ( ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )? ( 'f' )? | ( RULE_DIGIT )+ 'f' ) )
            // InternalKVis.g:2499:14: ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )? ( 'f' )? | ( RULE_DIGIT )+ 'f' )
            {
            // InternalKVis.g:2499:14: ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )? ( 'f' )? | ( RULE_DIGIT )+ 'f' )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalKVis.g:2499:15: ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )? ( 'f' )?
                    {
                    // InternalKVis.g:2499:15: ( RULE_DIGIT )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalKVis.g:2499:15: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    match('.'); 
                    // InternalKVis.g:2499:31: ( RULE_DIGIT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalKVis.g:2499:31: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // InternalKVis.g:2499:43: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalKVis.g:2499:44: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalKVis.g:2499:54: ( '+' | '-' )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='+'||LA4_0=='-') ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // InternalKVis.g:
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

                            // InternalKVis.g:2499:65: ( RULE_DIGIT )+
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
                            	    // InternalKVis.g:2499:65: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

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
                            break;

                    }

                    // InternalKVis.g:2499:79: ( 'f' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='f') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalKVis.g:2499:79: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:2499:84: ( RULE_DIGIT )+ 'f'
                    {
                    // InternalKVis.g:2499:84: ( RULE_DIGIT )+
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
                    	    // InternalKVis.g:2499:84: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

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
            // InternalKVis.g:2501:14: ( ( 'true' | 'false' ) )
            // InternalKVis.g:2501:16: ( 'true' | 'false' )
            {
            // InternalKVis.g:2501:16: ( 'true' | 'false' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='t') ) {
                alt10=1;
            }
            else if ( (LA10_0=='f') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalKVis.g:2501:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalKVis.g:2501:24: 'false'
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKVis.g:2503:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKVis.g:2503:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKVis.g:2503:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKVis.g:2503:11: '^'
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

            // InternalKVis.g:2503:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKVis.g:
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
            	    break loop12;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKVis.g:2505:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKVis.g:2505:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKVis.g:2505:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalKVis.g:2505:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKVis.g:2505:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalKVis.g:2505:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKVis.g:2505:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKVis.g:2505:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKVis.g:2505:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalKVis.g:2505:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKVis.g:2505:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop14;
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
            // InternalKVis.g:2507:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKVis.g:2507:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKVis.g:2507:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKVis.g:2507:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // InternalKVis.g:2509:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKVis.g:2509:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKVis.g:2509:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKVis.g:2509:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalKVis.g:2509:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKVis.g:2509:41: ( '\\r' )? '\\n'
                    {
                    // InternalKVis.g:2509:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalKVis.g:2509:41: '\\r'
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
            // InternalKVis.g:2511:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKVis.g:2511:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKVis.g:2511:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalKVis.g:
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
            // InternalKVis.g:2513:16: ( . )
            // InternalKVis.g:2513:18: .
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
        // InternalKVis.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=33;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalKVis.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalKVis.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalKVis.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalKVis.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalKVis.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalKVis.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalKVis.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalKVis.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalKVis.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalKVis.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalKVis.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalKVis.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalKVis.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalKVis.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalKVis.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalKVis.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalKVis.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalKVis.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalKVis.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalKVis.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalKVis.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalKVis.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalKVis.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalKVis.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalKVis.g:1:154: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // InternalKVis.g:1:163: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 27 :
                // InternalKVis.g:1:174: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 28 :
                // InternalKVis.g:1:187: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // InternalKVis.g:1:195: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // InternalKVis.g:1:207: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // InternalKVis.g:1:223: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // InternalKVis.g:1:239: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // InternalKVis.g:1:247: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA9_eotS =
        "\4\uffff";
    static final String DFA9_eofS =
        "\4\uffff";
    static final String DFA9_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA9_maxS =
        "\1\71\1\146\2\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\4\uffff}>";
    static final String[] DFA9_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\54\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    static class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "2499:14: ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )? ( 'f' )? | ( RULE_DIGIT )+ 'f' )";
        }
    }
    static final String DFA21_eotS =
        "\2\uffff\1\37\1\41\1\34\4\44\1\uffff\1\44\2\uffff\1\44\1\uffff\1\60\1\44\2\uffff\1\64\2\44\1\34\1\uffff\3\34\10\uffff\1\44\1\uffff\3\44\1\101\1\uffff\1\44\2\uffff\1\44\3\uffff\1\44\4\uffff\1\64\2\44\4\uffff\4\44\1\uffff\5\44\1\uffff\1\44\1\124\3\44\1\130\1\131\1\44\3\uffff\1\44\1\uffff\1\134\1\44\1\136\2\uffff\1\131\1\137\1\uffff\1\44\2\uffff\1\141\1\uffff";
    static final String DFA21_eofS =
        "\142\uffff";
    static final String DFA21_minS =
        "\1\0\1\uffff\3\75\1\145\2\157\1\155\1\uffff\1\156\2\uffff\1\163\1\uffff\1\56\1\150\2\uffff\1\56\1\162\1\141\1\101\1\uffff\2\0\1\52\10\uffff\1\164\1\uffff\1\164\1\166\1\141\1\60\1\uffff\1\151\2\uffff\1\151\3\uffff\1\145\4\uffff\1\56\1\165\1\154\4\uffff\1\40\1\141\1\145\1\147\1\uffff\1\155\2\156\1\145\1\163\1\143\1\164\1\60\1\145\1\141\1\147\2\60\1\145\3\uffff\1\145\1\uffff\1\60\1\164\1\60\2\uffff\2\60\1\uffff\1\145\2\uffff\1\60\1\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\uffff\3\75\1\145\2\157\1\163\1\uffff\1\156\2\uffff\1\163\1\uffff\1\56\1\150\2\uffff\1\146\1\162\1\141\1\172\1\uffff\2\uffff\1\57\10\uffff\1\164\1\uffff\1\164\1\166\1\141\1\172\1\uffff\1\151\2\uffff\1\151\3\uffff\1\145\4\uffff\1\146\1\165\1\154\4\uffff\1\40\1\141\1\145\1\147\1\uffff\1\155\2\156\1\145\1\163\1\166\1\164\1\172\1\145\1\141\1\147\2\172\1\145\3\uffff\1\145\1\uffff\1\172\1\164\1\172\2\uffff\2\172\1\uffff\1\145\2\uffff\1\172\1\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\7\uffff\1\15\1\uffff\1\17\1\20\1\uffff\1\22\2\uffff\1\26\1\27\4\uffff\1\34\3\uffff\1\40\1\41\1\1\1\3\1\2\1\5\1\4\1\6\1\uffff\1\34\4\uffff\1\15\1\uffff\1\17\1\20\1\uffff\1\22\1\24\1\30\1\uffff\1\26\1\27\1\31\1\32\3\uffff\1\35\1\36\1\37\1\40\4\uffff\1\23\16\uffff\1\7\1\10\1\13\1\uffff\1\12\3\uffff\1\25\1\33\2\uffff\1\14\1\uffff\1\21\1\11\1\uffff\1\16";
    static final String DFA21_specialS =
        "\1\1\27\uffff\1\2\1\0\110\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\4\1\30\4\34\1\31\4\34\1\16\1\34\1\17\1\32\12\23\1\11\1\34\1\2\1\1\1\3\2\34\32\27\1\21\1\34\1\22\1\26\1\27\1\34\1\12\4\27\1\25\2\27\1\10\3\27\1\7\4\27\1\6\1\5\1\24\1\15\1\27\1\20\3\27\1\13\1\34\1\14\uff82\34",
            "",
            "\1\36",
            "\1\40",
            "\1\42",
            "\1\43",
            "\1\45",
            "\1\46",
            "\1\47\5\uffff\1\50",
            "",
            "\1\52",
            "",
            "",
            "\1\55",
            "",
            "\1\57",
            "\1\61",
            "",
            "",
            "\1\65\1\uffff\12\66\54\uffff\1\65",
            "\1\67",
            "\1\70",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\0\71",
            "\0\71",
            "\1\72\4\uffff\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\102",
            "",
            "",
            "\1\103",
            "",
            "",
            "",
            "\1\104",
            "",
            "",
            "",
            "",
            "\1\65\1\uffff\12\66\54\uffff\1\65",
            "\1\105",
            "\1\106",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120\20\uffff\1\121\1\uffff\1\122",
            "\1\123",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\132",
            "",
            "",
            "",
            "\1\133",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\135",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\140",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_25 = input.LA(1);

                        s = -1;
                        if ( ((LA21_25>='\u0000' && LA21_25<='\uFFFF')) ) {s = 57;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='=') ) {s = 1;}

                        else if ( (LA21_0=='<') ) {s = 2;}

                        else if ( (LA21_0=='>') ) {s = 3;}

                        else if ( (LA21_0=='!') ) {s = 4;}

                        else if ( (LA21_0=='s') ) {s = 5;}

                        else if ( (LA21_0=='r') ) {s = 6;}

                        else if ( (LA21_0=='m') ) {s = 7;}

                        else if ( (LA21_0=='i') ) {s = 8;}

                        else if ( (LA21_0==':') ) {s = 9;}

                        else if ( (LA21_0=='a') ) {s = 10;}

                        else if ( (LA21_0=='{') ) {s = 11;}

                        else if ( (LA21_0=='}') ) {s = 12;}

                        else if ( (LA21_0=='u') ) {s = 13;}

                        else if ( (LA21_0==',') ) {s = 14;}

                        else if ( (LA21_0=='.') ) {s = 15;}

                        else if ( (LA21_0=='w') ) {s = 16;}

                        else if ( (LA21_0=='[') ) {s = 17;}

                        else if ( (LA21_0==']') ) {s = 18;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 19;}

                        else if ( (LA21_0=='t') ) {s = 20;}

                        else if ( (LA21_0=='f') ) {s = 21;}

                        else if ( (LA21_0=='^') ) {s = 22;}

                        else if ( ((LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='b' && LA21_0<='e')||(LA21_0>='g' && LA21_0<='h')||(LA21_0>='j' && LA21_0<='l')||(LA21_0>='n' && LA21_0<='q')||LA21_0=='v'||(LA21_0>='x' && LA21_0<='z')) ) {s = 23;}

                        else if ( (LA21_0=='\"') ) {s = 24;}

                        else if ( (LA21_0=='\'') ) {s = 25;}

                        else if ( (LA21_0=='/') ) {s = 26;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 27;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||(LA21_0>='#' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='+')||LA21_0=='-'||LA21_0==';'||(LA21_0>='?' && LA21_0<='@')||LA21_0=='\\'||LA21_0=='`'||LA21_0=='|'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_24 = input.LA(1);

                        s = -1;
                        if ( ((LA21_24>='\u0000' && LA21_24<='\uFFFF')) ) {s = 57;}

                        else s = 28;

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