package de.cau.cs.kieler.yakindu.sccharts.model.stext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSynctextLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_HEX=8;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__99=99;
    public static final int T__98=98;
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
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_STRING=9;
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
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_BOOL=6;
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
    public static final int T__59=59;
    public static final int RULE_INT=5;
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
    public static final int T__100=100;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=11;
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
    public static final int RULE_WS=12;

    // delegates
    // delegators

    public InternalSynctextLexer() {;} 
    public InternalSynctextLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSynctextLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:11:7: ( 'input' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:11:9: 'input'
            {
            match("input"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:12:7: ( 'output' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:12:9: 'output'
            {
            match("output"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:13:7: ( 'signal' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:13:9: 'signal'
            {
            match("signal"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:14:7: ( ':' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:14:9: ':'
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:15:7: ( '=' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:15:9: '='
            {
            match('='); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:16:7: ( 'with' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:16:9: 'with'
            {
            match("with"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:17:7: ( ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:17:9: ';'
            {
            match(';'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:18:7: ( 'static' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:18:9: 'static'
            {
            match("static"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:19:7: ( 'extern' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:19:9: 'extern'
            {
            match("extern"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:20:7: ( '(' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:20:9: '('
            {
            match('('); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:21:7: ( ')' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:21:9: ')'
            {
            match(')'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:22:7: ( 'entry' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:22:9: 'entry'
            {
            match("entry"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:23:7: ( '/' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:23:9: '/'
            {
            match('/'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:24:7: ( 'immediate' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:24:9: 'immediate'
            {
            match("immediate"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:25:7: ( 'during' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:25:9: 'during'
            {
            match("during"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:26:7: ( 'exit' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:26:9: 'exit'
            {
            match("exit"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:27:7: ( 'suspend' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:27:9: 'suspend'
            {
            match("suspend"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:28:7: ( 'val' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:28:9: 'val'
            {
            match("val"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:29:7: ( 'pre' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:29:9: 'pre'
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:30:7: ( '@@statechart@@' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:30:9: '@@statechart@@'
            {
            match("@@statechart@@"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:31:7: ( '@@state@@' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:31:9: '@@state@@'
            {
            match("@@state@@"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:32:7: ( '@@transition@@' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:32:9: '@@transition@@'
            {
            match("@@transition@@"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:33:7: ( 'namespace' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:33:9: 'namespace'
            {
            match("namespace"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:34:7: ( 'interface' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:34:9: 'interface'
            {
            match("interface"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:35:7: ( 'internal' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:35:9: 'internal'
            {
            match("internal"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:36:7: ( 'event' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:36:9: 'event'
            {
            match("event"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:37:7: ( 'local' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:37:9: 'local'
            {
            match("local"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:38:7: ( 'in' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:38:9: 'in'
            {
            match("in"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:39:7: ( 'out' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:39:9: 'out'
            {
            match("out"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:40:7: ( 'var' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:40:9: 'var'
            {
            match("var"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:41:7: ( 'readonly' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:41:9: 'readonly'
            {
            match("readonly"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:42:7: ( 'external' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:42:9: 'external'
            {
            match("external"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:43:7: ( 'operation' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:43:9: 'operation'
            {
            match("operation"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:44:7: ( 'default' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:44:9: 'default'
            {
            match("default"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:45:7: ( 'else' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:45:9: 'else'
            {
            match("else"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:46:7: ( 'always' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:46:9: 'always'
            {
            match("always"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:47:7: ( 'oncycle' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:47:9: 'oncycle'
            {
            match("oncycle"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:48:7: ( 'raise' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:48:9: 'raise'
            {
            match("raise"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:49:7: ( 'valueof' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:49:9: 'valueof'
            {
            match("valueof"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:50:7: ( 'active' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:50:9: 'active'
            {
            match("active"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:51:7: ( '.' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:51:9: '.'
            {
            match('.'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:52:7: ( '#' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:52:9: '#'
            {
            match('#'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:53:7: ( '>' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:53:9: '>'
            {
            match('>'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:54:7: ( '?' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:54:9: '?'
            {
            match('?'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:55:7: ( '||' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:55:9: '||'
            {
            match("||"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:56:7: ( '&&' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:56:9: '&&'
            {
            match("&&"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:57:7: ( '!' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:57:9: '!'
            {
            match('!'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:58:7: ( '^' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:58:9: '^'
            {
            match('^'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:59:7: ( '|' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:59:9: '|'
            {
            match('|'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:60:7: ( '&' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:60:9: '&'
            {
            match('&'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:61:7: ( ',' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:61:9: ','
            {
            match(','); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:62:7: ( '*' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:62:9: '*'
            {
            match('*'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:63:7: ( '%' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:63:9: '%'
            {
            match('%'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:64:7: ( '\\'none\\'' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:64:9: '\\'none\\''
            {
            match("'none'"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:65:7: ( '\\'+\\'' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:65:9: '\\'+\\''
            {
            match("'+'"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:66:7: ( '\\'*\\'' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:66:9: '\\'*\\''
            {
            match("'*'"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:67:7: ( '\\'max\\'' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:67:9: '\\'max\\''
            {
            match("'max'"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:68:7: ( '\\'min\\'' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:68:9: '\\'min\\''
            {
            match("'min'"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:69:7: ( '\\'or\\'' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:69:9: '\\'or\\''
            {
            match("'or'"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:70:7: ( '\\'and\\'' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:70:9: '\\'and\\''
            {
            match("'and'"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:71:7: ( '\\'host\\'' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:71:9: '\\'host\\''
            {
            match("'host'"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:72:7: ( 'after' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:72:9: 'after'
            {
            match("after"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:73:7: ( 'every' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:73:9: 'every'
            {
            match("every"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:74:7: ( '*=' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:74:9: '*='
            {
            match("*="); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:75:7: ( '/=' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:75:9: '/='
            {
            match("/="); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:76:7: ( '%=' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:76:9: '%='
            {
            match("%="); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:77:7: ( '+=' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:77:9: '+='
            {
            match("+="); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:78:7: ( '-=' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:78:9: '-='
            {
            match("-="); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:79:7: ( '<<=' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:79:9: '<<='
            {
            match("<<="); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:80:7: ( '>>=' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:80:9: '>>='
            {
            match(">>="); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:81:7: ( '&=' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:81:9: '&='
            {
            match("&="); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:82:7: ( '^=' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:82:9: '^='
            {
            match("^="); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:83:7: ( '|=' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:83:9: '|='
            {
            match("|="); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:84:7: ( '<<' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:84:9: '<<'
            {
            match("<<"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:85:7: ( '>>' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:85:9: '>>'
            {
            match(">>"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:86:7: ( '+' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:86:9: '+'
            {
            match('+'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:87:7: ( '-' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:87:9: '-'
            {
            match('-'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:88:7: ( '~' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:88:9: '~'
            {
            match('~'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:89:7: ( '<' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:89:9: '<'
            {
            match('<'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:90:7: ( '<=' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:90:9: '<='
            {
            match("<="); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:91:7: ( '>=' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:91:9: '>='
            {
            match(">="); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:92:7: ( '==' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:92:9: '=='
            {
            match("=="); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:93:7: ( '!=' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:93:9: '!='
            {
            match("!="); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:94:7: ( 's' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:94:9: 's'
            {
            match('s'); 

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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:95:7: ( 'ms' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:95:9: 'ms'
            {
            match("ms"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:96:7: ( 'us' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:96:9: 'us'
            {
            match("us"); 


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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:97:8: ( 'ns' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:97:10: 'ns'
            {
            match("ns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5151:11: ( ( 'true' | 'false' | 'yes' | 'no' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5151:13: ( 'true' | 'false' | 'yes' | 'no' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5151:13: ( 'true' | 'false' | 'yes' | 'no' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt1=1;
                }
                break;
            case 'f':
                {
                alt1=2;
                }
                break;
            case 'y':
                {
                alt1=3;
                }
                break;
            case 'n':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5151:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5151:21: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5151:29: 'yes'
                    {
                    match("yes"); 


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5151:35: 'no'
                    {
                    match("no"); 


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

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5153:10: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5153:12: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5153:26: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5155:12: ( RULE_INT '.' RULE_INT ( 'e' ( '-' | '+' ) RULE_INT )? ( 'f' | 'F' | 'd' | 'D' )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5155:14: RULE_INT '.' RULE_INT ( 'e' ( '-' | '+' ) RULE_INT )? ( 'f' | 'F' | 'd' | 'D' )?
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5155:36: ( 'e' ( '-' | '+' ) RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='e') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5155:37: 'e' ( '-' | '+' ) RULE_INT
                    {
                    match('e'); 
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5155:62: ( 'f' | 'F' | 'd' | 'D' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='D'||LA4_0=='F'||LA4_0=='d'||LA4_0=='f') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5157:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5157:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5157:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5157:11: '^'
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5157:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:
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
            	    break loop6;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5159:10: ( ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5159:12: ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5159:12: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5159:13: '0' .. '9'
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5161:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5161:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5161:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5161:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5161:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5161:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5161:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5161:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5161:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5161:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5161:137: ~ ( ( '\\\\' | '\\'' ) )
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5163:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5163:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5163:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5163:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5165:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5165:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5165:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5165:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5165:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5165:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5165:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5165:41: '\\r'
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5167:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5167:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5167:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5169:16: ( . )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5169:18: .
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
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | RULE_BOOL | RULE_HEX | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=97;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:508: T__97
                {
                mT__97(); 

                }
                break;
            case 85 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:514: T__98
                {
                mT__98(); 

                }
                break;
            case 86 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:520: T__99
                {
                mT__99(); 

                }
                break;
            case 87 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:526: T__100
                {
                mT__100(); 

                }
                break;
            case 88 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:533: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 89 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:543: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 90 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:552: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 91 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:563: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 92 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:571: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 93 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:580: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 94 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:592: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 95 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:608: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 96 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:624: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 97 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1:632: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\2\61\1\70\1\uffff\1\73\1\61\1\uffff\1\61\2\uffff\1\107"+
        "\3\61\1\56\4\61\2\uffff\1\132\1\uffff\1\136\1\141\1\143\1\145\1"+
        "\uffff\1\150\1\152\1\56\1\164\1\166\1\171\1\uffff\5\61\2\u0081\1"+
        "\uffff\1\56\2\uffff\1\u0087\1\61\1\uffff\6\61\4\uffff\1\61\1\uffff"+
        "\4\61\6\uffff\4\61\1\uffff\1\61\1\u009d\1\u009e\6\61\2\uffff\1\u00a6"+
        "\36\uffff\1\u00b0\3\uffff\1\u00b1\1\u00b2\3\61\3\uffff\1\u0081\1"+
        "\uffff\2\61\1\uffff\1\61\1\u00ba\15\61\1\u00ca\1\u00cb\1\u00cc\2"+
        "\uffff\1\61\2\uffff\6\61\16\uffff\2\61\1\u009e\4\61\1\uffff\5\61"+
        "\1\u00e8\1\61\1\u00ea\3\61\1\u00ee\3\61\4\uffff\7\61\10\uffff\1"+
        "\u009e\1\61\1\u0101\10\61\1\uffff\1\61\1\uffff\1\u010c\1\u010d\1"+
        "\u010e\1\uffff\3\61\1\uffff\1\61\1\u0114\1\61\1\u0116\2\61\1\u0119"+
        "\6\uffff\1\u009e\1\uffff\3\61\1\u0122\2\61\1\u0125\1\u0126\1\61"+
        "\1\u0129\3\uffff\1\u012a\2\61\1\uffff\1\61\1\uffff\1\61\1\uffff"+
        "\1\u0130\1\u0131\6\uffff\3\61\1\uffff\1\61\1\u0138\2\uffff\1\u0139"+
        "\1\61\2\uffff\1\u013b\1\u013c\1\uffff\2\61\4\uffff\1\61\1\u0142"+
        "\2\61\2\uffff\1\u0145\4\uffff\1\61\1\u0147\1\u0148\1\uffff\1\u0149"+
        "\1\u014a\1\uffff\1\u014b\5\uffff";
    static final String DFA16_eofS =
        "\u014c\uffff";
    static final String DFA16_minS =
        "\1\0\1\155\1\156\1\60\1\uffff\1\75\1\151\1\uffff\1\154\2\uffff"+
        "\1\52\1\145\1\141\1\162\1\100\1\141\1\157\1\141\1\143\2\uffff\1"+
        "\75\1\uffff\1\75\1\46\2\75\1\uffff\2\75\1\0\2\75\1\74\1\uffff\2"+
        "\163\1\162\1\141\1\145\2\56\1\uffff\1\0\2\uffff\1\60\1\155\1\uffff"+
        "\1\164\1\145\1\143\1\147\1\141\1\163\4\uffff\1\164\1\uffff\1\151"+
        "\1\164\1\145\1\163\6\uffff\1\162\1\146\1\154\1\145\1\163\1\155\2"+
        "\60\1\143\1\141\1\151\1\167\2\164\2\uffff\1\75\22\uffff\7\0\5\uffff"+
        "\1\75\3\uffff\2\60\1\165\1\154\1\163\3\uffff\1\56\1\uffff\1\165"+
        "\1\145\1\uffff\1\145\1\60\1\162\1\171\1\156\1\164\1\160\1\150\1"+
        "\145\1\164\1\162\1\156\1\145\1\151\1\141\3\60\1\164\1\uffff\1\145"+
        "\2\uffff\1\141\1\144\1\163\1\141\1\151\1\145\2\uffff\1\0\2\uffff"+
        "\5\0\4\uffff\1\145\1\163\1\60\1\164\1\162\1\144\1\165\1\uffff\1"+
        "\141\1\143\1\141\1\151\1\145\1\60\1\162\1\60\1\171\1\164\1\171\1"+
        "\60\1\156\1\165\1\145\3\uffff\1\141\1\163\1\154\1\157\1\145\1\171"+
        "\1\166\1\162\1\0\2\uffff\2\0\1\uffff\2\0\1\60\1\145\1\60\1\146\1"+
        "\151\2\164\2\154\1\143\1\156\1\uffff\1\156\1\uffff\3\60\1\uffff"+
        "\1\147\1\154\1\157\1\164\1\160\1\60\1\156\1\60\1\163\1\145\1\60"+
        "\1\0\4\uffff\1\0\1\60\1\uffff\3\141\1\60\1\151\1\145\2\60\1\144"+
        "\1\60\3\uffff\1\60\1\164\1\146\1\145\1\141\1\uffff\1\154\1\uffff"+
        "\2\60\6\uffff\1\143\1\154\1\164\1\uffff\1\157\1\60\2\uffff\1\60"+
        "\1\154\2\uffff\2\60\1\100\1\143\1\171\4\uffff\1\145\1\60\1\145\1"+
        "\156\2\uffff\1\60\4\uffff\1\145\2\60\1\uffff\2\60\1\uffff\1\60\5"+
        "\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\156\1\165\1\172\1\uffff\1\75\1\151\1\uffff\1\170\2\uffff"+
        "\1\75\1\165\1\141\1\162\1\100\1\163\1\157\1\145\1\154\2\uffff\1"+
        "\76\1\uffff\1\174\2\75\1\172\1\uffff\2\75\1\uffff\3\75\1\uffff\2"+
        "\163\1\162\1\141\1\145\1\170\1\71\1\uffff\1\uffff\2\uffff\1\172"+
        "\1\155\1\uffff\1\164\1\145\1\143\1\147\1\141\1\163\4\uffff\1\164"+
        "\1\uffff\2\164\1\145\1\163\6\uffff\1\162\1\146\1\162\1\145\1\164"+
        "\1\155\2\172\1\143\1\141\1\151\1\167\2\164\2\uffff\1\75\22\uffff"+
        "\7\uffff\5\uffff\1\75\3\uffff\2\172\1\165\1\154\1\163\3\uffff\1"+
        "\71\1\uffff\1\165\1\145\1\uffff\1\145\1\172\1\162\1\171\1\156\1"+
        "\164\1\160\1\150\1\145\1\164\2\162\1\145\1\151\1\141\3\172\1\164"+
        "\1\uffff\1\145\2\uffff\1\141\1\144\1\163\1\141\1\151\1\145\2\uffff"+
        "\1\uffff\2\uffff\5\uffff\4\uffff\1\145\1\163\1\172\1\164\1\162\1"+
        "\144\1\165\1\uffff\1\141\1\143\1\141\1\151\1\145\1\172\1\162\1\172"+
        "\1\171\1\164\1\171\1\172\1\156\1\165\1\145\3\uffff\1\141\1\163\1"+
        "\154\1\157\1\145\1\171\1\166\1\162\1\uffff\2\uffff\2\uffff\1\uffff"+
        "\2\uffff\1\172\1\145\1\172\1\156\1\151\2\164\2\154\1\143\1\156\1"+
        "\uffff\1\156\1\uffff\3\172\1\uffff\1\147\1\154\1\157\1\164\1\160"+
        "\1\172\1\156\1\172\1\163\1\145\1\172\1\uffff\4\uffff\1\uffff\1\172"+
        "\1\uffff\3\141\1\172\1\151\1\145\2\172\1\144\1\172\3\uffff\1\172"+
        "\1\164\1\146\1\145\1\141\1\uffff\1\154\1\uffff\2\172\6\uffff\1\143"+
        "\1\154\1\164\1\uffff\1\157\1\172\2\uffff\1\172\1\154\2\uffff\2\172"+
        "\2\143\1\171\4\uffff\1\145\1\172\1\145\1\156\2\uffff\1\172\4\uffff"+
        "\1\145\2\172\1\uffff\2\172\1\uffff\1\172\5\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\4\2\uffff\1\7\1\uffff\1\12\1\13\11\uffff\1\51\1\52\1"+
        "\uffff\1\54\4\uffff\1\63\6\uffff\1\116\7\uffff\1\133\1\uffff\1\140"+
        "\1\141\2\uffff\1\133\6\uffff\1\124\1\4\1\122\1\5\1\uffff\1\7\4\uffff"+
        "\1\12\1\13\1\101\1\136\1\137\1\15\16\uffff\1\51\1\52\1\uffff\1\121"+
        "\1\53\1\54\1\55\1\111\1\61\1\56\1\107\1\62\1\123\1\57\1\110\1\60"+
        "\1\63\1\100\1\64\1\102\1\65\7\uffff\1\135\1\103\1\114\1\104\1\115"+
        "\1\uffff\1\120\1\117\1\116\5\uffff\1\131\1\134\1\132\1\uffff\1\140"+
        "\2\uffff\1\34\23\uffff\1\26\1\uffff\1\127\1\130\6\uffff\1\106\1"+
        "\113\1\uffff\1\67\1\70\5\uffff\1\105\1\112\1\125\1\126\7\uffff\1"+
        "\35\17\uffff\1\22\1\36\1\23\11\uffff\1\67\1\70\2\uffff\1\73\15\uffff"+
        "\1\6\1\uffff\1\20\3\uffff\1\43\14\uffff\1\71\1\72\1\73\1\74\2\uffff"+
        "\1\1\12\uffff\1\14\1\32\1\77\5\uffff\1\33\1\uffff\1\46\2\uffff\1"+
        "\76\1\66\1\71\1\72\1\74\1\75\3\uffff\1\2\2\uffff\1\3\1\10\2\uffff"+
        "\1\11\1\17\5\uffff\1\44\1\50\1\66\1\75\4\uffff\1\45\1\21\1\uffff"+
        "\1\42\1\47\1\24\1\25\3\uffff\1\31\2\uffff\1\40\1\uffff\1\37\1\30"+
        "\1\16\1\41\1\27";
    static final String DFA16_specialS =
        "\1\20\36\uffff\1\21\14\uffff\1\0\76\uffff\1\23\1\22\1\1\1\5\1\10"+
        "\1\7\1\12\65\uffff\1\26\2\uffff\1\3\1\6\1\11\1\14\1\16\46\uffff"+
        "\1\25\2\uffff\1\2\1\4\1\uffff\1\13\1\15\35\uffff\1\24\4\uffff\1"+
        "\17\114\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\32\1\54\1\25\1\56\1\36\1"+
            "\31\1\37\1\11\1\12\1\35\1\40\1\34\1\41\1\24\1\13\1\51\11\52"+
            "\1\4\1\7\1\42\1\5\1\26\1\27\1\17\32\53\3\56\1\33\1\53\1\56\1"+
            "\23\2\53\1\14\1\10\1\47\2\53\1\1\2\53\1\21\1\44\1\20\1\2\1\16"+
            "\1\53\1\22\1\3\1\46\1\45\1\15\1\6\1\53\1\50\1\53\1\56\1\30\1"+
            "\56\1\43\uff81\56",
            "\1\60\1\57",
            "\1\64\1\uffff\1\63\4\uffff\1\62",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\65\12\61"+
            "\1\66\1\67\5\61",
            "",
            "\1\72",
            "\1\74",
            "",
            "\1\101\1\uffff\1\77\7\uffff\1\100\1\uffff\1\76",
            "",
            "",
            "\1\105\4\uffff\1\106\15\uffff\1\104",
            "\1\111\17\uffff\1\110",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115\15\uffff\1\117\3\uffff\1\116",
            "\1\120",
            "\1\122\3\uffff\1\121",
            "\1\124\2\uffff\1\125\5\uffff\1\123",
            "",
            "",
            "\1\131\1\130",
            "",
            "\1\135\76\uffff\1\134",
            "\1\137\26\uffff\1\140",
            "\1\142",
            "\1\144\3\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\147",
            "\1\151",
            "\52\162\1\155\1\154\65\162\1\160\6\162\1\161\4\162\1\156\1"+
            "\153\1\157\uff90\162",
            "\1\163",
            "\1\165",
            "\1\167\1\170",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0082\1\uffff\12\u0083\36\uffff\1\u0080\37\uffff\1\u0080",
            "\1\u0082\1\uffff\12\u0083",
            "",
            "\0\162",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\17\61\1\u0085\3"+
            "\61\1\u0086\6\61",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "",
            "",
            "",
            "\1\u008f",
            "",
            "\1\u0091\12\uffff\1\u0090",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097\5\uffff\1\u0098",
            "\1\u0099",
            "\1\u009a\1\u009b",
            "\1\u009c",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "\1\u00a5",
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
            "\157\162\1\u00a7\uff90\162",
            "\47\162\1\u00a8\uffd8\162",
            "\47\162\1\u00a9\uffd8\162",
            "\141\162\1\u00aa\7\162\1\u00ab\uff96\162",
            "\162\162\1\u00ac\uff8d\162",
            "\156\162\1\u00ad\uff91\162",
            "\157\162\1\u00ae\uff90\162",
            "",
            "",
            "",
            "",
            "",
            "\1\u00af",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "",
            "",
            "\1\u0082\1\uffff\12\u0083",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\17\61\1\u00b9\12"+
            "\61",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4\3\uffff\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u00c9\5"+
            "\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "",
            "\156\162\1\u00d5\uff91\162",
            "",
            "",
            "\170\162\1\u00d8\uff87\162",
            "\156\162\1\u00d9\uff91\162",
            "\47\162\1\u00da\uffd8\162",
            "\144\162\1\u00db\uff9b\162",
            "\163\162\1\u00dc\uff8c\162",
            "",
            "",
            "",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00e9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\145\162\1\u00fa\uff9a\162",
            "",
            "",
            "\47\162\1\u00fb\uffd8\162",
            "\47\162\1\u00fc\uffd8\162",
            "",
            "\47\162\1\u00fe\uffd8\162",
            "\164\162\1\u00ff\uff8b\162",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0100",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0102\7\uffff\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\1\u010b",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0115",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0117",
            "\1\u0118",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\47\162\1\u011a\uffd8\162",
            "",
            "",
            "",
            "",
            "\47\162\1\u011e\uffd8\162",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0123",
            "\1\u0124",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0127",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0128\31\61",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "",
            "\1\u012f",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "",
            "\1\u0137",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u013a",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u013e\42\uffff\1\u013d",
            "\1\u013f",
            "\1\u0140",
            "",
            "",
            "",
            "",
            "\1\u0141",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0143",
            "\1\u0144",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "\1\u0146",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | RULE_BOOL | RULE_HEX | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_44 = input.LA(1);

                        s = -1;
                        if ( ((LA16_44>='\u0000' && LA16_44<='\uFFFF')) ) {s = 114;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_109 = input.LA(1);

                        s = -1;
                        if ( (LA16_109=='\'') ) {s = 169;}

                        else if ( ((LA16_109>='\u0000' && LA16_109<='&')||(LA16_109>='(' && LA16_109<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_216 = input.LA(1);

                        s = -1;
                        if ( (LA16_216=='\'') ) {s = 251;}

                        else if ( ((LA16_216>='\u0000' && LA16_216<='&')||(LA16_216>='(' && LA16_216<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_170 = input.LA(1);

                        s = -1;
                        if ( (LA16_170=='x') ) {s = 216;}

                        else if ( ((LA16_170>='\u0000' && LA16_170<='w')||(LA16_170>='y' && LA16_170<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_217 = input.LA(1);

                        s = -1;
                        if ( (LA16_217=='\'') ) {s = 252;}

                        else if ( ((LA16_217>='\u0000' && LA16_217<='&')||(LA16_217>='(' && LA16_217<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_110 = input.LA(1);

                        s = -1;
                        if ( (LA16_110=='a') ) {s = 170;}

                        else if ( (LA16_110=='i') ) {s = 171;}

                        else if ( ((LA16_110>='\u0000' && LA16_110<='`')||(LA16_110>='b' && LA16_110<='h')||(LA16_110>='j' && LA16_110<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_171 = input.LA(1);

                        s = -1;
                        if ( (LA16_171=='n') ) {s = 217;}

                        else if ( ((LA16_171>='\u0000' && LA16_171<='m')||(LA16_171>='o' && LA16_171<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_112 = input.LA(1);

                        s = -1;
                        if ( (LA16_112=='n') ) {s = 173;}

                        else if ( ((LA16_112>='\u0000' && LA16_112<='m')||(LA16_112>='o' && LA16_112<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_111 = input.LA(1);

                        s = -1;
                        if ( (LA16_111=='r') ) {s = 172;}

                        else if ( ((LA16_111>='\u0000' && LA16_111<='q')||(LA16_111>='s' && LA16_111<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_172 = input.LA(1);

                        s = -1;
                        if ( (LA16_172=='\'') ) {s = 218;}

                        else if ( ((LA16_172>='\u0000' && LA16_172<='&')||(LA16_172>='(' && LA16_172<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA16_113 = input.LA(1);

                        s = -1;
                        if ( (LA16_113=='o') ) {s = 174;}

                        else if ( ((LA16_113>='\u0000' && LA16_113<='n')||(LA16_113>='p' && LA16_113<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA16_219 = input.LA(1);

                        s = -1;
                        if ( (LA16_219=='\'') ) {s = 254;}

                        else if ( ((LA16_219>='\u0000' && LA16_219<='&')||(LA16_219>='(' && LA16_219<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA16_173 = input.LA(1);

                        s = -1;
                        if ( (LA16_173=='d') ) {s = 219;}

                        else if ( ((LA16_173>='\u0000' && LA16_173<='c')||(LA16_173>='e' && LA16_173<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA16_220 = input.LA(1);

                        s = -1;
                        if ( (LA16_220=='t') ) {s = 255;}

                        else if ( ((LA16_220>='\u0000' && LA16_220<='s')||(LA16_220>='u' && LA16_220<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA16_174 = input.LA(1);

                        s = -1;
                        if ( (LA16_174=='s') ) {s = 220;}

                        else if ( ((LA16_174>='\u0000' && LA16_174<='r')||(LA16_174>='t' && LA16_174<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA16_255 = input.LA(1);

                        s = -1;
                        if ( (LA16_255=='\'') ) {s = 286;}

                        else if ( ((LA16_255>='\u0000' && LA16_255<='&')||(LA16_255>='(' && LA16_255<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='i') ) {s = 1;}

                        else if ( (LA16_0=='o') ) {s = 2;}

                        else if ( (LA16_0=='s') ) {s = 3;}

                        else if ( (LA16_0==':') ) {s = 4;}

                        else if ( (LA16_0=='=') ) {s = 5;}

                        else if ( (LA16_0=='w') ) {s = 6;}

                        else if ( (LA16_0==';') ) {s = 7;}

                        else if ( (LA16_0=='e') ) {s = 8;}

                        else if ( (LA16_0=='(') ) {s = 9;}

                        else if ( (LA16_0==')') ) {s = 10;}

                        else if ( (LA16_0=='/') ) {s = 11;}

                        else if ( (LA16_0=='d') ) {s = 12;}

                        else if ( (LA16_0=='v') ) {s = 13;}

                        else if ( (LA16_0=='p') ) {s = 14;}

                        else if ( (LA16_0=='@') ) {s = 15;}

                        else if ( (LA16_0=='n') ) {s = 16;}

                        else if ( (LA16_0=='l') ) {s = 17;}

                        else if ( (LA16_0=='r') ) {s = 18;}

                        else if ( (LA16_0=='a') ) {s = 19;}

                        else if ( (LA16_0=='.') ) {s = 20;}

                        else if ( (LA16_0=='#') ) {s = 21;}

                        else if ( (LA16_0=='>') ) {s = 22;}

                        else if ( (LA16_0=='?') ) {s = 23;}

                        else if ( (LA16_0=='|') ) {s = 24;}

                        else if ( (LA16_0=='&') ) {s = 25;}

                        else if ( (LA16_0=='!') ) {s = 26;}

                        else if ( (LA16_0=='^') ) {s = 27;}

                        else if ( (LA16_0==',') ) {s = 28;}

                        else if ( (LA16_0=='*') ) {s = 29;}

                        else if ( (LA16_0=='%') ) {s = 30;}

                        else if ( (LA16_0=='\'') ) {s = 31;}

                        else if ( (LA16_0=='+') ) {s = 32;}

                        else if ( (LA16_0=='-') ) {s = 33;}

                        else if ( (LA16_0=='<') ) {s = 34;}

                        else if ( (LA16_0=='~') ) {s = 35;}

                        else if ( (LA16_0=='m') ) {s = 36;}

                        else if ( (LA16_0=='u') ) {s = 37;}

                        else if ( (LA16_0=='t') ) {s = 38;}

                        else if ( (LA16_0=='f') ) {s = 39;}

                        else if ( (LA16_0=='y') ) {s = 40;}

                        else if ( (LA16_0=='0') ) {s = 41;}

                        else if ( ((LA16_0>='1' && LA16_0<='9')) ) {s = 42;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='b' && LA16_0<='c')||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='k')||LA16_0=='q'||LA16_0=='x'||LA16_0=='z') ) {s = 43;}

                        else if ( (LA16_0=='\"') ) {s = 44;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 45;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='$'||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||LA16_0=='{'||LA16_0=='}'||(LA16_0>='\u007F' && LA16_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA16_31 = input.LA(1);

                        s = -1;
                        if ( (LA16_31=='n') ) {s = 107;}

                        else if ( (LA16_31=='+') ) {s = 108;}

                        else if ( (LA16_31=='*') ) {s = 109;}

                        else if ( (LA16_31=='m') ) {s = 110;}

                        else if ( (LA16_31=='o') ) {s = 111;}

                        else if ( (LA16_31=='a') ) {s = 112;}

                        else if ( (LA16_31=='h') ) {s = 113;}

                        else if ( ((LA16_31>='\u0000' && LA16_31<=')')||(LA16_31>=',' && LA16_31<='`')||(LA16_31>='b' && LA16_31<='g')||(LA16_31>='i' && LA16_31<='l')||(LA16_31>='p' && LA16_31<='\uFFFF')) ) {s = 114;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA16_108 = input.LA(1);

                        s = -1;
                        if ( (LA16_108=='\'') ) {s = 168;}

                        else if ( ((LA16_108>='\u0000' && LA16_108<='&')||(LA16_108>='(' && LA16_108<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA16_107 = input.LA(1);

                        s = -1;
                        if ( (LA16_107=='o') ) {s = 167;}

                        else if ( ((LA16_107>='\u0000' && LA16_107<='n')||(LA16_107>='p' && LA16_107<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA16_250 = input.LA(1);

                        s = -1;
                        if ( (LA16_250=='\'') ) {s = 282;}

                        else if ( ((LA16_250>='\u0000' && LA16_250<='&')||(LA16_250>='(' && LA16_250<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA16_213 = input.LA(1);

                        s = -1;
                        if ( (LA16_213=='e') ) {s = 250;}

                        else if ( ((LA16_213>='\u0000' && LA16_213<='d')||(LA16_213>='f' && LA16_213<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA16_167 = input.LA(1);

                        s = -1;
                        if ( (LA16_167=='n') ) {s = 213;}

                        else if ( ((LA16_167>='\u0000' && LA16_167<='m')||(LA16_167>='o' && LA16_167<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}