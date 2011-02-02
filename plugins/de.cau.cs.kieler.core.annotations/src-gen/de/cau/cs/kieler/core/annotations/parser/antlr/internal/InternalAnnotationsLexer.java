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
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=8;
    public static final int T12=12;
    public static final int RULE_WS=10;
    public static final int Tokens=13;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_COMMENT_ANNOTATION=4;
    public static final int RULE_ML_COMMENT=7;
    public InternalAnnotationsLexer() {;} 
    public InternalAnnotationsLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
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
    // $ANTLR end T12

    // $ANTLR start RULE_COMMENT_ANNOTATION
    public final void mRULE_COMMENT_ANNOTATION() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_ANNOTATION;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:292:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:292:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:292:33: ( options {greedy=false; } : . )*
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
            	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:292:61: .
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
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:294:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:294:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
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

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:294:31: ( options {greedy=false; } : . )*
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
            	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:294:59: .
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

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:296:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:296:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:296:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:296:11: '^'
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

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:296:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:298:10: ( ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:298:12: ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:298:12: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:298:13: '0' .. '9'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:300:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:300:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:300:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("300:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:300:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:300:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:300:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:300:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:300:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:300:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:300:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:300:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:302:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:302:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:302:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:302:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:302:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:302:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:302:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:302:41: '\\r'
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
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:304:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:304:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:304:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:306:16: ( . )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:306:18: .
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
        // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:8: ( T12 | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=9;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='@') ) {
            alt13 = mTokensHelper001();
        }
        else if ( (LA13_0=='/') ) {
            alt13 = mTokensHelper002();
        }
        else if ( (LA13_0=='^') ) {
            alt13 = mTokensHelper003();
        }
        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
            alt13 = mTokensHelper004();
        }
        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {
            alt13 = mTokensHelper005();
        }
        else if ( (LA13_0=='\"') ) {
            alt13 = mTokensHelper006();
        }
        else if ( (LA13_0=='\'') ) {
            alt13 = mTokensHelper007();
        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13 = mTokensHelper008();
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='.')||(LA13_0>=':' && LA13_0<='?')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFE')) ) {
            alt13 = mTokensHelper009();
        }
        else {
            alt13 = mTokensHelper010();
        }
        switch (alt13) {
            case 1 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:14: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:38: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:54: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:62: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:71: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:83: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:99: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:1:107: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }
    private int mTokensHelper001() throws RecognitionException {
        return 1;
    }

    private int mTokensHelper002() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '*':
            {
            int LA13_11 = input.LA(3);

            if ( (LA13_11=='*') ) {
                return 2;
            }
            else if ( ((LA13_11>='\u0000' && LA13_11<=')')||(LA13_11>='+' && LA13_11<='\uFFFE')) ) {
                return 3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T12 | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 11, input);

                throw nvae;
            }
            }
        case '/':
            {
            return 7;
            }
        default:
            return 9;}

    }

    private int mTokensHelper003() throws RecognitionException {
        int LA13_3 = input.LA(2);

        if ( ((LA13_3>='A' && LA13_3<='Z')||LA13_3=='_'||(LA13_3>='a' && LA13_3<='z')) ) {
            return 4;
        }
        else {
            return 9;}
    }

    private int mTokensHelper004() throws RecognitionException {
        return 4;
    }

    private int mTokensHelper005() throws RecognitionException {
        return 5;
    }

    private int mTokensHelper006() throws RecognitionException {
        int LA13_6 = input.LA(2);

        if ( ((LA13_6>='\u0000' && LA13_6<='\uFFFE')) ) {
            return 6;
        }
        else {
            return 9;}
    }

    private int mTokensHelper007() throws RecognitionException {
        int LA13_7 = input.LA(2);

        if ( ((LA13_7>='\u0000' && LA13_7<='\uFFFE')) ) {
            return 6;
        }
        else {
            return 9;}
    }

    private int mTokensHelper008() throws RecognitionException {
        return 8;
    }

    private int mTokensHelper009() throws RecognitionException {
        return 9;
    }

    private int mTokensHelper010() throws RecognitionException {
        NoViableAltException nvae =
            new NoViableAltException("1:1: Tokens : ( T12 | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

        throw nvae;
    }



 

}