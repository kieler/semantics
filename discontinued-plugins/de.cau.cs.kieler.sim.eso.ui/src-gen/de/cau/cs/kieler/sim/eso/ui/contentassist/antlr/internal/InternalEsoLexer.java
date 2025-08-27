package de.cau.cs.kieler.sim.eso.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsoLexer extends Lexer {
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=8;
    public static final int RULE_FLOAT=7;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int RULE_SPECIAL=9;
    public static final int T__13=13;
    public static final int RULE_ALPHANUMSPECIAL=4;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalEsoLexer() {;} 
    public InternalEsoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEsoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:11:7: ( 'Output:' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:11:9: 'Output:'
            {
            match("Output:"); 


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
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:12:7: ( '!' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:12:9: '!'
            {
            match('!'); 

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
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:13:7: ( 'reset' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:13:9: 'reset'
            {
            match("reset"); 


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
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:14:7: ( ';' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:14:9: ';'
            {
            match(';'); 

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
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:15:7: ( '%' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:15:9: '%'
            {
            match('%'); 

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
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:16:7: ( 'Output' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:16:9: 'Output'
            {
            match("Output"); 


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
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:17:7: ( ':' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:17:9: ':'
            {
            match(':'); 

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
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:18:7: ( '%%' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:18:9: '%%'
            {
            match("%%"); 


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
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:19:7: ( ')' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:19:9: ')'
            {
            match(')'); 

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
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:20:7: ( '=' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:20:9: '='
            {
            match('='); 

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
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:21:7: ( '(' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:21:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_SPECIAL"
    public final void mRULE_SPECIAL() throws RecognitionException {
        try {
            int _type = RULE_SPECIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1681:14: ( ( ',' | '.' | '/' | '@' | '#' | '$' | '&' | '*' | ':' | '+' | '-' | '_' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1681:16: ( ',' | '.' | '/' | '@' | '#' | '$' | '&' | '*' | ':' | '+' | '-' | '_' )
            {
            if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='&'||(input.LA(1)>='*' && input.LA(1)<='/')||input.LA(1)==':'||input.LA(1)=='@'||input.LA(1)=='_' ) {
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

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1683:11: ( ( 'true' | 'false' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1683:13: ( 'true' | 'false' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1683:13: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1683:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1683:21: 'false'
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
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1685:12: ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1685:14: ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1685:14: ( '+' | '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:
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

            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1685:25: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1685:26: '0' .. '9'
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

            match('.'); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1685:41: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1685:42: '0' .. '9'
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
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1687:10: ( ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1687:12: ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1687:12: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1687:13: '0' .. '9'
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

    // $ANTLR start "RULE_ALPHANUMSPECIAL"
    public final void mRULE_ALPHANUMSPECIAL() throws RecognitionException {
        try {
            int _type = RULE_ALPHANUMSPECIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1689:22: ( ( '0' .. '9' )* ( 'a' .. 'z' | 'A' .. 'Z' | RULE_SPECIAL ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | RULE_SPECIAL )* )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1689:24: ( '0' .. '9' )* ( 'a' .. 'z' | 'A' .. 'Z' | RULE_SPECIAL ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | RULE_SPECIAL )*
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1689:24: ( '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1689:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='&'||(input.LA(1)>='*' && input.LA(1)<='/')||input.LA(1)==':'||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1689:69: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | RULE_SPECIAL )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='#' && LA7_0<='$')||LA7_0=='&'||(LA7_0>='*' && LA7_0<=':')||(LA7_0>='@' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='&'||(input.LA(1)>='*' && input.LA(1)<=':')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHANUMSPECIAL"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1691:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1691:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1691:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1691:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1691:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1691:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1691:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1691:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1691:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1691:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1691:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1693:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1693:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1693:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:
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

    public void mTokens() throws RecognitionException {
        // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_SPECIAL | RULE_BOOL | RULE_FLOAT | RULE_INT | RULE_ALPHANUMSPECIAL | RULE_STRING | RULE_WS )
        int alt12=18;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:76: RULE_SPECIAL
                {
                mRULE_SPECIAL(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:89: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:99: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:110: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:119: RULE_ALPHANUMSPECIAL
                {
                mRULE_ALPHANUMSPECIAL(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:140: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1:152: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\17\1\uffff\1\17\1\uffff\1\25\1\26\3\uffff\1\27\2\17"+
        "\1\27\1\34\3\uffff\2\17\4\uffff\4\17\1\uffff\5\17\1\47\2\17\1\52"+
        "\1\17\1\uffff\1\17\1\55\1\uffff\1\52\1\57\1\uffff\1\60\2\uffff";
    static final String DFA12_eofS =
        "\61\uffff";
    static final String DFA12_minS =
        "\1\11\1\165\1\uffff\1\145\1\uffff\1\45\1\43\3\uffff\1\43\1\162"+
        "\1\141\2\43\3\uffff\1\164\1\163\4\uffff\1\56\1\165\1\154\1\60\1"+
        "\uffff\1\160\1\145\1\60\1\145\1\163\1\43\1\165\1\164\1\43\1\145"+
        "\1\uffff\1\164\1\43\1\uffff\2\43\1\uffff\1\43\2\uffff";
    static final String DFA12_maxS =
        "\1\172\1\165\1\uffff\1\145\1\uffff\1\45\1\172\3\uffff\1\172\1\162"+
        "\1\141\2\172\3\uffff\1\164\1\163\4\uffff\1\71\1\165\1\154\1\71\1"+
        "\uffff\1\160\1\145\1\71\1\145\1\163\1\172\1\165\1\164\1\172\1\145"+
        "\1\uffff\1\164\1\172\1\uffff\2\172\1\uffff\1\172\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\2\uffff\1\11\1\12\1\13\5\uffff\1\20\1"+
        "\21\1\22\2\uffff\1\10\1\5\1\7\1\14\4\uffff\1\17\12\uffff\1\16\2"+
        "\uffff\1\15\2\uffff\1\3\1\uffff\1\6\1\1";
    static final String DFA12_specialS =
        "\61\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\21\2\uffff\1\21\22\uffff\1\21\1\2\1\20\2\15\1\5\1\15\1\20"+
            "\1\11\1\7\1\15\1\12\1\15\1\12\2\15\12\16\1\6\1\4\1\uffff\1\10"+
            "\2\uffff\1\15\16\17\1\1\13\17\4\uffff\1\15\1\uffff\5\17\1\14"+
            "\13\17\1\3\1\17\1\13\6\17",
            "\1\22",
            "",
            "\1\23",
            "",
            "\1\24",
            "\2\17\1\uffff\1\17\3\uffff\21\17\5\uffff\33\17\4\uffff\1\17"+
            "\1\uffff\32\17",
            "",
            "",
            "",
            "\2\17\1\uffff\1\17\3\uffff\6\17\12\30\1\17\5\uffff\33\17\4"+
            "\uffff\1\17\1\uffff\32\17",
            "\1\31",
            "\1\32",
            "\2\17\1\uffff\1\17\3\uffff\21\17\5\uffff\33\17\4\uffff\1\17"+
            "\1\uffff\32\17",
            "\2\17\1\uffff\1\17\3\uffff\4\17\1\33\1\17\12\16\1\17\5\uffff"+
            "\33\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "",
            "",
            "\1\35",
            "\1\36",
            "",
            "",
            "",
            "",
            "\1\37\1\uffff\12\30",
            "\1\40",
            "\1\41",
            "\12\42",
            "",
            "\1\43",
            "\1\44",
            "\12\42",
            "\1\45",
            "\1\46",
            "\2\17\1\uffff\1\17\3\uffff\6\17\12\42\1\17\5\uffff\33\17\4"+
            "\uffff\1\17\1\uffff\32\17",
            "\1\50",
            "\1\51",
            "\2\17\1\uffff\1\17\3\uffff\21\17\5\uffff\33\17\4\uffff\1\17"+
            "\1\uffff\32\17",
            "\1\53",
            "",
            "\1\54",
            "\2\17\1\uffff\1\17\3\uffff\21\17\5\uffff\33\17\4\uffff\1\17"+
            "\1\uffff\32\17",
            "",
            "\2\17\1\uffff\1\17\3\uffff\21\17\5\uffff\33\17\4\uffff\1\17"+
            "\1\uffff\32\17",
            "\2\17\1\uffff\1\17\3\uffff\20\17\1\56\5\uffff\33\17\4\uffff"+
            "\1\17\1\uffff\32\17",
            "",
            "\2\17\1\uffff\1\17\3\uffff\21\17\5\uffff\33\17\4\uffff\1\17"+
            "\1\uffff\32\17",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_SPECIAL | RULE_BOOL | RULE_FLOAT | RULE_INT | RULE_ALPHANUMSPECIAL | RULE_STRING | RULE_WS );";
        }
    }
 

}