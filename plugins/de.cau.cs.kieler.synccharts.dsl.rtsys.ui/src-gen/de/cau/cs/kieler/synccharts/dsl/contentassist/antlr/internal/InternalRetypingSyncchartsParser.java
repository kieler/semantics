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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NORMAL'", "'cond'", "'reference'", "'textual'", "'state'", "'{'", "'}'", "'||'", "'onentry'", "'onexit'", "'oninner'", "'init'", "'final'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalRetypingSyncchartsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[146+1];
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


    // $ANTLR start ruleStateType
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:192:1: ruleStateType : ( ( rule__StateType__Alternatives ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:196:1: ( ( ( rule__StateType__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:197:1: ( ( rule__StateType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:197:1: ( ( rule__StateType__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:198:1: ( rule__StateType__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateTypeAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:199:1: ( rule__StateType__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:199:2: rule__StateType__Alternatives
            {
            pushFollow(FOLLOW_rule__StateType__Alternatives_in_ruleStateType377);
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


    // $ANTLR start rule__State__Alternatives_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );
    public final void rule__State__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:214:1: ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) )
            int alt1=17;
            switch ( input.LA(1) ) {
            case 22:
                {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    switch ( input.LA(3) ) {
                    case 11:
                        {
                        int LA1_22 = input.LA(4);

                        if ( (synpred11()) ) {
                            alt1=11;
                        }
                        else if ( (synpred12()) ) {
                            alt1=12;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 12:
                        {
                        int LA1_23 = input.LA(4);

                        if ( (synpred11()) ) {
                            alt1=11;
                        }
                        else if ( (synpred12()) ) {
                            alt1=12;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 23, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 13:
                        {
                        int LA1_24 = input.LA(4);

                        if ( (synpred11()) ) {
                            alt1=11;
                        }
                        else if ( (synpred12()) ) {
                            alt1=12;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 24, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 14:
                        {
                        int LA1_25 = input.LA(4);

                        if ( (synpred11()) ) {
                            alt1=11;
                        }
                        else if ( (synpred12()) ) {
                            alt1=12;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 25, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_ID:
                    case 15:
                        {
                        alt1=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 7, input);

                        throw nvae;
                    }

                    }
                    break;
                case EOF:
                case RULE_ID:
                case 15:
                    {
                    alt1=1;
                    }
                    break;
                case 11:
                    {
                    int LA1_9 = input.LA(3);

                    if ( (LA1_9==23) ) {
                        alt1=13;
                    }
                    else if ( (LA1_9==EOF||LA1_9==RULE_ID||LA1_9==15) ) {
                        alt1=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA1_10 = input.LA(3);

                    if ( (LA1_10==EOF||LA1_10==RULE_ID||LA1_10==15) ) {
                        alt1=3;
                    }
                    else if ( (LA1_10==23) ) {
                        alt1=13;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA1_11 = input.LA(3);

                    if ( (LA1_11==EOF||LA1_11==RULE_ID||LA1_11==15) ) {
                        alt1=3;
                    }
                    else if ( (LA1_11==23) ) {
                        alt1=13;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_12 = input.LA(3);

                    if ( (LA1_12==23) ) {
                        alt1=13;
                    }
                    else if ( (LA1_12==EOF||LA1_12==RULE_ID||LA1_12==15) ) {
                        alt1=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 12, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 11:
                {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    int LA1_13 = input.LA(3);

                    if ( (LA1_13==EOF||LA1_13==RULE_ID||LA1_13==15) ) {
                        alt1=5;
                    }
                    else if ( (LA1_13==23) ) {
                        alt1=16;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case 23:
                    {
                    int LA1_14 = input.LA(3);

                    if ( (LA1_14==22) ) {
                        int LA1_31 = input.LA(4);

                        if ( (synpred10()) ) {
                            alt1=10;
                        }
                        else if ( (true) ) {
                            alt1=17;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 31, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_14==EOF||LA1_14==RULE_ID||LA1_14==15) ) {
                        alt1=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 15:
                    {
                    alt1=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 2, input);

                    throw nvae;
                }

                }
                break;
            case 12:
                {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    int LA1_14 = input.LA(3);

                    if ( (LA1_14==22) ) {
                        int LA1_31 = input.LA(4);

                        if ( (synpred10()) ) {
                            alt1=10;
                        }
                        else if ( (true) ) {
                            alt1=17;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 31, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_14==EOF||LA1_14==RULE_ID||LA1_14==15) ) {
                        alt1=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA1_13 = input.LA(3);

                    if ( (LA1_13==EOF||LA1_13==RULE_ID||LA1_13==15) ) {
                        alt1=5;
                    }
                    else if ( (LA1_13==23) ) {
                        alt1=16;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 15:
                    {
                    alt1=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 3, input);

                    throw nvae;
                }

                }
                break;
            case 13:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case 15:
                    {
                    alt1=4;
                    }
                    break;
                case 22:
                    {
                    int LA1_13 = input.LA(3);

                    if ( (LA1_13==EOF||LA1_13==RULE_ID||LA1_13==15) ) {
                        alt1=5;
                    }
                    else if ( (LA1_13==23) ) {
                        alt1=16;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case 23:
                    {
                    int LA1_14 = input.LA(3);

                    if ( (LA1_14==22) ) {
                        int LA1_31 = input.LA(4);

                        if ( (synpred10()) ) {
                            alt1=10;
                        }
                        else if ( (true) ) {
                            alt1=17;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 31, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_14==EOF||LA1_14==RULE_ID||LA1_14==15) ) {
                        alt1=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 4, input);

                    throw nvae;
                }

                }
                break;
            case 14:
                {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    int LA1_13 = input.LA(3);

                    if ( (LA1_13==EOF||LA1_13==RULE_ID||LA1_13==15) ) {
                        alt1=5;
                    }
                    else if ( (LA1_13==23) ) {
                        alt1=16;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case 23:
                    {
                    int LA1_14 = input.LA(3);

                    if ( (LA1_14==22) ) {
                        int LA1_31 = input.LA(4);

                        if ( (synpred10()) ) {
                            alt1=10;
                        }
                        else if ( (true) ) {
                            alt1=17;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 31, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_14==EOF||LA1_14==RULE_ID||LA1_14==15) ) {
                        alt1=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 15:
                    {
                    alt1=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 5, input);

                    throw nvae;
                }

                }
                break;
            case 23:
                {
                switch ( input.LA(2) ) {
                case 11:
                    {
                    int LA1_16 = input.LA(3);

                    if ( (LA1_16==22) ) {
                        alt1=15;
                    }
                    else if ( (LA1_16==EOF||LA1_16==RULE_ID||LA1_16==15) ) {
                        alt1=9;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA1_17 = input.LA(3);

                    if ( (LA1_17==EOF||LA1_17==RULE_ID||LA1_17==15) ) {
                        alt1=9;
                    }
                    else if ( (LA1_17==22) ) {
                        alt1=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA1_18 = input.LA(3);

                    if ( (LA1_18==EOF||LA1_18==RULE_ID||LA1_18==15) ) {
                        alt1=9;
                    }
                    else if ( (LA1_18==22) ) {
                        alt1=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==22) ) {
                        alt1=15;
                    }
                    else if ( (LA1_19==EOF||LA1_19==RULE_ID||LA1_19==15) ) {
                        alt1=9;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA1_20 = input.LA(3);

                    if ( ((LA1_20>=11 && LA1_20<=14)) ) {
                        alt1=14;
                    }
                    else if ( (LA1_20==EOF||LA1_20==RULE_ID||LA1_20==15) ) {
                        alt1=8;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 15:
                    {
                    alt1=7;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 6, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("210:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:215:1: ( ( rule__State__IsInitialAssignment_0_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:215:1: ( ( rule__State__IsInitialAssignment_0_0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:216:1: ( rule__State__IsInitialAssignment_0_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getIsInitialAssignment_0_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:217:1: ( rule__State__IsInitialAssignment_0_0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:217:2: rule__State__IsInitialAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_0_in_rule__State__Alternatives_0412);
                    rule__State__IsInitialAssignment_0_0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getIsInitialAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:221:6: ( ( rule__State__Group_0_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:221:6: ( ( rule__State__Group_0_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:222:1: ( rule__State__Group_0_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:223:1: ( rule__State__Group_0_1__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:223:2: rule__State__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_1__0_in_rule__State__Alternatives_0430);
                    rule__State__Group_0_1__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:227:6: ( ( rule__State__Group_0_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:227:6: ( ( rule__State__Group_0_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:228:1: ( rule__State__Group_0_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:229:1: ( rule__State__Group_0_2__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:229:2: rule__State__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_2__0_in_rule__State__Alternatives_0448);
                    rule__State__Group_0_2__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:233:6: ( ( rule__State__StateKindAssignment_0_3 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:233:6: ( ( rule__State__StateKindAssignment_0_3 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:234:1: ( rule__State__StateKindAssignment_0_3 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getStateKindAssignment_0_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:235:1: ( rule__State__StateKindAssignment_0_3 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:235:2: rule__State__StateKindAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__State__StateKindAssignment_0_3_in_rule__State__Alternatives_0466);
                    rule__State__StateKindAssignment_0_3();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getStateKindAssignment_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:239:6: ( ( rule__State__Group_0_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:239:6: ( ( rule__State__Group_0_4__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:240:1: ( rule__State__Group_0_4__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:241:1: ( rule__State__Group_0_4__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:241:2: rule__State__Group_0_4__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_4__0_in_rule__State__Alternatives_0484);
                    rule__State__Group_0_4__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:245:6: ( ( rule__State__Group_0_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:245:6: ( ( rule__State__Group_0_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:246:1: ( rule__State__Group_0_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:247:1: ( rule__State__Group_0_5__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:247:2: rule__State__Group_0_5__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_5__0_in_rule__State__Alternatives_0502);
                    rule__State__Group_0_5__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:251:6: ( ( rule__State__IsFinalAssignment_0_6 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:251:6: ( ( rule__State__IsFinalAssignment_0_6 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:252:1: ( rule__State__IsFinalAssignment_0_6 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getIsFinalAssignment_0_6()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:253:1: ( rule__State__IsFinalAssignment_0_6 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:253:2: rule__State__IsFinalAssignment_0_6
                    {
                    pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_6_in_rule__State__Alternatives_0520);
                    rule__State__IsFinalAssignment_0_6();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getIsFinalAssignment_0_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:257:6: ( ( rule__State__Group_0_7__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:257:6: ( ( rule__State__Group_0_7__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:258:1: ( rule__State__Group_0_7__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_7()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:259:1: ( rule__State__Group_0_7__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:259:2: rule__State__Group_0_7__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_7__0_in_rule__State__Alternatives_0538);
                    rule__State__Group_0_7__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:263:6: ( ( rule__State__Group_0_8__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:263:6: ( ( rule__State__Group_0_8__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:264:1: ( rule__State__Group_0_8__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_8()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:265:1: ( rule__State__Group_0_8__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:265:2: rule__State__Group_0_8__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_8__0_in_rule__State__Alternatives_0556);
                    rule__State__Group_0_8__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:269:6: ( ( rule__State__Group_0_9__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:269:6: ( ( rule__State__Group_0_9__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:270:1: ( rule__State__Group_0_9__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_9()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:271:1: ( rule__State__Group_0_9__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:271:2: rule__State__Group_0_9__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_9__0_in_rule__State__Alternatives_0574);
                    rule__State__Group_0_9__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:275:6: ( ( rule__State__Group_0_10__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:275:6: ( ( rule__State__Group_0_10__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:276:1: ( rule__State__Group_0_10__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_10()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:277:1: ( rule__State__Group_0_10__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:277:2: rule__State__Group_0_10__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_10__0_in_rule__State__Alternatives_0592);
                    rule__State__Group_0_10__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:281:6: ( ( rule__State__Group_0_11__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:281:6: ( ( rule__State__Group_0_11__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:282:1: ( rule__State__Group_0_11__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_11()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:283:1: ( rule__State__Group_0_11__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:283:2: rule__State__Group_0_11__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_11__0_in_rule__State__Alternatives_0610);
                    rule__State__Group_0_11__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:287:6: ( ( rule__State__Group_0_12__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:287:6: ( ( rule__State__Group_0_12__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:288:1: ( rule__State__Group_0_12__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_12()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:289:1: ( rule__State__Group_0_12__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:289:2: rule__State__Group_0_12__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_12__0_in_rule__State__Alternatives_0628);
                    rule__State__Group_0_12__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:293:6: ( ( rule__State__Group_0_13__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:293:6: ( ( rule__State__Group_0_13__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:294:1: ( rule__State__Group_0_13__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_13()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:295:1: ( rule__State__Group_0_13__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:295:2: rule__State__Group_0_13__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_13__0_in_rule__State__Alternatives_0646);
                    rule__State__Group_0_13__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:299:6: ( ( rule__State__Group_0_14__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:299:6: ( ( rule__State__Group_0_14__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:300:1: ( rule__State__Group_0_14__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_14()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:301:1: ( rule__State__Group_0_14__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:301:2: rule__State__Group_0_14__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_14__0_in_rule__State__Alternatives_0664);
                    rule__State__Group_0_14__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:305:6: ( ( rule__State__Group_0_15__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:305:6: ( ( rule__State__Group_0_15__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:306:1: ( rule__State__Group_0_15__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_15()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:307:1: ( rule__State__Group_0_15__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:307:2: rule__State__Group_0_15__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_15__0_in_rule__State__Alternatives_0682);
                    rule__State__Group_0_15__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:311:6: ( ( rule__State__Group_0_16__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:311:6: ( ( rule__State__Group_0_16__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:312:1: ( rule__State__Group_0_16__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_16()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:313:1: ( rule__State__Group_0_16__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:313:2: rule__State__Group_0_16__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_16__0_in_rule__State__Alternatives_0700);
                    rule__State__Group_0_16__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_16()); 
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
    // $ANTLR end rule__State__Alternatives_0


    // $ANTLR start rule__StateContent__Alternatives_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:322:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) | ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) | ( ( rule__StateContent__Group_1_3__0 ) ) );
    public final void rule__StateContent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:326:1: ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) | ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) | ( ( rule__StateContent__Group_1_3__0 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case RULE_ID:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 22:
            case 23:
                {
                alt2=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("322:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) | ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) | ( ( rule__StateContent__Group_1_3__0 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:327:1: ( ( rule__StateContent__ExitActionsAssignment_1_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:327:1: ( ( rule__StateContent__ExitActionsAssignment_1_0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:328:1: ( rule__StateContent__ExitActionsAssignment_1_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getExitActionsAssignment_1_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:329:1: ( rule__StateContent__ExitActionsAssignment_1_0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:329:2: rule__StateContent__ExitActionsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__StateContent__ExitActionsAssignment_1_0_in_rule__StateContent__Alternatives_1733);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:333:6: ( ( rule__StateContent__EntryActionsAssignment_1_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:333:6: ( ( rule__StateContent__EntryActionsAssignment_1_1 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:334:1: ( rule__StateContent__EntryActionsAssignment_1_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getEntryActionsAssignment_1_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:335:1: ( rule__StateContent__EntryActionsAssignment_1_1 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:335:2: rule__StateContent__EntryActionsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__StateContent__EntryActionsAssignment_1_1_in_rule__StateContent__Alternatives_1751);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:339:6: ( ( rule__StateContent__InnerActionAssignment_1_2 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:339:6: ( ( rule__StateContent__InnerActionAssignment_1_2 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:340:1: ( rule__StateContent__InnerActionAssignment_1_2 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getInnerActionAssignment_1_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:341:1: ( rule__StateContent__InnerActionAssignment_1_2 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:341:2: rule__StateContent__InnerActionAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__StateContent__InnerActionAssignment_1_2_in_rule__StateContent__Alternatives_1769);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:345:6: ( ( rule__StateContent__Group_1_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:345:6: ( ( rule__StateContent__Group_1_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:346:1: ( rule__StateContent__Group_1_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getGroup_1_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:347:1: ( rule__StateContent__Group_1_3__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:347:2: rule__StateContent__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__StateContent__Group_1_3__0_in_rule__StateContent__Alternatives_1787);
                    rule__StateContent__Group_1_3__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateContentAccess().getGroup_1_3()); 
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


    // $ANTLR start rule__StateType__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:356:1: rule__StateType__Alternatives : ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) );
    public final void rule__StateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:360:1: ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("356:1: rule__StateType__Alternatives : ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:361:1: ( ( 'NORMAL' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:361:1: ( ( 'NORMAL' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:362:1: ( 'NORMAL' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:363:1: ( 'NORMAL' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:363:3: 'NORMAL'
                    {
                    match(input,11,FOLLOW_11_in_rule__StateType__Alternatives821); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:368:6: ( ( 'cond' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:368:6: ( ( 'cond' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:369:1: ( 'cond' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:370:1: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:370:3: 'cond'
                    {
                    match(input,12,FOLLOW_12_in_rule__StateType__Alternatives842); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:375:6: ( ( 'reference' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:375:6: ( ( 'reference' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:376:1: ( 'reference' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:377:1: ( 'reference' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:377:3: 'reference'
                    {
                    match(input,13,FOLLOW_13_in_rule__StateType__Alternatives863); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:382:6: ( ( 'textual' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:382:6: ( ( 'textual' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:383:1: ( 'textual' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:384:1: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:384:3: 'textual'
                    {
                    match(input,14,FOLLOW_14_in_rule__StateType__Alternatives884); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3()); 
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


    // $ANTLR start rule__State__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:396:1: rule__State__Group__0 : ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:400:1: ( ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:401:1: ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:401:1: ( ( rule__State__Alternatives_0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:402:1: ( rule__State__Alternatives_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:403:1: ( rule__State__Alternatives_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=14)||(LA4_0>=22 && LA4_0<=23)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:403:2: rule__State__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__State__Alternatives_0_in_rule__State__Group__0921);
                    rule__State__Alternatives_0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getAlternatives_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__0931);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:414:1: rule__State__Group__1 : ( ( 'state' )? ) rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:418:1: ( ( ( 'state' )? ) rule__State__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:419:1: ( ( 'state' )? ) rule__State__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:419:1: ( ( 'state' )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:420:1: ( 'state' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:421:1: ( 'state' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:422:2: 'state'
                    {
                    match(input,15,FOLLOW_15_in_rule__State__Group__1961); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__1973);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:434:1: rule__State__Group__2 : ( ( rule__State__StateNameAssignment_2 ) ) rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:438:1: ( ( ( rule__State__StateNameAssignment_2 ) ) rule__State__Group__3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:439:1: ( ( rule__State__StateNameAssignment_2 ) ) rule__State__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:439:1: ( ( rule__State__StateNameAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:440:1: ( rule__State__StateNameAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateNameAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:441:1: ( rule__State__StateNameAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:441:2: rule__State__StateNameAssignment_2
            {
            pushFollow(FOLLOW_rule__State__StateNameAssignment_2_in_rule__State__Group__21001);
            rule__State__StateNameAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateNameAssignment_2()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__21010);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:452:1: rule__State__Group__3 : ( ( rule__State__LabelAssignment_3 )? ) rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:456:1: ( ( ( rule__State__LabelAssignment_3 )? ) rule__State__Group__4 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:457:1: ( ( rule__State__LabelAssignment_3 )? ) rule__State__Group__4
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:457:1: ( ( rule__State__LabelAssignment_3 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:458:1: ( rule__State__LabelAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getLabelAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:459:1: ( rule__State__LabelAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:459:2: rule__State__LabelAssignment_3
                    {
                    pushFollow(FOLLOW_rule__State__LabelAssignment_3_in_rule__State__Group__31038);
                    rule__State__LabelAssignment_3();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getLabelAssignment_3()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__31048);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:470:1: rule__State__Group__4 : ( ( rule__State__StateContentAssignment_4 )? ) ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:474:1: ( ( ( rule__State__StateContentAssignment_4 )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:475:1: ( ( rule__State__StateContentAssignment_4 )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:475:1: ( ( rule__State__StateContentAssignment_4 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:476:1: ( rule__State__StateContentAssignment_4 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateContentAssignment_4()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:477:1: ( rule__State__StateContentAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:477:2: rule__State__StateContentAssignment_4
                    {
                    pushFollow(FOLLOW_rule__State__StateContentAssignment_4_in_rule__State__Group__41076);
                    rule__State__StateContentAssignment_4();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateContentAssignment_4()); 
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
    // $ANTLR end rule__State__Group__4


    // $ANTLR start rule__State__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:497:1: rule__State__Group_0_1__0 : ( ( rule__State__IsInitialAssignment_0_1_0 ) ) rule__State__Group_0_1__1 ;
    public final void rule__State__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:501:1: ( ( ( rule__State__IsInitialAssignment_0_1_0 ) ) rule__State__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:502:1: ( ( rule__State__IsInitialAssignment_0_1_0 ) ) rule__State__Group_0_1__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:502:1: ( ( rule__State__IsInitialAssignment_0_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:503:1: ( rule__State__IsInitialAssignment_0_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:504:1: ( rule__State__IsInitialAssignment_0_1_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:504:2: rule__State__IsInitialAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_1_0_in_rule__State__Group_0_1__01121);
            rule__State__IsInitialAssignment_0_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_1__1_in_rule__State__Group_0_1__01130);
            rule__State__Group_0_1__1();
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
    // $ANTLR end rule__State__Group_0_1__0


    // $ANTLR start rule__State__Group_0_1__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:515:1: rule__State__Group_0_1__1 : ( ( rule__State__IsFinalAssignment_0_1_1 ) ) ;
    public final void rule__State__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:519:1: ( ( ( rule__State__IsFinalAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:520:1: ( ( rule__State__IsFinalAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:520:1: ( ( rule__State__IsFinalAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:521:1: ( rule__State__IsFinalAssignment_0_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:522:1: ( rule__State__IsFinalAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:522:2: rule__State__IsFinalAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_1_1_in_rule__State__Group_0_1__11158);
            rule__State__IsFinalAssignment_0_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_1_1()); 
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
    // $ANTLR end rule__State__Group_0_1__1


    // $ANTLR start rule__State__Group_0_2__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:536:1: rule__State__Group_0_2__0 : ( ( rule__State__IsInitialAssignment_0_2_0 ) ) rule__State__Group_0_2__1 ;
    public final void rule__State__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:540:1: ( ( ( rule__State__IsInitialAssignment_0_2_0 ) ) rule__State__Group_0_2__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:541:1: ( ( rule__State__IsInitialAssignment_0_2_0 ) ) rule__State__Group_0_2__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:541:1: ( ( rule__State__IsInitialAssignment_0_2_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:542:1: ( rule__State__IsInitialAssignment_0_2_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:543:1: ( rule__State__IsInitialAssignment_0_2_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:543:2: rule__State__IsInitialAssignment_0_2_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_2_0_in_rule__State__Group_0_2__01196);
            rule__State__IsInitialAssignment_0_2_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_2_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_2__1_in_rule__State__Group_0_2__01205);
            rule__State__Group_0_2__1();
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
    // $ANTLR end rule__State__Group_0_2__0


    // $ANTLR start rule__State__Group_0_2__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:554:1: rule__State__Group_0_2__1 : ( ( rule__State__StateKindAssignment_0_2_1 ) ) ;
    public final void rule__State__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:558:1: ( ( ( rule__State__StateKindAssignment_0_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:559:1: ( ( rule__State__StateKindAssignment_0_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:559:1: ( ( rule__State__StateKindAssignment_0_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:560:1: ( rule__State__StateKindAssignment_0_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_2_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:561:1: ( rule__State__StateKindAssignment_0_2_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:561:2: rule__State__StateKindAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_2_1_in_rule__State__Group_0_2__11233);
            rule__State__StateKindAssignment_0_2_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_2_1()); 
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
    // $ANTLR end rule__State__Group_0_2__1


    // $ANTLR start rule__State__Group_0_4__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:575:1: rule__State__Group_0_4__0 : ( ( rule__State__StateKindAssignment_0_4_0 ) ) rule__State__Group_0_4__1 ;
    public final void rule__State__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:579:1: ( ( ( rule__State__StateKindAssignment_0_4_0 ) ) rule__State__Group_0_4__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:580:1: ( ( rule__State__StateKindAssignment_0_4_0 ) ) rule__State__Group_0_4__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:580:1: ( ( rule__State__StateKindAssignment_0_4_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:581:1: ( rule__State__StateKindAssignment_0_4_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_4_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:582:1: ( rule__State__StateKindAssignment_0_4_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:582:2: rule__State__StateKindAssignment_0_4_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_4_0_in_rule__State__Group_0_4__01271);
            rule__State__StateKindAssignment_0_4_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_4_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_4__1_in_rule__State__Group_0_4__01280);
            rule__State__Group_0_4__1();
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
    // $ANTLR end rule__State__Group_0_4__0


    // $ANTLR start rule__State__Group_0_4__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:593:1: rule__State__Group_0_4__1 : ( ( rule__State__IsInitialAssignment_0_4_1 ) ) ;
    public final void rule__State__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:597:1: ( ( ( rule__State__IsInitialAssignment_0_4_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:598:1: ( ( rule__State__IsInitialAssignment_0_4_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:598:1: ( ( rule__State__IsInitialAssignment_0_4_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:599:1: ( rule__State__IsInitialAssignment_0_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_4_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:600:1: ( rule__State__IsInitialAssignment_0_4_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:600:2: rule__State__IsInitialAssignment_0_4_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_4_1_in_rule__State__Group_0_4__11308);
            rule__State__IsInitialAssignment_0_4_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_4_1()); 
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
    // $ANTLR end rule__State__Group_0_4__1


    // $ANTLR start rule__State__Group_0_5__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:614:1: rule__State__Group_0_5__0 : ( ( rule__State__StateKindAssignment_0_5_0 ) ) rule__State__Group_0_5__1 ;
    public final void rule__State__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:618:1: ( ( ( rule__State__StateKindAssignment_0_5_0 ) ) rule__State__Group_0_5__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:619:1: ( ( rule__State__StateKindAssignment_0_5_0 ) ) rule__State__Group_0_5__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:619:1: ( ( rule__State__StateKindAssignment_0_5_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:620:1: ( rule__State__StateKindAssignment_0_5_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_5_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:621:1: ( rule__State__StateKindAssignment_0_5_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:621:2: rule__State__StateKindAssignment_0_5_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_5_0_in_rule__State__Group_0_5__01346);
            rule__State__StateKindAssignment_0_5_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_5_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_5__1_in_rule__State__Group_0_5__01355);
            rule__State__Group_0_5__1();
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
    // $ANTLR end rule__State__Group_0_5__0


    // $ANTLR start rule__State__Group_0_5__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:632:1: rule__State__Group_0_5__1 : ( ( rule__State__IsFinalAssignment_0_5_1 ) ) ;
    public final void rule__State__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:636:1: ( ( ( rule__State__IsFinalAssignment_0_5_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:637:1: ( ( rule__State__IsFinalAssignment_0_5_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:637:1: ( ( rule__State__IsFinalAssignment_0_5_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:638:1: ( rule__State__IsFinalAssignment_0_5_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_5_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:639:1: ( rule__State__IsFinalAssignment_0_5_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:639:2: rule__State__IsFinalAssignment_0_5_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_5_1_in_rule__State__Group_0_5__11383);
            rule__State__IsFinalAssignment_0_5_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_5_1()); 
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
    // $ANTLR end rule__State__Group_0_5__1


    // $ANTLR start rule__State__Group_0_7__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:653:1: rule__State__Group_0_7__0 : ( ( rule__State__IsFinalAssignment_0_7_0 ) ) rule__State__Group_0_7__1 ;
    public final void rule__State__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:657:1: ( ( ( rule__State__IsFinalAssignment_0_7_0 ) ) rule__State__Group_0_7__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:658:1: ( ( rule__State__IsFinalAssignment_0_7_0 ) ) rule__State__Group_0_7__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:658:1: ( ( rule__State__IsFinalAssignment_0_7_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:659:1: ( rule__State__IsFinalAssignment_0_7_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_7_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:660:1: ( rule__State__IsFinalAssignment_0_7_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:660:2: rule__State__IsFinalAssignment_0_7_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_7_0_in_rule__State__Group_0_7__01421);
            rule__State__IsFinalAssignment_0_7_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_7_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_7__1_in_rule__State__Group_0_7__01430);
            rule__State__Group_0_7__1();
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
    // $ANTLR end rule__State__Group_0_7__0


    // $ANTLR start rule__State__Group_0_7__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:671:1: rule__State__Group_0_7__1 : ( ( rule__State__IsInitialAssignment_0_7_1 ) ) ;
    public final void rule__State__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:675:1: ( ( ( rule__State__IsInitialAssignment_0_7_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:676:1: ( ( rule__State__IsInitialAssignment_0_7_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:676:1: ( ( rule__State__IsInitialAssignment_0_7_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:677:1: ( rule__State__IsInitialAssignment_0_7_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_7_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:678:1: ( rule__State__IsInitialAssignment_0_7_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:678:2: rule__State__IsInitialAssignment_0_7_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_7_1_in_rule__State__Group_0_7__11458);
            rule__State__IsInitialAssignment_0_7_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_7_1()); 
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
    // $ANTLR end rule__State__Group_0_7__1


    // $ANTLR start rule__State__Group_0_8__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:692:1: rule__State__Group_0_8__0 : ( ( rule__State__IsFinalAssignment_0_8_0 ) ) rule__State__Group_0_8__1 ;
    public final void rule__State__Group_0_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:696:1: ( ( ( rule__State__IsFinalAssignment_0_8_0 ) ) rule__State__Group_0_8__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:697:1: ( ( rule__State__IsFinalAssignment_0_8_0 ) ) rule__State__Group_0_8__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:697:1: ( ( rule__State__IsFinalAssignment_0_8_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:698:1: ( rule__State__IsFinalAssignment_0_8_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_8_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:699:1: ( rule__State__IsFinalAssignment_0_8_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:699:2: rule__State__IsFinalAssignment_0_8_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_8_0_in_rule__State__Group_0_8__01496);
            rule__State__IsFinalAssignment_0_8_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_8_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_8__1_in_rule__State__Group_0_8__01505);
            rule__State__Group_0_8__1();
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
    // $ANTLR end rule__State__Group_0_8__0


    // $ANTLR start rule__State__Group_0_8__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:710:1: rule__State__Group_0_8__1 : ( ( rule__State__StateKindAssignment_0_8_1 ) ) ;
    public final void rule__State__Group_0_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:714:1: ( ( ( rule__State__StateKindAssignment_0_8_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:715:1: ( ( rule__State__StateKindAssignment_0_8_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:715:1: ( ( rule__State__StateKindAssignment_0_8_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:716:1: ( rule__State__StateKindAssignment_0_8_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_8_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:717:1: ( rule__State__StateKindAssignment_0_8_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:717:2: rule__State__StateKindAssignment_0_8_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_8_1_in_rule__State__Group_0_8__11533);
            rule__State__StateKindAssignment_0_8_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_8_1()); 
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
    // $ANTLR end rule__State__Group_0_8__1


    // $ANTLR start rule__State__Group_0_9__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:731:1: rule__State__Group_0_9__0 : ( ( rule__State__StateKindAssignment_0_9_0 ) ) rule__State__Group_0_9__1 ;
    public final void rule__State__Group_0_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:735:1: ( ( ( rule__State__StateKindAssignment_0_9_0 ) ) rule__State__Group_0_9__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:736:1: ( ( rule__State__StateKindAssignment_0_9_0 ) ) rule__State__Group_0_9__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:736:1: ( ( rule__State__StateKindAssignment_0_9_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:737:1: ( rule__State__StateKindAssignment_0_9_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_9_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:738:1: ( rule__State__StateKindAssignment_0_9_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:738:2: rule__State__StateKindAssignment_0_9_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_9_0_in_rule__State__Group_0_9__01571);
            rule__State__StateKindAssignment_0_9_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_9_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_9__1_in_rule__State__Group_0_9__01580);
            rule__State__Group_0_9__1();
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
    // $ANTLR end rule__State__Group_0_9__0


    // $ANTLR start rule__State__Group_0_9__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:749:1: rule__State__Group_0_9__1 : ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2 ;
    public final void rule__State__Group_0_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:753:1: ( ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:754:1: ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:754:1: ( ( rule__State__IsFinalAssignment_0_9_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:755:1: ( rule__State__IsFinalAssignment_0_9_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_9_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:756:1: ( rule__State__IsFinalAssignment_0_9_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:756:2: rule__State__IsFinalAssignment_0_9_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_9_1_in_rule__State__Group_0_9__11608);
            rule__State__IsFinalAssignment_0_9_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_9_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_9__2_in_rule__State__Group_0_9__11617);
            rule__State__Group_0_9__2();
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
    // $ANTLR end rule__State__Group_0_9__1


    // $ANTLR start rule__State__Group_0_9__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:767:1: rule__State__Group_0_9__2 : ( ( rule__State__IsInitialAssignment_0_9_2 ) ) ;
    public final void rule__State__Group_0_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:771:1: ( ( ( rule__State__IsInitialAssignment_0_9_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:772:1: ( ( rule__State__IsInitialAssignment_0_9_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:772:1: ( ( rule__State__IsInitialAssignment_0_9_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:773:1: ( rule__State__IsInitialAssignment_0_9_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_9_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:774:1: ( rule__State__IsInitialAssignment_0_9_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:774:2: rule__State__IsInitialAssignment_0_9_2
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_9_2_in_rule__State__Group_0_9__21645);
            rule__State__IsInitialAssignment_0_9_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_9_2()); 
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
    // $ANTLR end rule__State__Group_0_9__2


    // $ANTLR start rule__State__Group_0_10__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:790:1: rule__State__Group_0_10__0 : ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1 ;
    public final void rule__State__Group_0_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:794:1: ( ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:795:1: ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:795:1: ( ( rule__State__IsInitialAssignment_0_10_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:796:1: ( rule__State__IsInitialAssignment_0_10_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_10_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:797:1: ( rule__State__IsInitialAssignment_0_10_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:797:2: rule__State__IsInitialAssignment_0_10_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_10_0_in_rule__State__Group_0_10__01685);
            rule__State__IsInitialAssignment_0_10_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_10_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_10__1_in_rule__State__Group_0_10__01694);
            rule__State__Group_0_10__1();
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
    // $ANTLR end rule__State__Group_0_10__0


    // $ANTLR start rule__State__Group_0_10__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:808:1: rule__State__Group_0_10__1 : ( ( rule__State__IsFinalAssignment_0_10_1 ) ) rule__State__Group_0_10__2 ;
    public final void rule__State__Group_0_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:812:1: ( ( ( rule__State__IsFinalAssignment_0_10_1 ) ) rule__State__Group_0_10__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:813:1: ( ( rule__State__IsFinalAssignment_0_10_1 ) ) rule__State__Group_0_10__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:813:1: ( ( rule__State__IsFinalAssignment_0_10_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:814:1: ( rule__State__IsFinalAssignment_0_10_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_10_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:815:1: ( rule__State__IsFinalAssignment_0_10_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:815:2: rule__State__IsFinalAssignment_0_10_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_10_1_in_rule__State__Group_0_10__11722);
            rule__State__IsFinalAssignment_0_10_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_10_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_10__2_in_rule__State__Group_0_10__11731);
            rule__State__Group_0_10__2();
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
    // $ANTLR end rule__State__Group_0_10__1


    // $ANTLR start rule__State__Group_0_10__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:826:1: rule__State__Group_0_10__2 : ( ( rule__State__StateKindAssignment_0_10_2 ) ) ;
    public final void rule__State__Group_0_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:830:1: ( ( ( rule__State__StateKindAssignment_0_10_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:831:1: ( ( rule__State__StateKindAssignment_0_10_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:831:1: ( ( rule__State__StateKindAssignment_0_10_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:832:1: ( rule__State__StateKindAssignment_0_10_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_10_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:833:1: ( rule__State__StateKindAssignment_0_10_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:833:2: rule__State__StateKindAssignment_0_10_2
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_10_2_in_rule__State__Group_0_10__21759);
            rule__State__StateKindAssignment_0_10_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_10_2()); 
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
    // $ANTLR end rule__State__Group_0_10__2


    // $ANTLR start rule__State__Group_0_11__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:849:1: rule__State__Group_0_11__0 : ( ( rule__State__IsInitialAssignment_0_11_0 ) ) rule__State__Group_0_11__1 ;
    public final void rule__State__Group_0_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:853:1: ( ( ( rule__State__IsInitialAssignment_0_11_0 ) ) rule__State__Group_0_11__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:854:1: ( ( rule__State__IsInitialAssignment_0_11_0 ) ) rule__State__Group_0_11__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:854:1: ( ( rule__State__IsInitialAssignment_0_11_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:855:1: ( rule__State__IsInitialAssignment_0_11_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_11_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:856:1: ( rule__State__IsInitialAssignment_0_11_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:856:2: rule__State__IsInitialAssignment_0_11_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_11_0_in_rule__State__Group_0_11__01799);
            rule__State__IsInitialAssignment_0_11_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_11_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_11__1_in_rule__State__Group_0_11__01808);
            rule__State__Group_0_11__1();
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
    // $ANTLR end rule__State__Group_0_11__0


    // $ANTLR start rule__State__Group_0_11__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:867:1: rule__State__Group_0_11__1 : ( ( rule__State__IsFinalAssignment_0_11_1 ) ) rule__State__Group_0_11__2 ;
    public final void rule__State__Group_0_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:871:1: ( ( ( rule__State__IsFinalAssignment_0_11_1 ) ) rule__State__Group_0_11__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:872:1: ( ( rule__State__IsFinalAssignment_0_11_1 ) ) rule__State__Group_0_11__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:872:1: ( ( rule__State__IsFinalAssignment_0_11_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:873:1: ( rule__State__IsFinalAssignment_0_11_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_11_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:874:1: ( rule__State__IsFinalAssignment_0_11_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:874:2: rule__State__IsFinalAssignment_0_11_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_11_1_in_rule__State__Group_0_11__11836);
            rule__State__IsFinalAssignment_0_11_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_11_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_11__2_in_rule__State__Group_0_11__11845);
            rule__State__Group_0_11__2();
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
    // $ANTLR end rule__State__Group_0_11__1


    // $ANTLR start rule__State__Group_0_11__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:885:1: rule__State__Group_0_11__2 : ( ( rule__State__StateKindAssignment_0_11_2 ) ) ;
    public final void rule__State__Group_0_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:889:1: ( ( ( rule__State__StateKindAssignment_0_11_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:890:1: ( ( rule__State__StateKindAssignment_0_11_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:890:1: ( ( rule__State__StateKindAssignment_0_11_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:891:1: ( rule__State__StateKindAssignment_0_11_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_11_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:892:1: ( rule__State__StateKindAssignment_0_11_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:892:2: rule__State__StateKindAssignment_0_11_2
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_11_2_in_rule__State__Group_0_11__21873);
            rule__State__StateKindAssignment_0_11_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_11_2()); 
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
    // $ANTLR end rule__State__Group_0_11__2


    // $ANTLR start rule__State__Group_0_12__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:908:1: rule__State__Group_0_12__0 : ( ( rule__State__IsInitialAssignment_0_12_0 ) ) rule__State__Group_0_12__1 ;
    public final void rule__State__Group_0_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:912:1: ( ( ( rule__State__IsInitialAssignment_0_12_0 ) ) rule__State__Group_0_12__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:913:1: ( ( rule__State__IsInitialAssignment_0_12_0 ) ) rule__State__Group_0_12__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:913:1: ( ( rule__State__IsInitialAssignment_0_12_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:914:1: ( rule__State__IsInitialAssignment_0_12_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_12_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:915:1: ( rule__State__IsInitialAssignment_0_12_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:915:2: rule__State__IsInitialAssignment_0_12_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_12_0_in_rule__State__Group_0_12__01913);
            rule__State__IsInitialAssignment_0_12_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_12_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_12__1_in_rule__State__Group_0_12__01922);
            rule__State__Group_0_12__1();
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
    // $ANTLR end rule__State__Group_0_12__0


    // $ANTLR start rule__State__Group_0_12__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:926:1: rule__State__Group_0_12__1 : ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2 ;
    public final void rule__State__Group_0_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:930:1: ( ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:931:1: ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:931:1: ( ( rule__State__StateKindAssignment_0_12_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:932:1: ( rule__State__StateKindAssignment_0_12_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_12_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:933:1: ( rule__State__StateKindAssignment_0_12_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:933:2: rule__State__StateKindAssignment_0_12_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_12_1_in_rule__State__Group_0_12__11950);
            rule__State__StateKindAssignment_0_12_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_12_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_12__2_in_rule__State__Group_0_12__11959);
            rule__State__Group_0_12__2();
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
    // $ANTLR end rule__State__Group_0_12__1


    // $ANTLR start rule__State__Group_0_12__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:944:1: rule__State__Group_0_12__2 : ( ( rule__State__IsFinalAssignment_0_12_2 ) ) ;
    public final void rule__State__Group_0_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:948:1: ( ( ( rule__State__IsFinalAssignment_0_12_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:949:1: ( ( rule__State__IsFinalAssignment_0_12_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:949:1: ( ( rule__State__IsFinalAssignment_0_12_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:950:1: ( rule__State__IsFinalAssignment_0_12_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_12_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:951:1: ( rule__State__IsFinalAssignment_0_12_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:951:2: rule__State__IsFinalAssignment_0_12_2
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_12_2_in_rule__State__Group_0_12__21987);
            rule__State__IsFinalAssignment_0_12_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_12_2()); 
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
    // $ANTLR end rule__State__Group_0_12__2


    // $ANTLR start rule__State__Group_0_13__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:967:1: rule__State__Group_0_13__0 : ( ( rule__State__IsFinalAssignment_0_13_0 ) ) rule__State__Group_0_13__1 ;
    public final void rule__State__Group_0_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:971:1: ( ( ( rule__State__IsFinalAssignment_0_13_0 ) ) rule__State__Group_0_13__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:972:1: ( ( rule__State__IsFinalAssignment_0_13_0 ) ) rule__State__Group_0_13__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:972:1: ( ( rule__State__IsFinalAssignment_0_13_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:973:1: ( rule__State__IsFinalAssignment_0_13_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_13_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:974:1: ( rule__State__IsFinalAssignment_0_13_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:974:2: rule__State__IsFinalAssignment_0_13_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_13_0_in_rule__State__Group_0_13__02027);
            rule__State__IsFinalAssignment_0_13_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_13_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_13__1_in_rule__State__Group_0_13__02036);
            rule__State__Group_0_13__1();
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
    // $ANTLR end rule__State__Group_0_13__0


    // $ANTLR start rule__State__Group_0_13__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:985:1: rule__State__Group_0_13__1 : ( ( rule__State__IsInitialAssignment_0_13_1 ) ) rule__State__Group_0_13__2 ;
    public final void rule__State__Group_0_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:989:1: ( ( ( rule__State__IsInitialAssignment_0_13_1 ) ) rule__State__Group_0_13__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:990:1: ( ( rule__State__IsInitialAssignment_0_13_1 ) ) rule__State__Group_0_13__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:990:1: ( ( rule__State__IsInitialAssignment_0_13_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:991:1: ( rule__State__IsInitialAssignment_0_13_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_13_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:992:1: ( rule__State__IsInitialAssignment_0_13_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:992:2: rule__State__IsInitialAssignment_0_13_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_13_1_in_rule__State__Group_0_13__12064);
            rule__State__IsInitialAssignment_0_13_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_13_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_13__2_in_rule__State__Group_0_13__12073);
            rule__State__Group_0_13__2();
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
    // $ANTLR end rule__State__Group_0_13__1


    // $ANTLR start rule__State__Group_0_13__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1003:1: rule__State__Group_0_13__2 : ( ( rule__State__StateKindAssignment_0_13_2 ) ) ;
    public final void rule__State__Group_0_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1007:1: ( ( ( rule__State__StateKindAssignment_0_13_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1008:1: ( ( rule__State__StateKindAssignment_0_13_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1008:1: ( ( rule__State__StateKindAssignment_0_13_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1009:1: ( rule__State__StateKindAssignment_0_13_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_13_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1010:1: ( rule__State__StateKindAssignment_0_13_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1010:2: rule__State__StateKindAssignment_0_13_2
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_13_2_in_rule__State__Group_0_13__22101);
            rule__State__StateKindAssignment_0_13_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_13_2()); 
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
    // $ANTLR end rule__State__Group_0_13__2


    // $ANTLR start rule__State__Group_0_14__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1026:1: rule__State__Group_0_14__0 : ( ( rule__State__IsFinalAssignment_0_14_0 ) ) rule__State__Group_0_14__1 ;
    public final void rule__State__Group_0_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1030:1: ( ( ( rule__State__IsFinalAssignment_0_14_0 ) ) rule__State__Group_0_14__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1031:1: ( ( rule__State__IsFinalAssignment_0_14_0 ) ) rule__State__Group_0_14__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1031:1: ( ( rule__State__IsFinalAssignment_0_14_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1032:1: ( rule__State__IsFinalAssignment_0_14_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_14_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1033:1: ( rule__State__IsFinalAssignment_0_14_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1033:2: rule__State__IsFinalAssignment_0_14_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_14_0_in_rule__State__Group_0_14__02141);
            rule__State__IsFinalAssignment_0_14_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_14_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_14__1_in_rule__State__Group_0_14__02150);
            rule__State__Group_0_14__1();
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
    // $ANTLR end rule__State__Group_0_14__0


    // $ANTLR start rule__State__Group_0_14__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1044:1: rule__State__Group_0_14__1 : ( ( rule__State__StateKindAssignment_0_14_1 ) ) rule__State__Group_0_14__2 ;
    public final void rule__State__Group_0_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1048:1: ( ( ( rule__State__StateKindAssignment_0_14_1 ) ) rule__State__Group_0_14__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1049:1: ( ( rule__State__StateKindAssignment_0_14_1 ) ) rule__State__Group_0_14__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1049:1: ( ( rule__State__StateKindAssignment_0_14_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1050:1: ( rule__State__StateKindAssignment_0_14_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_14_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1051:1: ( rule__State__StateKindAssignment_0_14_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1051:2: rule__State__StateKindAssignment_0_14_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_14_1_in_rule__State__Group_0_14__12178);
            rule__State__StateKindAssignment_0_14_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_14_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_14__2_in_rule__State__Group_0_14__12187);
            rule__State__Group_0_14__2();
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
    // $ANTLR end rule__State__Group_0_14__1


    // $ANTLR start rule__State__Group_0_14__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1062:1: rule__State__Group_0_14__2 : ( ( rule__State__IsInitialAssignment_0_14_2 ) ) ;
    public final void rule__State__Group_0_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1066:1: ( ( ( rule__State__IsInitialAssignment_0_14_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1067:1: ( ( rule__State__IsInitialAssignment_0_14_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1067:1: ( ( rule__State__IsInitialAssignment_0_14_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1068:1: ( rule__State__IsInitialAssignment_0_14_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_14_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1069:1: ( rule__State__IsInitialAssignment_0_14_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1069:2: rule__State__IsInitialAssignment_0_14_2
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_14_2_in_rule__State__Group_0_14__22215);
            rule__State__IsInitialAssignment_0_14_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_14_2()); 
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
    // $ANTLR end rule__State__Group_0_14__2


    // $ANTLR start rule__State__Group_0_15__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1085:1: rule__State__Group_0_15__0 : ( ( rule__State__StateKindAssignment_0_15_0 ) ) rule__State__Group_0_15__1 ;
    public final void rule__State__Group_0_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1089:1: ( ( ( rule__State__StateKindAssignment_0_15_0 ) ) rule__State__Group_0_15__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1090:1: ( ( rule__State__StateKindAssignment_0_15_0 ) ) rule__State__Group_0_15__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1090:1: ( ( rule__State__StateKindAssignment_0_15_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1091:1: ( rule__State__StateKindAssignment_0_15_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_15_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1092:1: ( rule__State__StateKindAssignment_0_15_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1092:2: rule__State__StateKindAssignment_0_15_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_15_0_in_rule__State__Group_0_15__02255);
            rule__State__StateKindAssignment_0_15_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_15_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_15__1_in_rule__State__Group_0_15__02264);
            rule__State__Group_0_15__1();
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
    // $ANTLR end rule__State__Group_0_15__0


    // $ANTLR start rule__State__Group_0_15__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1103:1: rule__State__Group_0_15__1 : ( ( rule__State__IsInitialAssignment_0_15_1 ) ) rule__State__Group_0_15__2 ;
    public final void rule__State__Group_0_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1107:1: ( ( ( rule__State__IsInitialAssignment_0_15_1 ) ) rule__State__Group_0_15__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1108:1: ( ( rule__State__IsInitialAssignment_0_15_1 ) ) rule__State__Group_0_15__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1108:1: ( ( rule__State__IsInitialAssignment_0_15_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1109:1: ( rule__State__IsInitialAssignment_0_15_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_15_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1110:1: ( rule__State__IsInitialAssignment_0_15_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1110:2: rule__State__IsInitialAssignment_0_15_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_15_1_in_rule__State__Group_0_15__12292);
            rule__State__IsInitialAssignment_0_15_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_15_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_15__2_in_rule__State__Group_0_15__12301);
            rule__State__Group_0_15__2();
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
    // $ANTLR end rule__State__Group_0_15__1


    // $ANTLR start rule__State__Group_0_15__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1121:1: rule__State__Group_0_15__2 : ( ( rule__State__IsFinalAssignment_0_15_2 ) ) ;
    public final void rule__State__Group_0_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1125:1: ( ( ( rule__State__IsFinalAssignment_0_15_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1126:1: ( ( rule__State__IsFinalAssignment_0_15_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1126:1: ( ( rule__State__IsFinalAssignment_0_15_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1127:1: ( rule__State__IsFinalAssignment_0_15_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_15_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1128:1: ( rule__State__IsFinalAssignment_0_15_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1128:2: rule__State__IsFinalAssignment_0_15_2
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_15_2_in_rule__State__Group_0_15__22329);
            rule__State__IsFinalAssignment_0_15_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_15_2()); 
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
    // $ANTLR end rule__State__Group_0_15__2


    // $ANTLR start rule__State__Group_0_16__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1144:1: rule__State__Group_0_16__0 : ( ( rule__State__StateKindAssignment_0_16_0 ) ) rule__State__Group_0_16__1 ;
    public final void rule__State__Group_0_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1148:1: ( ( ( rule__State__StateKindAssignment_0_16_0 ) ) rule__State__Group_0_16__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1149:1: ( ( rule__State__StateKindAssignment_0_16_0 ) ) rule__State__Group_0_16__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1149:1: ( ( rule__State__StateKindAssignment_0_16_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1150:1: ( rule__State__StateKindAssignment_0_16_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_16_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1151:1: ( rule__State__StateKindAssignment_0_16_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1151:2: rule__State__StateKindAssignment_0_16_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_16_0_in_rule__State__Group_0_16__02369);
            rule__State__StateKindAssignment_0_16_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_16_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_16__1_in_rule__State__Group_0_16__02378);
            rule__State__Group_0_16__1();
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
    // $ANTLR end rule__State__Group_0_16__0


    // $ANTLR start rule__State__Group_0_16__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1162:1: rule__State__Group_0_16__1 : ( ( rule__State__IsFinalAssignment_0_16_1 ) ) rule__State__Group_0_16__2 ;
    public final void rule__State__Group_0_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1166:1: ( ( ( rule__State__IsFinalAssignment_0_16_1 ) ) rule__State__Group_0_16__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1167:1: ( ( rule__State__IsFinalAssignment_0_16_1 ) ) rule__State__Group_0_16__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1167:1: ( ( rule__State__IsFinalAssignment_0_16_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1168:1: ( rule__State__IsFinalAssignment_0_16_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_16_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1169:1: ( rule__State__IsFinalAssignment_0_16_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1169:2: rule__State__IsFinalAssignment_0_16_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_16_1_in_rule__State__Group_0_16__12406);
            rule__State__IsFinalAssignment_0_16_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_16_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_16__2_in_rule__State__Group_0_16__12415);
            rule__State__Group_0_16__2();
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
    // $ANTLR end rule__State__Group_0_16__1


    // $ANTLR start rule__State__Group_0_16__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1180:1: rule__State__Group_0_16__2 : ( ( rule__State__IsInitialAssignment_0_16_2 ) ) ;
    public final void rule__State__Group_0_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1184:1: ( ( ( rule__State__IsInitialAssignment_0_16_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1185:1: ( ( rule__State__IsInitialAssignment_0_16_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1185:1: ( ( rule__State__IsInitialAssignment_0_16_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1186:1: ( rule__State__IsInitialAssignment_0_16_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_16_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1187:1: ( rule__State__IsInitialAssignment_0_16_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1187:2: rule__State__IsInitialAssignment_0_16_2
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_16_2_in_rule__State__Group_0_16__22443);
            rule__State__IsInitialAssignment_0_16_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_16_2()); 
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
    // $ANTLR end rule__State__Group_0_16__2


    // $ANTLR start rule__StateContent__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1203:1: rule__StateContent__Group__0 : ( '{' ) rule__StateContent__Group__1 ;
    public final void rule__StateContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1207:1: ( ( '{' ) rule__StateContent__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1208:1: ( '{' ) rule__StateContent__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1208:1: ( '{' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1209:1: '{'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__StateContent__Group__02484); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group__1_in_rule__StateContent__Group__02494);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1223:1: rule__StateContent__Group__1 : ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) ) rule__StateContent__Group__2 ;
    public final void rule__StateContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1227:1: ( ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) ) rule__StateContent__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1228:1: ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) ) rule__StateContent__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1228:1: ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1229:1: ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1229:1: ( ( rule__StateContent__Alternatives_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1230:1: ( rule__StateContent__Alternatives_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1231:1: ( rule__StateContent__Alternatives_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1231:2: rule__StateContent__Alternatives_1
            {
            pushFollow(FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__12524);
            rule__StateContent__Alternatives_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1234:1: ( ( rule__StateContent__Alternatives_1 )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1235:1: ( rule__StateContent__Alternatives_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1236:1: ( rule__StateContent__Alternatives_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=11 && LA8_0<=15)||(LA8_0>=19 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1236:2: rule__StateContent__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__12536);
            	    rule__StateContent__Alternatives_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }

            }


            }

            pushFollow(FOLLOW_rule__StateContent__Group__2_in_rule__StateContent__Group__12548);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1248:1: rule__StateContent__Group__2 : ( '}' ) ;
    public final void rule__StateContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1252:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1253:1: ( '}' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1253:1: ( '}' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1254:1: '}'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__StateContent__Group__22577); if (failed) return ;
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


    // $ANTLR start rule__StateContent__Group_1_3__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1273:1: rule__StateContent__Group_1_3__0 : ( ( rule__StateContent__InnerStatesAssignment_1_3_0 ) ) rule__StateContent__Group_1_3__1 ;
    public final void rule__StateContent__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1277:1: ( ( ( rule__StateContent__InnerStatesAssignment_1_3_0 ) ) rule__StateContent__Group_1_3__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1278:1: ( ( rule__StateContent__InnerStatesAssignment_1_3_0 ) ) rule__StateContent__Group_1_3__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1278:1: ( ( rule__StateContent__InnerStatesAssignment_1_3_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1279:1: ( rule__StateContent__InnerStatesAssignment_1_3_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getInnerStatesAssignment_1_3_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1280:1: ( rule__StateContent__InnerStatesAssignment_1_3_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1280:2: rule__StateContent__InnerStatesAssignment_1_3_0
            {
            pushFollow(FOLLOW_rule__StateContent__InnerStatesAssignment_1_3_0_in_rule__StateContent__Group_1_3__02618);
            rule__StateContent__InnerStatesAssignment_1_3_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getInnerStatesAssignment_1_3_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group_1_3__1_in_rule__StateContent__Group_1_3__02627);
            rule__StateContent__Group_1_3__1();
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
    // $ANTLR end rule__StateContent__Group_1_3__0


    // $ANTLR start rule__StateContent__Group_1_3__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1291:1: rule__StateContent__Group_1_3__1 : ( ( rule__StateContent__Group_1_3_1__0 )* ) ;
    public final void rule__StateContent__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1295:1: ( ( ( rule__StateContent__Group_1_3_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1296:1: ( ( rule__StateContent__Group_1_3_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1296:1: ( ( rule__StateContent__Group_1_3_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1297:1: ( rule__StateContent__Group_1_3_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getGroup_1_3_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1298:1: ( rule__StateContent__Group_1_3_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1298:2: rule__StateContent__Group_1_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__StateContent__Group_1_3_1__0_in_rule__StateContent__Group_1_3__12655);
            	    rule__StateContent__Group_1_3_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getGroup_1_3_1()); 
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
    // $ANTLR end rule__StateContent__Group_1_3__1


    // $ANTLR start rule__StateContent__Group_1_3_1__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1312:1: rule__StateContent__Group_1_3_1__0 : ( '||' ) rule__StateContent__Group_1_3_1__1 ;
    public final void rule__StateContent__Group_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1316:1: ( ( '||' ) rule__StateContent__Group_1_3_1__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1317:1: ( '||' ) rule__StateContent__Group_1_3_1__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1317:1: ( '||' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1318:1: '||'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getVerticalLineVerticalLineKeyword_1_3_1_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__StateContent__Group_1_3_1__02695); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getVerticalLineVerticalLineKeyword_1_3_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group_1_3_1__1_in_rule__StateContent__Group_1_3_1__02705);
            rule__StateContent__Group_1_3_1__1();
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
    // $ANTLR end rule__StateContent__Group_1_3_1__0


    // $ANTLR start rule__StateContent__Group_1_3_1__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1332:1: rule__StateContent__Group_1_3_1__1 : ( ( rule__StateContent__ParallelStatesAssignment_1_3_1_1 ) ) ;
    public final void rule__StateContent__Group_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1336:1: ( ( ( rule__StateContent__ParallelStatesAssignment_1_3_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1337:1: ( ( rule__StateContent__ParallelStatesAssignment_1_3_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1337:1: ( ( rule__StateContent__ParallelStatesAssignment_1_3_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1338:1: ( rule__StateContent__ParallelStatesAssignment_1_3_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getParallelStatesAssignment_1_3_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1339:1: ( rule__StateContent__ParallelStatesAssignment_1_3_1_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1339:2: rule__StateContent__ParallelStatesAssignment_1_3_1_1
            {
            pushFollow(FOLLOW_rule__StateContent__ParallelStatesAssignment_1_3_1_1_in_rule__StateContent__Group_1_3_1__12733);
            rule__StateContent__ParallelStatesAssignment_1_3_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getParallelStatesAssignment_1_3_1_1()); 
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
    // $ANTLR end rule__StateContent__Group_1_3_1__1


    // $ANTLR start rule__EntryAction__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1353:1: rule__EntryAction__Group__0 : ( 'onentry' ) rule__EntryAction__Group__1 ;
    public final void rule__EntryAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1357:1: ( ( 'onentry' ) rule__EntryAction__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1358:1: ( 'onentry' ) rule__EntryAction__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1358:1: ( 'onentry' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1359:1: 'onentry'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getOnentryKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EntryAction__Group__02772); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionAccess().getOnentryKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__EntryAction__Group__1_in_rule__EntryAction__Group__02782);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1373:1: rule__EntryAction__Group__1 : ( ( rule__EntryAction__EntryActionAssignment_1 ) ) ;
    public final void rule__EntryAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1377:1: ( ( ( rule__EntryAction__EntryActionAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1378:1: ( ( rule__EntryAction__EntryActionAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1378:1: ( ( rule__EntryAction__EntryActionAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1379:1: ( rule__EntryAction__EntryActionAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getEntryActionAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1380:1: ( rule__EntryAction__EntryActionAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1380:2: rule__EntryAction__EntryActionAssignment_1
            {
            pushFollow(FOLLOW_rule__EntryAction__EntryActionAssignment_1_in_rule__EntryAction__Group__12810);
            rule__EntryAction__EntryActionAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionAccess().getEntryActionAssignment_1()); 
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
    // $ANTLR end rule__EntryAction__Group__1


    // $ANTLR start rule__ExitAction__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1394:1: rule__ExitAction__Group__0 : ( 'onexit' ) rule__ExitAction__Group__1 ;
    public final void rule__ExitAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1398:1: ( ( 'onexit' ) rule__ExitAction__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1399:1: ( 'onexit' ) rule__ExitAction__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1399:1: ( 'onexit' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1400:1: 'onexit'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getOnexitKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__ExitAction__Group__02849); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getOnexitKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ExitAction__Group__1_in_rule__ExitAction__Group__02859);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1414:1: rule__ExitAction__Group__1 : ( ( rule__ExitAction__ExitAssignment_1 ) ) ;
    public final void rule__ExitAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1418:1: ( ( ( rule__ExitAction__ExitAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1419:1: ( ( rule__ExitAction__ExitAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1419:1: ( ( rule__ExitAction__ExitAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1420:1: ( rule__ExitAction__ExitAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getExitAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1421:1: ( rule__ExitAction__ExitAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1421:2: rule__ExitAction__ExitAssignment_1
            {
            pushFollow(FOLLOW_rule__ExitAction__ExitAssignment_1_in_rule__ExitAction__Group__12887);
            rule__ExitAction__ExitAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getExitAssignment_1()); 
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
    // $ANTLR end rule__ExitAction__Group__1


    // $ANTLR start rule__InnerAction__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1435:1: rule__InnerAction__Group__0 : ( 'oninner' ) rule__InnerAction__Group__1 ;
    public final void rule__InnerAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1439:1: ( ( 'oninner' ) rule__InnerAction__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1440:1: ( 'oninner' ) rule__InnerAction__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1440:1: ( 'oninner' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1441:1: 'oninner'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getOninnerKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__InnerAction__Group__02926); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getOninnerKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__InnerAction__Group__1_in_rule__InnerAction__Group__02936);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1455:1: rule__InnerAction__Group__1 : ( ( rule__InnerAction__InnerAssignment_1 ) ) ;
    public final void rule__InnerAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1459:1: ( ( ( rule__InnerAction__InnerAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1460:1: ( ( rule__InnerAction__InnerAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1460:1: ( ( rule__InnerAction__InnerAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1461:1: ( rule__InnerAction__InnerAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getInnerAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1462:1: ( rule__InnerAction__InnerAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1462:2: rule__InnerAction__InnerAssignment_1
            {
            pushFollow(FOLLOW_rule__InnerAction__InnerAssignment_1_in_rule__InnerAction__Group__12964);
            rule__InnerAction__InnerAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getInnerAssignment_1()); 
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
    // $ANTLR end rule__InnerAction__Group__1


    // $ANTLR start rule__State__IsInitialAssignment_0_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1476:1: rule__State__IsInitialAssignment_0_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1480:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1481:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1481:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1482:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1483:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1484:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsInitialAssignment_0_03007); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_0


    // $ANTLR start rule__State__IsInitialAssignment_0_1_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1499:1: rule__State__IsInitialAssignment_0_1_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1503:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1504:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1504:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1505:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_1_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1506:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1507:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_1_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsInitialAssignment_0_1_03051); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_1_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_1_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_1_0


    // $ANTLR start rule__State__IsFinalAssignment_0_1_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1522:1: rule__State__IsFinalAssignment_0_1_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1526:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1527:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1527:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1528:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1529:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1530:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__State__IsFinalAssignment_0_1_13095); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_1_1


    // $ANTLR start rule__State__IsInitialAssignment_0_2_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1545:1: rule__State__IsInitialAssignment_0_2_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1549:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1550:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1550:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1551:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_2_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1552:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1553:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_2_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsInitialAssignment_0_2_03139); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_2_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_2_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_2_0


    // $ANTLR start rule__State__StateKindAssignment_0_2_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1568:1: rule__State__StateKindAssignment_0_2_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1572:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1573:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1573:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1574:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_2_13178);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_2_1_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_2_1


    // $ANTLR start rule__State__StateKindAssignment_0_3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1583:1: rule__State__StateKindAssignment_0_3 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1587:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1588:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1588:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1589:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_33209);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_3_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_3


    // $ANTLR start rule__State__StateKindAssignment_0_4_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1598:1: rule__State__StateKindAssignment_0_4_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1602:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1603:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1603:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1604:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_4_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_4_03240);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_4_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_4_0


    // $ANTLR start rule__State__IsInitialAssignment_0_4_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1613:1: rule__State__IsInitialAssignment_0_4_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1617:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1618:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1618:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1619:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1620:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1621:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsInitialAssignment_0_4_13276); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_1_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_4_1


    // $ANTLR start rule__State__StateKindAssignment_0_5_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1636:1: rule__State__StateKindAssignment_0_5_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1640:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1641:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1641:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1642:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_5_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_5_03315);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_5_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_5_0


    // $ANTLR start rule__State__IsFinalAssignment_0_5_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1651:1: rule__State__IsFinalAssignment_0_5_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1655:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1656:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1656:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1657:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1658:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1659:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__State__IsFinalAssignment_0_5_13351); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_5_1


    // $ANTLR start rule__State__IsFinalAssignment_0_6
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1674:1: rule__State__IsFinalAssignment_0_6 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1678:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1679:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1679:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1680:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1681:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1682:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__State__IsFinalAssignment_0_63395); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_6


    // $ANTLR start rule__State__IsFinalAssignment_0_7_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1697:1: rule__State__IsFinalAssignment_0_7_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1701:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1702:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1702:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1703:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_7_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1704:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1705:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_7_0_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__State__IsFinalAssignment_0_7_03439); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_7_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_7_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_7_0


    // $ANTLR start rule__State__IsInitialAssignment_0_7_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1720:1: rule__State__IsInitialAssignment_0_7_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1724:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1725:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1725:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1726:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1727:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1728:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsInitialAssignment_0_7_13483); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_7_1


    // $ANTLR start rule__State__IsFinalAssignment_0_8_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1743:1: rule__State__IsFinalAssignment_0_8_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1747:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1748:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1748:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1749:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1750:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1751:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_0_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__State__IsFinalAssignment_0_8_03527); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_8_0


    // $ANTLR start rule__State__StateKindAssignment_0_8_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1766:1: rule__State__StateKindAssignment_0_8_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1770:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1771:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1771:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1772:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_8_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_8_13566);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_8_1_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_8_1


    // $ANTLR start rule__State__StateKindAssignment_0_9_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1781:1: rule__State__StateKindAssignment_0_9_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1785:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1786:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1786:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1787:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_9_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_9_03597);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_9_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_9_0


    // $ANTLR start rule__State__IsFinalAssignment_0_9_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1796:1: rule__State__IsFinalAssignment_0_9_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1800:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1801:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1801:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1802:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1803:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1804:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__State__IsFinalAssignment_0_9_13633); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_9_1


    // $ANTLR start rule__State__IsInitialAssignment_0_9_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1819:1: rule__State__IsInitialAssignment_0_9_2 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1823:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1824:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1824:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1825:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1826:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1827:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_2_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsInitialAssignment_0_9_23677); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_2_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_9_2


    // $ANTLR start rule__State__IsInitialAssignment_0_10_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1842:1: rule__State__IsInitialAssignment_0_10_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1846:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1847:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1847:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1848:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1849:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1850:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsInitialAssignment_0_10_03721); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_10_0


    // $ANTLR start rule__State__IsFinalAssignment_0_10_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1865:1: rule__State__IsFinalAssignment_0_10_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1869:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1870:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1870:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1871:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1872:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1873:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__State__IsFinalAssignment_0_10_13765); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_10_1


    // $ANTLR start rule__State__StateKindAssignment_0_10_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1888:1: rule__State__StateKindAssignment_0_10_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1892:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1893:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1893:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1894:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_10_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_10_23804);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_10_2_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_10_2


    // $ANTLR start rule__State__IsInitialAssignment_0_11_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1903:1: rule__State__IsInitialAssignment_0_11_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1907:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1908:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1908:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1909:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1910:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1911:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsInitialAssignment_0_11_03840); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_11_0


    // $ANTLR start rule__State__IsFinalAssignment_0_11_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1926:1: rule__State__IsFinalAssignment_0_11_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1930:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1931:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1931:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1932:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1933:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1934:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__State__IsFinalAssignment_0_11_13884); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_11_1


    // $ANTLR start rule__State__StateKindAssignment_0_11_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1949:1: rule__State__StateKindAssignment_0_11_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1953:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1954:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1954:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1955:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_11_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_11_23923);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_11_2_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_11_2


    // $ANTLR start rule__State__IsInitialAssignment_0_12_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1964:1: rule__State__IsInitialAssignment_0_12_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1968:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1969:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1969:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1970:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1971:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1972:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsInitialAssignment_0_12_03959); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_12_0


    // $ANTLR start rule__State__StateKindAssignment_0_12_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1987:1: rule__State__StateKindAssignment_0_12_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1991:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1992:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1992:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1993:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_12_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_12_13998);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_12_1_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_12_1


    // $ANTLR start rule__State__IsFinalAssignment_0_12_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2002:1: rule__State__IsFinalAssignment_0_12_2 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2006:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2007:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2007:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2008:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2009:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2010:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_2_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__State__IsFinalAssignment_0_12_24034); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_2_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_12_2


    // $ANTLR start rule__State__IsFinalAssignment_0_13_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2025:1: rule__State__IsFinalAssignment_0_13_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2029:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2030:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2030:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2031:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2032:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2033:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_0_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__State__IsFinalAssignment_0_13_04078); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_13_0


    // $ANTLR start rule__State__IsInitialAssignment_0_13_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2048:1: rule__State__IsInitialAssignment_0_13_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2052:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2053:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2053:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2054:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2055:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2056:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsInitialAssignment_0_13_14122); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_1_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_13_1


    // $ANTLR start rule__State__StateKindAssignment_0_13_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2071:1: rule__State__StateKindAssignment_0_13_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2075:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2076:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2076:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2077:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_13_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_13_24161);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_13_2_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_13_2


    // $ANTLR start rule__State__IsFinalAssignment_0_14_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2086:1: rule__State__IsFinalAssignment_0_14_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2090:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2091:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2091:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2092:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2093:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2094:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_0_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__State__IsFinalAssignment_0_14_04197); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_14_0


    // $ANTLR start rule__State__StateKindAssignment_0_14_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2109:1: rule__State__StateKindAssignment_0_14_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2113:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2114:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2114:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2115:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_14_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_14_14236);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_14_1_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_14_1


    // $ANTLR start rule__State__IsInitialAssignment_0_14_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2124:1: rule__State__IsInitialAssignment_0_14_2 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2128:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2129:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2129:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2130:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2131:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2132:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_2_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsInitialAssignment_0_14_24272); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_2_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_14_2


    // $ANTLR start rule__State__StateKindAssignment_0_15_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2147:1: rule__State__StateKindAssignment_0_15_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2151:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2152:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2152:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2153:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_15_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_15_04311);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_15_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_15_0


    // $ANTLR start rule__State__IsInitialAssignment_0_15_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2162:1: rule__State__IsInitialAssignment_0_15_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2166:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2167:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2167:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2168:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_15_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2169:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2170:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_15_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsInitialAssignment_0_15_14347); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_15_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_15_1_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_15_1


    // $ANTLR start rule__State__IsFinalAssignment_0_15_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2185:1: rule__State__IsFinalAssignment_0_15_2 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2189:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2190:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2190:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2191:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_15_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2192:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2193:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_15_2_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__State__IsFinalAssignment_0_15_24391); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_15_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_15_2_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_15_2


    // $ANTLR start rule__State__StateKindAssignment_0_16_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2208:1: rule__State__StateKindAssignment_0_16_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2212:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2213:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2213:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2214:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_16_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_16_04430);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_16_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_16_0


    // $ANTLR start rule__State__IsFinalAssignment_0_16_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2223:1: rule__State__IsFinalAssignment_0_16_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2227:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2228:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2228:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2229:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_16_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2230:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2231:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_16_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__State__IsFinalAssignment_0_16_14466); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_16_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_16_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_16_1


    // $ANTLR start rule__State__IsInitialAssignment_0_16_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2246:1: rule__State__IsInitialAssignment_0_16_2 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2250:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2251:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2251:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2252:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_16_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2253:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2254:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_16_2_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsInitialAssignment_0_16_24510); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_16_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_16_2_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_16_2


    // $ANTLR start rule__State__StateNameAssignment_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2269:1: rule__State__StateNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__StateNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2273:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2274:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2274:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2275:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__StateNameAssignment_24549); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end rule__State__StateNameAssignment_2


    // $ANTLR start rule__State__LabelAssignment_3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2284:1: rule__State__LabelAssignment_3 : ( RULE_STRING ) ;
    public final void rule__State__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2288:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2289:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2289:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2290:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__LabelAssignment_34580); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end rule__State__LabelAssignment_3


    // $ANTLR start rule__State__StateContentAssignment_4
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2299:1: rule__State__StateContentAssignment_4 : ( ruleStateContent ) ;
    public final void rule__State__StateContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2303:1: ( ( ruleStateContent ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2304:1: ( ruleStateContent )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2304:1: ( ruleStateContent )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2305:1: ruleStateContent
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateContentStateContentParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleStateContent_in_rule__State__StateContentAssignment_44611);
            ruleStateContent();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateContentStateContentParserRuleCall_4_0()); 
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
    // $ANTLR end rule__State__StateContentAssignment_4


    // $ANTLR start rule__StateContent__ExitActionsAssignment_1_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2314:1: rule__StateContent__ExitActionsAssignment_1_0 : ( ruleExitAction ) ;
    public final void rule__StateContent__ExitActionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2318:1: ( ( ruleExitAction ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2319:1: ( ruleExitAction )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2319:1: ( ruleExitAction )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2320:1: ruleExitAction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getExitActionsExitActionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleExitAction_in_rule__StateContent__ExitActionsAssignment_1_04642);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2329:1: rule__StateContent__EntryActionsAssignment_1_1 : ( ruleEntryAction ) ;
    public final void rule__StateContent__EntryActionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2333:1: ( ( ruleEntryAction ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2334:1: ( ruleEntryAction )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2334:1: ( ruleEntryAction )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2335:1: ruleEntryAction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getEntryActionsEntryActionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEntryAction_in_rule__StateContent__EntryActionsAssignment_1_14673);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2344:1: rule__StateContent__InnerActionAssignment_1_2 : ( ruleInnerAction ) ;
    public final void rule__StateContent__InnerActionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2348:1: ( ( ruleInnerAction ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2349:1: ( ruleInnerAction )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2349:1: ( ruleInnerAction )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2350:1: ruleInnerAction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getInnerActionInnerActionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleInnerAction_in_rule__StateContent__InnerActionAssignment_1_24704);
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


    // $ANTLR start rule__StateContent__InnerStatesAssignment_1_3_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2359:1: rule__StateContent__InnerStatesAssignment_1_3_0 : ( ruleState ) ;
    public final void rule__StateContent__InnerStatesAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2363:1: ( ( ruleState ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2364:1: ( ruleState )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2364:1: ( ruleState )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2365:1: ruleState
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getInnerStatesStateParserRuleCall_1_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleState_in_rule__StateContent__InnerStatesAssignment_1_3_04735);
            ruleState();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getInnerStatesStateParserRuleCall_1_3_0_0()); 
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
    // $ANTLR end rule__StateContent__InnerStatesAssignment_1_3_0


    // $ANTLR start rule__StateContent__ParallelStatesAssignment_1_3_1_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2374:1: rule__StateContent__ParallelStatesAssignment_1_3_1_1 : ( ruleState ) ;
    public final void rule__StateContent__ParallelStatesAssignment_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2378:1: ( ( ruleState ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2379:1: ( ruleState )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2379:1: ( ruleState )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2380:1: ruleState
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getParallelStatesStateParserRuleCall_1_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleState_in_rule__StateContent__ParallelStatesAssignment_1_3_1_14766);
            ruleState();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getParallelStatesStateParserRuleCall_1_3_1_1_0()); 
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
    // $ANTLR end rule__StateContent__ParallelStatesAssignment_1_3_1_1


    // $ANTLR start rule__EntryAction__EntryActionAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2389:1: rule__EntryAction__EntryActionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EntryAction__EntryActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2393:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2394:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2394:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2395:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getEntryActionSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EntryAction__EntryActionAssignment_14797); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionAccess().getEntryActionSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end rule__EntryAction__EntryActionAssignment_1


    // $ANTLR start rule__ExitAction__ExitAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2404:1: rule__ExitAction__ExitAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ExitAction__ExitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2408:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2409:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2409:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2410:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getExitSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExitAction__ExitAssignment_14828); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getExitSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end rule__ExitAction__ExitAssignment_1


    // $ANTLR start rule__InnerAction__InnerAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2419:1: rule__InnerAction__InnerAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InnerAction__InnerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2423:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2424:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2424:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2425:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getInnerSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InnerAction__InnerAssignment_14859); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getInnerSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end rule__InnerAction__InnerAssignment_1

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:269:6: ( ( ( rule__State__Group_0_9__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:269:6: ( ( rule__State__Group_0_9__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:269:6: ( ( rule__State__Group_0_9__0 ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:270:1: ( rule__State__Group_0_9__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStateAccess().getGroup_0_9()); 
        }
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:271:1: ( rule__State__Group_0_9__0 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:271:2: rule__State__Group_0_9__0
        {
        pushFollow(FOLLOW_rule__State__Group_0_9__0_in_synpred10574);
        rule__State__Group_0_9__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:275:6: ( ( ( rule__State__Group_0_10__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:275:6: ( ( rule__State__Group_0_10__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:275:6: ( ( rule__State__Group_0_10__0 ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:276:1: ( rule__State__Group_0_10__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStateAccess().getGroup_0_10()); 
        }
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:277:1: ( rule__State__Group_0_10__0 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:277:2: rule__State__Group_0_10__0
        {
        pushFollow(FOLLOW_rule__State__Group_0_10__0_in_synpred11592);
        rule__State__Group_0_10__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:281:6: ( ( ( rule__State__Group_0_11__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:281:6: ( ( rule__State__Group_0_11__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:281:6: ( ( rule__State__Group_0_11__0 ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:282:1: ( rule__State__Group_0_11__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStateAccess().getGroup_0_11()); 
        }
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:283:1: ( rule__State__Group_0_11__0 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:283:2: rule__State__Group_0_11__0
        {
        pushFollow(FOLLOW_rule__State__Group_0_11__0_in_synpred12610);
        rule__State__Group_0_11__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12

    public final boolean synpred10() {
        backtracking++;
        int start = input.mark();
        try {
            synpred10_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred11() {
        backtracking++;
        int start = input.mark();
        try {
            synpred11_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred12() {
        backtracking++;
        int start = input.mark();
        try {
            synpred12_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_rule__StateType__Alternatives_in_ruleStateType377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_0_in_rule__State__Alternatives_0412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_1__0_in_rule__State__Alternatives_0430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__0_in_rule__State__Alternatives_0448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_3_in_rule__State__Alternatives_0466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_4__0_in_rule__State__Alternatives_0484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_5__0_in_rule__State__Alternatives_0502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_6_in_rule__State__Alternatives_0520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_7__0_in_rule__State__Alternatives_0538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_8__0_in_rule__State__Alternatives_0556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__0_in_rule__State__Alternatives_0574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__0_in_rule__State__Alternatives_0592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__0_in_rule__State__Alternatives_0610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__0_in_rule__State__Alternatives_0628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__0_in_rule__State__Alternatives_0646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__0_in_rule__State__Alternatives_0664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_15__0_in_rule__State__Alternatives_0682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_16__0_in_rule__State__Alternatives_0700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__ExitActionsAssignment_1_0_in_rule__StateContent__Alternatives_1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__EntryActionsAssignment_1_1_in_rule__StateContent__Alternatives_1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__InnerActionAssignment_1_2_in_rule__StateContent__Alternatives_1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Group_1_3__0_in_rule__StateContent__Alternatives_1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__StateType__Alternatives821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StateType__Alternatives842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StateType__Alternatives863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StateType__Alternatives884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Alternatives_0_in_rule__State__Group__0921 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__0931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__State__Group__1961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateNameAssignment_2_in_rule__State__Group__21001 = new BitSet(new long[]{0x0000000000010022L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__21010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__LabelAssignment_3_in_rule__State__Group__31038 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__31048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateContentAssignment_4_in_rule__State__Group__41076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_1_0_in_rule__State__Group_0_1__01121 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__State__Group_0_1__1_in_rule__State__Group_0_1__01130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_1_1_in_rule__State__Group_0_1__11158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_2_0_in_rule__State__Group_0_2__01196 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__1_in_rule__State__Group_0_2__01205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_2_1_in_rule__State__Group_0_2__11233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_4_0_in_rule__State__Group_0_4__01271 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__State__Group_0_4__1_in_rule__State__Group_0_4__01280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_4_1_in_rule__State__Group_0_4__11308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_5_0_in_rule__State__Group_0_5__01346 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__State__Group_0_5__1_in_rule__State__Group_0_5__01355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_5_1_in_rule__State__Group_0_5__11383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_7_0_in_rule__State__Group_0_7__01421 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__State__Group_0_7__1_in_rule__State__Group_0_7__01430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_7_1_in_rule__State__Group_0_7__11458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_8_0_in_rule__State__Group_0_8__01496 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_8__1_in_rule__State__Group_0_8__01505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_8_1_in_rule__State__Group_0_8__11533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_9_0_in_rule__State__Group_0_9__01571 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__1_in_rule__State__Group_0_9__01580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_9_1_in_rule__State__Group_0_9__11608 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__2_in_rule__State__Group_0_9__11617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_9_2_in_rule__State__Group_0_9__21645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_10_0_in_rule__State__Group_0_10__01685 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__1_in_rule__State__Group_0_10__01694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_10_1_in_rule__State__Group_0_10__11722 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__2_in_rule__State__Group_0_10__11731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_10_2_in_rule__State__Group_0_10__21759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_11_0_in_rule__State__Group_0_11__01799 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__1_in_rule__State__Group_0_11__01808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_11_1_in_rule__State__Group_0_11__11836 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__2_in_rule__State__Group_0_11__11845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_11_2_in_rule__State__Group_0_11__21873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_12_0_in_rule__State__Group_0_12__01913 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__1_in_rule__State__Group_0_12__01922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_12_1_in_rule__State__Group_0_12__11950 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__2_in_rule__State__Group_0_12__11959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_12_2_in_rule__State__Group_0_12__21987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_13_0_in_rule__State__Group_0_13__02027 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__1_in_rule__State__Group_0_13__02036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_13_1_in_rule__State__Group_0_13__12064 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__2_in_rule__State__Group_0_13__12073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_13_2_in_rule__State__Group_0_13__22101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_14_0_in_rule__State__Group_0_14__02141 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__1_in_rule__State__Group_0_14__02150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_14_1_in_rule__State__Group_0_14__12178 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__2_in_rule__State__Group_0_14__12187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_14_2_in_rule__State__Group_0_14__22215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_15_0_in_rule__State__Group_0_15__02255 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__State__Group_0_15__1_in_rule__State__Group_0_15__02264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_15_1_in_rule__State__Group_0_15__12292 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__State__Group_0_15__2_in_rule__State__Group_0_15__12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_15_2_in_rule__State__Group_0_15__22329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_16_0_in_rule__State__Group_0_16__02369 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__State__Group_0_16__1_in_rule__State__Group_0_16__02378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_16_1_in_rule__State__Group_0_16__12406 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__State__Group_0_16__2_in_rule__State__Group_0_16__12415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_16_2_in_rule__State__Group_0_16__22443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__StateContent__Group__02484 = new BitSet(new long[]{0x0000000000F8F810L});
    public static final BitSet FOLLOW_rule__StateContent__Group__1_in_rule__StateContent__Group__02494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__12524 = new BitSet(new long[]{0x0000000000FAF810L});
    public static final BitSet FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__12536 = new BitSet(new long[]{0x0000000000FAF810L});
    public static final BitSet FOLLOW_rule__StateContent__Group__2_in_rule__StateContent__Group__12548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StateContent__Group__22577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__InnerStatesAssignment_1_3_0_in_rule__StateContent__Group_1_3__02618 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__StateContent__Group_1_3__1_in_rule__StateContent__Group_1_3__02627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Group_1_3_1__0_in_rule__StateContent__Group_1_3__12655 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_rule__StateContent__Group_1_3_1__02695 = new BitSet(new long[]{0x0000000000C0F810L});
    public static final BitSet FOLLOW_rule__StateContent__Group_1_3_1__1_in_rule__StateContent__Group_1_3_1__02705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__ParallelStatesAssignment_1_3_1_1_in_rule__StateContent__Group_1_3_1__12733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EntryAction__Group__02772 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EntryAction__Group__1_in_rule__EntryAction__Group__02782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryAction__EntryActionAssignment_1_in_rule__EntryAction__Group__12810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ExitAction__Group__02849 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExitAction__Group__1_in_rule__ExitAction__Group__02859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExitAction__ExitAssignment_1_in_rule__ExitAction__Group__12887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__InnerAction__Group__02926 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InnerAction__Group__1_in_rule__InnerAction__Group__02936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerAction__InnerAssignment_1_in_rule__InnerAction__Group__12964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsInitialAssignment_0_03007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsInitialAssignment_0_1_03051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__IsFinalAssignment_0_1_13095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsInitialAssignment_0_2_03139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_2_13178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_33209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_4_03240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsInitialAssignment_0_4_13276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_5_03315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__IsFinalAssignment_0_5_13351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__IsFinalAssignment_0_63395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__IsFinalAssignment_0_7_03439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsInitialAssignment_0_7_13483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__IsFinalAssignment_0_8_03527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_8_13566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_9_03597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__IsFinalAssignment_0_9_13633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsInitialAssignment_0_9_23677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsInitialAssignment_0_10_03721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__IsFinalAssignment_0_10_13765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_10_23804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsInitialAssignment_0_11_03840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__IsFinalAssignment_0_11_13884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_11_23923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsInitialAssignment_0_12_03959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_12_13998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__IsFinalAssignment_0_12_24034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__IsFinalAssignment_0_13_04078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsInitialAssignment_0_13_14122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_13_24161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__IsFinalAssignment_0_14_04197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_14_14236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsInitialAssignment_0_14_24272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_15_04311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsInitialAssignment_0_15_14347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__IsFinalAssignment_0_15_24391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_16_04430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__IsFinalAssignment_0_16_14466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsInitialAssignment_0_16_24510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__StateNameAssignment_24549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__LabelAssignment_34580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateContent_in_rule__State__StateContentAssignment_44611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_rule__StateContent__ExitActionsAssignment_1_04642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_rule__StateContent__EntryActionsAssignment_1_14673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerAction_in_rule__StateContent__InnerActionAssignment_1_24704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__StateContent__InnerStatesAssignment_1_3_04735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__StateContent__ParallelStatesAssignment_1_3_1_14766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EntryAction__EntryActionAssignment_14797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExitAction__ExitAssignment_14828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InnerAction__InnerAssignment_14859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__0_in_synpred10574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__0_in_synpred11592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__0_in_synpred12610 = new BitSet(new long[]{0x0000000000000002L});

}