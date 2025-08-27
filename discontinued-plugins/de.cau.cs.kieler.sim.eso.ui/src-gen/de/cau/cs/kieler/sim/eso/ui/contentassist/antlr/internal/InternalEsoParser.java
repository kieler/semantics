package de.cau.cs.kieler.sim.eso.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.sim.eso.services.EsoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ALPHANUMSPECIAL", "RULE_INT", "RULE_STRING", "RULE_FLOAT", "RULE_BOOL", "RULE_SPECIAL", "RULE_WS", "'Output:'", "'!'", "'reset'", "';'", "'%'", "'Output'", "':'", "'%%'", "')'", "'='", "'('"
    };
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=8;
    public static final int RULE_FLOAT=7;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int RULE_SPECIAL=9;
    public static final int T__13=13;
    public static final int RULE_ALPHANUMSPECIAL=4;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalEsoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEsoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEsoParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g"; }


     
     	private EsoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EsoGrammarAccess grammarAccess) {
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:60:1: entryRuletracelist : ruletracelist EOF ;
    public final void entryRuletracelist() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:61:1: ( ruletracelist EOF )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:62:1: ruletracelist EOF
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:69:1: ruletracelist : ( ( ( rule__Tracelist__TracesAssignment ) ) ( ( rule__Tracelist__TracesAssignment )* ) ) ;
    public final void ruletracelist() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:73:2: ( ( ( ( rule__Tracelist__TracesAssignment ) ) ( ( rule__Tracelist__TracesAssignment )* ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:74:1: ( ( ( rule__Tracelist__TracesAssignment ) ) ( ( rule__Tracelist__TracesAssignment )* ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:74:1: ( ( ( rule__Tracelist__TracesAssignment ) ) ( ( rule__Tracelist__TracesAssignment )* ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:75:1: ( ( rule__Tracelist__TracesAssignment ) ) ( ( rule__Tracelist__TracesAssignment )* )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:75:1: ( ( rule__Tracelist__TracesAssignment ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:76:1: ( rule__Tracelist__TracesAssignment )
            {
             before(grammarAccess.getTracelistAccess().getTracesAssignment()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:77:1: ( rule__Tracelist__TracesAssignment )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:77:2: rule__Tracelist__TracesAssignment
            {
            pushFollow(FOLLOW_rule__Tracelist__TracesAssignment_in_ruletracelist96);
            rule__Tracelist__TracesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTracelistAccess().getTracesAssignment()); 

            }

            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:80:1: ( ( rule__Tracelist__TracesAssignment )* )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:81:1: ( rule__Tracelist__TracesAssignment )*
            {
             before(grammarAccess.getTracelistAccess().getTracesAssignment()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:82:1: ( rule__Tracelist__TracesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:82:2: rule__Tracelist__TracesAssignment
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:95:1: entryRuletrace : ruletrace EOF ;
    public final void entryRuletrace() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:96:1: ( ruletrace EOF )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:97:1: ruletrace EOF
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:104:1: ruletrace : ( ( rule__Trace__Group__0 ) ) ;
    public final void ruletrace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:108:2: ( ( ( rule__Trace__Group__0 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:109:1: ( ( rule__Trace__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:109:1: ( ( rule__Trace__Group__0 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:110:1: ( rule__Trace__Group__0 )
            {
             before(grammarAccess.getTraceAccess().getGroup()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:111:1: ( rule__Trace__Group__0 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:111:2: rule__Trace__Group__0
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:123:1: entryRuletick : ruletick EOF ;
    public final void entryRuletick() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:124:1: ( ruletick EOF )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:125:1: ruletick EOF
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:132:1: ruletick : ( ( rule__Tick__Group__0 ) ) ;
    public final void ruletick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:136:2: ( ( ( rule__Tick__Group__0 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:137:1: ( ( rule__Tick__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:137:1: ( ( rule__Tick__Group__0 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:138:1: ( rule__Tick__Group__0 )
            {
             before(grammarAccess.getTickAccess().getGroup()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:139:1: ( rule__Tick__Group__0 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:139:2: rule__Tick__Group__0
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:151:1: entryRulesignal : rulesignal EOF ;
    public final void entryRulesignal() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:152:1: ( rulesignal EOF )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:153:1: rulesignal EOF
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:160:1: rulesignal : ( ( rule__Signal__Group__0 ) ) ;
    public final void rulesignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:164:2: ( ( ( rule__Signal__Group__0 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:165:1: ( ( rule__Signal__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:165:1: ( ( rule__Signal__Group__0 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:166:1: ( rule__Signal__Group__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:167:1: ( rule__Signal__Group__0 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:167:2: rule__Signal__Group__0
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


    // $ANTLR start "entryRulekvpair"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:179:1: entryRulekvpair : rulekvpair EOF ;
    public final void entryRulekvpair() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:180:1: ( rulekvpair EOF )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:181:1: rulekvpair EOF
            {
             before(grammarAccess.getKvpairRule()); 
            pushFollow(FOLLOW_rulekvpair_in_entryRulekvpair318);
            rulekvpair();

            state._fsp--;

             after(grammarAccess.getKvpairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulekvpair325); 

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:188:1: rulekvpair : ( ( rule__Kvpair__Group__0 ) ) ;
    public final void rulekvpair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:192:2: ( ( ( rule__Kvpair__Group__0 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:193:1: ( ( rule__Kvpair__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:193:1: ( ( rule__Kvpair__Group__0 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:194:1: ( rule__Kvpair__Group__0 )
            {
             before(grammarAccess.getKvpairAccess().getGroup()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:195:1: ( rule__Kvpair__Group__0 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:195:2: rule__Kvpair__Group__0
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__0_in_rulekvpair351);
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


    // $ANTLR start "entryRuleEsoInt"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:207:1: entryRuleEsoInt : ruleEsoInt EOF ;
    public final void entryRuleEsoInt() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:208:1: ( ruleEsoInt EOF )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:209:1: ruleEsoInt EOF
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:216:1: ruleEsoInt : ( ( rule__EsoInt__ValueAssignment ) ) ;
    public final void ruleEsoInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:220:2: ( ( ( rule__EsoInt__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:221:1: ( ( rule__EsoInt__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:221:1: ( ( rule__EsoInt__ValueAssignment ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:222:1: ( rule__EsoInt__ValueAssignment )
            {
             before(grammarAccess.getEsoIntAccess().getValueAssignment()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:223:1: ( rule__EsoInt__ValueAssignment )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:223:2: rule__EsoInt__ValueAssignment
            {
            pushFollow(FOLLOW_rule__EsoInt__ValueAssignment_in_ruleEsoInt411);
            rule__EsoInt__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEsoIntAccess().getValueAssignment()); 

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:235:1: entryRuleEsoString : ruleEsoString EOF ;
    public final void entryRuleEsoString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:236:1: ( ruleEsoString EOF )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:237:1: ruleEsoString EOF
            {
             before(grammarAccess.getEsoStringRule()); 
            pushFollow(FOLLOW_ruleEsoString_in_entryRuleEsoString438);
            ruleEsoString();

            state._fsp--;

             after(grammarAccess.getEsoStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoString445); 

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:244:1: ruleEsoString : ( ( rule__EsoString__ValueAssignment ) ) ;
    public final void ruleEsoString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:248:2: ( ( ( rule__EsoString__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:249:1: ( ( rule__EsoString__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:249:1: ( ( rule__EsoString__ValueAssignment ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:250:1: ( rule__EsoString__ValueAssignment )
            {
             before(grammarAccess.getEsoStringAccess().getValueAssignment()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:251:1: ( rule__EsoString__ValueAssignment )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:251:2: rule__EsoString__ValueAssignment
            {
            pushFollow(FOLLOW_rule__EsoString__ValueAssignment_in_ruleEsoString471);
            rule__EsoString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEsoStringAccess().getValueAssignment()); 

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:263:1: entryRuleEsoFloat : ruleEsoFloat EOF ;
    public final void entryRuleEsoFloat() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:264:1: ( ruleEsoFloat EOF )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:265:1: ruleEsoFloat EOF
            {
             before(grammarAccess.getEsoFloatRule()); 
            pushFollow(FOLLOW_ruleEsoFloat_in_entryRuleEsoFloat498);
            ruleEsoFloat();

            state._fsp--;

             after(grammarAccess.getEsoFloatRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoFloat505); 

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:272:1: ruleEsoFloat : ( ( rule__EsoFloat__ValueAssignment ) ) ;
    public final void ruleEsoFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:276:2: ( ( ( rule__EsoFloat__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:277:1: ( ( rule__EsoFloat__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:277:1: ( ( rule__EsoFloat__ValueAssignment ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:278:1: ( rule__EsoFloat__ValueAssignment )
            {
             before(grammarAccess.getEsoFloatAccess().getValueAssignment()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:279:1: ( rule__EsoFloat__ValueAssignment )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:279:2: rule__EsoFloat__ValueAssignment
            {
            pushFollow(FOLLOW_rule__EsoFloat__ValueAssignment_in_ruleEsoFloat531);
            rule__EsoFloat__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEsoFloatAccess().getValueAssignment()); 

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:291:1: entryRuleEsoBool : ruleEsoBool EOF ;
    public final void entryRuleEsoBool() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:292:1: ( ruleEsoBool EOF )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:293:1: ruleEsoBool EOF
            {
             before(grammarAccess.getEsoBoolRule()); 
            pushFollow(FOLLOW_ruleEsoBool_in_entryRuleEsoBool558);
            ruleEsoBool();

            state._fsp--;

             after(grammarAccess.getEsoBoolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoBool565); 

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:300:1: ruleEsoBool : ( ( rule__EsoBool__ValueAssignment ) ) ;
    public final void ruleEsoBool() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:304:2: ( ( ( rule__EsoBool__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:305:1: ( ( rule__EsoBool__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:305:1: ( ( rule__EsoBool__ValueAssignment ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:306:1: ( rule__EsoBool__ValueAssignment )
            {
             before(grammarAccess.getEsoBoolAccess().getValueAssignment()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:307:1: ( rule__EsoBool__ValueAssignment )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:307:2: rule__EsoBool__ValueAssignment
            {
            pushFollow(FOLLOW_rule__EsoBool__ValueAssignment_in_ruleEsoBool591);
            rule__EsoBool__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEsoBoolAccess().getValueAssignment()); 

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


    // $ANTLR start "entryRuleEsoJson"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:319:1: entryRuleEsoJson : ruleEsoJson EOF ;
    public final void entryRuleEsoJson() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:320:1: ( ruleEsoJson EOF )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:321:1: ruleEsoJson EOF
            {
             before(grammarAccess.getEsoJsonRule()); 
            pushFollow(FOLLOW_ruleEsoJson_in_entryRuleEsoJson618);
            ruleEsoJson();

            state._fsp--;

             after(grammarAccess.getEsoJsonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEsoJson625); 

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
    // $ANTLR end "entryRuleEsoJson"


    // $ANTLR start "ruleEsoJson"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:328:1: ruleEsoJson : ( ( rule__EsoJson__ValueAssignment ) ) ;
    public final void ruleEsoJson() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:332:2: ( ( ( rule__EsoJson__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:333:1: ( ( rule__EsoJson__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:333:1: ( ( rule__EsoJson__ValueAssignment ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:334:1: ( rule__EsoJson__ValueAssignment )
            {
             before(grammarAccess.getEsoJsonAccess().getValueAssignment()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:335:1: ( rule__EsoJson__ValueAssignment )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:335:2: rule__EsoJson__ValueAssignment
            {
            pushFollow(FOLLOW_rule__EsoJson__ValueAssignment_in_ruleEsoJson651);
            rule__EsoJson__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEsoJsonAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleEsoJson"


    // $ANTLR start "rule__Tick__Alternatives_2_1"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:347:1: rule__Tick__Alternatives_2_1 : ( ( 'Output:' ) | ( ( rule__Tick__Group_2_1_1__0 ) ) );
    public final void rule__Tick__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:351:1: ( ( 'Output:' ) | ( ( rule__Tick__Group_2_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:352:1: ( 'Output:' )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:352:1: ( 'Output:' )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:353:1: 'Output:'
                    {
                     before(grammarAccess.getTickAccess().getOutputKeyword_2_1_0()); 
                    match(input,11,FOLLOW_11_in_rule__Tick__Alternatives_2_1688); 
                     after(grammarAccess.getTickAccess().getOutputKeyword_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:360:6: ( ( rule__Tick__Group_2_1_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:360:6: ( ( rule__Tick__Group_2_1_1__0 ) )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:361:1: ( rule__Tick__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getTickAccess().getGroup_2_1_1()); 
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:362:1: ( rule__Tick__Group_2_1_1__0 )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:362:2: rule__Tick__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Tick__Group_2_1_1__0_in_rule__Tick__Alternatives_2_1707);
                    rule__Tick__Group_2_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTickAccess().getGroup_2_1_1()); 

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
    // $ANTLR end "rule__Tick__Alternatives_2_1"


    // $ANTLR start "rule__Tick__Alternatives_4_1"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:371:1: rule__Tick__Alternatives_4_1 : ( ( 'Output:' ) | ( ( rule__Tick__Group_4_1_1__0 ) ) );
    public final void rule__Tick__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:375:1: ( ( 'Output:' ) | ( ( rule__Tick__Group_4_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:376:1: ( 'Output:' )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:376:1: ( 'Output:' )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:377:1: 'Output:'
                    {
                     before(grammarAccess.getTickAccess().getOutputKeyword_4_1_0()); 
                    match(input,11,FOLLOW_11_in_rule__Tick__Alternatives_4_1741); 
                     after(grammarAccess.getTickAccess().getOutputKeyword_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:384:6: ( ( rule__Tick__Group_4_1_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:384:6: ( ( rule__Tick__Group_4_1_1__0 ) )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:385:1: ( rule__Tick__Group_4_1_1__0 )
                    {
                     before(grammarAccess.getTickAccess().getGroup_4_1_1()); 
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:386:1: ( rule__Tick__Group_4_1_1__0 )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:386:2: rule__Tick__Group_4_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Tick__Group_4_1_1__0_in_rule__Tick__Alternatives_4_1760);
                    rule__Tick__Group_4_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTickAccess().getGroup_4_1_1()); 

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
    // $ANTLR end "rule__Tick__Alternatives_4_1"


    // $ANTLR start "rule__Signal__ValAlternatives_2_0_0"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:395:1: rule__Signal__ValAlternatives_2_0_0 : ( ( ruleEsoInt ) | ( ruleEsoFloat ) | ( ruleEsoBool ) | ( ruleEsoString ) );
    public final void rule__Signal__ValAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:399:1: ( ( ruleEsoInt ) | ( ruleEsoFloat ) | ( ruleEsoBool ) | ( ruleEsoString ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt4=2;
                }
                break;
            case RULE_BOOL:
                {
                alt4=3;
                }
                break;
            case RULE_STRING:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:400:1: ( ruleEsoInt )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:400:1: ( ruleEsoInt )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:401:1: ruleEsoInt
                    {
                     before(grammarAccess.getSignalAccess().getValEsoIntParserRuleCall_2_0_0_0()); 
                    pushFollow(FOLLOW_ruleEsoInt_in_rule__Signal__ValAlternatives_2_0_0793);
                    ruleEsoInt();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getValEsoIntParserRuleCall_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:406:6: ( ruleEsoFloat )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:406:6: ( ruleEsoFloat )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:407:1: ruleEsoFloat
                    {
                     before(grammarAccess.getSignalAccess().getValEsoFloatParserRuleCall_2_0_0_1()); 
                    pushFollow(FOLLOW_ruleEsoFloat_in_rule__Signal__ValAlternatives_2_0_0810);
                    ruleEsoFloat();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getValEsoFloatParserRuleCall_2_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:412:6: ( ruleEsoBool )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:412:6: ( ruleEsoBool )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:413:1: ruleEsoBool
                    {
                     before(grammarAccess.getSignalAccess().getValEsoBoolParserRuleCall_2_0_0_2()); 
                    pushFollow(FOLLOW_ruleEsoBool_in_rule__Signal__ValAlternatives_2_0_0827);
                    ruleEsoBool();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getValEsoBoolParserRuleCall_2_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:418:6: ( ruleEsoString )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:418:6: ( ruleEsoString )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:419:1: ruleEsoString
                    {
                     before(grammarAccess.getSignalAccess().getValEsoStringParserRuleCall_2_0_0_3()); 
                    pushFollow(FOLLOW_ruleEsoString_in_rule__Signal__ValAlternatives_2_0_0844);
                    ruleEsoString();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getValEsoStringParserRuleCall_2_0_0_3()); 

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
    // $ANTLR end "rule__Signal__ValAlternatives_2_0_0"


    // $ANTLR start "rule__Kvpair__ValueAlternatives_4_0"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:429:1: rule__Kvpair__ValueAlternatives_4_0 : ( ( ruleEsoJson ) | ( ruleEsoString ) | ( ruleEsoFloat ) | ( ruleEsoBool ) | ( ruleEsoInt ) );
    public final void rule__Kvpair__ValueAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:433:1: ( ( ruleEsoJson ) | ( ruleEsoString ) | ( ruleEsoFloat ) | ( ruleEsoBool ) | ( ruleEsoInt ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_ALPHANUMSPECIAL:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt5=3;
                }
                break;
            case RULE_BOOL:
                {
                alt5=4;
                }
                break;
            case RULE_INT:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:434:1: ( ruleEsoJson )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:434:1: ( ruleEsoJson )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:435:1: ruleEsoJson
                    {
                     before(grammarAccess.getKvpairAccess().getValueEsoJsonParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_ruleEsoJson_in_rule__Kvpair__ValueAlternatives_4_0876);
                    ruleEsoJson();

                    state._fsp--;

                     after(grammarAccess.getKvpairAccess().getValueEsoJsonParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:440:6: ( ruleEsoString )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:440:6: ( ruleEsoString )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:441:1: ruleEsoString
                    {
                     before(grammarAccess.getKvpairAccess().getValueEsoStringParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_ruleEsoString_in_rule__Kvpair__ValueAlternatives_4_0893);
                    ruleEsoString();

                    state._fsp--;

                     after(grammarAccess.getKvpairAccess().getValueEsoStringParserRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:446:6: ( ruleEsoFloat )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:446:6: ( ruleEsoFloat )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:447:1: ruleEsoFloat
                    {
                     before(grammarAccess.getKvpairAccess().getValueEsoFloatParserRuleCall_4_0_2()); 
                    pushFollow(FOLLOW_ruleEsoFloat_in_rule__Kvpair__ValueAlternatives_4_0910);
                    ruleEsoFloat();

                    state._fsp--;

                     after(grammarAccess.getKvpairAccess().getValueEsoFloatParserRuleCall_4_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:452:6: ( ruleEsoBool )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:452:6: ( ruleEsoBool )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:453:1: ruleEsoBool
                    {
                     before(grammarAccess.getKvpairAccess().getValueEsoBoolParserRuleCall_4_0_3()); 
                    pushFollow(FOLLOW_ruleEsoBool_in_rule__Kvpair__ValueAlternatives_4_0927);
                    ruleEsoBool();

                    state._fsp--;

                     after(grammarAccess.getKvpairAccess().getValueEsoBoolParserRuleCall_4_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:458:6: ( ruleEsoInt )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:458:6: ( ruleEsoInt )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:459:1: ruleEsoInt
                    {
                     before(grammarAccess.getKvpairAccess().getValueEsoIntParserRuleCall_4_0_4()); 
                    pushFollow(FOLLOW_ruleEsoInt_in_rule__Kvpair__ValueAlternatives_4_0944);
                    ruleEsoInt();

                    state._fsp--;

                     after(grammarAccess.getKvpairAccess().getValueEsoIntParserRuleCall_4_0_4()); 

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
    // $ANTLR end "rule__Kvpair__ValueAlternatives_4_0"


    // $ANTLR start "rule__Trace__Group__0"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:471:1: rule__Trace__Group__0 : rule__Trace__Group__0__Impl rule__Trace__Group__1 ;
    public final void rule__Trace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:475:1: ( rule__Trace__Group__0__Impl rule__Trace__Group__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:476:2: rule__Trace__Group__0__Impl rule__Trace__Group__1
            {
            pushFollow(FOLLOW_rule__Trace__Group__0__Impl_in_rule__Trace__Group__0974);
            rule__Trace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__0977);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:483:1: rule__Trace__Group__0__Impl : ( '!' ) ;
    public final void rule__Trace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:487:1: ( ( '!' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:488:1: ( '!' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:488:1: ( '!' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:489:1: '!'
            {
             before(grammarAccess.getTraceAccess().getExclamationMarkKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Trace__Group__0__Impl1005); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:502:1: rule__Trace__Group__1 : rule__Trace__Group__1__Impl rule__Trace__Group__2 ;
    public final void rule__Trace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:506:1: ( rule__Trace__Group__1__Impl rule__Trace__Group__2 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:507:2: rule__Trace__Group__1__Impl rule__Trace__Group__2
            {
            pushFollow(FOLLOW_rule__Trace__Group__1__Impl_in_rule__Trace__Group__11036);
            rule__Trace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__11039);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:514:1: rule__Trace__Group__1__Impl : ( 'reset' ) ;
    public final void rule__Trace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:518:1: ( ( 'reset' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:519:1: ( 'reset' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:519:1: ( 'reset' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:520:1: 'reset'
            {
             before(grammarAccess.getTraceAccess().getResetKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Trace__Group__1__Impl1067); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:533:1: rule__Trace__Group__2 : rule__Trace__Group__2__Impl rule__Trace__Group__3 ;
    public final void rule__Trace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:537:1: ( rule__Trace__Group__2__Impl rule__Trace__Group__3 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:538:2: rule__Trace__Group__2__Impl rule__Trace__Group__3
            {
            pushFollow(FOLLOW_rule__Trace__Group__2__Impl_in_rule__Trace__Group__21098);
            rule__Trace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__21101);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:545:1: rule__Trace__Group__2__Impl : ( ';' ) ;
    public final void rule__Trace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:549:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:550:1: ( ';' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:550:1: ( ';' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:551:1: ';'
            {
             before(grammarAccess.getTraceAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Trace__Group__2__Impl1129); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:564:1: rule__Trace__Group__3 : rule__Trace__Group__3__Impl ;
    public final void rule__Trace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:568:1: ( rule__Trace__Group__3__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:569:2: rule__Trace__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Trace__Group__3__Impl_in_rule__Trace__Group__31160);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:575:1: rule__Trace__Group__3__Impl : ( ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* ) ) ;
    public final void rule__Trace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:579:1: ( ( ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:580:1: ( ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:580:1: ( ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:581:1: ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:581:1: ( ( rule__Trace__TicksAssignment_3 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:582:1: ( rule__Trace__TicksAssignment_3 )
            {
             before(grammarAccess.getTraceAccess().getTicksAssignment_3()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:583:1: ( rule__Trace__TicksAssignment_3 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:583:2: rule__Trace__TicksAssignment_3
            {
            pushFollow(FOLLOW_rule__Trace__TicksAssignment_3_in_rule__Trace__Group__3__Impl1189);
            rule__Trace__TicksAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getTicksAssignment_3()); 

            }

            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:586:1: ( ( rule__Trace__TicksAssignment_3 )* )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:587:1: ( rule__Trace__TicksAssignment_3 )*
            {
             before(grammarAccess.getTraceAccess().getTicksAssignment_3()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:588:1: ( rule__Trace__TicksAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ALPHANUMSPECIAL||(LA6_0>=14 && LA6_0<=15)||LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:588:2: rule__Trace__TicksAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Trace__TicksAssignment_3_in_rule__Trace__Group__3__Impl1201);
            	    rule__Trace__TicksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:607:1: rule__Tick__Group__0 : rule__Tick__Group__0__Impl rule__Tick__Group__1 ;
    public final void rule__Tick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:611:1: ( rule__Tick__Group__0__Impl rule__Tick__Group__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:612:2: rule__Tick__Group__0__Impl rule__Tick__Group__1
            {
            pushFollow(FOLLOW_rule__Tick__Group__0__Impl_in_rule__Tick__Group__01242);
            rule__Tick__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__1_in_rule__Tick__Group__01245);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:619:1: rule__Tick__Group__0__Impl : ( () ) ;
    public final void rule__Tick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:623:1: ( ( () ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:624:1: ( () )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:624:1: ( () )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:625:1: ()
            {
             before(grammarAccess.getTickAccess().getTickAction_0()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:626:1: ()
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:628:1: 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:638:1: rule__Tick__Group__1 : rule__Tick__Group__1__Impl rule__Tick__Group__2 ;
    public final void rule__Tick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:642:1: ( rule__Tick__Group__1__Impl rule__Tick__Group__2 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:643:2: rule__Tick__Group__1__Impl rule__Tick__Group__2
            {
            pushFollow(FOLLOW_rule__Tick__Group__1__Impl_in_rule__Tick__Group__11303);
            rule__Tick__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__2_in_rule__Tick__Group__11306);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:650:1: rule__Tick__Group__1__Impl : ( ( rule__Tick__InputAssignment_1 )* ) ;
    public final void rule__Tick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:654:1: ( ( ( rule__Tick__InputAssignment_1 )* ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:655:1: ( ( rule__Tick__InputAssignment_1 )* )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:655:1: ( ( rule__Tick__InputAssignment_1 )* )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:656:1: ( rule__Tick__InputAssignment_1 )*
            {
             before(grammarAccess.getTickAccess().getInputAssignment_1()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:657:1: ( rule__Tick__InputAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ALPHANUMSPECIAL) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:657:2: rule__Tick__InputAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Tick__InputAssignment_1_in_rule__Tick__Group__1__Impl1333);
            	    rule__Tick__InputAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:667:1: rule__Tick__Group__2 : rule__Tick__Group__2__Impl rule__Tick__Group__3 ;
    public final void rule__Tick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:671:1: ( rule__Tick__Group__2__Impl rule__Tick__Group__3 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:672:2: rule__Tick__Group__2__Impl rule__Tick__Group__3
            {
            pushFollow(FOLLOW_rule__Tick__Group__2__Impl_in_rule__Tick__Group__21364);
            rule__Tick__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__3_in_rule__Tick__Group__21367);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:679:1: rule__Tick__Group__2__Impl : ( ( rule__Tick__Group_2__0 )? ) ;
    public final void rule__Tick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:683:1: ( ( ( rule__Tick__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:684:1: ( ( rule__Tick__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:684:1: ( ( rule__Tick__Group_2__0 )? )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:685:1: ( rule__Tick__Group_2__0 )?
            {
             before(grammarAccess.getTickAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:686:1: ( rule__Tick__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:686:2: rule__Tick__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Tick__Group_2__0_in_rule__Tick__Group__2__Impl1394);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:696:1: rule__Tick__Group__3 : rule__Tick__Group__3__Impl rule__Tick__Group__4 ;
    public final void rule__Tick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:700:1: ( rule__Tick__Group__3__Impl rule__Tick__Group__4 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:701:2: rule__Tick__Group__3__Impl rule__Tick__Group__4
            {
            pushFollow(FOLLOW_rule__Tick__Group__3__Impl_in_rule__Tick__Group__31425);
            rule__Tick__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__4_in_rule__Tick__Group__31428);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:708:1: rule__Tick__Group__3__Impl : ( ( rule__Tick__ExtraInfosAssignment_3 )* ) ;
    public final void rule__Tick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:712:1: ( ( ( rule__Tick__ExtraInfosAssignment_3 )* ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:713:1: ( ( rule__Tick__ExtraInfosAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:713:1: ( ( rule__Tick__ExtraInfosAssignment_3 )* )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:714:1: ( rule__Tick__ExtraInfosAssignment_3 )*
            {
             before(grammarAccess.getTickAccess().getExtraInfosAssignment_3()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:715:1: ( rule__Tick__ExtraInfosAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==RULE_ALPHANUMSPECIAL) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:715:2: rule__Tick__ExtraInfosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Tick__ExtraInfosAssignment_3_in_rule__Tick__Group__3__Impl1455);
            	    rule__Tick__ExtraInfosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:725:1: rule__Tick__Group__4 : rule__Tick__Group__4__Impl rule__Tick__Group__5 ;
    public final void rule__Tick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:729:1: ( rule__Tick__Group__4__Impl rule__Tick__Group__5 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:730:2: rule__Tick__Group__4__Impl rule__Tick__Group__5
            {
            pushFollow(FOLLOW_rule__Tick__Group__4__Impl_in_rule__Tick__Group__41486);
            rule__Tick__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__5_in_rule__Tick__Group__41489);
            rule__Tick__Group__5();

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:737:1: rule__Tick__Group__4__Impl : ( ( rule__Tick__Group_4__0 )? ) ;
    public final void rule__Tick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:741:1: ( ( ( rule__Tick__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:742:1: ( ( rule__Tick__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:742:1: ( ( rule__Tick__Group_4__0 )? )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:743:1: ( rule__Tick__Group_4__0 )?
            {
             before(grammarAccess.getTickAccess().getGroup_4()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:744:1: ( rule__Tick__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:744:2: rule__Tick__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Tick__Group_4__0_in_rule__Tick__Group__4__Impl1516);
                    rule__Tick__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTickAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Tick__Group__5"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:754:1: rule__Tick__Group__5 : rule__Tick__Group__5__Impl ;
    public final void rule__Tick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:758:1: ( rule__Tick__Group__5__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:759:2: rule__Tick__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Tick__Group__5__Impl_in_rule__Tick__Group__51547);
            rule__Tick__Group__5__Impl();

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
    // $ANTLR end "rule__Tick__Group__5"


    // $ANTLR start "rule__Tick__Group__5__Impl"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:765:1: rule__Tick__Group__5__Impl : ( ';' ) ;
    public final void rule__Tick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:769:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:770:1: ( ';' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:770:1: ( ';' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:771:1: ';'
            {
             before(grammarAccess.getTickAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Tick__Group__5__Impl1575); 
             after(grammarAccess.getTickAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Tick__Group__5__Impl"


    // $ANTLR start "rule__Tick__Group_2__0"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:796:1: rule__Tick__Group_2__0 : rule__Tick__Group_2__0__Impl rule__Tick__Group_2__1 ;
    public final void rule__Tick__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:800:1: ( rule__Tick__Group_2__0__Impl rule__Tick__Group_2__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:801:2: rule__Tick__Group_2__0__Impl rule__Tick__Group_2__1
            {
            pushFollow(FOLLOW_rule__Tick__Group_2__0__Impl_in_rule__Tick__Group_2__01618);
            rule__Tick__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group_2__1_in_rule__Tick__Group_2__01621);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:808:1: rule__Tick__Group_2__0__Impl : ( '%' ) ;
    public final void rule__Tick__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:812:1: ( ( '%' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:813:1: ( '%' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:813:1: ( '%' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:814:1: '%'
            {
             before(grammarAccess.getTickAccess().getPercentSignKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__Tick__Group_2__0__Impl1649); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:827:1: rule__Tick__Group_2__1 : rule__Tick__Group_2__1__Impl rule__Tick__Group_2__2 ;
    public final void rule__Tick__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:831:1: ( rule__Tick__Group_2__1__Impl rule__Tick__Group_2__2 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:832:2: rule__Tick__Group_2__1__Impl rule__Tick__Group_2__2
            {
            pushFollow(FOLLOW_rule__Tick__Group_2__1__Impl_in_rule__Tick__Group_2__11680);
            rule__Tick__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group_2__2_in_rule__Tick__Group_2__11683);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:839:1: rule__Tick__Group_2__1__Impl : ( ( rule__Tick__Alternatives_2_1 ) ) ;
    public final void rule__Tick__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:843:1: ( ( ( rule__Tick__Alternatives_2_1 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:844:1: ( ( rule__Tick__Alternatives_2_1 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:844:1: ( ( rule__Tick__Alternatives_2_1 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:845:1: ( rule__Tick__Alternatives_2_1 )
            {
             before(grammarAccess.getTickAccess().getAlternatives_2_1()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:846:1: ( rule__Tick__Alternatives_2_1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:846:2: rule__Tick__Alternatives_2_1
            {
            pushFollow(FOLLOW_rule__Tick__Alternatives_2_1_in_rule__Tick__Group_2__1__Impl1710);
            rule__Tick__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTickAccess().getAlternatives_2_1()); 

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:856:1: rule__Tick__Group_2__2 : rule__Tick__Group_2__2__Impl ;
    public final void rule__Tick__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:860:1: ( rule__Tick__Group_2__2__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:861:2: rule__Tick__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Tick__Group_2__2__Impl_in_rule__Tick__Group_2__21740);
            rule__Tick__Group_2__2__Impl();

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:867:1: rule__Tick__Group_2__2__Impl : ( ( rule__Tick__OutputAssignment_2_2 )* ) ;
    public final void rule__Tick__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:871:1: ( ( ( rule__Tick__OutputAssignment_2_2 )* ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:872:1: ( ( rule__Tick__OutputAssignment_2_2 )* )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:872:1: ( ( rule__Tick__OutputAssignment_2_2 )* )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:873:1: ( rule__Tick__OutputAssignment_2_2 )*
            {
             before(grammarAccess.getTickAccess().getOutputAssignment_2_2()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:874:1: ( rule__Tick__OutputAssignment_2_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ALPHANUMSPECIAL) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:874:2: rule__Tick__OutputAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__Tick__OutputAssignment_2_2_in_rule__Tick__Group_2__2__Impl1767);
            	    rule__Tick__OutputAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTickAccess().getOutputAssignment_2_2()); 

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


    // $ANTLR start "rule__Tick__Group_2_1_1__0"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:890:1: rule__Tick__Group_2_1_1__0 : rule__Tick__Group_2_1_1__0__Impl rule__Tick__Group_2_1_1__1 ;
    public final void rule__Tick__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:894:1: ( rule__Tick__Group_2_1_1__0__Impl rule__Tick__Group_2_1_1__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:895:2: rule__Tick__Group_2_1_1__0__Impl rule__Tick__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__Tick__Group_2_1_1__0__Impl_in_rule__Tick__Group_2_1_1__01804);
            rule__Tick__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group_2_1_1__1_in_rule__Tick__Group_2_1_1__01807);
            rule__Tick__Group_2_1_1__1();

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
    // $ANTLR end "rule__Tick__Group_2_1_1__0"


    // $ANTLR start "rule__Tick__Group_2_1_1__0__Impl"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:902:1: rule__Tick__Group_2_1_1__0__Impl : ( 'Output' ) ;
    public final void rule__Tick__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:906:1: ( ( 'Output' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:907:1: ( 'Output' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:907:1: ( 'Output' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:908:1: 'Output'
            {
             before(grammarAccess.getTickAccess().getOutputKeyword_2_1_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Tick__Group_2_1_1__0__Impl1835); 
             after(grammarAccess.getTickAccess().getOutputKeyword_2_1_1_0()); 

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
    // $ANTLR end "rule__Tick__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Tick__Group_2_1_1__1"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:921:1: rule__Tick__Group_2_1_1__1 : rule__Tick__Group_2_1_1__1__Impl ;
    public final void rule__Tick__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:925:1: ( rule__Tick__Group_2_1_1__1__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:926:2: rule__Tick__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Tick__Group_2_1_1__1__Impl_in_rule__Tick__Group_2_1_1__11866);
            rule__Tick__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__Tick__Group_2_1_1__1"


    // $ANTLR start "rule__Tick__Group_2_1_1__1__Impl"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:932:1: rule__Tick__Group_2_1_1__1__Impl : ( ':' ) ;
    public final void rule__Tick__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:936:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:937:1: ( ':' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:937:1: ( ':' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:938:1: ':'
            {
             before(grammarAccess.getTickAccess().getColonKeyword_2_1_1_1()); 
            match(input,17,FOLLOW_17_in_rule__Tick__Group_2_1_1__1__Impl1894); 
             after(grammarAccess.getTickAccess().getColonKeyword_2_1_1_1()); 

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
    // $ANTLR end "rule__Tick__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Tick__Group_4__0"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:955:1: rule__Tick__Group_4__0 : rule__Tick__Group_4__0__Impl rule__Tick__Group_4__1 ;
    public final void rule__Tick__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:959:1: ( rule__Tick__Group_4__0__Impl rule__Tick__Group_4__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:960:2: rule__Tick__Group_4__0__Impl rule__Tick__Group_4__1
            {
            pushFollow(FOLLOW_rule__Tick__Group_4__0__Impl_in_rule__Tick__Group_4__01929);
            rule__Tick__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group_4__1_in_rule__Tick__Group_4__01932);
            rule__Tick__Group_4__1();

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
    // $ANTLR end "rule__Tick__Group_4__0"


    // $ANTLR start "rule__Tick__Group_4__0__Impl"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:967:1: rule__Tick__Group_4__0__Impl : ( '%%' ) ;
    public final void rule__Tick__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:971:1: ( ( '%%' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:972:1: ( '%%' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:972:1: ( '%%' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:973:1: '%%'
            {
             before(grammarAccess.getTickAccess().getPercentSignPercentSignKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__Tick__Group_4__0__Impl1960); 
             after(grammarAccess.getTickAccess().getPercentSignPercentSignKeyword_4_0()); 

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
    // $ANTLR end "rule__Tick__Group_4__0__Impl"


    // $ANTLR start "rule__Tick__Group_4__1"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:986:1: rule__Tick__Group_4__1 : rule__Tick__Group_4__1__Impl rule__Tick__Group_4__2 ;
    public final void rule__Tick__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:990:1: ( rule__Tick__Group_4__1__Impl rule__Tick__Group_4__2 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:991:2: rule__Tick__Group_4__1__Impl rule__Tick__Group_4__2
            {
            pushFollow(FOLLOW_rule__Tick__Group_4__1__Impl_in_rule__Tick__Group_4__11991);
            rule__Tick__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group_4__2_in_rule__Tick__Group_4__11994);
            rule__Tick__Group_4__2();

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
    // $ANTLR end "rule__Tick__Group_4__1"


    // $ANTLR start "rule__Tick__Group_4__1__Impl"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:998:1: rule__Tick__Group_4__1__Impl : ( ( rule__Tick__Alternatives_4_1 ) ) ;
    public final void rule__Tick__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1002:1: ( ( ( rule__Tick__Alternatives_4_1 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1003:1: ( ( rule__Tick__Alternatives_4_1 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1003:1: ( ( rule__Tick__Alternatives_4_1 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1004:1: ( rule__Tick__Alternatives_4_1 )
            {
             before(grammarAccess.getTickAccess().getAlternatives_4_1()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1005:1: ( rule__Tick__Alternatives_4_1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1005:2: rule__Tick__Alternatives_4_1
            {
            pushFollow(FOLLOW_rule__Tick__Alternatives_4_1_in_rule__Tick__Group_4__1__Impl2021);
            rule__Tick__Alternatives_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTickAccess().getAlternatives_4_1()); 

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
    // $ANTLR end "rule__Tick__Group_4__1__Impl"


    // $ANTLR start "rule__Tick__Group_4__2"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1015:1: rule__Tick__Group_4__2 : rule__Tick__Group_4__2__Impl ;
    public final void rule__Tick__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1019:1: ( rule__Tick__Group_4__2__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1020:2: rule__Tick__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Tick__Group_4__2__Impl_in_rule__Tick__Group_4__22051);
            rule__Tick__Group_4__2__Impl();

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
    // $ANTLR end "rule__Tick__Group_4__2"


    // $ANTLR start "rule__Tick__Group_4__2__Impl"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1026:1: rule__Tick__Group_4__2__Impl : ( ( rule__Tick__ExtraInfosOutputAssignment_4_2 )* ) ;
    public final void rule__Tick__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1030:1: ( ( ( rule__Tick__ExtraInfosOutputAssignment_4_2 )* ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1031:1: ( ( rule__Tick__ExtraInfosOutputAssignment_4_2 )* )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1031:1: ( ( rule__Tick__ExtraInfosOutputAssignment_4_2 )* )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1032:1: ( rule__Tick__ExtraInfosOutputAssignment_4_2 )*
            {
             before(grammarAccess.getTickAccess().getExtraInfosOutputAssignment_4_2()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1033:1: ( rule__Tick__ExtraInfosOutputAssignment_4_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1033:2: rule__Tick__ExtraInfosOutputAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__Tick__ExtraInfosOutputAssignment_4_2_in_rule__Tick__Group_4__2__Impl2078);
            	    rule__Tick__ExtraInfosOutputAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTickAccess().getExtraInfosOutputAssignment_4_2()); 

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
    // $ANTLR end "rule__Tick__Group_4__2__Impl"


    // $ANTLR start "rule__Tick__Group_4_1_1__0"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1049:1: rule__Tick__Group_4_1_1__0 : rule__Tick__Group_4_1_1__0__Impl rule__Tick__Group_4_1_1__1 ;
    public final void rule__Tick__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1053:1: ( rule__Tick__Group_4_1_1__0__Impl rule__Tick__Group_4_1_1__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1054:2: rule__Tick__Group_4_1_1__0__Impl rule__Tick__Group_4_1_1__1
            {
            pushFollow(FOLLOW_rule__Tick__Group_4_1_1__0__Impl_in_rule__Tick__Group_4_1_1__02115);
            rule__Tick__Group_4_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group_4_1_1__1_in_rule__Tick__Group_4_1_1__02118);
            rule__Tick__Group_4_1_1__1();

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
    // $ANTLR end "rule__Tick__Group_4_1_1__0"


    // $ANTLR start "rule__Tick__Group_4_1_1__0__Impl"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1061:1: rule__Tick__Group_4_1_1__0__Impl : ( 'Output' ) ;
    public final void rule__Tick__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1065:1: ( ( 'Output' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1066:1: ( 'Output' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1066:1: ( 'Output' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1067:1: 'Output'
            {
             before(grammarAccess.getTickAccess().getOutputKeyword_4_1_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Tick__Group_4_1_1__0__Impl2146); 
             after(grammarAccess.getTickAccess().getOutputKeyword_4_1_1_0()); 

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
    // $ANTLR end "rule__Tick__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__Tick__Group_4_1_1__1"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1080:1: rule__Tick__Group_4_1_1__1 : rule__Tick__Group_4_1_1__1__Impl ;
    public final void rule__Tick__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1084:1: ( rule__Tick__Group_4_1_1__1__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1085:2: rule__Tick__Group_4_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Tick__Group_4_1_1__1__Impl_in_rule__Tick__Group_4_1_1__12177);
            rule__Tick__Group_4_1_1__1__Impl();

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
    // $ANTLR end "rule__Tick__Group_4_1_1__1"


    // $ANTLR start "rule__Tick__Group_4_1_1__1__Impl"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1091:1: rule__Tick__Group_4_1_1__1__Impl : ( ':' ) ;
    public final void rule__Tick__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1095:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1096:1: ( ':' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1096:1: ( ':' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1097:1: ':'
            {
             before(grammarAccess.getTickAccess().getColonKeyword_4_1_1_1()); 
            match(input,17,FOLLOW_17_in_rule__Tick__Group_4_1_1__1__Impl2205); 
             after(grammarAccess.getTickAccess().getColonKeyword_4_1_1_1()); 

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
    // $ANTLR end "rule__Tick__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__Signal__Group__0"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1114:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1118:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1119:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
            {
            pushFollow(FOLLOW_rule__Signal__Group__0__Impl_in_rule__Signal__Group__02240);
            rule__Signal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__02243);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1126:1: rule__Signal__Group__0__Impl : ( ( rule__Signal__NameAssignment_0 ) ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1130:1: ( ( ( rule__Signal__NameAssignment_0 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1131:1: ( ( rule__Signal__NameAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1131:1: ( ( rule__Signal__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1132:1: ( rule__Signal__NameAssignment_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1133:1: ( rule__Signal__NameAssignment_0 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1133:2: rule__Signal__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0__Impl2270);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1143:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1147:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1148:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
            {
            pushFollow(FOLLOW_rule__Signal__Group__1__Impl_in_rule__Signal__Group__12300);
            rule__Signal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__2_in_rule__Signal__Group__12303);
            rule__Signal__Group__2();

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1155:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__ValuedAssignment_1 )? ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1159:1: ( ( ( rule__Signal__ValuedAssignment_1 )? ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1160:1: ( ( rule__Signal__ValuedAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1160:1: ( ( rule__Signal__ValuedAssignment_1 )? )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1161:1: ( rule__Signal__ValuedAssignment_1 )?
            {
             before(grammarAccess.getSignalAccess().getValuedAssignment_1()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1162:1: ( rule__Signal__ValuedAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1162:2: rule__Signal__ValuedAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Signal__ValuedAssignment_1_in_rule__Signal__Group__1__Impl2330);
                    rule__Signal__ValuedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignalAccess().getValuedAssignment_1()); 

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


    // $ANTLR start "rule__Signal__Group__2"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1172:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1176:1: ( rule__Signal__Group__2__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1177:2: rule__Signal__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group__2__Impl_in_rule__Signal__Group__22361);
            rule__Signal__Group__2__Impl();

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
    // $ANTLR end "rule__Signal__Group__2"


    // $ANTLR start "rule__Signal__Group__2__Impl"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1183:1: rule__Signal__Group__2__Impl : ( ( rule__Signal__Group_2__0 )? ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1187:1: ( ( ( rule__Signal__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1188:1: ( ( rule__Signal__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1188:1: ( ( rule__Signal__Group_2__0 )? )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1189:1: ( rule__Signal__Group_2__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1190:1: ( rule__Signal__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_BOOL)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1190:2: rule__Signal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_2__0_in_rule__Signal__Group__2__Impl2388);
                    rule__Signal__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignalAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Signal__Group__2__Impl"


    // $ANTLR start "rule__Signal__Group_2__0"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1206:1: rule__Signal__Group_2__0 : rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 ;
    public final void rule__Signal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1210:1: ( rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1211:2: rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_2__0__Impl_in_rule__Signal__Group_2__02425);
            rule__Signal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_2__1_in_rule__Signal__Group_2__02428);
            rule__Signal__Group_2__1();

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
    // $ANTLR end "rule__Signal__Group_2__0"


    // $ANTLR start "rule__Signal__Group_2__0__Impl"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1218:1: rule__Signal__Group_2__0__Impl : ( ( rule__Signal__ValAssignment_2_0 ) ) ;
    public final void rule__Signal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1222:1: ( ( ( rule__Signal__ValAssignment_2_0 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1223:1: ( ( rule__Signal__ValAssignment_2_0 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1223:1: ( ( rule__Signal__ValAssignment_2_0 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1224:1: ( rule__Signal__ValAssignment_2_0 )
            {
             before(grammarAccess.getSignalAccess().getValAssignment_2_0()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1225:1: ( rule__Signal__ValAssignment_2_0 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1225:2: rule__Signal__ValAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Signal__ValAssignment_2_0_in_rule__Signal__Group_2__0__Impl2455);
            rule__Signal__ValAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getValAssignment_2_0()); 

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
    // $ANTLR end "rule__Signal__Group_2__0__Impl"


    // $ANTLR start "rule__Signal__Group_2__1"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1235:1: rule__Signal__Group_2__1 : rule__Signal__Group_2__1__Impl ;
    public final void rule__Signal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1239:1: ( rule__Signal__Group_2__1__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1240:2: rule__Signal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_2__1__Impl_in_rule__Signal__Group_2__12485);
            rule__Signal__Group_2__1__Impl();

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
    // $ANTLR end "rule__Signal__Group_2__1"


    // $ANTLR start "rule__Signal__Group_2__1__Impl"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1246:1: rule__Signal__Group_2__1__Impl : ( ')' ) ;
    public final void rule__Signal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1250:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1251:1: ( ')' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1251:1: ( ')' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1252:1: ')'
            {
             before(grammarAccess.getSignalAccess().getRightParenthesisKeyword_2_1()); 
            match(input,19,FOLLOW_19_in_rule__Signal__Group_2__1__Impl2513); 
             after(grammarAccess.getSignalAccess().getRightParenthesisKeyword_2_1()); 

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
    // $ANTLR end "rule__Signal__Group_2__1__Impl"


    // $ANTLR start "rule__Kvpair__Group__0"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1269:1: rule__Kvpair__Group__0 : rule__Kvpair__Group__0__Impl rule__Kvpair__Group__1 ;
    public final void rule__Kvpair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1273:1: ( rule__Kvpair__Group__0__Impl rule__Kvpair__Group__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1274:2: rule__Kvpair__Group__0__Impl rule__Kvpair__Group__1
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__0__Impl_in_rule__Kvpair__Group__02548);
            rule__Kvpair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kvpair__Group__1_in_rule__Kvpair__Group__02551);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1281:1: rule__Kvpair__Group__0__Impl : ( () ) ;
    public final void rule__Kvpair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1285:1: ( ( () ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1286:1: ( () )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1286:1: ( () )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1287:1: ()
            {
             before(grammarAccess.getKvpairAccess().getKvpairAction_0()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1288:1: ()
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1290:1: 
            {
            }

             after(grammarAccess.getKvpairAccess().getKvpairAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kvpair__Group__0__Impl"


    // $ANTLR start "rule__Kvpair__Group__1"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1300:1: rule__Kvpair__Group__1 : rule__Kvpair__Group__1__Impl rule__Kvpair__Group__2 ;
    public final void rule__Kvpair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1304:1: ( rule__Kvpair__Group__1__Impl rule__Kvpair__Group__2 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1305:2: rule__Kvpair__Group__1__Impl rule__Kvpair__Group__2
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__1__Impl_in_rule__Kvpair__Group__12609);
            rule__Kvpair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kvpair__Group__2_in_rule__Kvpair__Group__12612);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1312:1: rule__Kvpair__Group__1__Impl : ( '%%' ) ;
    public final void rule__Kvpair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1316:1: ( ( '%%' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1317:1: ( '%%' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1317:1: ( '%%' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1318:1: '%%'
            {
             before(grammarAccess.getKvpairAccess().getPercentSignPercentSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Kvpair__Group__1__Impl2640); 
             after(grammarAccess.getKvpairAccess().getPercentSignPercentSignKeyword_1()); 

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1331:1: rule__Kvpair__Group__2 : rule__Kvpair__Group__2__Impl rule__Kvpair__Group__3 ;
    public final void rule__Kvpair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1335:1: ( rule__Kvpair__Group__2__Impl rule__Kvpair__Group__3 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1336:2: rule__Kvpair__Group__2__Impl rule__Kvpair__Group__3
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__2__Impl_in_rule__Kvpair__Group__22671);
            rule__Kvpair__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kvpair__Group__3_in_rule__Kvpair__Group__22674);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1343:1: rule__Kvpair__Group__2__Impl : ( ( rule__Kvpair__KeyAssignment_2 ) ) ;
    public final void rule__Kvpair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1347:1: ( ( ( rule__Kvpair__KeyAssignment_2 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1348:1: ( ( rule__Kvpair__KeyAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1348:1: ( ( rule__Kvpair__KeyAssignment_2 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1349:1: ( rule__Kvpair__KeyAssignment_2 )
            {
             before(grammarAccess.getKvpairAccess().getKeyAssignment_2()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1350:1: ( rule__Kvpair__KeyAssignment_2 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1350:2: rule__Kvpair__KeyAssignment_2
            {
            pushFollow(FOLLOW_rule__Kvpair__KeyAssignment_2_in_rule__Kvpair__Group__2__Impl2701);
            rule__Kvpair__KeyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKvpairAccess().getKeyAssignment_2()); 

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1360:1: rule__Kvpair__Group__3 : rule__Kvpair__Group__3__Impl rule__Kvpair__Group__4 ;
    public final void rule__Kvpair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1364:1: ( rule__Kvpair__Group__3__Impl rule__Kvpair__Group__4 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1365:2: rule__Kvpair__Group__3__Impl rule__Kvpair__Group__4
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__3__Impl_in_rule__Kvpair__Group__32731);
            rule__Kvpair__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kvpair__Group__4_in_rule__Kvpair__Group__32734);
            rule__Kvpair__Group__4();

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1372:1: rule__Kvpair__Group__3__Impl : ( '=' ) ;
    public final void rule__Kvpair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1376:1: ( ( '=' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1377:1: ( '=' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1377:1: ( '=' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1378:1: '='
            {
             before(grammarAccess.getKvpairAccess().getEqualsSignKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Kvpair__Group__3__Impl2762); 
             after(grammarAccess.getKvpairAccess().getEqualsSignKeyword_3()); 

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


    // $ANTLR start "rule__Kvpair__Group__4"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1391:1: rule__Kvpair__Group__4 : rule__Kvpair__Group__4__Impl ;
    public final void rule__Kvpair__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1395:1: ( rule__Kvpair__Group__4__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1396:2: rule__Kvpair__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__4__Impl_in_rule__Kvpair__Group__42793);
            rule__Kvpair__Group__4__Impl();

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
    // $ANTLR end "rule__Kvpair__Group__4"


    // $ANTLR start "rule__Kvpair__Group__4__Impl"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1402:1: rule__Kvpair__Group__4__Impl : ( ( rule__Kvpair__ValueAssignment_4 ) ) ;
    public final void rule__Kvpair__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1406:1: ( ( ( rule__Kvpair__ValueAssignment_4 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1407:1: ( ( rule__Kvpair__ValueAssignment_4 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1407:1: ( ( rule__Kvpair__ValueAssignment_4 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1408:1: ( rule__Kvpair__ValueAssignment_4 )
            {
             before(grammarAccess.getKvpairAccess().getValueAssignment_4()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1409:1: ( rule__Kvpair__ValueAssignment_4 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1409:2: rule__Kvpair__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__Kvpair__ValueAssignment_4_in_rule__Kvpair__Group__4__Impl2820);
            rule__Kvpair__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getKvpairAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__Kvpair__Group__4__Impl"


    // $ANTLR start "rule__Tracelist__TracesAssignment"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1430:1: rule__Tracelist__TracesAssignment : ( ruletrace ) ;
    public final void rule__Tracelist__TracesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1434:1: ( ( ruletrace ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1435:1: ( ruletrace )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1435:1: ( ruletrace )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1436:1: ruletrace
            {
             before(grammarAccess.getTracelistAccess().getTracesTraceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruletrace_in_rule__Tracelist__TracesAssignment2865);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1445:1: rule__Trace__TicksAssignment_3 : ( ruletick ) ;
    public final void rule__Trace__TicksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1449:1: ( ( ruletick ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1450:1: ( ruletick )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1450:1: ( ruletick )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1451:1: ruletick
            {
             before(grammarAccess.getTraceAccess().getTicksTickParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruletick_in_rule__Trace__TicksAssignment_32896);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1460:1: rule__Tick__InputAssignment_1 : ( rulesignal ) ;
    public final void rule__Tick__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1464:1: ( ( rulesignal ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1465:1: ( rulesignal )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1465:1: ( rulesignal )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1466:1: rulesignal
            {
             before(grammarAccess.getTickAccess().getInputSignalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulesignal_in_rule__Tick__InputAssignment_12927);
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


    // $ANTLR start "rule__Tick__OutputAssignment_2_2"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1475:1: rule__Tick__OutputAssignment_2_2 : ( rulesignal ) ;
    public final void rule__Tick__OutputAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1479:1: ( ( rulesignal ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1480:1: ( rulesignal )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1480:1: ( rulesignal )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1481:1: rulesignal
            {
             before(grammarAccess.getTickAccess().getOutputSignalParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_rulesignal_in_rule__Tick__OutputAssignment_2_22958);
            rulesignal();

            state._fsp--;

             after(grammarAccess.getTickAccess().getOutputSignalParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Tick__OutputAssignment_2_2"


    // $ANTLR start "rule__Tick__ExtraInfosAssignment_3"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1490:1: rule__Tick__ExtraInfosAssignment_3 : ( rulekvpair ) ;
    public final void rule__Tick__ExtraInfosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1494:1: ( ( rulekvpair ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1495:1: ( rulekvpair )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1495:1: ( rulekvpair )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1496:1: rulekvpair
            {
             before(grammarAccess.getTickAccess().getExtraInfosKvpairParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulekvpair_in_rule__Tick__ExtraInfosAssignment_32989);
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


    // $ANTLR start "rule__Tick__ExtraInfosOutputAssignment_4_2"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1505:1: rule__Tick__ExtraInfosOutputAssignment_4_2 : ( rulekvpair ) ;
    public final void rule__Tick__ExtraInfosOutputAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1509:1: ( ( rulekvpair ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1510:1: ( rulekvpair )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1510:1: ( rulekvpair )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1511:1: rulekvpair
            {
             before(grammarAccess.getTickAccess().getExtraInfosOutputKvpairParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_rulekvpair_in_rule__Tick__ExtraInfosOutputAssignment_4_23020);
            rulekvpair();

            state._fsp--;

             after(grammarAccess.getTickAccess().getExtraInfosOutputKvpairParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Tick__ExtraInfosOutputAssignment_4_2"


    // $ANTLR start "rule__Signal__NameAssignment_0"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1520:1: rule__Signal__NameAssignment_0 : ( RULE_ALPHANUMSPECIAL ) ;
    public final void rule__Signal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1524:1: ( ( RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1525:1: ( RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1525:1: ( RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1526:1: RULE_ALPHANUMSPECIAL
            {
             before(grammarAccess.getSignalAccess().getNameALPHANUMSPECIALTerminalRuleCall_0_0()); 
            match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__Signal__NameAssignment_03051); 
             after(grammarAccess.getSignalAccess().getNameALPHANUMSPECIALTerminalRuleCall_0_0()); 

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


    // $ANTLR start "rule__Signal__ValuedAssignment_1"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1535:1: rule__Signal__ValuedAssignment_1 : ( ( '(' ) ) ;
    public final void rule__Signal__ValuedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1539:1: ( ( ( '(' ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1540:1: ( ( '(' ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1540:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1541:1: ( '(' )
            {
             before(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1542:1: ( '(' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1543:1: '('
            {
             before(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Signal__ValuedAssignment_13087); 
             after(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0()); 

            }

             after(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Signal__ValuedAssignment_1"


    // $ANTLR start "rule__Signal__ValAssignment_2_0"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1558:1: rule__Signal__ValAssignment_2_0 : ( ( rule__Signal__ValAlternatives_2_0_0 ) ) ;
    public final void rule__Signal__ValAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1562:1: ( ( ( rule__Signal__ValAlternatives_2_0_0 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1563:1: ( ( rule__Signal__ValAlternatives_2_0_0 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1563:1: ( ( rule__Signal__ValAlternatives_2_0_0 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1564:1: ( rule__Signal__ValAlternatives_2_0_0 )
            {
             before(grammarAccess.getSignalAccess().getValAlternatives_2_0_0()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1565:1: ( rule__Signal__ValAlternatives_2_0_0 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1565:2: rule__Signal__ValAlternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__Signal__ValAlternatives_2_0_0_in_rule__Signal__ValAssignment_2_03126);
            rule__Signal__ValAlternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getValAlternatives_2_0_0()); 

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
    // $ANTLR end "rule__Signal__ValAssignment_2_0"


    // $ANTLR start "rule__Kvpair__KeyAssignment_2"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1574:1: rule__Kvpair__KeyAssignment_2 : ( RULE_ALPHANUMSPECIAL ) ;
    public final void rule__Kvpair__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1578:1: ( ( RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1579:1: ( RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1579:1: ( RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1580:1: RULE_ALPHANUMSPECIAL
            {
             before(grammarAccess.getKvpairAccess().getKeyALPHANUMSPECIALTerminalRuleCall_2_0()); 
            match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__Kvpair__KeyAssignment_23159); 
             after(grammarAccess.getKvpairAccess().getKeyALPHANUMSPECIALTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Kvpair__KeyAssignment_2"


    // $ANTLR start "rule__Kvpair__ValueAssignment_4"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1589:1: rule__Kvpair__ValueAssignment_4 : ( ( rule__Kvpair__ValueAlternatives_4_0 ) ) ;
    public final void rule__Kvpair__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1593:1: ( ( ( rule__Kvpair__ValueAlternatives_4_0 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1594:1: ( ( rule__Kvpair__ValueAlternatives_4_0 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1594:1: ( ( rule__Kvpair__ValueAlternatives_4_0 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1595:1: ( rule__Kvpair__ValueAlternatives_4_0 )
            {
             before(grammarAccess.getKvpairAccess().getValueAlternatives_4_0()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1596:1: ( rule__Kvpair__ValueAlternatives_4_0 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1596:2: rule__Kvpair__ValueAlternatives_4_0
            {
            pushFollow(FOLLOW_rule__Kvpair__ValueAlternatives_4_0_in_rule__Kvpair__ValueAssignment_43190);
            rule__Kvpair__ValueAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getKvpairAccess().getValueAlternatives_4_0()); 

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
    // $ANTLR end "rule__Kvpair__ValueAssignment_4"


    // $ANTLR start "rule__EsoInt__ValueAssignment"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1605:1: rule__EsoInt__ValueAssignment : ( RULE_INT ) ;
    public final void rule__EsoInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1609:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1610:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1610:1: ( RULE_INT )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1611:1: RULE_INT
            {
             before(grammarAccess.getEsoIntAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EsoInt__ValueAssignment3223); 
             after(grammarAccess.getEsoIntAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EsoInt__ValueAssignment"


    // $ANTLR start "rule__EsoString__ValueAssignment"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1620:1: rule__EsoString__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__EsoString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1624:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1625:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1625:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1626:1: RULE_STRING
            {
             before(grammarAccess.getEsoStringAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EsoString__ValueAssignment3254); 
             after(grammarAccess.getEsoStringAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EsoString__ValueAssignment"


    // $ANTLR start "rule__EsoFloat__ValueAssignment"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1635:1: rule__EsoFloat__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__EsoFloat__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1639:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1640:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1640:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1641:1: RULE_FLOAT
            {
             before(grammarAccess.getEsoFloatAccess().getValueFLOATTerminalRuleCall_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__EsoFloat__ValueAssignment3285); 
             after(grammarAccess.getEsoFloatAccess().getValueFLOATTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EsoFloat__ValueAssignment"


    // $ANTLR start "rule__EsoBool__ValueAssignment"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1650:1: rule__EsoBool__ValueAssignment : ( RULE_BOOL ) ;
    public final void rule__EsoBool__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1654:1: ( ( RULE_BOOL ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1655:1: ( RULE_BOOL )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1655:1: ( RULE_BOOL )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1656:1: RULE_BOOL
            {
             before(grammarAccess.getEsoBoolAccess().getValueBOOLTerminalRuleCall_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__EsoBool__ValueAssignment3316); 
             after(grammarAccess.getEsoBoolAccess().getValueBOOLTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EsoBool__ValueAssignment"


    // $ANTLR start "rule__EsoJson__ValueAssignment"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1665:1: rule__EsoJson__ValueAssignment : ( RULE_ALPHANUMSPECIAL ) ;
    public final void rule__EsoJson__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1669:1: ( ( RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1670:1: ( RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1670:1: ( RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1671:1: RULE_ALPHANUMSPECIAL
            {
             before(grammarAccess.getEsoJsonAccess().getValueALPHANUMSPECIALTerminalRuleCall_0()); 
            match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__EsoJson__ValueAssignment3347); 
             after(grammarAccess.getEsoJsonAccess().getValueALPHANUMSPECIALTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EsoJson__ValueAssignment"

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
    public static final BitSet FOLLOW_rulekvpair_in_entryRulekvpair318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulekvpair325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__0_in_rulekvpair351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoInt_in_entryRuleEsoInt378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoInt385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EsoInt__ValueAssignment_in_ruleEsoInt411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoString_in_entryRuleEsoString438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoString445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EsoString__ValueAssignment_in_ruleEsoString471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_entryRuleEsoFloat498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoFloat505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EsoFloat__ValueAssignment_in_ruleEsoFloat531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoBool_in_entryRuleEsoBool558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoBool565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EsoBool__ValueAssignment_in_ruleEsoBool591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoJson_in_entryRuleEsoJson618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEsoJson625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EsoJson__ValueAssignment_in_ruleEsoJson651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Tick__Alternatives_2_1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2_1_1__0_in_rule__Tick__Alternatives_2_1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Tick__Alternatives_4_1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_4_1_1__0_in_rule__Tick__Alternatives_4_1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoInt_in_rule__Signal__ValAlternatives_2_0_0793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_rule__Signal__ValAlternatives_2_0_0810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoBool_in_rule__Signal__ValAlternatives_2_0_0827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoString_in_rule__Signal__ValAlternatives_2_0_0844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoJson_in_rule__Kvpair__ValueAlternatives_4_0876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoString_in_rule__Kvpair__ValueAlternatives_4_0893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_rule__Kvpair__ValueAlternatives_4_0910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoBool_in_rule__Kvpair__ValueAlternatives_4_0927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoInt_in_rule__Kvpair__ValueAlternatives_4_0944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__0__Impl_in_rule__Trace__Group__0974 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__0977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Trace__Group__0__Impl1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__1__Impl_in_rule__Trace__Group__11036 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__11039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Trace__Group__1__Impl1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__2__Impl_in_rule__Trace__Group__21098 = new BitSet(new long[]{0x000000000004C010L});
    public static final BitSet FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__21101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Trace__Group__2__Impl1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__3__Impl_in_rule__Trace__Group__31160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__TicksAssignment_3_in_rule__Trace__Group__3__Impl1189 = new BitSet(new long[]{0x000000000004C012L});
    public static final BitSet FOLLOW_rule__Trace__TicksAssignment_3_in_rule__Trace__Group__3__Impl1201 = new BitSet(new long[]{0x000000000004C012L});
    public static final BitSet FOLLOW_rule__Tick__Group__0__Impl_in_rule__Tick__Group__01242 = new BitSet(new long[]{0x000000000004C010L});
    public static final BitSet FOLLOW_rule__Tick__Group__1_in_rule__Tick__Group__01245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__1__Impl_in_rule__Tick__Group__11303 = new BitSet(new long[]{0x000000000004C010L});
    public static final BitSet FOLLOW_rule__Tick__Group__2_in_rule__Tick__Group__11306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__InputAssignment_1_in_rule__Tick__Group__1__Impl1333 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Tick__Group__2__Impl_in_rule__Tick__Group__21364 = new BitSet(new long[]{0x000000000004C010L});
    public static final BitSet FOLLOW_rule__Tick__Group__3_in_rule__Tick__Group__21367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__0_in_rule__Tick__Group__2__Impl1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__3__Impl_in_rule__Tick__Group__31425 = new BitSet(new long[]{0x000000000004C010L});
    public static final BitSet FOLLOW_rule__Tick__Group__4_in_rule__Tick__Group__31428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__ExtraInfosAssignment_3_in_rule__Tick__Group__3__Impl1455 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Tick__Group__4__Impl_in_rule__Tick__Group__41486 = new BitSet(new long[]{0x000000000004C010L});
    public static final BitSet FOLLOW_rule__Tick__Group__5_in_rule__Tick__Group__41489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_4__0_in_rule__Tick__Group__4__Impl1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__5__Impl_in_rule__Tick__Group__51547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Tick__Group__5__Impl1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__0__Impl_in_rule__Tick__Group_2__01618 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__1_in_rule__Tick__Group_2__01621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Tick__Group_2__0__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__1__Impl_in_rule__Tick__Group_2__11680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__2_in_rule__Tick__Group_2__11683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Alternatives_2_1_in_rule__Tick__Group_2__1__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__2__Impl_in_rule__Tick__Group_2__21740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__OutputAssignment_2_2_in_rule__Tick__Group_2__2__Impl1767 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Tick__Group_2_1_1__0__Impl_in_rule__Tick__Group_2_1_1__01804 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Tick__Group_2_1_1__1_in_rule__Tick__Group_2_1_1__01807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Tick__Group_2_1_1__0__Impl1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2_1_1__1__Impl_in_rule__Tick__Group_2_1_1__11866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Tick__Group_2_1_1__1__Impl1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_4__0__Impl_in_rule__Tick__Group_4__01929 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_rule__Tick__Group_4__1_in_rule__Tick__Group_4__01932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Tick__Group_4__0__Impl1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_4__1__Impl_in_rule__Tick__Group_4__11991 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Tick__Group_4__2_in_rule__Tick__Group_4__11994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Alternatives_4_1_in_rule__Tick__Group_4__1__Impl2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_4__2__Impl_in_rule__Tick__Group_4__22051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__ExtraInfosOutputAssignment_4_2_in_rule__Tick__Group_4__2__Impl2078 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Tick__Group_4_1_1__0__Impl_in_rule__Tick__Group_4_1_1__02115 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Tick__Group_4_1_1__1_in_rule__Tick__Group_4_1_1__02118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Tick__Group_4_1_1__0__Impl2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_4_1_1__1__Impl_in_rule__Tick__Group_4_1_1__12177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Tick__Group_4_1_1__1__Impl2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__0__Impl_in_rule__Signal__Group__02240 = new BitSet(new long[]{0x00000000002001E0L});
    public static final BitSet FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__02243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0__Impl2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__1__Impl_in_rule__Signal__Group__12300 = new BitSet(new long[]{0x00000000002001E0L});
    public static final BitSet FOLLOW_rule__Signal__Group__2_in_rule__Signal__Group__12303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__ValuedAssignment_1_in_rule__Signal__Group__1__Impl2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__2__Impl_in_rule__Signal__Group__22361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__0_in_rule__Signal__Group__2__Impl2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__0__Impl_in_rule__Signal__Group_2__02425 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__1_in_rule__Signal__Group_2__02428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__ValAssignment_2_0_in_rule__Signal__Group_2__0__Impl2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__1__Impl_in_rule__Signal__Group_2__12485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Signal__Group_2__1__Impl2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__0__Impl_in_rule__Kvpair__Group__02548 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__1_in_rule__Kvpair__Group__02551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__1__Impl_in_rule__Kvpair__Group__12609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__2_in_rule__Kvpair__Group__12612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Kvpair__Group__1__Impl2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__2__Impl_in_rule__Kvpair__Group__22671 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__3_in_rule__Kvpair__Group__22674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__KeyAssignment_2_in_rule__Kvpair__Group__2__Impl2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__3__Impl_in_rule__Kvpair__Group__32731 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__4_in_rule__Kvpair__Group__32734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Kvpair__Group__3__Impl2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__4__Impl_in_rule__Kvpair__Group__42793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__ValueAssignment_4_in_rule__Kvpair__Group__4__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletrace_in_rule__Tracelist__TracesAssignment2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletick_in_rule__Trace__TicksAssignment_32896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_rule__Tick__InputAssignment_12927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_rule__Tick__OutputAssignment_2_22958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekvpair_in_rule__Tick__ExtraInfosAssignment_32989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekvpair_in_rule__Tick__ExtraInfosOutputAssignment_4_23020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__Signal__NameAssignment_03051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Signal__ValuedAssignment_13087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__ValAlternatives_2_0_0_in_rule__Signal__ValAssignment_2_03126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__Kvpair__KeyAssignment_23159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__ValueAlternatives_4_0_in_rule__Kvpair__ValueAssignment_43190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EsoInt__ValueAssignment3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EsoString__ValueAssignment3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__EsoFloat__ValueAssignment3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__EsoBool__ValueAssignment3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__EsoJson__ValueAssignment3347 = new BitSet(new long[]{0x0000000000000002L});

}