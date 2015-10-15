package de.cau.cs.kieler.core.annotations.text.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationsLexer extends Lexer {
    public static final int RULE_COMMENT_ANNOTATION=4;
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_NUMBER=11;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_FLOAT=9;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalAnnotationsLexer() {;} 
    public InternalAnnotationsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAnnotationsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:11:7: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:11:9: '@'
            {
            match('@'); 

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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:12:7: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:12:9: ','
            {
            match(','); 

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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:13:7: ( '[' )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:13:9: '['
            {
            match('['); 

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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:14:7: ( ']' )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:14:9: ']'
            {
            match(']'); 

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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:15:7: ( '.' )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:15:9: '.'
            {
            match('.'); 

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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:16:7: ( '#' )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:16:9: '#'
            {
            match('#'); 

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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:17:7: ( '-' )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:17:9: '-'
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

    // $ANTLR start "RULE_COMMENT_ANNOTATION"
    public final void mRULE_COMMENT_ANNOTATION() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_ANNOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:973:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:973:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:973:33: ( options {greedy=false; } : . )*
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
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:973:61: .
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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:975:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:975:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:975:31: ( options {greedy=false; } : . )*
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
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:975:59: .
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

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:977:22: ( '0' .. '9' )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:977:24: '0' .. '9'
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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:979:10: ( ( RULE_NUMBER )+ )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:979:12: ( RULE_NUMBER )+
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:979:12: ( RULE_NUMBER )+
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
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:979:12: RULE_NUMBER
            	    {
            	    mRULE_NUMBER(); 

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

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:12: ( ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:15: ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:15: ( RULE_NUMBER )+
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
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:15: RULE_NUMBER
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

                    match('.'); 
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:32: ( RULE_NUMBER )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:32: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:45: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:46: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:56: ( '+' | '-' )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0=='+'||LA6_0=='-') ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:
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

                            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:67: ( RULE_NUMBER )+
                            int cnt7=0;
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:67: RULE_NUMBER
                            	    {
                            	    mRULE_NUMBER(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt7 >= 1 ) break loop7;
                                        EarlyExitException eee =
                                            new EarlyExitException(7, input);
                                        throw eee;
                                }
                                cnt7++;
                            } while (true);


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:82: ( 'f' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='f') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:82: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:87: ( RULE_NUMBER )+ 'f'
                    {
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:87: ( RULE_NUMBER )+
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
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:87: RULE_NUMBER
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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:983:14: ( ( 'true' | 'false' ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:983:16: ( 'true' | 'false' )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:983:16: ( 'true' | 'false' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='t') ) {
                alt12=1;
            }
            else if ( (LA12_0=='f') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:983:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:983:24: 'false'
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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:985:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:985:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:985:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:985:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:985:61: ~ ( ( '\\\\' | '\"' ) )
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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:987:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:987:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:987:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:987:11: '^'
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

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:987:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:
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
            	    break loop15;
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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:989:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:989:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:989:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:989:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop16;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:989:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:989:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:989:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:989:41: '\\r'
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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:991:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:991:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:991:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:993:16: ( . )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:993:18: .
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
        // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=17;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:52: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:76: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:92: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:101: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:112: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:125: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:137: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:145: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:161: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1:169: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA11_eotS =
        "\4\uffff";
    static final String DFA11_eofS =
        "\4\uffff";
    static final String DFA11_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA11_maxS =
        "\1\71\1\146\2\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA11_specialS =
        "\4\uffff}>";
    static final String[] DFA11_transitionS = {
            "\12\1",
            "\1\3\1\uffff\12\1\54\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    static class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "981:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA20_eotS =
        "\10\uffff\1\20\1\32\2\36\2\20\16\uffff\1\32\1\36\1\uffff\1\36\4"+
        "\uffff\2\36\1\50\1\36\1\uffff\1\50";
    static final String DFA20_eofS =
        "\52\uffff";
    static final String DFA20_minS =
        "\1\0\7\uffff\1\52\1\56\1\162\1\141\1\0\1\101\12\uffff\1\0\3\uffff"+
        "\1\56\1\165\1\uffff\1\154\4\uffff\1\145\1\163\1\60\1\145\1\uffff"+
        "\1\60";
    static final String DFA20_maxS =
        "\1\uffff\7\uffff\1\57\1\146\1\162\1\141\1\uffff\1\172\12\uffff"+
        "\1\uffff\3\uffff\1\146\1\165\1\uffff\1\154\4\uffff\1\145\1\163\1"+
        "\172\1\145\1\uffff\1\172";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\6\uffff\1\16\1\20\1\21\1\1"+
        "\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\17\1\12\1\13\2\uffff\1\16\1\uffff"+
        "\1\15\1\20\1\10\1\11\4\uffff\1\14\1\uffff";
    static final String DFA20_specialS =
        "\1\1\13\uffff\1\2\13\uffff\1\0\21\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\17\1\20\1\14\1\6\10\20\1\2\1"+
            "\7\1\5\1\10\12\11\6\20\1\1\32\16\1\3\1\20\1\4\1\15\1\16\1\20"+
            "\5\16\1\13\15\16\1\12\6\16\uff85\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30\4\uffff\1\31",
            "\1\33\1\uffff\12\34\54\uffff\1\33",
            "\1\35",
            "\1\37",
            "\0\40",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
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
            "\52\43\1\42\uffd5\43",
            "",
            "",
            "",
            "\1\33\1\uffff\12\34\54\uffff\1\33",
            "\1\44",
            "",
            "\1\45",
            "",
            "",
            "",
            "",
            "\1\46",
            "\1\47",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\51",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_24 = input.LA(1);

                        s = -1;
                        if ( (LA20_24=='*') ) {s = 34;}

                        else if ( ((LA20_24>='\u0000' && LA20_24<=')')||(LA20_24>='+' && LA20_24<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='@') ) {s = 1;}

                        else if ( (LA20_0==',') ) {s = 2;}

                        else if ( (LA20_0=='[') ) {s = 3;}

                        else if ( (LA20_0==']') ) {s = 4;}

                        else if ( (LA20_0=='.') ) {s = 5;}

                        else if ( (LA20_0=='#') ) {s = 6;}

                        else if ( (LA20_0=='-') ) {s = 7;}

                        else if ( (LA20_0=='/') ) {s = 8;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 9;}

                        else if ( (LA20_0=='t') ) {s = 10;}

                        else if ( (LA20_0=='f') ) {s = 11;}

                        else if ( (LA20_0=='\"') ) {s = 12;}

                        else if ( (LA20_0=='^') ) {s = 13;}

                        else if ( ((LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='a' && LA20_0<='e')||(LA20_0>='g' && LA20_0<='s')||(LA20_0>='u' && LA20_0<='z')) ) {s = 14;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 15;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='$' && LA20_0<='+')||(LA20_0>=':' && LA20_0<='?')||LA20_0=='\\'||LA20_0=='`'||(LA20_0>='{' && LA20_0<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_12 = input.LA(1);

                        s = -1;
                        if ( ((LA20_12>='\u0000' && LA20_12<='\uFFFF')) ) {s = 32;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}