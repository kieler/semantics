package de.cau.cs.kieler.core.kexpressions.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKExpressionsLexer extends Lexer {
    public static final int RULE_BOOLEAN=8;
    public static final int T__40=40;
    public static final int RULE_ID=4;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_HOSTCODE=5;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_NUMBER=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_INT=6;
    public static final int RULE_WS=14;
    public static final int RULE_COMMENT_ANNOTATION=10;

    // delegates
    // delegators

    public InternalKExpressionsLexer() {;} 
    public InternalKExpressionsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKExpressionsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:11:7: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:11:9: '('
            {
            match('('); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:12:7: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:12:9: ')'
            {
            match(')'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:13:7: ( '[' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:13:9: '['
            {
            match('['); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:14:7: ( ']' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:14:9: ']'
            {
            match(']'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:15:7: ( '<' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:15:9: '<'
            {
            match('<'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:16:7: ( ',' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:16:9: ','
            {
            match(','); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:17:7: ( '()' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:17:9: '()'
            {
            match("()"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:18:7: ( '>' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:18:9: '>'
            {
            match('>'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:19:7: ( '&' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:19:9: '&'
            {
            match('&'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:20:7: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:20:9: '@'
            {
            match('@'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:21:7: ( '.' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:21:9: '.'
            {
            match('.'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:22:7: ( '-' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:22:9: '-'
            {
            match('-'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:23:7: ( '==' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:23:9: '=='
            {
            match("=="); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:24:7: ( '<=' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:24:9: '<='
            {
            match("<="); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:25:7: ( '>=' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:25:9: '>='
            {
            match(">="); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:26:7: ( '<>' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:26:9: '<>'
            {
            match("<>"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:27:7: ( 'pre' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:27:9: 'pre'
            {
            match("pre"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:28:7: ( '|' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:28:9: '|'
            {
            match('|'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:29:7: ( '!' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:29:9: '!'
            {
            match('!'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:30:7: ( '+' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:30:9: '+'
            {
            match('+'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:31:7: ( '*' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:31:9: '*'
            {
            match('*'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:32:7: ( '%' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:32:9: '%'
            {
            match('%'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:33:7: ( '/' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:33:9: '/'
            {
            match('/'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:34:7: ( 'val' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:34:9: 'val'
            {
            match("val"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:35:7: ( '||' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:35:9: '||'
            {
            match("||"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:36:7: ( '&&' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:36:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_HOSTCODE"
    public final void mRULE_HOSTCODE() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2676:15: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2676:17: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2676:22: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2676:23: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2676:64: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop1;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HOSTCODE"

    // $ANTLR start "RULE_COMMENT_ANNOTATION"
    public final void mRULE_COMMENT_ANNOTATION() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_ANNOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2678:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2678:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2678:33: ( options {greedy=false; } : . )*
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
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2678:61: .
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
    // $ANTLR end "RULE_COMMENT_ANNOTATION"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2680:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2680:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2680:31: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2680:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2682:22: ( '0' .. '9' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2682:24: '0' .. '9'
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2684:10: ( ( RULE_NUMBER )+ )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2684:12: ( RULE_NUMBER )+
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2684:12: ( RULE_NUMBER )+
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
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2684:12: RULE_NUMBER
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:12: ( ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:15: ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:15: ( RULE_NUMBER )+
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
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:15: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

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

                    match('.'); 
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:32: ( RULE_NUMBER )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:32: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:45: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:46: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:56: ( '+' | '-' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='+'||LA7_0=='-') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:
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

                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:67: ( RULE_NUMBER )+
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
                            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:67: RULE_NUMBER
                            	    {
                            	    mRULE_NUMBER(); 

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


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:82: ( 'f' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='f') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:82: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:87: ( RULE_NUMBER )+ 'f'
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:87: ( RULE_NUMBER )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2686:87: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2688:14: ( ( 'true' | 'false' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2688:16: ( 'true' | 'false' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2688:16: ( 'true' | 'false' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='t') ) {
                alt13=1;
            }
            else if ( (LA13_0=='f') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2688:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2688:24: 'false'
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2690:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2690:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2690:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    alt14=1;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2690:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2690:61: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop14;
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2692:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2692:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2692:11: ( '^' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='^') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2692:11: '^'
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

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2692:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:
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
            	    break loop16;
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2694:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2694:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2694:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2694:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2694:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2694:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2694:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2694:41: '\\r'
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2696:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2696:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2696:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2698:16: ( . )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2698:18: .
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
        // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=37;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:166: RULE_HOSTCODE
                {
                mRULE_HOSTCODE(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:180: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:204: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:220: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:229: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 32 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:240: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 33 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:253: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:265: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:273: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:289: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:297: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA12_eotS =
        "\4\uffff";
    static final String DFA12_eofS =
        "\4\uffff";
    static final String DFA12_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA12_maxS =
        "\1\71\1\146\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA12_specialS =
        "\4\uffff}>";
    static final String[] DFA12_transitionS = {
            "\12\1",
            "\1\3\1\uffff\12\1\54\uffff\1\2",
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

    static class DFA12 extends DFA {

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
            return "2686:14: ( ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\1\37\3\uffff\1\45\1\uffff\1\50\1\52\3\uffff\1\35\1\60"+
        "\1\62\4\uffff\1\71\1\60\1\35\1\74\2\60\2\35\24\uffff\1\60\12\uffff"+
        "\1\60\3\uffff\1\74\2\60\2\uffff\1\111\2\uffff\1\112\2\60\2\uffff"+
        "\1\115\1\60\1\uffff\1\115";
    static final String DFA21_eofS =
        "\117\uffff";
    static final String DFA21_minS =
        "\1\0\1\51\3\uffff\1\75\1\uffff\1\75\1\46\3\uffff\1\75\1\162\1\174"+
        "\4\uffff\1\52\1\141\1\0\1\56\1\162\1\141\1\0\1\101\24\uffff\1\145"+
        "\7\uffff\1\0\2\uffff\1\154\3\uffff\1\56\1\165\1\154\2\uffff\1\60"+
        "\2\uffff\1\60\1\145\1\163\2\uffff\1\60\1\145\1\uffff\1\60";
    static final String DFA21_maxS =
        "\1\uffff\1\51\3\uffff\1\76\1\uffff\1\75\1\46\3\uffff\1\75\1\162"+
        "\1\174\4\uffff\1\57\1\141\1\uffff\1\146\1\162\1\141\1\uffff\1\172"+
        "\24\uffff\1\145\7\uffff\1\uffff\2\uffff\1\154\3\uffff\1\146\1\165"+
        "\1\154\2\uffff\1\172\2\uffff\1\172\1\145\1\163\2\uffff\1\172\1\145"+
        "\1\uffff\1\172";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\6\2\uffff\1\12\1\13\1\14\3\uffff"+
        "\1\23\1\24\1\25\1\26\10\uffff\1\42\1\44\1\45\1\7\1\1\1\2\1\3\1\4"+
        "\1\16\1\20\1\5\1\6\1\17\1\10\1\32\1\11\1\12\1\13\1\14\1\15\1\uffff"+
        "\1\42\1\31\1\22\1\23\1\24\1\25\1\26\1\uffff\1\43\1\27\1\uffff\1"+
        "\33\1\36\1\37\3\uffff\1\41\1\44\1\uffff\1\34\1\35\3\uffff\1\21\1"+
        "\30\2\uffff\1\40\1\uffff";
    static final String DFA21_specialS =
        "\1\3\24\uffff\1\0\3\uffff\1\1\35\uffff\1\2\27\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\17\1\31\2\35\1\22\1\10\1"+
            "\25\1\1\1\2\1\21\1\20\1\6\1\13\1\12\1\23\12\26\2\35\1\5\1\14"+
            "\1\7\1\35\1\11\32\33\1\3\1\35\1\4\1\32\1\33\1\35\5\33\1\30\11"+
            "\33\1\15\3\33\1\27\1\33\1\24\4\33\1\35\1\16\uff83\35",
            "\1\36",
            "",
            "",
            "",
            "\1\43\1\44",
            "",
            "\1\47",
            "\1\51",
            "",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\61",
            "",
            "",
            "",
            "",
            "\1\67\4\uffff\1\70",
            "\1\72",
            "\0\73",
            "\1\75\1\uffff\12\76\54\uffff\1\75",
            "\1\77",
            "\1\100",
            "\0\101",
            "\32\60\4\uffff\1\60\1\uffff\32\60",
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
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\105\1\104\uffd5\105",
            "",
            "",
            "\1\106",
            "",
            "",
            "",
            "\1\75\1\uffff\12\76\54\uffff\1\75",
            "\1\107",
            "\1\110",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\113",
            "\1\114",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\116",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60"
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
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_21 = input.LA(1);

                        s = -1;
                        if ( ((LA21_21>='\u0000' && LA21_21<='\uFFFF')) ) {s = 59;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_25 = input.LA(1);

                        s = -1;
                        if ( ((LA21_25>='\u0000' && LA21_25<='\uFFFF')) ) {s = 65;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_55 = input.LA(1);

                        s = -1;
                        if ( (LA21_55=='*') ) {s = 68;}

                        else if ( ((LA21_55>='\u0000' && LA21_55<=')')||(LA21_55>='+' && LA21_55<='\uFFFF')) ) {s = 69;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='(') ) {s = 1;}

                        else if ( (LA21_0==')') ) {s = 2;}

                        else if ( (LA21_0=='[') ) {s = 3;}

                        else if ( (LA21_0==']') ) {s = 4;}

                        else if ( (LA21_0=='<') ) {s = 5;}

                        else if ( (LA21_0==',') ) {s = 6;}

                        else if ( (LA21_0=='>') ) {s = 7;}

                        else if ( (LA21_0=='&') ) {s = 8;}

                        else if ( (LA21_0=='@') ) {s = 9;}

                        else if ( (LA21_0=='.') ) {s = 10;}

                        else if ( (LA21_0=='-') ) {s = 11;}

                        else if ( (LA21_0=='=') ) {s = 12;}

                        else if ( (LA21_0=='p') ) {s = 13;}

                        else if ( (LA21_0=='|') ) {s = 14;}

                        else if ( (LA21_0=='!') ) {s = 15;}

                        else if ( (LA21_0=='+') ) {s = 16;}

                        else if ( (LA21_0=='*') ) {s = 17;}

                        else if ( (LA21_0=='%') ) {s = 18;}

                        else if ( (LA21_0=='/') ) {s = 19;}

                        else if ( (LA21_0=='v') ) {s = 20;}

                        else if ( (LA21_0=='\'') ) {s = 21;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 22;}

                        else if ( (LA21_0=='t') ) {s = 23;}

                        else if ( (LA21_0=='f') ) {s = 24;}

                        else if ( (LA21_0=='\"') ) {s = 25;}

                        else if ( (LA21_0=='^') ) {s = 26;}

                        else if ( ((LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='e')||(LA21_0>='g' && LA21_0<='o')||(LA21_0>='q' && LA21_0<='s')||LA21_0=='u'||(LA21_0>='w' && LA21_0<='z')) ) {s = 27;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 28;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||(LA21_0>='#' && LA21_0<='$')||(LA21_0>=':' && LA21_0<=';')||LA21_0=='?'||LA21_0=='\\'||LA21_0=='`'||LA21_0=='{'||(LA21_0>='}' && LA21_0<='\uFFFF')) ) {s = 29;}

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