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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ALPHANUMSPECIAL", "RULE_INT", "RULE_STRING", "RULE_FLOAT", "RULE_BOOL", "RULE_SPECIAL", "RULE_WS", "'!'", "'reset'", "';'", "'%'", "'Output'", "':'", "')'", "'%%'", "'('"
    };
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
    public static final int T__13=13;
    public static final int RULE_SPECIAL=9;
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

                if ( (LA1_0==11) ) {
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


    // $ANTLR start "rule__Signal__ValAlternatives_2_0_0"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:347:1: rule__Signal__ValAlternatives_2_0_0 : ( ( ruleEsoInt ) | ( ruleEsoFloat ) | ( ruleEsoBool ) | ( ruleEsoString ) );
    public final void rule__Signal__ValAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:351:1: ( ( ruleEsoInt ) | ( ruleEsoFloat ) | ( ruleEsoBool ) | ( ruleEsoString ) )
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
            case RULE_BOOL:
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
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:352:1: ( ruleEsoInt )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:352:1: ( ruleEsoInt )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:353:1: ruleEsoInt
                    {
                     before(grammarAccess.getSignalAccess().getValEsoIntParserRuleCall_2_0_0_0()); 
                    pushFollow(FOLLOW_ruleEsoInt_in_rule__Signal__ValAlternatives_2_0_0687);
                    ruleEsoInt();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getValEsoIntParserRuleCall_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:358:6: ( ruleEsoFloat )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:358:6: ( ruleEsoFloat )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:359:1: ruleEsoFloat
                    {
                     before(grammarAccess.getSignalAccess().getValEsoFloatParserRuleCall_2_0_0_1()); 
                    pushFollow(FOLLOW_ruleEsoFloat_in_rule__Signal__ValAlternatives_2_0_0704);
                    ruleEsoFloat();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getValEsoFloatParserRuleCall_2_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:364:6: ( ruleEsoBool )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:364:6: ( ruleEsoBool )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:365:1: ruleEsoBool
                    {
                     before(grammarAccess.getSignalAccess().getValEsoBoolParserRuleCall_2_0_0_2()); 
                    pushFollow(FOLLOW_ruleEsoBool_in_rule__Signal__ValAlternatives_2_0_0721);
                    ruleEsoBool();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getValEsoBoolParserRuleCall_2_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:370:6: ( ruleEsoString )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:370:6: ( ruleEsoString )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:371:1: ruleEsoString
                    {
                     before(grammarAccess.getSignalAccess().getValEsoStringParserRuleCall_2_0_0_3()); 
                    pushFollow(FOLLOW_ruleEsoString_in_rule__Signal__ValAlternatives_2_0_0738);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:381:1: rule__Kvpair__ValueAlternatives_4_0 : ( ( ruleEsoJson ) | ( ruleEsoString ) | ( ruleEsoFloat ) | ( ruleEsoBool ) | ( ruleEsoInt ) );
    public final void rule__Kvpair__ValueAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:385:1: ( ( ruleEsoJson ) | ( ruleEsoString ) | ( ruleEsoFloat ) | ( ruleEsoBool ) | ( ruleEsoInt ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case RULE_ALPHANUMSPECIAL:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt3=3;
                }
                break;
            case RULE_BOOL:
                {
                alt3=4;
                }
                break;
            case RULE_INT:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:386:1: ( ruleEsoJson )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:386:1: ( ruleEsoJson )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:387:1: ruleEsoJson
                    {
                     before(grammarAccess.getKvpairAccess().getValueEsoJsonParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_ruleEsoJson_in_rule__Kvpair__ValueAlternatives_4_0770);
                    ruleEsoJson();

                    state._fsp--;

                     after(grammarAccess.getKvpairAccess().getValueEsoJsonParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:392:6: ( ruleEsoString )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:392:6: ( ruleEsoString )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:393:1: ruleEsoString
                    {
                     before(grammarAccess.getKvpairAccess().getValueEsoStringParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_ruleEsoString_in_rule__Kvpair__ValueAlternatives_4_0787);
                    ruleEsoString();

                    state._fsp--;

                     after(grammarAccess.getKvpairAccess().getValueEsoStringParserRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:398:6: ( ruleEsoFloat )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:398:6: ( ruleEsoFloat )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:399:1: ruleEsoFloat
                    {
                     before(grammarAccess.getKvpairAccess().getValueEsoFloatParserRuleCall_4_0_2()); 
                    pushFollow(FOLLOW_ruleEsoFloat_in_rule__Kvpair__ValueAlternatives_4_0804);
                    ruleEsoFloat();

                    state._fsp--;

                     after(grammarAccess.getKvpairAccess().getValueEsoFloatParserRuleCall_4_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:404:6: ( ruleEsoBool )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:404:6: ( ruleEsoBool )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:405:1: ruleEsoBool
                    {
                     before(grammarAccess.getKvpairAccess().getValueEsoBoolParserRuleCall_4_0_3()); 
                    pushFollow(FOLLOW_ruleEsoBool_in_rule__Kvpair__ValueAlternatives_4_0821);
                    ruleEsoBool();

                    state._fsp--;

                     after(grammarAccess.getKvpairAccess().getValueEsoBoolParserRuleCall_4_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:410:6: ( ruleEsoInt )
                    {
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:410:6: ( ruleEsoInt )
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:411:1: ruleEsoInt
                    {
                     before(grammarAccess.getKvpairAccess().getValueEsoIntParserRuleCall_4_0_4()); 
                    pushFollow(FOLLOW_ruleEsoInt_in_rule__Kvpair__ValueAlternatives_4_0838);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:423:1: rule__Trace__Group__0 : rule__Trace__Group__0__Impl rule__Trace__Group__1 ;
    public final void rule__Trace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:427:1: ( rule__Trace__Group__0__Impl rule__Trace__Group__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:428:2: rule__Trace__Group__0__Impl rule__Trace__Group__1
            {
            pushFollow(FOLLOW_rule__Trace__Group__0__Impl_in_rule__Trace__Group__0868);
            rule__Trace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__0871);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:435:1: rule__Trace__Group__0__Impl : ( '!' ) ;
    public final void rule__Trace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:439:1: ( ( '!' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:440:1: ( '!' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:440:1: ( '!' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:441:1: '!'
            {
             before(grammarAccess.getTraceAccess().getExclamationMarkKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Trace__Group__0__Impl899); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:454:1: rule__Trace__Group__1 : rule__Trace__Group__1__Impl rule__Trace__Group__2 ;
    public final void rule__Trace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:458:1: ( rule__Trace__Group__1__Impl rule__Trace__Group__2 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:459:2: rule__Trace__Group__1__Impl rule__Trace__Group__2
            {
            pushFollow(FOLLOW_rule__Trace__Group__1__Impl_in_rule__Trace__Group__1930);
            rule__Trace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__1933);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:466:1: rule__Trace__Group__1__Impl : ( 'reset' ) ;
    public final void rule__Trace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:470:1: ( ( 'reset' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:471:1: ( 'reset' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:471:1: ( 'reset' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:472:1: 'reset'
            {
             before(grammarAccess.getTraceAccess().getResetKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Trace__Group__1__Impl961); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:485:1: rule__Trace__Group__2 : rule__Trace__Group__2__Impl rule__Trace__Group__3 ;
    public final void rule__Trace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:489:1: ( rule__Trace__Group__2__Impl rule__Trace__Group__3 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:490:2: rule__Trace__Group__2__Impl rule__Trace__Group__3
            {
            pushFollow(FOLLOW_rule__Trace__Group__2__Impl_in_rule__Trace__Group__2992);
            rule__Trace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__2995);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:497:1: rule__Trace__Group__2__Impl : ( ';' ) ;
    public final void rule__Trace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:501:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:502:1: ( ';' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:502:1: ( ';' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:503:1: ';'
            {
             before(grammarAccess.getTraceAccess().getSemicolonKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Trace__Group__2__Impl1023); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:516:1: rule__Trace__Group__3 : rule__Trace__Group__3__Impl ;
    public final void rule__Trace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:520:1: ( rule__Trace__Group__3__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:521:2: rule__Trace__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Trace__Group__3__Impl_in_rule__Trace__Group__31054);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:527:1: rule__Trace__Group__3__Impl : ( ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* ) ) ;
    public final void rule__Trace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:531:1: ( ( ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:532:1: ( ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:532:1: ( ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:533:1: ( ( rule__Trace__TicksAssignment_3 ) ) ( ( rule__Trace__TicksAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:533:1: ( ( rule__Trace__TicksAssignment_3 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:534:1: ( rule__Trace__TicksAssignment_3 )
            {
             before(grammarAccess.getTraceAccess().getTicksAssignment_3()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:535:1: ( rule__Trace__TicksAssignment_3 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:535:2: rule__Trace__TicksAssignment_3
            {
            pushFollow(FOLLOW_rule__Trace__TicksAssignment_3_in_rule__Trace__Group__3__Impl1083);
            rule__Trace__TicksAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getTicksAssignment_3()); 

            }

            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:538:1: ( ( rule__Trace__TicksAssignment_3 )* )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:539:1: ( rule__Trace__TicksAssignment_3 )*
            {
             before(grammarAccess.getTraceAccess().getTicksAssignment_3()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:540:1: ( rule__Trace__TicksAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ALPHANUMSPECIAL||(LA4_0>=13 && LA4_0<=14)||LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:540:2: rule__Trace__TicksAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Trace__TicksAssignment_3_in_rule__Trace__Group__3__Impl1095);
            	    rule__Trace__TicksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:559:1: rule__Tick__Group__0 : rule__Tick__Group__0__Impl rule__Tick__Group__1 ;
    public final void rule__Tick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:563:1: ( rule__Tick__Group__0__Impl rule__Tick__Group__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:564:2: rule__Tick__Group__0__Impl rule__Tick__Group__1
            {
            pushFollow(FOLLOW_rule__Tick__Group__0__Impl_in_rule__Tick__Group__01136);
            rule__Tick__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__1_in_rule__Tick__Group__01139);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:571:1: rule__Tick__Group__0__Impl : ( () ) ;
    public final void rule__Tick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:575:1: ( ( () ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:576:1: ( () )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:576:1: ( () )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:577:1: ()
            {
             before(grammarAccess.getTickAccess().getTickAction_0()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:578:1: ()
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:580:1: 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:590:1: rule__Tick__Group__1 : rule__Tick__Group__1__Impl rule__Tick__Group__2 ;
    public final void rule__Tick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:594:1: ( rule__Tick__Group__1__Impl rule__Tick__Group__2 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:595:2: rule__Tick__Group__1__Impl rule__Tick__Group__2
            {
            pushFollow(FOLLOW_rule__Tick__Group__1__Impl_in_rule__Tick__Group__11197);
            rule__Tick__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__2_in_rule__Tick__Group__11200);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:602:1: rule__Tick__Group__1__Impl : ( ( rule__Tick__InputAssignment_1 )* ) ;
    public final void rule__Tick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:606:1: ( ( ( rule__Tick__InputAssignment_1 )* ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:607:1: ( ( rule__Tick__InputAssignment_1 )* )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:607:1: ( ( rule__Tick__InputAssignment_1 )* )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:608:1: ( rule__Tick__InputAssignment_1 )*
            {
             before(grammarAccess.getTickAccess().getInputAssignment_1()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:609:1: ( rule__Tick__InputAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ALPHANUMSPECIAL) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:609:2: rule__Tick__InputAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Tick__InputAssignment_1_in_rule__Tick__Group__1__Impl1227);
            	    rule__Tick__InputAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:619:1: rule__Tick__Group__2 : rule__Tick__Group__2__Impl rule__Tick__Group__3 ;
    public final void rule__Tick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:623:1: ( rule__Tick__Group__2__Impl rule__Tick__Group__3 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:624:2: rule__Tick__Group__2__Impl rule__Tick__Group__3
            {
            pushFollow(FOLLOW_rule__Tick__Group__2__Impl_in_rule__Tick__Group__21258);
            rule__Tick__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__3_in_rule__Tick__Group__21261);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:631:1: rule__Tick__Group__2__Impl : ( ( rule__Tick__Group_2__0 )? ) ;
    public final void rule__Tick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:635:1: ( ( ( rule__Tick__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:636:1: ( ( rule__Tick__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:636:1: ( ( rule__Tick__Group_2__0 )? )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:637:1: ( rule__Tick__Group_2__0 )?
            {
             before(grammarAccess.getTickAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:638:1: ( rule__Tick__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:638:2: rule__Tick__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Tick__Group_2__0_in_rule__Tick__Group__2__Impl1288);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:648:1: rule__Tick__Group__3 : rule__Tick__Group__3__Impl rule__Tick__Group__4 ;
    public final void rule__Tick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:652:1: ( rule__Tick__Group__3__Impl rule__Tick__Group__4 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:653:2: rule__Tick__Group__3__Impl rule__Tick__Group__4
            {
            pushFollow(FOLLOW_rule__Tick__Group__3__Impl_in_rule__Tick__Group__31319);
            rule__Tick__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__4_in_rule__Tick__Group__31322);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:660:1: rule__Tick__Group__3__Impl : ( ( rule__Tick__ExtraInfosAssignment_3 )* ) ;
    public final void rule__Tick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:664:1: ( ( ( rule__Tick__ExtraInfosAssignment_3 )* ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:665:1: ( ( rule__Tick__ExtraInfosAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:665:1: ( ( rule__Tick__ExtraInfosAssignment_3 )* )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:666:1: ( rule__Tick__ExtraInfosAssignment_3 )*
            {
             before(grammarAccess.getTickAccess().getExtraInfosAssignment_3()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:667:1: ( rule__Tick__ExtraInfosAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:667:2: rule__Tick__ExtraInfosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Tick__ExtraInfosAssignment_3_in_rule__Tick__Group__3__Impl1349);
            	    rule__Tick__ExtraInfosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:677:1: rule__Tick__Group__4 : rule__Tick__Group__4__Impl ;
    public final void rule__Tick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:681:1: ( rule__Tick__Group__4__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:682:2: rule__Tick__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Tick__Group__4__Impl_in_rule__Tick__Group__41380);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:688:1: rule__Tick__Group__4__Impl : ( ';' ) ;
    public final void rule__Tick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:692:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:693:1: ( ';' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:693:1: ( ';' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:694:1: ';'
            {
             before(grammarAccess.getTickAccess().getSemicolonKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Tick__Group__4__Impl1408); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:717:1: rule__Tick__Group_2__0 : rule__Tick__Group_2__0__Impl rule__Tick__Group_2__1 ;
    public final void rule__Tick__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:721:1: ( rule__Tick__Group_2__0__Impl rule__Tick__Group_2__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:722:2: rule__Tick__Group_2__0__Impl rule__Tick__Group_2__1
            {
            pushFollow(FOLLOW_rule__Tick__Group_2__0__Impl_in_rule__Tick__Group_2__01449);
            rule__Tick__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group_2__1_in_rule__Tick__Group_2__01452);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:729:1: rule__Tick__Group_2__0__Impl : ( '%' ) ;
    public final void rule__Tick__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:733:1: ( ( '%' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:734:1: ( '%' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:734:1: ( '%' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:735:1: '%'
            {
             before(grammarAccess.getTickAccess().getPercentSignKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Tick__Group_2__0__Impl1480); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:748:1: rule__Tick__Group_2__1 : rule__Tick__Group_2__1__Impl rule__Tick__Group_2__2 ;
    public final void rule__Tick__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:752:1: ( rule__Tick__Group_2__1__Impl rule__Tick__Group_2__2 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:753:2: rule__Tick__Group_2__1__Impl rule__Tick__Group_2__2
            {
            pushFollow(FOLLOW_rule__Tick__Group_2__1__Impl_in_rule__Tick__Group_2__11511);
            rule__Tick__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group_2__2_in_rule__Tick__Group_2__11514);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:760:1: rule__Tick__Group_2__1__Impl : ( 'Output' ) ;
    public final void rule__Tick__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:764:1: ( ( 'Output' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:765:1: ( 'Output' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:765:1: ( 'Output' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:766:1: 'Output'
            {
             before(grammarAccess.getTickAccess().getOutputKeyword_2_1()); 
            match(input,15,FOLLOW_15_in_rule__Tick__Group_2__1__Impl1542); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:779:1: rule__Tick__Group_2__2 : rule__Tick__Group_2__2__Impl rule__Tick__Group_2__3 ;
    public final void rule__Tick__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:783:1: ( rule__Tick__Group_2__2__Impl rule__Tick__Group_2__3 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:784:2: rule__Tick__Group_2__2__Impl rule__Tick__Group_2__3
            {
            pushFollow(FOLLOW_rule__Tick__Group_2__2__Impl_in_rule__Tick__Group_2__21573);
            rule__Tick__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Tick__Group_2__3_in_rule__Tick__Group_2__21576);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:791:1: rule__Tick__Group_2__2__Impl : ( ':' ) ;
    public final void rule__Tick__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:795:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:796:1: ( ':' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:796:1: ( ':' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:797:1: ':'
            {
             before(grammarAccess.getTickAccess().getColonKeyword_2_2()); 
            match(input,16,FOLLOW_16_in_rule__Tick__Group_2__2__Impl1604); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:810:1: rule__Tick__Group_2__3 : rule__Tick__Group_2__3__Impl ;
    public final void rule__Tick__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:814:1: ( rule__Tick__Group_2__3__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:815:2: rule__Tick__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Tick__Group_2__3__Impl_in_rule__Tick__Group_2__31635);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:821:1: rule__Tick__Group_2__3__Impl : ( ( rule__Tick__OutputAssignment_2_3 )* ) ;
    public final void rule__Tick__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:825:1: ( ( ( rule__Tick__OutputAssignment_2_3 )* ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:826:1: ( ( rule__Tick__OutputAssignment_2_3 )* )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:826:1: ( ( rule__Tick__OutputAssignment_2_3 )* )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:827:1: ( rule__Tick__OutputAssignment_2_3 )*
            {
             before(grammarAccess.getTickAccess().getOutputAssignment_2_3()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:828:1: ( rule__Tick__OutputAssignment_2_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ALPHANUMSPECIAL) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:828:2: rule__Tick__OutputAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_rule__Tick__OutputAssignment_2_3_in_rule__Tick__Group_2__3__Impl1662);
            	    rule__Tick__OutputAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:846:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:850:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:851:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
            {
            pushFollow(FOLLOW_rule__Signal__Group__0__Impl_in_rule__Signal__Group__01701);
            rule__Signal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__01704);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:858:1: rule__Signal__Group__0__Impl : ( ( rule__Signal__NameAssignment_0 ) ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:862:1: ( ( ( rule__Signal__NameAssignment_0 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:863:1: ( ( rule__Signal__NameAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:863:1: ( ( rule__Signal__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:864:1: ( rule__Signal__NameAssignment_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:865:1: ( rule__Signal__NameAssignment_0 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:865:2: rule__Signal__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0__Impl1731);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:875:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:879:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:880:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
            {
            pushFollow(FOLLOW_rule__Signal__Group__1__Impl_in_rule__Signal__Group__11761);
            rule__Signal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__2_in_rule__Signal__Group__11764);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:887:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__ValuedAssignment_1 )? ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:891:1: ( ( ( rule__Signal__ValuedAssignment_1 )? ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:892:1: ( ( rule__Signal__ValuedAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:892:1: ( ( rule__Signal__ValuedAssignment_1 )? )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:893:1: ( rule__Signal__ValuedAssignment_1 )?
            {
             before(grammarAccess.getSignalAccess().getValuedAssignment_1()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:894:1: ( rule__Signal__ValuedAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:894:2: rule__Signal__ValuedAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Signal__ValuedAssignment_1_in_rule__Signal__Group__1__Impl1791);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:904:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:908:1: ( rule__Signal__Group__2__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:909:2: rule__Signal__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group__2__Impl_in_rule__Signal__Group__21822);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:915:1: rule__Signal__Group__2__Impl : ( ( rule__Signal__Group_2__0 )? ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:919:1: ( ( ( rule__Signal__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:920:1: ( ( rule__Signal__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:920:1: ( ( rule__Signal__Group_2__0 )? )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:921:1: ( rule__Signal__Group_2__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:922:1: ( rule__Signal__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_BOOL)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:922:2: rule__Signal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_2__0_in_rule__Signal__Group__2__Impl1849);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:938:1: rule__Signal__Group_2__0 : rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 ;
    public final void rule__Signal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:942:1: ( rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:943:2: rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_2__0__Impl_in_rule__Signal__Group_2__01886);
            rule__Signal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_2__1_in_rule__Signal__Group_2__01889);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:950:1: rule__Signal__Group_2__0__Impl : ( ( rule__Signal__ValAssignment_2_0 ) ) ;
    public final void rule__Signal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:954:1: ( ( ( rule__Signal__ValAssignment_2_0 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:955:1: ( ( rule__Signal__ValAssignment_2_0 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:955:1: ( ( rule__Signal__ValAssignment_2_0 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:956:1: ( rule__Signal__ValAssignment_2_0 )
            {
             before(grammarAccess.getSignalAccess().getValAssignment_2_0()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:957:1: ( rule__Signal__ValAssignment_2_0 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:957:2: rule__Signal__ValAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Signal__ValAssignment_2_0_in_rule__Signal__Group_2__0__Impl1916);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:967:1: rule__Signal__Group_2__1 : rule__Signal__Group_2__1__Impl ;
    public final void rule__Signal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:971:1: ( rule__Signal__Group_2__1__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:972:2: rule__Signal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_2__1__Impl_in_rule__Signal__Group_2__11946);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:978:1: rule__Signal__Group_2__1__Impl : ( ')' ) ;
    public final void rule__Signal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:982:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:983:1: ( ')' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:983:1: ( ')' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:984:1: ')'
            {
             before(grammarAccess.getSignalAccess().getRightParenthesisKeyword_2_1()); 
            match(input,17,FOLLOW_17_in_rule__Signal__Group_2__1__Impl1974); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1001:1: rule__Kvpair__Group__0 : rule__Kvpair__Group__0__Impl rule__Kvpair__Group__1 ;
    public final void rule__Kvpair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1005:1: ( rule__Kvpair__Group__0__Impl rule__Kvpair__Group__1 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1006:2: rule__Kvpair__Group__0__Impl rule__Kvpair__Group__1
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__0__Impl_in_rule__Kvpair__Group__02009);
            rule__Kvpair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kvpair__Group__1_in_rule__Kvpair__Group__02012);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1013:1: rule__Kvpair__Group__0__Impl : ( () ) ;
    public final void rule__Kvpair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1017:1: ( ( () ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1018:1: ( () )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1018:1: ( () )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1019:1: ()
            {
             before(grammarAccess.getKvpairAccess().getKvpairAction_0()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1020:1: ()
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1022:1: 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1032:1: rule__Kvpair__Group__1 : rule__Kvpair__Group__1__Impl rule__Kvpair__Group__2 ;
    public final void rule__Kvpair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1036:1: ( rule__Kvpair__Group__1__Impl rule__Kvpair__Group__2 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1037:2: rule__Kvpair__Group__1__Impl rule__Kvpair__Group__2
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__1__Impl_in_rule__Kvpair__Group__12070);
            rule__Kvpair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kvpair__Group__2_in_rule__Kvpair__Group__12073);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1044:1: rule__Kvpair__Group__1__Impl : ( '%%' ) ;
    public final void rule__Kvpair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1048:1: ( ( '%%' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1049:1: ( '%%' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1049:1: ( '%%' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1050:1: '%%'
            {
             before(grammarAccess.getKvpairAccess().getPercentSignPercentSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Kvpair__Group__1__Impl2101); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1063:1: rule__Kvpair__Group__2 : rule__Kvpair__Group__2__Impl rule__Kvpair__Group__3 ;
    public final void rule__Kvpair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1067:1: ( rule__Kvpair__Group__2__Impl rule__Kvpair__Group__3 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1068:2: rule__Kvpair__Group__2__Impl rule__Kvpair__Group__3
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__2__Impl_in_rule__Kvpair__Group__22132);
            rule__Kvpair__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kvpair__Group__3_in_rule__Kvpair__Group__22135);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1075:1: rule__Kvpair__Group__2__Impl : ( ( rule__Kvpair__KeyAssignment_2 ) ) ;
    public final void rule__Kvpair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1079:1: ( ( ( rule__Kvpair__KeyAssignment_2 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1080:1: ( ( rule__Kvpair__KeyAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1080:1: ( ( rule__Kvpair__KeyAssignment_2 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1081:1: ( rule__Kvpair__KeyAssignment_2 )
            {
             before(grammarAccess.getKvpairAccess().getKeyAssignment_2()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1082:1: ( rule__Kvpair__KeyAssignment_2 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1082:2: rule__Kvpair__KeyAssignment_2
            {
            pushFollow(FOLLOW_rule__Kvpair__KeyAssignment_2_in_rule__Kvpair__Group__2__Impl2162);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1092:1: rule__Kvpair__Group__3 : rule__Kvpair__Group__3__Impl rule__Kvpair__Group__4 ;
    public final void rule__Kvpair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1096:1: ( rule__Kvpair__Group__3__Impl rule__Kvpair__Group__4 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1097:2: rule__Kvpair__Group__3__Impl rule__Kvpair__Group__4
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__3__Impl_in_rule__Kvpair__Group__32192);
            rule__Kvpair__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kvpair__Group__4_in_rule__Kvpair__Group__32195);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1104:1: rule__Kvpair__Group__3__Impl : ( ':' ) ;
    public final void rule__Kvpair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1108:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1109:1: ( ':' )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1109:1: ( ':' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1110:1: ':'
            {
             before(grammarAccess.getKvpairAccess().getColonKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Kvpair__Group__3__Impl2223); 
             after(grammarAccess.getKvpairAccess().getColonKeyword_3()); 

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1123:1: rule__Kvpair__Group__4 : rule__Kvpair__Group__4__Impl ;
    public final void rule__Kvpair__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1127:1: ( rule__Kvpair__Group__4__Impl )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1128:2: rule__Kvpair__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Kvpair__Group__4__Impl_in_rule__Kvpair__Group__42254);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1134:1: rule__Kvpair__Group__4__Impl : ( ( rule__Kvpair__ValueAssignment_4 ) ) ;
    public final void rule__Kvpair__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1138:1: ( ( ( rule__Kvpair__ValueAssignment_4 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1139:1: ( ( rule__Kvpair__ValueAssignment_4 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1139:1: ( ( rule__Kvpair__ValueAssignment_4 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1140:1: ( rule__Kvpair__ValueAssignment_4 )
            {
             before(grammarAccess.getKvpairAccess().getValueAssignment_4()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1141:1: ( rule__Kvpair__ValueAssignment_4 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1141:2: rule__Kvpair__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__Kvpair__ValueAssignment_4_in_rule__Kvpair__Group__4__Impl2281);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1162:1: rule__Tracelist__TracesAssignment : ( ruletrace ) ;
    public final void rule__Tracelist__TracesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1166:1: ( ( ruletrace ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1167:1: ( ruletrace )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1167:1: ( ruletrace )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1168:1: ruletrace
            {
             before(grammarAccess.getTracelistAccess().getTracesTraceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruletrace_in_rule__Tracelist__TracesAssignment2326);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1177:1: rule__Trace__TicksAssignment_3 : ( ruletick ) ;
    public final void rule__Trace__TicksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1181:1: ( ( ruletick ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1182:1: ( ruletick )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1182:1: ( ruletick )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1183:1: ruletick
            {
             before(grammarAccess.getTraceAccess().getTicksTickParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruletick_in_rule__Trace__TicksAssignment_32357);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1192:1: rule__Tick__InputAssignment_1 : ( rulesignal ) ;
    public final void rule__Tick__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1196:1: ( ( rulesignal ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1197:1: ( rulesignal )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1197:1: ( rulesignal )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1198:1: rulesignal
            {
             before(grammarAccess.getTickAccess().getInputSignalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulesignal_in_rule__Tick__InputAssignment_12388);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1207:1: rule__Tick__OutputAssignment_2_3 : ( rulesignal ) ;
    public final void rule__Tick__OutputAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1211:1: ( ( rulesignal ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1212:1: ( rulesignal )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1212:1: ( rulesignal )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1213:1: rulesignal
            {
             before(grammarAccess.getTickAccess().getOutputSignalParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_rulesignal_in_rule__Tick__OutputAssignment_2_32419);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1222:1: rule__Tick__ExtraInfosAssignment_3 : ( rulekvpair ) ;
    public final void rule__Tick__ExtraInfosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1226:1: ( ( rulekvpair ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1227:1: ( rulekvpair )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1227:1: ( rulekvpair )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1228:1: rulekvpair
            {
             before(grammarAccess.getTickAccess().getExtraInfosKvpairParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulekvpair_in_rule__Tick__ExtraInfosAssignment_32450);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1237:1: rule__Signal__NameAssignment_0 : ( RULE_ALPHANUMSPECIAL ) ;
    public final void rule__Signal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1241:1: ( ( RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1242:1: ( RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1242:1: ( RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1243:1: RULE_ALPHANUMSPECIAL
            {
             before(grammarAccess.getSignalAccess().getNameAlphaNumSpecialTerminalRuleCall_0_0()); 
            match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__Signal__NameAssignment_02481); 
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


    // $ANTLR start "rule__Signal__ValuedAssignment_1"
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1252:1: rule__Signal__ValuedAssignment_1 : ( ( '(' ) ) ;
    public final void rule__Signal__ValuedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1256:1: ( ( ( '(' ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1257:1: ( ( '(' ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1257:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1258:1: ( '(' )
            {
             before(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1259:1: ( '(' )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1260:1: '('
            {
             before(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Signal__ValuedAssignment_12517); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1275:1: rule__Signal__ValAssignment_2_0 : ( ( rule__Signal__ValAlternatives_2_0_0 ) ) ;
    public final void rule__Signal__ValAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1279:1: ( ( ( rule__Signal__ValAlternatives_2_0_0 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1280:1: ( ( rule__Signal__ValAlternatives_2_0_0 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1280:1: ( ( rule__Signal__ValAlternatives_2_0_0 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1281:1: ( rule__Signal__ValAlternatives_2_0_0 )
            {
             before(grammarAccess.getSignalAccess().getValAlternatives_2_0_0()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1282:1: ( rule__Signal__ValAlternatives_2_0_0 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1282:2: rule__Signal__ValAlternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__Signal__ValAlternatives_2_0_0_in_rule__Signal__ValAssignment_2_02556);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1291:1: rule__Kvpair__KeyAssignment_2 : ( RULE_ALPHANUMSPECIAL ) ;
    public final void rule__Kvpair__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1295:1: ( ( RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1296:1: ( RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1296:1: ( RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1297:1: RULE_ALPHANUMSPECIAL
            {
             before(grammarAccess.getKvpairAccess().getKeyAlphaNumSpecialTerminalRuleCall_2_0()); 
            match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__Kvpair__KeyAssignment_22589); 
             after(grammarAccess.getKvpairAccess().getKeyAlphaNumSpecialTerminalRuleCall_2_0()); 

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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1306:1: rule__Kvpair__ValueAssignment_4 : ( ( rule__Kvpair__ValueAlternatives_4_0 ) ) ;
    public final void rule__Kvpair__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1310:1: ( ( ( rule__Kvpair__ValueAlternatives_4_0 ) ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1311:1: ( ( rule__Kvpair__ValueAlternatives_4_0 ) )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1311:1: ( ( rule__Kvpair__ValueAlternatives_4_0 ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1312:1: ( rule__Kvpair__ValueAlternatives_4_0 )
            {
             before(grammarAccess.getKvpairAccess().getValueAlternatives_4_0()); 
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1313:1: ( rule__Kvpair__ValueAlternatives_4_0 )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1313:2: rule__Kvpair__ValueAlternatives_4_0
            {
            pushFollow(FOLLOW_rule__Kvpair__ValueAlternatives_4_0_in_rule__Kvpair__ValueAssignment_42620);
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1322:1: rule__EsoInt__ValueAssignment : ( RULE_INT ) ;
    public final void rule__EsoInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1326:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1327:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1327:1: ( RULE_INT )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1328:1: RULE_INT
            {
             before(grammarAccess.getEsoIntAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EsoInt__ValueAssignment2653); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1337:1: rule__EsoString__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__EsoString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1341:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1342:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1342:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1343:1: RULE_STRING
            {
             before(grammarAccess.getEsoStringAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EsoString__ValueAssignment2684); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1352:1: rule__EsoFloat__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__EsoFloat__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1356:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1357:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1357:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1358:1: RULE_FLOAT
            {
             before(grammarAccess.getEsoFloatAccess().getValueFLOATTerminalRuleCall_0()); 
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__EsoFloat__ValueAssignment2715); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1367:1: rule__EsoBool__ValueAssignment : ( RULE_BOOL ) ;
    public final void rule__EsoBool__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1371:1: ( ( RULE_BOOL ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1372:1: ( RULE_BOOL )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1372:1: ( RULE_BOOL )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1373:1: RULE_BOOL
            {
             before(grammarAccess.getEsoBoolAccess().getValueBOOLTerminalRuleCall_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__EsoBool__ValueAssignment2746); 
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
    // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1382:1: rule__EsoJson__ValueAssignment : ( RULE_ALPHANUMSPECIAL ) ;
    public final void rule__EsoJson__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1386:1: ( ( RULE_ALPHANUMSPECIAL ) )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1387:1: ( RULE_ALPHANUMSPECIAL )
            {
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1387:1: ( RULE_ALPHANUMSPECIAL )
            // ../de.cau.cs.kieler.sim.eso.ui/src-gen/de/cau/cs/kieler/sim/eso/ui/contentassist/antlr/internal/InternalEso.g:1388:1: RULE_ALPHANUMSPECIAL
            {
             before(grammarAccess.getEsoJsonAccess().getValueAlphaNumSpecialTerminalRuleCall_0()); 
            match(input,RULE_ALPHANUMSPECIAL,FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__EsoJson__ValueAssignment2777); 
             after(grammarAccess.getEsoJsonAccess().getValueAlphaNumSpecialTerminalRuleCall_0()); 

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
    public static final BitSet FOLLOW_rule__Tracelist__TracesAssignment_in_ruletracelist96 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Tracelist__TracesAssignment_in_ruletracelist108 = new BitSet(new long[]{0x0000000000000802L});
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
    public static final BitSet FOLLOW_ruleEsoInt_in_rule__Signal__ValAlternatives_2_0_0687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_rule__Signal__ValAlternatives_2_0_0704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoBool_in_rule__Signal__ValAlternatives_2_0_0721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoString_in_rule__Signal__ValAlternatives_2_0_0738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoJson_in_rule__Kvpair__ValueAlternatives_4_0770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoString_in_rule__Kvpair__ValueAlternatives_4_0787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoFloat_in_rule__Kvpair__ValueAlternatives_4_0804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoBool_in_rule__Kvpair__ValueAlternatives_4_0821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEsoInt_in_rule__Kvpair__ValueAlternatives_4_0838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__0__Impl_in_rule__Trace__Group__0868 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__0871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Trace__Group__0__Impl899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__1__Impl_in_rule__Trace__Group__1930 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Trace__Group__1__Impl961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__2__Impl_in_rule__Trace__Group__2992 = new BitSet(new long[]{0x0000000000046010L});
    public static final BitSet FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Trace__Group__2__Impl1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__3__Impl_in_rule__Trace__Group__31054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__TicksAssignment_3_in_rule__Trace__Group__3__Impl1083 = new BitSet(new long[]{0x0000000000046012L});
    public static final BitSet FOLLOW_rule__Trace__TicksAssignment_3_in_rule__Trace__Group__3__Impl1095 = new BitSet(new long[]{0x0000000000046012L});
    public static final BitSet FOLLOW_rule__Tick__Group__0__Impl_in_rule__Tick__Group__01136 = new BitSet(new long[]{0x0000000000046010L});
    public static final BitSet FOLLOW_rule__Tick__Group__1_in_rule__Tick__Group__01139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__1__Impl_in_rule__Tick__Group__11197 = new BitSet(new long[]{0x0000000000046010L});
    public static final BitSet FOLLOW_rule__Tick__Group__2_in_rule__Tick__Group__11200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__InputAssignment_1_in_rule__Tick__Group__1__Impl1227 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Tick__Group__2__Impl_in_rule__Tick__Group__21258 = new BitSet(new long[]{0x0000000000046010L});
    public static final BitSet FOLLOW_rule__Tick__Group__3_in_rule__Tick__Group__21261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__0_in_rule__Tick__Group__2__Impl1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__3__Impl_in_rule__Tick__Group__31319 = new BitSet(new long[]{0x0000000000046010L});
    public static final BitSet FOLLOW_rule__Tick__Group__4_in_rule__Tick__Group__31322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__ExtraInfosAssignment_3_in_rule__Tick__Group__3__Impl1349 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Tick__Group__4__Impl_in_rule__Tick__Group__41380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Tick__Group__4__Impl1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__0__Impl_in_rule__Tick__Group_2__01449 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__1_in_rule__Tick__Group_2__01452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Tick__Group_2__0__Impl1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__1__Impl_in_rule__Tick__Group_2__11511 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__2_in_rule__Tick__Group_2__11514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Tick__Group_2__1__Impl1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__2__Impl_in_rule__Tick__Group_2__21573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__3_in_rule__Tick__Group_2__21576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Tick__Group_2__2__Impl1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_2__3__Impl_in_rule__Tick__Group_2__31635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__OutputAssignment_2_3_in_rule__Tick__Group_2__3__Impl1662 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Signal__Group__0__Impl_in_rule__Signal__Group__01701 = new BitSet(new long[]{0x00000000000801E0L});
    public static final BitSet FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__01704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0__Impl1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__1__Impl_in_rule__Signal__Group__11761 = new BitSet(new long[]{0x00000000000801E0L});
    public static final BitSet FOLLOW_rule__Signal__Group__2_in_rule__Signal__Group__11764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__ValuedAssignment_1_in_rule__Signal__Group__1__Impl1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__2__Impl_in_rule__Signal__Group__21822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__0_in_rule__Signal__Group__2__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__0__Impl_in_rule__Signal__Group_2__01886 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__1_in_rule__Signal__Group_2__01889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__ValAssignment_2_0_in_rule__Signal__Group_2__0__Impl1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__1__Impl_in_rule__Signal__Group_2__11946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Signal__Group_2__1__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__0__Impl_in_rule__Kvpair__Group__02009 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__1_in_rule__Kvpair__Group__02012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__1__Impl_in_rule__Kvpair__Group__12070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__2_in_rule__Kvpair__Group__12073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Kvpair__Group__1__Impl2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__2__Impl_in_rule__Kvpair__Group__22132 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__3_in_rule__Kvpair__Group__22135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__KeyAssignment_2_in_rule__Kvpair__Group__2__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__3__Impl_in_rule__Kvpair__Group__32192 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__4_in_rule__Kvpair__Group__32195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Kvpair__Group__3__Impl2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__Group__4__Impl_in_rule__Kvpair__Group__42254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__ValueAssignment_4_in_rule__Kvpair__Group__4__Impl2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletrace_in_rule__Tracelist__TracesAssignment2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletick_in_rule__Trace__TicksAssignment_32357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_rule__Tick__InputAssignment_12388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_rule__Tick__OutputAssignment_2_32419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulekvpair_in_rule__Tick__ExtraInfosAssignment_32450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__Signal__NameAssignment_02481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Signal__ValuedAssignment_12517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__ValAlternatives_2_0_0_in_rule__Signal__ValAssignment_2_02556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__Kvpair__KeyAssignment_22589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kvpair__ValueAlternatives_4_0_in_rule__Kvpair__ValueAssignment_42620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EsoInt__ValueAssignment2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EsoString__ValueAssignment2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__EsoFloat__ValueAssignment2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__EsoBool__ValueAssignment2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHANUMSPECIAL_in_rule__EsoJson__ValueAssignment2777 = new BitSet(new long[]{0x0000000000000002L});

}