package de.cau.cs.kieler.sim.esi.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.cau.cs.kieler.sim.esi.services.EsiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsiParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_FLOAT", "RULE_ALPHANUMSPECIAL", "RULE_SPECIAL", "RULE_WS", "'true'", "'false'", "'!'", "'reset'", "';'", "'%'", "'Output'", "':'", "')'", "'%%'", "'('"
    };
    public static final int T__20=20;
    public static final int RULE_FLOAT=6;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_SPECIAL=8;
    public static final int RULE_ALPHANUMSPECIAL=7;
    public static final int T__10=10;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalEsiParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEsiParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEsiParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g"; }


     
     	private EsiGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EsiGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuletracelist"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:60:1: entryRuletracelist : ruletracelist EOF ;
    public final void entryRuletracelist() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:61:1: ( ruletracelist EOF )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:62:1: ruletracelist EOF
            {
             before(grammarAccess.getTracelistRule()); 
            pushFollow(FOLLOW_ruletracelist_in_entryRuletracelist61);
            ruletracelist();

            state._fsp--;

             after(grammarAccess.getTracelistRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletracelist68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletracelist"


    // $ANTLR start "ruletracelist"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:69:1: ruletracelist : ( ( ( rule__Tracelist__TracesAssignment ) ) ( ( rule__Tracelist__TracesAssignment )* ) ) ;
    public final void ruletracelist() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:73:2: ( ( ( ( rule__Tracelist__TracesAssignment ) ) ( ( rule__Tracelist__TracesAssignment )* ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:74:1: ( ( ( rule__Tracelist__TracesAssignment ) ) ( ( rule__Tracelist__TracesAssignment )* ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:74:1: ( ( ( rule__Tracelist__TracesAssignment ) ) ( ( rule__Tracelist__TracesAssignment )* ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:75:1: ( ( rule__Tracelist__TracesAssignment ) ) ( ( rule__Tracelist__TracesAssignment )* )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:75:1: ( ( rule__Tracelist__TracesAssignment ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:76:1: ( rule__Tracelist__TracesAssignment )
            {
             before(grammarAccess.getTracelistAccess().getTracesAssignment()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:77:1: ( rule__Tracelist__TracesAssignment )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:77:2: rule__Tracelist__TracesAssignment
            {
            pushFollow(FOLLOW_rule__Tracelist__TracesAssignment_in_ruletracelist96);
            rule__Tracelist__TracesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTracelistAccess().getTracesAssignment()); 

            }

            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:80:1: ( ( rule__Tracelist__TracesAssignment )* )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:81:1: ( rule__Tracelist__TracesAssignment )*
            {
             before(grammarAccess.getTracelistAccess().getTracesAssignment()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:82:1: ( rule__Tracelist__TracesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:82:2: rule__Tracelist__TracesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Tracelist__TracesAssignment_in_ruletracelist108);
            	    rule__Tracelist__TracesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTracelistAccess().getTracesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletracelist"


    // $ANTLR start "entryRuletrace"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:95:1: entryRuletrace : ruletrace EOF ;
    public final void entryRuletrace() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:96:1: ( ruletrace EOF )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:97:1: ruletrace EOF
            {
             before(grammarAccess.getTraceRule()); 
            pushFollow(FOLLOW_ruletrace_in_entryRuletrace138);
            ruletrace();

            state._fsp--;

             after(grammarAccess.getTraceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletrace145); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletrace"


    // $ANTLR start "ruletrace"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:104:1: ruletrace : ( ( rule__Trace__Group__0 ) ) ;
    public final void ruletrace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:108:2: ( ( ( rule__Trace__Group__0 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:109:1: ( ( rule__Trace__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:109:1: ( ( rule__Trace__Group__0 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:110:1: ( rule__Trace__Group__0 )
            {
             before(grammarAccess.getTraceAccess().getGroup()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:111:1: ( rule__Trace__Group__0 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:111:2: rule__Trace__Group__0
            {
            pushFollow(FOLLOW_rule__Trace__Group__0_in_ruletrace171);
            rule__Trace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletrace"


    // $ANTLR start "entryRuletick"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:123:1: entryRuletick : ruletick EOF ;
    public final void entryRuletick() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:124:1: ( ruletick EOF )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:125:1: ruletick EOF
            {
             before(grammarAccess.getTickRule()); 
            pushFollow(FOLLOW_ruletick_in_entryRuletick198);
            ruletick();

            state._fsp--;

             after(grammarAccess.getTickRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletick205); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletick"


    // $ANTLR start "ruletick"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:132:1: ruletick : ( ( rule__Tick__Group__0 ) ) ;
    public final void ruletick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:136:2: ( ( ( rule__Tick__Group__0 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:137:1: ( ( rule__Tick__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:137:1: ( ( rule__Tick__Group__0 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:138:1: ( rule__Tick__Group__0 )
            {
             before(grammarAccess.getTickAccess().getGroup()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:139:1: ( rule__Tick__Group__0 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:139:2: rule__Tick__Group__0
            {
            pushFollow(FOLLOW_rule__Tick__Group__0_in_ruletick231);
            rule__Tick__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletick"


    // $ANTLR start "entryRulesignal"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:151:1: entryRulesignal : rulesignal EOF ;
    public final void entryRulesignal() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:152:1: ( rulesignal EOF )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:153:1: rulesignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_rulesignal_in_entryRulesignal258);
            rulesignal();

            state._fsp--;

             after(grammarAccess.getSignalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignal265); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesignal"


    // $ANTLR start "rulesignal"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:160:1: rulesignal : ( ( rule__Signal__Group__0 ) ) ;
    public final void rulesignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:164:2: ( ( ( rule__Signal__Group__0 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:165:1: ( ( rule__Signal__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:165:1: ( ( rule__Signal__Group__0 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:166:1: ( rule__Signal__Group__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:167:1: ( rule__Signal__Group__0 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:167:2: rule__Signal__Group__0
            {
            pushFollow(FOLLOW_rule__Signal__Group__0_in_rulesignal291);
            rule__Signal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesignal"


    // $ANTLR start "entryRulevalue"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:179:1: entryRulevalue : rulevalue EOF ;
    public final void entryRulevalue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:180:1: ( rulevalue EOF )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:181:1: rulevalue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_rulevalue_in_entryRulevalue318);
            rulevalue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevalue325); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevalue"


    // $ANTLR start "rulevalue"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:188:1: rulevalue : ( ( rule__Value__Alternatives ) ) ;
    public final void rulevalue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:192:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:193:1: ( ( rule__Value__Alternatives ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:193:1: ( ( rule__Value__Alternatives ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:194:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:195:1: ( rule__Value__Alternatives )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:195:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_rulevalue351);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevalue"


    // $ANTLR start "entryRuleEsoInt"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:207:1: entryRuleEsoInt : ruleEsoInt EOF ;
    public final void entryRuleEsoInt() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:208:1: ( ruleEsoInt EOF )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:209:1: ruleEsoInt EOF
            {
             before(grammarAccess.getEsoIntRule()); 
            pushFollow(FOLLOW_ruleEsoInt_in_entryRuleEsoInt378);
            ruleEsoInt();

            state._fsp--;

             after(grammarAccess.getEsoIntRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoInt385); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEsoInt"


    // $ANTLR start "ruleEsoInt"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:216:1: ruleEsoInt : ( RULE_INT ) ;
    public final void ruleEsoInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:220:2: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:221:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:221:1: ( RULE_INT )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:222:1: RULE_INT
            {
             before(grammarAccess.getEsoIntAccess().getIntTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEsoInt411); 
             after(grammarAccess.getEsoIntAccess().getIntTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEsoInt"


    // $ANTLR start "entryRuleEsoString"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:235:1: entryRuleEsoString : ruleEsoString EOF ;
    public final void entryRuleEsoString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:236:1: ( ruleEsoString EOF )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:237:1: ruleEsoString EOF
            {
             before(grammarAccess.getEsoStringRule()); 
            pushFollow(FOLLOW_ruleEsoString_in_entryRuleEsoString437);
            ruleEsoString();

            state._fsp--;

             after(grammarAccess.getEsoStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoString444); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEsoString"


    // $ANTLR start "ruleEsoString"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:244:1: ruleEsoString : ( RULE_STRING ) ;
    public final void ruleEsoString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:248:2: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:249:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:249:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:250:1: RULE_STRING
            {
             before(grammarAccess.getEsoStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEsoString470); 
             after(grammarAccess.getEsoStringAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEsoString"


    // $ANTLR start "entryRuleEsoFloat"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:263:1: entryRuleEsoFloat : ruleEsoFloat EOF ;
    public final void entryRuleEsoFloat() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:264:1: ( ruleEsoFloat EOF )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:265:1: ruleEsoFloat EOF
            {
             before(grammarAccess.getEsoFloatRule()); 
            pushFollow(FOLLOW_ruleEsoFloat_in_entryRuleEsoFloat496);
            ruleEsoFloat();

            state._fsp--;

             after(grammarAccess.getEsoFloatRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoFloat503); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEsoFloat"


    // $ANTLR start "ruleEsoFloat"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:272:1: ruleEsoFloat : ( RULE_FLOAT ) ;
    public final void ruleEsoFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:276:2: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:277:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:277:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:278:1: RULE_FLOAT
            {
             before(grammarAccess.getEsoFloatAccess().getFloatTerminalRuleCall()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleEsoFloat529); 
             after(grammarAccess.getEsoFloatAccess().getFloatTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEsoFloat"


    // $ANTLR start "entryRuleEsoBool"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:291:1: entryRuleEsoBool : ruleEsoBool EOF ;
    public final void entryRuleEsoBool() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:292:1: ( ruleEsoBool EOF )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:293:1: ruleEsoBool EOF
            {
             before(grammarAccess.getEsoBoolRule()); 
            pushFollow(FOLLOW_ruleEsoBool_in_entryRuleEsoBool555);
            ruleEsoBool();

            state._fsp--;

             after(grammarAccess.getEsoBoolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoBool562); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEsoBool"


    // $ANTLR start "ruleEsoBool"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:300:1: ruleEsoBool : ( ( rule__EsoBool__Alternatives ) ) ;
    public final void ruleEsoBool() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:304:2: ( ( ( rule__EsoBool__Alternatives ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:305:1: ( ( rule__EsoBool__Alternatives ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:305:1: ( ( rule__EsoBool__Alternatives ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:306:1: ( rule__EsoBool__Alternatives )
            {
             before(grammarAccess.getEsoBoolAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:307:1: ( rule__EsoBool__Alternatives )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:307:2: rule__EsoBool__Alternatives
            {
            pushFollow(FOLLOW_rule__EsoBool__Alternatives_in_ruleEsoBool588);
            rule__EsoBool__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEsoBoolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEsoBool"


    // $ANTLR start "entryRulekvpair"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:319:1: entryRulekvpair : rulekvpair EOF ;
    public final void entryRulekvpair() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:320:1: ( rulekvpair EOF )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:321:1: rulekvpair EOF
            {
             before(grammarAccess.getKvpairRule()); 
            pushFollow(FOLLOW_rulekvpair_in_entryRulekvpair615);
            rulekvpair();

            state._fsp--;

             after(grammarAccess.getKvpairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulekvpair622); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulekvpair"


    // $ANTLR start "rulekvpair"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:328:1: rulekvpair : ( ( rule__Kvpair__Group__0 ) ) ;
    public final void rulekvpair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:332:2: ( ( ( rule__Kvpair__Group__0 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:333:1: ( ( rule__Kvpair__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:333:1: ( ( rule__Kvpair__Group__0 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:334:1: ( rule__Kvpair__Group__0 )
            {
             before(grammarAccess.getKvpairAccess().getGroup()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:335:1: ( rule__Kvpair__Group__0 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:335:2: rule__Kvpair__Group__0
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__0_in_rulekvpair648);
            rule__Kvpair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKvpairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulekvpair"


    // $ANTLR start "rule__Value__Alternatives"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:347:1: rule__Value__Alternatives : ( ( ruleEsoInt ) | ( ruleEsoFloat ) | ( ruleEsoBool ) | ( ruleEsoString ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:351:1: ( ( ruleEsoInt ) | ( ruleEsoFloat ) | ( ruleEsoBool ) | ( ruleEsoString ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt2=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt2=2;
                }
                break;
            case 10:
            case 11:
                {
                alt2=3;
                }
                break;
            case RULE_STRING:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:352:1: ( ruleEsoInt )
                    {
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:352:1: ( ruleEsoInt )
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:353:1: ruleEsoInt
                    {
                     before(grammarAccess.getValueAccess().getEsoIntParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEsoInt_in_rule__Value__Alternatives684);
                    ruleEsoInt();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getEsoIntParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:358:6: ( ruleEsoFloat )
                    {
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:358:6: ( ruleEsoFloat )
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:359:1: ruleEsoFloat
                    {
                     before(grammarAccess.getValueAccess().getEsoFloatParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEsoFloat_in_rule__Value__Alternatives701);
                    ruleEsoFloat();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getEsoFloatParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:364:6: ( ruleEsoBool )
                    {
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:364:6: ( ruleEsoBool )
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:365:1: ruleEsoBool
                    {
                     before(grammarAccess.getValueAccess().getEsoBoolParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEsoBool_in_rule__Value__Alternatives718);
                    ruleEsoBool();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getEsoBoolParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:370:6: ( ruleEsoString )
                    {
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:370:6: ( ruleEsoString )
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:371:1: ruleEsoString
                    {
                     before(grammarAccess.getValueAccess().getEsoStringParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEsoString_in_rule__Value__Alternatives735);
                    ruleEsoString();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getEsoStringParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__EsoBool__Alternatives"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:381:1: rule__EsoBool__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EsoBool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:385:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:386:1: ( 'true' )
                    {
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:386:1: ( 'true' )
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:387:1: 'true'
                    {
                     before(grammarAccess.getEsoBoolAccess().getTrueKeyword_0()); 
                    match(input,10,FOLLOW_10_in_rule__EsoBool__Alternatives768); 
                     after(grammarAccess.getEsoBoolAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:394:6: ( 'false' )
                    {
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:394:6: ( 'false' )
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:395:1: 'false'
                    {
                     before(grammarAccess.getEsoBoolAccess().getFalseKeyword_1()); 
                    match(input,11,FOLLOW_11_in_rule__EsoBool__Alternatives788); 
                     after(grammarAccess.getEsoBoolAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EsoBool__Alternatives"


    // $ANTLR start "rule__Kvpair__ValueAlternatives_3_0"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:407:1: rule__Kvpair__ValueAlternatives_3_0 : ( ( RULE_ALPHANUMSPECIAL ) | ( RULE_INT ) | ( RULE_FLOAT ) );
    public final void rule__Kvpair__ValueAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:411:1: ( ( RULE_ALPHANUMSPECIAL ) | ( RULE_INT ) | ( RULE_FLOAT ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ALPHANUMSPECIAL:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                alt4=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:412:1: ( RULE_ALPHANUMSPECIAL )
                    {
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:412:1: ( RULE_ALPHANUMSPECIAL )
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:413:1: RULE_ALPHANUMSPECIAL
                    {
                     before(grammarAccess.getKvpairAccess().getValueAlphaNumSpecialTerminalRuleCall_3_0_0()); 
                    match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__Kvpair__ValueAlternatives_3_0822); 
                     after(grammarAccess.getKvpairAccess().getValueAlphaNumSpecialTerminalRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:418:6: ( RULE_INT )
                    {
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:418:6: ( RULE_INT )
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:419:1: RULE_INT
                    {
                     before(grammarAccess.getKvpairAccess().getValueIntTerminalRuleCall_3_0_1()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Kvpair__ValueAlternatives_3_0839); 
                     after(grammarAccess.getKvpairAccess().getValueIntTerminalRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:424:6: ( RULE_FLOAT )
                    {
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:424:6: ( RULE_FLOAT )
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:425:1: RULE_FLOAT
                    {
                     before(grammarAccess.getKvpairAccess().getValueFloatTerminalRuleCall_3_0_2()); 
                    match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__Kvpair__ValueAlternatives_3_0856); 
                     after(grammarAccess.getKvpairAccess().getValueFloatTerminalRuleCall_3_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kvpair__ValueAlternatives_3_0"


    // $ANTLR start "rule__Trace__Group__0"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:437:1: rule__Trace__Group__0 : rule__Trace__Group__0__Impl rule__Trace__Group__1 ;
    public final void rule__Trace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:441:1: ( rule__Trace__Group__0__Impl rule__Trace__Group__1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:442:2: rule__Trace__Group__0__Impl rule__Trace__Group__1
            {
            pushFollow(FOLLOW_rule__Trace__Group__0__Impl_in_rule__Trace__Group__0886);
            rule__Trace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__0889);
            rule__Trace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__0"


    // $ANTLR start "rule__Trace__Group__0__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:449:1: rule__Trace__Group__0__Impl : ( '!' ) ;
    public final void rule__Trace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:453:1: ( ( '!' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:454:1: ( '!' )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:454:1: ( '!' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:455:1: '!'
            {
             before(grammarAccess.getTraceAccess().getExclamationMarkKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Trace__Group__0__Impl917); 
             after(grammarAccess.getTraceAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__0__Impl"


    // $ANTLR start "rule__Trace__Group__1"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:468:1: rule__Trace__Group__1 : rule__Trace__Group__1__Impl rule__Trace__Group__2 ;
    public final void rule__Trace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:472:1: ( rule__Trace__Group__1__Impl rule__Trace__Group__2 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:473:2: rule__Trace__Group__1__Impl rule__Trace__Group__2
            {
            pushFollow(FOLLOW_rule__Trace__Group__1__Impl_in_rule__Trace__Group__1948);
            rule__Trace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__1951);
            rule__Trace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__1"


    // $ANTLR start "rule__Trace__Group__1__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:480:1: rule__Trace__Group__1__Impl : ( 'reset' ) ;
    public final void rule__Trace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:484:1: ( ( 'reset' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:485:1: ( 'reset' )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:485:1: ( 'reset' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:486:1: 'reset'
            {
             before(grammarAccess.getTraceAccess().getResetKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Trace__Group__1__Impl979); 
             after(grammarAccess.getTraceAccess().getResetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__1__Impl"


    // $ANTLR start "rule__Trace__Group__2"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:499:1: rule__Trace__Group__2 : rule__Trace__Group__2__Impl rule__Trace__Group__3 ;
    public final void rule__Trace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:503:1: ( rule__Trace__Group__2__Impl rule__Trace__Group__3 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:504:2: rule__Trace__Group__2__Impl rule__Trace__Group__3
            {
            pushFollow(FOLLOW_rule__Trace__Group__2__Impl_in_rule__Trace__Group__21010);
            rule__Trace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__21013);
            rule__Trace__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__2"


    // $ANTLR start "rule__Trace__Group__2__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:511:1: rule__Trace__Group__2__Impl : ( ';' ) ;
    public final void rule__Trace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:515:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:516:1: ( ';' )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:516:1: ( ';' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:517:1: ';'
            {
             before(grammarAccess.getTraceAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Trace__Group__2__Impl1041); 
             after(grammarAccess.getTraceAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__2__Impl"


    // $ANTLR start "rule__Trace__Group__3"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:530:1: rule__Trace__Group__3 : rule__Trace__Group__3__Impl ;
    public final void rule__Trace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:534:1: ( rule__Trace__Group__3__Impl )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:535:2: rule__Trace__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Trace__Group__3__Impl_in_rule__Trace__Group__31072);
            rule__Trace__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__3"


    // $ANTLR start "rule__Trace__Group__3__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:541:1: rule__Trace__Group__3__Impl : ( ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* ) ) ;
    public final void rule__Trace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:545:1: ( ( ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:546:1: ( ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:546:1: ( ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:547:1: ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:547:1: ( ( rule__Trace__TicksAssignment_3 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:548:1: ( rule__Trace__TicksAssignment_3 )
            {
             before(grammarAccess.getTraceAccess().getTicksAssignment_3()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:549:1: ( rule__Trace__TicksAssignment_3 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:549:2: rule__Trace__TicksAssignment_3
            {
            pushFollow(FOLLOW_rule__Trace__TicksAssignment_3_in_rule__Trace__Group__3__Impl1101);
            rule__Trace__TicksAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getTicksAssignment_3()); 

            }

            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:552:1: ( ( rule__Trace__TicksAssignment_3 )* )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:553:1: ( rule__Trace__TicksAssignment_3 )*
            {
             before(grammarAccess.getTraceAccess().getTicksAssignment_3()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:554:1: ( rule__Trace__TicksAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ALPHANUMSPECIAL||(LA5_0>=14 && LA5_0<=15)||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:554:2: rule__Trace__TicksAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Trace__TicksAssignment_3_in_rule__Trace__Group__3__Impl1113);
            	    rule__Trace__TicksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTraceAccess().getTicksAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__3__Impl"


    // $ANTLR start "rule__Tick__Group__0"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:573:1: rule__Tick__Group__0 : rule__Tick__Group__0__Impl rule__Tick__Group__1 ;
    public final void rule__Tick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:577:1: ( rule__Tick__Group__0__Impl rule__Tick__Group__1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:578:2: rule__Tick__Group__0__Impl rule__Tick__Group__1
            {
            pushFollow(FOLLOW_rule__Tick__Group__0__Impl_in_rule__Tick__Group__01154);
            rule__Tick__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__1_in_rule__Tick__Group__01157);
            rule__Tick__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group__0"


    // $ANTLR start "rule__Tick__Group__0__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:585:1: rule__Tick__Group__0__Impl : ( () ) ;
    public final void rule__Tick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:589:1: ( ( () ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:590:1: ( () )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:590:1: ( () )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:591:1: ()
            {
             before(grammarAccess.getTickAccess().getTickAction_0()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:592:1: ()
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:594:1: 
            {
            }

             after(grammarAccess.getTickAccess().getTickAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group__0__Impl"


    // $ANTLR start "rule__Tick__Group__1"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:604:1: rule__Tick__Group__1 : rule__Tick__Group__1__Impl rule__Tick__Group__2 ;
    public final void rule__Tick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:608:1: ( rule__Tick__Group__1__Impl rule__Tick__Group__2 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:609:2: rule__Tick__Group__1__Impl rule__Tick__Group__2
            {
            pushFollow(FOLLOW_rule__Tick__Group__1__Impl_in_rule__Tick__Group__11215);
            rule__Tick__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__2_in_rule__Tick__Group__11218);
            rule__Tick__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group__1"


    // $ANTLR start "rule__Tick__Group__1__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:616:1: rule__Tick__Group__1__Impl : ( ( rule__Tick__InputAssignment_1 )* ) ;
    public final void rule__Tick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:620:1: ( ( ( rule__Tick__InputAssignment_1 )* ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:621:1: ( ( rule__Tick__InputAssignment_1 )* )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:621:1: ( ( rule__Tick__InputAssignment_1 )* )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:622:1: ( rule__Tick__InputAssignment_1 )*
            {
             before(grammarAccess.getTickAccess().getInputAssignment_1()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:623:1: ( rule__Tick__InputAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ALPHANUMSPECIAL) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:623:2: rule__Tick__InputAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Tick__InputAssignment_1_in_rule__Tick__Group__1__Impl1245);
            	    rule__Tick__InputAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTickAccess().getInputAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group__1__Impl"


    // $ANTLR start "rule__Tick__Group__2"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:633:1: rule__Tick__Group__2 : rule__Tick__Group__2__Impl rule__Tick__Group__3 ;
    public final void rule__Tick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:637:1: ( rule__Tick__Group__2__Impl rule__Tick__Group__3 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:638:2: rule__Tick__Group__2__Impl rule__Tick__Group__3
            {
            pushFollow(FOLLOW_rule__Tick__Group__2__Impl_in_rule__Tick__Group__21276);
            rule__Tick__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__3_in_rule__Tick__Group__21279);
            rule__Tick__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group__2"


    // $ANTLR start "rule__Tick__Group__2__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:645:1: rule__Tick__Group__2__Impl : ( ( rule__Tick__Group_2__0 )? ) ;
    public final void rule__Tick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:649:1: ( ( ( rule__Tick__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:650:1: ( ( rule__Tick__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:650:1: ( ( rule__Tick__Group_2__0 )? )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:651:1: ( rule__Tick__Group_2__0 )?
            {
             before(grammarAccess.getTickAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:652:1: ( rule__Tick__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:652:2: rule__Tick__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Tick__Group_2__0_in_rule__Tick__Group__2__Impl1306);
                    rule__Tick__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTickAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group__2__Impl"


    // $ANTLR start "rule__Tick__Group__3"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:662:1: rule__Tick__Group__3 : rule__Tick__Group__3__Impl rule__Tick__Group__4 ;
    public final void rule__Tick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:666:1: ( rule__Tick__Group__3__Impl rule__Tick__Group__4 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:667:2: rule__Tick__Group__3__Impl rule__Tick__Group__4
            {
            pushFollow(FOLLOW_rule__Tick__Group__3__Impl_in_rule__Tick__Group__31337);
            rule__Tick__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__4_in_rule__Tick__Group__31340);
            rule__Tick__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group__3"


    // $ANTLR start "rule__Tick__Group__3__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:674:1: rule__Tick__Group__3__Impl : ( ( rule__Tick__ExtraInfosAssignment_3 )* ) ;
    public final void rule__Tick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:678:1: ( ( ( rule__Tick__ExtraInfosAssignment_3 )* ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:679:1: ( ( rule__Tick__ExtraInfosAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:679:1: ( ( rule__Tick__ExtraInfosAssignment_3 )* )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:680:1: ( rule__Tick__ExtraInfosAssignment_3 )*
            {
             before(grammarAccess.getTickAccess().getExtraInfosAssignment_3()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:681:1: ( rule__Tick__ExtraInfosAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:681:2: rule__Tick__ExtraInfosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Tick__ExtraInfosAssignment_3_in_rule__Tick__Group__3__Impl1367);
            	    rule__Tick__ExtraInfosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTickAccess().getExtraInfosAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group__3__Impl"


    // $ANTLR start "rule__Tick__Group__4"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:691:1: rule__Tick__Group__4 : rule__Tick__Group__4__Impl ;
    public final void rule__Tick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:695:1: ( rule__Tick__Group__4__Impl )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:696:2: rule__Tick__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Tick__Group__4__Impl_in_rule__Tick__Group__41398);
            rule__Tick__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group__4"


    // $ANTLR start "rule__Tick__Group__4__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:702:1: rule__Tick__Group__4__Impl : ( ';' ) ;
    public final void rule__Tick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:706:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:707:1: ( ';' )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:707:1: ( ';' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:708:1: ';'
            {
             before(grammarAccess.getTickAccess().getSemicolonKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Tick__Group__4__Impl1426); 
             after(grammarAccess.getTickAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group__4__Impl"


    // $ANTLR start "rule__Tick__Group_2__0"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:731:1: rule__Tick__Group_2__0 : rule__Tick__Group_2__0__Impl rule__Tick__Group_2__1 ;
    public final void rule__Tick__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:735:1: ( rule__Tick__Group_2__0__Impl rule__Tick__Group_2__1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:736:2: rule__Tick__Group_2__0__Impl rule__Tick__Group_2__1
            {
            pushFollow(FOLLOW_rule__Tick__Group_2__0__Impl_in_rule__Tick__Group_2__01467);
            rule__Tick__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group_2__1_in_rule__Tick__Group_2__01470);
            rule__Tick__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group_2__0"


    // $ANTLR start "rule__Tick__Group_2__0__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:743:1: rule__Tick__Group_2__0__Impl : ( '%' ) ;
    public final void rule__Tick__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:747:1: ( ( '%' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:748:1: ( '%' )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:748:1: ( '%' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:749:1: '%'
            {
             before(grammarAccess.getTickAccess().getPercentSignKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__Tick__Group_2__0__Impl1498); 
             after(grammarAccess.getTickAccess().getPercentSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group_2__0__Impl"


    // $ANTLR start "rule__Tick__Group_2__1"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:762:1: rule__Tick__Group_2__1 : rule__Tick__Group_2__1__Impl rule__Tick__Group_2__2 ;
    public final void rule__Tick__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:766:1: ( rule__Tick__Group_2__1__Impl rule__Tick__Group_2__2 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:767:2: rule__Tick__Group_2__1__Impl rule__Tick__Group_2__2
            {
            pushFollow(FOLLOW_rule__Tick__Group_2__1__Impl_in_rule__Tick__Group_2__11529);
            rule__Tick__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group_2__2_in_rule__Tick__Group_2__11532);
            rule__Tick__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group_2__1"


    // $ANTLR start "rule__Tick__Group_2__1__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:774:1: rule__Tick__Group_2__1__Impl : ( 'Output' ) ;
    public final void rule__Tick__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:778:1: ( ( 'Output' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:779:1: ( 'Output' )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:779:1: ( 'Output' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:780:1: 'Output'
            {
             before(grammarAccess.getTickAccess().getOutputKeyword_2_1()); 
            match(input,16,FOLLOW_16_in_rule__Tick__Group_2__1__Impl1560); 
             after(grammarAccess.getTickAccess().getOutputKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group_2__1__Impl"


    // $ANTLR start "rule__Tick__Group_2__2"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:793:1: rule__Tick__Group_2__2 : rule__Tick__Group_2__2__Impl rule__Tick__Group_2__3 ;
    public final void rule__Tick__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:797:1: ( rule__Tick__Group_2__2__Impl rule__Tick__Group_2__3 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:798:2: rule__Tick__Group_2__2__Impl rule__Tick__Group_2__3
            {
            pushFollow(FOLLOW_rule__Tick__Group_2__2__Impl_in_rule__Tick__Group_2__21591);
            rule__Tick__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group_2__3_in_rule__Tick__Group_2__21594);
            rule__Tick__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group_2__2"


    // $ANTLR start "rule__Tick__Group_2__2__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:805:1: rule__Tick__Group_2__2__Impl : ( ':' ) ;
    public final void rule__Tick__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:809:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:810:1: ( ':' )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:810:1: ( ':' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:811:1: ':'
            {
             before(grammarAccess.getTickAccess().getColonKeyword_2_2()); 
            match(input,17,FOLLOW_17_in_rule__Tick__Group_2__2__Impl1622); 
             after(grammarAccess.getTickAccess().getColonKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group_2__2__Impl"


    // $ANTLR start "rule__Tick__Group_2__3"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:824:1: rule__Tick__Group_2__3 : rule__Tick__Group_2__3__Impl ;
    public final void rule__Tick__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:828:1: ( rule__Tick__Group_2__3__Impl )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:829:2: rule__Tick__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Tick__Group_2__3__Impl_in_rule__Tick__Group_2__31653);
            rule__Tick__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group_2__3"


    // $ANTLR start "rule__Tick__Group_2__3__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:835:1: rule__Tick__Group_2__3__Impl : ( ( rule__Tick__OutputAssignment_2_3 )* ) ;
    public final void rule__Tick__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:839:1: ( ( ( rule__Tick__OutputAssignment_2_3 )* ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:840:1: ( ( rule__Tick__OutputAssignment_2_3 )* )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:840:1: ( ( rule__Tick__OutputAssignment_2_3 )* )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:841:1: ( rule__Tick__OutputAssignment_2_3 )*
            {
             before(grammarAccess.getTickAccess().getOutputAssignment_2_3()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:842:1: ( rule__Tick__OutputAssignment_2_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ALPHANUMSPECIAL) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:842:2: rule__Tick__OutputAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_rule__Tick__OutputAssignment_2_3_in_rule__Tick__Group_2__3__Impl1680);
            	    rule__Tick__OutputAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTickAccess().getOutputAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group_2__3__Impl"


    // $ANTLR start "rule__Signal__Group__0"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:860:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:864:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:865:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
            {
            pushFollow(FOLLOW_rule__Signal__Group__0__Impl_in_rule__Signal__Group__01719);
            rule__Signal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__01722);
            rule__Signal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__0"


    // $ANTLR start "rule__Signal__Group__0__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:872:1: rule__Signal__Group__0__Impl : ( ( rule__Signal__NameAssignment_0 ) ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:876:1: ( ( ( rule__Signal__NameAssignment_0 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:877:1: ( ( rule__Signal__NameAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:877:1: ( ( rule__Signal__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:878:1: ( rule__Signal__NameAssignment_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:879:1: ( rule__Signal__NameAssignment_0 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:879:2: rule__Signal__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0__Impl1749);
            rule__Signal__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__0__Impl"


    // $ANTLR start "rule__Signal__Group__1"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:889:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:893:1: ( rule__Signal__Group__1__Impl )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:894:2: rule__Signal__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group__1__Impl_in_rule__Signal__Group__11779);
            rule__Signal__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__1"


    // $ANTLR start "rule__Signal__Group__1__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:900:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__Group_1__0 )? ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:904:1: ( ( ( rule__Signal__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:905:1: ( ( rule__Signal__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:905:1: ( ( rule__Signal__Group_1__0 )? )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:906:1: ( rule__Signal__Group_1__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:907:1: ( rule__Signal__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:907:2: rule__Signal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_1__0_in_rule__Signal__Group__1__Impl1806);
                    rule__Signal__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignalAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__1__Impl"


    // $ANTLR start "rule__Signal__Group_1__0"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:921:1: rule__Signal__Group_1__0 : rule__Signal__Group_1__0__Impl rule__Signal__Group_1__1 ;
    public final void rule__Signal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:925:1: ( rule__Signal__Group_1__0__Impl rule__Signal__Group_1__1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:926:2: rule__Signal__Group_1__0__Impl rule__Signal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_1__0__Impl_in_rule__Signal__Group_1__01841);
            rule__Signal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_1__1_in_rule__Signal__Group_1__01844);
            rule__Signal__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__0"


    // $ANTLR start "rule__Signal__Group_1__0__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:933:1: rule__Signal__Group_1__0__Impl : ( ( rule__Signal__ValuedAssignment_1_0 ) ) ;
    public final void rule__Signal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:937:1: ( ( ( rule__Signal__ValuedAssignment_1_0 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:938:1: ( ( rule__Signal__ValuedAssignment_1_0 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:938:1: ( ( rule__Signal__ValuedAssignment_1_0 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:939:1: ( rule__Signal__ValuedAssignment_1_0 )
            {
             before(grammarAccess.getSignalAccess().getValuedAssignment_1_0()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:940:1: ( rule__Signal__ValuedAssignment_1_0 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:940:2: rule__Signal__ValuedAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Signal__ValuedAssignment_1_0_in_rule__Signal__Group_1__0__Impl1871);
            rule__Signal__ValuedAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getValuedAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__0__Impl"


    // $ANTLR start "rule__Signal__Group_1__1"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:950:1: rule__Signal__Group_1__1 : rule__Signal__Group_1__1__Impl rule__Signal__Group_1__2 ;
    public final void rule__Signal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:954:1: ( rule__Signal__Group_1__1__Impl rule__Signal__Group_1__2 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:955:2: rule__Signal__Group_1__1__Impl rule__Signal__Group_1__2
            {
            pushFollow(FOLLOW_rule__Signal__Group_1__1__Impl_in_rule__Signal__Group_1__11901);
            rule__Signal__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_1__2_in_rule__Signal__Group_1__11904);
            rule__Signal__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__1"


    // $ANTLR start "rule__Signal__Group_1__1__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:962:1: rule__Signal__Group_1__1__Impl : ( ( rule__Signal__ValAssignment_1_1 ) ) ;
    public final void rule__Signal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:966:1: ( ( ( rule__Signal__ValAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:967:1: ( ( rule__Signal__ValAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:967:1: ( ( rule__Signal__ValAssignment_1_1 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:968:1: ( rule__Signal__ValAssignment_1_1 )
            {
             before(grammarAccess.getSignalAccess().getValAssignment_1_1()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:969:1: ( rule__Signal__ValAssignment_1_1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:969:2: rule__Signal__ValAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Signal__ValAssignment_1_1_in_rule__Signal__Group_1__1__Impl1931);
            rule__Signal__ValAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getValAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__1__Impl"


    // $ANTLR start "rule__Signal__Group_1__2"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:979:1: rule__Signal__Group_1__2 : rule__Signal__Group_1__2__Impl ;
    public final void rule__Signal__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:983:1: ( rule__Signal__Group_1__2__Impl )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:984:2: rule__Signal__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_1__2__Impl_in_rule__Signal__Group_1__21961);
            rule__Signal__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__2"


    // $ANTLR start "rule__Signal__Group_1__2__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:990:1: rule__Signal__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Signal__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:994:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:995:1: ( ')' )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:995:1: ( ')' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:996:1: ')'
            {
             before(grammarAccess.getSignalAccess().getRightParenthesisKeyword_1_2()); 
            match(input,18,FOLLOW_18_in_rule__Signal__Group_1__2__Impl1989); 
             after(grammarAccess.getSignalAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_1__2__Impl"


    // $ANTLR start "rule__Kvpair__Group__0"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1015:1: rule__Kvpair__Group__0 : rule__Kvpair__Group__0__Impl rule__Kvpair__Group__1 ;
    public final void rule__Kvpair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1019:1: ( rule__Kvpair__Group__0__Impl rule__Kvpair__Group__1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1020:2: rule__Kvpair__Group__0__Impl rule__Kvpair__Group__1
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__0__Impl_in_rule__Kvpair__Group__02026);
            rule__Kvpair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kvpair__Group__1_in_rule__Kvpair__Group__02029);
            rule__Kvpair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kvpair__Group__0"


    // $ANTLR start "rule__Kvpair__Group__0__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1027:1: rule__Kvpair__Group__0__Impl : ( '%%' ) ;
    public final void rule__Kvpair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1031:1: ( ( '%%' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1032:1: ( '%%' )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1032:1: ( '%%' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1033:1: '%%'
            {
             before(grammarAccess.getKvpairAccess().getPercentSignPercentSignKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Kvpair__Group__0__Impl2057); 
             after(grammarAccess.getKvpairAccess().getPercentSignPercentSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kvpair__Group__0__Impl"


    // $ANTLR start "rule__Kvpair__Group__1"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1046:1: rule__Kvpair__Group__1 : rule__Kvpair__Group__1__Impl rule__Kvpair__Group__2 ;
    public final void rule__Kvpair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1050:1: ( rule__Kvpair__Group__1__Impl rule__Kvpair__Group__2 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1051:2: rule__Kvpair__Group__1__Impl rule__Kvpair__Group__2
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__1__Impl_in_rule__Kvpair__Group__12088);
            rule__Kvpair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kvpair__Group__2_in_rule__Kvpair__Group__12091);
            rule__Kvpair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kvpair__Group__1"


    // $ANTLR start "rule__Kvpair__Group__1__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1058:1: rule__Kvpair__Group__1__Impl : ( ( rule__Kvpair__KeyAssignment_1 ) ) ;
    public final void rule__Kvpair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1062:1: ( ( ( rule__Kvpair__KeyAssignment_1 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1063:1: ( ( rule__Kvpair__KeyAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1063:1: ( ( rule__Kvpair__KeyAssignment_1 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1064:1: ( rule__Kvpair__KeyAssignment_1 )
            {
             before(grammarAccess.getKvpairAccess().getKeyAssignment_1()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1065:1: ( rule__Kvpair__KeyAssignment_1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1065:2: rule__Kvpair__KeyAssignment_1
            {
            pushFollow(FOLLOW_rule__Kvpair__KeyAssignment_1_in_rule__Kvpair__Group__1__Impl2118);
            rule__Kvpair__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKvpairAccess().getKeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kvpair__Group__1__Impl"


    // $ANTLR start "rule__Kvpair__Group__2"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1075:1: rule__Kvpair__Group__2 : rule__Kvpair__Group__2__Impl rule__Kvpair__Group__3 ;
    public final void rule__Kvpair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1079:1: ( rule__Kvpair__Group__2__Impl rule__Kvpair__Group__3 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1080:2: rule__Kvpair__Group__2__Impl rule__Kvpair__Group__3
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__2__Impl_in_rule__Kvpair__Group__22148);
            rule__Kvpair__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kvpair__Group__3_in_rule__Kvpair__Group__22151);
            rule__Kvpair__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kvpair__Group__2"


    // $ANTLR start "rule__Kvpair__Group__2__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1087:1: rule__Kvpair__Group__2__Impl : ( ':' ) ;
    public final void rule__Kvpair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1091:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1092:1: ( ':' )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1092:1: ( ':' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1093:1: ':'
            {
             before(grammarAccess.getKvpairAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Kvpair__Group__2__Impl2179); 
             after(grammarAccess.getKvpairAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kvpair__Group__2__Impl"


    // $ANTLR start "rule__Kvpair__Group__3"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1106:1: rule__Kvpair__Group__3 : rule__Kvpair__Group__3__Impl ;
    public final void rule__Kvpair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1110:1: ( rule__Kvpair__Group__3__Impl )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1111:2: rule__Kvpair__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__3__Impl_in_rule__Kvpair__Group__32210);
            rule__Kvpair__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kvpair__Group__3"


    // $ANTLR start "rule__Kvpair__Group__3__Impl"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1117:1: rule__Kvpair__Group__3__Impl : ( ( rule__Kvpair__ValueAssignment_3 ) ) ;
    public final void rule__Kvpair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1121:1: ( ( ( rule__Kvpair__ValueAssignment_3 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1122:1: ( ( rule__Kvpair__ValueAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1122:1: ( ( rule__Kvpair__ValueAssignment_3 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1123:1: ( rule__Kvpair__ValueAssignment_3 )
            {
             before(grammarAccess.getKvpairAccess().getValueAssignment_3()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1124:1: ( rule__Kvpair__ValueAssignment_3 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1124:2: rule__Kvpair__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Kvpair__ValueAssignment_3_in_rule__Kvpair__Group__3__Impl2237);
            rule__Kvpair__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKvpairAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kvpair__Group__3__Impl"


    // $ANTLR start "rule__Tracelist__TracesAssignment"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1143:1: rule__Tracelist__TracesAssignment : ( ruletrace ) ;
    public final void rule__Tracelist__TracesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1147:1: ( ( ruletrace ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1148:1: ( ruletrace )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1148:1: ( ruletrace )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1149:1: ruletrace
            {
             before(grammarAccess.getTracelistAccess().getTracesTraceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruletrace_in_rule__Tracelist__TracesAssignment2280);
            ruletrace();

            state._fsp--;

             after(grammarAccess.getTracelistAccess().getTracesTraceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tracelist__TracesAssignment"


    // $ANTLR start "rule__Trace__TicksAssignment_3"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1158:1: rule__Trace__TicksAssignment_3 : ( ruletick ) ;
    public final void rule__Trace__TicksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1162:1: ( ( ruletick ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1163:1: ( ruletick )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1163:1: ( ruletick )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1164:1: ruletick
            {
             before(grammarAccess.getTraceAccess().getTicksTickParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruletick_in_rule__Trace__TicksAssignment_32311);
            ruletick();

            state._fsp--;

             after(grammarAccess.getTraceAccess().getTicksTickParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__TicksAssignment_3"


    // $ANTLR start "rule__Tick__InputAssignment_1"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1173:1: rule__Tick__InputAssignment_1 : ( rulesignal ) ;
    public final void rule__Tick__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1177:1: ( ( rulesignal ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1178:1: ( rulesignal )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1178:1: ( rulesignal )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1179:1: rulesignal
            {
             before(grammarAccess.getTickAccess().getInputSignalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulesignal_in_rule__Tick__InputAssignment_12342);
            rulesignal();

            state._fsp--;

             after(grammarAccess.getTickAccess().getInputSignalParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__InputAssignment_1"


    // $ANTLR start "rule__Tick__OutputAssignment_2_3"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1188:1: rule__Tick__OutputAssignment_2_3 : ( rulesignal ) ;
    public final void rule__Tick__OutputAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1192:1: ( ( rulesignal ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1193:1: ( rulesignal )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1193:1: ( rulesignal )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1194:1: rulesignal
            {
             before(grammarAccess.getTickAccess().getOutputSignalParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_rulesignal_in_rule__Tick__OutputAssignment_2_32373);
            rulesignal();

            state._fsp--;

             after(grammarAccess.getTickAccess().getOutputSignalParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__OutputAssignment_2_3"


    // $ANTLR start "rule__Tick__ExtraInfosAssignment_3"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1203:1: rule__Tick__ExtraInfosAssignment_3 : ( rulekvpair ) ;
    public final void rule__Tick__ExtraInfosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1207:1: ( ( rulekvpair ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1208:1: ( rulekvpair )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1208:1: ( rulekvpair )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1209:1: rulekvpair
            {
             before(grammarAccess.getTickAccess().getExtraInfosKvpairParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulekvpair_in_rule__Tick__ExtraInfosAssignment_32404);
            rulekvpair();

            state._fsp--;

             after(grammarAccess.getTickAccess().getExtraInfosKvpairParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__ExtraInfosAssignment_3"


    // $ANTLR start "rule__Signal__NameAssignment_0"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1218:1: rule__Signal__NameAssignment_0 : ( RULE_ALPHANUMSPECIAL ) ;
    public final void rule__Signal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1222:1: ( ( RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1223:1: ( RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1223:1: ( RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1224:1: RULE_ALPHANUMSPECIAL
            {
             before(grammarAccess.getSignalAccess().getNameAlphaNumSpecialTerminalRuleCall_0_0()); 
            match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__Signal__NameAssignment_02435); 
             after(grammarAccess.getSignalAccess().getNameAlphaNumSpecialTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__NameAssignment_0"


    // $ANTLR start "rule__Signal__ValuedAssignment_1_0"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1233:1: rule__Signal__ValuedAssignment_1_0 : ( ( '(' ) ) ;
    public final void rule__Signal__ValuedAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1237:1: ( ( ( '(' ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1238:1: ( ( '(' ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1238:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1239:1: ( '(' )
            {
             before(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0_0()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1240:1: ( '(' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1241:1: '('
            {
             before(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0_0()); 
            match(input,20,FOLLOW_20_in_rule__Signal__ValuedAssignment_1_02471); 
             after(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0_0()); 

            }

             after(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__ValuedAssignment_1_0"


    // $ANTLR start "rule__Signal__ValAssignment_1_1"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1256:1: rule__Signal__ValAssignment_1_1 : ( rulevalue ) ;
    public final void rule__Signal__ValAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1260:1: ( ( rulevalue ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1261:1: ( rulevalue )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1261:1: ( rulevalue )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1262:1: rulevalue
            {
             before(grammarAccess.getSignalAccess().getValValueParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulevalue_in_rule__Signal__ValAssignment_1_12510);
            rulevalue();

            state._fsp--;

             after(grammarAccess.getSignalAccess().getValValueParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__ValAssignment_1_1"


    // $ANTLR start "rule__Kvpair__KeyAssignment_1"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1271:1: rule__Kvpair__KeyAssignment_1 : ( RULE_ALPHANUMSPECIAL ) ;
    public final void rule__Kvpair__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1275:1: ( ( RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1276:1: ( RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1276:1: ( RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1277:1: RULE_ALPHANUMSPECIAL
            {
             before(grammarAccess.getKvpairAccess().getKeyAlphaNumSpecialTerminalRuleCall_1_0()); 
            match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__Kvpair__KeyAssignment_12541); 
             after(grammarAccess.getKvpairAccess().getKeyAlphaNumSpecialTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kvpair__KeyAssignment_1"


    // $ANTLR start "rule__Kvpair__ValueAssignment_3"
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1286:1: rule__Kvpair__ValueAssignment_3 : ( ( rule__Kvpair__ValueAlternatives_3_0 ) ) ;
    public final void rule__Kvpair__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1290:1: ( ( ( rule__Kvpair__ValueAlternatives_3_0 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1291:1: ( ( rule__Kvpair__ValueAlternatives_3_0 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1291:1: ( ( rule__Kvpair__ValueAlternatives_3_0 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1292:1: ( rule__Kvpair__ValueAlternatives_3_0 )
            {
             before(grammarAccess.getKvpairAccess().getValueAlternatives_3_0()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1293:1: ( rule__Kvpair__ValueAlternatives_3_0 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:1293:2: rule__Kvpair__ValueAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Kvpair__ValueAlternatives_3_0_in_rule__Kvpair__ValueAssignment_32572);
            rule__Kvpair__ValueAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getKvpairAccess().getValueAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kvpair__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruletracelist_in_entryRuletracelist61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletracelist68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tracelist__TracesAssignment_in_ruletracelist96 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Tracelist__TracesAssignment_in_ruletracelist108 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruletrace_in_entryRuletrace138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletrace145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__0_in_ruletrace171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletick_in_entryRuletick198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletick205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__0_in_ruletick231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_entryRulesignal258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignal265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__0_in_rulesignal291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_in_entryRulevalue318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevalue325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_rulevalue351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoInt_in_entryRuleEsoInt378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoInt385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEsoInt411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoString_in_entryRuleEsoString437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoString444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEsoString470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_entryRuleEsoFloat496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoFloat503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleEsoFloat529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoBool_in_entryRuleEsoBool555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoBool562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EsoBool__Alternatives_in_ruleEsoBool588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekvpair_in_entryRulekvpair615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulekvpair622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__0_in_rulekvpair648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoInt_in_rule__Value__Alternatives684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_rule__Value__Alternatives701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoBool_in_rule__Value__Alternatives718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoString_in_rule__Value__Alternatives735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__EsoBool__Alternatives768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EsoBool__Alternatives788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__Kvpair__ValueAlternatives_3_0822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Kvpair__ValueAlternatives_3_0839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Kvpair__ValueAlternatives_3_0856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__0__Impl_in_rule__Trace__Group__0886 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__0889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Trace__Group__0__Impl917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__1__Impl_in_rule__Trace__Group__1948 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Trace__Group__1__Impl979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__2__Impl_in_rule__Trace__Group__21010 = new BitSet(new long[]{0x000000000008C080L});
    public static final BitSet FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__21013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Trace__Group__2__Impl1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__3__Impl_in_rule__Trace__Group__31072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__TicksAssignment_3_in_rule__Trace__Group__3__Impl1101 = new BitSet(new long[]{0x000000000008C082L});
    public static final BitSet FOLLOW_rule__Trace__TicksAssignment_3_in_rule__Trace__Group__3__Impl1113 = new BitSet(new long[]{0x000000000008C082L});
    public static final BitSet FOLLOW_rule__Tick__Group__0__Impl_in_rule__Tick__Group__01154 = new BitSet(new long[]{0x000000000008C080L});
    public static final BitSet FOLLOW_rule__Tick__Group__1_in_rule__Tick__Group__01157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__1__Impl_in_rule__Tick__Group__11215 = new BitSet(new long[]{0x000000000008C080L});
    public static final BitSet FOLLOW_rule__Tick__Group__2_in_rule__Tick__Group__11218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__InputAssignment_1_in_rule__Tick__Group__1__Impl1245 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Tick__Group__2__Impl_in_rule__Tick__Group__21276 = new BitSet(new long[]{0x000000000008C080L});
    public static final BitSet FOLLOW_rule__Tick__Group__3_in_rule__Tick__Group__21279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__0_in_rule__Tick__Group__2__Impl1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__3__Impl_in_rule__Tick__Group__31337 = new BitSet(new long[]{0x000000000008C080L});
    public static final BitSet FOLLOW_rule__Tick__Group__4_in_rule__Tick__Group__31340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__ExtraInfosAssignment_3_in_rule__Tick__Group__3__Impl1367 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Tick__Group__4__Impl_in_rule__Tick__Group__41398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Tick__Group__4__Impl1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__0__Impl_in_rule__Tick__Group_2__01467 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__1_in_rule__Tick__Group_2__01470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Tick__Group_2__0__Impl1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__1__Impl_in_rule__Tick__Group_2__11529 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__2_in_rule__Tick__Group_2__11532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Tick__Group_2__1__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__2__Impl_in_rule__Tick__Group_2__21591 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__3_in_rule__Tick__Group_2__21594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Tick__Group_2__2__Impl1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__3__Impl_in_rule__Tick__Group_2__31653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__OutputAssignment_2_3_in_rule__Tick__Group_2__3__Impl1680 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Signal__Group__0__Impl_in_rule__Signal__Group__01719 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__01722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0__Impl1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__1__Impl_in_rule__Signal__Group__11779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__0_in_rule__Signal__Group__1__Impl1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__0__Impl_in_rule__Signal__Group_1__01841 = new BitSet(new long[]{0x0000000000000C70L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__1_in_rule__Signal__Group_1__01844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__ValuedAssignment_1_0_in_rule__Signal__Group_1__0__Impl1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__1__Impl_in_rule__Signal__Group_1__11901 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__2_in_rule__Signal__Group_1__11904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__ValAssignment_1_1_in_rule__Signal__Group_1__1__Impl1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__2__Impl_in_rule__Signal__Group_1__21961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Signal__Group_1__2__Impl1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__0__Impl_in_rule__Kvpair__Group__02026 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__1_in_rule__Kvpair__Group__02029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Kvpair__Group__0__Impl2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__1__Impl_in_rule__Kvpair__Group__12088 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__2_in_rule__Kvpair__Group__12091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__KeyAssignment_1_in_rule__Kvpair__Group__1__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__2__Impl_in_rule__Kvpair__Group__22148 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__3_in_rule__Kvpair__Group__22151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Kvpair__Group__2__Impl2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__3__Impl_in_rule__Kvpair__Group__32210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__ValueAssignment_3_in_rule__Kvpair__Group__3__Impl2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletrace_in_rule__Tracelist__TracesAssignment2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletick_in_rule__Trace__TicksAssignment_32311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_rule__Tick__InputAssignment_12342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_rule__Tick__OutputAssignment_2_32373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekvpair_in_rule__Tick__ExtraInfosAssignment_32404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__Signal__NameAssignment_02435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Signal__ValuedAssignment_1_02471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_in_rule__Signal__ValAssignment_1_12510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__Kvpair__KeyAssignment_12541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__ValueAlternatives_3_0_in_rule__Kvpair__ValueAssignment_32572 = new BitSet(new long[]{0x0000000000000002L});

}