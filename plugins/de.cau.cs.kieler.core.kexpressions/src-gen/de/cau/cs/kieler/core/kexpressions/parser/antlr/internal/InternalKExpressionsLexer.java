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
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int RULE_INT=6;
    public static final int RULE_COMMENT_ANNOTATION=9;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_HOSTCODE=5;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=10;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=13;

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

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:13:7: ( 'input' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:13:9: 'input'
            {
            match("input"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:14:7: ( ',' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:14:9: ','
            {
            match(','); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:15:7: ( ';' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:15:9: ';'
            {
            match(';'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:16:7: ( 'output' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:16:9: 'output'
            {
            match("output"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:17:7: ( 'inputoutput' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:17:9: 'inputoutput'
            {
            match("inputoutput"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:18:7: ( 'return' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:18:9: 'return'
            {
            match("return"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:19:7: ( ':' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:19:9: ':'
            {
            match(':'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:20:7: ( ':=' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:20:9: ':='
            {
            match(":="); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:21:7: ( 'var' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:21:9: 'var'
            {
            match("var"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:22:7: ( 'combine' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:22:9: 'combine'
            {
            match("combine"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:23:7: ( 'with' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:23:9: 'with'
            {
            match("with"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:24:7: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:24:9: '@'
            {
            match('@'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:25:7: ( '[' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:25:9: '['
            {
            match('['); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:26:7: ( ']' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:26:9: ']'
            {
            match(']'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:27:7: ( '.' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:27:9: '.'
            {
            match('.'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:28:7: ( '=' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:28:9: '='
            {
            match('='); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:29:7: ( '<' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:29:9: '<'
            {
            match('<'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:30:7: ( '<=' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:30:9: '<='
            {
            match("<="); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:31:7: ( '>' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:31:9: '>'
            {
            match('>'); 

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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:32:7: ( '>=' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:32:9: '>='
            {
            match(">="); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:33:7: ( '<>' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:33:9: '<>'
            {
            match("<>"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:34:7: ( 'pre' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:34:9: 'pre'
            {
            match("pre"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:35:7: ( 'or' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:35:9: 'or'
            {
            match("or"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:36:7: ( 'and' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:36:9: 'and'
            {
            match("and"); 


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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:37:7: ( 'not' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:37:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:38:7: ( '+' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:38:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:39:7: ( '-' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:39:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:40:7: ( '*' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:40:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:41:7: ( 'mod' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:41:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:42:7: ( '/' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:42:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:43:7: ( '?' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:43:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:44:7: ( 'pure' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:44:9: 'pure'
            {
            match("pure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:45:7: ( 'boolean' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:45:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:46:7: ( 'unsigned' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:46:9: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:47:7: ( 'integer' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:47:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:48:7: ( 'float' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:48:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:49:7: ( 'double' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:49:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:50:7: ( 'string' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:50:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:51:7: ( 'host' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:51:9: 'host'
            {
            match("host"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:52:7: ( 'none' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:52:9: 'none'
            {
            match("none"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:53:7: ( 'max' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:53:9: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:54:7: ( 'min' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:54:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "RULE_HOSTCODE"
    public final void mRULE_HOSTCODE() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3429:15: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3429:17: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3429:22: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3429:23: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3429:64: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3431:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3431:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3431:33: ( options {greedy=false; } : . )*
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
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3431:61: .
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3433:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3433:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3433:31: ( options {greedy=false; } : . )*
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
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3433:59: .
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3435:10: ( ( '-' )? ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3435:12: ( '-' )? ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3435:12: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3435:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3435:17: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3435:18: '0' .. '9'
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

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:12: ( ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:14: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:14: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:15: ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )?
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:15: ( '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:15: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:20: ( '0' .. '9' )+
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
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:21: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    match('.'); 
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:36: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:37: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:48: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:49: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:59: ( '+' | '-' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0=='+'||LA9_0=='-') ) {
                                alt9=1;
                            }
                            switch (alt9) {
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

                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:70: ( '0' .. '9' )+
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
                            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:71: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

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


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:84: ( 'f' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='f') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:84: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:89: ( '-' )? ( '0' .. '9' )+ 'f'
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:89: ( '-' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='-') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:89: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:94: ( '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3437:95: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3439:14: ( ( 'true' | 'false' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3439:16: ( 'true' | 'false' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3439:16: ( 'true' | 'false' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='t') ) {
                alt16=1;
            }
            else if ( (LA16_0=='f') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3439:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3439:24: 'false'
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3441:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3441:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3441:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\\') ) {
                    alt17=1;
                }
                else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3441:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3441:61: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop17;
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3443:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3443:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3443:11: ( '^' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='^') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3443:11: '^'
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

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3443:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    break loop19;
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3445:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3445:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3445:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3445:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop20;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3445:40: ( ( '\\r' )? '\\n' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\n'||LA22_0=='\r') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3445:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3445:41: ( '\\r' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='\r') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3445:41: '\\r'
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3447:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3447:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3447:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                    alt23=1;
                }


                switch (alt23) {
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3449:16: ( . )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:3449:18: .
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
        // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt24=55;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:274: RULE_HOSTCODE
                {
                mRULE_HOSTCODE(); 

                }
                break;
            case 46 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:288: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 47 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:312: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:328: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 49 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:337: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 50 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:348: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 51 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:361: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 52 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:373: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 53 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:381: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 54 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:397: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 55 :
                // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1:405: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA15_eotS =
        "\5\uffff";
    static final String DFA15_eofS =
        "\5\uffff";
    static final String DFA15_minS =
        "\1\55\1\60\1\56\2\uffff";
    static final String DFA15_maxS =
        "\2\71\1\146\2\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA15_specialS =
        "\5\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\2\uffff\12\2",
            "\12\2",
            "\1\3\1\uffff\12\2\54\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    static class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "3437:14: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' )";
        }
    }
    static final String DFA24_eotS =
        "\3\uffff\1\55\2\uffff\2\55\1\64\3\55\5\uffff\1\77\1\101\3\55\1\uffff"+
        "\1\107\1\uffff\1\55\1\117\1\uffff\6\55\1\51\1\131\1\55\2\51\5\uffff"+
        "\1\55\3\uffff\1\55\1\141\1\55\2\uffff\3\55\12\uffff\4\55\2\uffff"+
        "\1\131\1\uffff\3\55\4\uffff\7\55\3\uffff\1\55\2\uffff\3\55\1\uffff"+
        "\1\55\1\174\2\55\1\177\1\55\1\u0081\1\u0082\1\55\1\u0084\1\u0085"+
        "\1\u0086\2\uffff\14\55\1\uffff\1\55\1\u0094\1\uffff\1\u0095\2\uffff"+
        "\1\u0096\3\uffff\6\55\1\u009d\1\u009e\1\u00a0\4\55\3\uffff\2\55"+
        "\1\u00a7\1\u009e\2\55\2\uffff\1\55\1\uffff\1\55\1\u00ac\1\u00ad"+
        "\3\55\1\uffff\1\u00b1\1\u00b2\1\55\1\u00b4\2\uffff\1\u00b5\1\u00b6"+
        "\1\55\2\uffff\1\55\3\uffff\1\u00b9\1\55\1\uffff\1\55\1\u00bc\1\uffff";
    static final String DFA24_eofS =
        "\u00bd\uffff";
    static final String DFA24_minS =
        "\1\0\2\uffff\1\156\2\uffff\1\162\1\145\1\75\1\141\1\157\1\151\5"+
        "\uffff\2\75\1\162\1\156\1\157\1\uffff\1\60\1\uffff\1\141\1\52\1"+
        "\uffff\1\157\1\156\1\141\1\157\1\164\1\157\1\0\1\56\1\162\1\0\1"+
        "\101\5\uffff\1\160\3\uffff\1\164\1\60\1\164\2\uffff\1\162\1\155"+
        "\1\164\12\uffff\1\145\1\162\1\144\1\156\2\uffff\1\56\1\uffff\1\144"+
        "\1\170\1\156\1\0\3\uffff\1\157\1\163\1\157\1\154\1\165\1\162\1\163"+
        "\3\uffff\1\165\2\uffff\1\165\1\145\1\160\1\uffff\1\165\1\60\1\142"+
        "\1\150\1\60\1\145\2\60\1\145\3\60\2\uffff\1\154\1\151\1\141\1\163"+
        "\1\142\1\151\1\164\1\145\1\164\1\147\1\165\1\162\1\uffff\1\151\1"+
        "\60\1\uffff\1\60\2\uffff\1\60\3\uffff\1\145\1\147\1\164\1\145\1"+
        "\154\1\156\3\60\1\145\1\164\2\156\3\uffff\1\141\1\156\2\60\1\145"+
        "\1\147\2\uffff\1\165\1\uffff\1\162\2\60\1\145\1\156\1\145\1\uffff"+
        "\2\60\1\164\1\60\2\uffff\2\60\1\144\2\uffff\1\160\3\uffff\1\60\1"+
        "\165\1\uffff\1\164\1\60\1\uffff";
    static final String DFA24_maxS =
        "\1\uffff\2\uffff\1\156\2\uffff\1\165\1\145\1\75\1\141\1\157\1\151"+
        "\5\uffff\1\76\1\75\1\165\1\156\1\157\1\uffff\1\71\1\uffff\1\157"+
        "\1\57\1\uffff\1\157\1\156\1\154\1\157\1\164\1\157\1\uffff\1\146"+
        "\1\162\1\uffff\1\172\5\uffff\1\164\3\uffff\1\164\1\172\1\164\2\uffff"+
        "\1\162\1\155\1\164\12\uffff\1\145\1\162\1\144\1\164\2\uffff\1\146"+
        "\1\uffff\1\144\1\170\1\156\1\uffff\3\uffff\1\157\1\163\1\157\1\154"+
        "\1\165\1\162\1\163\3\uffff\1\165\2\uffff\1\165\1\145\1\160\1\uffff"+
        "\1\165\1\172\1\142\1\150\1\172\1\145\2\172\1\145\3\172\2\uffff\1"+
        "\154\1\151\1\141\1\163\1\142\1\151\1\164\1\145\1\164\1\147\1\165"+
        "\1\162\1\uffff\1\151\1\172\1\uffff\1\172\2\uffff\1\172\3\uffff\1"+
        "\145\1\147\1\164\1\145\1\154\1\156\3\172\1\145\1\164\2\156\3\uffff"+
        "\1\141\1\156\2\172\1\145\1\147\2\uffff\1\165\1\uffff\1\162\2\172"+
        "\1\145\1\156\1\145\1\uffff\2\172\1\164\1\172\2\uffff\2\172\1\144"+
        "\2\uffff\1\160\3\uffff\1\172\1\165\1\uffff\1\164\1\172\1\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\6\uffff\1\16\1\17\1\20\1\21\1\22"+
        "\5\uffff\1\34\1\uffff\1\36\2\uffff\1\41\13\uffff\1\64\1\66\1\67"+
        "\1\1\1\2\1\uffff\1\64\1\4\1\5\3\uffff\1\12\1\11\3\uffff\1\16\1\17"+
        "\1\20\1\21\1\22\1\24\1\27\1\23\1\26\1\25\4\uffff\1\34\1\35\1\uffff"+
        "\1\36\4\uffff\1\65\1\40\1\41\7\uffff\1\55\1\60\1\61\1\uffff\1\63"+
        "\1\66\3\uffff\1\31\14\uffff\1\56\1\57\14\uffff\1\13\2\uffff\1\30"+
        "\1\uffff\1\32\1\33\1\uffff\1\37\1\53\1\54\15\uffff\1\15\1\42\1\52"+
        "\6\uffff\1\51\1\62\1\uffff\1\3\6\uffff\1\46\4\uffff\1\6\1\10\3\uffff"+
        "\1\47\1\50\1\uffff\1\45\1\14\1\43\2\uffff\1\44\2\uffff\1\7";
    static final String DFA24_specialS =
        "\1\3\41\uffff\1\1\2\uffff\1\2\47\uffff\1\0\157\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\51\1\45\4\51\1\42\1\1\1\2"+
            "\1\30\1\26\1\4\1\27\1\17\1\32\12\43\1\10\1\5\1\21\1\20\1\22"+
            "\1\33\1\14\32\47\1\15\1\51\1\16\1\46\1\47\1\51\1\24\1\34\1\12"+
            "\1\37\1\47\1\36\1\47\1\41\1\3\3\47\1\31\1\25\1\6\1\23\1\47\1"+
            "\7\1\40\1\44\1\35\1\11\1\13\3\47\uff85\51",
            "",
            "",
            "\1\54",
            "",
            "",
            "\1\61\2\uffff\1\60",
            "\1\62",
            "\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "",
            "",
            "",
            "",
            "\1\75\1\76",
            "\1\100",
            "\1\102\2\uffff\1\103",
            "\1\104",
            "\1\105",
            "",
            "\12\110",
            "",
            "\1\113\7\uffff\1\114\5\uffff\1\112",
            "\1\115\4\uffff\1\116",
            "",
            "\1\121",
            "\1\122",
            "\1\124\12\uffff\1\123",
            "\1\125",
            "\1\126",
            "\1\127",
            "\0\130",
            "\1\132\1\uffff\12\110\54\uffff\1\132",
            "\1\133",
            "\0\134",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "\1\136\3\uffff\1\137",
            "",
            "",
            "",
            "\1\140",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\142",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
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
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\152\5\uffff\1\151",
            "",
            "",
            "\1\132\1\uffff\12\110\54\uffff\1\132",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\52\157\1\156\uffd5\157",
            "",
            "",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "",
            "",
            "\1\167",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\1\173",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\175",
            "\1\176",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0080",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0083",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u009f\13"+
            "\55",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b7",
            "",
            "",
            "\1\u00b8",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_77 = input.LA(1);

                        s = -1;
                        if ( (LA24_77=='*') ) {s = 110;}

                        else if ( ((LA24_77>='\u0000' && LA24_77<=')')||(LA24_77>='+' && LA24_77<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_34 = input.LA(1);

                        s = -1;
                        if ( ((LA24_34>='\u0000' && LA24_34<='\uFFFF')) ) {s = 88;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_37 = input.LA(1);

                        s = -1;
                        if ( ((LA24_37>='\u0000' && LA24_37<='\uFFFF')) ) {s = 92;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='(') ) {s = 1;}

                        else if ( (LA24_0==')') ) {s = 2;}

                        else if ( (LA24_0=='i') ) {s = 3;}

                        else if ( (LA24_0==',') ) {s = 4;}

                        else if ( (LA24_0==';') ) {s = 5;}

                        else if ( (LA24_0=='o') ) {s = 6;}

                        else if ( (LA24_0=='r') ) {s = 7;}

                        else if ( (LA24_0==':') ) {s = 8;}

                        else if ( (LA24_0=='v') ) {s = 9;}

                        else if ( (LA24_0=='c') ) {s = 10;}

                        else if ( (LA24_0=='w') ) {s = 11;}

                        else if ( (LA24_0=='@') ) {s = 12;}

                        else if ( (LA24_0=='[') ) {s = 13;}

                        else if ( (LA24_0==']') ) {s = 14;}

                        else if ( (LA24_0=='.') ) {s = 15;}

                        else if ( (LA24_0=='=') ) {s = 16;}

                        else if ( (LA24_0=='<') ) {s = 17;}

                        else if ( (LA24_0=='>') ) {s = 18;}

                        else if ( (LA24_0=='p') ) {s = 19;}

                        else if ( (LA24_0=='a') ) {s = 20;}

                        else if ( (LA24_0=='n') ) {s = 21;}

                        else if ( (LA24_0=='+') ) {s = 22;}

                        else if ( (LA24_0=='-') ) {s = 23;}

                        else if ( (LA24_0=='*') ) {s = 24;}

                        else if ( (LA24_0=='m') ) {s = 25;}

                        else if ( (LA24_0=='/') ) {s = 26;}

                        else if ( (LA24_0=='?') ) {s = 27;}

                        else if ( (LA24_0=='b') ) {s = 28;}

                        else if ( (LA24_0=='u') ) {s = 29;}

                        else if ( (LA24_0=='f') ) {s = 30;}

                        else if ( (LA24_0=='d') ) {s = 31;}

                        else if ( (LA24_0=='s') ) {s = 32;}

                        else if ( (LA24_0=='h') ) {s = 33;}

                        else if ( (LA24_0=='\'') ) {s = 34;}

                        else if ( ((LA24_0>='0' && LA24_0<='9')) ) {s = 35;}

                        else if ( (LA24_0=='t') ) {s = 36;}

                        else if ( (LA24_0=='\"') ) {s = 37;}

                        else if ( (LA24_0=='^') ) {s = 38;}

                        else if ( ((LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||LA24_0=='e'||LA24_0=='g'||(LA24_0>='j' && LA24_0<='l')||LA24_0=='q'||(LA24_0>='x' && LA24_0<='z')) ) {s = 39;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 40;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='!'||(LA24_0>='#' && LA24_0<='&')||LA24_0=='\\'||LA24_0=='`'||(LA24_0>='{' && LA24_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}