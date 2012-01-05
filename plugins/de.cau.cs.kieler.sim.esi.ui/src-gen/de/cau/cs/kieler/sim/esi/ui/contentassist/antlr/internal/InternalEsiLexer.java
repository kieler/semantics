package de.cau.cs.kieler.sim.esi.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsiLexer extends Lexer {
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int RULE_ALPHANUM=5;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_SPECIAL=8;
    public static final int RULE_ALPHANUMSPECIAL=6;
    public static final int T__10=10;
    public static final int RULE_ALPHA=4;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_NUM=7;

    // delegates
    // delegators

    public InternalEsiLexer() {;} 
    public InternalEsiLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEsiLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:11:7: ( '!' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:11:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:12:7: ( 'reset' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:12:9: 'reset'
            {
            match("reset"); 


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
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:13:7: ( ';' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:13:9: ';'
            {
            match(';'); 

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
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:14:7: ( '%' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:14:9: '%'
            {
            match('%'); 

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
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:15:7: ( 'Output' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:15:9: 'Output'
            {
            match("Output"); 


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
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:16:7: ( ':' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:16:9: ':'
            {
            match(':'); 

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
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:17:7: ( ')' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:17:9: ')'
            {
            match(')'); 

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
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:18:7: ( '%%' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:18:9: '%%'
            {
            match("%%"); 


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
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:19:7: ( '(' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:19:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "RULE_ALPHA"
    public final void mRULE_ALPHA() throws RecognitionException {
        try {
            int _type = RULE_ALPHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1161:12: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1161:14: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1161:14: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "RULE_ALPHA"

    // $ANTLR start "RULE_NUM"
    public final void mRULE_NUM() throws RecognitionException {
        try {
            int _type = RULE_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1163:10: ( ( '+' | '-' ) ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1163:12: ( '+' | '-' ) ( '0' .. '9' )+
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1163:22: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1163:23: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUM"

    // $ANTLR start "RULE_ALPHANUM"
    public final void mRULE_ALPHANUM() throws RecognitionException {
        try {
            int _type = RULE_ALPHANUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1165:15: ( ( RULE_ALPHA | '0' .. '9' )+ )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1165:17: ( RULE_ALPHA | '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1165:17: ( RULE_ALPHA | '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1165:18: RULE_ALPHA
            	    {
            	    mRULE_ALPHA(); 

            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1165:29: '0' .. '9'
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
    // $ANTLR end "RULE_ALPHANUM"

    // $ANTLR start "RULE_SPECIAL"
    public final void mRULE_SPECIAL() throws RecognitionException {
        try {
            int _type = RULE_SPECIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1167:14: ( ( ',' | '.' | '/' | '@' | '#' | '$' | '^' | '&' | '*' | '_' | '=' | '+' | '-' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1167:16: ( ',' | '.' | '/' | '@' | '#' | '$' | '^' | '&' | '*' | '_' | '=' | '+' | '-' )
            {
            if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='&'||(input.LA(1)>='*' && input.LA(1)<='/')||input.LA(1)=='='||input.LA(1)=='@'||(input.LA(1)>='^' && input.LA(1)<='_') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPECIAL"

    // $ANTLR start "RULE_ALPHANUMSPECIAL"
    public final void mRULE_ALPHANUMSPECIAL() throws RecognitionException {
        try {
            int _type = RULE_ALPHANUMSPECIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1169:22: ( ( RULE_ALPHA | '0' .. '9' | RULE_SPECIAL )+ )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1169:24: ( RULE_ALPHA | '0' .. '9' | RULE_SPECIAL )+
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1169:24: ( RULE_ALPHA | '0' .. '9' | RULE_SPECIAL )+
            int cnt4=0;
            loop4:
            do {
                int alt4=4;
                switch ( input.LA(1) ) {
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
                    alt4=1;
                    }
                    break;
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
                    alt4=2;
                    }
                    break;
                case '#':
                case '$':
                case '&':
                case '*':
                case '+':
                case ',':
                case '-':
                case '.':
                case '/':
                case '=':
                case '@':
                case '^':
                case '_':
                    {
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1169:25: RULE_ALPHA
            	    {
            	    mRULE_ALPHA(); 

            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1169:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 3 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1169:45: RULE_SPECIAL
            	    {
            	    mRULE_SPECIAL(); 

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
    // $ANTLR end "RULE_ALPHANUMSPECIAL"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1171:9: ( ( '\\t' | ' ' | '\\r' | '\\n' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1171:11: ( '\\t' | ' ' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_ALPHA | RULE_NUM | RULE_ALPHANUM | RULE_SPECIAL | RULE_ALPHANUMSPECIAL | RULE_WS )
        int alt5=15;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:64: RULE_ALPHA
                {
                mRULE_ALPHA(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:75: RULE_NUM
                {
                mRULE_NUM(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:84: RULE_ALPHANUM
                {
                mRULE_ALPHANUM(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:98: RULE_SPECIAL
                {
                mRULE_SPECIAL(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:111: RULE_ALPHANUMSPECIAL
                {
                mRULE_ALPHANUMSPECIAL(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:132: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\2\uffff\1\17\1\uffff\1\22\1\17\3\uffff\1\17\1\25\1\26\1\25\1\uffff"+
        "\1\17\4\uffff\1\17\1\32\2\uffff\1\26\2\17\1\uffff\2\17\1\37\1\17"+
        "\1\uffff\1\41\1\uffff";
    static final String DFA5_eofS =
        "\42\uffff";
    static final String DFA5_minS =
        "\1\11\1\uffff\1\43\1\uffff\1\45\1\43\3\uffff\4\43\1\uffff\1\43\4"+
        "\uffff\2\43\2\uffff\3\43\1\uffff\4\43\1\uffff\1\43\1\uffff";
    static final String DFA5_maxS =
        "\1\172\1\uffff\1\172\1\uffff\1\45\1\172\3\uffff\4\172\1\uffff\1"+
        "\172\4\uffff\2\172\2\uffff\3\172\1\uffff\4\172\1\uffff\1\172\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\2\uffff\1\6\1\7\1\11\4\uffff\1\17\1\uffff"+
        "\1\12\1\16\1\10\1\4\2\uffff\1\15\1\14\3\uffff\1\13\4\uffff\1\2\1"+
        "\uffff\1\5";
    static final String DFA5_specialS =
        "\42\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\15\2\uffff\1\15\22\uffff\1\15\1\1\1\uffff\2\14\1\4\1\14\1"+
            "\uffff\1\10\1\7\1\14\1\12\1\14\1\12\2\14\12\13\1\6\1\3\1\uffff"+
            "\1\14\2\uffff\1\14\16\11\1\5\13\11\3\uffff\2\14\1\uffff\21\11"+
            "\1\2\10\11",
            "",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\13\3\uffff\1\20\2\uffff"+
            "\1\20\32\11\3\uffff\2\20\1\uffff\4\11\1\16\25\11",
            "",
            "\1\21",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\13\3\uffff\1\20\2\uffff"+
            "\1\20\32\11\3\uffff\2\20\1\uffff\24\11\1\23\5\11",
            "",
            "",
            "",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\13\3\uffff\1\20\2\uffff"+
            "\1\20\32\11\3\uffff\2\20\1\uffff\32\11",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\24\3\uffff\1\20\2\uffff"+
            "\33\20\3\uffff\2\20\1\uffff\32\20",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\13\3\uffff\1\20\2\uffff"+
            "\1\20\32\27\3\uffff\2\20\1\uffff\32\27",
            "\2\20\1\uffff\1\20\3\uffff\20\20\3\uffff\1\20\2\uffff\33\20"+
            "\3\uffff\2\20\1\uffff\32\20",
            "",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\13\3\uffff\1\20\2\uffff"+
            "\1\20\32\11\3\uffff\2\20\1\uffff\22\11\1\30\7\11",
            "",
            "",
            "",
            "",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\13\3\uffff\1\20\2\uffff"+
            "\1\20\32\11\3\uffff\2\20\1\uffff\23\11\1\31\6\11",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\24\3\uffff\1\20\2\uffff"+
            "\33\20\3\uffff\2\20\1\uffff\32\20",
            "",
            "",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\13\3\uffff\1\20\2\uffff"+
            "\1\20\32\27\3\uffff\2\20\1\uffff\32\27",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\13\3\uffff\1\20\2\uffff"+
            "\1\20\32\11\3\uffff\2\20\1\uffff\4\11\1\33\25\11",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\13\3\uffff\1\20\2\uffff"+
            "\1\20\32\11\3\uffff\2\20\1\uffff\17\11\1\34\12\11",
            "",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\13\3\uffff\1\20\2\uffff"+
            "\1\20\32\11\3\uffff\2\20\1\uffff\23\11\1\35\6\11",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\13\3\uffff\1\20\2\uffff"+
            "\1\20\32\11\3\uffff\2\20\1\uffff\24\11\1\36\5\11",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\13\3\uffff\1\20\2\uffff"+
            "\1\20\32\11\3\uffff\2\20\1\uffff\32\11",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\13\3\uffff\1\20\2\uffff"+
            "\1\20\32\11\3\uffff\2\20\1\uffff\23\11\1\40\6\11",
            "",
            "\2\20\1\uffff\1\20\3\uffff\6\20\12\13\3\uffff\1\20\2\uffff"+
            "\1\20\32\11\3\uffff\2\20\1\uffff\32\11",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_ALPHA | RULE_NUM | RULE_ALPHANUM | RULE_SPECIAL | RULE_ALPHANUMSPECIAL | RULE_WS );";
        }
    }
 

}