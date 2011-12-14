package de.cau.cs.kieler.kies.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsterelLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int RULE_ESTEREL_ML_COMMENT=12;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_STRING=8;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=7;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__110=110;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int RULE_ESTEREL_SL_COMMENT=11;
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
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_HOSTCODE=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=15;

    // delegates
    // delegators

    public InternalEsterelLexer() {;} 
    public InternalEsterelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEsterelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11:7: ( 'module' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11:9: 'module'
            {
            match("module"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:12:7: ( ':' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:12:9: ':'
            {
            match(':'); 

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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:13:7: ( 'end' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:13:9: 'end'
            {
            match("end"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:14:7: ( '.' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:14:9: '.'
            {
            match('.'); 

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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:15:7: ( '(' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:15:9: '('
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

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:16:7: ( ')' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:16:9: ')'
            {
            match(')'); 

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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:17:7: ( ':=' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:17:9: ':='
            {
            match(":="); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:18:7: ( 'combine' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:18:9: 'combine'
            {
            match("combine"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:19:7: ( 'with' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:19:9: 'with'
            {
            match("with"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:20:7: ( 'signal' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:20:9: 'signal'
            {
            match("signal"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:21:7: ( 'in' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:21:9: 'in'
            {
            match("in"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:22:7: ( ',' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:22:9: ','
            {
            match(','); 

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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:23:7: ( 'sensor' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:23:9: 'sensor'
            {
            match("sensor"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:24:7: ( ';' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:24:9: ';'
            {
            match(';'); 

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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:25:7: ( 'relation' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:25:9: 'relation'
            {
            match("relation"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:26:7: ( '=>' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:26:9: '=>'
            {
            match("=>"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:27:7: ( '#' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:27:9: '#'
            {
            match('#'); 

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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:28:7: ( 'type' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:28:9: 'type'
            {
            match("type"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:29:7: ( 'constant' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:29:9: 'constant'
            {
            match("constant"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:30:7: ( '=' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:30:9: '='
            {
            match('='); 

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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:31:7: ( 'function' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:31:9: 'function'
            {
            match("function"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:32:7: ( 'procedure' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:32:9: 'procedure'
            {
            match("procedure"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:33:7: ( 'task' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:33:9: 'task'
            {
            match("task"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:34:7: ( '||' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:34:9: '||'
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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:35:7: ( '[' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:35:9: '['
            {
            match('['); 

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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:36:7: ( ']' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:36:9: ']'
            {
            match(']'); 

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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:37:7: ( 'abort' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:37:9: 'abort'
            {
            match("abort"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:38:7: ( 'when' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:38:9: 'when'
            {
            match("when"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:39:7: ( 'do' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:39:9: 'do'
            {
            match("do"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:40:7: ( 'case' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:40:9: 'case'
            {
            match("case"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:41:7: ( 'weak' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:41:9: 'weak'
            {
            match("weak"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:42:7: ( 'await' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:42:9: 'await'
            {
            match("await"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:43:7: ( 'call' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:43:9: 'call'
            {
            match("call"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:44:7: ( 'upto' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:44:9: 'upto'
            {
            match("upto"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:45:7: ( 'watching' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:45:9: 'watching'
            {
            match("watching"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:46:7: ( 'timeout' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:46:9: 'timeout'
            {
            match("timeout"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:47:7: ( 'emit' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:47:9: 'emit'
            {
            match("emit"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:48:7: ( 'every' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:48:9: 'every'
            {
            match("every"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:49:7: ( 'exit' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:49:9: 'exit'
            {
            match("exit"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:50:7: ( 'halt' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:50:9: 'halt'
            {
            match("halt"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:51:7: ( 'if' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:51:9: 'if'
            {
            match("if"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:52:7: ( 'elsif' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:52:9: 'elsif'
            {
            match("elsif"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:53:7: ( 'then' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:53:9: 'then'
            {
            match("then"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:54:7: ( 'else' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:54:9: 'else'
            {
            match("else"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:55:7: ( 'loop' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:55:9: 'loop'
            {
            match("loop"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:56:7: ( 'each' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:56:9: 'each'
            {
            match("each"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:57:7: ( 'nothing' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:57:9: 'nothing'
            {
            match("nothing"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:58:7: ( 'pause' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:58:9: 'pause'
            {
            match("pause"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:59:7: ( 'present' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:59:9: 'present'
            {
            match("present"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:60:7: ( 'positive' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:60:9: 'positive'
            {
            match("positive"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:61:7: ( 'repeat' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:61:9: 'repeat'
            {
            match("repeat"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:62:7: ( 'times' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:62:9: 'times'
            {
            match("times"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:63:7: ( 'run' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:63:9: 'run'
            {
            match("run"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:64:7: ( 'copymodule' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:64:9: 'copymodule'
            {
            match("copymodule"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:65:7: ( '/' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:65:9: '/'
            {
            match('/'); 

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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:66:7: ( 'tick' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:66:9: 'tick'
            {
            match("tick"); 


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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:67:7: ( '*' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:67:9: '*'
            {
            match('*'); 

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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:68:7: ( '+' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:68:9: '+'
            {
            match('+'); 

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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:69:7: ( '-' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:69:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:70:7: ( 'mod' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:70:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:71:7: ( '<>' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:71:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:72:7: ( '>' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:72:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:73:7: ( '<' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:73:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:74:7: ( '<=' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:74:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:75:7: ( '>=' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:75:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:76:7: ( 'not' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:76:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:77:7: ( 'and' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:77:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:78:7: ( 'or' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:78:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:79:7: ( 'suspend' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:79:9: 'suspend'
            {
            match("suspend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:80:7: ( 'sustain' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:80:9: 'sustain'
            {
            match("sustain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:81:7: ( 'trap' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:81:9: 'trap'
            {
            match("trap"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:82:7: ( 'handle' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:82:9: 'handle'
            {
            match("handle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:83:7: ( 'var' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:83:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:84:7: ( '??' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:84:9: '??'
            {
            match("??"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:85:7: ( 'immediate' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:85:9: 'immediate'
            {
            match("immediate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:86:7: ( 'exec' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:86:9: 'exec'
            {
            match("exec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:87:7: ( 'return' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:87:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:88:7: ( 'input' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:88:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:89:7: ( 'output' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:89:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:90:7: ( 'inputoutput' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:90:9: 'inputoutput'
            {
            match("inputoutput"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:91:7: ( '@' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:91:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:92:7: ( 'pre' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:92:9: 'pre'
            {
            match("pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:93:7: ( '?' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:93:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:94:8: ( 'pure' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:94:10: 'pure'
            {
            match("pure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:95:8: ( 'boolean' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:95:10: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:96:8: ( 'unsigned' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:96:10: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:97:8: ( 'integer' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:97:10: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:98:8: ( 'float' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:98:10: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:99:8: ( 'double' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:99:10: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:100:8: ( 'string' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:100:10: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:101:8: ( 'host' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:101:10: 'host'
            {
            match("host"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:102:8: ( 'none' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:102:10: 'none'
            {
            match("none"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:103:8: ( 'max' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:103:10: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:104:8: ( 'min' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:104:10: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "RULE_ESTEREL_SL_COMMENT"
    public final void mRULE_ESTEREL_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ESTEREL_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11945:25: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11945:27: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11945:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11945:31: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop1;
                }
            } while (true);

            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11945:47: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11945:48: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11945:48: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11945:48: '\\r'
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
    // $ANTLR end "RULE_ESTEREL_SL_COMMENT"

    // $ANTLR start "RULE_ESTEREL_ML_COMMENT"
    public final void mRULE_ESTEREL_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ESTEREL_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11947:25: ( '%' '{' ( options {greedy=false; } : . )* '}' '%' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11947:27: '%' '{' ( options {greedy=false; } : . )* '}' '%'
            {
            match('%'); 
            match('{'); 
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11947:35: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='}') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='%') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='$')||(LA4_1>='&' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='|')||(LA4_0>='~' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11947:63: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('}'); 
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESTEREL_ML_COMMENT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11949:13: ( '\"' (~ ( '\"' ) | '\"' '\"' )* '\"' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11949:15: '\"' (~ ( '\"' ) | '\"' '\"' )* '\"'
            {
            match('\"'); 
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11949:19: (~ ( '\"' ) | '\"' '\"' )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\"') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='\"') ) {
                        alt5=2;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11949:20: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11949:27: '\"' '\"'
            	    {
            	    match('\"'); 
            	    match('\"'); 

            	    }
            	    break;

            	default :
            	    break loop5;
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

    // $ANTLR start "RULE_HOSTCODE"
    public final void mRULE_HOSTCODE() throws RecognitionException {
        try {
            int _type = RULE_HOSTCODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11951:15: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11951:17: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11951:22: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11951:23: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11951:64: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop6;
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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11953:25: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11953:27: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11953:33: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11953:61: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11955:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11955:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11955:31: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11955:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11957:10: ( ( '-' )? ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11957:12: ( '-' )? ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11957:12: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11957:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11957:17: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11957:18: '0' .. '9'
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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:12: ( ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' ) )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:14: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' )
            {
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:14: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:15: ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )?
                    {
                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:15: ( '-' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='-') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:15: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:20: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:21: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    match('.'); 
                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:36: ( '0' .. '9' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:37: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:48: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:49: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:59: ( '+' | '-' )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0=='+'||LA14_0=='-') ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:
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

                            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:70: ( '0' .. '9' )+
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
                            	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:71: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

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


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:84: ( 'f' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='f') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:84: 'f'
                            {
                            match('f'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:89: ( '-' )? ( '0' .. '9' )+ 'f'
                    {
                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:89: ( '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='-') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:89: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:94: ( '0' .. '9' )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11959:95: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11961:14: ( ( 'true' | 'false' ) )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11961:16: ( 'true' | 'false' )
            {
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11961:16: ( 'true' | 'false' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='t') ) {
                alt21=1;
            }
            else if ( (LA21_0=='f') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11961:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11961:24: 'false'
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11963:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11963:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11963:11: ( '^' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='^') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11963:11: '^'
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

            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11963:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:
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
            	    break loop23;
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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11965:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11965:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11965:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11965:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop24;
                }
            } while (true);

            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11965:40: ( ( '\\r' )? '\\n' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\n'||LA26_0=='\r') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11965:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11965:41: ( '\\r' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='\r') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11965:41: '\\r'
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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11967:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11967:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11967:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:
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
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11969:16: ( . )
            // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:11969:18: .
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
        // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | RULE_ESTEREL_SL_COMMENT | RULE_ESTEREL_ML_COMMENT | RULE_STRING | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt28=107;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:406: T__83
                {
                mT__83(); 

                }
                break;
            case 68 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:412: T__84
                {
                mT__84(); 

                }
                break;
            case 69 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:418: T__85
                {
                mT__85(); 

                }
                break;
            case 70 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:424: T__86
                {
                mT__86(); 

                }
                break;
            case 71 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:430: T__87
                {
                mT__87(); 

                }
                break;
            case 72 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:436: T__88
                {
                mT__88(); 

                }
                break;
            case 73 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:442: T__89
                {
                mT__89(); 

                }
                break;
            case 74 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:448: T__90
                {
                mT__90(); 

                }
                break;
            case 75 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:454: T__91
                {
                mT__91(); 

                }
                break;
            case 76 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:460: T__92
                {
                mT__92(); 

                }
                break;
            case 77 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:466: T__93
                {
                mT__93(); 

                }
                break;
            case 78 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:472: T__94
                {
                mT__94(); 

                }
                break;
            case 79 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:478: T__95
                {
                mT__95(); 

                }
                break;
            case 80 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:484: T__96
                {
                mT__96(); 

                }
                break;
            case 81 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:490: T__97
                {
                mT__97(); 

                }
                break;
            case 82 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:496: T__98
                {
                mT__98(); 

                }
                break;
            case 83 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:502: T__99
                {
                mT__99(); 

                }
                break;
            case 84 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:508: T__100
                {
                mT__100(); 

                }
                break;
            case 85 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:515: T__101
                {
                mT__101(); 

                }
                break;
            case 86 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:522: T__102
                {
                mT__102(); 

                }
                break;
            case 87 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:529: T__103
                {
                mT__103(); 

                }
                break;
            case 88 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:536: T__104
                {
                mT__104(); 

                }
                break;
            case 89 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:543: T__105
                {
                mT__105(); 

                }
                break;
            case 90 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:550: T__106
                {
                mT__106(); 

                }
                break;
            case 91 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:557: T__107
                {
                mT__107(); 

                }
                break;
            case 92 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:564: T__108
                {
                mT__108(); 

                }
                break;
            case 93 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:571: T__109
                {
                mT__109(); 

                }
                break;
            case 94 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:578: T__110
                {
                mT__110(); 

                }
                break;
            case 95 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:585: RULE_ESTEREL_SL_COMMENT
                {
                mRULE_ESTEREL_SL_COMMENT(); 

                }
                break;
            case 96 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:609: RULE_ESTEREL_ML_COMMENT
                {
                mRULE_ESTEREL_ML_COMMENT(); 

                }
                break;
            case 97 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:633: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 98 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:645: RULE_HOSTCODE
                {
                mRULE_HOSTCODE(); 

                }
                break;
            case 99 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:659: RULE_COMMENT_ANNOTATION
                {
                mRULE_COMMENT_ANNOTATION(); 

                }
                break;
            case 100 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:683: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 101 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:699: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 102 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:708: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 103 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:719: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 104 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:732: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 105 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:740: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 106 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:756: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 107 :
                // ../de.cau.cs.kieler.kies/src-gen/de/cau/cs/kieler/kies/parser/antlr/internal/InternalEsterel.g:1:764: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA20_eotS =
        "\5\uffff";
    static final String DFA20_eofS =
        "\5\uffff";
    static final String DFA20_minS =
        "\1\55\1\60\1\56\2\uffff";
    static final String DFA20_maxS =
        "\2\71\1\146\2\uffff";
    static final String DFA20_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA20_specialS =
        "\5\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\2\uffff\12\2",
            "\12\2",
            "\1\4\1\uffff\12\2\54\uffff\1\3",
            "",
            ""
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
            return "11959:14: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? | ( '-' )? ( '0' .. '9' )+ 'f' )";
        }
    }
    static final String DFA28_eotS =
        "\1\uffff\1\62\1\64\1\62\3\uffff\4\62\2\uffff\1\62\1\120\1\uffff"+
        "\3\62\1\56\2\uffff\6\62\1\155\2\uffff\1\160\1\164\1\166\2\62\1\173"+
        "\1\uffff\1\62\1\177\2\56\1\u0082\1\56\3\uffff\3\62\3\uffff\6\62"+
        "\3\uffff\12\62\1\u009e\1\u009f\1\62\2\uffff\2\62\3\uffff\14\62\3"+
        "\uffff\3\62\1\u00b8\6\62\6\uffff\1\u0082\5\uffff\1\u00c3\2\62\3"+
        "\uffff\1\62\1\177\6\uffff\1\u00cc\1\u00cd\1\u00ce\1\u00cf\25\62"+
        "\2\uffff\4\62\1\u00eb\13\62\1\u00f8\5\62\1\u00fe\1\62\1\uffff\6"+
        "\62\1\u0107\1\62\3\uffff\1\62\1\u010a\1\62\1\177\1\uffff\2\177\1"+
        "\62\4\uffff\1\u010f\1\62\1\u0111\1\u0112\1\62\1\u0114\1\u0115\3"+
        "\62\1\u0119\1\u011a\1\u011b\1\u011c\1\u011d\14\62\1\uffff\1\u012a"+
        "\1\u012b\1\62\1\u012e\1\u012f\1\u0130\1\u0131\5\62\1\uffff\2\62"+
        "\1\u0139\2\62\1\uffff\1\62\1\u013d\1\62\1\u013f\1\62\1\u0141\1\u0142"+
        "\1\62\1\uffff\1\u0144\1\62\1\uffff\1\62\1\177\1\uffff\1\62\1\uffff"+
        "\1\u0148\2\uffff\1\u0149\2\uffff\3\62\5\uffff\6\62\1\u0154\5\62"+
        "\2\uffff\1\62\1\u015b\4\uffff\1\62\1\u015d\1\u0131\2\62\1\u0160"+
        "\1\62\1\uffff\1\u0162\1\u0163\1\62\1\uffff\1\62\1\uffff\1\62\2\uffff"+
        "\1\62\1\uffff\2\62\1\u016a\2\uffff\4\62\1\u016f\1\u0170\2\62\1\u0173"+
        "\1\62\1\uffff\3\62\1\u0178\1\u0179\1\62\1\uffff\1\62\1\uffff\2\62"+
        "\1\uffff\1\62\2\uffff\1\u017f\1\62\1\u0181\1\62\1\u0183\1\62\1\uffff"+
        "\1\u0185\3\62\2\uffff\1\u0189\1\u018a\1\uffff\1\62\1\u018c\2\62"+
        "\2\uffff\1\u018f\2\62\1\u0192\1\62\1\uffff\1\62\1\uffff\1\u0195"+
        "\1\uffff\1\u0196\1\uffff\1\u0197\1\62\1\u0199\2\uffff\1\62\1\uffff"+
        "\1\62\1\u019c\1\uffff\1\u019d\1\62\1\uffff\1\u019f\1\u01a0\3\uffff"+
        "\1\62\1\uffff\1\62\1\u01a3\2\uffff\1\u01a4\2\uffff\1\u01a5\1\62"+
        "\3\uffff\1\u01a7\1\uffff";
    static final String DFA28_eofS =
        "\u01a8\uffff";
    static final String DFA28_minS =
        "\1\0\1\141\1\75\1\141\3\uffff\2\141\1\145\1\146\2\uffff\1\145\1"+
        "\76\1\uffff\3\141\1\174\2\uffff\1\142\1\157\1\156\1\141\2\157\1"+
        "\52\2\uffff\1\60\2\75\1\162\1\141\1\77\1\uffff\1\157\1\173\2\0\1"+
        "\56\1\101\3\uffff\1\144\1\170\1\156\3\uffff\1\144\1\151\2\145\1"+
        "\163\1\143\3\uffff\1\155\1\154\1\164\1\145\1\141\1\164\1\147\1\156"+
        "\1\163\1\162\2\60\1\155\2\uffff\1\154\1\156\3\uffff\1\160\1\163"+
        "\1\143\1\145\1\141\1\156\1\157\1\154\1\145\1\165\1\163\1\162\3\uffff"+
        "\1\157\1\141\1\144\1\60\1\164\1\163\1\154\1\163\1\157\1\156\1\0"+
        "\5\uffff\1\56\5\uffff\1\60\1\164\1\162\3\uffff\1\157\1\0\6\uffff"+
        "\4\60\1\164\1\162\1\164\1\143\1\145\1\150\1\142\1\163\1\171\1\145"+
        "\1\154\1\150\1\156\1\153\1\143\1\156\1\163\1\160\1\151\1\165\1\145"+
        "\2\uffff\1\145\1\141\1\145\1\165\1\60\1\145\1\153\1\145\1\153\1"+
        "\156\1\160\1\145\1\143\1\141\1\163\1\143\1\60\1\163\1\151\1\145"+
        "\1\162\1\151\1\60\1\142\1\uffff\1\157\1\151\1\164\1\144\1\164\1"+
        "\160\1\60\1\145\3\uffff\1\160\1\60\1\154\4\0\1\154\4\uffff\1\60"+
        "\1\171\2\60\1\146\2\60\1\151\1\164\1\155\5\60\1\150\1\141\1\157"+
        "\1\145\1\141\1\156\1\164\1\147\1\144\1\164\1\141\1\162\1\uffff\2"+
        "\60\1\157\4\60\2\164\3\145\1\uffff\1\145\1\164\1\60\2\164\1\uffff"+
        "\1\154\1\60\1\147\1\60\1\154\2\60\1\151\1\uffff\1\60\1\165\1\uffff"+
        "\1\145\1\0\1\uffff\1\145\1\uffff\1\60\2\uffff\1\60\2\uffff\1\156"+
        "\1\141\1\157\5\uffff\1\151\1\154\1\162\1\156\1\151\1\147\1\60\1"+
        "\145\2\151\1\164\1\156\2\uffff\1\165\1\60\4\uffff\1\151\2\60\1\144"+
        "\1\156\1\60\1\151\1\uffff\2\60\1\145\1\uffff\1\156\1\uffff\1\145"+
        "\2\uffff\1\156\1\uffff\1\164\1\141\1\60\2\uffff\1\145\1\156\1\144"+
        "\1\156\2\60\1\144\1\156\1\60\1\165\1\uffff\1\162\1\141\1\157\2\60"+
        "\1\164\1\uffff\1\157\1\uffff\1\165\1\164\1\uffff\1\166\2\uffff\1"+
        "\60\1\145\1\60\1\147\1\60\1\156\1\uffff\1\60\1\164\1\165\1\147\2"+
        "\uffff\2\60\1\uffff\1\164\1\60\1\164\1\156\2\uffff\1\60\1\156\1"+
        "\162\1\60\1\145\1\uffff\1\144\1\uffff\1\60\1\uffff\1\60\1\uffff"+
        "\1\60\1\154\1\60\2\uffff\1\160\1\uffff\1\145\1\60\1\uffff\1\60\1"+
        "\145\1\uffff\2\60\3\uffff\1\145\1\uffff\1\165\1\60\2\uffff\1\60"+
        "\2\uffff\1\60\1\164\3\uffff\1\60\1\uffff";
    static final String DFA28_maxS =
        "\1\uffff\1\157\1\75\1\170\3\uffff\1\157\1\151\1\165\1\156\2\uffff"+
        "\1\165\1\76\1\uffff\1\171\2\165\1\174\2\uffff\1\167\1\157\1\160"+
        "\3\157\1\57\2\uffff\1\71\1\76\1\75\1\165\1\141\1\77\1\uffff\1\157"+
        "\1\173\2\uffff\1\146\1\172\3\uffff\1\144\1\170\1\156\3\uffff\1\144"+
        "\1\151\1\145\1\151\1\163\1\143\3\uffff\1\160\1\163\1\164\1\145\1"+
        "\141\1\164\1\147\1\156\1\163\1\162\2\172\1\155\2\uffff\1\164\1\156"+
        "\3\uffff\1\160\1\163\1\155\1\145\1\165\1\156\1\157\1\154\1\157\1"+
        "\165\1\163\1\162\3\uffff\1\157\1\141\1\144\1\172\1\164\1\163\1\156"+
        "\1\163\1\157\1\164\1\uffff\5\uffff\1\146\5\uffff\1\172\1\164\1\162"+
        "\3\uffff\1\157\1\uffff\6\uffff\4\172\1\164\1\162\1\164\1\143\1\151"+
        "\1\150\1\142\1\163\1\171\1\145\1\154\1\150\1\156\1\153\1\143\1\156"+
        "\1\163\1\164\1\151\1\165\1\145\2\uffff\1\145\1\141\1\145\1\165\1"+
        "\172\1\145\1\153\1\145\1\153\1\156\1\160\1\145\1\143\1\141\1\163"+
        "\1\143\1\172\1\163\1\151\1\145\1\162\1\151\1\172\1\142\1\uffff\1"+
        "\157\1\151\1\164\1\144\1\164\1\160\1\172\1\145\3\uffff\1\160\1\172"+
        "\1\154\4\uffff\1\154\4\uffff\1\172\1\171\2\172\1\146\2\172\1\151"+
        "\1\164\1\155\5\172\1\150\1\141\1\157\1\145\1\141\1\156\1\164\1\147"+
        "\1\144\1\164\1\141\1\162\1\uffff\2\172\1\163\4\172\2\164\3\145\1"+
        "\uffff\1\145\1\164\1\172\2\164\1\uffff\1\154\1\172\1\147\1\172\1"+
        "\154\2\172\1\151\1\uffff\1\172\1\165\1\uffff\1\145\1\uffff\1\uffff"+
        "\1\145\1\uffff\1\172\2\uffff\1\172\2\uffff\1\156\1\141\1\157\5\uffff"+
        "\1\151\1\154\1\162\1\156\1\151\1\147\1\172\1\145\2\151\1\164\1\156"+
        "\2\uffff\1\165\1\172\4\uffff\1\151\2\172\1\144\1\156\1\172\1\151"+
        "\1\uffff\2\172\1\145\1\uffff\1\156\1\uffff\1\145\2\uffff\1\156\1"+
        "\uffff\1\164\1\141\1\172\2\uffff\1\145\1\156\1\144\1\156\2\172\1"+
        "\144\1\156\1\172\1\165\1\uffff\1\162\1\141\1\157\2\172\1\164\1\uffff"+
        "\1\157\1\uffff\1\165\1\164\1\uffff\1\166\2\uffff\1\172\1\145\1\172"+
        "\1\147\1\172\1\156\1\uffff\1\172\1\164\1\165\1\147\2\uffff\2\172"+
        "\1\uffff\1\164\1\172\1\164\1\156\2\uffff\1\172\1\156\1\162\1\172"+
        "\1\145\1\uffff\1\144\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1"+
        "\154\1\172\2\uffff\1\160\1\uffff\1\145\1\172\1\uffff\1\172\1\145"+
        "\1\uffff\2\172\3\uffff\1\145\1\uffff\1\165\1\172\2\uffff\1\172\2"+
        "\uffff\1\172\1\164\3\uffff\1\172\1\uffff";
    static final String DFA28_acceptS =
        "\4\uffff\1\4\1\5\1\6\4\uffff\1\14\1\16\2\uffff\1\21\4\uffff\1\31"+
        "\1\32\7\uffff\1\71\1\72\6\uffff\1\121\6\uffff\1\150\1\152\1\153"+
        "\3\uffff\1\150\1\7\1\2\6\uffff\1\4\1\5\1\6\15\uffff\1\14\1\16\2"+
        "\uffff\1\20\1\24\1\21\14\uffff\1\30\1\31\1\32\13\uffff\1\151\1\67"+
        "\1\71\1\72\1\73\1\uffff\1\75\1\100\1\77\1\101\1\76\3\uffff\1\112"+
        "\1\123\1\121\2\uffff\1\137\1\141\1\142\1\145\1\146\1\152\31\uffff"+
        "\1\13\1\51\30\uffff\1\35\10\uffff\1\143\1\144\1\104\10\uffff\1\74"+
        "\1\135\1\136\1\3\33\uffff\1\65\14\uffff\1\122\5\uffff\1\103\10\uffff"+
        "\1\102\2\uffff\1\111\2\uffff\1\140\1\uffff\1\45\1\uffff\1\47\1\114"+
        "\1\uffff\1\54\1\56\3\uffff\1\36\1\41\1\11\1\34\1\37\14\uffff\1\22"+
        "\1\27\2\uffff\1\70\1\53\1\107\1\147\7\uffff\1\124\3\uffff\1\42\1"+
        "\uffff\1\50\1\uffff\1\133\1\55\1\uffff\1\134\3\uffff\1\46\1\52\12"+
        "\uffff\1\116\6\uffff\1\64\1\uffff\1\130\2\uffff\1\60\1\uffff\1\33"+
        "\1\40\6\uffff\1\1\4\uffff\1\12\1\15\2\uffff\1\132\4\uffff\1\63\1"+
        "\115\5\uffff\1\131\1\uffff\1\110\1\uffff\1\117\1\uffff\1\10\3\uffff"+
        "\1\105\1\106\1\uffff\1\127\2\uffff\1\44\2\uffff\1\61\2\uffff\1\57"+
        "\1\125\1\23\1\uffff\1\43\2\uffff\1\17\1\25\1\uffff\1\62\1\126\2"+
        "\uffff\1\113\1\26\1\66\1\uffff\1\120";
    static final String DFA28_specialS =
        "\1\7\47\uffff\1\0\1\6\101\uffff\1\11\22\uffff\1\3\110\uffff\1\5"+
        "\1\1\1\2\1\4\101\uffff\1\10\u009b\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\56\1\50\1\17\1\56\1\47\1"+
            "\56\1\51\1\5\1\6\1\35\1\36\1\13\1\37\1\4\1\34\12\52\1\2\1\14"+
            "\1\40\1\16\1\41\1\44\1\45\32\54\1\24\1\56\1\25\1\53\1\54\1\56"+
            "\1\26\1\46\1\7\1\27\1\3\1\21\1\54\1\31\1\12\2\54\1\32\1\1\1"+
            "\33\1\42\1\22\1\54\1\15\1\11\1\20\1\30\1\43\1\10\3\54\1\56\1"+
            "\23\uff83\56",
            "\1\60\7\uffff\1\61\5\uffff\1\57",
            "\1\63",
            "\1\72\12\uffff\1\71\1\66\1\65\7\uffff\1\67\1\uffff\1\70",
            "",
            "",
            "",
            "\1\77\15\uffff\1\76",
            "\1\103\3\uffff\1\102\2\uffff\1\101\1\100",
            "\1\105\3\uffff\1\104\12\uffff\1\107\1\106",
            "\1\111\6\uffff\1\112\1\110",
            "",
            "",
            "\1\115\17\uffff\1\116",
            "\1\117",
            "",
            "\1\123\6\uffff\1\125\1\124\10\uffff\1\126\6\uffff\1\122",
            "\1\131\12\uffff\1\130\10\uffff\1\127",
            "\1\133\15\uffff\1\134\2\uffff\1\132\2\uffff\1\135",
            "\1\136",
            "",
            "",
            "\1\141\13\uffff\1\143\10\uffff\1\142",
            "\1\144",
            "\1\146\1\uffff\1\145",
            "\1\147\15\uffff\1\150",
            "\1\151",
            "\1\152",
            "\1\153\4\uffff\1\154",
            "",
            "",
            "\12\161",
            "\1\163\1\162",
            "\1\165",
            "\1\167\2\uffff\1\170",
            "\1\171",
            "\1\172",
            "",
            "\1\175",
            "\1\176",
            "\0\u0080",
            "\0\u0081",
            "\1\u0083\1\uffff\12\161\54\uffff\1\u0083",
            "\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008c\3\uffff\1\u008b",
            "\1\u008d",
            "\1\u008e",
            "",
            "",
            "",
            "\1\u008f\1\u0090\1\uffff\1\u0091",
            "\1\u0093\6\uffff\1\u0092",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u009c\3"+
            "\62\1\u009d\6\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00a0",
            "",
            "",
            "\1\u00a1\3\uffff\1\u00a2\3\uffff\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a8\11\uffff\1\u00a7",
            "\1\u00a9",
            "\1\u00aa\23\uffff\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00b0\11\uffff\1\u00af",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00b7\5"+
            "\62",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb\1\uffff\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00c0\5\uffff\1\u00bf",
            "\52\u00c2\1\u00c1\uffd5\u00c2",
            "",
            "",
            "",
            "",
            "",
            "\1\u0083\1\uffff\12\161\54\uffff\1\u0083",
            "",
            "",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "",
            "",
            "\1\u00c6",
            "\12\u00ca\1\u00c9\2\u00ca\1\u00c8\157\u00ca\1\u00c7\uff82"+
            "\u00ca",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00cb\5"+
            "\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d5\3\uffff\1\u00d4",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2\3\uffff\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00f7\7"+
            "\62",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u0106\22"+
            "\62",
            "\1\u0108",
            "",
            "",
            "",
            "\1\u0109",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u010b",
            "\12\u00ca\1\u00c9\2\u00ca\1\u00c8\27\u00ca\1\u010c\127\u00ca"+
            "\1\u00c7\uff82\u00ca",
            "\12\u010d\1\u00c9\ufff5\u010d",
            "\0\u010d",
            "\12\u00ca\1\u00c9\2\u00ca\1\u00c8\157\u00ca\1\u00c7\uff82"+
            "\u00ca",
            "\1\u010e",
            "",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0110",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0113",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u012c\3\uffff\1\u012d",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "",
            "\1\u0137",
            "\1\u0138",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u013a",
            "\1\u013b",
            "",
            "\1\u013c",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u013e",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0140",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0143",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0145",
            "",
            "\1\u0146",
            "\12\u00ca\1\u00c9\2\u00ca\1\u00c8\157\u00ca\1\u00c7\uff82"+
            "\u00ca",
            "",
            "\1\u0147",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "",
            "",
            "",
            "",
            "",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0153\13"+
            "\62",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "",
            "",
            "\1\u015a",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "\1\u015c",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u015e",
            "\1\u015f",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0161",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0164",
            "",
            "\1\u0165",
            "",
            "\1\u0166",
            "",
            "",
            "\1\u0167",
            "",
            "\1\u0168",
            "\1\u0169",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0171",
            "\1\u0172",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u017a",
            "",
            "\1\u017b",
            "",
            "\1\u017c",
            "\1\u017d",
            "",
            "\1\u017e",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0180",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0182",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0184",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u018b",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u018d",
            "\1\u018e",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0190",
            "\1\u0191",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0193",
            "",
            "\1\u0194",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0198",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\u019a",
            "",
            "\1\u019b",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u019e",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\1\u01a1",
            "",
            "\1\u01a2",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01a6",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | RULE_ESTEREL_SL_COMMENT | RULE_ESTEREL_ML_COMMENT | RULE_STRING | RULE_HOSTCODE | RULE_COMMENT_ANNOTATION | RULE_ML_COMMENT | RULE_INT | RULE_FLOAT | RULE_BOOLEAN | RULE_ID | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_40 = input.LA(1);

                        s = -1;
                        if ( ((LA28_40>='\u0000' && LA28_40<='\uFFFF')) ) {s = 128;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_200 = input.LA(1);

                        s = -1;
                        if ( (LA28_200=='\n') ) {s = 201;}

                        else if ( ((LA28_200>='\u0000' && LA28_200<='\t')||(LA28_200>='\u000B' && LA28_200<='\uFFFF')) ) {s = 269;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_201 = input.LA(1);

                        s = -1;
                        if ( ((LA28_201>='\u0000' && LA28_201<='\uFFFF')) ) {s = 269;}

                        else s = 127;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_126 = input.LA(1);

                        s = -1;
                        if ( (LA28_126=='}') ) {s = 199;}

                        else if ( (LA28_126=='\r') ) {s = 200;}

                        else if ( (LA28_126=='\n') ) {s = 201;}

                        else if ( ((LA28_126>='\u0000' && LA28_126<='\t')||(LA28_126>='\u000B' && LA28_126<='\f')||(LA28_126>='\u000E' && LA28_126<='|')||(LA28_126>='~' && LA28_126<='\uFFFF')) ) {s = 202;}

                        else s = 127;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_202 = input.LA(1);

                        s = -1;
                        if ( (LA28_202=='}') ) {s = 199;}

                        else if ( (LA28_202=='\r') ) {s = 200;}

                        else if ( (LA28_202=='\n') ) {s = 201;}

                        else if ( ((LA28_202>='\u0000' && LA28_202<='\t')||(LA28_202>='\u000B' && LA28_202<='\f')||(LA28_202>='\u000E' && LA28_202<='|')||(LA28_202>='~' && LA28_202<='\uFFFF')) ) {s = 202;}

                        else s = 127;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_199 = input.LA(1);

                        s = -1;
                        if ( (LA28_199=='%') ) {s = 268;}

                        else if ( (LA28_199=='}') ) {s = 199;}

                        else if ( (LA28_199=='\r') ) {s = 200;}

                        else if ( (LA28_199=='\n') ) {s = 201;}

                        else if ( ((LA28_199>='\u0000' && LA28_199<='\t')||(LA28_199>='\u000B' && LA28_199<='\f')||(LA28_199>='\u000E' && LA28_199<='$')||(LA28_199>='&' && LA28_199<='|')||(LA28_199>='~' && LA28_199<='\uFFFF')) ) {s = 202;}

                        else s = 127;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_41 = input.LA(1);

                        s = -1;
                        if ( ((LA28_41>='\u0000' && LA28_41<='\uFFFF')) ) {s = 129;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_0 = input.LA(1);

                        s = -1;
                        if ( (LA28_0=='m') ) {s = 1;}

                        else if ( (LA28_0==':') ) {s = 2;}

                        else if ( (LA28_0=='e') ) {s = 3;}

                        else if ( (LA28_0=='.') ) {s = 4;}

                        else if ( (LA28_0=='(') ) {s = 5;}

                        else if ( (LA28_0==')') ) {s = 6;}

                        else if ( (LA28_0=='c') ) {s = 7;}

                        else if ( (LA28_0=='w') ) {s = 8;}

                        else if ( (LA28_0=='s') ) {s = 9;}

                        else if ( (LA28_0=='i') ) {s = 10;}

                        else if ( (LA28_0==',') ) {s = 11;}

                        else if ( (LA28_0==';') ) {s = 12;}

                        else if ( (LA28_0=='r') ) {s = 13;}

                        else if ( (LA28_0=='=') ) {s = 14;}

                        else if ( (LA28_0=='#') ) {s = 15;}

                        else if ( (LA28_0=='t') ) {s = 16;}

                        else if ( (LA28_0=='f') ) {s = 17;}

                        else if ( (LA28_0=='p') ) {s = 18;}

                        else if ( (LA28_0=='|') ) {s = 19;}

                        else if ( (LA28_0=='[') ) {s = 20;}

                        else if ( (LA28_0==']') ) {s = 21;}

                        else if ( (LA28_0=='a') ) {s = 22;}

                        else if ( (LA28_0=='d') ) {s = 23;}

                        else if ( (LA28_0=='u') ) {s = 24;}

                        else if ( (LA28_0=='h') ) {s = 25;}

                        else if ( (LA28_0=='l') ) {s = 26;}

                        else if ( (LA28_0=='n') ) {s = 27;}

                        else if ( (LA28_0=='/') ) {s = 28;}

                        else if ( (LA28_0=='*') ) {s = 29;}

                        else if ( (LA28_0=='+') ) {s = 30;}

                        else if ( (LA28_0=='-') ) {s = 31;}

                        else if ( (LA28_0=='<') ) {s = 32;}

                        else if ( (LA28_0=='>') ) {s = 33;}

                        else if ( (LA28_0=='o') ) {s = 34;}

                        else if ( (LA28_0=='v') ) {s = 35;}

                        else if ( (LA28_0=='?') ) {s = 36;}

                        else if ( (LA28_0=='@') ) {s = 37;}

                        else if ( (LA28_0=='b') ) {s = 38;}

                        else if ( (LA28_0=='%') ) {s = 39;}

                        else if ( (LA28_0=='\"') ) {s = 40;}

                        else if ( (LA28_0=='\'') ) {s = 41;}

                        else if ( ((LA28_0>='0' && LA28_0<='9')) ) {s = 42;}

                        else if ( (LA28_0=='^') ) {s = 43;}

                        else if ( ((LA28_0>='A' && LA28_0<='Z')||LA28_0=='_'||LA28_0=='g'||(LA28_0>='j' && LA28_0<='k')||LA28_0=='q'||(LA28_0>='x' && LA28_0<='z')) ) {s = 44;}

                        else if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {s = 45;}

                        else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\u001F')||LA28_0=='!'||LA28_0=='$'||LA28_0=='&'||LA28_0=='\\'||LA28_0=='`'||LA28_0=='{'||(LA28_0>='}' && LA28_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA28_268 = input.LA(1);

                        s = -1;
                        if ( (LA28_268=='}') ) {s = 199;}

                        else if ( (LA28_268=='\r') ) {s = 200;}

                        else if ( (LA28_268=='\n') ) {s = 201;}

                        else if ( ((LA28_268>='\u0000' && LA28_268<='\t')||(LA28_268>='\u000B' && LA28_268<='\f')||(LA28_268>='\u000E' && LA28_268<='|')||(LA28_268>='~' && LA28_268<='\uFFFF')) ) {s = 202;}

                        else s = 127;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA28_107 = input.LA(1);

                        s = -1;
                        if ( (LA28_107=='*') ) {s = 193;}

                        else if ( ((LA28_107>='\u0000' && LA28_107<=')')||(LA28_107>='+' && LA28_107<='\uFFFF')) ) {s = 194;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}