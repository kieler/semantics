package de.cau.cs.kieler.yakindu.scc.model.scctext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSCCExpLexer extends Lexer {
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

    public InternalSCCExpLexer() {;} 
    public InternalSCCExpLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSCCExpLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:11:7: ( 'static' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:11:9: 'static'
            {
            match("static"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:12:7: ( ':' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:12:9: ':'
            {
            match(':'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:13:7: ( '=' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:13:9: '='
            {
            match('='); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:14:7: ( 'with' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:14:9: 'with'
            {
            match("with"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:15:7: ( 'Exit' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:15:9: 'Exit'
            {
            match("Exit"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:16:7: ( '/' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:16:9: '/'
            {
            match('/'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:17:7: ( ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:17:9: ';'
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:18:7: ( 'Inside' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:18:9: 'Inside'
            {
            match("Inside"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:19:7: ( 'Entry' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:19:9: 'Entry'
            {
            match("Entry"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:20:7: ( 'Suspend' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:20:9: 'Suspend'
            {
            match("Suspend"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:21:7: ( '#' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:21:9: '#'
            {
            match('#'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:22:7: ( ',' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:22:9: ','
            {
            match(','); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:23:7: ( '[' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:23:9: '['
            {
            match('['); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:24:7: ( ']' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:24:9: ']'
            {
            match(']'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:25:7: ( '(' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:25:9: '('
            {
            match('('); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:26:7: ( ')' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:26:9: ')'
            {
            match(')'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:27:7: ( 'pre' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:27:9: 'pre'
            {
            match("pre"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:28:7: ( '@@statechart@@' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:28:9: '@@statechart@@'
            {
            match("@@statechart@@"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:29:7: ( '@@state@@' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:29:9: '@@state@@'
            {
            match("@@state@@"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:30:7: ( '@@transition@@' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:30:9: '@@transition@@'
            {
            match("@@transition@@"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:31:7: ( 'namespace' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:31:9: 'namespace'
            {
            match("namespace"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:32:7: ( 'interface' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:32:9: 'interface'
            {
            match("interface"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:33:7: ( 'internal' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:33:9: 'internal'
            {
            match("internal"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:34:7: ( 'event' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:34:9: 'event'
            {
            match("event"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:35:7: ( 'operation' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:35:9: 'operation'
            {
            match("operation"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:36:7: ( 'entrypoint' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:36:9: 'entrypoint'
            {
            match("entrypoint"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:37:7: ( 'exitpoint' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:37:9: 'exitpoint'
            {
            match("exitpoint"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:38:7: ( '.' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:38:9: '.'
            {
            match('.'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:39:7: ( '>' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:39:9: '>'
            {
            match('>'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:40:7: ( 'entry' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:40:9: 'entry'
            {
            match("entry"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:41:7: ( 'exit' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:41:9: 'exit'
            {
            match("exit"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:42:7: ( 'oncycle' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:42:9: 'oncycle'
            {
            match("oncycle"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:43:7: ( 'always' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:43:9: 'always'
            {
            match("always"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:44:7: ( 'default' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:44:9: 'default'
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:45:7: ( 'else' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:45:9: 'else'
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:46:7: ( 'raise' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:46:9: 'raise'
            {
            match("raise"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:47:7: ( '?' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:47:9: '?'
            {
            match('?'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:48:7: ( '||' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:48:9: '||'
            {
            match("||"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:49:7: ( '&&' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:49:9: '&&'
            {
            match("&&"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:50:7: ( '!' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:50:9: '!'
            {
            match('!'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:51:7: ( '^' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:51:9: '^'
            {
            match('^'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:52:7: ( '|' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:52:9: '|'
            {
            match('|'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:53:7: ( '&' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:53:9: '&'
            {
            match('&'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:54:7: ( '\\'none\\'' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:54:9: '\\'none\\''
            {
            match("'none'"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:55:7: ( '\\'+\\'' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:55:9: '\\'+\\''
            {
            match("'+'"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:56:7: ( '\\'*\\'' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:56:9: '\\'*\\''
            {
            match("'*'"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:57:7: ( '\\'max\\'' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:57:9: '\\'max\\''
            {
            match("'max'"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:58:7: ( '\\'min\\'' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:58:9: '\\'min\\''
            {
            match("'min'"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:59:7: ( '\\'or\\'' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:59:9: '\\'or\\''
            {
            match("'or'"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:60:7: ( '\\'and\\'' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:60:9: '\\'and\\''
            {
            match("'and'"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:61:7: ( '\\'host\\'' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:61:9: '\\'host\\''
            {
            match("'host'"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:62:7: ( 'inout' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:62:9: 'inout'
            {
            match("inout"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:63:7: ( 'in' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:63:9: 'in'
            {
            match("in"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:64:7: ( 'out' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:64:9: 'out'
            {
            match("out"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:65:7: ( 'local' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:65:9: 'local'
            {
            match("local"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:66:7: ( 'after' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:66:9: 'after'
            {
            match("after"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:67:7: ( 'every' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:67:9: 'every'
            {
            match("every"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:68:7: ( '*=' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:68:9: '*='
            {
            match("*="); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:69:7: ( '/=' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:69:9: '/='
            {
            match("/="); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:70:7: ( '%=' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:70:9: '%='
            {
            match("%="); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:71:7: ( '+=' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:71:9: '+='
            {
            match("+="); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:72:7: ( '-=' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:72:9: '-='
            {
            match("-="); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:73:7: ( '<<=' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:73:9: '<<='
            {
            match("<<="); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:74:7: ( '>>=' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:74:9: '>>='
            {
            match(">>="); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:75:7: ( '&=' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:75:9: '&='
            {
            match("&="); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:76:7: ( '^=' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:76:9: '^='
            {
            match("^="); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:77:7: ( '|=' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:77:9: '|='
            {
            match("|="); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:78:7: ( '<<' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:78:9: '<<'
            {
            match("<<"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:79:7: ( '>>' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:79:9: '>>'
            {
            match(">>"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:80:7: ( '+' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:80:9: '+'
            {
            match('+'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:7: ( '-' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:9: '-'
            {
            match('-'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:82:7: ( '*' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:82:9: '*'
            {
            match('*'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:83:7: ( '%' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:83:9: '%'
            {
            match('%'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:84:7: ( '~' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:84:9: '~'
            {
            match('~'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:85:7: ( '<' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:85:9: '<'
            {
            match('<'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:86:7: ( '<=' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:86:9: '<='
            {
            match("<="); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:87:7: ( '>=' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:87:9: '>='
            {
            match(">="); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:88:7: ( '==' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:88:9: '=='
            {
            match("=="); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:89:7: ( '!=' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:89:9: '!='
            {
            match("!="); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:90:7: ( 's' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:90:9: 's'
            {
            match('s'); 

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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:91:7: ( 'ms' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:91:9: 'ms'
            {
            match("ms"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:92:7: ( 'us' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:92:9: 'us'
            {
            match("us"); 


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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:93:7: ( 'ns' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:93:9: 'ns'
            {
            match("ns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4583:11: ( ( 'true' | 'false' | 'yes' | 'no' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4583:13: ( 'true' | 'false' | 'yes' | 'no' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4583:13: ( 'true' | 'false' | 'yes' | 'no' )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4583:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4583:21: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4583:29: 'yes'
                    {
                    match("yes"); 


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4583:35: 'no'
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4585:10: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4585:12: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4585:26: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4587:12: ( RULE_INT '.' RULE_INT ( 'e' ( '-' | '+' ) RULE_INT )? ( 'f' | 'F' | 'd' | 'D' )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4587:14: RULE_INT '.' RULE_INT ( 'e' ( '-' | '+' ) RULE_INT )? ( 'f' | 'F' | 'd' | 'D' )?
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4587:36: ( 'e' ( '-' | '+' ) RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='e') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4587:37: 'e' ( '-' | '+' ) RULE_INT
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4587:62: ( 'f' | 'F' | 'd' | 'D' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='D'||LA4_0=='F'||LA4_0=='d'||LA4_0=='f') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4589:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4589:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4589:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4589:11: '^'
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4589:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4591:10: ( ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4591:12: ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4591:12: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4591:13: '0' .. '9'
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4595:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4595:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4595:24: ( options {greedy=false; } : . )*
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
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4595:52: .
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4597:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4597:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4597:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4597:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4597:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4597:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4597:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4597:41: '\\r'
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4599:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4599:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4599:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4601:16: ( . )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4601:18: .
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
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | RULE_BOOL | RULE_HEX | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=93;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:508: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 85 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:518: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 86 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:527: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 87 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:538: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 88 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:546: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 89 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:555: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 90 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:567: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 91 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:583: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 92 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:599: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 93 :
                // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1:607: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\64\1\uffff\1\70\2\65\1\77\1\uffff\2\65\6\uffff\1\65"+
        "\1\62\4\65\1\uffff\1\131\3\65\1\uffff\1\141\1\144\1\146\1\150\1"+
        "\62\1\65\1\163\1\165\1\167\1\171\1\174\1\uffff\5\65\2\u0084\1\uffff"+
        "\1\62\2\uffff\1\65\5\uffff\3\65\5\uffff\2\65\6\uffff\1\65\1\uffff"+
        "\1\65\1\u0092\1\u0093\1\u0096\7\65\1\uffff\1\u009f\2\uffff\4\65"+
        "\23\uffff\1\65\10\uffff\1\u00ae\3\uffff\1\u00af\1\u00b0\3\65\2\uffff"+
        "\1\u0084\2\uffff\6\65\1\u00ba\2\uffff\1\65\2\uffff\2\65\1\uffff"+
        "\6\65\1\u00c6\2\uffff\4\65\10\uffff\1\65\4\uffff\2\65\1\u0093\1"+
        "\65\1\u00d7\1\u00d8\3\65\2\uffff\6\65\1\u00e4\1\u00e5\2\65\1\uffff"+
        "\4\65\10\uffff\1\65\1\u0093\2\65\2\uffff\1\u00f5\2\65\1\uffff\2"+
        "\65\1\u00fc\1\u00fd\1\u00fe\1\u0100\1\65\2\uffff\3\65\1\u0105\1"+
        "\65\1\u0107\6\uffff\1\u010d\1\u0093\1\u010e\1\uffff\1\u010f\1\65"+
        "\1\uffff\3\65\3\uffff\1\65\1\uffff\3\65\1\u0119\1\uffff\1\65\11"+
        "\uffff\1\u011d\1\uffff\6\65\1\u0126\1\uffff\1\u0127\5\uffff\2\65"+
        "\1\u012a\3\65\2\uffff\1\u012e\1\u012f\1\uffff\1\65\1\u0131\1\u0132"+
        "\2\uffff\1\u0133\3\uffff";
    static final String DFA16_eofS =
        "\u0134\uffff";
    static final String DFA16_minS =
        "\1\0\1\60\1\uffff\1\75\1\151\1\156\1\52\1\uffff\1\156\1\165\6\uffff"+
        "\1\162\1\100\1\141\1\156\1\154\1\156\1\uffff\1\75\1\146\1\145\1"+
        "\141\1\uffff\1\75\1\46\2\75\1\0\1\157\4\75\1\74\1\uffff\2\163\1"+
        "\162\1\141\1\145\2\56\1\uffff\1\0\2\uffff\1\141\5\uffff\1\164\1"+
        "\151\1\164\5\uffff\2\163\6\uffff\1\145\1\163\1\155\3\60\1\145\1"+
        "\164\1\151\1\163\1\145\1\143\1\164\1\uffff\1\75\2\uffff\1\167\1"+
        "\164\1\146\1\151\13\uffff\7\0\1\uffff\1\143\10\uffff\1\75\3\uffff"+
        "\2\60\1\165\1\154\1\163\2\uffff\1\56\2\uffff\1\164\1\150\1\164\1"+
        "\162\1\151\1\160\1\60\1\164\1\uffff\1\145\2\uffff\1\145\1\165\1"+
        "\uffff\1\156\1\162\1\164\1\145\1\162\1\171\1\60\2\uffff\1\141\1"+
        "\145\1\141\1\163\1\0\2\uffff\5\0\1\141\4\uffff\1\145\1\163\1\60"+
        "\1\151\2\60\1\171\1\144\1\145\1\uffff\1\141\1\163\1\162\2\164\2"+
        "\171\2\60\1\141\1\143\1\uffff\1\171\1\162\1\165\1\145\1\0\2\uffff"+
        "\2\0\1\uffff\2\0\1\154\1\60\1\145\1\143\2\uffff\1\60\1\145\1\156"+
        "\1\164\1\160\1\146\4\60\1\157\2\uffff\1\164\1\154\1\163\1\60\1\154"+
        "\1\60\1\0\4\uffff\1\0\3\60\1\uffff\1\60\1\144\1\145\3\141\3\uffff"+
        "\1\157\1\uffff\2\151\1\145\1\60\1\uffff\1\164\11\uffff\1\60\1\100"+
        "\2\143\1\154\1\151\1\156\1\157\1\60\1\uffff\1\60\5\uffff\2\145\1"+
        "\60\1\156\1\164\1\156\2\uffff\2\60\1\uffff\1\164\2\60\2\uffff\1"+
        "\60\3\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\172\1\uffff\1\75\1\151\1\170\1\75\1\uffff\1\156\1\165"+
        "\6\uffff\1\162\1\100\1\163\1\156\1\170\1\165\1\uffff\1\76\1\154"+
        "\1\145\1\141\1\uffff\1\174\2\75\1\172\1\uffff\1\157\5\75\1\uffff"+
        "\2\163\1\162\1\141\1\145\1\170\1\71\1\uffff\1\uffff\2\uffff\1\141"+
        "\5\uffff\1\164\1\151\1\164\5\uffff\2\163\6\uffff\1\145\1\164\1\155"+
        "\3\172\1\145\1\164\1\151\1\163\1\145\1\143\1\164\1\uffff\1\75\2"+
        "\uffff\1\167\1\164\1\146\1\151\13\uffff\7\uffff\1\uffff\1\143\10"+
        "\uffff\1\75\3\uffff\2\172\1\165\1\154\1\163\2\uffff\1\71\2\uffff"+
        "\1\164\1\150\1\164\1\162\1\151\1\160\1\172\1\164\1\uffff\1\145\2"+
        "\uffff\1\145\1\165\1\uffff\2\162\1\164\1\145\1\162\1\171\1\172\2"+
        "\uffff\1\141\1\145\1\141\1\163\1\uffff\2\uffff\5\uffff\1\141\4\uffff"+
        "\1\145\1\163\1\172\1\151\2\172\1\171\1\144\1\145\1\uffff\1\141\1"+
        "\163\1\162\2\164\2\171\2\172\1\141\1\143\1\uffff\1\171\1\162\1\165"+
        "\1\145\1\uffff\2\uffff\2\uffff\1\uffff\2\uffff\1\154\1\172\1\145"+
        "\1\143\2\uffff\1\172\1\145\1\156\1\164\1\160\1\156\4\172\1\157\2"+
        "\uffff\1\164\1\154\1\163\1\172\1\154\1\172\1\uffff\4\uffff\1\uffff"+
        "\3\172\1\uffff\1\172\1\144\1\145\3\141\3\uffff\1\157\1\uffff\2\151"+
        "\1\145\1\172\1\uffff\1\164\11\uffff\1\172\3\143\1\154\1\151\1\156"+
        "\1\157\1\172\1\uffff\1\172\5\uffff\2\145\1\172\1\156\1\164\1\156"+
        "\2\uffff\2\172\1\uffff\1\164\2\172\2\uffff\1\172\3\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\4\uffff\1\7\2\uffff\1\13\1\14\1\15\1\16\1\17\1\20"+
        "\6\uffff\1\34\4\uffff\1\45\13\uffff\1\112\7\uffff\1\127\1\uffff"+
        "\1\134\1\135\1\uffff\1\120\1\127\1\2\1\116\1\3\3\uffff\1\73\1\132"+
        "\1\133\1\6\1\7\2\uffff\1\13\1\14\1\15\1\16\1\17\1\20\15\uffff\1"+
        "\34\1\uffff\1\115\1\35\4\uffff\1\45\1\46\1\103\1\52\1\47\1\101\1"+
        "\53\1\117\1\50\1\102\1\51\7\uffff\1\131\1\uffff\1\72\1\110\1\74"+
        "\1\111\1\75\1\106\1\76\1\107\1\uffff\1\114\1\113\1\112\5\uffff\1"+
        "\125\1\130\1\uffff\1\126\1\134\10\uffff\1\24\1\uffff\1\123\1\124"+
        "\2\uffff\1\65\7\uffff\1\100\1\105\5\uffff\1\55\1\56\6\uffff\1\77"+
        "\1\104\1\121\1\122\11\uffff\1\21\13\uffff\1\66\5\uffff\1\55\1\56"+
        "\2\uffff\1\61\6\uffff\1\4\1\5\13\uffff\1\37\1\43\7\uffff\1\57\1"+
        "\60\1\61\1\62\4\uffff\1\11\6\uffff\1\64\1\30\1\71\1\uffff\1\36\4"+
        "\uffff\1\70\1\uffff\1\44\1\54\1\57\1\60\1\62\1\63\1\67\1\1\1\10"+
        "\11\uffff\1\41\1\uffff\1\54\1\63\1\12\1\22\1\23\6\uffff\1\40\1\42"+
        "\2\uffff\1\27\3\uffff\1\25\1\26\1\uffff\1\33\1\31\1\32";
    static final String DFA16_specialS =
        "\1\26\37\uffff\1\0\17\uffff\1\25\70\uffff\1\1\1\5\1\6\1\14\1\21"+
        "\1\23\1\10\64\uffff\1\2\2\uffff\1\15\1\17\1\20\1\24\1\7\37\uffff"+
        "\1\3\2\uffff\1\13\1\16\1\uffff\1\22\1\12\31\uffff\1\4\4\uffff\1"+
        "\11\102\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\62\2\61\2\62\1\61\22\62\1\61\1\36\1\60\1\12\1\62\1\43\1"+
            "\35\1\40\1\16\1\17\1\42\1\44\1\13\1\45\1\26\1\6\1\55\11\56\1"+
            "\2\1\7\1\46\1\3\1\27\1\33\1\21\4\57\1\5\3\57\1\10\11\57\1\11"+
            "\7\57\1\14\1\62\1\15\1\37\1\57\1\62\1\30\2\57\1\31\1\24\1\53"+
            "\2\57\1\23\2\57\1\41\1\50\1\22\1\25\1\20\1\57\1\32\1\1\1\52"+
            "\1\51\1\57\1\4\1\57\1\54\1\57\1\62\1\34\1\62\1\47\uff81\62",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\63\6\65",
            "",
            "\1\67",
            "\1\71",
            "\1\73\11\uffff\1\72",
            "\1\75\4\uffff\1\76\15\uffff\1\74",
            "",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113\15\uffff\1\115\3\uffff\1\114",
            "\1\116",
            "\1\122\1\uffff\1\120\7\uffff\1\117\1\uffff\1\121",
            "\1\124\1\uffff\1\123\4\uffff\1\125",
            "",
            "\1\130\1\127",
            "\1\133\5\uffff\1\132",
            "\1\134",
            "\1\135",
            "",
            "\1\140\76\uffff\1\137",
            "\1\142\26\uffff\1\143",
            "\1\145",
            "\1\147\3\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\52\160\1\153\1\152\65\160\1\156\6\160\1\157\4\160\1\154\1"+
            "\151\1\155\uff90\160",
            "\1\161",
            "\1\162",
            "\1\164",
            "\1\166",
            "\1\170",
            "\1\172\1\173",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0086\1\uffff\12\u0085\36\uffff\1\u0083\37\uffff\1\u0083",
            "\1\u0086\1\uffff\12\u0085",
            "",
            "\0\160",
            "",
            "",
            "\1\u0088",
            "",
            "",
            "",
            "",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "",
            "",
            "",
            "\1\u008c",
            "\1\u008d",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008e",
            "\1\u008f\1\u0090",
            "\1\u0091",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u0095\4"+
            "\65\1\u0094\6\65",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
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
            "\157\160\1\u00a4\uff90\160",
            "\47\160\1\u00a5\uffd8\160",
            "\47\160\1\u00a6\uffd8\160",
            "\141\160\1\u00a7\7\160\1\u00a8\uff96\160",
            "\162\160\1\u00a9\uff8d\160",
            "\156\160\1\u00aa\uff91\160",
            "\157\160\1\u00ab\uff90\160",
            "",
            "\1\u00ac",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ad",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "\1\u0086\1\uffff\12\u0085",
            "",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "",
            "",
            "\1\u00bd",
            "\1\u00be",
            "",
            "\1\u00bf\3\uffff\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\156\160\1\u00cb\uff91\160",
            "",
            "",
            "\170\160\1\u00ce\uff87\160",
            "\156\160\1\u00cf\uff91\160",
            "\47\160\1\u00d0\uffd8\160",
            "\144\160\1\u00d1\uff9b\160",
            "\163\160\1\u00d2\uff8c\160",
            "\1\u00d3",
            "",
            "",
            "",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00d6",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\u00e3\12"+
            "\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\145\160\1\u00ec\uff9a\160",
            "",
            "",
            "\47\160\1\u00ed\uffd8\160",
            "\47\160\1\u00ee\uffd8\160",
            "",
            "\47\160\1\u00f0\uffd8\160",
            "\164\160\1\u00f1\uff8b\160",
            "\1\u00f2",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa\7\uffff\1\u00fb",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\u00ff\12"+
            "\65",
            "\1\u0101",
            "",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0106",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\47\160\1\u0108\uffd8\160",
            "",
            "",
            "",
            "",
            "\47\160\1\u010c\uffd8\160",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "",
            "",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u011a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u011f\42\uffff\1\u011e",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "",
            "",
            "\1\u0128",
            "\1\u0129",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0130",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | RULE_BOOL | RULE_HEX | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_32 = input.LA(1);

                        s = -1;
                        if ( (LA16_32=='n') ) {s = 105;}

                        else if ( (LA16_32=='+') ) {s = 106;}

                        else if ( (LA16_32=='*') ) {s = 107;}

                        else if ( (LA16_32=='m') ) {s = 108;}

                        else if ( (LA16_32=='o') ) {s = 109;}

                        else if ( (LA16_32=='a') ) {s = 110;}

                        else if ( (LA16_32=='h') ) {s = 111;}

                        else if ( ((LA16_32>='\u0000' && LA16_32<=')')||(LA16_32>=',' && LA16_32<='`')||(LA16_32>='b' && LA16_32<='g')||(LA16_32>='i' && LA16_32<='l')||(LA16_32>='p' && LA16_32<='\uFFFF')) ) {s = 112;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_105 = input.LA(1);

                        s = -1;
                        if ( (LA16_105=='o') ) {s = 164;}

                        else if ( ((LA16_105>='\u0000' && LA16_105<='n')||(LA16_105>='p' && LA16_105<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_164 = input.LA(1);

                        s = -1;
                        if ( (LA16_164=='n') ) {s = 203;}

                        else if ( ((LA16_164>='\u0000' && LA16_164<='m')||(LA16_164>='o' && LA16_164<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_203 = input.LA(1);

                        s = -1;
                        if ( (LA16_203=='e') ) {s = 236;}

                        else if ( ((LA16_203>='\u0000' && LA16_203<='d')||(LA16_203>='f' && LA16_203<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_236 = input.LA(1);

                        s = -1;
                        if ( (LA16_236=='\'') ) {s = 264;}

                        else if ( ((LA16_236>='\u0000' && LA16_236<='&')||(LA16_236>='(' && LA16_236<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_106 = input.LA(1);

                        s = -1;
                        if ( (LA16_106=='\'') ) {s = 165;}

                        else if ( ((LA16_106>='\u0000' && LA16_106<='&')||(LA16_106>='(' && LA16_106<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_107 = input.LA(1);

                        s = -1;
                        if ( (LA16_107=='\'') ) {s = 166;}

                        else if ( ((LA16_107>='\u0000' && LA16_107<='&')||(LA16_107>='(' && LA16_107<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_171 = input.LA(1);

                        s = -1;
                        if ( (LA16_171=='s') ) {s = 210;}

                        else if ( ((LA16_171>='\u0000' && LA16_171<='r')||(LA16_171>='t' && LA16_171<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_111 = input.LA(1);

                        s = -1;
                        if ( (LA16_111=='o') ) {s = 171;}

                        else if ( ((LA16_111>='\u0000' && LA16_111<='n')||(LA16_111>='p' && LA16_111<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_241 = input.LA(1);

                        s = -1;
                        if ( (LA16_241=='\'') ) {s = 268;}

                        else if ( ((LA16_241>='\u0000' && LA16_241<='&')||(LA16_241>='(' && LA16_241<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA16_210 = input.LA(1);

                        s = -1;
                        if ( (LA16_210=='t') ) {s = 241;}

                        else if ( ((LA16_210>='\u0000' && LA16_210<='s')||(LA16_210>='u' && LA16_210<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA16_206 = input.LA(1);

                        s = -1;
                        if ( (LA16_206=='\'') ) {s = 237;}

                        else if ( ((LA16_206>='\u0000' && LA16_206<='&')||(LA16_206>='(' && LA16_206<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA16_108 = input.LA(1);

                        s = -1;
                        if ( (LA16_108=='a') ) {s = 167;}

                        else if ( (LA16_108=='i') ) {s = 168;}

                        else if ( ((LA16_108>='\u0000' && LA16_108<='`')||(LA16_108>='b' && LA16_108<='h')||(LA16_108>='j' && LA16_108<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA16_167 = input.LA(1);

                        s = -1;
                        if ( (LA16_167=='x') ) {s = 206;}

                        else if ( ((LA16_167>='\u0000' && LA16_167<='w')||(LA16_167>='y' && LA16_167<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA16_207 = input.LA(1);

                        s = -1;
                        if ( (LA16_207=='\'') ) {s = 238;}

                        else if ( ((LA16_207>='\u0000' && LA16_207<='&')||(LA16_207>='(' && LA16_207<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA16_168 = input.LA(1);

                        s = -1;
                        if ( (LA16_168=='n') ) {s = 207;}

                        else if ( ((LA16_168>='\u0000' && LA16_168<='m')||(LA16_168>='o' && LA16_168<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA16_169 = input.LA(1);

                        s = -1;
                        if ( (LA16_169=='\'') ) {s = 208;}

                        else if ( ((LA16_169>='\u0000' && LA16_169<='&')||(LA16_169>='(' && LA16_169<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA16_109 = input.LA(1);

                        s = -1;
                        if ( (LA16_109=='r') ) {s = 169;}

                        else if ( ((LA16_109>='\u0000' && LA16_109<='q')||(LA16_109>='s' && LA16_109<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA16_209 = input.LA(1);

                        s = -1;
                        if ( (LA16_209=='\'') ) {s = 240;}

                        else if ( ((LA16_209>='\u0000' && LA16_209<='&')||(LA16_209>='(' && LA16_209<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA16_110 = input.LA(1);

                        s = -1;
                        if ( (LA16_110=='n') ) {s = 170;}

                        else if ( ((LA16_110>='\u0000' && LA16_110<='m')||(LA16_110>='o' && LA16_110<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA16_170 = input.LA(1);

                        s = -1;
                        if ( (LA16_170=='d') ) {s = 209;}

                        else if ( ((LA16_170>='\u0000' && LA16_170<='c')||(LA16_170>='e' && LA16_170<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA16_48 = input.LA(1);

                        s = -1;
                        if ( ((LA16_48>='\u0000' && LA16_48<='\uFFFF')) ) {s = 112;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='s') ) {s = 1;}

                        else if ( (LA16_0==':') ) {s = 2;}

                        else if ( (LA16_0=='=') ) {s = 3;}

                        else if ( (LA16_0=='w') ) {s = 4;}

                        else if ( (LA16_0=='E') ) {s = 5;}

                        else if ( (LA16_0=='/') ) {s = 6;}

                        else if ( (LA16_0==';') ) {s = 7;}

                        else if ( (LA16_0=='I') ) {s = 8;}

                        else if ( (LA16_0=='S') ) {s = 9;}

                        else if ( (LA16_0=='#') ) {s = 10;}

                        else if ( (LA16_0==',') ) {s = 11;}

                        else if ( (LA16_0=='[') ) {s = 12;}

                        else if ( (LA16_0==']') ) {s = 13;}

                        else if ( (LA16_0=='(') ) {s = 14;}

                        else if ( (LA16_0==')') ) {s = 15;}

                        else if ( (LA16_0=='p') ) {s = 16;}

                        else if ( (LA16_0=='@') ) {s = 17;}

                        else if ( (LA16_0=='n') ) {s = 18;}

                        else if ( (LA16_0=='i') ) {s = 19;}

                        else if ( (LA16_0=='e') ) {s = 20;}

                        else if ( (LA16_0=='o') ) {s = 21;}

                        else if ( (LA16_0=='.') ) {s = 22;}

                        else if ( (LA16_0=='>') ) {s = 23;}

                        else if ( (LA16_0=='a') ) {s = 24;}

                        else if ( (LA16_0=='d') ) {s = 25;}

                        else if ( (LA16_0=='r') ) {s = 26;}

                        else if ( (LA16_0=='?') ) {s = 27;}

                        else if ( (LA16_0=='|') ) {s = 28;}

                        else if ( (LA16_0=='&') ) {s = 29;}

                        else if ( (LA16_0=='!') ) {s = 30;}

                        else if ( (LA16_0=='^') ) {s = 31;}

                        else if ( (LA16_0=='\'') ) {s = 32;}

                        else if ( (LA16_0=='l') ) {s = 33;}

                        else if ( (LA16_0=='*') ) {s = 34;}

                        else if ( (LA16_0=='%') ) {s = 35;}

                        else if ( (LA16_0=='+') ) {s = 36;}

                        else if ( (LA16_0=='-') ) {s = 37;}

                        else if ( (LA16_0=='<') ) {s = 38;}

                        else if ( (LA16_0=='~') ) {s = 39;}

                        else if ( (LA16_0=='m') ) {s = 40;}

                        else if ( (LA16_0=='u') ) {s = 41;}

                        else if ( (LA16_0=='t') ) {s = 42;}

                        else if ( (LA16_0=='f') ) {s = 43;}

                        else if ( (LA16_0=='y') ) {s = 44;}

                        else if ( (LA16_0=='0') ) {s = 45;}

                        else if ( ((LA16_0>='1' && LA16_0<='9')) ) {s = 46;}

                        else if ( ((LA16_0>='A' && LA16_0<='D')||(LA16_0>='F' && LA16_0<='H')||(LA16_0>='J' && LA16_0<='R')||(LA16_0>='T' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='b' && LA16_0<='c')||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='k')||LA16_0=='q'||LA16_0=='v'||LA16_0=='x'||LA16_0=='z') ) {s = 47;}

                        else if ( (LA16_0=='\"') ) {s = 48;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 49;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='$'||LA16_0=='\\'||LA16_0=='`'||LA16_0=='{'||LA16_0=='}'||(LA16_0>='\u007F' && LA16_0<='\uFFFF')) ) {s = 50;}

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