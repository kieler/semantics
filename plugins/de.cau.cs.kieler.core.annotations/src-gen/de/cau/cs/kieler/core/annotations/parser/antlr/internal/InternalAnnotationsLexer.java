package de.cau.cs.kieler.core.annotations.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationsLexer extends Lexer {
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_FLOAT=8;
    public static final int Tokens=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_STRING=9;
    public static final int RULE_INT=7;
    public static final int T14=14;
    public static final int RULE_WS=12;
    public static final int T15=15;
    public static final int T16=16;
    public static final int RULE_COMMENT_ANNOTATION=4;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalAnnotationsLexer() {;} 
    public InternalAnnotationsLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g"; }

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:10:5: ( '@' )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:10:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:11:5: ( '(' )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:11:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:12:5: ( ')' )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:12:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:13:5: ( '[' )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:13:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:14:5: ( ']' )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:14:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:15:5: ( '.' )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:15:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start RULE_COMMENT_ANNOTATION
    public final void mRULE_COMMENT_ANNOTATION() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_ANNOTATION;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:975:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:975:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:975:33: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFE')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:975:61: .
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_COMMENT_ANNOTATION

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:977:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:977:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFE') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:977:31: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFE')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:977:59: .
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:979:10: ( ( '-' )? ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:979:12: ( '-' )? ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:979:12: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:979:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:979:17: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:979:18: '0' .. '9'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_FLOAT
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:12: ( ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:14: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:14: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:15: ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )?
                    {
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:15: ( '-' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='-') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:15: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:20: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:21: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    match('.'); 
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:36: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:37: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:48: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:49: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }

                            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:59: ( '+' | '-' )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0=='+'||LA8_0=='-') ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse =
                                            new MismatchedSetException(null,input);
                                        recover(mse);    throw mse;
                                    }


                                    }
                                    break;

                            }

                            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:70: ( '0' .. '9' )+
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
                            	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:71: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

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
                            break;

                    }

                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:84: ( 'f' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='f') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:84: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:89: ( '-' )? ( '0' .. '9' )+ 'f'
                    {
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:89: ( '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='-') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:89: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:94: ( '0' .. '9' )+
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
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:981:95: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    match('f'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_FLOAT

    // $ANTLR start RULE_BOOLEAN
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:983:14: ( ( 'true' | 'false' ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:983:16: ( 'true' | 'false' )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:983:16: ( 'true' | 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='t') ) {
                alt15=1;
            }
            else if ( (LA15_0=='f') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("983:16: ( 'true' | 'false' )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:983:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:983:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_BOOLEAN

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:985:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:985:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:985:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\\') ) {
                    alt16=1;
                }
                else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFE')) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:985:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:985:61: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:987:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:987:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:987:11: ( '^' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='^') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:987:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:987:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:989:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:989:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:989:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFE')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:989:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:989:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:989:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:989:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:989:41: '\\r'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:991:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:991:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:991:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:993:16: ( . )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:993:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:8: ( T14 | T15 | T16 | T17 | T18 | T19 | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt23=16;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:10: T14
                {
                mT14(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:14: T15
                {
                mT15(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:18: T16
                {
                mT16(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:22: T17
                {
                mT17(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:26: T18
                {
                mT18(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:30: T19
                {
                mT19(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:34: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:58: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:74: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:83: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:94: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:107: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:119: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:127: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:143: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:151: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA14_eotS =
        "\5\uffff";
    static final String DFA14_eofS =
        "\5\uffff";
    static final String DFA14_minS =
        "\1\55\1\60\1\56\2\uffff";
    static final String DFA14_maxS =
        "\2\71\1\146\2\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA14_specialS =
        "\5\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\2\uffff\12\2",
            "\12\2",
            "\1\3\1\uffff\12\2\54\uffff\1\4",
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
            return "981:14: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' )";
        }
    }
    static final String DFA23_eotS =
        "\7\uffff\2\20\1\33\2\35\2\20\13\uffff\1\33\2\uffff\1\35\1\uffff"+
        "\1\35\4\uffff\2\35\1\47\1\35\1\uffff\1\47";
    static final String DFA23_eofS =
        "\51\uffff";
    static final String DFA23_minS =
        "\1\0\6\uffff\1\52\1\60\1\56\1\162\1\141\1\0\1\101\11\uffff\1\0\1"+
        "\uffff\1\56\2\uffff\1\165\1\uffff\1\154\4\uffff\1\145\1\163\1\60"+
        "\1\145\1\uffff\1\60";
    static final String DFA23_maxS =
        "\1\ufffe\6\uffff\1\57\1\71\1\146\1\162\1\141\1\ufffe\1\172\11\uffff"+
        "\1\ufffe\1\uffff\1\146\2\uffff\1\165\1\uffff\1\154\4\uffff\1\145"+
        "\1\163\1\172\1\145\1\uffff\1\172";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\7\uffff\1\15\1\17\1\20\1\1\1\2"+
        "\1\3\1\4\1\5\1\6\1\uffff\1\16\1\uffff\1\12\1\11\1\uffff\1\15\1\uffff"+
        "\1\14\1\17\1\10\1\7\4\uffff\1\13\1\uffff";
    static final String DFA23_specialS =
        "\51\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\17\1\20\1\14\5\20\1\2\1\3\3\20"+
            "\1\10\1\6\1\7\12\11\6\20\1\1\32\16\1\4\1\20\1\5\1\15\1\16\1"+
            "\20\5\16\1\13\15\16\1\12\6\16\uff84\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27\4\uffff\1\30",
            "\12\31",
            "\1\32\1\uffff\12\31\54\uffff\1\32",
            "\1\34",
            "\1\36",
            "\uffff\37",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\41\1\42\uffd4\41",
            "",
            "\1\32\1\uffff\12\31\54\uffff\1\32",
            "",
            "",
            "\1\43",
            "",
            "\1\44",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\46",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\50",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T14 | T15 | T16 | T17 | T18 | T19 | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}