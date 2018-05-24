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
    public static final int RULE_COMMENT_ANNOTATION=6;
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int RULE_SL_COMMENT_ANNOTATION=11;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_FLOAT=9;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:13:7: ( 'system' )
            // InternalKiCool.g:13:9: 'system'
            {
            match("system"); 


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
            // InternalKiCool.g:14:7: ( 'version' )
            // InternalKiCool.g:14:9: 'version'
            {
            match("version"); 


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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:16:7: ( 'input' )
            // InternalKiCool.g:16:9: 'input'
            {
            match("input"); 


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
            // InternalKiCool.g:17:7: ( 'set' )
            // InternalKiCool.g:17:9: 'set'
            {
            match("set"); 


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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:27:7: ( 'key' )
            // InternalKiCool.g:27:9: 'key'
            {
            match("key"); 


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
            // InternalKiCool.g:28:7: ( '@' )
            // InternalKiCool.g:28:9: '@'
            {
            match('@'); 

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
            // InternalKiCool.g:29:7: ( '#' )
            // InternalKiCool.g:29:9: '#'
            {
            match('#'); 

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
            // InternalKiCool.g:30:7: ( ',' )
            // InternalKiCool.g:30:9: ','
            {
            match(','); 

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
            // InternalKiCool.g:31:7: ( '.' )
            // InternalKiCool.g:31:9: '.'
            {
            match('.'); 

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
            // InternalKiCool.g:32:7: ( '-' )
            // InternalKiCool.g:32:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_COMMENT_ANNOTATION"
    public final void mRULE_COMMENT_ANNOTATION() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_ANNOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:2032:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalKiCool.g:2032:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalKiCool.g:2032:33: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKiCool.g:2032:61: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
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
            // InternalKiCool.g:2034:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalKiCool.g:2034:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKiCool.g:2034:31: ( options {greedy=false; } : . )*
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
            	    // InternalKiCool.g:2034:59: .
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
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT_ANNOTATION"
    public final void mRULE_SL_COMMENT_ANNOTATION() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT_ANNOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKiCool.g:2036:28: ( '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKiCool.g:2036:30: '//*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//*"); 

            // InternalKiCool.g:2036:36: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKiCool.g:2036:36: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop3;
                }
            } while (true);

            // InternalKiCool.g:2036:52: ( ( '\\r' )? '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKiCool.g:2036:53: ( '\\r' )? '\\n'
                    {
                    // InternalKiCool.g:2036:53: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalKiCool.g:2036:53: '\\r'
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
            // InternalKiCool.g:2038:17: ( '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKiCool.g:2038:19: '//' ~ ( '*' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKiCool.g:2038:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKiCool.g:2038:31: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop6;
                }
            } while (true);

            // InternalKiCool.g:2038:47: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKiCool.g:2038:48: ( '\\r' )? '\\n'
                    {
                    // InternalKiCool.g:2038:48: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalKiCool.g:2038:48: '\\r'
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
            // InternalKiCool.g:2040:22: ( '0' .. '9' )
            // InternalKiCool.g:2040:24: '0' .. '9'
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
            // InternalKiCool.g:2042:10: ( ( RULE_NUMBER )+ )
            // InternalKiCool.g:2042:12: ( RULE_NUMBER )+
            {
            // InternalKiCool.g:2042:12: ( RULE_NUMBER )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKiCool.g:2042:12: RULE_NUMBER
            	    {
            	    mRULE_NUMBER(); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // InternalKiCool.g:2044:12: ( ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' ) )
            // InternalKiCool.g:2044:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            {
            // InternalKiCool.g:2044:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalKiCool.g:2044:15: ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // InternalKiCool.g:2044:15: ( RULE_NUMBER )+
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
                    	    // InternalKiCool.g:2044:15: RULE_NUMBER
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

                    match('.'); 
                    // InternalKiCool.g:2044:32: ( RULE_NUMBER )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalKiCool.g:2044:32: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // InternalKiCool.g:2044:45: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalKiCool.g:2044:46: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalKiCool.g:2044:56: ( '+' | '-' )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0=='+'||LA12_0=='-') ) {
                                alt12=1;
                            }
                            switch (alt12) {
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

                            // InternalKiCool.g:2044:67: ( RULE_NUMBER )+
                            int cnt13=0;
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // InternalKiCool.g:2044:67: RULE_NUMBER
                            	    {
                            	    mRULE_NUMBER(); 

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
                            break;

                    }

                    // InternalKiCool.g:2044:82: ( 'f' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='f') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalKiCool.g:2044:82: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalKiCool.g:2044:87: ( RULE_NUMBER )+ 'f'
                    {
                    // InternalKiCool.g:2044:87: ( RULE_NUMBER )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalKiCool.g:2044:87: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
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
            // InternalKiCool.g:2046:14: ( ( 'true' | 'false' ) )
            // InternalKiCool.g:2046:16: ( 'true' | 'false' )
            {
            // InternalKiCool.g:2046:16: ( 'true' | 'false' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='t') ) {
                alt18=1;
            }
            else if ( (LA18_0=='f') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalKiCool.g:2046:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalKiCool.g:2046:24: 'false'
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
            // InternalKiCool.g:2048:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalKiCool.g:2048:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalKiCool.g:2048:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\\') ) {
                    alt19=1;
                }
                else if ( ((LA19_0>='\u0000' && LA19_0<='!')||(LA19_0>='#' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKiCool.g:2048:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKiCool.g:2048:61: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop19;
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
            // InternalKiCool.g:2050:9: ( ( '^' )? ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKiCool.g:2050:11: ( '^' )? ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKiCool.g:2050:11: ( '^' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='^') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKiCool.g:2050:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // InternalKiCool.g:2050:16: ( ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' ) | '_' '0' .. '9' | '__' )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='_') ) {
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
                    alt24=2;
                    }
                    break;
                case '_':
                    {
                    alt24=3;
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
                    alt24=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA24_0>='A' && LA24_0<='Z')||(LA24_0>='a' && LA24_0<='z')) ) {
                alt24=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalKiCool.g:2050:17: ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' )
                    {
                    // InternalKiCool.g:2050:17: ( ( '_' )? 'a' .. 'z' | ( '_' )? 'A' .. 'Z' )
                    int alt23=2;
                    switch ( input.LA(1) ) {
                    case '_':
                        {
                        int LA23_1 = input.LA(2);

                        if ( ((LA23_1>='A' && LA23_1<='Z')) ) {
                            alt23=2;
                        }
                        else if ( ((LA23_1>='a' && LA23_1<='z')) ) {
                            alt23=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 1, input);

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
                        alt23=1;
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
                        alt23=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }

                    switch (alt23) {
                        case 1 :
                            // InternalKiCool.g:2050:18: ( '_' )? 'a' .. 'z'
                            {
                            // InternalKiCool.g:2050:18: ( '_' )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0=='_') ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // InternalKiCool.g:2050:18: '_'
                                    {
                                    match('_'); 

                                    }
                                    break;

                            }

                            matchRange('a','z'); 

                            }
                            break;
                        case 2 :
                            // InternalKiCool.g:2050:32: ( '_' )? 'A' .. 'Z'
                            {
                            // InternalKiCool.g:2050:32: ( '_' )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0=='_') ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // InternalKiCool.g:2050:32: '_'
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
                    // InternalKiCool.g:2050:47: '_' '0' .. '9'
                    {
                    match('_'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 3 :
                    // InternalKiCool.g:2050:60: '__'
                    {
                    match("__"); 


                    }
                    break;

            }

            // InternalKiCool.g:2050:66: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='z')) ) {
                    alt25=1;
                }


                switch (alt25) {
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
            	    break loop25;
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
            // InternalKiCool.g:2052:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKiCool.g:2052:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKiCool.g:2052:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
            // InternalKiCool.g:2054:16: ( . )
            // InternalKiCool.g:2054:18: .
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
        // InternalKiCool.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER )
        int alt27=33;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // InternalKiCool.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalKiCool.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalKiCool.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalKiCool.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalKiCool.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalKiCool.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalKiCool.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalKiCool.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalKiCool.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalKiCool.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalKiCool.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalKiCool.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalKiCool.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalKiCool.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalKiCool.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalKiCool.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalKiCool.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalKiCool.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalKiCool.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalKiCool.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalKiCool.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalKiCool.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalKiCool.g:1:142: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 24 :
                // InternalKiCool.g:1:166: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // InternalKiCool.g:1:182: RULE_SL_COMMENT_ANNOTATION
                {
                mRULE_SL_COMMENT_ANNOTATION(); 

                }
                break;
            case 26 :
                // InternalKiCool.g:1:209: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // InternalKiCool.g:1:225: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // InternalKiCool.g:1:234: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 29 :
                // InternalKiCool.g:1:245: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 30 :
                // InternalKiCool.g:1:258: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // InternalKiCool.g:1:270: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // InternalKiCool.g:1:278: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // InternalKiCool.g:1:286: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA17_eotS =
        "\4\uffff";
    static final String DFA17_eofS =
        "\4\uffff";
    static final String DFA17_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA17_maxS =
        "\1\71\1\146\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA17_specialS =
        "\4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\54\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    static class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "2044:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA27_eotS =
        "\1\uffff\7\37\3\uffff\1\37\5\uffff\1\33\1\63\2\37\3\33\4\uffff\3\37\1\uffff\10\37\3\uffff\1\37\11\uffff\1\63\2\37\2\uffff\1\37\1\117\4\37\1\124\6\37\1\133\4\uffff\3\37\1\uffff\1\37\1\140\2\37\1\uffff\6\37\1\uffff\1\151\3\37\1\uffff\4\37\1\161\1\162\1\37\1\164\1\uffff\1\151\1\165\2\37\1\170\1\171\1\37\2\uffff\1\37\2\uffff\1\174\1\37\2\uffff\1\176\1\37\1\uffff\1\37\1\uffff\1\37\1\u0082\1\37\1\uffff\2\37\1\u0086\1\uffff";
    static final String DFA27_eofS =
        "\u0087\uffff";
    static final String DFA27_minS =
        "\1\0\1\157\3\145\1\141\1\156\1\154\3\uffff\1\145\5\uffff\1\52\1\56\1\162\1\141\1\0\1\101\1\60\4\uffff\1\142\1\145\1\163\1\uffff\1\166\1\163\1\164\1\154\1\162\1\142\1\160\1\151\3\uffff\1\171\5\uffff\2\0\2\uffff\1\56\1\165\1\154\2\uffff\1\154\1\60\1\143\1\164\1\145\1\164\1\60\1\145\1\163\1\145\1\165\1\145\1\141\1\60\4\uffff\1\145\1\163\1\151\1\uffff\1\145\1\60\1\154\1\145\1\uffff\1\156\1\151\1\154\1\164\1\162\1\163\1\uffff\1\60\1\145\1\143\1\163\1\uffff\1\157\1\155\1\164\1\157\2\60\1\155\1\60\1\uffff\2\60\1\163\1\160\2\60\1\156\2\uffff\1\145\2\uffff\1\60\1\145\2\uffff\1\60\1\144\1\uffff\1\162\1\uffff\1\151\1\60\1\141\1\uffff\1\164\1\145\1\60\1\uffff";
    static final String DFA27_maxS =
        "\1\uffff\1\165\1\145\1\171\1\145\1\141\1\156\1\154\3\uffff\1\145\5\uffff\1\57\1\146\1\162\1\141\1\uffff\2\172\4\uffff\1\142\1\157\1\163\1\uffff\1\166\1\163\1\164\1\154\1\162\1\142\1\164\1\151\3\uffff\1\171\5\uffff\2\uffff\2\uffff\1\146\1\165\1\154\2\uffff\1\154\1\172\1\143\1\164\1\145\1\164\1\172\1\145\1\163\1\145\1\165\1\145\1\141\1\172\4\uffff\1\145\1\163\1\151\1\uffff\1\145\1\172\1\154\1\145\1\uffff\1\156\1\151\1\154\1\164\1\162\1\163\1\uffff\1\172\1\145\1\143\1\163\1\uffff\1\157\1\155\1\164\1\157\2\172\1\155\1\172\1\uffff\2\172\1\163\1\160\2\172\1\156\2\uffff\1\145\2\uffff\1\172\1\145\2\uffff\1\172\1\144\1\uffff\1\162\1\uffff\1\151\1\172\1\141\1\uffff\1\164\1\145\1\172\1\uffff";
    static final String DFA27_acceptS =
        "\10\uffff\1\12\1\13\1\20\1\uffff\1\22\1\23\1\24\1\25\1\26\7\uffff\2\37\1\40\1\41\3\uffff\1\37\10\uffff\1\12\1\13\1\20\1\uffff\1\22\1\23\1\24\1\25\1\26\2\uffff\1\33\1\34\3\uffff\1\36\1\40\16\uffff\1\27\1\30\1\31\1\32\3\uffff\1\14\4\uffff\1\7\6\uffff\1\21\4\uffff\1\16\10\uffff\1\35\7\uffff\1\5\1\6\1\uffff\1\11\1\1\2\uffff\1\3\1\17\2\uffff\1\15\1\uffff\1\4\3\uffff\1\2\3\uffff\1\10";
    static final String DFA27_specialS =
        "\1\3\24\uffff\1\0\33\uffff\1\2\1\1\124\uffff}>";
    static final String[] DFA27_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\25\1\15\10\33\1\16\1\20\1\17\1\21\12\22\6\33\1\14\32\31\1\10\1\33\1\11\1\26\1\27\1\33\1\7\2\30\1\2\1\30\1\24\2\30\1\6\1\30\1\13\1\5\3\30\1\1\2\30\1\3\1\23\1\30\1\4\4\30\1\33\1\12\uff83\33",
            "\1\36\2\uffff\1\35\2\uffff\1\34",
            "\1\40",
            "\1\42\3\uffff\1\43\17\uffff\1\41",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "\1\53",
            "",
            "",
            "",
            "",
            "",
            "\1\61\4\uffff\1\62",
            "\1\64\1\uffff\12\65\54\uffff\1\64",
            "\1\66",
            "\1\67",
            "\0\70",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "\1\72",
            "\1\73\11\uffff\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104\3\uffff\1\105",
            "\1\106",
            "",
            "",
            "",
            "\1\107",
            "",
            "",
            "",
            "",
            "",
            "\52\111\1\110\uffd5\111",
            "\52\113\1\112\uffd5\113",
            "",
            "",
            "\1\64\1\uffff\12\65\54\uffff\1\64",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\116",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\163",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\166",
            "\1\167",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\172",
            "",
            "",
            "\1\173",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\175",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\177",
            "",
            "\1\u0080",
            "",
            "\1\u0081",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_SL_COMMENT_ANNOTATION | RULE_SL_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_21 = input.LA(1);

                        s = -1;
                        if ( ((LA27_21>='\u0000' && LA27_21<='\uFFFF')) ) {s = 56;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_50 = input.LA(1);

                        s = -1;
                        if ( (LA27_50=='*') ) {s = 74;}

                        else if ( ((LA27_50>='\u0000' && LA27_50<=')')||(LA27_50>='+' && LA27_50<='\uFFFF')) ) {s = 75;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_49 = input.LA(1);

                        s = -1;
                        if ( (LA27_49=='*') ) {s = 72;}

                        else if ( ((LA27_49>='\u0000' && LA27_49<=')')||(LA27_49>='+' && LA27_49<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_0 = input.LA(1);

                        s = -1;
                        if ( (LA27_0=='p') ) {s = 1;}

                        else if ( (LA27_0=='d') ) {s = 2;}

                        else if ( (LA27_0=='s') ) {s = 3;}

                        else if ( (LA27_0=='v') ) {s = 4;}

                        else if ( (LA27_0=='l') ) {s = 5;}

                        else if ( (LA27_0=='i') ) {s = 6;}

                        else if ( (LA27_0=='a') ) {s = 7;}

                        else if ( (LA27_0=='[') ) {s = 8;}

                        else if ( (LA27_0==']') ) {s = 9;}

                        else if ( (LA27_0=='|') ) {s = 10;}

                        else if ( (LA27_0=='k') ) {s = 11;}

                        else if ( (LA27_0=='@') ) {s = 12;}

                        else if ( (LA27_0=='#') ) {s = 13;}

                        else if ( (LA27_0==',') ) {s = 14;}

                        else if ( (LA27_0=='.') ) {s = 15;}

                        else if ( (LA27_0=='-') ) {s = 16;}

                        else if ( (LA27_0=='/') ) {s = 17;}

                        else if ( ((LA27_0>='0' && LA27_0<='9')) ) {s = 18;}

                        else if ( (LA27_0=='t') ) {s = 19;}

                        else if ( (LA27_0=='f') ) {s = 20;}

                        else if ( (LA27_0=='\"') ) {s = 21;}

                        else if ( (LA27_0=='^') ) {s = 22;}

                        else if ( (LA27_0=='_') ) {s = 23;}

                        else if ( ((LA27_0>='b' && LA27_0<='c')||LA27_0=='e'||(LA27_0>='g' && LA27_0<='h')||LA27_0=='j'||(LA27_0>='m' && LA27_0<='o')||(LA27_0>='q' && LA27_0<='r')||LA27_0=='u'||(LA27_0>='w' && LA27_0<='z')) ) {s = 24;}

                        else if ( ((LA27_0>='A' && LA27_0<='Z')) ) {s = 25;}

                        else if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {s = 26;}

                        else if ( ((LA27_0>='\u0000' && LA27_0<='\b')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\u001F')||LA27_0=='!'||(LA27_0>='$' && LA27_0<='+')||(LA27_0>=':' && LA27_0<='?')||LA27_0=='\\'||LA27_0=='`'||LA27_0=='{'||(LA27_0>='}' && LA27_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}