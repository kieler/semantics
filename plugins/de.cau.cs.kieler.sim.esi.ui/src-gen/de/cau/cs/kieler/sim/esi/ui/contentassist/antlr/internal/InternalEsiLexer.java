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
    public static final int RULE_ID=5;
    public static final int T__20=20;
    public static final int RULE_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_LETTER=8;
    public static final int RULE_NUM=6;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_SPECIAL=9;
    public static final int RULE_ALPHANUMSPECIAL=4;
    public static final int RULE_WS=10;
    public static final int RULE_DIGIT=7;

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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:17:7: ( '%%' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:17:9: '%%'
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
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:18:7: ( ')' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:18:9: ')'
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
    // $ANTLR end "T__20"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1201:12: ( '0' .. '9' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1201:14: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1203:13: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1203:15: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_SPECIAL"
    public final void mRULE_SPECIAL() throws RecognitionException {
        try {
            int _type = RULE_SPECIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1205:14: ( ( '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '(' | ')' | '_' | '=' | '+' | '-' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1205:16: ( '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '(' | ')' | '_' | '=' | '+' | '-' )
            {
            if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='='||input.LA(1)=='@'||(input.LA(1)>='^' && input.LA(1)<='_') ) {
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
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1207:22: ( ( RULE_LETTER | RULE_DIGIT | RULE_SPECIAL ) ( RULE_LETTER | RULE_DIGIT | RULE_SPECIAL )* )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1207:24: ( RULE_LETTER | RULE_DIGIT | RULE_SPECIAL ) ( RULE_LETTER | RULE_DIGIT | RULE_SPECIAL )*
            {
            if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='+')||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='='||(input.LA(1)>='@' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1207:62: ( RULE_LETTER | RULE_DIGIT | RULE_SPECIAL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='!'||(LA1_0>='#' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='+')||LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||LA1_0=='='||(LA1_0>='@' && LA1_0<='Z')||(LA1_0>='^' && LA1_0<='_')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='+')||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='='||(input.LA(1)>='@' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHANUMSPECIAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1209:9: ( ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT | '_' )* )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1209:11: ( RULE_LETTER | '_' ) ( RULE_LETTER | RULE_DIGIT | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1209:29: ( RULE_LETTER | RULE_DIGIT | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:
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

    // $ANTLR start "RULE_NUM"
    public final void mRULE_NUM() throws RecognitionException {
        try {
            int _type = RULE_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1211:10: ( ( '+' | '-' )? ( RULE_DIGIT )+ )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1211:12: ( '+' | '-' )? ( RULE_DIGIT )+
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1211:12: ( '+' | '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:
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

            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1211:23: ( RULE_DIGIT )+
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
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1211:23: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

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
    // $ANTLR end "RULE_NUM"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1213:9: ( ( '\\t' | ' ' | '\\r' | '\\n' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1213:11: ( '\\t' | ' ' | '\\r' | '\\n' )
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

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1215:14: ( '%' ( 'A' .. 'N' | 'P' .. 'Z' ) ( options {greedy=false; } : . )* '\\n' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1215:16: '%' ( 'A' .. 'N' | 'P' .. 'Z' ) ( options {greedy=false; } : . )* '\\n'
            {
            match('%'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='N')||(input.LA(1)>='P' && input.LA(1)<='Z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1215:40: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\n') ) {
                    alt5=2;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1215:68: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    public void mTokens() throws RecognitionException {
        // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_DIGIT | RULE_LETTER | RULE_SPECIAL | RULE_ALPHANUMSPECIAL | RULE_ID | RULE_NUM | RULE_WS | RULE_COMMENT )
        int alt6=17;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:64: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:75: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:87: RULE_SPECIAL
                {
                mRULE_SPECIAL(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:100: RULE_ALPHANUMSPECIAL
                {
                mRULE_ALPHANUMSPECIAL(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:121: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:129: RULE_NUM
                {
                mRULE_NUM(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:138: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1:146: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\17\1\23\1\uffff\1\26\1\23\1\uffff\1\30\1\31\1\32\1\23"+
        "\3\34\3\uffff\2\20\1\uffff\1\36\1\20\1\uffff\1\20\3\uffff\1\20\1"+
        "\uffff\1\20\2\uffff\4\20\1\46\1\20\1\uffff\1\50\1\uffff";
    static final String DFA6_eofS =
        "\51\uffff";
    static final String DFA6_minS =
        "\1\11\2\41\1\uffff\2\41\1\uffff\7\41\3\uffff\2\60\1\uffff\1\41\1"+
        "\0\1\uffff\1\60\3\uffff\1\60\1\uffff\1\60\2\uffff\1\0\3\60\1\41"+
        "\1\60\1\uffff\1\41\1\uffff";
    static final String DFA6_maxS =
        "\3\172\1\uffff\2\172\1\uffff\7\172\3\uffff\2\172\1\uffff\1\172\1"+
        "\uffff\1\uffff\1\172\3\uffff\1\71\1\uffff\1\172\2\uffff\1\uffff"+
        "\5\172\1\uffff\1\172\1\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\3\2\uffff\1\6\7\uffff\1\20\1\1\1\15\2\uffff\1\13\2\uffff"+
        "\1\4\1\uffff\1\10\1\11\1\12\1\uffff\1\14\1\uffff\1\7\1\21\6\uffff"+
        "\1\2\1\uffff\1\5";
    static final String DFA6_specialS =
        "\25\uffff\1\0\12\uffff\1\1\10\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\16\2\uffff\1\16\22\uffff\1\16\1\1\1\uffff\2\15\1\4\1\15\1"+
            "\uffff\1\10\1\7\1\15\1\14\1\uffff\1\14\2\uffff\12\11\1\6\1\3"+
            "\1\uffff\1\15\2\uffff\1\15\16\12\1\5\13\12\3\uffff\1\15\1\13"+
            "\1\uffff\21\12\1\2\10\12",
            "\1\20\1\uffff\4\20\1\uffff\4\20\1\uffff\1\20\2\uffff\12\20"+
            "\3\uffff\1\20\2\uffff\33\20\3\uffff\2\20\1\uffff\32\20",
            "\1\20\1\uffff\4\20\1\uffff\4\20\1\uffff\1\20\2\uffff\12\22"+
            "\3\uffff\1\20\2\uffff\1\20\32\22\3\uffff\1\20\1\22\1\uffff\4"+
            "\22\1\21\25\22",
            "",
            "\1\20\1\uffff\2\20\1\24\1\20\1\uffff\4\20\1\uffff\1\20\2\uffff"+
            "\12\20\3\uffff\1\20\2\uffff\1\20\16\25\1\20\13\25\3\uffff\2"+
            "\20\1\uffff\32\20",
            "\1\20\1\uffff\4\20\1\uffff\4\20\1\uffff\1\20\2\uffff\12\22"+
            "\3\uffff\1\20\2\uffff\1\20\32\22\3\uffff\1\20\1\22\1\uffff\24"+
            "\22\1\27\5\22",
            "",
            "\1\20\1\uffff\4\20\1\uffff\4\20\1\uffff\1\20\2\uffff\12\20"+
            "\3\uffff\1\20\2\uffff\33\20\3\uffff\2\20\1\uffff\32\20",
            "\1\20\1\uffff\4\20\1\uffff\4\20\1\uffff\1\20\2\uffff\12\20"+
            "\3\uffff\1\20\2\uffff\33\20\3\uffff\2\20\1\uffff\32\20",
            "\1\20\1\uffff\4\20\1\uffff\4\20\1\uffff\1\20\2\uffff\12\33"+
            "\3\uffff\1\20\2\uffff\33\20\3\uffff\2\20\1\uffff\32\20",
            "\1\20\1\uffff\4\20\1\uffff\4\20\1\uffff\1\20\2\uffff\12\22"+
            "\3\uffff\1\20\2\uffff\1\20\32\22\3\uffff\1\20\1\22\1\uffff\32"+
            "\22",
            "\1\20\1\uffff\4\20\1\uffff\4\20\1\uffff\1\20\2\uffff\12\22"+
            "\3\uffff\1\20\2\uffff\1\20\32\22\3\uffff\1\20\1\22\1\uffff\32"+
            "\22",
            "\1\20\1\uffff\4\20\1\uffff\4\20\1\uffff\1\20\2\uffff\12\33"+
            "\3\uffff\1\20\2\uffff\33\20\3\uffff\2\20\1\uffff\32\20",
            "\1\20\1\uffff\4\20\1\uffff\4\20\1\uffff\1\20\2\uffff\12\20"+
            "\3\uffff\1\20\2\uffff\33\20\3\uffff\2\20\1\uffff\32\20",
            "",
            "",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\22\22\1\35\7\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "\1\20\1\uffff\4\20\1\uffff\4\20\1\uffff\1\20\2\uffff\12\20"+
            "\3\uffff\1\20\2\uffff\33\20\3\uffff\2\20\1\uffff\32\20",
            "\41\37\1\40\1\37\4\40\1\37\4\40\1\37\1\40\2\37\12\40\3\37\1"+
            "\40\2\37\33\40\3\37\2\40\1\37\32\40\uff85\37",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\23\22\1\41\6\22",
            "",
            "",
            "",
            "\12\33",
            "",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\4\22\1\42\25\22",
            "",
            "",
            "\41\37\1\40\1\37\4\40\1\37\4\40\1\37\1\40\2\37\12\40\3\37\1"+
            "\40\2\37\33\40\3\37\2\40\1\37\32\40\uff85\37",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\17\22\1\43\12\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\23\22\1\44\6\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\24\22\1\45\5\22",
            "\1\20\1\uffff\4\20\1\uffff\4\20\1\uffff\1\20\2\uffff\12\22"+
            "\3\uffff\1\20\2\uffff\1\20\32\22\3\uffff\1\20\1\22\1\uffff\32"+
            "\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\23\22\1\47\6\22",
            "",
            "\1\20\1\uffff\4\20\1\uffff\4\20\1\uffff\1\20\2\uffff\12\22"+
            "\3\uffff\1\20\2\uffff\1\20\32\22\3\uffff\1\20\1\22\1\uffff\32"+
            "\22",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_DIGIT | RULE_LETTER | RULE_SPECIAL | RULE_ALPHANUMSPECIAL | RULE_ID | RULE_NUM | RULE_WS | RULE_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_21 = input.LA(1);

                        s = -1;
                        if ( ((LA6_21>='\u0000' && LA6_21<=' ')||LA6_21=='\"'||LA6_21=='\''||LA6_21==','||(LA6_21>='.' && LA6_21<='/')||(LA6_21>=':' && LA6_21<='<')||(LA6_21>='>' && LA6_21<='?')||(LA6_21>='[' && LA6_21<=']')||LA6_21=='`'||(LA6_21>='{' && LA6_21<='\uFFFF')) ) {s = 31;}

                        else if ( (LA6_21=='!'||(LA6_21>='#' && LA6_21<='&')||(LA6_21>='(' && LA6_21<='+')||LA6_21=='-'||(LA6_21>='0' && LA6_21<='9')||LA6_21=='='||(LA6_21>='@' && LA6_21<='Z')||(LA6_21>='^' && LA6_21<='_')||(LA6_21>='a' && LA6_21<='z')) ) {s = 32;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_32 = input.LA(1);

                        s = -1;
                        if ( ((LA6_32>='\u0000' && LA6_32<=' ')||LA6_32=='\"'||LA6_32=='\''||LA6_32==','||(LA6_32>='.' && LA6_32<='/')||(LA6_32>=':' && LA6_32<='<')||(LA6_32>='>' && LA6_32<='?')||(LA6_32>='[' && LA6_32<=']')||LA6_32=='`'||(LA6_32>='{' && LA6_32<='\uFFFF')) ) {s = 31;}

                        else if ( (LA6_32=='!'||(LA6_32>='#' && LA6_32<='&')||(LA6_32>='(' && LA6_32<='+')||LA6_32=='-'||(LA6_32>='0' && LA6_32<='9')||LA6_32=='='||(LA6_32>='@' && LA6_32<='Z')||(LA6_32>='^' && LA6_32<='_')||(LA6_32>='a' && LA6_32<='z')) ) {s = 32;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}