package de.cau.cs.kieler.synccharts.dsl.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import de.cau.cs.kieler.synccharts.dsl.services.RetypingSyncchartsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class InternalRetypingSyncchartsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?'", "'not'", "'or'", "'and'", "'PSEUDO'", "'reference'", "'textual'", "'o->'", "'-->'", "'>->'", "'='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'div'", "'mod'", "'pre'", "'state'", "'{'", "'}'", "'||'", "'onentry'", "'/'", "'onexit'", "'oninner'", "'with'", "'('", "')'", "':='", "'input'", "';'", "'var'", "'init'", "'final'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=6;
    public static final int RULE_WS=11;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalRetypingSyncchartsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[276+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g"; }


     
     	private RetypingSyncchartsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RetypingSyncchartsGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }




    // $ANTLR start entryRuleState
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:56:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:56:16: ( ruleState EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:57:1: ruleState EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState66);
            ruleState();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState73); if (failed) return ;

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
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:64:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:68:2: ( ( ( rule__State__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:69:1: ( ( rule__State__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:69:1: ( ( rule__State__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:70:1: ( rule__State__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:71:1: ( rule__State__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:71:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState100);
            rule__State__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getGroup()); 
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
    // $ANTLR end ruleState


    // $ANTLR start entryRuleStateContent
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:83:1: entryRuleStateContent : ruleStateContent EOF ;
    public final void entryRuleStateContent() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:83:23: ( ruleStateContent EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:84:1: ruleStateContent EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentRule()); 
            }
            pushFollow(FOLLOW_ruleStateContent_in_entryRuleStateContent126);
            ruleStateContent();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateContent133); if (failed) return ;

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
    // $ANTLR end entryRuleStateContent


    // $ANTLR start ruleStateContent
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:91:1: ruleStateContent : ( ( rule__StateContent__Group__0 ) ) ;
    public final void ruleStateContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:95:2: ( ( ( rule__StateContent__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:96:1: ( ( rule__StateContent__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:96:1: ( ( rule__StateContent__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:97:1: ( rule__StateContent__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:98:1: ( rule__StateContent__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:98:2: rule__StateContent__Group__0
            {
            pushFollow(FOLLOW_rule__StateContent__Group__0_in_ruleStateContent160);
            rule__StateContent__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getGroup()); 
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
    // $ANTLR end ruleStateContent


    // $ANTLR start entryRuleEntryAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:110:1: entryRuleEntryAction : ruleEntryAction EOF ;
    public final void entryRuleEntryAction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:110:22: ( ruleEntryAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:111:1: ruleEntryAction EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionRule()); 
            }
            pushFollow(FOLLOW_ruleEntryAction_in_entryRuleEntryAction186);
            ruleEntryAction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryAction193); if (failed) return ;

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
    // $ANTLR end entryRuleEntryAction


    // $ANTLR start ruleEntryAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:118:1: ruleEntryAction : ( ( rule__EntryAction__Group__0 ) ) ;
    public final void ruleEntryAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:122:2: ( ( ( rule__EntryAction__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:123:1: ( ( rule__EntryAction__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:123:1: ( ( rule__EntryAction__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:124:1: ( rule__EntryAction__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:125:1: ( rule__EntryAction__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:125:2: rule__EntryAction__Group__0
            {
            pushFollow(FOLLOW_rule__EntryAction__Group__0_in_ruleEntryAction220);
            rule__EntryAction__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionAccess().getGroup()); 
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
    // $ANTLR end ruleEntryAction


    // $ANTLR start entryRuleExitAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:137:1: entryRuleExitAction : ruleExitAction EOF ;
    public final void entryRuleExitAction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:137:21: ( ruleExitAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:138:1: ruleExitAction EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionRule()); 
            }
            pushFollow(FOLLOW_ruleExitAction_in_entryRuleExitAction246);
            ruleExitAction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitAction253); if (failed) return ;

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
    // $ANTLR end entryRuleExitAction


    // $ANTLR start ruleExitAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:145:1: ruleExitAction : ( ( rule__ExitAction__Group__0 ) ) ;
    public final void ruleExitAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:149:2: ( ( ( rule__ExitAction__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:150:1: ( ( rule__ExitAction__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:150:1: ( ( rule__ExitAction__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:151:1: ( rule__ExitAction__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:152:1: ( rule__ExitAction__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:152:2: rule__ExitAction__Group__0
            {
            pushFollow(FOLLOW_rule__ExitAction__Group__0_in_ruleExitAction280);
            rule__ExitAction__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getGroup()); 
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
    // $ANTLR end ruleExitAction


    // $ANTLR start entryRuleInnerAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:164:1: entryRuleInnerAction : ruleInnerAction EOF ;
    public final void entryRuleInnerAction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:164:22: ( ruleInnerAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:165:1: ruleInnerAction EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionRule()); 
            }
            pushFollow(FOLLOW_ruleInnerAction_in_entryRuleInnerAction306);
            ruleInnerAction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerAction313); if (failed) return ;

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
    // $ANTLR end entryRuleInnerAction


    // $ANTLR start ruleInnerAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:172:1: ruleInnerAction : ( ( rule__InnerAction__Group__0 ) ) ;
    public final void ruleInnerAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:176:2: ( ( ( rule__InnerAction__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:177:1: ( ( rule__InnerAction__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:177:1: ( ( rule__InnerAction__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:178:1: ( rule__InnerAction__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:179:1: ( rule__InnerAction__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:179:2: rule__InnerAction__Group__0
            {
            pushFollow(FOLLOW_rule__InnerAction__Group__0_in_ruleInnerAction340);
            rule__InnerAction__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getGroup()); 
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
    // $ANTLR end ruleInnerAction


    // $ANTLR start entryRuleTransition
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:191:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:191:21: ( ruleTransition EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:192:1: ruleTransition EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition366);
            ruleTransition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition373); if (failed) return ;

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
    // $ANTLR end entryRuleTransition


    // $ANTLR start ruleTransition
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:199:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:203:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:204:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:204:1: ( ( rule__Transition__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:205:1: ( rule__Transition__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:206:1: ( rule__Transition__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:206:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition400);
            rule__Transition__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGroup()); 
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
    // $ANTLR end ruleTransition


    // $ANTLR start entryRuledeclaredTargetState
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:218:1: entryRuledeclaredTargetState : ruledeclaredTargetState EOF ;
    public final void entryRuledeclaredTargetState() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:218:30: ( ruledeclaredTargetState EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:219:1: ruledeclaredTargetState EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaredTargetStateRule()); 
            }
            pushFollow(FOLLOW_ruledeclaredTargetState_in_entryRuledeclaredTargetState426);
            ruledeclaredTargetState();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaredTargetStateRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaredTargetState433); if (failed) return ;

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
    // $ANTLR end entryRuledeclaredTargetState


    // $ANTLR start ruledeclaredTargetState
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:226:1: ruledeclaredTargetState : ( ( rule__DeclaredTargetState__Group__0 ) ) ;
    public final void ruledeclaredTargetState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:230:2: ( ( ( rule__DeclaredTargetState__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:231:1: ( ( rule__DeclaredTargetState__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:231:1: ( ( rule__DeclaredTargetState__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:232:1: ( rule__DeclaredTargetState__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaredTargetStateAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:233:1: ( rule__DeclaredTargetState__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:233:2: rule__DeclaredTargetState__Group__0
            {
            pushFollow(FOLLOW_rule__DeclaredTargetState__Group__0_in_ruledeclaredTargetState460);
            rule__DeclaredTargetState__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaredTargetStateAccess().getGroup()); 
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
    // $ANTLR end ruledeclaredTargetState


    // $ANTLR start entryRuleEffect
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:247:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:247:17: ( ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:248:1: ruleEffect EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEffectRule()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect488);
            ruleEffect();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEffectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect495); if (failed) return ;

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
    // $ANTLR end entryRuleEffect


    // $ANTLR start ruleEffect
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:255:1: ruleEffect : ( ( rule__Effect__Alternatives ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:259:2: ( ( ( rule__Effect__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:260:1: ( ( rule__Effect__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:260:1: ( ( rule__Effect__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:261:1: ( rule__Effect__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEffectAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:262:1: ( rule__Effect__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:262:2: rule__Effect__Alternatives
            {
            pushFollow(FOLLOW_rule__Effect__Alternatives_in_ruleEffect522);
            rule__Effect__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEffectAccess().getAlternatives()); 
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
    // $ANTLR end ruleEffect


    // $ANTLR start entryRuleEmission
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:274:1: entryRuleEmission : ruleEmission EOF ;
    public final void entryRuleEmission() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:274:19: ( ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:275:1: ruleEmission EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission548);
            ruleEmission();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission555); if (failed) return ;

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
    // $ANTLR end entryRuleEmission


    // $ANTLR start ruleEmission
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:282:1: ruleEmission : ( ( rule__Emission__Group__0 ) ) ;
    public final void ruleEmission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:286:2: ( ( ( rule__Emission__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:287:1: ( ( rule__Emission__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:287:1: ( ( rule__Emission__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:288:1: ( rule__Emission__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:289:1: ( rule__Emission__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:289:2: rule__Emission__Group__0
            {
            pushFollow(FOLLOW_rule__Emission__Group__0_in_ruleEmission582);
            rule__Emission__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getGroup()); 
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
    // $ANTLR end ruleEmission


    // $ANTLR start entryRuleAssignment
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:301:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:301:21: ( ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:302:1: ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment608);
            ruleAssignment();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment615); if (failed) return ;

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
    // $ANTLR end entryRuleAssignment


    // $ANTLR start ruleAssignment
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:309:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:313:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:314:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:314:1: ( ( rule__Assignment__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:315:1: ( rule__Assignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:316:1: ( rule__Assignment__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:316:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment642);
            rule__Assignment__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
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
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:328:1: entryRuleSignalReference : ruleSignalReference EOF ;
    public final void entryRuleSignalReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:328:26: ( ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:329:1: ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference668);
            ruleSignalReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference675); if (failed) return ;

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
    // $ANTLR end entryRuleSignalReference


    // $ANTLR start ruleSignalReference
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:336:1: ruleSignalReference : ( ( rule__SignalReference__ReferenceAssignment ) ) ;
    public final void ruleSignalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:340:2: ( ( ( rule__SignalReference__ReferenceAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:341:1: ( ( rule__SignalReference__ReferenceAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:341:1: ( ( rule__SignalReference__ReferenceAssignment ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:342:1: ( rule__SignalReference__ReferenceAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getReferenceAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:343:1: ( rule__SignalReference__ReferenceAssignment )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:343:2: rule__SignalReference__ReferenceAssignment
            {
            pushFollow(FOLLOW_rule__SignalReference__ReferenceAssignment_in_ruleSignalReference702);
            rule__SignalReference__ReferenceAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getReferenceAssignment()); 
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
    // $ANTLR end ruleSignalReference


    // $ANTLR start entryRuleVariableReference
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:355:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:355:28: ( ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:356:1: ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference728);
            ruleVariableReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference735); if (failed) return ;

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
    // $ANTLR end entryRuleVariableReference


    // $ANTLR start ruleVariableReference
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:363:1: ruleVariableReference : ( ( rule__VariableReference__ReferenceAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:367:2: ( ( ( rule__VariableReference__ReferenceAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:368:1: ( ( rule__VariableReference__ReferenceAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:368:1: ( ( rule__VariableReference__ReferenceAssignment ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:369:1: ( rule__VariableReference__ReferenceAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getReferenceAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:370:1: ( rule__VariableReference__ReferenceAssignment )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:370:2: rule__VariableReference__ReferenceAssignment
            {
            pushFollow(FOLLOW_rule__VariableReference__ReferenceAssignment_in_ruleVariableReference762);
            rule__VariableReference__ReferenceAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getReferenceAssignment()); 
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
    // $ANTLR end ruleVariableReference


    // $ANTLR start entryRuleValuedObject
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:382:1: entryRuleValuedObject : ruleValuedObject EOF ;
    public final void entryRuleValuedObject() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:382:23: ( ruleValuedObject EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:383:1: ruleValuedObject EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObject_in_entryRuleValuedObject788);
            ruleValuedObject();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObject795); if (failed) return ;

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
    // $ANTLR end entryRuleValuedObject


    // $ANTLR start ruleValuedObject
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:390:1: ruleValuedObject : ( ( rule__ValuedObject__Alternatives ) ) ;
    public final void ruleValuedObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:394:2: ( ( ( rule__ValuedObject__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:395:1: ( ( rule__ValuedObject__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:395:1: ( ( rule__ValuedObject__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:396:1: ( rule__ValuedObject__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:397:1: ( rule__ValuedObject__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:397:2: rule__ValuedObject__Alternatives
            {
            pushFollow(FOLLOW_rule__ValuedObject__Alternatives_in_ruleValuedObject822);
            rule__ValuedObject__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectAccess().getAlternatives()); 
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
    // $ANTLR end ruleValuedObject


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:409:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:409:17: ( ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:410:1: ruleSignal EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalRule()); 
            }
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal848);
            ruleSignal();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal855); if (failed) return ;

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
    // $ANTLR end entryRuleSignal


    // $ANTLR start ruleSignal
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:417:1: ruleSignal : ( ( rule__Signal__Group__0 ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:421:2: ( ( ( rule__Signal__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:422:1: ( ( rule__Signal__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:422:1: ( ( rule__Signal__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:423:1: ( rule__Signal__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:424:1: ( rule__Signal__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:424:2: rule__Signal__Group__0
            {
            pushFollow(FOLLOW_rule__Signal__Group__0_in_ruleSignal882);
            rule__Signal__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getGroup()); 
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
    // $ANTLR end ruleSignal


    // $ANTLR start entryRuleVariable
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:436:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:436:19: ( ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:437:1: ruleVariable EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable908);
            ruleVariable();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable915); if (failed) return ;

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
    // $ANTLR end entryRuleVariable


    // $ANTLR start ruleVariable
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:444:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:448:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:449:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:449:1: ( ( rule__Variable__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:450:1: ( rule__Variable__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:451:1: ( rule__Variable__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:451:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable942);
            rule__Variable__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getGroup()); 
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
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:463:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:463:19: ( ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:464:1: ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue968);
            ruleIntValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue975); if (failed) return ;

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
    // $ANTLR end entryRuleIntValue


    // $ANTLR start ruleIntValue
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:471:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:475:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:476:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:476:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:477:1: ( rule__IntValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:478:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:478:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1002);
            rule__IntValue__ValueAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getIntValueAccess().getValueAssignment()); 
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
    // $ANTLR end ruleIntValue


    // $ANTLR start entryRuleFloatValue
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:490:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:490:21: ( ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:491:1: ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1028);
            ruleFloatValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1035); if (failed) return ;

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
    // $ANTLR end entryRuleFloatValue


    // $ANTLR start ruleFloatValue
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:498:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:502:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:503:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:503:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:504:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:505:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:505:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1062);
            rule__FloatValue__ValueAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getValueAssignment()); 
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
    // $ANTLR end ruleFloatValue


    // $ANTLR start entryRuleBooleanValue
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:517:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:517:23: ( ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:518:1: ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1088);
            ruleBooleanValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1095); if (failed) return ;

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
    // $ANTLR end entryRuleBooleanValue


    // $ANTLR start ruleBooleanValue
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:525:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:529:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:530:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:530:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:531:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:532:1: ( rule__BooleanValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:532:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1122);
            rule__BooleanValue__ValueAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
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
    // $ANTLR end ruleBooleanValue


    // $ANTLR start entryRuleHostCode
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:546:1: entryRuleHostCode : ruleHostCode EOF ;
    public final void entryRuleHostCode() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:546:19: ( ruleHostCode EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:547:1: ruleHostCode EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeRule()); 
            }
            pushFollow(FOLLOW_ruleHostCode_in_entryRuleHostCode1150);
            ruleHostCode();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostCode1157); if (failed) return ;

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
    // $ANTLR end entryRuleHostCode


    // $ANTLR start ruleHostCode
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:554:1: ruleHostCode : ( ( rule__HostCode__CodeAssignment ) ) ;
    public final void ruleHostCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:558:2: ( ( ( rule__HostCode__CodeAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:559:1: ( ( rule__HostCode__CodeAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:559:1: ( ( rule__HostCode__CodeAssignment ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:560:1: ( rule__HostCode__CodeAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getCodeAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:561:1: ( rule__HostCode__CodeAssignment )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:561:2: rule__HostCode__CodeAssignment
            {
            pushFollow(FOLLOW_rule__HostCode__CodeAssignment_in_ruleHostCode1184);
            rule__HostCode__CodeAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getCodeAssignment()); 
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
    // $ANTLR end ruleHostCode


    // $ANTLR start entryRuleValOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:575:1: entryRuleValOperation : ruleValOperation EOF ;
    public final void entryRuleValOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:575:23: ( ruleValOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:576:1: ruleValOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationRule()); 
            }
            pushFollow(FOLLOW_ruleValOperation_in_entryRuleValOperation1212);
            ruleValOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValOperation1219); if (failed) return ;

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
    // $ANTLR end entryRuleValOperation


    // $ANTLR start ruleValOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:583:1: ruleValOperation : ( ( rule__ValOperation__Group__0 ) ) ;
    public final void ruleValOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:587:2: ( ( ( rule__ValOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:588:1: ( ( rule__ValOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:588:1: ( ( rule__ValOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:589:1: ( rule__ValOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:590:1: ( rule__ValOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:590:2: rule__ValOperation__Group__0
            {
            pushFollow(FOLLOW_rule__ValOperation__Group__0_in_ruleValOperation1246);
            rule__ValOperation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValOperationAccess().getGroup()); 
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
    // $ANTLR end ruleValOperation


    // $ANTLR start entryRuleValueExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:602:1: entryRuleValueExpression : ruleValueExpression EOF ;
    public final void entryRuleValueExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:602:26: ( ruleValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:603:1: ruleValueExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_entryRuleValueExpression1272);
            ruleValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValueExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpression1279); if (failed) return ;

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
    // $ANTLR end entryRuleValueExpression


    // $ANTLR start ruleValueExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:610:1: ruleValueExpression : ( ( rule__ValueExpression__Alternatives ) ) ;
    public final void ruleValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:614:2: ( ( ( rule__ValueExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:615:1: ( ( rule__ValueExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:615:1: ( ( rule__ValueExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:616:1: ( rule__ValueExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:617:1: ( rule__ValueExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:617:2: rule__ValueExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueExpression__Alternatives_in_ruleValueExpression1306);
            rule__ValueExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValueExpressionAccess().getAlternatives()); 
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
    // $ANTLR end ruleValueExpression


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:629:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:629:27: ( ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:630:1: ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1332);
            ruleCompareOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation1339); if (failed) return ;

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
    // $ANTLR end entryRuleCompareOperation


    // $ANTLR start ruleCompareOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:637:1: ruleCompareOperation : ( ( rule__CompareOperation__Group__0 ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:641:2: ( ( ( rule__CompareOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:642:1: ( ( rule__CompareOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:642:1: ( ( rule__CompareOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:643:1: ( rule__CompareOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:644:1: ( rule__CompareOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:644:2: rule__CompareOperation__Group__0
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group__0_in_ruleCompareOperation1366);
            rule__CompareOperation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getGroup()); 
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
    // $ANTLR end ruleCompareOperation


    // $ANTLR start entryRuleNotOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:656:1: entryRuleNotOperation : ruleNotOperation EOF ;
    public final void entryRuleNotOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:656:23: ( ruleNotOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:657:1: ruleNotOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOperationRule()); 
            }
            pushFollow(FOLLOW_ruleNotOperation_in_entryRuleNotOperation1392);
            ruleNotOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperation1399); if (failed) return ;

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
    // $ANTLR end entryRuleNotOperation


    // $ANTLR start ruleNotOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:664:1: ruleNotOperation : ( ( rule__NotOperation__Group__0 ) ) ;
    public final void ruleNotOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:668:2: ( ( ( rule__NotOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:669:1: ( ( rule__NotOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:669:1: ( ( rule__NotOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:670:1: ( rule__NotOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:671:1: ( rule__NotOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:671:2: rule__NotOperation__Group__0
            {
            pushFollow(FOLLOW_rule__NotOperation__Group__0_in_ruleNotOperation1426);
            rule__NotOperation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotOperationAccess().getGroup()); 
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
    // $ANTLR end ruleNotOperation


    // $ANTLR start entryRuleNotOrNormalExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:683:1: entryRuleNotOrNormalExpression : ruleNotOrNormalExpression EOF ;
    public final void entryRuleNotOrNormalExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:683:32: ( ruleNotOrNormalExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:684:1: ruleNotOrNormalExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOrNormalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotOrNormalExpression_in_entryRuleNotOrNormalExpression1452);
            ruleNotOrNormalExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotOrNormalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOrNormalExpression1459); if (failed) return ;

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
    // $ANTLR end entryRuleNotOrNormalExpression


    // $ANTLR start ruleNotOrNormalExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:691:1: ruleNotOrNormalExpression : ( ( rule__NotOrNormalExpression__Alternatives ) ) ;
    public final void ruleNotOrNormalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:695:2: ( ( ( rule__NotOrNormalExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:696:1: ( ( rule__NotOrNormalExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:696:1: ( ( rule__NotOrNormalExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:697:1: ( rule__NotOrNormalExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOrNormalExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:698:1: ( rule__NotOrNormalExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:698:2: rule__NotOrNormalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__NotOrNormalExpression__Alternatives_in_ruleNotOrNormalExpression1486);
            rule__NotOrNormalExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotOrNormalExpressionAccess().getAlternatives()); 
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
    // $ANTLR end ruleNotOrNormalExpression


    // $ANTLR start entryRuleAndOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:710:1: entryRuleAndOperation : ruleAndOperation EOF ;
    public final void entryRuleAndOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:710:23: ( ruleAndOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:711:1: ruleAndOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_entryRuleAndOperation1512);
            ruleAndOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperation1519); if (failed) return ;

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
    // $ANTLR end entryRuleAndOperation


    // $ANTLR start ruleAndOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:718:1: ruleAndOperation : ( ( rule__AndOperation__Group__0 ) ) ;
    public final void ruleAndOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:722:2: ( ( ( rule__AndOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:723:1: ( ( rule__AndOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:723:1: ( ( rule__AndOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:724:1: ( rule__AndOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:725:1: ( rule__AndOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:725:2: rule__AndOperation__Group__0
            {
            pushFollow(FOLLOW_rule__AndOperation__Group__0_in_ruleAndOperation1546);
            rule__AndOperation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getGroup()); 
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
    // $ANTLR end ruleAndOperation


    // $ANTLR start entryRuleOrOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:737:1: entryRuleOrOperation : ruleOrOperation EOF ;
    public final void entryRuleOrOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:737:22: ( ruleOrOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:738:1: ruleOrOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_entryRuleOrOperation1572);
            ruleOrOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperation1579); if (failed) return ;

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
    // $ANTLR end entryRuleOrOperation


    // $ANTLR start ruleOrOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:745:1: ruleOrOperation : ( ( rule__OrOperation__Group__0 ) ) ;
    public final void ruleOrOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:749:2: ( ( ( rule__OrOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:750:1: ( ( rule__OrOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:750:1: ( ( rule__OrOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:751:1: ( rule__OrOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:752:1: ( rule__OrOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:752:2: rule__OrOperation__Group__0
            {
            pushFollow(FOLLOW_rule__OrOperation__Group__0_in_ruleOrOperation1606);
            rule__OrOperation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getGroup()); 
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
    // $ANTLR end ruleOrOperation


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:764:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:764:28: ( ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:765:1: ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression1632);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression1639); if (failed) return ;

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
    // $ANTLR end entryRuleBooleanExpression


    // $ANTLR start ruleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:772:1: ruleBooleanExpression : ( ( rule__BooleanExpression__Alternatives ) ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:776:2: ( ( ( rule__BooleanExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:777:1: ( ( rule__BooleanExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:777:1: ( ( rule__BooleanExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:778:1: ( rule__BooleanExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:779:1: ( rule__BooleanExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:779:2: rule__BooleanExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Alternatives_in_ruleBooleanExpression1666);
            rule__BooleanExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getAlternatives()); 
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
    // $ANTLR end ruleBooleanExpression


    // $ANTLR start entryRulePrimaryExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:791:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:791:28: ( rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:792:1: rulePrimaryExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1692);
            rulePrimaryExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1699); if (failed) return ;

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
    // $ANTLR end entryRulePrimaryExpression


    // $ANTLR start rulePrimaryExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:799:1: rulePrimaryExpression : ( ruleBooleanExpression ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:803:2: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:804:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:804:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:805:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getBooleanExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rulePrimaryExpression1726);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getBooleanExpressionParserRuleCall()); 
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
    // $ANTLR end rulePrimaryExpression


    // $ANTLR start ruleStateType
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:819:1: ruleStateType : ( ( rule__StateType__Alternatives ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:823:1: ( ( ( rule__StateType__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:824:1: ( ( rule__StateType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:824:1: ( ( rule__StateType__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:825:1: ( rule__StateType__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateTypeAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:826:1: ( rule__StateType__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:826:2: rule__StateType__Alternatives
            {
            pushFollow(FOLLOW_rule__StateType__Alternatives_in_ruleStateType1762);
            rule__StateType__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateTypeAccess().getAlternatives()); 
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
    // $ANTLR end ruleStateType


    // $ANTLR start ruleTransitionType
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:838:1: ruleTransitionType : ( ( rule__TransitionType__Alternatives ) ) ;
    public final void ruleTransitionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:842:1: ( ( ( rule__TransitionType__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:843:1: ( ( rule__TransitionType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:843:1: ( ( rule__TransitionType__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:844:1: ( rule__TransitionType__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionTypeAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:845:1: ( rule__TransitionType__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:845:2: rule__TransitionType__Alternatives
            {
            pushFollow(FOLLOW_rule__TransitionType__Alternatives_in_ruleTransitionType1798);
            rule__TransitionType__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionTypeAccess().getAlternatives()); 
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
    // $ANTLR end ruleTransitionType


    // $ANTLR start ruleOperatorKind
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:857:1: ruleOperatorKind : ( ( rule__OperatorKind__Alternatives ) ) ;
    public final void ruleOperatorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:861:1: ( ( ( rule__OperatorKind__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:862:1: ( ( rule__OperatorKind__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:862:1: ( ( rule__OperatorKind__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:863:1: ( rule__OperatorKind__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOperatorKindAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:864:1: ( rule__OperatorKind__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:864:2: rule__OperatorKind__Alternatives
            {
            pushFollow(FOLLOW_rule__OperatorKind__Alternatives_in_ruleOperatorKind1834);
            rule__OperatorKind__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOperatorKindAccess().getAlternatives()); 
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
    // $ANTLR end ruleOperatorKind


    // $ANTLR start ruleValOperator
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:876:1: ruleValOperator : ( ( '?' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:880:1: ( ( ( '?' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:881:1: ( ( '?' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:881:1: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:882:1: ( '?' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:883:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:883:3: '?'
            {
            match(input,13,FOLLOW_13_in_ruleValOperator1871); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
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
    // $ANTLR end ruleValOperator


    // $ANTLR start ruleCompareOperator
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:896:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:900:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:901:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:901:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:902:1: ( rule__CompareOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:903:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:903:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1909);
            rule__CompareOperator__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
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
    // $ANTLR end ruleCompareOperator


    // $ANTLR start ruleNotOperator
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:915:1: ruleNotOperator : ( ( 'not' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:919:1: ( ( ( 'not' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:920:1: ( ( 'not' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:920:1: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:921:1: ( 'not' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:922:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:922:3: 'not'
            {
            match(input,14,FOLLOW_14_in_ruleNotOperator1946); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
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
    // $ANTLR end ruleNotOperator


    // $ANTLR start ruleOperatorOr
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:935:1: ruleOperatorOr : ( ( 'or' ) ) ;
    public final void ruleOperatorOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:939:1: ( ( ( 'or' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:940:1: ( ( 'or' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:940:1: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:941:1: ( 'or' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:942:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:942:3: 'or'
            {
            match(input,15,FOLLOW_15_in_ruleOperatorOr1985); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration()); 
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
    // $ANTLR end ruleOperatorOr


    // $ANTLR start ruleOperatorAnd
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:955:1: ruleOperatorAnd : ( ( 'and' ) ) ;
    public final void ruleOperatorAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:959:1: ( ( ( 'and' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:960:1: ( ( 'and' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:960:1: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:961:1: ( 'and' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:962:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:962:3: 'and'
            {
            match(input,16,FOLLOW_16_in_ruleOperatorAnd2024); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration()); 
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
    // $ANTLR end ruleOperatorAnd


    // $ANTLR start rule__StateContent__Alternatives_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:974:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) | ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) | ( ( rule__StateContent__SignalsAndVariablesAssignment_1_3 ) ) | ( ( rule__StateContent__Group_1_4__0 ) ) );
    public final void rule__StateContent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:978:1: ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) | ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) | ( ( rule__StateContent__SignalsAndVariablesAssignment_1_3 ) ) | ( ( rule__StateContent__Group_1_4__0 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                int LA1_1 = input.LA(2);

                if ( (synpred1()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("974:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) | ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) | ( ( rule__StateContent__SignalsAndVariablesAssignment_1_3 ) ) | ( ( rule__StateContent__Group_1_4__0 ) ) );", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA1_2 = input.LA(2);

                if ( (synpred2()) ) {
                    alt1=2;
                }
                else if ( (true) ) {
                    alt1=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("974:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) | ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) | ( ( rule__StateContent__SignalsAndVariablesAssignment_1_3 ) ) | ( ( rule__StateContent__Group_1_4__0 ) ) );", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA1_3 = input.LA(2);

                if ( (synpred3()) ) {
                    alt1=3;
                }
                else if ( (true) ) {
                    alt1=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("974:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) | ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) | ( ( rule__StateContent__SignalsAndVariablesAssignment_1_3 ) ) | ( ( rule__StateContent__Group_1_4__0 ) ) );", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA1_4 = input.LA(2);

                if ( (synpred4()) ) {
                    alt1=4;
                }
                else if ( (true) ) {
                    alt1=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("974:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) | ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) | ( ( rule__StateContent__SignalsAndVariablesAssignment_1_3 ) ) | ( ( rule__StateContent__Group_1_4__0 ) ) );", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA1_5 = input.LA(2);

                if ( (synpred4()) ) {
                    alt1=4;
                }
                else if ( (true) ) {
                    alt1=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("974:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) | ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) | ( ( rule__StateContent__SignalsAndVariablesAssignment_1_3 ) ) | ( ( rule__StateContent__Group_1_4__0 ) ) );", 1, 5, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case RULE_ID:
            case RULE_STRING:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 34:
            case 35:
            case 36:
            case 37:
            case 49:
            case 50:
                {
                alt1=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("974:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) | ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) | ( ( rule__StateContent__SignalsAndVariablesAssignment_1_3 ) ) | ( ( rule__StateContent__Group_1_4__0 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:979:1: ( ( rule__StateContent__ExitActionsAssignment_1_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:979:1: ( ( rule__StateContent__ExitActionsAssignment_1_0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:980:1: ( rule__StateContent__ExitActionsAssignment_1_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getExitActionsAssignment_1_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:981:1: ( rule__StateContent__ExitActionsAssignment_1_0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:981:2: rule__StateContent__ExitActionsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__StateContent__ExitActionsAssignment_1_0_in_rule__StateContent__Alternatives_12061);
                    rule__StateContent__ExitActionsAssignment_1_0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateContentAccess().getExitActionsAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:985:6: ( ( rule__StateContent__EntryActionsAssignment_1_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:985:6: ( ( rule__StateContent__EntryActionsAssignment_1_1 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:986:1: ( rule__StateContent__EntryActionsAssignment_1_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getEntryActionsAssignment_1_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:987:1: ( rule__StateContent__EntryActionsAssignment_1_1 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:987:2: rule__StateContent__EntryActionsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__StateContent__EntryActionsAssignment_1_1_in_rule__StateContent__Alternatives_12079);
                    rule__StateContent__EntryActionsAssignment_1_1();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateContentAccess().getEntryActionsAssignment_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:991:6: ( ( rule__StateContent__InnerActionAssignment_1_2 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:991:6: ( ( rule__StateContent__InnerActionAssignment_1_2 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:992:1: ( rule__StateContent__InnerActionAssignment_1_2 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getInnerActionAssignment_1_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:993:1: ( rule__StateContent__InnerActionAssignment_1_2 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:993:2: rule__StateContent__InnerActionAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__StateContent__InnerActionAssignment_1_2_in_rule__StateContent__Alternatives_12097);
                    rule__StateContent__InnerActionAssignment_1_2();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateContentAccess().getInnerActionAssignment_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:997:6: ( ( rule__StateContent__SignalsAndVariablesAssignment_1_3 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:997:6: ( ( rule__StateContent__SignalsAndVariablesAssignment_1_3 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:998:1: ( rule__StateContent__SignalsAndVariablesAssignment_1_3 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getSignalsAndVariablesAssignment_1_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:999:1: ( rule__StateContent__SignalsAndVariablesAssignment_1_3 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:999:2: rule__StateContent__SignalsAndVariablesAssignment_1_3
                    {
                    pushFollow(FOLLOW_rule__StateContent__SignalsAndVariablesAssignment_1_3_in_rule__StateContent__Alternatives_12115);
                    rule__StateContent__SignalsAndVariablesAssignment_1_3();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateContentAccess().getSignalsAndVariablesAssignment_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1003:6: ( ( rule__StateContent__Group_1_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1003:6: ( ( rule__StateContent__Group_1_4__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1004:1: ( rule__StateContent__Group_1_4__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getGroup_1_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1005:1: ( rule__StateContent__Group_1_4__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1005:2: rule__StateContent__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__StateContent__Group_1_4__0_in_rule__StateContent__Alternatives_12133);
                    rule__StateContent__Group_1_4__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateContentAccess().getGroup_1_4()); 
                    }

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
    // $ANTLR end rule__StateContent__Alternatives_1


    // $ANTLR start rule__Transition__Alternatives_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1014:1: rule__Transition__Alternatives_2 : ( ( ( rule__Transition__TargetStateNameAssignment_2_0 ) ) | ( ( rule__Transition__DeclaredTargetStateAssignment_2_1 ) ) );
    public final void rule__Transition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1018:1: ( ( ( rule__Transition__TargetStateNameAssignment_2_0 ) ) | ( ( rule__Transition__DeclaredTargetStateAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==34||(LA2_0>=49 && LA2_0<=50)) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1014:1: rule__Transition__Alternatives_2 : ( ( ( rule__Transition__TargetStateNameAssignment_2_0 ) ) | ( ( rule__Transition__DeclaredTargetStateAssignment_2_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1019:1: ( ( rule__Transition__TargetStateNameAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1019:1: ( ( rule__Transition__TargetStateNameAssignment_2_0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1020:1: ( rule__Transition__TargetStateNameAssignment_2_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTransitionAccess().getTargetStateNameAssignment_2_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1021:1: ( rule__Transition__TargetStateNameAssignment_2_0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1021:2: rule__Transition__TargetStateNameAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Transition__TargetStateNameAssignment_2_0_in_rule__Transition__Alternatives_22166);
                    rule__Transition__TargetStateNameAssignment_2_0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTransitionAccess().getTargetStateNameAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1025:6: ( ( rule__Transition__DeclaredTargetStateAssignment_2_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1025:6: ( ( rule__Transition__DeclaredTargetStateAssignment_2_1 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1026:1: ( rule__Transition__DeclaredTargetStateAssignment_2_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTransitionAccess().getDeclaredTargetStateAssignment_2_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1027:1: ( rule__Transition__DeclaredTargetStateAssignment_2_1 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1027:2: rule__Transition__DeclaredTargetStateAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Transition__DeclaredTargetStateAssignment_2_1_in_rule__Transition__Alternatives_22184);
                    rule__Transition__DeclaredTargetStateAssignment_2_1();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTransitionAccess().getDeclaredTargetStateAssignment_2_1()); 
                    }

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
    // $ANTLR end rule__Transition__Alternatives_2


    // $ANTLR start rule__Effect__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1036:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleHostCode ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1040:1: ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleHostCode ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=RULE_ID && LA3_1<=RULE_STRING)||(LA3_1>=17 && LA3_1<=22)||(LA3_1>=34 && LA3_1<=38)||(LA3_1>=40 && LA3_1<=41)||LA3_1==43||LA3_1==46||(LA3_1>=48 && LA3_1<=50)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==45) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1036:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleHostCode ) );", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1036:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleHostCode ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1041:1: ( ruleEmission )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1041:1: ( ruleEmission )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1042:1: ruleEmission
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEmission_in_rule__Effect__Alternatives2217);
                    ruleEmission();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1047:6: ( ruleAssignment )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1047:6: ( ruleAssignment )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1048:1: ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2234);
                    ruleAssignment();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1053:6: ( ruleHostCode )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1053:6: ( ruleHostCode )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1054:1: ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getHostCodeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_rule__Effect__Alternatives2251);
                    ruleHostCode();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEffectAccess().getHostCodeParserRuleCall_2()); 
                    }

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
    // $ANTLR end rule__Effect__Alternatives


    // $ANTLR start rule__ValuedObject__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1064:1: rule__ValuedObject__Alternatives : ( ( ruleSignal ) | ( ruleVariable ) );
    public final void rule__ValuedObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1068:1: ( ( ruleSignal ) | ( ruleVariable ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==46) ) {
                alt4=1;
            }
            else if ( (LA4_0==48) ) {
                alt4=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1064:1: rule__ValuedObject__Alternatives : ( ( ruleSignal ) | ( ruleVariable ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1069:1: ( ruleSignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1069:1: ( ruleSignal )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1070:1: ruleSignal
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValuedObjectAccess().getSignalParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSignal_in_rule__ValuedObject__Alternatives2283);
                    ruleSignal();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getValuedObjectAccess().getSignalParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1075:6: ( ruleVariable )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1075:6: ( ruleVariable )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1076:1: ruleVariable
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValuedObjectAccess().getVariableParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVariable_in_rule__ValuedObject__Alternatives2300);
                    ruleVariable();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getValuedObjectAccess().getVariableParserRuleCall_1()); 
                    }

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
    // $ANTLR end rule__ValuedObject__Alternatives


    // $ANTLR start rule__ValueExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1087:1: rule__ValueExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) );
    public final void rule__ValueExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1091:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
                {
                alt5=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1087:1: rule__ValueExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1092:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1092:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1093:1: ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValueExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__ValueExpression__Alternatives2333);
                    ruleIntValue();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getValueExpressionAccess().getIntValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1098:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1098:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1099:1: ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValueExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__ValueExpression__Alternatives2350);
                    ruleFloatValue();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getValueExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1104:6: ( ruleValOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1104:6: ( ruleValOperation )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1105:1: ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValueExpressionAccess().getValOperationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_rule__ValueExpression__Alternatives2367);
                    ruleValOperation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getValueExpressionAccess().getValOperationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1110:6: ( ruleVariableReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1110:6: ( ruleVariableReference )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1111:1: ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValueExpressionAccess().getVariableReferenceParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_rule__ValueExpression__Alternatives2384);
                    ruleVariableReference();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getValueExpressionAccess().getVariableReferenceParserRuleCall_3()); 
                    }

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
    // $ANTLR end rule__ValueExpression__Alternatives


    // $ANTLR start rule__NotOrNormalExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1121:1: rule__NotOrNormalExpression__Alternatives : ( ( ruleNotOperation ) | ( ruleBooleanExpression ) );
    public final void rule__NotOrNormalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1125:1: ( ( ruleNotOperation ) | ( ruleBooleanExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||(LA6_0>=RULE_INT && LA6_0<=RULE_BOOLEAN)||LA6_0==13||LA6_0==43) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1121:1: rule__NotOrNormalExpression__Alternatives : ( ( ruleNotOperation ) | ( ruleBooleanExpression ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1126:1: ( ruleNotOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1126:1: ( ruleNotOperation )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1127:1: ruleNotOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotOrNormalExpressionAccess().getNotOperationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleNotOperation_in_rule__NotOrNormalExpression__Alternatives2416);
                    ruleNotOperation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getNotOrNormalExpressionAccess().getNotOperationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1132:6: ( ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1132:6: ( ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1133:1: ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotOrNormalExpressionAccess().getBooleanExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_rule__NotOrNormalExpression__Alternatives2433);
                    ruleBooleanExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getNotOrNormalExpressionAccess().getBooleanExpressionParserRuleCall_1()); 
                    }

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
    // $ANTLR end rule__NotOrNormalExpression__Alternatives


    // $ANTLR start rule__BooleanExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1143:1: rule__BooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ruleCompareOperation ) | ( ( rule__BooleanExpression__Group_3__0 ) ) );
    public final void rule__BooleanExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1147:1: ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ruleCompareOperation ) | ( ( rule__BooleanExpression__Group_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==EOF||(LA7_2>=RULE_ID && LA7_2<=RULE_STRING)||(LA7_2>=15 && LA7_2<=22)||(LA7_2>=34 && LA7_2<=41)||LA7_2==44||LA7_2==46||(LA7_2>=48 && LA7_2<=50)) ) {
                    alt7=2;
                }
                else if ( ((LA7_2>=23 && LA7_2<=27)) ) {
                    alt7=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1143:1: rule__BooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ruleCompareOperation ) | ( ( rule__BooleanExpression__Group_3__0 ) ) );", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case 13:
                {
                alt7=3;
                }
                break;
            case 43:
                {
                alt7=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1143:1: rule__BooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ruleCompareOperation ) | ( ( rule__BooleanExpression__Group_3__0 ) ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1148:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1148:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1149:1: ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__BooleanExpression__Alternatives2465);
                    ruleBooleanValue();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1154:6: ( ruleSignalReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1154:6: ( ruleSignalReference )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1155:1: ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionAccess().getSignalReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_rule__BooleanExpression__Alternatives2482);
                    ruleSignalReference();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionAccess().getSignalReferenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1160:6: ( ruleCompareOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1160:6: ( ruleCompareOperation )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1161:1: ruleCompareOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionAccess().getCompareOperationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleCompareOperation_in_rule__BooleanExpression__Alternatives2499);
                    ruleCompareOperation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionAccess().getCompareOperationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1166:6: ( ( rule__BooleanExpression__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1166:6: ( ( rule__BooleanExpression__Group_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1167:1: ( rule__BooleanExpression__Group_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionAccess().getGroup_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1168:1: ( rule__BooleanExpression__Group_3__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1168:2: rule__BooleanExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BooleanExpression__Group_3__0_in_rule__BooleanExpression__Alternatives2516);
                    rule__BooleanExpression__Group_3__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionAccess().getGroup_3()); 
                    }

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
    // $ANTLR end rule__BooleanExpression__Alternatives


    // $ANTLR start rule__StateType__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1177:1: rule__StateType__Alternatives : ( ( ( 'PSEUDO' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) );
    public final void rule__StateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1181:1: ( ( ( 'PSEUDO' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1177:1: rule__StateType__Alternatives : ( ( ( 'PSEUDO' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1182:1: ( ( 'PSEUDO' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1182:1: ( ( 'PSEUDO' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1183:1: ( 'PSEUDO' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1184:1: ( 'PSEUDO' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1184:3: 'PSEUDO'
                    {
                    match(input,17,FOLLOW_17_in_rule__StateType__Alternatives2550); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1189:6: ( ( 'reference' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1189:6: ( ( 'reference' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1190:1: ( 'reference' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1191:1: ( 'reference' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1191:3: 'reference'
                    {
                    match(input,18,FOLLOW_18_in_rule__StateType__Alternatives2571); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1196:6: ( ( 'textual' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1196:6: ( ( 'textual' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1197:1: ( 'textual' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1198:1: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1198:3: 'textual'
                    {
                    match(input,19,FOLLOW_19_in_rule__StateType__Alternatives2592); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_2()); 
                    }

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
    // $ANTLR end rule__StateType__Alternatives


    // $ANTLR start rule__TransitionType__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1208:1: rule__TransitionType__Alternatives : ( ( ( 'o->' ) ) | ( ( '-->' ) ) | ( ( '>->' ) ) );
    public final void rule__TransitionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1212:1: ( ( ( 'o->' ) ) | ( ( '-->' ) ) | ( ( '>->' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1208:1: rule__TransitionType__Alternatives : ( ( ( 'o->' ) ) | ( ( '-->' ) ) | ( ( '>->' ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1213:1: ( ( 'o->' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1213:1: ( ( 'o->' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1214:1: ( 'o->' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1215:1: ( 'o->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1215:3: 'o->'
                    {
                    match(input,20,FOLLOW_20_in_rule__TransitionType__Alternatives2628); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1220:6: ( ( '-->' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1220:6: ( ( '-->' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1221:1: ( '-->' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1222:1: ( '-->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1222:3: '-->'
                    {
                    match(input,21,FOLLOW_21_in_rule__TransitionType__Alternatives2649); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1227:6: ( ( '>->' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1227:6: ( ( '>->' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1228:1: ( '>->' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTransitionTypeAccess().getNORMALTERMINATIONEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1229:1: ( '>->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1229:3: '>->'
                    {
                    match(input,22,FOLLOW_22_in_rule__TransitionType__Alternatives2670); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTransitionTypeAccess().getNORMALTERMINATIONEnumLiteralDeclaration_2()); 
                    }

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
    // $ANTLR end rule__TransitionType__Alternatives


    // $ANTLR start rule__OperatorKind__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1239:1: rule__OperatorKind__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( 'not' ) ) | ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( 'div' ) ) | ( ( 'mod' ) ) | ( ( '?' ) ) | ( ( 'pre' ) ) );
    public final void rule__OperatorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1243:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( 'not' ) ) | ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( 'div' ) ) | ( ( 'mod' ) ) | ( ( '?' ) ) | ( ( 'pre' ) ) )
            int alt10=15;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            case 26:
                {
                alt10=4;
                }
                break;
            case 27:
                {
                alt10=5;
                }
                break;
            case 14:
                {
                alt10=6;
                }
                break;
            case 16:
                {
                alt10=7;
                }
                break;
            case 15:
                {
                alt10=8;
                }
                break;
            case 28:
                {
                alt10=9;
                }
                break;
            case 29:
                {
                alt10=10;
                }
                break;
            case 30:
                {
                alt10=11;
                }
                break;
            case 31:
                {
                alt10=12;
                }
                break;
            case 32:
                {
                alt10=13;
                }
                break;
            case 13:
                {
                alt10=14;
                }
                break;
            case 33:
                {
                alt10=15;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1239:1: rule__OperatorKind__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( 'not' ) ) | ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( 'div' ) ) | ( ( 'mod' ) ) | ( ( '?' ) ) | ( ( 'pre' ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1244:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1244:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1245:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1246:1: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1246:3: '='
                    {
                    match(input,23,FOLLOW_23_in_rule__OperatorKind__Alternatives2706); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1251:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1251:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1252:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1253:1: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1253:3: '<'
                    {
                    match(input,24,FOLLOW_24_in_rule__OperatorKind__Alternatives2727); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1258:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1258:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1259:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1260:1: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1260:3: '<='
                    {
                    match(input,25,FOLLOW_25_in_rule__OperatorKind__Alternatives2748); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1265:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1265:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1266:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1267:1: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1267:3: '>'
                    {
                    match(input,26,FOLLOW_26_in_rule__OperatorKind__Alternatives2769); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1272:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1272:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1273:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1274:1: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1274:3: '>='
                    {
                    match(input,27,FOLLOW_27_in_rule__OperatorKind__Alternatives2790); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1279:6: ( ( 'not' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1279:6: ( ( 'not' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1280:1: ( 'not' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getNOTEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1281:1: ( 'not' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1281:3: 'not'
                    {
                    match(input,14,FOLLOW_14_in_rule__OperatorKind__Alternatives2811); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getNOTEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1286:6: ( ( 'and' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1286:6: ( ( 'and' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1287:1: ( 'and' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getANDEnumLiteralDeclaration_6()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1288:1: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1288:3: 'and'
                    {
                    match(input,16,FOLLOW_16_in_rule__OperatorKind__Alternatives2832); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getANDEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1293:6: ( ( 'or' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1293:6: ( ( 'or' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1294:1: ( 'or' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getOREnumLiteralDeclaration_7()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1295:1: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1295:3: 'or'
                    {
                    match(input,15,FOLLOW_15_in_rule__OperatorKind__Alternatives2853); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getOREnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1300:6: ( ( '+' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1300:6: ( ( '+' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1301:1: ( '+' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getADDEnumLiteralDeclaration_8()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1302:1: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1302:3: '+'
                    {
                    match(input,28,FOLLOW_28_in_rule__OperatorKind__Alternatives2874); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getADDEnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1307:6: ( ( '-' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1307:6: ( ( '-' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1308:1: ( '-' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getSUBEnumLiteralDeclaration_9()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1309:1: ( '-' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1309:3: '-'
                    {
                    match(input,29,FOLLOW_29_in_rule__OperatorKind__Alternatives2895); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getSUBEnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1314:6: ( ( '*' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1314:6: ( ( '*' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1315:1: ( '*' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getMULTEnumLiteralDeclaration_10()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1316:1: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1316:3: '*'
                    {
                    match(input,30,FOLLOW_30_in_rule__OperatorKind__Alternatives2916); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getMULTEnumLiteralDeclaration_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1321:6: ( ( 'div' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1321:6: ( ( 'div' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1322:1: ( 'div' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getDIVEnumLiteralDeclaration_11()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1323:1: ( 'div' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1323:3: 'div'
                    {
                    match(input,31,FOLLOW_31_in_rule__OperatorKind__Alternatives2937); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getDIVEnumLiteralDeclaration_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1328:6: ( ( 'mod' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1328:6: ( ( 'mod' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1329:1: ( 'mod' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getMODEnumLiteralDeclaration_12()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1330:1: ( 'mod' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1330:3: 'mod'
                    {
                    match(input,32,FOLLOW_32_in_rule__OperatorKind__Alternatives2958); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getMODEnumLiteralDeclaration_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1335:6: ( ( '?' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1335:6: ( ( '?' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1336:1: ( '?' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getVALEnumLiteralDeclaration_13()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1337:1: ( '?' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1337:3: '?'
                    {
                    match(input,13,FOLLOW_13_in_rule__OperatorKind__Alternatives2979); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getVALEnumLiteralDeclaration_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1342:6: ( ( 'pre' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1342:6: ( ( 'pre' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1343:1: ( 'pre' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOperatorKindAccess().getPREEnumLiteralDeclaration_14()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1344:1: ( 'pre' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1344:3: 'pre'
                    {
                    match(input,33,FOLLOW_33_in_rule__OperatorKind__Alternatives3000); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getOperatorKindAccess().getPREEnumLiteralDeclaration_14()); 
                    }

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
    // $ANTLR end rule__OperatorKind__Alternatives


    // $ANTLR start rule__CompareOperator__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1354:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1358:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            case 26:
                {
                alt11=4;
                }
                break;
            case 27:
                {
                alt11=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1354:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1359:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1359:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1360:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1361:1: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1361:3: '='
                    {
                    match(input,23,FOLLOW_23_in_rule__CompareOperator__Alternatives3036); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1366:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1366:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1367:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1368:1: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1368:3: '<'
                    {
                    match(input,24,FOLLOW_24_in_rule__CompareOperator__Alternatives3057); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1373:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1373:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1374:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1375:1: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1375:3: '<='
                    {
                    match(input,25,FOLLOW_25_in_rule__CompareOperator__Alternatives3078); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1380:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1380:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1381:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1382:1: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1382:3: '>'
                    {
                    match(input,26,FOLLOW_26_in_rule__CompareOperator__Alternatives3099); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1387:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1387:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1388:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1389:1: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1389:3: '>='
                    {
                    match(input,27,FOLLOW_27_in_rule__CompareOperator__Alternatives3120); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

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
    // $ANTLR end rule__CompareOperator__Alternatives


    // $ANTLR start rule__State__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1401:1: rule__State__Group__0 : ( ( rule__State__IsInitialAssignment_0 )? ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1405:1: ( ( ( rule__State__IsInitialAssignment_0 )? ) rule__State__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1406:1: ( ( rule__State__IsInitialAssignment_0 )? ) rule__State__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1406:1: ( ( rule__State__IsInitialAssignment_0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1407:1: ( rule__State__IsInitialAssignment_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1408:1: ( rule__State__IsInitialAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==49) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred38()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1408:2: rule__State__IsInitialAssignment_0
                    {
                    pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_in_rule__State__Group__03157);
                    rule__State__IsInitialAssignment_0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__03167);
            rule__State__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__State__Group__0


    // $ANTLR start rule__State__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1419:1: rule__State__Group__1 : ( ( rule__State__IsFinalAssignment_1 )? ) rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1423:1: ( ( ( rule__State__IsFinalAssignment_1 )? ) rule__State__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1424:1: ( ( rule__State__IsFinalAssignment_1 )? ) rule__State__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1424:1: ( ( rule__State__IsFinalAssignment_1 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1425:1: ( rule__State__IsFinalAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1426:1: ( rule__State__IsFinalAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==50) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred39()) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1426:2: rule__State__IsFinalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__State__IsFinalAssignment_1_in_rule__State__Group__13195);
                    rule__State__IsFinalAssignment_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__13205);
            rule__State__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__State__Group__1


    // $ANTLR start rule__State__Group__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1437:1: rule__State__Group__2 : ( ( rule__State__StateKindAssignment_2 )? ) rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1441:1: ( ( ( rule__State__StateKindAssignment_2 )? ) rule__State__Group__3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1442:1: ( ( rule__State__StateKindAssignment_2 )? ) rule__State__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1442:1: ( ( rule__State__StateKindAssignment_2 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1443:1: ( rule__State__StateKindAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1444:1: ( rule__State__StateKindAssignment_2 )?
            int alt14=2;
            switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA14_1 = input.LA(2);

                    if ( (synpred40()) ) {
                        alt14=1;
                    }
                    }
                    break;
                case 18:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred40()) ) {
                        alt14=1;
                    }
                    }
                    break;
                case 19:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred40()) ) {
                        alt14=1;
                    }
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1444:2: rule__State__StateKindAssignment_2
                    {
                    pushFollow(FOLLOW_rule__State__StateKindAssignment_2_in_rule__State__Group__23233);
                    rule__State__StateKindAssignment_2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_2()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__23243);
            rule__State__Group__3();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__State__Group__2


    // $ANTLR start rule__State__Group__3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1455:1: rule__State__Group__3 : ( ( 'state' )? ) rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1459:1: ( ( ( 'state' )? ) rule__State__Group__4 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1460:1: ( ( 'state' )? ) rule__State__Group__4
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1460:1: ( ( 'state' )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1461:1: ( 'state' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKeyword_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1462:1: ( 'state' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                int LA15_1 = input.LA(2);

                if ( (synpred41()) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1463:2: 'state'
                    {
                    match(input,34,FOLLOW_34_in_rule__State__Group__33273); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKeyword_3()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__33285);
            rule__State__Group__4();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__State__Group__3


    // $ANTLR start rule__State__Group__4
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1475:1: rule__State__Group__4 : ( ( rule__State__StateNameAssignment_4 )? ) rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1479:1: ( ( ( rule__State__StateNameAssignment_4 )? ) rule__State__Group__5 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1480:1: ( ( rule__State__StateNameAssignment_4 )? ) rule__State__Group__5
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1480:1: ( ( rule__State__StateNameAssignment_4 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1481:1: ( rule__State__StateNameAssignment_4 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateNameAssignment_4()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1482:1: ( rule__State__StateNameAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred42()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1482:2: rule__State__StateNameAssignment_4
                    {
                    pushFollow(FOLLOW_rule__State__StateNameAssignment_4_in_rule__State__Group__43313);
                    rule__State__StateNameAssignment_4();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateNameAssignment_4()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__43323);
            rule__State__Group__5();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__State__Group__4


    // $ANTLR start rule__State__Group__5
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1493:1: rule__State__Group__5 : ( ( rule__State__LabelAssignment_5 )? ) rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1497:1: ( ( ( rule__State__LabelAssignment_5 )? ) rule__State__Group__6 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1498:1: ( ( rule__State__LabelAssignment_5 )? ) rule__State__Group__6
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1498:1: ( ( rule__State__LabelAssignment_5 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1499:1: ( rule__State__LabelAssignment_5 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getLabelAssignment_5()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1500:1: ( rule__State__LabelAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred43()) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1500:2: rule__State__LabelAssignment_5
                    {
                    pushFollow(FOLLOW_rule__State__LabelAssignment_5_in_rule__State__Group__53351);
                    rule__State__LabelAssignment_5();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getLabelAssignment_5()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__6_in_rule__State__Group__53361);
            rule__State__Group__6();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__State__Group__5


    // $ANTLR start rule__State__Group__6
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1511:1: rule__State__Group__6 : ( ( rule__State__StateContentAssignment_6 )? ) rule__State__Group__7 ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1515:1: ( ( ( rule__State__StateContentAssignment_6 )? ) rule__State__Group__7 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1516:1: ( ( rule__State__StateContentAssignment_6 )? ) rule__State__Group__7
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1516:1: ( ( rule__State__StateContentAssignment_6 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1517:1: ( rule__State__StateContentAssignment_6 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateContentAssignment_6()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1518:1: ( rule__State__StateContentAssignment_6 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred44()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1518:2: rule__State__StateContentAssignment_6
                    {
                    pushFollow(FOLLOW_rule__State__StateContentAssignment_6_in_rule__State__Group__63389);
                    rule__State__StateContentAssignment_6();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateContentAssignment_6()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__7_in_rule__State__Group__63399);
            rule__State__Group__7();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__State__Group__6


    // $ANTLR start rule__State__Group__7
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1529:1: rule__State__Group__7 : ( ( rule__State__OutgoingTransitionsAssignment_7 )* ) ;
    public final void rule__State__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1533:1: ( ( ( rule__State__OutgoingTransitionsAssignment_7 )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1534:1: ( ( rule__State__OutgoingTransitionsAssignment_7 )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1534:1: ( ( rule__State__OutgoingTransitionsAssignment_7 )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1535:1: ( rule__State__OutgoingTransitionsAssignment_7 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getOutgoingTransitionsAssignment_7()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1536:1: ( rule__State__OutgoingTransitionsAssignment_7 )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA19_2 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 20:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA19_4 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA19_5 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt19=1;
                    }


                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1536:2: rule__State__OutgoingTransitionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__State__OutgoingTransitionsAssignment_7_in_rule__State__Group__73427);
            	    rule__State__OutgoingTransitionsAssignment_7();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getOutgoingTransitionsAssignment_7()); 
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
    // $ANTLR end rule__State__Group__7


    // $ANTLR start rule__StateContent__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1562:1: rule__StateContent__Group__0 : ( '{' ) rule__StateContent__Group__1 ;
    public final void rule__StateContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1566:1: ( ( '{' ) rule__StateContent__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1567:1: ( '{' ) rule__StateContent__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1567:1: ( '{' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1568:1: '{'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__StateContent__Group__03479); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group__1_in_rule__StateContent__Group__03489);
            rule__StateContent__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__StateContent__Group__0


    // $ANTLR start rule__StateContent__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1582:1: rule__StateContent__Group__1 : ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) ) rule__StateContent__Group__2 ;
    public final void rule__StateContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1586:1: ( ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) ) rule__StateContent__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1587:1: ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) ) rule__StateContent__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1587:1: ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1588:1: ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1588:1: ( ( rule__StateContent__Alternatives_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1589:1: ( rule__StateContent__Alternatives_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1590:1: ( rule__StateContent__Alternatives_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1590:2: rule__StateContent__Alternatives_1
            {
            pushFollow(FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__13519);
            rule__StateContent__Alternatives_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1593:1: ( ( rule__StateContent__Alternatives_1 )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1594:1: ( rule__StateContent__Alternatives_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1595:1: ( rule__StateContent__Alternatives_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    int LA20_1 = input.LA(2);

                    if ( (synpred46()) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)||(LA20_0>=17 && LA20_0<=22)||(LA20_0>=34 && LA20_0<=35)||(LA20_0>=37 && LA20_0<=38)||(LA20_0>=40 && LA20_0<=41)||LA20_0==46||(LA20_0>=48 && LA20_0<=50)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1595:2: rule__StateContent__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__13531);
            	    rule__StateContent__Alternatives_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }

            }


            }

            pushFollow(FOLLOW_rule__StateContent__Group__2_in_rule__StateContent__Group__13543);
            rule__StateContent__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__StateContent__Group__1


    // $ANTLR start rule__StateContent__Group__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1607:1: rule__StateContent__Group__2 : ( '}' ) ;
    public final void rule__StateContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1611:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1612:1: ( '}' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1612:1: ( '}' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1613:1: '}'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__StateContent__Group__23572); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getRightCurlyBracketKeyword_2()); 
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
    // $ANTLR end rule__StateContent__Group__2


    // $ANTLR start rule__StateContent__Group_1_4__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1632:1: rule__StateContent__Group_1_4__0 : ( ( rule__StateContent__InnerStatesAssignment_1_4_0 ) ) rule__StateContent__Group_1_4__1 ;
    public final void rule__StateContent__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1636:1: ( ( ( rule__StateContent__InnerStatesAssignment_1_4_0 ) ) rule__StateContent__Group_1_4__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1637:1: ( ( rule__StateContent__InnerStatesAssignment_1_4_0 ) ) rule__StateContent__Group_1_4__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1637:1: ( ( rule__StateContent__InnerStatesAssignment_1_4_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1638:1: ( rule__StateContent__InnerStatesAssignment_1_4_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getInnerStatesAssignment_1_4_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1639:1: ( rule__StateContent__InnerStatesAssignment_1_4_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1639:2: rule__StateContent__InnerStatesAssignment_1_4_0
            {
            pushFollow(FOLLOW_rule__StateContent__InnerStatesAssignment_1_4_0_in_rule__StateContent__Group_1_4__03613);
            rule__StateContent__InnerStatesAssignment_1_4_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getInnerStatesAssignment_1_4_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group_1_4__1_in_rule__StateContent__Group_1_4__03622);
            rule__StateContent__Group_1_4__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__StateContent__Group_1_4__0


    // $ANTLR start rule__StateContent__Group_1_4__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1650:1: rule__StateContent__Group_1_4__1 : ( ( rule__StateContent__Group_1_4_1__0 )* ) ;
    public final void rule__StateContent__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1654:1: ( ( ( rule__StateContent__Group_1_4_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1655:1: ( ( rule__StateContent__Group_1_4_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1655:1: ( ( rule__StateContent__Group_1_4_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1656:1: ( rule__StateContent__Group_1_4_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getGroup_1_4_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1657:1: ( rule__StateContent__Group_1_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred47()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1657:2: rule__StateContent__Group_1_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__StateContent__Group_1_4_1__0_in_rule__StateContent__Group_1_4__13650);
            	    rule__StateContent__Group_1_4_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getGroup_1_4_1()); 
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
    // $ANTLR end rule__StateContent__Group_1_4__1


    // $ANTLR start rule__StateContent__Group_1_4_1__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1671:1: rule__StateContent__Group_1_4_1__0 : ( '||' ) rule__StateContent__Group_1_4_1__1 ;
    public final void rule__StateContent__Group_1_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1675:1: ( ( '||' ) rule__StateContent__Group_1_4_1__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1676:1: ( '||' ) rule__StateContent__Group_1_4_1__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1676:1: ( '||' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1677:1: '||'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getVerticalLineVerticalLineKeyword_1_4_1_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__StateContent__Group_1_4_1__03690); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getVerticalLineVerticalLineKeyword_1_4_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group_1_4_1__1_in_rule__StateContent__Group_1_4_1__03700);
            rule__StateContent__Group_1_4_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__StateContent__Group_1_4_1__0


    // $ANTLR start rule__StateContent__Group_1_4_1__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1691:1: rule__StateContent__Group_1_4_1__1 : ( ( rule__StateContent__ParallelStatesAssignment_1_4_1_1 ) ) ;
    public final void rule__StateContent__Group_1_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1695:1: ( ( ( rule__StateContent__ParallelStatesAssignment_1_4_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1696:1: ( ( rule__StateContent__ParallelStatesAssignment_1_4_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1696:1: ( ( rule__StateContent__ParallelStatesAssignment_1_4_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1697:1: ( rule__StateContent__ParallelStatesAssignment_1_4_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getParallelStatesAssignment_1_4_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1698:1: ( rule__StateContent__ParallelStatesAssignment_1_4_1_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1698:2: rule__StateContent__ParallelStatesAssignment_1_4_1_1
            {
            pushFollow(FOLLOW_rule__StateContent__ParallelStatesAssignment_1_4_1_1_in_rule__StateContent__Group_1_4_1__13728);
            rule__StateContent__ParallelStatesAssignment_1_4_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getParallelStatesAssignment_1_4_1_1()); 
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
    // $ANTLR end rule__StateContent__Group_1_4_1__1


    // $ANTLR start rule__EntryAction__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1712:1: rule__EntryAction__Group__0 : ( 'onentry' ) rule__EntryAction__Group__1 ;
    public final void rule__EntryAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1716:1: ( ( 'onentry' ) rule__EntryAction__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1717:1: ( 'onentry' ) rule__EntryAction__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1717:1: ( 'onentry' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1718:1: 'onentry'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getOnentryKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__EntryAction__Group__03767); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionAccess().getOnentryKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__EntryAction__Group__1_in_rule__EntryAction__Group__03777);
            rule__EntryAction__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__EntryAction__Group__0


    // $ANTLR start rule__EntryAction__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1732:1: rule__EntryAction__Group__1 : ( ( rule__EntryAction__TriggerAssignment_1 )? ) rule__EntryAction__Group__2 ;
    public final void rule__EntryAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1736:1: ( ( ( rule__EntryAction__TriggerAssignment_1 )? ) rule__EntryAction__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1737:1: ( ( rule__EntryAction__TriggerAssignment_1 )? ) rule__EntryAction__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1737:1: ( ( rule__EntryAction__TriggerAssignment_1 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1738:1: ( rule__EntryAction__TriggerAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getTriggerAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1739:1: ( rule__EntryAction__TriggerAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_INT && LA22_0<=RULE_BOOLEAN)||LA22_0==13||LA22_0==43) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                int LA22_2 = input.LA(2);

                if ( (synpred48()) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1739:2: rule__EntryAction__TriggerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EntryAction__TriggerAssignment_1_in_rule__EntryAction__Group__13805);
                    rule__EntryAction__TriggerAssignment_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionAccess().getTriggerAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__EntryAction__Group__2_in_rule__EntryAction__Group__13815);
            rule__EntryAction__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__EntryAction__Group__1


    // $ANTLR start rule__EntryAction__Group__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1750:1: rule__EntryAction__Group__2 : ( ( rule__EntryAction__Group_2__0 )? ) ;
    public final void rule__EntryAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1754:1: ( ( ( rule__EntryAction__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1755:1: ( ( rule__EntryAction__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1755:1: ( ( rule__EntryAction__Group_2__0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1756:1: ( rule__EntryAction__Group_2__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1757:1: ( rule__EntryAction__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1757:2: rule__EntryAction__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EntryAction__Group_2__0_in_rule__EntryAction__Group__23843);
                    rule__EntryAction__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionAccess().getGroup_2()); 
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
    // $ANTLR end rule__EntryAction__Group__2


    // $ANTLR start rule__EntryAction__Group_2__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1773:1: rule__EntryAction__Group_2__0 : ( '/' ) rule__EntryAction__Group_2__1 ;
    public final void rule__EntryAction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1777:1: ( ( '/' ) rule__EntryAction__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1778:1: ( '/' ) rule__EntryAction__Group_2__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1778:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1779:1: '/'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getSolidusKeyword_2_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__EntryAction__Group_2__03885); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionAccess().getSolidusKeyword_2_0()); 
            }

            }

            pushFollow(FOLLOW_rule__EntryAction__Group_2__1_in_rule__EntryAction__Group_2__03895);
            rule__EntryAction__Group_2__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__EntryAction__Group_2__0


    // $ANTLR start rule__EntryAction__Group_2__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1793:1: rule__EntryAction__Group_2__1 : ( ( rule__EntryAction__EffectsAssignment_2_1 )* ) ;
    public final void rule__EntryAction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1797:1: ( ( ( rule__EntryAction__EffectsAssignment_2_1 )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1798:1: ( ( rule__EntryAction__EffectsAssignment_2_1 )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1798:1: ( ( rule__EntryAction__EffectsAssignment_2_1 )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1799:1: ( rule__EntryAction__EffectsAssignment_2_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getEffectsAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1800:1: ( rule__EntryAction__EffectsAssignment_2_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred50()) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==RULE_STRING) ) {
                    int LA24_3 = input.LA(2);

                    if ( (synpred50()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1800:2: rule__EntryAction__EffectsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__EntryAction__EffectsAssignment_2_1_in_rule__EntryAction__Group_2__13923);
            	    rule__EntryAction__EffectsAssignment_2_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionAccess().getEffectsAssignment_2_1()); 
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
    // $ANTLR end rule__EntryAction__Group_2__1


    // $ANTLR start rule__ExitAction__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1814:1: rule__ExitAction__Group__0 : ( 'onexit' ) rule__ExitAction__Group__1 ;
    public final void rule__ExitAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1818:1: ( ( 'onexit' ) rule__ExitAction__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1819:1: ( 'onexit' ) rule__ExitAction__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1819:1: ( 'onexit' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1820:1: 'onexit'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getOnexitKeyword_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__ExitAction__Group__03963); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getOnexitKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ExitAction__Group__1_in_rule__ExitAction__Group__03973);
            rule__ExitAction__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__ExitAction__Group__0


    // $ANTLR start rule__ExitAction__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1834:1: rule__ExitAction__Group__1 : ( ( rule__ExitAction__TriggerAssignment_1 )? ) rule__ExitAction__Group__2 ;
    public final void rule__ExitAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1838:1: ( ( ( rule__ExitAction__TriggerAssignment_1 )? ) rule__ExitAction__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1839:1: ( ( rule__ExitAction__TriggerAssignment_1 )? ) rule__ExitAction__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1839:1: ( ( rule__ExitAction__TriggerAssignment_1 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1840:1: ( rule__ExitAction__TriggerAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getTriggerAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1841:1: ( rule__ExitAction__TriggerAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_INT && LA25_0<=RULE_BOOLEAN)||LA25_0==13||LA25_0==43) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                int LA25_2 = input.LA(2);

                if ( (synpred51()) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1841:2: rule__ExitAction__TriggerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ExitAction__TriggerAssignment_1_in_rule__ExitAction__Group__14001);
                    rule__ExitAction__TriggerAssignment_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getTriggerAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__ExitAction__Group__2_in_rule__ExitAction__Group__14011);
            rule__ExitAction__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__ExitAction__Group__1


    // $ANTLR start rule__ExitAction__Group__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1852:1: rule__ExitAction__Group__2 : ( ( rule__ExitAction__Group_2__0 )? ) ;
    public final void rule__ExitAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1856:1: ( ( ( rule__ExitAction__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1857:1: ( ( rule__ExitAction__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1857:1: ( ( rule__ExitAction__Group_2__0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1858:1: ( rule__ExitAction__Group_2__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1859:1: ( rule__ExitAction__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1859:2: rule__ExitAction__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExitAction__Group_2__0_in_rule__ExitAction__Group__24039);
                    rule__ExitAction__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getGroup_2()); 
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
    // $ANTLR end rule__ExitAction__Group__2


    // $ANTLR start rule__ExitAction__Group_2__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1875:1: rule__ExitAction__Group_2__0 : ( '/' ) rule__ExitAction__Group_2__1 ;
    public final void rule__ExitAction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1879:1: ( ( '/' ) rule__ExitAction__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1880:1: ( '/' ) rule__ExitAction__Group_2__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1880:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1881:1: '/'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getSolidusKeyword_2_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__ExitAction__Group_2__04081); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getSolidusKeyword_2_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ExitAction__Group_2__1_in_rule__ExitAction__Group_2__04091);
            rule__ExitAction__Group_2__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__ExitAction__Group_2__0


    // $ANTLR start rule__ExitAction__Group_2__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1895:1: rule__ExitAction__Group_2__1 : ( ( rule__ExitAction__EffectsAssignment_2_1 )* ) ;
    public final void rule__ExitAction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1899:1: ( ( ( rule__ExitAction__EffectsAssignment_2_1 )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1900:1: ( ( rule__ExitAction__EffectsAssignment_2_1 )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1900:1: ( ( rule__ExitAction__EffectsAssignment_2_1 )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1901:1: ( rule__ExitAction__EffectsAssignment_2_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getEffectsAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1902:1: ( rule__ExitAction__EffectsAssignment_2_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred53()) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==RULE_STRING) ) {
                    int LA27_3 = input.LA(2);

                    if ( (synpred53()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1902:2: rule__ExitAction__EffectsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__ExitAction__EffectsAssignment_2_1_in_rule__ExitAction__Group_2__14119);
            	    rule__ExitAction__EffectsAssignment_2_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getEffectsAssignment_2_1()); 
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
    // $ANTLR end rule__ExitAction__Group_2__1


    // $ANTLR start rule__InnerAction__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1916:1: rule__InnerAction__Group__0 : ( 'oninner' ) rule__InnerAction__Group__1 ;
    public final void rule__InnerAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1920:1: ( ( 'oninner' ) rule__InnerAction__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1921:1: ( 'oninner' ) rule__InnerAction__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1921:1: ( 'oninner' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1922:1: 'oninner'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getOninnerKeyword_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__InnerAction__Group__04159); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getOninnerKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__InnerAction__Group__1_in_rule__InnerAction__Group__04169);
            rule__InnerAction__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__InnerAction__Group__0


    // $ANTLR start rule__InnerAction__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1936:1: rule__InnerAction__Group__1 : ( ( rule__InnerAction__TriggerAssignment_1 )? ) rule__InnerAction__Group__2 ;
    public final void rule__InnerAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1940:1: ( ( ( rule__InnerAction__TriggerAssignment_1 )? ) rule__InnerAction__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1941:1: ( ( rule__InnerAction__TriggerAssignment_1 )? ) rule__InnerAction__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1941:1: ( ( rule__InnerAction__TriggerAssignment_1 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1942:1: ( rule__InnerAction__TriggerAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getTriggerAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1943:1: ( rule__InnerAction__TriggerAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_INT && LA28_0<=RULE_BOOLEAN)||LA28_0==13||LA28_0==43) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                int LA28_2 = input.LA(2);

                if ( (synpred54()) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1943:2: rule__InnerAction__TriggerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__InnerAction__TriggerAssignment_1_in_rule__InnerAction__Group__14197);
                    rule__InnerAction__TriggerAssignment_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getTriggerAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__InnerAction__Group__2_in_rule__InnerAction__Group__14207);
            rule__InnerAction__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__InnerAction__Group__1


    // $ANTLR start rule__InnerAction__Group__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1954:1: rule__InnerAction__Group__2 : ( ( rule__InnerAction__Group_2__0 )? ) ;
    public final void rule__InnerAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1958:1: ( ( ( rule__InnerAction__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1959:1: ( ( rule__InnerAction__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1959:1: ( ( rule__InnerAction__Group_2__0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1960:1: ( rule__InnerAction__Group_2__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1961:1: ( rule__InnerAction__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1961:2: rule__InnerAction__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__InnerAction__Group_2__0_in_rule__InnerAction__Group__24235);
                    rule__InnerAction__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getGroup_2()); 
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
    // $ANTLR end rule__InnerAction__Group__2


    // $ANTLR start rule__InnerAction__Group_2__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1977:1: rule__InnerAction__Group_2__0 : ( '/' ) rule__InnerAction__Group_2__1 ;
    public final void rule__InnerAction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1981:1: ( ( '/' ) rule__InnerAction__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1982:1: ( '/' ) rule__InnerAction__Group_2__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1982:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1983:1: '/'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getSolidusKeyword_2_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__InnerAction__Group_2__04277); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getSolidusKeyword_2_0()); 
            }

            }

            pushFollow(FOLLOW_rule__InnerAction__Group_2__1_in_rule__InnerAction__Group_2__04287);
            rule__InnerAction__Group_2__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__InnerAction__Group_2__0


    // $ANTLR start rule__InnerAction__Group_2__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1997:1: rule__InnerAction__Group_2__1 : ( ( rule__InnerAction__EffectsAssignment_2_1 )* ) ;
    public final void rule__InnerAction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2001:1: ( ( ( rule__InnerAction__EffectsAssignment_2_1 )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2002:1: ( ( rule__InnerAction__EffectsAssignment_2_1 )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2002:1: ( ( rule__InnerAction__EffectsAssignment_2_1 )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2003:1: ( rule__InnerAction__EffectsAssignment_2_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getEffectsAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2004:1: ( rule__InnerAction__EffectsAssignment_2_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred56()) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==RULE_STRING) ) {
                    int LA30_3 = input.LA(2);

                    if ( (synpred56()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2004:2: rule__InnerAction__EffectsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__InnerAction__EffectsAssignment_2_1_in_rule__InnerAction__Group_2__14315);
            	    rule__InnerAction__EffectsAssignment_2_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getEffectsAssignment_2_1()); 
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
    // $ANTLR end rule__InnerAction__Group_2__1


    // $ANTLR start rule__Transition__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2018:1: rule__Transition__Group__0 : ( ( rule__Transition__SourceStateNameAssignment_0 )? ) rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2022:1: ( ( ( rule__Transition__SourceStateNameAssignment_0 )? ) rule__Transition__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2023:1: ( ( rule__Transition__SourceStateNameAssignment_0 )? ) rule__Transition__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2023:1: ( ( rule__Transition__SourceStateNameAssignment_0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2024:1: ( rule__Transition__SourceStateNameAssignment_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getSourceStateNameAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2025:1: ( rule__Transition__SourceStateNameAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2025:2: rule__Transition__SourceStateNameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Transition__SourceStateNameAssignment_0_in_rule__Transition__Group__04354);
                    rule__Transition__SourceStateNameAssignment_0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getSourceStateNameAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__04364);
            rule__Transition__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Transition__Group__0


    // $ANTLR start rule__Transition__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2036:1: rule__Transition__Group__1 : ( ( rule__Transition__TransitionTypeAssignment_1 ) ) rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2040:1: ( ( ( rule__Transition__TransitionTypeAssignment_1 ) ) rule__Transition__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2041:1: ( ( rule__Transition__TransitionTypeAssignment_1 ) ) rule__Transition__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2041:1: ( ( rule__Transition__TransitionTypeAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2042:1: ( rule__Transition__TransitionTypeAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTransitionTypeAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2043:1: ( rule__Transition__TransitionTypeAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2043:2: rule__Transition__TransitionTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Transition__TransitionTypeAssignment_1_in_rule__Transition__Group__14392);
            rule__Transition__TransitionTypeAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTransitionTypeAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__14401);
            rule__Transition__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Transition__Group__1


    // $ANTLR start rule__Transition__Group__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2054:1: rule__Transition__Group__2 : ( ( rule__Transition__Alternatives_2 ) ) rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2058:1: ( ( ( rule__Transition__Alternatives_2 ) ) rule__Transition__Group__3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2059:1: ( ( rule__Transition__Alternatives_2 ) ) rule__Transition__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2059:1: ( ( rule__Transition__Alternatives_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2060:1: ( rule__Transition__Alternatives_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2061:1: ( rule__Transition__Alternatives_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2061:2: rule__Transition__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Transition__Alternatives_2_in_rule__Transition__Group__24429);
            rule__Transition__Alternatives_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getAlternatives_2()); 
            }

            }

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__24438);
            rule__Transition__Group__3();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Transition__Group__2


    // $ANTLR start rule__Transition__Group__3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2072:1: rule__Transition__Group__3 : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2076:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2077:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2077:1: ( ( rule__Transition__Group_3__0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2078:1: ( rule__Transition__Group_3__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2079:1: ( rule__Transition__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2079:2: rule__Transition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__34466);
                    rule__Transition__Group_3__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGroup_3()); 
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
    // $ANTLR end rule__Transition__Group__3


    // $ANTLR start rule__Transition__Group_3__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2097:1: rule__Transition__Group_3__0 : ( 'with' ) rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2101:1: ( ( 'with' ) rule__Transition__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2102:1: ( 'with' ) rule__Transition__Group_3__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2102:1: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2103:1: 'with'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getWithKeyword_3_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Transition__Group_3__04510); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getWithKeyword_3_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__04520);
            rule__Transition__Group_3__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Transition__Group_3__0


    // $ANTLR start rule__Transition__Group_3__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2117:1: rule__Transition__Group_3__1 : ( ( rule__Transition__TransitionLabelAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2121:1: ( ( ( rule__Transition__TransitionLabelAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2122:1: ( ( rule__Transition__TransitionLabelAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2122:1: ( ( rule__Transition__TransitionLabelAssignment_3_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2123:1: ( rule__Transition__TransitionLabelAssignment_3_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTransitionLabelAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2124:1: ( rule__Transition__TransitionLabelAssignment_3_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2124:2: rule__Transition__TransitionLabelAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Transition__TransitionLabelAssignment_3_1_in_rule__Transition__Group_3__14548);
            rule__Transition__TransitionLabelAssignment_3_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTransitionLabelAssignment_3_1()); 
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
    // $ANTLR end rule__Transition__Group_3__1


    // $ANTLR start rule__DeclaredTargetState__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2138:1: rule__DeclaredTargetState__Group__0 : ( ( rule__DeclaredTargetState__IsInitialAssignment_0 )? ) rule__DeclaredTargetState__Group__1 ;
    public final void rule__DeclaredTargetState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2142:1: ( ( ( rule__DeclaredTargetState__IsInitialAssignment_0 )? ) rule__DeclaredTargetState__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2143:1: ( ( rule__DeclaredTargetState__IsInitialAssignment_0 )? ) rule__DeclaredTargetState__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2143:1: ( ( rule__DeclaredTargetState__IsInitialAssignment_0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2144:1: ( rule__DeclaredTargetState__IsInitialAssignment_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaredTargetStateAccess().getIsInitialAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2145:1: ( rule__DeclaredTargetState__IsInitialAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2145:2: rule__DeclaredTargetState__IsInitialAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DeclaredTargetState__IsInitialAssignment_0_in_rule__DeclaredTargetState__Group__04586);
                    rule__DeclaredTargetState__IsInitialAssignment_0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaredTargetStateAccess().getIsInitialAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__DeclaredTargetState__Group__1_in_rule__DeclaredTargetState__Group__04596);
            rule__DeclaredTargetState__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__DeclaredTargetState__Group__0


    // $ANTLR start rule__DeclaredTargetState__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2156:1: rule__DeclaredTargetState__Group__1 : ( ( rule__DeclaredTargetState__IsFinalAssignment_1 )? ) rule__DeclaredTargetState__Group__2 ;
    public final void rule__DeclaredTargetState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2160:1: ( ( ( rule__DeclaredTargetState__IsFinalAssignment_1 )? ) rule__DeclaredTargetState__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2161:1: ( ( rule__DeclaredTargetState__IsFinalAssignment_1 )? ) rule__DeclaredTargetState__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2161:1: ( ( rule__DeclaredTargetState__IsFinalAssignment_1 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2162:1: ( rule__DeclaredTargetState__IsFinalAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaredTargetStateAccess().getIsFinalAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2163:1: ( rule__DeclaredTargetState__IsFinalAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2163:2: rule__DeclaredTargetState__IsFinalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__DeclaredTargetState__IsFinalAssignment_1_in_rule__DeclaredTargetState__Group__14624);
                    rule__DeclaredTargetState__IsFinalAssignment_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaredTargetStateAccess().getIsFinalAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__DeclaredTargetState__Group__2_in_rule__DeclaredTargetState__Group__14634);
            rule__DeclaredTargetState__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__DeclaredTargetState__Group__1


    // $ANTLR start rule__DeclaredTargetState__Group__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2174:1: rule__DeclaredTargetState__Group__2 : ( 'state' ) rule__DeclaredTargetState__Group__3 ;
    public final void rule__DeclaredTargetState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2178:1: ( ( 'state' ) rule__DeclaredTargetState__Group__3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2179:1: ( 'state' ) rule__DeclaredTargetState__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2179:1: ( 'state' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2180:1: 'state'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaredTargetStateAccess().getStateKeyword_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__DeclaredTargetState__Group__24663); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaredTargetStateAccess().getStateKeyword_2()); 
            }

            }

            pushFollow(FOLLOW_rule__DeclaredTargetState__Group__3_in_rule__DeclaredTargetState__Group__24673);
            rule__DeclaredTargetState__Group__3();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__DeclaredTargetState__Group__2


    // $ANTLR start rule__DeclaredTargetState__Group__3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2194:1: rule__DeclaredTargetState__Group__3 : ( ( rule__DeclaredTargetState__DeclaredStateTypeAssignment_3 )? ) rule__DeclaredTargetState__Group__4 ;
    public final void rule__DeclaredTargetState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2198:1: ( ( ( rule__DeclaredTargetState__DeclaredStateTypeAssignment_3 )? ) rule__DeclaredTargetState__Group__4 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2199:1: ( ( rule__DeclaredTargetState__DeclaredStateTypeAssignment_3 )? ) rule__DeclaredTargetState__Group__4
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2199:1: ( ( rule__DeclaredTargetState__DeclaredStateTypeAssignment_3 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2200:1: ( rule__DeclaredTargetState__DeclaredStateTypeAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaredTargetStateAccess().getDeclaredStateTypeAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2201:1: ( rule__DeclaredTargetState__DeclaredStateTypeAssignment_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=17 && LA35_0<=19)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2201:2: rule__DeclaredTargetState__DeclaredStateTypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__DeclaredTargetState__DeclaredStateTypeAssignment_3_in_rule__DeclaredTargetState__Group__34701);
                    rule__DeclaredTargetState__DeclaredStateTypeAssignment_3();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaredTargetStateAccess().getDeclaredStateTypeAssignment_3()); 
            }

            }

            pushFollow(FOLLOW_rule__DeclaredTargetState__Group__4_in_rule__DeclaredTargetState__Group__34711);
            rule__DeclaredTargetState__Group__4();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__DeclaredTargetState__Group__3


    // $ANTLR start rule__DeclaredTargetState__Group__4
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2212:1: rule__DeclaredTargetState__Group__4 : ( ( rule__DeclaredTargetState__DeclaredStateNameAssignment_4 ) ) ;
    public final void rule__DeclaredTargetState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2216:1: ( ( ( rule__DeclaredTargetState__DeclaredStateNameAssignment_4 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2217:1: ( ( rule__DeclaredTargetState__DeclaredStateNameAssignment_4 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2217:1: ( ( rule__DeclaredTargetState__DeclaredStateNameAssignment_4 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2218:1: ( rule__DeclaredTargetState__DeclaredStateNameAssignment_4 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaredTargetStateAccess().getDeclaredStateNameAssignment_4()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2219:1: ( rule__DeclaredTargetState__DeclaredStateNameAssignment_4 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2219:2: rule__DeclaredTargetState__DeclaredStateNameAssignment_4
            {
            pushFollow(FOLLOW_rule__DeclaredTargetState__DeclaredStateNameAssignment_4_in_rule__DeclaredTargetState__Group__44739);
            rule__DeclaredTargetState__DeclaredStateNameAssignment_4();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaredTargetStateAccess().getDeclaredStateNameAssignment_4()); 
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
    // $ANTLR end rule__DeclaredTargetState__Group__4


    // $ANTLR start rule__Emission__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2241:1: rule__Emission__Group__0 : ( ( rule__Emission__SignalAssignment_0 ) ) rule__Emission__Group__1 ;
    public final void rule__Emission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2245:1: ( ( ( rule__Emission__SignalAssignment_0 ) ) rule__Emission__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2246:1: ( ( rule__Emission__SignalAssignment_0 ) ) rule__Emission__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2246:1: ( ( rule__Emission__SignalAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2247:1: ( rule__Emission__SignalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2248:1: ( rule__Emission__SignalAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2248:2: rule__Emission__SignalAssignment_0
            {
            pushFollow(FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__04785);
            rule__Emission__SignalAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getSignalAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__04794);
            rule__Emission__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Emission__Group__0


    // $ANTLR start rule__Emission__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2259:1: rule__Emission__Group__1 : ( ( rule__Emission__Group_1__0 )? ) ;
    public final void rule__Emission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2263:1: ( ( ( rule__Emission__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2264:1: ( ( rule__Emission__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2264:1: ( ( rule__Emission__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2265:1: ( rule__Emission__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2266:1: ( rule__Emission__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2266:2: rule__Emission__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Emission__Group_1__0_in_rule__Emission__Group__14822);
                    rule__Emission__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getGroup_1()); 
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
    // $ANTLR end rule__Emission__Group__1


    // $ANTLR start rule__Emission__Group_1__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2280:1: rule__Emission__Group_1__0 : ( '(' ) rule__Emission__Group_1__1 ;
    public final void rule__Emission__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2284:1: ( ( '(' ) rule__Emission__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2285:1: ( '(' ) rule__Emission__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2285:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2286:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__Emission__Group_1__04862); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Emission__Group_1__1_in_rule__Emission__Group_1__04872);
            rule__Emission__Group_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Emission__Group_1__0


    // $ANTLR start rule__Emission__Group_1__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2300:1: rule__Emission__Group_1__1 : ( ( rule__Emission__NewValueAssignment_1_1 ) ) rule__Emission__Group_1__2 ;
    public final void rule__Emission__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2304:1: ( ( ( rule__Emission__NewValueAssignment_1_1 ) ) rule__Emission__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2305:1: ( ( rule__Emission__NewValueAssignment_1_1 ) ) rule__Emission__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2305:1: ( ( rule__Emission__NewValueAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2306:1: ( rule__Emission__NewValueAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2307:1: ( rule__Emission__NewValueAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2307:2: rule__Emission__NewValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_1_in_rule__Emission__Group_1__14900);
            rule__Emission__NewValueAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Emission__Group_1__2_in_rule__Emission__Group_1__14909);
            rule__Emission__Group_1__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Emission__Group_1__1


    // $ANTLR start rule__Emission__Group_1__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2318:1: rule__Emission__Group_1__2 : ( ')' ) ;
    public final void rule__Emission__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2322:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2323:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2323:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2324:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,44,FOLLOW_44_in_rule__Emission__Group_1__24938); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_2()); 
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
    // $ANTLR end rule__Emission__Group_1__2


    // $ANTLR start rule__Assignment__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2343:1: rule__Assignment__Group__0 : ( ( rule__Assignment__VariableAssignment_0 ) ) rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2347:1: ( ( ( rule__Assignment__VariableAssignment_0 ) ) rule__Assignment__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2348:1: ( ( rule__Assignment__VariableAssignment_0 ) ) rule__Assignment__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2348:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2349:1: ( rule__Assignment__VariableAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2350:1: ( rule__Assignment__VariableAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2350:2: rule__Assignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__04979);
            rule__Assignment__VariableAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04988);
            rule__Assignment__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Assignment__Group__0


    // $ANTLR start rule__Assignment__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2361:1: rule__Assignment__Group__1 : ( ':=' ) rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2365:1: ( ( ':=' ) rule__Assignment__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2366:1: ( ':=' ) rule__Assignment__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2366:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2367:1: ':='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__Assignment__Group__15017); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__15027);
            rule__Assignment__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Assignment__Group__1


    // $ANTLR start rule__Assignment__Group__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2381:1: rule__Assignment__Group__2 : ( ( rule__Assignment__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2385:1: ( ( ( rule__Assignment__ExpressionAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2386:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2386:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2387:1: ( rule__Assignment__ExpressionAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2388:1: ( rule__Assignment__ExpressionAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2388:2: rule__Assignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_in_rule__Assignment__Group__25055);
            rule__Assignment__ExpressionAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
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
    // $ANTLR end rule__Assignment__Group__2


    // $ANTLR start rule__Signal__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2404:1: rule__Signal__Group__0 : ( 'input' ) rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2408:1: ( ( 'input' ) rule__Signal__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2409:1: ( 'input' ) rule__Signal__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2409:1: ( 'input' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2410:1: 'input'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getInputKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Signal__Group__05096); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getInputKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__05106);
            rule__Signal__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Signal__Group__0


    // $ANTLR start rule__Signal__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2424:1: rule__Signal__Group__1 : ( ( rule__Signal__NameAssignment_1 ) ) rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2428:1: ( ( ( rule__Signal__NameAssignment_1 ) ) rule__Signal__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2429:1: ( ( rule__Signal__NameAssignment_1 ) ) rule__Signal__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2429:1: ( ( rule__Signal__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2430:1: ( rule__Signal__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2431:1: ( rule__Signal__NameAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2431:2: rule__Signal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_1_in_rule__Signal__Group__15134);
            rule__Signal__NameAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getNameAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Signal__Group__2_in_rule__Signal__Group__15143);
            rule__Signal__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Signal__Group__1


    // $ANTLR start rule__Signal__Group__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2442:1: rule__Signal__Group__2 : ( ( rule__Signal__Group_2__0 )? ) rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2446:1: ( ( ( rule__Signal__Group_2__0 )? ) rule__Signal__Group__3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2447:1: ( ( rule__Signal__Group_2__0 )? ) rule__Signal__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2447:1: ( ( rule__Signal__Group_2__0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2448:1: ( rule__Signal__Group_2__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2449:1: ( rule__Signal__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2449:2: rule__Signal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_2__0_in_rule__Signal__Group__25171);
                    rule__Signal__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getGroup_2()); 
            }

            }

            pushFollow(FOLLOW_rule__Signal__Group__3_in_rule__Signal__Group__25181);
            rule__Signal__Group__3();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Signal__Group__2


    // $ANTLR start rule__Signal__Group__3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2460:1: rule__Signal__Group__3 : ( ';' ) ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2464:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2465:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2465:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2466:1: ';'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getSemicolonKeyword_3()); 
            }
            match(input,47,FOLLOW_47_in_rule__Signal__Group__35210); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end rule__Signal__Group__3


    // $ANTLR start rule__Signal__Group_2__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2487:1: rule__Signal__Group_2__0 : ( ':=' ) rule__Signal__Group_2__1 ;
    public final void rule__Signal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2491:1: ( ( ':=' ) rule__Signal__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2492:1: ( ':=' ) rule__Signal__Group_2__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2492:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2493:1: ':='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Signal__Group_2__05254); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Signal__Group_2__1_in_rule__Signal__Group_2__05264);
            rule__Signal__Group_2__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Signal__Group_2__0


    // $ANTLR start rule__Signal__Group_2__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2507:1: rule__Signal__Group_2__1 : ( ( rule__Signal__InitialValueAssignment_2_1 ) ) ;
    public final void rule__Signal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2511:1: ( ( ( rule__Signal__InitialValueAssignment_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2512:1: ( ( rule__Signal__InitialValueAssignment_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2512:1: ( ( rule__Signal__InitialValueAssignment_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2513:1: ( rule__Signal__InitialValueAssignment_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getInitialValueAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2514:1: ( rule__Signal__InitialValueAssignment_2_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2514:2: rule__Signal__InitialValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_2_1_in_rule__Signal__Group_2__15292);
            rule__Signal__InitialValueAssignment_2_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getInitialValueAssignment_2_1()); 
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
    // $ANTLR end rule__Signal__Group_2__1


    // $ANTLR start rule__Variable__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2528:1: rule__Variable__Group__0 : ( 'var' ) rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2532:1: ( ( 'var' ) rule__Variable__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2533:1: ( 'var' ) rule__Variable__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2533:1: ( 'var' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2534:1: 'var'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__Variable__Group__05331); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__05341);
            rule__Variable__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Variable__Group__0


    // $ANTLR start rule__Variable__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2548:1: rule__Variable__Group__1 : ( ( rule__Variable__NameAssignment_1 ) ) rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2552:1: ( ( ( rule__Variable__NameAssignment_1 ) ) rule__Variable__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2553:1: ( ( rule__Variable__NameAssignment_1 ) ) rule__Variable__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2553:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2554:1: ( rule__Variable__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2555:1: ( rule__Variable__NameAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2555:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__15369);
            rule__Variable__NameAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__15378);
            rule__Variable__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Variable__Group__1


    // $ANTLR start rule__Variable__Group__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2566:1: rule__Variable__Group__2 : ( ( rule__Variable__Group_2__0 )? ) rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2570:1: ( ( ( rule__Variable__Group_2__0 )? ) rule__Variable__Group__3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2571:1: ( ( rule__Variable__Group_2__0 )? ) rule__Variable__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2571:1: ( ( rule__Variable__Group_2__0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2572:1: ( rule__Variable__Group_2__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2573:1: ( rule__Variable__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2573:2: rule__Variable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Group__25406);
                    rule__Variable__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getGroup_2()); 
            }

            }

            pushFollow(FOLLOW_rule__Variable__Group__3_in_rule__Variable__Group__25416);
            rule__Variable__Group__3();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Variable__Group__2


    // $ANTLR start rule__Variable__Group__3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2584:1: rule__Variable__Group__3 : ( ';' ) ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2588:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2589:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2589:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2590:1: ';'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getSemicolonKeyword_3()); 
            }
            match(input,47,FOLLOW_47_in_rule__Variable__Group__35445); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end rule__Variable__Group__3


    // $ANTLR start rule__Variable__Group_2__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2611:1: rule__Variable__Group_2__0 : ( ':=' ) rule__Variable__Group_2__1 ;
    public final void rule__Variable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2615:1: ( ( ':=' ) rule__Variable__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2616:1: ( ':=' ) rule__Variable__Group_2__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2616:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2617:1: ':='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Variable__Group_2__05489); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__05499);
            rule__Variable__Group_2__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Variable__Group_2__0


    // $ANTLR start rule__Variable__Group_2__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2631:1: rule__Variable__Group_2__1 : ( ( rule__Variable__InitialValueAssignment_2_1 ) ) ;
    public final void rule__Variable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2635:1: ( ( ( rule__Variable__InitialValueAssignment_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2636:1: ( ( rule__Variable__InitialValueAssignment_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2636:1: ( ( rule__Variable__InitialValueAssignment_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2637:1: ( rule__Variable__InitialValueAssignment_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getInitialValueAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2638:1: ( rule__Variable__InitialValueAssignment_2_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2638:2: rule__Variable__InitialValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Variable__InitialValueAssignment_2_1_in_rule__Variable__Group_2__15527);
            rule__Variable__InitialValueAssignment_2_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getInitialValueAssignment_2_1()); 
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
    // $ANTLR end rule__Variable__Group_2__1


    // $ANTLR start rule__ValOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2652:1: rule__ValOperation__Group__0 : ( ( rule__ValOperation__OperatorAssignment_0 ) ) rule__ValOperation__Group__1 ;
    public final void rule__ValOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2656:1: ( ( ( rule__ValOperation__OperatorAssignment_0 ) ) rule__ValOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2657:1: ( ( rule__ValOperation__OperatorAssignment_0 ) ) rule__ValOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2657:1: ( ( rule__ValOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2658:1: ( rule__ValOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2659:1: ( rule__ValOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2659:2: rule__ValOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__ValOperation__OperatorAssignment_0_in_rule__ValOperation__Group__05565);
            rule__ValOperation__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValOperationAccess().getOperatorAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ValOperation__Group__1_in_rule__ValOperation__Group__05574);
            rule__ValOperation__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__ValOperation__Group__0


    // $ANTLR start rule__ValOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2670:1: rule__ValOperation__Group__1 : ( ( rule__ValOperation__SubExpressionsAssignment_1 ) ) ;
    public final void rule__ValOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2674:1: ( ( ( rule__ValOperation__SubExpressionsAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2675:1: ( ( rule__ValOperation__SubExpressionsAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2675:1: ( ( rule__ValOperation__SubExpressionsAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2676:1: ( rule__ValOperation__SubExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getSubExpressionsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2677:1: ( rule__ValOperation__SubExpressionsAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2677:2: rule__ValOperation__SubExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__ValOperation__SubExpressionsAssignment_1_in_rule__ValOperation__Group__15602);
            rule__ValOperation__SubExpressionsAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValOperationAccess().getSubExpressionsAssignment_1()); 
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
    // $ANTLR end rule__ValOperation__Group__1


    // $ANTLR start rule__CompareOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2691:1: rule__CompareOperation__Group__0 : ( ruleValueExpression ) rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2695:1: ( ( ruleValueExpression ) rule__CompareOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2696:1: ( ruleValueExpression ) rule__CompareOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2696:1: ( ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2697:1: ruleValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__CompareOperation__Group__05640);
            ruleValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__05648);
            rule__CompareOperation__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__CompareOperation__Group__0


    // $ANTLR start rule__CompareOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2709:1: rule__CompareOperation__Group__1 : ( ( rule__CompareOperation__Group_1__0 ) ) ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2713:1: ( ( ( rule__CompareOperation__Group_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2714:1: ( ( rule__CompareOperation__Group_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2714:1: ( ( rule__CompareOperation__Group_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2715:1: ( rule__CompareOperation__Group_1__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2716:1: ( rule__CompareOperation__Group_1__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2716:2: rule__CompareOperation__Group_1__0
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__15676);
            rule__CompareOperation__Group_1__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getGroup_1()); 
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
    // $ANTLR end rule__CompareOperation__Group__1


    // $ANTLR start rule__CompareOperation__Group_1__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2730:1: rule__CompareOperation__Group_1__0 : ( () ) rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2734:1: ( ( () ) rule__CompareOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2735:1: ( () ) rule__CompareOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2735:1: ( () )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2736:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperationSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2737:1: ()
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2739:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getOperationSubExpressionsAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__05724);
            rule__CompareOperation__Group_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__CompareOperation__Group_1__0


    // $ANTLR start rule__CompareOperation__Group_1__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2750:1: rule__CompareOperation__Group_1__1 : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2754:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) rule__CompareOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2755:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) rule__CompareOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2755:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2756:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2757:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2757:2: rule__CompareOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__15752);
            rule__CompareOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__15761);
            rule__CompareOperation__Group_1__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__CompareOperation__Group_1__1


    // $ANTLR start rule__CompareOperation__Group_1__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2768:1: rule__CompareOperation__Group_1__2 : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2772:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2773:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2773:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2774:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2775:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2775:2: rule__CompareOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__25789);
            rule__CompareOperation__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
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
    // $ANTLR end rule__CompareOperation__Group_1__2


    // $ANTLR start rule__NotOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2791:1: rule__NotOperation__Group__0 : ( ( rule__NotOperation__OperatorsAssignment_0 ) ) rule__NotOperation__Group__1 ;
    public final void rule__NotOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2795:1: ( ( ( rule__NotOperation__OperatorsAssignment_0 ) ) rule__NotOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2796:1: ( ( rule__NotOperation__OperatorsAssignment_0 ) ) rule__NotOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2796:1: ( ( rule__NotOperation__OperatorsAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2797:1: ( rule__NotOperation__OperatorsAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOperationAccess().getOperatorsAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2798:1: ( rule__NotOperation__OperatorsAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2798:2: rule__NotOperation__OperatorsAssignment_0
            {
            pushFollow(FOLLOW_rule__NotOperation__OperatorsAssignment_0_in_rule__NotOperation__Group__05829);
            rule__NotOperation__OperatorsAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotOperationAccess().getOperatorsAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__NotOperation__Group__1_in_rule__NotOperation__Group__05838);
            rule__NotOperation__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__NotOperation__Group__0


    // $ANTLR start rule__NotOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2809:1: rule__NotOperation__Group__1 : ( ( rule__NotOperation__SubExpressionsAssignment_1 ) ) ;
    public final void rule__NotOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2813:1: ( ( ( rule__NotOperation__SubExpressionsAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2814:1: ( ( rule__NotOperation__SubExpressionsAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2814:1: ( ( rule__NotOperation__SubExpressionsAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2815:1: ( rule__NotOperation__SubExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOperationAccess().getSubExpressionsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2816:1: ( rule__NotOperation__SubExpressionsAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2816:2: rule__NotOperation__SubExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__NotOperation__SubExpressionsAssignment_1_in_rule__NotOperation__Group__15866);
            rule__NotOperation__SubExpressionsAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotOperationAccess().getSubExpressionsAssignment_1()); 
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
    // $ANTLR end rule__NotOperation__Group__1


    // $ANTLR start rule__AndOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2830:1: rule__AndOperation__Group__0 : ( ruleNotOrNormalExpression ) rule__AndOperation__Group__1 ;
    public final void rule__AndOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2834:1: ( ( ruleNotOrNormalExpression ) rule__AndOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2835:1: ( ruleNotOrNormalExpression ) rule__AndOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2835:1: ( ruleNotOrNormalExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2836:1: ruleNotOrNormalExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getNotOrNormalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNotOrNormalExpression_in_rule__AndOperation__Group__05904);
            ruleNotOrNormalExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getNotOrNormalExpressionParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__AndOperation__Group__1_in_rule__AndOperation__Group__05912);
            rule__AndOperation__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__AndOperation__Group__0


    // $ANTLR start rule__AndOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2848:1: rule__AndOperation__Group__1 : ( ( rule__AndOperation__Group_1__0 )* ) ;
    public final void rule__AndOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2852:1: ( ( ( rule__AndOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2853:1: ( ( rule__AndOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2853:1: ( ( rule__AndOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2854:1: ( rule__AndOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2855:1: ( rule__AndOperation__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==16) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2855:2: rule__AndOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndOperation__Group_1__0_in_rule__AndOperation__Group__15940);
            	    rule__AndOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getGroup_1()); 
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
    // $ANTLR end rule__AndOperation__Group__1


    // $ANTLR start rule__AndOperation__Group_1__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2869:1: rule__AndOperation__Group_1__0 : ( () ) rule__AndOperation__Group_1__1 ;
    public final void rule__AndOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2873:1: ( ( () ) rule__AndOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2874:1: ( () ) rule__AndOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2874:1: ( () )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2875:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperationSubExpressionAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2876:1: ()
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2878:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getOperationSubExpressionAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__AndOperation__Group_1__1_in_rule__AndOperation__Group_1__05989);
            rule__AndOperation__Group_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__AndOperation__Group_1__0


    // $ANTLR start rule__AndOperation__Group_1__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2889:1: rule__AndOperation__Group_1__1 : ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) rule__AndOperation__Group_1__2 ;
    public final void rule__AndOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2893:1: ( ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) rule__AndOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2894:1: ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) rule__AndOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2894:1: ( ( rule__AndOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2895:1: ( rule__AndOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2896:1: ( rule__AndOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2896:2: rule__AndOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndOperation__OperatorAssignment_1_1_in_rule__AndOperation__Group_1__16017);
            rule__AndOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__AndOperation__Group_1__2_in_rule__AndOperation__Group_1__16026);
            rule__AndOperation__Group_1__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__AndOperation__Group_1__1


    // $ANTLR start rule__AndOperation__Group_1__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2907:1: rule__AndOperation__Group_1__2 : ( ( rule__AndOperation__SubExpressionAssignment_1_2 ) ) ;
    public final void rule__AndOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2911:1: ( ( ( rule__AndOperation__SubExpressionAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2912:1: ( ( rule__AndOperation__SubExpressionAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2912:1: ( ( rule__AndOperation__SubExpressionAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2913:1: ( rule__AndOperation__SubExpressionAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getSubExpressionAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2914:1: ( rule__AndOperation__SubExpressionAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2914:2: rule__AndOperation__SubExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndOperation__SubExpressionAssignment_1_2_in_rule__AndOperation__Group_1__26054);
            rule__AndOperation__SubExpressionAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getSubExpressionAssignment_1_2()); 
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
    // $ANTLR end rule__AndOperation__Group_1__2


    // $ANTLR start rule__OrOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2930:1: rule__OrOperation__Group__0 : ( ruleAndOperation ) rule__OrOperation__Group__1 ;
    public final void rule__OrOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2934:1: ( ( ruleAndOperation ) rule__OrOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2935:1: ( ruleAndOperation ) rule__OrOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2935:1: ( ruleAndOperation )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2936:1: ruleAndOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_rule__OrOperation__Group__06094);
            ruleAndOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__OrOperation__Group__1_in_rule__OrOperation__Group__06102);
            rule__OrOperation__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__OrOperation__Group__0


    // $ANTLR start rule__OrOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2948:1: rule__OrOperation__Group__1 : ( ( rule__OrOperation__Group_1__0 )* ) ;
    public final void rule__OrOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2952:1: ( ( ( rule__OrOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2953:1: ( ( rule__OrOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2953:1: ( ( rule__OrOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2954:1: ( rule__OrOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2955:1: ( rule__OrOperation__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==15) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2955:2: rule__OrOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrOperation__Group_1__0_in_rule__OrOperation__Group__16130);
            	    rule__OrOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getGroup_1()); 
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
    // $ANTLR end rule__OrOperation__Group__1


    // $ANTLR start rule__OrOperation__Group_1__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2969:1: rule__OrOperation__Group_1__0 : ( () ) rule__OrOperation__Group_1__1 ;
    public final void rule__OrOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2973:1: ( ( () ) rule__OrOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2974:1: ( () ) rule__OrOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2974:1: ( () )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2975:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperationSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2976:1: ()
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2978:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getOperationSubExpressionsAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__OrOperation__Group_1__1_in_rule__OrOperation__Group_1__06179);
            rule__OrOperation__Group_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__OrOperation__Group_1__0


    // $ANTLR start rule__OrOperation__Group_1__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2989:1: rule__OrOperation__Group_1__1 : ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) rule__OrOperation__Group_1__2 ;
    public final void rule__OrOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2993:1: ( ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) rule__OrOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2994:1: ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) rule__OrOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2994:1: ( ( rule__OrOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2995:1: ( rule__OrOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2996:1: ( rule__OrOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2996:2: rule__OrOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrOperation__OperatorAssignment_1_1_in_rule__OrOperation__Group_1__16207);
            rule__OrOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__OrOperation__Group_1__2_in_rule__OrOperation__Group_1__16216);
            rule__OrOperation__Group_1__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__OrOperation__Group_1__1


    // $ANTLR start rule__OrOperation__Group_1__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3007:1: rule__OrOperation__Group_1__2 : ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3011:1: ( ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3012:1: ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3012:1: ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3013:1: ( rule__OrOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3014:1: ( rule__OrOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3014:2: rule__OrOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrOperation__SubExpressionsAssignment_1_2_in_rule__OrOperation__Group_1__26244);
            rule__OrOperation__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getSubExpressionsAssignment_1_2()); 
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
    // $ANTLR end rule__OrOperation__Group_1__2


    // $ANTLR start rule__BooleanExpression__Group_3__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3030:1: rule__BooleanExpression__Group_3__0 : ( '(' ) rule__BooleanExpression__Group_3__1 ;
    public final void rule__BooleanExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3034:1: ( ( '(' ) rule__BooleanExpression__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3035:1: ( '(' ) rule__BooleanExpression__Group_3__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3035:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3036:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__BooleanExpression__Group_3__06285); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }

            pushFollow(FOLLOW_rule__BooleanExpression__Group_3__1_in_rule__BooleanExpression__Group_3__06295);
            rule__BooleanExpression__Group_3__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__BooleanExpression__Group_3__0


    // $ANTLR start rule__BooleanExpression__Group_3__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3050:1: rule__BooleanExpression__Group_3__1 : ( ruleOrOperation ) rule__BooleanExpression__Group_3__2 ;
    public final void rule__BooleanExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3054:1: ( ( ruleOrOperation ) rule__BooleanExpression__Group_3__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3055:1: ( ruleOrOperation ) rule__BooleanExpression__Group_3__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3055:1: ( ruleOrOperation )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3056:1: ruleOrOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall_3_1()); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_rule__BooleanExpression__Group_3__16323);
            ruleOrOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall_3_1()); 
            }

            }

            pushFollow(FOLLOW_rule__BooleanExpression__Group_3__2_in_rule__BooleanExpression__Group_3__16331);
            rule__BooleanExpression__Group_3__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__BooleanExpression__Group_3__1


    // $ANTLR start rule__BooleanExpression__Group_3__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3068:1: rule__BooleanExpression__Group_3__2 : ( ')' ) ;
    public final void rule__BooleanExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3072:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3073:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3073:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3074:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,44,FOLLOW_44_in_rule__BooleanExpression__Group_3__26360); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getRightParenthesisKeyword_3_2()); 
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
    // $ANTLR end rule__BooleanExpression__Group_3__2


    // $ANTLR start rule__State__IsInitialAssignment_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3093:1: rule__State__IsInitialAssignment_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3097:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3098:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3098:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3099:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3100:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3101:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__State__IsInitialAssignment_06406); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0


    // $ANTLR start rule__State__IsFinalAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3116:1: rule__State__IsFinalAssignment_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3120:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3121:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3121:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3122:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3123:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3124:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__State__IsFinalAssignment_16450); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_1


    // $ANTLR start rule__State__StateKindAssignment_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3139:1: rule__State__StateKindAssignment_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3143:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3144:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3144:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3145:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_26489);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_2_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_2


    // $ANTLR start rule__State__StateNameAssignment_4
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3154:1: rule__State__StateNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__State__StateNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3158:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3159:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3159:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3160:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__StateNameAssignment_46520); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateNameIDTerminalRuleCall_4_0()); 
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
    // $ANTLR end rule__State__StateNameAssignment_4


    // $ANTLR start rule__State__LabelAssignment_5
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3169:1: rule__State__LabelAssignment_5 : ( RULE_STRING ) ;
    public final void rule__State__LabelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3173:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3174:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3174:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3175:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_5_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__LabelAssignment_56551); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_5_0()); 
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
    // $ANTLR end rule__State__LabelAssignment_5


    // $ANTLR start rule__State__StateContentAssignment_6
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3184:1: rule__State__StateContentAssignment_6 : ( ruleStateContent ) ;
    public final void rule__State__StateContentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3188:1: ( ( ruleStateContent ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3189:1: ( ruleStateContent )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3189:1: ( ruleStateContent )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3190:1: ruleStateContent
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateContentStateContentParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleStateContent_in_rule__State__StateContentAssignment_66582);
            ruleStateContent();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateContentStateContentParserRuleCall_6_0()); 
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
    // $ANTLR end rule__State__StateContentAssignment_6


    // $ANTLR start rule__State__OutgoingTransitionsAssignment_7
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3199:1: rule__State__OutgoingTransitionsAssignment_7 : ( ruleTransition ) ;
    public final void rule__State__OutgoingTransitionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3203:1: ( ( ruleTransition ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3204:1: ( ruleTransition )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3204:1: ( ruleTransition )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3205:1: ruleTransition
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__State__OutgoingTransitionsAssignment_76613);
            ruleTransition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_7_0()); 
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
    // $ANTLR end rule__State__OutgoingTransitionsAssignment_7


    // $ANTLR start rule__StateContent__ExitActionsAssignment_1_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3214:1: rule__StateContent__ExitActionsAssignment_1_0 : ( ruleExitAction ) ;
    public final void rule__StateContent__ExitActionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3218:1: ( ( ruleExitAction ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3219:1: ( ruleExitAction )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3219:1: ( ruleExitAction )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3220:1: ruleExitAction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getExitActionsExitActionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleExitAction_in_rule__StateContent__ExitActionsAssignment_1_06644);
            ruleExitAction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getExitActionsExitActionParserRuleCall_1_0_0()); 
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
    // $ANTLR end rule__StateContent__ExitActionsAssignment_1_0


    // $ANTLR start rule__StateContent__EntryActionsAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3229:1: rule__StateContent__EntryActionsAssignment_1_1 : ( ruleEntryAction ) ;
    public final void rule__StateContent__EntryActionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3233:1: ( ( ruleEntryAction ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3234:1: ( ruleEntryAction )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3234:1: ( ruleEntryAction )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3235:1: ruleEntryAction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getEntryActionsEntryActionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEntryAction_in_rule__StateContent__EntryActionsAssignment_1_16675);
            ruleEntryAction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getEntryActionsEntryActionParserRuleCall_1_1_0()); 
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
    // $ANTLR end rule__StateContent__EntryActionsAssignment_1_1


    // $ANTLR start rule__StateContent__InnerActionAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3244:1: rule__StateContent__InnerActionAssignment_1_2 : ( ruleInnerAction ) ;
    public final void rule__StateContent__InnerActionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3248:1: ( ( ruleInnerAction ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3249:1: ( ruleInnerAction )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3249:1: ( ruleInnerAction )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3250:1: ruleInnerAction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getInnerActionInnerActionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleInnerAction_in_rule__StateContent__InnerActionAssignment_1_26706);
            ruleInnerAction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getInnerActionInnerActionParserRuleCall_1_2_0()); 
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
    // $ANTLR end rule__StateContent__InnerActionAssignment_1_2


    // $ANTLR start rule__StateContent__SignalsAndVariablesAssignment_1_3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3259:1: rule__StateContent__SignalsAndVariablesAssignment_1_3 : ( ruleValuedObject ) ;
    public final void rule__StateContent__SignalsAndVariablesAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3263:1: ( ( ruleValuedObject ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3264:1: ( ruleValuedObject )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3264:1: ( ruleValuedObject )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3265:1: ruleValuedObject
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getSignalsAndVariablesValuedObjectParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleValuedObject_in_rule__StateContent__SignalsAndVariablesAssignment_1_36737);
            ruleValuedObject();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getSignalsAndVariablesValuedObjectParserRuleCall_1_3_0()); 
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
    // $ANTLR end rule__StateContent__SignalsAndVariablesAssignment_1_3


    // $ANTLR start rule__StateContent__InnerStatesAssignment_1_4_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3274:1: rule__StateContent__InnerStatesAssignment_1_4_0 : ( ruleState ) ;
    public final void rule__StateContent__InnerStatesAssignment_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3278:1: ( ( ruleState ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3279:1: ( ruleState )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3279:1: ( ruleState )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3280:1: ruleState
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getInnerStatesStateParserRuleCall_1_4_0_0()); 
            }
            pushFollow(FOLLOW_ruleState_in_rule__StateContent__InnerStatesAssignment_1_4_06768);
            ruleState();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getInnerStatesStateParserRuleCall_1_4_0_0()); 
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
    // $ANTLR end rule__StateContent__InnerStatesAssignment_1_4_0


    // $ANTLR start rule__StateContent__ParallelStatesAssignment_1_4_1_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3289:1: rule__StateContent__ParallelStatesAssignment_1_4_1_1 : ( ruleState ) ;
    public final void rule__StateContent__ParallelStatesAssignment_1_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3293:1: ( ( ruleState ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3294:1: ( ruleState )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3294:1: ( ruleState )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3295:1: ruleState
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getParallelStatesStateParserRuleCall_1_4_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleState_in_rule__StateContent__ParallelStatesAssignment_1_4_1_16799);
            ruleState();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getParallelStatesStateParserRuleCall_1_4_1_1_0()); 
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
    // $ANTLR end rule__StateContent__ParallelStatesAssignment_1_4_1_1


    // $ANTLR start rule__EntryAction__TriggerAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3304:1: rule__EntryAction__TriggerAssignment_1 : ( rulePrimaryExpression ) ;
    public final void rule__EntryAction__TriggerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3308:1: ( ( rulePrimaryExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3309:1: ( rulePrimaryExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3309:1: ( rulePrimaryExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3310:1: rulePrimaryExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getTriggerPrimaryExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__EntryAction__TriggerAssignment_16830);
            rulePrimaryExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionAccess().getTriggerPrimaryExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end rule__EntryAction__TriggerAssignment_1


    // $ANTLR start rule__EntryAction__EffectsAssignment_2_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3319:1: rule__EntryAction__EffectsAssignment_2_1 : ( ruleEffect ) ;
    public final void rule__EntryAction__EffectsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3323:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3324:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3324:1: ( ruleEffect )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3325:1: ruleEffect
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_rule__EntryAction__EffectsAssignment_2_16861);
            ruleEffect();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_2_1_0()); 
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
    // $ANTLR end rule__EntryAction__EffectsAssignment_2_1


    // $ANTLR start rule__ExitAction__TriggerAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3334:1: rule__ExitAction__TriggerAssignment_1 : ( rulePrimaryExpression ) ;
    public final void rule__ExitAction__TriggerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3338:1: ( ( rulePrimaryExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3339:1: ( rulePrimaryExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3339:1: ( rulePrimaryExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3340:1: rulePrimaryExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getTriggerPrimaryExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__ExitAction__TriggerAssignment_16892);
            rulePrimaryExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getTriggerPrimaryExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end rule__ExitAction__TriggerAssignment_1


    // $ANTLR start rule__ExitAction__EffectsAssignment_2_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3349:1: rule__ExitAction__EffectsAssignment_2_1 : ( ruleEffect ) ;
    public final void rule__ExitAction__EffectsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3353:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3354:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3354:1: ( ruleEffect )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3355:1: ruleEffect
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_rule__ExitAction__EffectsAssignment_2_16923);
            ruleEffect();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_2_1_0()); 
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
    // $ANTLR end rule__ExitAction__EffectsAssignment_2_1


    // $ANTLR start rule__InnerAction__TriggerAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3364:1: rule__InnerAction__TriggerAssignment_1 : ( rulePrimaryExpression ) ;
    public final void rule__InnerAction__TriggerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3368:1: ( ( rulePrimaryExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3369:1: ( rulePrimaryExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3369:1: ( rulePrimaryExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3370:1: rulePrimaryExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getTriggerPrimaryExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__InnerAction__TriggerAssignment_16954);
            rulePrimaryExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getTriggerPrimaryExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end rule__InnerAction__TriggerAssignment_1


    // $ANTLR start rule__InnerAction__EffectsAssignment_2_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3379:1: rule__InnerAction__EffectsAssignment_2_1 : ( ruleEffect ) ;
    public final void rule__InnerAction__EffectsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3383:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3384:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3384:1: ( ruleEffect )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3385:1: ruleEffect
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getEffectsEffectParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_rule__InnerAction__EffectsAssignment_2_16985);
            ruleEffect();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getEffectsEffectParserRuleCall_2_1_0()); 
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
    // $ANTLR end rule__InnerAction__EffectsAssignment_2_1


    // $ANTLR start rule__Transition__SourceStateNameAssignment_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3394:1: rule__Transition__SourceStateNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Transition__SourceStateNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3398:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3399:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3399:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3400:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getSourceStateNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__SourceStateNameAssignment_07016); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getSourceStateNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end rule__Transition__SourceStateNameAssignment_0


    // $ANTLR start rule__Transition__TransitionTypeAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3409:1: rule__Transition__TransitionTypeAssignment_1 : ( ruleTransitionType ) ;
    public final void rule__Transition__TransitionTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3413:1: ( ( ruleTransitionType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3414:1: ( ruleTransitionType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3414:1: ( ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3415:1: ruleTransitionType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTransitionTypeTransitionTypeEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTransitionType_in_rule__Transition__TransitionTypeAssignment_17047);
            ruleTransitionType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTransitionTypeTransitionTypeEnumRuleCall_1_0()); 
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
    // $ANTLR end rule__Transition__TransitionTypeAssignment_1


    // $ANTLR start rule__Transition__TargetStateNameAssignment_2_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3424:1: rule__Transition__TargetStateNameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Transition__TargetStateNameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3428:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3429:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3429:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3430:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTargetStateNameIDTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__TargetStateNameAssignment_2_07078); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTargetStateNameIDTerminalRuleCall_2_0_0()); 
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
    // $ANTLR end rule__Transition__TargetStateNameAssignment_2_0


    // $ANTLR start rule__Transition__DeclaredTargetStateAssignment_2_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3439:1: rule__Transition__DeclaredTargetStateAssignment_2_1 : ( ruledeclaredTargetState ) ;
    public final void rule__Transition__DeclaredTargetStateAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3443:1: ( ( ruledeclaredTargetState ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3444:1: ( ruledeclaredTargetState )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3444:1: ( ruledeclaredTargetState )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3445:1: ruledeclaredTargetState
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getDeclaredTargetStateDeclaredTargetStateParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruledeclaredTargetState_in_rule__Transition__DeclaredTargetStateAssignment_2_17109);
            ruledeclaredTargetState();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getDeclaredTargetStateDeclaredTargetStateParserRuleCall_2_1_0()); 
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
    // $ANTLR end rule__Transition__DeclaredTargetStateAssignment_2_1


    // $ANTLR start rule__Transition__TransitionLabelAssignment_3_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3454:1: rule__Transition__TransitionLabelAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TransitionLabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3458:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3459:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3459:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3460:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTransitionLabelActionCrossReference_3_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3461:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3462:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTransitionLabelActionIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__TransitionLabelAssignment_3_17144); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTransitionLabelActionIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTransitionLabelActionCrossReference_3_1_0()); 
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
    // $ANTLR end rule__Transition__TransitionLabelAssignment_3_1


    // $ANTLR start rule__DeclaredTargetState__IsInitialAssignment_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3473:1: rule__DeclaredTargetState__IsInitialAssignment_0 : ( ( 'init' ) ) ;
    public final void rule__DeclaredTargetState__IsInitialAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3477:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3478:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3478:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3479:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaredTargetStateAccess().getIsInitialInitKeyword_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3480:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3481:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaredTargetStateAccess().getIsInitialInitKeyword_0_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__DeclaredTargetState__IsInitialAssignment_07184); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaredTargetStateAccess().getIsInitialInitKeyword_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaredTargetStateAccess().getIsInitialInitKeyword_0_0()); 
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
    // $ANTLR end rule__DeclaredTargetState__IsInitialAssignment_0


    // $ANTLR start rule__DeclaredTargetState__IsFinalAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3496:1: rule__DeclaredTargetState__IsFinalAssignment_1 : ( ( 'final' ) ) ;
    public final void rule__DeclaredTargetState__IsFinalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3500:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3501:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3501:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3502:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaredTargetStateAccess().getIsFinalFinalKeyword_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3503:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3504:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaredTargetStateAccess().getIsFinalFinalKeyword_1_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__DeclaredTargetState__IsFinalAssignment_17228); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaredTargetStateAccess().getIsFinalFinalKeyword_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaredTargetStateAccess().getIsFinalFinalKeyword_1_0()); 
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
    // $ANTLR end rule__DeclaredTargetState__IsFinalAssignment_1


    // $ANTLR start rule__DeclaredTargetState__DeclaredStateTypeAssignment_3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3519:1: rule__DeclaredTargetState__DeclaredStateTypeAssignment_3 : ( ruleStateType ) ;
    public final void rule__DeclaredTargetState__DeclaredStateTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3523:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3524:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3524:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3525:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaredTargetStateAccess().getDeclaredStateTypeStateTypeEnumRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__DeclaredTargetState__DeclaredStateTypeAssignment_37267);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaredTargetStateAccess().getDeclaredStateTypeStateTypeEnumRuleCall_3_0()); 
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
    // $ANTLR end rule__DeclaredTargetState__DeclaredStateTypeAssignment_3


    // $ANTLR start rule__DeclaredTargetState__DeclaredStateNameAssignment_4
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3534:1: rule__DeclaredTargetState__DeclaredStateNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__DeclaredTargetState__DeclaredStateNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3538:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3539:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3539:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3540:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaredTargetStateAccess().getDeclaredStateNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeclaredTargetState__DeclaredStateNameAssignment_47298); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaredTargetStateAccess().getDeclaredStateNameIDTerminalRuleCall_4_0()); 
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
    // $ANTLR end rule__DeclaredTargetState__DeclaredStateNameAssignment_4


    // $ANTLR start rule__Emission__SignalAssignment_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3551:1: rule__Emission__SignalAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Emission__SignalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3555:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3556:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3556:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3557:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3558:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3559:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_07335); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0()); 
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
    // $ANTLR end rule__Emission__SignalAssignment_0


    // $ANTLR start rule__Emission__NewValueAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3570:1: rule__Emission__NewValueAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3574:1: ( ( rulePrimaryExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3575:1: ( rulePrimaryExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3575:1: ( rulePrimaryExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3576:1: rulePrimaryExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValuePrimaryExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Emission__NewValueAssignment_1_17370);
            rulePrimaryExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValuePrimaryExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end rule__Emission__NewValueAssignment_1_1


    // $ANTLR start rule__Assignment__VariableAssignment_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3585:1: rule__Assignment__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3589:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3590:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3590:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3591:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3592:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3593:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_07405); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 
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
    // $ANTLR end rule__Assignment__VariableAssignment_0


    // $ANTLR start rule__Assignment__ExpressionAssignment_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3604:1: rule__Assignment__ExpressionAssignment_2 : ( rulePrimaryExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3608:1: ( ( rulePrimaryExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3609:1: ( rulePrimaryExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3609:1: ( rulePrimaryExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3610:1: rulePrimaryExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionPrimaryExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Assignment__ExpressionAssignment_27440);
            rulePrimaryExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExpressionPrimaryExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end rule__Assignment__ExpressionAssignment_2


    // $ANTLR start rule__SignalReference__ReferenceAssignment
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3619:1: rule__SignalReference__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SignalReference__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3623:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3624:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3624:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3625:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getReferenceSignalCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3626:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3627:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getReferenceSignalIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SignalReference__ReferenceAssignment7475); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getReferenceSignalIDTerminalRuleCall_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getReferenceSignalCrossReference_0()); 
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
    // $ANTLR end rule__SignalReference__ReferenceAssignment


    // $ANTLR start rule__VariableReference__ReferenceAssignment
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3638:1: rule__VariableReference__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3642:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3643:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3643:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3644:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getReferenceVariableCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3645:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3646:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getReferenceVariableIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableReference__ReferenceAssignment7514); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getReferenceVariableIDTerminalRuleCall_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getReferenceVariableCrossReference_0()); 
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
    // $ANTLR end rule__VariableReference__ReferenceAssignment


    // $ANTLR start rule__Signal__NameAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3657:1: rule__Signal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3661:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3662:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3662:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3663:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_17549); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end rule__Signal__NameAssignment_1


    // $ANTLR start rule__Signal__InitialValueAssignment_2_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3672:1: rule__Signal__InitialValueAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Signal__InitialValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3676:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3677:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3677:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3678:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getInitialValueIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__InitialValueAssignment_2_17580); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getInitialValueIDTerminalRuleCall_2_1_0()); 
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
    // $ANTLR end rule__Signal__InitialValueAssignment_2_1


    // $ANTLR start rule__Variable__NameAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3687:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3691:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3692:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3692:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3693:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_17611); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end rule__Variable__NameAssignment_1


    // $ANTLR start rule__Variable__InitialValueAssignment_2_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3702:1: rule__Variable__InitialValueAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Variable__InitialValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3706:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3707:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3707:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3708:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getInitialValueIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__InitialValueAssignment_2_17642); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getInitialValueIDTerminalRuleCall_2_1_0()); 
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
    // $ANTLR end rule__Variable__InitialValueAssignment_2_1


    // $ANTLR start rule__IntValue__ValueAssignment
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3717:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3721:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3722:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3722:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3723:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment7673); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
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
    // $ANTLR end rule__IntValue__ValueAssignment


    // $ANTLR start rule__FloatValue__ValueAssignment
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3732:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3736:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3737:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3737:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3738:1: RULE_FLOAT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment7704); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0()); 
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
    // $ANTLR end rule__FloatValue__ValueAssignment


    // $ANTLR start rule__BooleanValue__ValueAssignment
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3747:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3751:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3752:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3752:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3753:1: RULE_BOOLEAN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment7735); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0()); 
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
    // $ANTLR end rule__BooleanValue__ValueAssignment


    // $ANTLR start rule__HostCode__CodeAssignment
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3762:1: rule__HostCode__CodeAssignment : ( RULE_STRING ) ;
    public final void rule__HostCode__CodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3766:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3767:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3767:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3768:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getCodeSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HostCode__CodeAssignment7766); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getCodeSTRINGTerminalRuleCall_0()); 
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
    // $ANTLR end rule__HostCode__CodeAssignment


    // $ANTLR start rule__ValOperation__OperatorAssignment_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3778:1: rule__ValOperation__OperatorAssignment_0 : ( ruleValOperator ) ;
    public final void rule__ValOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3782:1: ( ( ruleValOperator ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3783:1: ( ruleValOperator )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3783:1: ( ruleValOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3784:1: ruleValOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValOperator_in_rule__ValOperation__OperatorAssignment_07798);
            ruleValOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0()); 
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
    // $ANTLR end rule__ValOperation__OperatorAssignment_0


    // $ANTLR start rule__ValOperation__SubExpressionsAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3793:1: rule__ValOperation__SubExpressionsAssignment_1 : ( ruleSignalReference ) ;
    public final void rule__ValOperation__SubExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3797:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3798:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3798:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3799:1: ruleSignalReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_rule__ValOperation__SubExpressionsAssignment_17829);
            ruleSignalReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0()); 
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
    // $ANTLR end rule__ValOperation__SubExpressionsAssignment_1


    // $ANTLR start rule__CompareOperation__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3808:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3812:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3813:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3813:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3814:1: ruleCompareOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_17860);
            ruleCompareOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
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
    // $ANTLR end rule__CompareOperation__OperatorAssignment_1_1


    // $ANTLR start rule__CompareOperation__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3823:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleValueExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3827:1: ( ( ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3828:1: ( ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3828:1: ( ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3829:1: ruleValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsValueExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_27891);
            ruleValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getSubExpressionsValueExpressionParserRuleCall_1_2_0()); 
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
    // $ANTLR end rule__CompareOperation__SubExpressionsAssignment_1_2


    // $ANTLR start rule__NotOperation__OperatorsAssignment_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3838:1: rule__NotOperation__OperatorsAssignment_0 : ( ruleNotOperator ) ;
    public final void rule__NotOperation__OperatorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3842:1: ( ( ruleNotOperator ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3843:1: ( ruleNotOperator )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3843:1: ( ruleNotOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3844:1: ruleNotOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOperationAccess().getOperatorsNotOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_rule__NotOperation__OperatorsAssignment_07922);
            ruleNotOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotOperationAccess().getOperatorsNotOperatorEnumRuleCall_0_0()); 
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
    // $ANTLR end rule__NotOperation__OperatorsAssignment_0


    // $ANTLR start rule__NotOperation__SubExpressionsAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3853:1: rule__NotOperation__SubExpressionsAssignment_1 : ( ruleBooleanExpression ) ;
    public final void rule__NotOperation__SubExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3857:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3858:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3858:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3859:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__NotOperation__SubExpressionsAssignment_17953);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end rule__NotOperation__SubExpressionsAssignment_1


    // $ANTLR start rule__AndOperation__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3868:1: rule__AndOperation__OperatorAssignment_1_1 : ( ruleOperatorAnd ) ;
    public final void rule__AndOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3872:1: ( ( ruleOperatorAnd ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3873:1: ( ruleOperatorAnd )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3873:1: ( ruleOperatorAnd )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3874:1: ruleOperatorAnd
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOperatorAnd_in_rule__AndOperation__OperatorAssignment_1_17984);
            ruleOperatorAnd();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0()); 
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
    // $ANTLR end rule__AndOperation__OperatorAssignment_1_1


    // $ANTLR start rule__AndOperation__SubExpressionAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3883:1: rule__AndOperation__SubExpressionAssignment_1_2 : ( ruleNotOrNormalExpression ) ;
    public final void rule__AndOperation__SubExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3887:1: ( ( ruleNotOrNormalExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3888:1: ( ruleNotOrNormalExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3888:1: ( ruleNotOrNormalExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3889:1: ruleNotOrNormalExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getSubExpressionNotOrNormalExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleNotOrNormalExpression_in_rule__AndOperation__SubExpressionAssignment_1_28015);
            ruleNotOrNormalExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getSubExpressionNotOrNormalExpressionParserRuleCall_1_2_0()); 
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
    // $ANTLR end rule__AndOperation__SubExpressionAssignment_1_2


    // $ANTLR start rule__OrOperation__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3898:1: rule__OrOperation__OperatorAssignment_1_1 : ( ruleOperatorOr ) ;
    public final void rule__OrOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3902:1: ( ( ruleOperatorOr ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3903:1: ( ruleOperatorOr )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3903:1: ( ruleOperatorOr )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3904:1: ruleOperatorOr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOperatorOr_in_rule__OrOperation__OperatorAssignment_1_18046);
            ruleOperatorOr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0()); 
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
    // $ANTLR end rule__OrOperation__OperatorAssignment_1_1


    // $ANTLR start rule__OrOperation__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3913:1: rule__OrOperation__SubExpressionsAssignment_1_2 : ( ruleAndOperation ) ;
    public final void rule__OrOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3917:1: ( ( ruleAndOperation ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3918:1: ( ruleAndOperation )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3918:1: ( ruleAndOperation )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3919:1: ruleAndOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_rule__OrOperation__SubExpressionsAssignment_1_28077);
            ruleAndOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0()); 
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
    // $ANTLR end rule__OrOperation__SubExpressionsAssignment_1_2

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:979:1: ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:979:1: ( ( rule__StateContent__ExitActionsAssignment_1_0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:979:1: ( ( rule__StateContent__ExitActionsAssignment_1_0 ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:980:1: ( rule__StateContent__ExitActionsAssignment_1_0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStateContentAccess().getExitActionsAssignment_1_0()); 
        }
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:981:1: ( rule__StateContent__ExitActionsAssignment_1_0 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:981:2: rule__StateContent__ExitActionsAssignment_1_0
        {
        pushFollow(FOLLOW_rule__StateContent__ExitActionsAssignment_1_0_in_synpred12061);
        rule__StateContent__ExitActionsAssignment_1_0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:985:6: ( ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:985:6: ( ( rule__StateContent__EntryActionsAssignment_1_1 ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:985:6: ( ( rule__StateContent__EntryActionsAssignment_1_1 ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:986:1: ( rule__StateContent__EntryActionsAssignment_1_1 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStateContentAccess().getEntryActionsAssignment_1_1()); 
        }
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:987:1: ( rule__StateContent__EntryActionsAssignment_1_1 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:987:2: rule__StateContent__EntryActionsAssignment_1_1
        {
        pushFollow(FOLLOW_rule__StateContent__EntryActionsAssignment_1_1_in_synpred22079);
        rule__StateContent__EntryActionsAssignment_1_1();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:991:6: ( ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:991:6: ( ( rule__StateContent__InnerActionAssignment_1_2 ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:991:6: ( ( rule__StateContent__InnerActionAssignment_1_2 ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:992:1: ( rule__StateContent__InnerActionAssignment_1_2 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStateContentAccess().getInnerActionAssignment_1_2()); 
        }
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:993:1: ( rule__StateContent__InnerActionAssignment_1_2 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:993:2: rule__StateContent__InnerActionAssignment_1_2
        {
        pushFollow(FOLLOW_rule__StateContent__InnerActionAssignment_1_2_in_synpred32097);
        rule__StateContent__InnerActionAssignment_1_2();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:997:6: ( ( ( rule__StateContent__SignalsAndVariablesAssignment_1_3 ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:997:6: ( ( rule__StateContent__SignalsAndVariablesAssignment_1_3 ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:997:6: ( ( rule__StateContent__SignalsAndVariablesAssignment_1_3 ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:998:1: ( rule__StateContent__SignalsAndVariablesAssignment_1_3 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStateContentAccess().getSignalsAndVariablesAssignment_1_3()); 
        }
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:999:1: ( rule__StateContent__SignalsAndVariablesAssignment_1_3 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:999:2: rule__StateContent__SignalsAndVariablesAssignment_1_3
        {
        pushFollow(FOLLOW_rule__StateContent__SignalsAndVariablesAssignment_1_3_in_synpred42115);
        rule__StateContent__SignalsAndVariablesAssignment_1_3();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred38
    public final void synpred38_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1408:2: ( rule__State__IsInitialAssignment_0 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1408:2: rule__State__IsInitialAssignment_0
        {
        pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_in_synpred383157);
        rule__State__IsInitialAssignment_0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred38

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1426:2: ( rule__State__IsFinalAssignment_1 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1426:2: rule__State__IsFinalAssignment_1
        {
        pushFollow(FOLLOW_rule__State__IsFinalAssignment_1_in_synpred393195);
        rule__State__IsFinalAssignment_1();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred39

    // $ANTLR start synpred40
    public final void synpred40_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1444:2: ( rule__State__StateKindAssignment_2 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1444:2: rule__State__StateKindAssignment_2
        {
        pushFollow(FOLLOW_rule__State__StateKindAssignment_2_in_synpred403233);
        rule__State__StateKindAssignment_2();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred40

    // $ANTLR start synpred41
    public final void synpred41_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1463:2: ( 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1463:2: 'state'
        {
        match(input,34,FOLLOW_34_in_synpred413273); if (failed) return ;

        }
    }
    // $ANTLR end synpred41

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1482:2: ( rule__State__StateNameAssignment_4 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1482:2: rule__State__StateNameAssignment_4
        {
        pushFollow(FOLLOW_rule__State__StateNameAssignment_4_in_synpred423313);
        rule__State__StateNameAssignment_4();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1500:2: ( rule__State__LabelAssignment_5 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1500:2: rule__State__LabelAssignment_5
        {
        pushFollow(FOLLOW_rule__State__LabelAssignment_5_in_synpred433351);
        rule__State__LabelAssignment_5();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1518:2: ( rule__State__StateContentAssignment_6 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1518:2: rule__State__StateContentAssignment_6
        {
        pushFollow(FOLLOW_rule__State__StateContentAssignment_6_in_synpred443389);
        rule__State__StateContentAssignment_6();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred44

    // $ANTLR start synpred45
    public final void synpred45_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1536:2: ( rule__State__OutgoingTransitionsAssignment_7 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1536:2: rule__State__OutgoingTransitionsAssignment_7
        {
        pushFollow(FOLLOW_rule__State__OutgoingTransitionsAssignment_7_in_synpred453427);
        rule__State__OutgoingTransitionsAssignment_7();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred45

    // $ANTLR start synpred46
    public final void synpred46_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1595:2: ( rule__StateContent__Alternatives_1 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1595:2: rule__StateContent__Alternatives_1
        {
        pushFollow(FOLLOW_rule__StateContent__Alternatives_1_in_synpred463531);
        rule__StateContent__Alternatives_1();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred46

    // $ANTLR start synpred47
    public final void synpred47_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1657:2: ( rule__StateContent__Group_1_4_1__0 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1657:2: rule__StateContent__Group_1_4_1__0
        {
        pushFollow(FOLLOW_rule__StateContent__Group_1_4_1__0_in_synpred473650);
        rule__StateContent__Group_1_4_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred47

    // $ANTLR start synpred48
    public final void synpred48_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1739:2: ( rule__EntryAction__TriggerAssignment_1 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1739:2: rule__EntryAction__TriggerAssignment_1
        {
        pushFollow(FOLLOW_rule__EntryAction__TriggerAssignment_1_in_synpred483805);
        rule__EntryAction__TriggerAssignment_1();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred48

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1800:2: ( rule__EntryAction__EffectsAssignment_2_1 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1800:2: rule__EntryAction__EffectsAssignment_2_1
        {
        pushFollow(FOLLOW_rule__EntryAction__EffectsAssignment_2_1_in_synpred503923);
        rule__EntryAction__EffectsAssignment_2_1();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred50

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1841:2: ( rule__ExitAction__TriggerAssignment_1 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1841:2: rule__ExitAction__TriggerAssignment_1
        {
        pushFollow(FOLLOW_rule__ExitAction__TriggerAssignment_1_in_synpred514001);
        rule__ExitAction__TriggerAssignment_1();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred53
    public final void synpred53_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1902:2: ( rule__ExitAction__EffectsAssignment_2_1 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1902:2: rule__ExitAction__EffectsAssignment_2_1
        {
        pushFollow(FOLLOW_rule__ExitAction__EffectsAssignment_2_1_in_synpred534119);
        rule__ExitAction__EffectsAssignment_2_1();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred53

    // $ANTLR start synpred54
    public final void synpred54_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1943:2: ( rule__InnerAction__TriggerAssignment_1 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1943:2: rule__InnerAction__TriggerAssignment_1
        {
        pushFollow(FOLLOW_rule__InnerAction__TriggerAssignment_1_in_synpred544197);
        rule__InnerAction__TriggerAssignment_1();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred54

    // $ANTLR start synpred56
    public final void synpred56_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2004:2: ( rule__InnerAction__EffectsAssignment_2_1 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2004:2: rule__InnerAction__EffectsAssignment_2_1
        {
        pushFollow(FOLLOW_rule__InnerAction__EffectsAssignment_2_1_in_synpred564315);
        rule__InnerAction__EffectsAssignment_2_1();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred56

    public final boolean synpred44() {
        backtracking++;
        int start = input.mark();
        try {
            synpred44_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred43() {
        backtracking++;
        int start = input.mark();
        try {
            synpred43_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred46() {
        backtracking++;
        int start = input.mark();
        try {
            synpred46_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred45() {
        backtracking++;
        int start = input.mark();
        try {
            synpred45_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred48() {
        backtracking++;
        int start = input.mark();
        try {
            synpred48_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred39() {
        backtracking++;
        int start = input.mark();
        try {
            synpred39_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred56() {
        backtracking++;
        int start = input.mark();
        try {
            synpred56_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred47() {
        backtracking++;
        int start = input.mark();
        try {
            synpred47_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred38() {
        backtracking++;
        int start = input.mark();
        try {
            synpred38_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred54() {
        backtracking++;
        int start = input.mark();
        try {
            synpred54_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred53() {
        backtracking++;
        int start = input.mark();
        try {
            synpred53_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred51() {
        backtracking++;
        int start = input.mark();
        try {
            synpred51_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred50() {
        backtracking++;
        int start = input.mark();
        try {
            synpred50_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred40() {
        backtracking++;
        int start = input.mark();
        try {
            synpred40_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred3() {
        backtracking++;
        int start = input.mark();
        try {
            synpred3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred42() {
        backtracking++;
        int start = input.mark();
        try {
            synpred42_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred41() {
        backtracking++;
        int start = input.mark();
        try {
            synpred41_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleState_in_entryRuleState66 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateContent_in_entryRuleStateContent126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateContent133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Group__0_in_ruleStateContent160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_entryRuleEntryAction186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryAction193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryAction__Group__0_in_ruleEntryAction220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_entryRuleExitAction246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitAction253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExitAction__Group__0_in_ruleExitAction280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerAction_in_entryRuleInnerAction306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerAction313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerAction__Group__0_in_ruleInnerAction340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaredTargetState_in_entryRuledeclaredTargetState426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaredTargetState433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredTargetState__Group__0_in_ruledeclaredTargetState460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Alternatives_in_ruleEffect522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__0_in_ruleEmission582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__ReferenceAssignment_in_ruleSignalReference702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__ReferenceAssignment_in_ruleVariableReference762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObject_in_entryRuleValuedObject788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObject795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObject__Alternatives_in_ruleValuedObject822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__0_in_ruleSignal882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_entryRuleHostCode1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostCode1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__CodeAssignment_in_ruleHostCode1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_entryRuleValOperation1212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValOperation1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__Group__0_in_ruleValOperation1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_entryRuleValueExpression1272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpression1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueExpression__Alternatives_in_ruleValueExpression1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__0_in_ruleCompareOperation1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperation_in_entryRuleNotOperation1392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperation1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotOperation__Group__0_in_ruleNotOperation1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_entryRuleNotOrNormalExpression1452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOrNormalExpression1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotOrNormalExpression__Alternatives_in_ruleNotOrNormalExpression1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_entryRuleAndOperation1512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperation1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group__0_in_ruleAndOperation1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_entryRuleOrOperation1572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperation1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group__0_in_ruleOrOperation1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression1632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Alternatives_in_ruleBooleanExpression1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rulePrimaryExpression1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Alternatives_in_ruleStateType1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionType__Alternatives_in_ruleTransitionType1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorKind__Alternatives_in_ruleOperatorKind1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleValOperator1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleNotOperator1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOperatorOr1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOperatorAnd2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__ExitActionsAssignment_1_0_in_rule__StateContent__Alternatives_12061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__EntryActionsAssignment_1_1_in_rule__StateContent__Alternatives_12079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__InnerActionAssignment_1_2_in_rule__StateContent__Alternatives_12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__SignalsAndVariablesAssignment_1_3_in_rule__StateContent__Alternatives_12115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Group_1_4__0_in_rule__StateContent__Alternatives_12133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TargetStateNameAssignment_2_0_in_rule__Transition__Alternatives_22166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__DeclaredTargetStateAssignment_2_1_in_rule__Transition__Alternatives_22184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_rule__Effect__Alternatives2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_rule__Effect__Alternatives2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__ValuedObject__Alternatives2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__ValuedObject__Alternatives2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__ValueExpression__Alternatives2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__ValueExpression__Alternatives2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_rule__ValueExpression__Alternatives2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rule__ValueExpression__Alternatives2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperation_in_rule__NotOrNormalExpression__Alternatives2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__NotOrNormalExpression__Alternatives2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__BooleanExpression__Alternatives2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__BooleanExpression__Alternatives2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_rule__BooleanExpression__Alternatives2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_3__0_in_rule__BooleanExpression__Alternatives2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StateType__Alternatives2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StateType__Alternatives2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StateType__Alternatives2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TransitionType__Alternatives2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TransitionType__Alternatives2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TransitionType__Alternatives2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__OperatorKind__Alternatives2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__OperatorKind__Alternatives2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__OperatorKind__Alternatives2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__OperatorKind__Alternatives2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OperatorKind__Alternatives2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__OperatorKind__Alternatives2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__OperatorKind__Alternatives2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__OperatorKind__Alternatives2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__OperatorKind__Alternatives2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__OperatorKind__Alternatives2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__OperatorKind__Alternatives2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__OperatorKind__Alternatives2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__OperatorKind__Alternatives2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__OperatorKind__Alternatives2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__OperatorKind__Alternatives3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CompareOperator__Alternatives3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CompareOperator__Alternatives3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CompareOperator__Alternatives3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompareOperator__Alternatives3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CompareOperator__Alternatives3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_in_rule__State__Group__03157 = new BitSet(new long[]{0x0004000C007E0032L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__03167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_1_in_rule__State__Group__13195 = new BitSet(new long[]{0x0000000C007E0032L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__13205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_2_in_rule__State__Group__23233 = new BitSet(new long[]{0x0000000C00700032L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__23243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__State__Group__33273 = new BitSet(new long[]{0x0000000800700032L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__33285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateNameAssignment_4_in_rule__State__Group__43313 = new BitSet(new long[]{0x0000000800700032L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__43323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__LabelAssignment_5_in_rule__State__Group__53351 = new BitSet(new long[]{0x0000000800700012L});
    public static final BitSet FOLLOW_rule__State__Group__6_in_rule__State__Group__53361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateContentAssignment_6_in_rule__State__Group__63389 = new BitSet(new long[]{0x0000000000700012L});
    public static final BitSet FOLLOW_rule__State__Group__7_in_rule__State__Group__63399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__OutgoingTransitionsAssignment_7_in_rule__State__Group__73427 = new BitSet(new long[]{0x0000000000700012L});
    public static final BitSet FOLLOW_35_in_rule__StateContent__Group__03479 = new BitSet(new long[]{0x0007437C007E0030L});
    public static final BitSet FOLLOW_rule__StateContent__Group__1_in_rule__StateContent__Group__03489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__13519 = new BitSet(new long[]{0x0007437C007E0030L});
    public static final BitSet FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__13531 = new BitSet(new long[]{0x0007437C007E0030L});
    public static final BitSet FOLLOW_rule__StateContent__Group__2_in_rule__StateContent__Group__13543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__StateContent__Group__23572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__InnerStatesAssignment_1_4_0_in_rule__StateContent__Group_1_4__03613 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Group_1_4__1_in_rule__StateContent__Group_1_4__03622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Group_1_4_1__0_in_rule__StateContent__Group_1_4__13650 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_rule__StateContent__Group_1_4_1__03690 = new BitSet(new long[]{0x0006000C007E0032L});
    public static final BitSet FOLLOW_rule__StateContent__Group_1_4_1__1_in_rule__StateContent__Group_1_4_1__03700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__ParallelStatesAssignment_1_4_1_1_in_rule__StateContent__Group_1_4_1__13728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EntryAction__Group__03767 = new BitSet(new long[]{0x00000880000021D2L});
    public static final BitSet FOLLOW_rule__EntryAction__Group__1_in_rule__EntryAction__Group__03777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryAction__TriggerAssignment_1_in_rule__EntryAction__Group__13805 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__EntryAction__Group__2_in_rule__EntryAction__Group__13815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryAction__Group_2__0_in_rule__EntryAction__Group__23843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EntryAction__Group_2__03885 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__EntryAction__Group_2__1_in_rule__EntryAction__Group_2__03895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryAction__EffectsAssignment_2_1_in_rule__EntryAction__Group_2__13923 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_40_in_rule__ExitAction__Group__03963 = new BitSet(new long[]{0x00000880000021D2L});
    public static final BitSet FOLLOW_rule__ExitAction__Group__1_in_rule__ExitAction__Group__03973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExitAction__TriggerAssignment_1_in_rule__ExitAction__Group__14001 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__ExitAction__Group__2_in_rule__ExitAction__Group__14011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExitAction__Group_2__0_in_rule__ExitAction__Group__24039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ExitAction__Group_2__04081 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ExitAction__Group_2__1_in_rule__ExitAction__Group_2__04091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExitAction__EffectsAssignment_2_1_in_rule__ExitAction__Group_2__14119 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_41_in_rule__InnerAction__Group__04159 = new BitSet(new long[]{0x00000880000021D2L});
    public static final BitSet FOLLOW_rule__InnerAction__Group__1_in_rule__InnerAction__Group__04169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerAction__TriggerAssignment_1_in_rule__InnerAction__Group__14197 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__InnerAction__Group__2_in_rule__InnerAction__Group__14207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerAction__Group_2__0_in_rule__InnerAction__Group__24235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__InnerAction__Group_2__04277 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__InnerAction__Group_2__1_in_rule__InnerAction__Group_2__04287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerAction__EffectsAssignment_2_1_in_rule__InnerAction__Group_2__14315 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Transition__SourceStateNameAssignment_0_in_rule__Transition__Group__04354 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__04364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TransitionTypeAssignment_1_in_rule__Transition__Group__14392 = new BitSet(new long[]{0x0006000400000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__14401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Alternatives_2_in_rule__Transition__Group__24429 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__24438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__34466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Transition__Group_3__04510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__04520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TransitionLabelAssignment_3_1_in_rule__Transition__Group_3__14548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredTargetState__IsInitialAssignment_0_in_rule__DeclaredTargetState__Group__04586 = new BitSet(new long[]{0x0004000400000000L});
    public static final BitSet FOLLOW_rule__DeclaredTargetState__Group__1_in_rule__DeclaredTargetState__Group__04596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredTargetState__IsFinalAssignment_1_in_rule__DeclaredTargetState__Group__14624 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DeclaredTargetState__Group__2_in_rule__DeclaredTargetState__Group__14634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DeclaredTargetState__Group__24663 = new BitSet(new long[]{0x00000000000E0010L});
    public static final BitSet FOLLOW_rule__DeclaredTargetState__Group__3_in_rule__DeclaredTargetState__Group__24673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredTargetState__DeclaredStateTypeAssignment_3_in_rule__DeclaredTargetState__Group__34701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeclaredTargetState__Group__4_in_rule__DeclaredTargetState__Group__34711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredTargetState__DeclaredStateNameAssignment_4_in_rule__DeclaredTargetState__Group__44739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__04785 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__04794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__0_in_rule__Emission__Group__14822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Emission__Group_1__04862 = new BitSet(new long[]{0x00000800000021D0L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__1_in_rule__Emission__Group_1__04872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_1_in_rule__Emission__Group_1__14900 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__2_in_rule__Emission__Group_1__14909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Emission__Group_1__24938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__04979 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Assignment__Group__15017 = new BitSet(new long[]{0x00000800000021D0L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__15027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_in_rule__Assignment__Group__25055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Signal__Group__05096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__05106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_1_in_rule__Signal__Group__15134 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group__2_in_rule__Signal__Group__15143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__0_in_rule__Signal__Group__25171 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group__3_in_rule__Signal__Group__25181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Signal__Group__35210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Signal__Group_2__05254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__1_in_rule__Signal__Group_2__05264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_2_1_in_rule__Signal__Group_2__15292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Variable__Group__05331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__05341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__15369 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__15378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Group__25406 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Variable__Group__3_in_rule__Variable__Group__25416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Variable__Group__35445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Variable__Group_2__05489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__05499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__InitialValueAssignment_2_1_in_rule__Variable__Group_2__15527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__OperatorAssignment_0_in_rule__ValOperation__Group__05565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ValOperation__Group__1_in_rule__ValOperation__Group__05574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__SubExpressionsAssignment_1_in_rule__ValOperation__Group__15602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__CompareOperation__Group__05640 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__05648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__15676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__05724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__15752 = new BitSet(new long[]{0x00000000000020D0L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__15761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__25789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotOperation__OperatorsAssignment_0_in_rule__NotOperation__Group__05829 = new BitSet(new long[]{0x00000800000021D0L});
    public static final BitSet FOLLOW_rule__NotOperation__Group__1_in_rule__NotOperation__Group__05838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotOperation__SubExpressionsAssignment_1_in_rule__NotOperation__Group__15866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_rule__AndOperation__Group__05904 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group__1_in_rule__AndOperation__Group__05912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__0_in_rule__AndOperation__Group__15940 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__1_in_rule__AndOperation__Group_1__05989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__OperatorAssignment_1_1_in_rule__AndOperation__Group_1__16017 = new BitSet(new long[]{0x00000800000061D0L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__2_in_rule__AndOperation__Group_1__16026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__SubExpressionAssignment_1_2_in_rule__AndOperation__Group_1__26054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_rule__OrOperation__Group__06094 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group__1_in_rule__OrOperation__Group__06102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__0_in_rule__OrOperation__Group__16130 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__1_in_rule__OrOperation__Group_1__06179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__OperatorAssignment_1_1_in_rule__OrOperation__Group_1__16207 = new BitSet(new long[]{0x00000800000061D0L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__2_in_rule__OrOperation__Group_1__16216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__SubExpressionsAssignment_1_2_in_rule__OrOperation__Group_1__26244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__BooleanExpression__Group_3__06285 = new BitSet(new long[]{0x00000800000061D0L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_3__1_in_rule__BooleanExpression__Group_3__06295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_rule__BooleanExpression__Group_3__16323 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_3__2_in_rule__BooleanExpression__Group_3__16331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__BooleanExpression__Group_3__26360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__State__IsInitialAssignment_06406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__State__IsFinalAssignment_16450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_26489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__StateNameAssignment_46520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__LabelAssignment_56551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateContent_in_rule__State__StateContentAssignment_66582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__State__OutgoingTransitionsAssignment_76613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_rule__StateContent__ExitActionsAssignment_1_06644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_rule__StateContent__EntryActionsAssignment_1_16675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerAction_in_rule__StateContent__InnerActionAssignment_1_26706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObject_in_rule__StateContent__SignalsAndVariablesAssignment_1_36737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__StateContent__InnerStatesAssignment_1_4_06768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__StateContent__ParallelStatesAssignment_1_4_1_16799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__EntryAction__TriggerAssignment_16830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__EntryAction__EffectsAssignment_2_16861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__ExitAction__TriggerAssignment_16892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__ExitAction__EffectsAssignment_2_16923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__InnerAction__TriggerAssignment_16954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__InnerAction__EffectsAssignment_2_16985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__SourceStateNameAssignment_07016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionType_in_rule__Transition__TransitionTypeAssignment_17047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__TargetStateNameAssignment_2_07078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaredTargetState_in_rule__Transition__DeclaredTargetStateAssignment_2_17109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__TransitionLabelAssignment_3_17144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__DeclaredTargetState__IsInitialAssignment_07184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__DeclaredTargetState__IsFinalAssignment_17228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__DeclaredTargetState__DeclaredStateTypeAssignment_37267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeclaredTargetState__DeclaredStateNameAssignment_47298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_07335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Emission__NewValueAssignment_1_17370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_07405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Assignment__ExpressionAssignment_27440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SignalReference__ReferenceAssignment7475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableReference__ReferenceAssignment7514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_17549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__InitialValueAssignment_2_17580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_17611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__InitialValueAssignment_2_17642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment7673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment7704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment7735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HostCode__CodeAssignment7766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperator_in_rule__ValOperation__OperatorAssignment_07798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__ValOperation__SubExpressionsAssignment_17829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_17860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_27891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_rule__NotOperation__OperatorsAssignment_07922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__NotOperation__SubExpressionsAssignment_17953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorAnd_in_rule__AndOperation__OperatorAssignment_1_17984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_rule__AndOperation__SubExpressionAssignment_1_28015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorOr_in_rule__OrOperation__OperatorAssignment_1_18046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_rule__OrOperation__SubExpressionsAssignment_1_28077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__ExitActionsAssignment_1_0_in_synpred12061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__EntryActionsAssignment_1_1_in_synpred22079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__InnerActionAssignment_1_2_in_synpred32097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__SignalsAndVariablesAssignment_1_3_in_synpred42115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_in_synpred383157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_1_in_synpred393195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_2_in_synpred403233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred413273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateNameAssignment_4_in_synpred423313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__LabelAssignment_5_in_synpred433351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateContentAssignment_6_in_synpred443389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__OutgoingTransitionsAssignment_7_in_synpred453427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Alternatives_1_in_synpred463531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Group_1_4_1__0_in_synpred473650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryAction__TriggerAssignment_1_in_synpred483805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryAction__EffectsAssignment_2_1_in_synpred503923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExitAction__TriggerAssignment_1_in_synpred514001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExitAction__EffectsAssignment_2_1_in_synpred534119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerAction__TriggerAssignment_1_in_synpred544197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerAction__EffectsAssignment_2_1_in_synpred564315 = new BitSet(new long[]{0x0000000000000002L});

}