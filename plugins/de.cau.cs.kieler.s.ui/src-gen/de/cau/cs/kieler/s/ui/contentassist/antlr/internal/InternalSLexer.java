package de.cau.cs.kieler.s.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSLexer extends Lexer {
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=9;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int RULE_ID=6;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int RULE_NUMBER=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_COMMENT_ANNOTATION=10;
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
    public static final int RULE_FLOAT=8;
    public static final int RULE_HOSTCODESTRINGTERMINAL=11;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_HOSTCODE=4;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=15;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators

    public InternalSLexer() {;} 
    public InternalSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11:7: ( 'pre' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11:9: 'pre'
            {
            match("pre"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:12:7: ( '|' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:12:9: '|'
            {
            match('|'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:13:7: ( '&' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:13:9: '&'
            {
            match('&'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:14:7: ( '!' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:14:9: '!'
            {
            match('!'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:15:7: ( '+' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:15:9: '+'
            {
            match('+'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:16:7: ( '-' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:16:9: '-'
            {
            match('-'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:17:7: ( '*' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:17:9: '*'
            {
            match('*'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:18:7: ( 'mod' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:18:9: 'mod'
            {
            match("mod"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:19:7: ( '/' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:19:9: '/'
            {
            match('/'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:20:7: ( 'val' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:20:9: 'val'
            {
            match("val"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:21:7: ( '=' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:21:9: '='
            {
            match('='); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:22:7: ( '<' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:22:9: '<'
            {
            match('<'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:23:7: ( '<=' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:23:9: '<='
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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:24:7: ( '>' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:24:9: '>'
            {
            match('>'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:25:7: ( '>=' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:25:9: '>='
            {
            match(">="); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:26:7: ( '<>' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:26:9: '<>'
            {
            match("<>"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:27:7: ( 'pure' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:27:9: 'pure'
            {
            match("pure"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:28:7: ( 'boolean' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:28:9: 'boolean'
            {
            match("boolean"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:29:7: ( 'unsigned' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:29:9: 'unsigned'
            {
            match("unsigned"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:30:7: ( 'integer' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:30:9: 'integer'
            {
            match("integer"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:31:7: ( 'float' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:31:9: 'float'
            {
            match("float"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:32:7: ( 'double' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:32:9: 'double'
            {
            match("double"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:33:7: ( 'string' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:33:9: 'string'
            {
            match("string"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:34:7: ( 'host' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:34:9: 'host'
            {
            match("host"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:35:7: ( 'none' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:35:9: 'none'
            {
            match("none"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:36:7: ( 'max' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:36:9: 'max'
            {
            match("max"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:37:7: ( 'min' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:37:9: 'min'
            {
            match("min"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:38:7: ( 'synchronous program' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:38:9: 'synchronous program'
            {
            match("synchronous program"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:39:7: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:39:9: '('
            {
            match('('); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:40:7: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:40:9: ')'
            {
            match(')'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:41:7: ( '\\'' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:41:9: '\\''
            {
            match('\''); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:42:7: ( 'state' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:42:9: 'state'
            {
            match("state"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:43:7: ( '{' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:43:9: '{'
            {
            match('{'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:44:7: ( '}' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:44:9: '}'
            {
            match('}'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:45:7: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:45:9: ';'
            {
            match(';'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:46:7: ( 'thread' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:46:9: 'thread'
            {
            match("thread"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:47:7: ( ':=' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:47:9: ':='
            {
            match(":="); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:48:7: ( ':' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:48:9: ':'
            {
            match(':'); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:49:7: ( 'combine' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:49:9: 'combine'
            {
            match("combine"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:50:7: ( 'with' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:50:9: 'with'
            {
            match("with"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:51:7: ( 'prio' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:51:9: 'prio'
            {
            match("prio"); 


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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:52:7: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:52:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:53:7: ( 'trans' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:53:9: 'trans'
            {
            match("trans"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:54:7: ( 'fork' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:54:9: 'fork'
            {
            match("fork"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:55:7: ( 'join' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:55:9: 'join'
            {
            match("join"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:56:7: ( 'pause' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:56:9: 'pause'
            {
            match("pause"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:57:7: ( 'term' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:57:9: 'term'
            {
            match("term"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:58:7: ( 'halt' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:58:9: 'halt'
            {
            match("halt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:59:7: ( 'signal' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:59:9: 'signal'
            {
            match("signal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:60:7: ( 'emit' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:60:9: 'emit'
            {
            match("emit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:61:7: ( 'abort' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:61:9: 'abort'
            {
            match("abort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:62:7: ( 'if' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:62:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:63:7: ( 'await' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:63:9: 'await'
            {
            match("await"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:64:7: ( '@' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:64:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:65:7: ( '[' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:65:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:66:7: ( ']' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:66:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:67:7: ( '.' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:67:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:68:7: ( 'input' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:68:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:69:7: ( 'output' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:69:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "RULE_HOSTCODESTRINGTERMINAL"
    public final void mRULE_HOSTCODESTRINGTERMINAL() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODESTRINGTERMINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11302:29: ( '$' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '\"' | '0' .. '9' )+ '$' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11302:31: '$' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '\"' | '0' .. '9' )+ '$'
            {
            match('$'); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11302:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '\"' | '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\"'||LA1_0=='.'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:
            	    {
            	    if ( input.LA(1)=='\"'||input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HOSTCODESTRINGTERMINAL"

    // $ANTLR start "RULE_HOSTCODE"
    public final void mRULE_HOSTCODE() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11304:15: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11304:17: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11304:22: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11304:23: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11304:64: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop2;
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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11306:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11306:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11306:33: ( options {greedy=false; } : . )*
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
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11306:61: .
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
    // $ANTLR end "RULE_COMMENT_ANNOTATION"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11308:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11308:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11308:31: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11308:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11310:22: ( '0' .. '9' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11310:24: '0' .. '9'
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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11312:10: ( ( '-' )? ( RULE_NUMBER )+ )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11312:12: ( '-' )? ( RULE_NUMBER )+
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11312:12: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11312:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11312:17: ( RULE_NUMBER )+
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
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11312:17: RULE_NUMBER
            	    {
            	    mRULE_NUMBER(); 

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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:12: ( ( ( '-' )? ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( '-' )? ( RULE_NUMBER )+ 'f' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:14: ( ( '-' )? ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( '-' )? ( RULE_NUMBER )+ 'f' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:14: ( ( '-' )? ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( '-' )? ( RULE_NUMBER )+ 'f' )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:15: ( '-' )? ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )?
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:15: ( '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:15: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:20: ( RULE_NUMBER )+
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
                    	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:20: RULE_NUMBER
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

                    match('.'); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:37: ( RULE_NUMBER )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:37: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:50: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:51: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:61: ( '+' | '-' )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0=='+'||LA10_0=='-') ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:
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

                            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:72: ( RULE_NUMBER )+
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
                            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:72: RULE_NUMBER
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


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:87: ( 'f' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='f') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:87: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:92: ( '-' )? ( RULE_NUMBER )+ 'f'
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:92: ( '-' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='-') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:92: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:97: ( RULE_NUMBER )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11314:97: RULE_NUMBER
                    	    {
                    	    mRULE_NUMBER(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11316:14: ( ( 'true' | 'false' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11316:16: ( 'true' | 'false' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11316:16: ( 'true' | 'false' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='t') ) {
                alt17=1;
            }
            else if ( (LA17_0=='f') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11316:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11316:24: 'false'
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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11318:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11318:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11318:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\\') ) {
                    alt18=1;
                }
                else if ( ((LA18_0>='\u0000' && LA18_0<='!')||(LA18_0>='#' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11318:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11318:61: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop18;
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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11320:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11320:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11320:11: ( '^' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='^') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11320:11: '^'
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

            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11320:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='a' && LA20_0<='z')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:
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
            	    break loop20;
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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11322:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11322:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11322:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11322:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop21;
                }
            } while (true);

            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11322:40: ( ( '\\r' )? '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11322:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11322:41: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11322:41: '\\r'
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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11324:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11324:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11324:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11326:16: ( . )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:11326:18: .
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
        // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | RULE_HOSTCODESTRINGTERMINAL | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt25=71;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:364: RULE_HOSTCODESTRINGTERMINAL
                {
                mRULE_HOSTCODESTRINGTERMINAL(); 

                }
                break;
            case 61 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:392: RULE_HOSTCODE
                {
                mRULE_HOSTCODE(); 

                }
                break;
            case 62 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:406: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 63 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:430: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 64 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:446: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 65 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:455: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 66 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:466: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 67 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:479: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 68 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:491: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 69 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:499: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 70 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:515: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 71 :
                // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1:523: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA16_eotS =
        "\5\uffff";
    static final String DFA16_eofS =
        "\5\uffff";
    static final String DFA16_minS =
        "\1\55\1\60\1\56\2\uffff";
    static final String DFA16_maxS =
        "\2\71\1\146\2\uffff";
    static final String DFA16_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA16_specialS =
        "\5\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\2\uffff\12\2",
            "\12\2",
            "\1\4\1\uffff\12\2\54\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "11314:14: ( ( '-' )? ( RULE_NUMBER )+ '.' ( RULE_NUMBER )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_NUMBER )+ )? ( 'f' )? | ( '-' )? ( RULE_NUMBER )+ 'f' )";
        }
    }
    static final String DFA25_eotS =
        "\1\uffff\1\63\4\uffff\1\71\1\uffff\1\63\1\100\1\63\1\uffff\1\105"+
        "\1\107\10\63\2\uffff\1\130\3\uffff\1\63\1\141\2\63\1\uffff\3\63"+
        "\4\uffff\1\63\1\57\1\157\2\57\3\uffff\3\63\5\uffff\1\157\2\uffff"+
        "\3\63\3\uffff\1\63\6\uffff\3\63\1\u0081\12\63\7\uffff\3\63\2\uffff"+
        "\2\63\1\uffff\4\63\4\uffff\1\63\5\uffff\1\u0098\3\63\1\u009c\1\u009d"+
        "\1\u009e\2\uffff\1\u009f\4\63\1\uffff\26\63\1\uffff\1\u00ba\1\u00bb"+
        "\1\63\4\uffff\5\63\1\u00c2\6\63\1\u00c9\1\u00ca\1\u00cb\2\63\1\u00ce"+
        "\1\u00cf\1\63\1\u00d1\1\u00d2\1\u00d3\3\63\2\uffff\1\u00d7\3\63"+
        "\1\u00db\1\u00dc\1\uffff\1\u00ce\2\63\1\u00df\2\63\3\uffff\1\63"+
        "\1\u00e3\2\uffff\1\63\3\uffff\1\u00e5\1\u00e6\1\63\1\uffff\3\63"+
        "\2\uffff\1\u00eb\1\u00ec\1\uffff\1\63\1\u00ee\1\u00ef\1\uffff\1"+
        "\63\2\uffff\1\u00f1\1\u00f2\1\63\1\u00f4\2\uffff\1\63\2\uffff\1"+
        "\u00f6\2\uffff\1\u00f7\1\uffff\1\63\2\uffff\3\63\1\uffff";
    static final String DFA25_eofS =
        "\u00fc\uffff";
    static final String DFA25_minS =
        "\1\0\1\141\4\uffff\1\60\1\uffff\1\141\1\52\1\141\1\uffff\2\75\1"+
        "\157\1\156\1\146\1\141\1\157\1\151\1\141\1\157\2\uffff\1\0\3\uffff"+
        "\1\145\1\75\1\157\1\151\1\uffff\1\157\1\155\1\142\4\uffff\1\165"+
        "\1\42\1\56\1\0\1\101\3\uffff\1\145\1\162\1\165\5\uffff\1\56\2\uffff"+
        "\1\144\1\170\1\156\1\0\2\uffff\1\154\6\uffff\1\157\1\163\1\160\1"+
        "\60\1\157\1\162\1\154\1\165\1\141\1\156\1\147\1\163\1\154\1\156"+
        "\7\uffff\1\162\1\141\1\162\2\uffff\1\155\1\164\1\uffff\2\151\1\157"+
        "\1\141\4\uffff\1\164\5\uffff\1\60\1\157\1\145\1\163\3\60\2\uffff"+
        "\1\60\1\154\1\151\1\145\1\165\1\uffff\1\141\1\153\1\163\1\142\1"+
        "\151\1\164\1\143\1\156\2\164\2\145\1\156\1\145\1\155\1\142\1\150"+
        "\1\156\1\164\1\162\1\151\1\160\1\uffff\2\60\1\145\4\uffff\1\145"+
        "\2\147\2\164\1\60\1\145\1\154\1\156\1\145\1\150\1\141\3\60\1\141"+
        "\1\163\2\60\1\151\3\60\2\164\1\165\2\uffff\1\60\1\141\1\156\1\145"+
        "\2\60\1\uffff\1\60\1\145\1\147\1\60\1\162\1\154\3\uffff\1\144\1"+
        "\60\2\uffff\1\156\3\uffff\2\60\1\164\1\uffff\1\156\1\145\1\162\2"+
        "\uffff\2\60\1\uffff\1\157\2\60\1\uffff\1\145\2\uffff\2\60\1\144"+
        "\1\60\2\uffff\1\156\2\uffff\1\60\2\uffff\1\60\1\uffff\1\157\2\uffff"+
        "\1\165\1\163\1\40\1\uffff";
    static final String DFA25_maxS =
        "\1\uffff\1\165\4\uffff\1\71\1\uffff\1\157\1\57\1\141\1\uffff\1"+
        "\76\1\75\1\157\2\156\2\157\1\171\2\157\2\uffff\1\uffff\3\uffff\1"+
        "\162\1\75\1\157\1\151\1\uffff\1\157\1\155\1\167\4\uffff\1\165\1"+
        "\172\1\146\1\uffff\1\172\3\uffff\1\151\1\162\1\165\5\uffff\1\146"+
        "\2\uffff\1\144\1\170\1\156\1\uffff\2\uffff\1\154\6\uffff\1\157\1"+
        "\163\1\164\1\172\1\157\1\162\1\154\1\165\1\162\1\156\1\147\1\163"+
        "\1\154\1\156\7\uffff\1\162\1\165\1\162\2\uffff\1\155\1\164\1\uffff"+
        "\2\151\1\157\1\141\4\uffff\1\164\5\uffff\1\172\1\157\1\145\1\163"+
        "\3\172\2\uffff\1\172\1\154\1\151\1\145\1\165\1\uffff\1\141\1\153"+
        "\1\163\1\142\1\151\1\164\1\143\1\156\2\164\2\145\1\156\1\145\1\155"+
        "\1\142\1\150\1\156\1\164\1\162\1\151\1\160\1\uffff\2\172\1\145\4"+
        "\uffff\1\145\2\147\2\164\1\172\1\145\1\154\1\156\1\145\1\150\1\141"+
        "\3\172\1\141\1\163\2\172\1\151\3\172\2\164\1\165\2\uffff\1\172\1"+
        "\141\1\156\1\145\2\172\1\uffff\1\172\1\145\1\147\1\172\1\162\1\154"+
        "\3\uffff\1\144\1\172\2\uffff\1\156\3\uffff\2\172\1\164\1\uffff\1"+
        "\156\1\145\1\162\2\uffff\2\172\1\uffff\1\157\2\172\1\uffff\1\145"+
        "\2\uffff\2\172\1\144\1\172\2\uffff\1\156\2\uffff\1\172\2\uffff\1"+
        "\172\1\uffff\1\157\2\uffff\1\165\1\163\1\40\1\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\uffff\1\7\3\uffff\1\13\12\uffff\1\35"+
        "\1\36\1\uffff\1\41\1\42\1\43\4\uffff\1\52\3\uffff\1\66\1\67\1\70"+
        "\1\71\5\uffff\1\104\1\106\1\107\3\uffff\1\104\1\2\1\3\1\4\1\5\1"+
        "\uffff\1\6\1\7\4\uffff\1\105\1\11\1\uffff\1\13\1\15\1\20\1\14\1"+
        "\17\1\16\16\uffff\1\35\1\36\1\37\1\75\1\41\1\42\1\43\3\uffff\1\45"+
        "\1\46\2\uffff\1\52\4\uffff\1\66\1\67\1\70\1\71\1\uffff\1\74\1\100"+
        "\1\101\1\103\1\106\7\uffff\1\76\1\77\5\uffff\1\64\26\uffff\1\1\3"+
        "\uffff\1\10\1\32\1\33\1\12\32\uffff\1\51\1\21\6\uffff\1\54\6\uffff"+
        "\1\30\1\60\1\31\2\uffff\1\102\1\57\1\uffff\1\50\1\55\1\62\3\uffff"+
        "\1\56\3\uffff\1\72\1\25\2\uffff\1\40\3\uffff\1\53\1\uffff\1\63\1"+
        "\65\4\uffff\1\26\1\27\1\uffff\1\61\1\44\1\uffff\1\73\1\22\1\uffff"+
        "\1\24\1\uffff\1\47\1\23\3\uffff\1\34";
    static final String DFA25_specialS =
        "\1\1\27\uffff\1\2\22\uffff\1\3\22\uffff\1\0\u00bd\uffff}>";
    static final String[] DFA25_transitionS = {
            "\11\57\2\56\2\57\1\56\22\57\1\56\1\4\1\53\1\57\1\51\1\57\1"+
            "\3\1\30\1\26\1\27\1\7\1\5\1\40\1\6\1\47\1\11\12\52\1\35\1\33"+
            "\1\14\1\13\1\15\1\57\1\44\32\55\1\45\1\57\1\46\1\54\1\55\1\57"+
            "\1\43\1\16\1\36\1\22\1\42\1\21\1\55\1\24\1\20\1\41\2\55\1\10"+
            "\1\25\1\50\1\1\2\55\1\23\1\34\1\17\1\12\1\37\3\55\1\31\1\2\1"+
            "\32\uff82\57",
            "\1\62\20\uffff\1\60\2\uffff\1\61",
            "",
            "",
            "",
            "",
            "\12\70",
            "",
            "\1\74\7\uffff\1\75\5\uffff\1\73",
            "\1\76\4\uffff\1\77",
            "\1\101",
            "",
            "\1\103\1\104",
            "\1\106",
            "\1\110",
            "\1\111",
            "\1\113\7\uffff\1\112",
            "\1\116\12\uffff\1\114\2\uffff\1\115",
            "\1\117",
            "\1\122\12\uffff\1\120\4\uffff\1\121",
            "\1\124\15\uffff\1\123",
            "\1\125",
            "",
            "",
            "\0\131",
            "",
            "",
            "",
            "\1\137\2\uffff\1\135\11\uffff\1\136",
            "\1\140",
            "\1\142",
            "\1\143",
            "",
            "\1\145",
            "\1\146",
            "\1\147\24\uffff\1\150",
            "",
            "",
            "",
            "",
            "\1\155",
            "\1\156\13\uffff\1\156\1\uffff\12\156\7\uffff\32\156\4\uffff"+
            "\1\156\1\uffff\32\156",
            "\1\160\1\uffff\12\70\54\uffff\1\160",
            "\0\161",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "\1\163\3\uffff\1\164",
            "\1\165",
            "\1\166",
            "",
            "",
            "",
            "",
            "",
            "\1\160\1\uffff\12\70\54\uffff\1\160",
            "",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\52\173\1\172\uffd5\173",
            "",
            "",
            "\1\174",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\175",
            "\1\176",
            "\1\u0080\3\uffff\1\177",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0087\20\uffff\1\u0086",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008d",
            "\1\u008e\23\uffff\1\u008f",
            "\1\u0090",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "",
            "",
            "",
            "\1\u0097",
            "",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00bc",
            "",
            "",
            "",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00cc",
            "\1\u00cd",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00dd",
            "\1\u00de",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "",
            "",
            "\1\u00e2",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u00e4",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00ed",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00f0",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u00f5",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00f8",
            "",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | RULE_HOSTCODESTRINGTERMINAL | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_STRING | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_62 = input.LA(1);

                        s = -1;
                        if ( (LA25_62=='*') ) {s = 122;}

                        else if ( ((LA25_62>='\u0000' && LA25_62<=')')||(LA25_62>='+' && LA25_62<='\uFFFF')) ) {s = 123;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_0 = input.LA(1);

                        s = -1;
                        if ( (LA25_0=='p') ) {s = 1;}

                        else if ( (LA25_0=='|') ) {s = 2;}

                        else if ( (LA25_0=='&') ) {s = 3;}

                        else if ( (LA25_0=='!') ) {s = 4;}

                        else if ( (LA25_0=='+') ) {s = 5;}

                        else if ( (LA25_0=='-') ) {s = 6;}

                        else if ( (LA25_0=='*') ) {s = 7;}

                        else if ( (LA25_0=='m') ) {s = 8;}

                        else if ( (LA25_0=='/') ) {s = 9;}

                        else if ( (LA25_0=='v') ) {s = 10;}

                        else if ( (LA25_0=='=') ) {s = 11;}

                        else if ( (LA25_0=='<') ) {s = 12;}

                        else if ( (LA25_0=='>') ) {s = 13;}

                        else if ( (LA25_0=='b') ) {s = 14;}

                        else if ( (LA25_0=='u') ) {s = 15;}

                        else if ( (LA25_0=='i') ) {s = 16;}

                        else if ( (LA25_0=='f') ) {s = 17;}

                        else if ( (LA25_0=='d') ) {s = 18;}

                        else if ( (LA25_0=='s') ) {s = 19;}

                        else if ( (LA25_0=='h') ) {s = 20;}

                        else if ( (LA25_0=='n') ) {s = 21;}

                        else if ( (LA25_0=='(') ) {s = 22;}

                        else if ( (LA25_0==')') ) {s = 23;}

                        else if ( (LA25_0=='\'') ) {s = 24;}

                        else if ( (LA25_0=='{') ) {s = 25;}

                        else if ( (LA25_0=='}') ) {s = 26;}

                        else if ( (LA25_0==';') ) {s = 27;}

                        else if ( (LA25_0=='t') ) {s = 28;}

                        else if ( (LA25_0==':') ) {s = 29;}

                        else if ( (LA25_0=='c') ) {s = 30;}

                        else if ( (LA25_0=='w') ) {s = 31;}

                        else if ( (LA25_0==',') ) {s = 32;}

                        else if ( (LA25_0=='j') ) {s = 33;}

                        else if ( (LA25_0=='e') ) {s = 34;}

                        else if ( (LA25_0=='a') ) {s = 35;}

                        else if ( (LA25_0=='@') ) {s = 36;}

                        else if ( (LA25_0=='[') ) {s = 37;}

                        else if ( (LA25_0==']') ) {s = 38;}

                        else if ( (LA25_0=='.') ) {s = 39;}

                        else if ( (LA25_0=='o') ) {s = 40;}

                        else if ( (LA25_0=='$') ) {s = 41;}

                        else if ( ((LA25_0>='0' && LA25_0<='9')) ) {s = 42;}

                        else if ( (LA25_0=='\"') ) {s = 43;}

                        else if ( (LA25_0=='^') ) {s = 44;}

                        else if ( ((LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||LA25_0=='g'||(LA25_0>='k' && LA25_0<='l')||(LA25_0>='q' && LA25_0<='r')||(LA25_0>='x' && LA25_0<='z')) ) {s = 45;}

                        else if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {s = 46;}

                        else if ( ((LA25_0>='\u0000' && LA25_0<='\b')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\u001F')||LA25_0=='#'||LA25_0=='%'||LA25_0=='?'||LA25_0=='\\'||LA25_0=='`'||(LA25_0>='~' && LA25_0<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_24 = input.LA(1);

                        s = -1;
                        if ( ((LA25_24>='\u0000' && LA25_24<='\uFFFF')) ) {s = 89;}

                        else s = 88;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_43 = input.LA(1);

                        s = -1;
                        if ( ((LA25_43>='\u0000' && LA25_43<='\uFFFF')) ) {s = 113;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}