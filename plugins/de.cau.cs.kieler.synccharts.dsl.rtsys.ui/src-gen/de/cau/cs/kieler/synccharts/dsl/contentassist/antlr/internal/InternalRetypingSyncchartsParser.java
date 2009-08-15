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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NORMAL'", "'cond'", "'reference'", "'textual'", "'state'", "'{'", "'}'", "'oninner'", "'onentry'", "'onexit'", "'init'", "'final'"
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
            ruleMemo = new HashMap[125+1];
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
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleState
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:61:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:61:16: ( ruleState EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:62:1: ruleState EOF
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:69:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:73:2: ( ( ( rule__State__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:74:1: ( ( rule__State__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:74:1: ( ( rule__State__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:75:1: ( rule__State__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:76:1: ( rule__State__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:76:2: rule__State__Group__0
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:88:1: entryRuleStateContent : ruleStateContent EOF ;
    public final void entryRuleStateContent() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:88:23: ( ruleStateContent EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:89:1: ruleStateContent EOF
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:96:1: ruleStateContent : ( ( rule__StateContent__Group__0 ) ) ;
    public final void ruleStateContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:100:2: ( ( ( rule__StateContent__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:101:1: ( ( rule__StateContent__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:101:1: ( ( rule__StateContent__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:102:1: ( rule__StateContent__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:103:1: ( rule__StateContent__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:103:2: rule__StateContent__Group__0
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


    // $ANTLR start entryRuleInnerAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:115:1: entryRuleInnerAction : ruleInnerAction EOF ;
    public final void entryRuleInnerAction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:115:22: ( ruleInnerAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:116:1: ruleInnerAction EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionRule()); 
            }
            pushFollow(FOLLOW_ruleInnerAction_in_entryRuleInnerAction186);
            ruleInnerAction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerAction193); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:123:1: ruleInnerAction : ( ( rule__InnerAction__Group__0 ) ) ;
    public final void ruleInnerAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:127:2: ( ( ( rule__InnerAction__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:128:1: ( ( rule__InnerAction__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:128:1: ( ( rule__InnerAction__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:129:1: ( rule__InnerAction__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:130:1: ( rule__InnerAction__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:130:2: rule__InnerAction__Group__0
            {
            pushFollow(FOLLOW_rule__InnerAction__Group__0_in_ruleInnerAction220);
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


    // $ANTLR start entryRuleEntryAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:142:1: entryRuleEntryAction : ruleEntryAction EOF ;
    public final void entryRuleEntryAction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:142:22: ( ruleEntryAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:143:1: ruleEntryAction EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionRule()); 
            }
            pushFollow(FOLLOW_ruleEntryAction_in_entryRuleEntryAction246);
            ruleEntryAction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryAction253); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:150:1: ruleEntryAction : ( ( rule__EntryAction__Group__0 ) ) ;
    public final void ruleEntryAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:154:2: ( ( ( rule__EntryAction__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:155:1: ( ( rule__EntryAction__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:155:1: ( ( rule__EntryAction__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:156:1: ( rule__EntryAction__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:157:1: ( rule__EntryAction__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:157:2: rule__EntryAction__Group__0
            {
            pushFollow(FOLLOW_rule__EntryAction__Group__0_in_ruleEntryAction280);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:169:1: entryRuleExitAction : ruleExitAction EOF ;
    public final void entryRuleExitAction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:169:21: ( ruleExitAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:170:1: ruleExitAction EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionRule()); 
            }
            pushFollow(FOLLOW_ruleExitAction_in_entryRuleExitAction306);
            ruleExitAction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitAction313); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:177:1: ruleExitAction : ( ( rule__ExitAction__Group__0 ) ) ;
    public final void ruleExitAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:181:2: ( ( ( rule__ExitAction__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:182:1: ( ( rule__ExitAction__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:182:1: ( ( rule__ExitAction__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:183:1: ( rule__ExitAction__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:184:1: ( rule__ExitAction__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:184:2: rule__ExitAction__Group__0
            {
            pushFollow(FOLLOW_rule__ExitAction__Group__0_in_ruleExitAction340);
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


    // $ANTLR start ruleStateType
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:197:1: ruleStateType : ( ( rule__StateType__Alternatives ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:201:1: ( ( ( rule__StateType__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:202:1: ( ( rule__StateType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:202:1: ( ( rule__StateType__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:203:1: ( rule__StateType__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateTypeAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:204:1: ( rule__StateType__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:204:2: rule__StateType__Alternatives
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );
    public final void rule__State__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:219:1: ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) )
            int alt1=15;
            switch ( input.LA(1) ) {
            case 21:
                {
                switch ( input.LA(2) ) {
                case 11:
                    {
                    int LA1_7 = input.LA(3);

                    if ( (LA1_7==EOF||(LA1_7>=RULE_ID && LA1_7<=RULE_STRING)||(LA1_7>=15 && LA1_7<=16)) ) {
                        alt1=5;
                    }
                    else if ( (LA1_7==22) ) {
                        alt1=11;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA1_8 = input.LA(3);

                    if ( (LA1_8==EOF||(LA1_8>=RULE_ID && LA1_8<=RULE_STRING)||(LA1_8>=15 && LA1_8<=16)) ) {
                        alt1=5;
                    }
                    else if ( (LA1_8==22) ) {
                        alt1=11;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA1_9 = input.LA(3);

                    if ( (LA1_9==22) ) {
                        alt1=11;
                    }
                    else if ( (LA1_9==EOF||(LA1_9>=RULE_ID && LA1_9<=RULE_STRING)||(LA1_9>=15 && LA1_9<=16)) ) {
                        alt1=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_10 = input.LA(3);

                    if ( (LA1_10==EOF||(LA1_10>=RULE_ID && LA1_10<=RULE_STRING)||(LA1_10>=15 && LA1_10<=16)) ) {
                        alt1=5;
                    }
                    else if ( (LA1_10==22) ) {
                        alt1=11;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                case 16:
                    {
                    alt1=1;
                    }
                    break;
                case 22:
                    {
                    int LA1_12 = input.LA(3);

                    if ( ((LA1_12>=11 && LA1_12<=14)) ) {
                        alt1=10;
                    }
                    else if ( (LA1_12==EOF||(LA1_12>=RULE_ID && LA1_12<=RULE_STRING)||(LA1_12>=15 && LA1_12<=16)) ) {
                        alt1=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 12, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 22:
                {
                switch ( input.LA(2) ) {
                case 11:
                    {
                    int LA1_13 = input.LA(3);

                    if ( (LA1_13==21) ) {
                        alt1=13;
                    }
                    else if ( (LA1_13==EOF||(LA1_13>=RULE_ID && LA1_13<=RULE_STRING)||(LA1_13>=15 && LA1_13<=16)) ) {
                        alt1=7;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA1_14 = input.LA(3);

                    if ( (LA1_14==EOF||(LA1_14>=RULE_ID && LA1_14<=RULE_STRING)||(LA1_14>=15 && LA1_14<=16)) ) {
                        alt1=7;
                    }
                    else if ( (LA1_14==21) ) {
                        alt1=13;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA1_15 = input.LA(3);

                    if ( (LA1_15==21) ) {
                        alt1=13;
                    }
                    else if ( (LA1_15==EOF||(LA1_15>=RULE_ID && LA1_15<=RULE_STRING)||(LA1_15>=15 && LA1_15<=16)) ) {
                        alt1=7;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_16 = input.LA(3);

                    if ( (LA1_16==21) ) {
                        alt1=13;
                    }
                    else if ( (LA1_16==EOF||(LA1_16>=RULE_ID && LA1_16<=RULE_STRING)||(LA1_16>=15 && LA1_16<=16)) ) {
                        alt1=7;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 21:
                    {
                    int LA1_17 = input.LA(3);

                    if ( (LA1_17==EOF||(LA1_17>=RULE_ID && LA1_17<=RULE_STRING)||(LA1_17>=15 && LA1_17<=16)) ) {
                        alt1=6;
                    }
                    else if ( ((LA1_17>=11 && LA1_17<=14)) ) {
                        alt1=12;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                case 16:
                    {
                    alt1=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 2, input);

                    throw nvae;
                }

                }
                break;
            case 11:
                {
                switch ( input.LA(2) ) {
                case 21:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==EOF||(LA1_19>=RULE_ID && LA1_19<=RULE_STRING)||(LA1_19>=15 && LA1_19<=16)) ) {
                        alt1=8;
                    }
                    else if ( (LA1_19==22) ) {
                        alt1=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||(LA1_20>=15 && LA1_20<=16)) ) {
                        alt1=9;
                    }
                    else if ( (LA1_20==21) ) {
                        alt1=14;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                case 16:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 3, input);

                    throw nvae;
                }

                }
                break;
            case 12:
                {
                switch ( input.LA(2) ) {
                case 21:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==EOF||(LA1_19>=RULE_ID && LA1_19<=RULE_STRING)||(LA1_19>=15 && LA1_19<=16)) ) {
                        alt1=8;
                    }
                    else if ( (LA1_19==22) ) {
                        alt1=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                case 16:
                    {
                    alt1=3;
                    }
                    break;
                case 22:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||(LA1_20>=15 && LA1_20<=16)) ) {
                        alt1=9;
                    }
                    else if ( (LA1_20==21) ) {
                        alt1=14;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 4, input);

                    throw nvae;
                }

                }
                break;
            case 13:
                {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||(LA1_20>=15 && LA1_20<=16)) ) {
                        alt1=9;
                    }
                    else if ( (LA1_20==21) ) {
                        alt1=14;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                case 16:
                    {
                    alt1=3;
                    }
                    break;
                case 21:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==EOF||(LA1_19>=RULE_ID && LA1_19<=RULE_STRING)||(LA1_19>=15 && LA1_19<=16)) ) {
                        alt1=8;
                    }
                    else if ( (LA1_19==22) ) {
                        alt1=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 5, input);

                    throw nvae;
                }

                }
                break;
            case 14:
                {
                switch ( input.LA(2) ) {
                case 21:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==EOF||(LA1_19>=RULE_ID && LA1_19<=RULE_STRING)||(LA1_19>=15 && LA1_19<=16)) ) {
                        alt1=8;
                    }
                    else if ( (LA1_19==22) ) {
                        alt1=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||(LA1_20>=15 && LA1_20<=16)) ) {
                        alt1=9;
                    }
                    else if ( (LA1_20==21) ) {
                        alt1=14;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                case 16:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 6, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("215:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:220:1: ( ( rule__State__IsInitialAssignment_0_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:220:1: ( ( rule__State__IsInitialAssignment_0_0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:221:1: ( rule__State__IsInitialAssignment_0_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getIsInitialAssignment_0_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:222:1: ( rule__State__IsInitialAssignment_0_0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:222:2: rule__State__IsInitialAssignment_0_0
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:226:6: ( ( rule__State__IsFinalAssignment_0_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:226:6: ( ( rule__State__IsFinalAssignment_0_1 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:227:1: ( rule__State__IsFinalAssignment_0_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getIsFinalAssignment_0_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:228:1: ( rule__State__IsFinalAssignment_0_1 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:228:2: rule__State__IsFinalAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_1_in_rule__State__Alternatives_0430);
                    rule__State__IsFinalAssignment_0_1();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getIsFinalAssignment_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:232:6: ( ( rule__State__StateKindAssignment_0_2 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:232:6: ( ( rule__State__StateKindAssignment_0_2 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:233:1: ( rule__State__StateKindAssignment_0_2 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getStateKindAssignment_0_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:234:1: ( rule__State__StateKindAssignment_0_2 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:234:2: rule__State__StateKindAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__State__StateKindAssignment_0_2_in_rule__State__Alternatives_0448);
                    rule__State__StateKindAssignment_0_2();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getStateKindAssignment_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:238:6: ( ( rule__State__Group_0_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:238:6: ( ( rule__State__Group_0_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:239:1: ( rule__State__Group_0_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:240:1: ( rule__State__Group_0_3__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:240:2: rule__State__Group_0_3__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_3__0_in_rule__State__Alternatives_0466);
                    rule__State__Group_0_3__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:244:6: ( ( rule__State__Group_0_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:244:6: ( ( rule__State__Group_0_4__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:245:1: ( rule__State__Group_0_4__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:246:1: ( rule__State__Group_0_4__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:246:2: rule__State__Group_0_4__0
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:250:6: ( ( rule__State__Group_0_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:250:6: ( ( rule__State__Group_0_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:251:1: ( rule__State__Group_0_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:252:1: ( rule__State__Group_0_5__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:252:2: rule__State__Group_0_5__0
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:256:6: ( ( rule__State__Group_0_6__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:256:6: ( ( rule__State__Group_0_6__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:257:1: ( rule__State__Group_0_6__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_6()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:258:1: ( rule__State__Group_0_6__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:258:2: rule__State__Group_0_6__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_6__0_in_rule__State__Alternatives_0520);
                    rule__State__Group_0_6__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:262:6: ( ( rule__State__Group_0_7__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:262:6: ( ( rule__State__Group_0_7__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:263:1: ( rule__State__Group_0_7__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_7()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:264:1: ( rule__State__Group_0_7__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:264:2: rule__State__Group_0_7__0
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:268:6: ( ( rule__State__Group_0_8__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:268:6: ( ( rule__State__Group_0_8__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:269:1: ( rule__State__Group_0_8__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_8()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:270:1: ( rule__State__Group_0_8__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:270:2: rule__State__Group_0_8__0
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:274:6: ( ( rule__State__Group_0_9__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:274:6: ( ( rule__State__Group_0_9__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:275:1: ( rule__State__Group_0_9__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_9()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:276:1: ( rule__State__Group_0_9__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:276:2: rule__State__Group_0_9__0
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:280:6: ( ( rule__State__Group_0_10__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:280:6: ( ( rule__State__Group_0_10__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:281:1: ( rule__State__Group_0_10__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_10()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:282:1: ( rule__State__Group_0_10__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:282:2: rule__State__Group_0_10__0
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:286:6: ( ( rule__State__Group_0_11__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:286:6: ( ( rule__State__Group_0_11__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:287:1: ( rule__State__Group_0_11__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_11()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:288:1: ( rule__State__Group_0_11__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:288:2: rule__State__Group_0_11__0
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:292:6: ( ( rule__State__Group_0_12__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:292:6: ( ( rule__State__Group_0_12__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:293:1: ( rule__State__Group_0_12__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_12()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:294:1: ( rule__State__Group_0_12__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:294:2: rule__State__Group_0_12__0
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:298:6: ( ( rule__State__Group_0_13__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:298:6: ( ( rule__State__Group_0_13__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:299:1: ( rule__State__Group_0_13__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_13()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:300:1: ( rule__State__Group_0_13__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:300:2: rule__State__Group_0_13__0
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:304:6: ( ( rule__State__Group_0_14__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:304:6: ( ( rule__State__Group_0_14__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:305:1: ( rule__State__Group_0_14__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_14()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:306:1: ( rule__State__Group_0_14__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:306:2: rule__State__Group_0_14__0
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

            }
        }
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:315:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) | ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) );
    public final void rule__StateContent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:319:1: ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) | ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) )
            int alt2=3;
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
            case 18:
                {
                alt2=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("315:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__ExitActionsAssignment_1_0 ) ) | ( ( rule__StateContent__EntryActionsAssignment_1_1 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_2 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:320:1: ( ( rule__StateContent__ExitActionsAssignment_1_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:320:1: ( ( rule__StateContent__ExitActionsAssignment_1_0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:321:1: ( rule__StateContent__ExitActionsAssignment_1_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getExitActionsAssignment_1_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:322:1: ( rule__StateContent__ExitActionsAssignment_1_0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:322:2: rule__StateContent__ExitActionsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__StateContent__ExitActionsAssignment_1_0_in_rule__StateContent__Alternatives_1697);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:326:6: ( ( rule__StateContent__EntryActionsAssignment_1_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:326:6: ( ( rule__StateContent__EntryActionsAssignment_1_1 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:327:1: ( rule__StateContent__EntryActionsAssignment_1_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getEntryActionsAssignment_1_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:328:1: ( rule__StateContent__EntryActionsAssignment_1_1 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:328:2: rule__StateContent__EntryActionsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__StateContent__EntryActionsAssignment_1_1_in_rule__StateContent__Alternatives_1715);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:332:6: ( ( rule__StateContent__InnerActionAssignment_1_2 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:332:6: ( ( rule__StateContent__InnerActionAssignment_1_2 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:333:1: ( rule__StateContent__InnerActionAssignment_1_2 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getInnerActionAssignment_1_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:334:1: ( rule__StateContent__InnerActionAssignment_1_2 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:334:2: rule__StateContent__InnerActionAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__StateContent__InnerActionAssignment_1_2_in_rule__StateContent__Alternatives_1733);
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

            }
        }
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:343:1: rule__StateType__Alternatives : ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) );
    public final void rule__StateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:347:1: ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) )
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
                    new NoViableAltException("343:1: rule__StateType__Alternatives : ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:348:1: ( ( 'NORMAL' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:348:1: ( ( 'NORMAL' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:349:1: ( 'NORMAL' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:350:1: ( 'NORMAL' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:350:3: 'NORMAL'
                    {
                    match(input,11,FOLLOW_11_in_rule__StateType__Alternatives767); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:355:6: ( ( 'cond' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:355:6: ( ( 'cond' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:356:1: ( 'cond' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:357:1: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:357:3: 'cond'
                    {
                    match(input,12,FOLLOW_12_in_rule__StateType__Alternatives788); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:362:6: ( ( 'reference' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:362:6: ( ( 'reference' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:363:1: ( 'reference' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:364:1: ( 'reference' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:364:3: 'reference'
                    {
                    match(input,13,FOLLOW_13_in_rule__StateType__Alternatives809); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:369:6: ( ( 'textual' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:369:6: ( ( 'textual' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:370:1: ( 'textual' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:371:1: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:371:3: 'textual'
                    {
                    match(input,14,FOLLOW_14_in_rule__StateType__Alternatives830); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:383:1: rule__State__Group__0 : ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:387:1: ( ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:388:1: ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:388:1: ( ( rule__State__Alternatives_0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:389:1: ( rule__State__Alternatives_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:390:1: ( rule__State__Alternatives_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=14)||(LA4_0>=21 && LA4_0<=22)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:390:2: rule__State__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__State__Alternatives_0_in_rule__State__Group__0867);
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

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__0877);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:401:1: rule__State__Group__1 : ( ( 'state' )? ) rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:405:1: ( ( ( 'state' )? ) rule__State__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:406:1: ( ( 'state' )? ) rule__State__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:406:1: ( ( 'state' )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:407:1: ( 'state' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:408:1: ( 'state' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:409:2: 'state'
                    {
                    match(input,15,FOLLOW_15_in_rule__State__Group__1907); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__1919);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:421:1: rule__State__Group__2 : ( ( rule__State__StateIDAssignment_2 )? ) rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:425:1: ( ( ( rule__State__StateIDAssignment_2 )? ) rule__State__Group__3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:426:1: ( ( rule__State__StateIDAssignment_2 )? ) rule__State__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:426:1: ( ( rule__State__StateIDAssignment_2 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:427:1: ( rule__State__StateIDAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateIDAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:428:1: ( rule__State__StateIDAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:428:2: rule__State__StateIDAssignment_2
                    {
                    pushFollow(FOLLOW_rule__State__StateIDAssignment_2_in_rule__State__Group__2947);
                    rule__State__StateIDAssignment_2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateIDAssignment_2()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__2957);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:439:1: rule__State__Group__3 : ( ( rule__State__StateLabelAssignment_3 )? ) rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:443:1: ( ( ( rule__State__StateLabelAssignment_3 )? ) rule__State__Group__4 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:444:1: ( ( rule__State__StateLabelAssignment_3 )? ) rule__State__Group__4
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:444:1: ( ( rule__State__StateLabelAssignment_3 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:445:1: ( rule__State__StateLabelAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateLabelAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:446:1: ( rule__State__StateLabelAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:446:2: rule__State__StateLabelAssignment_3
                    {
                    pushFollow(FOLLOW_rule__State__StateLabelAssignment_3_in_rule__State__Group__3985);
                    rule__State__StateLabelAssignment_3();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateLabelAssignment_3()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__3995);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:457:1: rule__State__Group__4 : ( ( rule__State__StateContentAssignment_4 )? ) ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:461:1: ( ( ( rule__State__StateContentAssignment_4 )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:462:1: ( ( rule__State__StateContentAssignment_4 )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:462:1: ( ( rule__State__StateContentAssignment_4 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:463:1: ( rule__State__StateContentAssignment_4 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateContentAssignment_4()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:464:1: ( rule__State__StateContentAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:464:2: rule__State__StateContentAssignment_4
                    {
                    pushFollow(FOLLOW_rule__State__StateContentAssignment_4_in_rule__State__Group__41023);
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


    // $ANTLR start rule__State__Group_0_3__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:484:1: rule__State__Group_0_3__0 : ( ( rule__State__IsInitialAssignment_0_3_0 ) ) rule__State__Group_0_3__1 ;
    public final void rule__State__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:488:1: ( ( ( rule__State__IsInitialAssignment_0_3_0 ) ) rule__State__Group_0_3__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:489:1: ( ( rule__State__IsInitialAssignment_0_3_0 ) ) rule__State__Group_0_3__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:489:1: ( ( rule__State__IsInitialAssignment_0_3_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:490:1: ( rule__State__IsInitialAssignment_0_3_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_3_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:491:1: ( rule__State__IsInitialAssignment_0_3_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:491:2: rule__State__IsInitialAssignment_0_3_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_3_0_in_rule__State__Group_0_3__01068);
            rule__State__IsInitialAssignment_0_3_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_3_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_3__1_in_rule__State__Group_0_3__01077);
            rule__State__Group_0_3__1();
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
    // $ANTLR end rule__State__Group_0_3__0


    // $ANTLR start rule__State__Group_0_3__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:502:1: rule__State__Group_0_3__1 : ( ( rule__State__IsFinalAssignment_0_3_1 ) ) ;
    public final void rule__State__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:506:1: ( ( ( rule__State__IsFinalAssignment_0_3_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:507:1: ( ( rule__State__IsFinalAssignment_0_3_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:507:1: ( ( rule__State__IsFinalAssignment_0_3_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:508:1: ( rule__State__IsFinalAssignment_0_3_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_3_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:509:1: ( rule__State__IsFinalAssignment_0_3_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:509:2: rule__State__IsFinalAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_3_1_in_rule__State__Group_0_3__11105);
            rule__State__IsFinalAssignment_0_3_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_3_1()); 
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
    // $ANTLR end rule__State__Group_0_3__1


    // $ANTLR start rule__State__Group_0_4__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:523:1: rule__State__Group_0_4__0 : ( ( rule__State__IsInitialAssignment_0_4_0 ) ) rule__State__Group_0_4__1 ;
    public final void rule__State__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:527:1: ( ( ( rule__State__IsInitialAssignment_0_4_0 ) ) rule__State__Group_0_4__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:528:1: ( ( rule__State__IsInitialAssignment_0_4_0 ) ) rule__State__Group_0_4__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:528:1: ( ( rule__State__IsInitialAssignment_0_4_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:529:1: ( rule__State__IsInitialAssignment_0_4_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_4_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:530:1: ( rule__State__IsInitialAssignment_0_4_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:530:2: rule__State__IsInitialAssignment_0_4_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_4_0_in_rule__State__Group_0_4__01143);
            rule__State__IsInitialAssignment_0_4_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_4_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_4__1_in_rule__State__Group_0_4__01152);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:541:1: rule__State__Group_0_4__1 : ( ( rule__State__StateKindAssignment_0_4_1 ) ) ;
    public final void rule__State__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:545:1: ( ( ( rule__State__StateKindAssignment_0_4_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:546:1: ( ( rule__State__StateKindAssignment_0_4_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:546:1: ( ( rule__State__StateKindAssignment_0_4_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:547:1: ( rule__State__StateKindAssignment_0_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_4_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:548:1: ( rule__State__StateKindAssignment_0_4_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:548:2: rule__State__StateKindAssignment_0_4_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_4_1_in_rule__State__Group_0_4__11180);
            rule__State__StateKindAssignment_0_4_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_4_1()); 
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:562:1: rule__State__Group_0_5__0 : ( ( rule__State__IsFinalAssignment_0_5_0 ) ) rule__State__Group_0_5__1 ;
    public final void rule__State__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:566:1: ( ( ( rule__State__IsFinalAssignment_0_5_0 ) ) rule__State__Group_0_5__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:567:1: ( ( rule__State__IsFinalAssignment_0_5_0 ) ) rule__State__Group_0_5__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:567:1: ( ( rule__State__IsFinalAssignment_0_5_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:568:1: ( rule__State__IsFinalAssignment_0_5_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_5_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:569:1: ( rule__State__IsFinalAssignment_0_5_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:569:2: rule__State__IsFinalAssignment_0_5_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_5_0_in_rule__State__Group_0_5__01218);
            rule__State__IsFinalAssignment_0_5_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_5_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_5__1_in_rule__State__Group_0_5__01227);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:580:1: rule__State__Group_0_5__1 : ( ( rule__State__IsInitialAssignment_0_5_1 ) ) ;
    public final void rule__State__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:584:1: ( ( ( rule__State__IsInitialAssignment_0_5_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:585:1: ( ( rule__State__IsInitialAssignment_0_5_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:585:1: ( ( rule__State__IsInitialAssignment_0_5_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:586:1: ( rule__State__IsInitialAssignment_0_5_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_5_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:587:1: ( rule__State__IsInitialAssignment_0_5_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:587:2: rule__State__IsInitialAssignment_0_5_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_5_1_in_rule__State__Group_0_5__11255);
            rule__State__IsInitialAssignment_0_5_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_5_1()); 
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


    // $ANTLR start rule__State__Group_0_6__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:601:1: rule__State__Group_0_6__0 : ( ( rule__State__IsFinalAssignment_0_6_0 ) ) rule__State__Group_0_6__1 ;
    public final void rule__State__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:605:1: ( ( ( rule__State__IsFinalAssignment_0_6_0 ) ) rule__State__Group_0_6__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:606:1: ( ( rule__State__IsFinalAssignment_0_6_0 ) ) rule__State__Group_0_6__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:606:1: ( ( rule__State__IsFinalAssignment_0_6_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:607:1: ( rule__State__IsFinalAssignment_0_6_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_6_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:608:1: ( rule__State__IsFinalAssignment_0_6_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:608:2: rule__State__IsFinalAssignment_0_6_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_6_0_in_rule__State__Group_0_6__01293);
            rule__State__IsFinalAssignment_0_6_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_6_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_6__1_in_rule__State__Group_0_6__01302);
            rule__State__Group_0_6__1();
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
    // $ANTLR end rule__State__Group_0_6__0


    // $ANTLR start rule__State__Group_0_6__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:619:1: rule__State__Group_0_6__1 : ( ( rule__State__StateKindAssignment_0_6_1 ) ) ;
    public final void rule__State__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:623:1: ( ( ( rule__State__StateKindAssignment_0_6_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:624:1: ( ( rule__State__StateKindAssignment_0_6_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:624:1: ( ( rule__State__StateKindAssignment_0_6_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:625:1: ( rule__State__StateKindAssignment_0_6_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_6_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:626:1: ( rule__State__StateKindAssignment_0_6_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:626:2: rule__State__StateKindAssignment_0_6_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_6_1_in_rule__State__Group_0_6__11330);
            rule__State__StateKindAssignment_0_6_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_6_1()); 
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
    // $ANTLR end rule__State__Group_0_6__1


    // $ANTLR start rule__State__Group_0_7__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:640:1: rule__State__Group_0_7__0 : ( ( rule__State__StateKindAssignment_0_7_0 ) ) rule__State__Group_0_7__1 ;
    public final void rule__State__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:644:1: ( ( ( rule__State__StateKindAssignment_0_7_0 ) ) rule__State__Group_0_7__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:645:1: ( ( rule__State__StateKindAssignment_0_7_0 ) ) rule__State__Group_0_7__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:645:1: ( ( rule__State__StateKindAssignment_0_7_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:646:1: ( rule__State__StateKindAssignment_0_7_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_7_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:647:1: ( rule__State__StateKindAssignment_0_7_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:647:2: rule__State__StateKindAssignment_0_7_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_7_0_in_rule__State__Group_0_7__01368);
            rule__State__StateKindAssignment_0_7_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_7_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_7__1_in_rule__State__Group_0_7__01377);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:658:1: rule__State__Group_0_7__1 : ( ( rule__State__IsInitialAssignment_0_7_1 ) ) ;
    public final void rule__State__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:662:1: ( ( ( rule__State__IsInitialAssignment_0_7_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:663:1: ( ( rule__State__IsInitialAssignment_0_7_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:663:1: ( ( rule__State__IsInitialAssignment_0_7_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:664:1: ( rule__State__IsInitialAssignment_0_7_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_7_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:665:1: ( rule__State__IsInitialAssignment_0_7_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:665:2: rule__State__IsInitialAssignment_0_7_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_7_1_in_rule__State__Group_0_7__11405);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:679:1: rule__State__Group_0_8__0 : ( ( rule__State__StateKindAssignment_0_8_0 ) ) rule__State__Group_0_8__1 ;
    public final void rule__State__Group_0_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:683:1: ( ( ( rule__State__StateKindAssignment_0_8_0 ) ) rule__State__Group_0_8__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:684:1: ( ( rule__State__StateKindAssignment_0_8_0 ) ) rule__State__Group_0_8__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:684:1: ( ( rule__State__StateKindAssignment_0_8_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:685:1: ( rule__State__StateKindAssignment_0_8_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_8_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:686:1: ( rule__State__StateKindAssignment_0_8_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:686:2: rule__State__StateKindAssignment_0_8_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_8_0_in_rule__State__Group_0_8__01443);
            rule__State__StateKindAssignment_0_8_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_8_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_8__1_in_rule__State__Group_0_8__01452);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:697:1: rule__State__Group_0_8__1 : ( ( rule__State__IsFinalAssignment_0_8_1 ) ) ;
    public final void rule__State__Group_0_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:701:1: ( ( ( rule__State__IsFinalAssignment_0_8_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:702:1: ( ( rule__State__IsFinalAssignment_0_8_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:702:1: ( ( rule__State__IsFinalAssignment_0_8_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:703:1: ( rule__State__IsFinalAssignment_0_8_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_8_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:704:1: ( rule__State__IsFinalAssignment_0_8_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:704:2: rule__State__IsFinalAssignment_0_8_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_8_1_in_rule__State__Group_0_8__11480);
            rule__State__IsFinalAssignment_0_8_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_8_1()); 
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:718:1: rule__State__Group_0_9__0 : ( ( rule__State__IsInitialAssignment_0_9_0 ) ) rule__State__Group_0_9__1 ;
    public final void rule__State__Group_0_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:722:1: ( ( ( rule__State__IsInitialAssignment_0_9_0 ) ) rule__State__Group_0_9__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:723:1: ( ( rule__State__IsInitialAssignment_0_9_0 ) ) rule__State__Group_0_9__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:723:1: ( ( rule__State__IsInitialAssignment_0_9_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:724:1: ( rule__State__IsInitialAssignment_0_9_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_9_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:725:1: ( rule__State__IsInitialAssignment_0_9_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:725:2: rule__State__IsInitialAssignment_0_9_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_9_0_in_rule__State__Group_0_9__01518);
            rule__State__IsInitialAssignment_0_9_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_9_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_9__1_in_rule__State__Group_0_9__01527);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:736:1: rule__State__Group_0_9__1 : ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2 ;
    public final void rule__State__Group_0_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:740:1: ( ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:741:1: ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:741:1: ( ( rule__State__IsFinalAssignment_0_9_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:742:1: ( rule__State__IsFinalAssignment_0_9_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_9_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:743:1: ( rule__State__IsFinalAssignment_0_9_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:743:2: rule__State__IsFinalAssignment_0_9_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_9_1_in_rule__State__Group_0_9__11555);
            rule__State__IsFinalAssignment_0_9_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_9_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_9__2_in_rule__State__Group_0_9__11564);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:754:1: rule__State__Group_0_9__2 : ( ( rule__State__StateKindAssignment_0_9_2 ) ) ;
    public final void rule__State__Group_0_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:758:1: ( ( ( rule__State__StateKindAssignment_0_9_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:759:1: ( ( rule__State__StateKindAssignment_0_9_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:759:1: ( ( rule__State__StateKindAssignment_0_9_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:760:1: ( rule__State__StateKindAssignment_0_9_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_9_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:761:1: ( rule__State__StateKindAssignment_0_9_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:761:2: rule__State__StateKindAssignment_0_9_2
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_9_2_in_rule__State__Group_0_9__21592);
            rule__State__StateKindAssignment_0_9_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_9_2()); 
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:777:1: rule__State__Group_0_10__0 : ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1 ;
    public final void rule__State__Group_0_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:781:1: ( ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:782:1: ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:782:1: ( ( rule__State__IsInitialAssignment_0_10_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:783:1: ( rule__State__IsInitialAssignment_0_10_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_10_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:784:1: ( rule__State__IsInitialAssignment_0_10_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:784:2: rule__State__IsInitialAssignment_0_10_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_10_0_in_rule__State__Group_0_10__01632);
            rule__State__IsInitialAssignment_0_10_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_10_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_10__1_in_rule__State__Group_0_10__01641);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:795:1: rule__State__Group_0_10__1 : ( ( rule__State__StateKindAssignment_0_10_1 ) ) rule__State__Group_0_10__2 ;
    public final void rule__State__Group_0_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:799:1: ( ( ( rule__State__StateKindAssignment_0_10_1 ) ) rule__State__Group_0_10__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:800:1: ( ( rule__State__StateKindAssignment_0_10_1 ) ) rule__State__Group_0_10__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:800:1: ( ( rule__State__StateKindAssignment_0_10_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:801:1: ( rule__State__StateKindAssignment_0_10_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_10_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:802:1: ( rule__State__StateKindAssignment_0_10_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:802:2: rule__State__StateKindAssignment_0_10_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_10_1_in_rule__State__Group_0_10__11669);
            rule__State__StateKindAssignment_0_10_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_10_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_10__2_in_rule__State__Group_0_10__11678);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:813:1: rule__State__Group_0_10__2 : ( ( rule__State__IsFinalAssignment_0_10_2 ) ) ;
    public final void rule__State__Group_0_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:817:1: ( ( ( rule__State__IsFinalAssignment_0_10_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:818:1: ( ( rule__State__IsFinalAssignment_0_10_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:818:1: ( ( rule__State__IsFinalAssignment_0_10_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:819:1: ( rule__State__IsFinalAssignment_0_10_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_10_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:820:1: ( rule__State__IsFinalAssignment_0_10_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:820:2: rule__State__IsFinalAssignment_0_10_2
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_10_2_in_rule__State__Group_0_10__21706);
            rule__State__IsFinalAssignment_0_10_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_10_2()); 
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:836:1: rule__State__Group_0_11__0 : ( ( rule__State__IsFinalAssignment_0_11_0 ) ) rule__State__Group_0_11__1 ;
    public final void rule__State__Group_0_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:840:1: ( ( ( rule__State__IsFinalAssignment_0_11_0 ) ) rule__State__Group_0_11__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:841:1: ( ( rule__State__IsFinalAssignment_0_11_0 ) ) rule__State__Group_0_11__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:841:1: ( ( rule__State__IsFinalAssignment_0_11_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:842:1: ( rule__State__IsFinalAssignment_0_11_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_11_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:843:1: ( rule__State__IsFinalAssignment_0_11_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:843:2: rule__State__IsFinalAssignment_0_11_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_11_0_in_rule__State__Group_0_11__01746);
            rule__State__IsFinalAssignment_0_11_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_11_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_11__1_in_rule__State__Group_0_11__01755);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:854:1: rule__State__Group_0_11__1 : ( ( rule__State__IsInitialAssignment_0_11_1 ) ) rule__State__Group_0_11__2 ;
    public final void rule__State__Group_0_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:858:1: ( ( ( rule__State__IsInitialAssignment_0_11_1 ) ) rule__State__Group_0_11__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:859:1: ( ( rule__State__IsInitialAssignment_0_11_1 ) ) rule__State__Group_0_11__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:859:1: ( ( rule__State__IsInitialAssignment_0_11_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:860:1: ( rule__State__IsInitialAssignment_0_11_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_11_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:861:1: ( rule__State__IsInitialAssignment_0_11_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:861:2: rule__State__IsInitialAssignment_0_11_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_11_1_in_rule__State__Group_0_11__11783);
            rule__State__IsInitialAssignment_0_11_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_11_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_11__2_in_rule__State__Group_0_11__11792);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:872:1: rule__State__Group_0_11__2 : ( ( rule__State__StateKindAssignment_0_11_2 ) ) ;
    public final void rule__State__Group_0_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:876:1: ( ( ( rule__State__StateKindAssignment_0_11_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:877:1: ( ( rule__State__StateKindAssignment_0_11_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:877:1: ( ( rule__State__StateKindAssignment_0_11_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:878:1: ( rule__State__StateKindAssignment_0_11_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_11_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:879:1: ( rule__State__StateKindAssignment_0_11_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:879:2: rule__State__StateKindAssignment_0_11_2
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_11_2_in_rule__State__Group_0_11__21820);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:895:1: rule__State__Group_0_12__0 : ( ( rule__State__IsFinalAssignment_0_12_0 ) ) rule__State__Group_0_12__1 ;
    public final void rule__State__Group_0_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:899:1: ( ( ( rule__State__IsFinalAssignment_0_12_0 ) ) rule__State__Group_0_12__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:900:1: ( ( rule__State__IsFinalAssignment_0_12_0 ) ) rule__State__Group_0_12__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:900:1: ( ( rule__State__IsFinalAssignment_0_12_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:901:1: ( rule__State__IsFinalAssignment_0_12_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_12_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:902:1: ( rule__State__IsFinalAssignment_0_12_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:902:2: rule__State__IsFinalAssignment_0_12_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_12_0_in_rule__State__Group_0_12__01860);
            rule__State__IsFinalAssignment_0_12_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_12_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_12__1_in_rule__State__Group_0_12__01869);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:913:1: rule__State__Group_0_12__1 : ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2 ;
    public final void rule__State__Group_0_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:917:1: ( ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:918:1: ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:918:1: ( ( rule__State__StateKindAssignment_0_12_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:919:1: ( rule__State__StateKindAssignment_0_12_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_12_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:920:1: ( rule__State__StateKindAssignment_0_12_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:920:2: rule__State__StateKindAssignment_0_12_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_12_1_in_rule__State__Group_0_12__11897);
            rule__State__StateKindAssignment_0_12_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_12_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_12__2_in_rule__State__Group_0_12__11906);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:931:1: rule__State__Group_0_12__2 : ( ( rule__State__IsInitialAssignment_0_12_2 ) ) ;
    public final void rule__State__Group_0_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:935:1: ( ( ( rule__State__IsInitialAssignment_0_12_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:936:1: ( ( rule__State__IsInitialAssignment_0_12_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:936:1: ( ( rule__State__IsInitialAssignment_0_12_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:937:1: ( rule__State__IsInitialAssignment_0_12_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_12_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:938:1: ( rule__State__IsInitialAssignment_0_12_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:938:2: rule__State__IsInitialAssignment_0_12_2
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_12_2_in_rule__State__Group_0_12__21934);
            rule__State__IsInitialAssignment_0_12_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_12_2()); 
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:954:1: rule__State__Group_0_13__0 : ( ( rule__State__StateKindAssignment_0_13_0 ) ) rule__State__Group_0_13__1 ;
    public final void rule__State__Group_0_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:958:1: ( ( ( rule__State__StateKindAssignment_0_13_0 ) ) rule__State__Group_0_13__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:959:1: ( ( rule__State__StateKindAssignment_0_13_0 ) ) rule__State__Group_0_13__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:959:1: ( ( rule__State__StateKindAssignment_0_13_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:960:1: ( rule__State__StateKindAssignment_0_13_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_13_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:961:1: ( rule__State__StateKindAssignment_0_13_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:961:2: rule__State__StateKindAssignment_0_13_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_13_0_in_rule__State__Group_0_13__01974);
            rule__State__StateKindAssignment_0_13_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_13_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_13__1_in_rule__State__Group_0_13__01983);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:972:1: rule__State__Group_0_13__1 : ( ( rule__State__IsFinalAssignment_0_13_1 ) ) rule__State__Group_0_13__2 ;
    public final void rule__State__Group_0_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:976:1: ( ( ( rule__State__IsFinalAssignment_0_13_1 ) ) rule__State__Group_0_13__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:977:1: ( ( rule__State__IsFinalAssignment_0_13_1 ) ) rule__State__Group_0_13__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:977:1: ( ( rule__State__IsFinalAssignment_0_13_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:978:1: ( rule__State__IsFinalAssignment_0_13_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_13_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:979:1: ( rule__State__IsFinalAssignment_0_13_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:979:2: rule__State__IsFinalAssignment_0_13_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_13_1_in_rule__State__Group_0_13__12011);
            rule__State__IsFinalAssignment_0_13_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_13_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_13__2_in_rule__State__Group_0_13__12020);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:990:1: rule__State__Group_0_13__2 : ( ( rule__State__IsInitialAssignment_0_13_2 ) ) ;
    public final void rule__State__Group_0_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:994:1: ( ( ( rule__State__IsInitialAssignment_0_13_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:995:1: ( ( rule__State__IsInitialAssignment_0_13_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:995:1: ( ( rule__State__IsInitialAssignment_0_13_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:996:1: ( rule__State__IsInitialAssignment_0_13_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_13_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:997:1: ( rule__State__IsInitialAssignment_0_13_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:997:2: rule__State__IsInitialAssignment_0_13_2
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_13_2_in_rule__State__Group_0_13__22048);
            rule__State__IsInitialAssignment_0_13_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_13_2()); 
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1013:1: rule__State__Group_0_14__0 : ( ( rule__State__StateKindAssignment_0_14_0 ) ) rule__State__Group_0_14__1 ;
    public final void rule__State__Group_0_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1017:1: ( ( ( rule__State__StateKindAssignment_0_14_0 ) ) rule__State__Group_0_14__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1018:1: ( ( rule__State__StateKindAssignment_0_14_0 ) ) rule__State__Group_0_14__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1018:1: ( ( rule__State__StateKindAssignment_0_14_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1019:1: ( rule__State__StateKindAssignment_0_14_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_14_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1020:1: ( rule__State__StateKindAssignment_0_14_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1020:2: rule__State__StateKindAssignment_0_14_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_14_0_in_rule__State__Group_0_14__02088);
            rule__State__StateKindAssignment_0_14_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_14_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_14__1_in_rule__State__Group_0_14__02097);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1031:1: rule__State__Group_0_14__1 : ( ( rule__State__IsInitialAssignment_0_14_1 ) ) rule__State__Group_0_14__2 ;
    public final void rule__State__Group_0_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1035:1: ( ( ( rule__State__IsInitialAssignment_0_14_1 ) ) rule__State__Group_0_14__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1036:1: ( ( rule__State__IsInitialAssignment_0_14_1 ) ) rule__State__Group_0_14__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1036:1: ( ( rule__State__IsInitialAssignment_0_14_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1037:1: ( rule__State__IsInitialAssignment_0_14_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_14_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1038:1: ( rule__State__IsInitialAssignment_0_14_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1038:2: rule__State__IsInitialAssignment_0_14_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_14_1_in_rule__State__Group_0_14__12125);
            rule__State__IsInitialAssignment_0_14_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_14_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_14__2_in_rule__State__Group_0_14__12134);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1049:1: rule__State__Group_0_14__2 : ( ( rule__State__IsFinalAssignment_0_14_2 ) ) ;
    public final void rule__State__Group_0_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1053:1: ( ( ( rule__State__IsFinalAssignment_0_14_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1054:1: ( ( rule__State__IsFinalAssignment_0_14_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1054:1: ( ( rule__State__IsFinalAssignment_0_14_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1055:1: ( rule__State__IsFinalAssignment_0_14_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_14_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1056:1: ( rule__State__IsFinalAssignment_0_14_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1056:2: rule__State__IsFinalAssignment_0_14_2
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_14_2_in_rule__State__Group_0_14__22162);
            rule__State__IsFinalAssignment_0_14_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_14_2()); 
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


    // $ANTLR start rule__StateContent__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1072:1: rule__StateContent__Group__0 : ( '{' ) rule__StateContent__Group__1 ;
    public final void rule__StateContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1076:1: ( ( '{' ) rule__StateContent__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1077:1: ( '{' ) rule__StateContent__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1077:1: ( '{' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1078:1: '{'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__StateContent__Group__02203); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group__1_in_rule__StateContent__Group__02213);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1092:1: rule__StateContent__Group__1 : ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) ) rule__StateContent__Group__2 ;
    public final void rule__StateContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1096:1: ( ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) ) rule__StateContent__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1097:1: ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) ) rule__StateContent__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1097:1: ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1098:1: ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1098:1: ( ( rule__StateContent__Alternatives_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1099:1: ( rule__StateContent__Alternatives_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1100:1: ( rule__StateContent__Alternatives_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1100:2: rule__StateContent__Alternatives_1
            {
            pushFollow(FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__12243);
            rule__StateContent__Alternatives_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1103:1: ( ( rule__StateContent__Alternatives_1 )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1104:1: ( rule__StateContent__Alternatives_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1105:1: ( rule__StateContent__Alternatives_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=18 && LA9_0<=20)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1105:2: rule__StateContent__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__12255);
            	    rule__StateContent__Alternatives_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }

            }


            }

            pushFollow(FOLLOW_rule__StateContent__Group__2_in_rule__StateContent__Group__12267);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1117:1: rule__StateContent__Group__2 : ( '}' ) ;
    public final void rule__StateContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1121:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1122:1: ( '}' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1122:1: ( '}' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1123:1: '}'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__StateContent__Group__22296); if (failed) return ;
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


    // $ANTLR start rule__InnerAction__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1142:1: rule__InnerAction__Group__0 : ( 'oninner' ) rule__InnerAction__Group__1 ;
    public final void rule__InnerAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1146:1: ( ( 'oninner' ) rule__InnerAction__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1147:1: ( 'oninner' ) rule__InnerAction__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1147:1: ( 'oninner' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1148:1: 'oninner'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getOninnerKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__InnerAction__Group__02338); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getOninnerKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__InnerAction__Group__1_in_rule__InnerAction__Group__02348);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1162:1: rule__InnerAction__Group__1 : ( ( rule__InnerAction__InnerAssignment_1 ) ) ;
    public final void rule__InnerAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1166:1: ( ( ( rule__InnerAction__InnerAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1167:1: ( ( rule__InnerAction__InnerAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1167:1: ( ( rule__InnerAction__InnerAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1168:1: ( rule__InnerAction__InnerAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getInnerAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1169:1: ( rule__InnerAction__InnerAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1169:2: rule__InnerAction__InnerAssignment_1
            {
            pushFollow(FOLLOW_rule__InnerAction__InnerAssignment_1_in_rule__InnerAction__Group__12376);
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


    // $ANTLR start rule__EntryAction__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1183:1: rule__EntryAction__Group__0 : ( 'onentry' ) rule__EntryAction__Group__1 ;
    public final void rule__EntryAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1187:1: ( ( 'onentry' ) rule__EntryAction__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1188:1: ( 'onentry' ) rule__EntryAction__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1188:1: ( 'onentry' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1189:1: 'onentry'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getOnentryKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__EntryAction__Group__02415); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionAccess().getOnentryKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__EntryAction__Group__1_in_rule__EntryAction__Group__02425);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1203:1: rule__EntryAction__Group__1 : ( ( rule__EntryAction__EntryActionAssignment_1 ) ) ;
    public final void rule__EntryAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1207:1: ( ( ( rule__EntryAction__EntryActionAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1208:1: ( ( rule__EntryAction__EntryActionAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1208:1: ( ( rule__EntryAction__EntryActionAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1209:1: ( rule__EntryAction__EntryActionAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getEntryActionAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1210:1: ( rule__EntryAction__EntryActionAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1210:2: rule__EntryAction__EntryActionAssignment_1
            {
            pushFollow(FOLLOW_rule__EntryAction__EntryActionAssignment_1_in_rule__EntryAction__Group__12453);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1224:1: rule__ExitAction__Group__0 : ( 'onexit' ) rule__ExitAction__Group__1 ;
    public final void rule__ExitAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1228:1: ( ( 'onexit' ) rule__ExitAction__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1229:1: ( 'onexit' ) rule__ExitAction__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1229:1: ( 'onexit' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1230:1: 'onexit'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getOnexitKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__ExitAction__Group__02492); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getOnexitKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ExitAction__Group__1_in_rule__ExitAction__Group__02502);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1244:1: rule__ExitAction__Group__1 : ( ( rule__ExitAction__ExitAssignment_1 ) ) ;
    public final void rule__ExitAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1248:1: ( ( ( rule__ExitAction__ExitAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1249:1: ( ( rule__ExitAction__ExitAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1249:1: ( ( rule__ExitAction__ExitAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1250:1: ( rule__ExitAction__ExitAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getExitAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1251:1: ( rule__ExitAction__ExitAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1251:2: rule__ExitAction__ExitAssignment_1
            {
            pushFollow(FOLLOW_rule__ExitAction__ExitAssignment_1_in_rule__ExitAction__Group__12530);
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


    // $ANTLR start rule__State__IsInitialAssignment_0_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1265:1: rule__State__IsInitialAssignment_0_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1269:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1270:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1270:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1271:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1272:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1273:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__State__IsInitialAssignment_0_02573); if (failed) return ;
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


    // $ANTLR start rule__State__IsFinalAssignment_0_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1288:1: rule__State__IsFinalAssignment_0_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1292:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1293:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1293:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1294:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1295:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1296:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsFinalAssignment_0_12617); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_1


    // $ANTLR start rule__State__StateKindAssignment_0_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1311:1: rule__State__StateKindAssignment_0_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1315:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1316:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1316:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1317:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_22656);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_2_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_2


    // $ANTLR start rule__State__IsInitialAssignment_0_3_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1326:1: rule__State__IsInitialAssignment_0_3_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1330:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1331:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1331:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1332:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_3_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1333:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1334:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_3_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__State__IsInitialAssignment_0_3_02692); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_3_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_3_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_3_0


    // $ANTLR start rule__State__IsFinalAssignment_0_3_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1349:1: rule__State__IsFinalAssignment_0_3_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1353:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1354:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1354:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1355:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_3_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1356:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1357:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_3_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsFinalAssignment_0_3_12736); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_3_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_3_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_3_1


    // $ANTLR start rule__State__IsInitialAssignment_0_4_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1372:1: rule__State__IsInitialAssignment_0_4_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1376:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1377:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1377:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1378:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1379:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1380:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__State__IsInitialAssignment_0_4_02780); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_4_0


    // $ANTLR start rule__State__StateKindAssignment_0_4_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1395:1: rule__State__StateKindAssignment_0_4_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1399:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1400:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1400:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1401:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_4_12819);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_4_1_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_4_1


    // $ANTLR start rule__State__IsFinalAssignment_0_5_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1410:1: rule__State__IsFinalAssignment_0_5_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1414:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1415:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1415:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1416:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1417:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1418:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsFinalAssignment_0_5_02855); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_5_0


    // $ANTLR start rule__State__IsInitialAssignment_0_5_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1433:1: rule__State__IsInitialAssignment_0_5_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1437:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1438:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1438:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1439:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_5_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1440:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1441:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_5_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__State__IsInitialAssignment_0_5_12899); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_5_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_5_1_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_5_1


    // $ANTLR start rule__State__IsFinalAssignment_0_6_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1456:1: rule__State__IsFinalAssignment_0_6_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1460:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1461:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1461:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1462:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1463:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1464:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsFinalAssignment_0_6_02943); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_6_0


    // $ANTLR start rule__State__StateKindAssignment_0_6_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1479:1: rule__State__StateKindAssignment_0_6_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1483:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1484:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1484:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1485:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_6_12982);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_6_1_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_6_1


    // $ANTLR start rule__State__StateKindAssignment_0_7_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1494:1: rule__State__StateKindAssignment_0_7_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1498:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1499:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1499:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1500:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_7_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_7_03013);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_7_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_7_0


    // $ANTLR start rule__State__IsInitialAssignment_0_7_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1509:1: rule__State__IsInitialAssignment_0_7_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1513:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1514:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1514:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1515:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1516:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1517:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__State__IsInitialAssignment_0_7_13049); if (failed) return ;
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


    // $ANTLR start rule__State__StateKindAssignment_0_8_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1532:1: rule__State__StateKindAssignment_0_8_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1536:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1537:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1537:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1538:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_8_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_8_03088);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_8_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_8_0


    // $ANTLR start rule__State__IsFinalAssignment_0_8_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1547:1: rule__State__IsFinalAssignment_0_8_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1551:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1552:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1552:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1553:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1554:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1555:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsFinalAssignment_0_8_13124); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_8_1


    // $ANTLR start rule__State__IsInitialAssignment_0_9_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1570:1: rule__State__IsInitialAssignment_0_9_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1574:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1575:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1575:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1576:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1577:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1578:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__State__IsInitialAssignment_0_9_03168); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_9_0


    // $ANTLR start rule__State__IsFinalAssignment_0_9_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1593:1: rule__State__IsFinalAssignment_0_9_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1597:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1598:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1598:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1599:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1600:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1601:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsFinalAssignment_0_9_13212); if (failed) return ;
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


    // $ANTLR start rule__State__StateKindAssignment_0_9_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1616:1: rule__State__StateKindAssignment_0_9_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1620:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1621:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1621:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1622:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_9_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_9_23251);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_9_2_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_9_2


    // $ANTLR start rule__State__IsInitialAssignment_0_10_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1631:1: rule__State__IsInitialAssignment_0_10_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1635:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1636:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1636:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1637:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1638:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1639:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__State__IsInitialAssignment_0_10_03287); if (failed) return ;
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


    // $ANTLR start rule__State__StateKindAssignment_0_10_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1654:1: rule__State__StateKindAssignment_0_10_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1658:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1659:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1659:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1660:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_10_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_10_13326);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_10_1_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_10_1


    // $ANTLR start rule__State__IsFinalAssignment_0_10_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1669:1: rule__State__IsFinalAssignment_0_10_2 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1673:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1674:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1674:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1675:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1676:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1677:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_2_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsFinalAssignment_0_10_23362); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_2_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_10_2


    // $ANTLR start rule__State__IsFinalAssignment_0_11_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1692:1: rule__State__IsFinalAssignment_0_11_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1696:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1697:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1697:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1698:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1699:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1700:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsFinalAssignment_0_11_03406); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_11_0


    // $ANTLR start rule__State__IsInitialAssignment_0_11_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1715:1: rule__State__IsInitialAssignment_0_11_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1719:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1720:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1720:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1721:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1722:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1723:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__State__IsInitialAssignment_0_11_13450); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_1_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_11_1


    // $ANTLR start rule__State__StateKindAssignment_0_11_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1738:1: rule__State__StateKindAssignment_0_11_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1742:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1743:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1743:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1744:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_11_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_11_23489);
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


    // $ANTLR start rule__State__IsFinalAssignment_0_12_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1753:1: rule__State__IsFinalAssignment_0_12_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1757:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1758:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1758:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1759:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1760:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1761:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsFinalAssignment_0_12_03525); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_12_0


    // $ANTLR start rule__State__StateKindAssignment_0_12_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1776:1: rule__State__StateKindAssignment_0_12_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1780:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1781:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1781:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1782:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_12_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_12_13564);
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


    // $ANTLR start rule__State__IsInitialAssignment_0_12_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1791:1: rule__State__IsInitialAssignment_0_12_2 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1795:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1796:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1796:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1797:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1798:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1799:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_2_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__State__IsInitialAssignment_0_12_23600); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_2_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_12_2


    // $ANTLR start rule__State__StateKindAssignment_0_13_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1814:1: rule__State__StateKindAssignment_0_13_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1818:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1819:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1819:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1820:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_13_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_13_03639);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_13_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_13_0


    // $ANTLR start rule__State__IsFinalAssignment_0_13_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1829:1: rule__State__IsFinalAssignment_0_13_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1833:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1834:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1834:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1835:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1836:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1837:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsFinalAssignment_0_13_13675); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_13_1


    // $ANTLR start rule__State__IsInitialAssignment_0_13_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1852:1: rule__State__IsInitialAssignment_0_13_2 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1856:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1857:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1857:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1858:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1859:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1860:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_2_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__State__IsInitialAssignment_0_13_23719); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_2_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_13_2


    // $ANTLR start rule__State__StateKindAssignment_0_14_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1875:1: rule__State__StateKindAssignment_0_14_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1879:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1880:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1880:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1881:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_14_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_14_03758);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_14_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_14_0


    // $ANTLR start rule__State__IsInitialAssignment_0_14_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1890:1: rule__State__IsInitialAssignment_0_14_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1894:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1895:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1895:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1896:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1897:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1898:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__State__IsInitialAssignment_0_14_13794); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_1_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_14_1


    // $ANTLR start rule__State__IsFinalAssignment_0_14_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1913:1: rule__State__IsFinalAssignment_0_14_2 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1917:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1918:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1918:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1919:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1920:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1921:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_2_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__State__IsFinalAssignment_0_14_23838); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_2_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_14_2


    // $ANTLR start rule__State__StateIDAssignment_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1936:1: rule__State__StateIDAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__StateIDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1940:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1941:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1941:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1942:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateIDIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__StateIDAssignment_23877); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateIDIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end rule__State__StateIDAssignment_2


    // $ANTLR start rule__State__StateLabelAssignment_3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1951:1: rule__State__StateLabelAssignment_3 : ( RULE_STRING ) ;
    public final void rule__State__StateLabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1955:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1956:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1956:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1957:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateLabelSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__StateLabelAssignment_33908); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateLabelSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end rule__State__StateLabelAssignment_3


    // $ANTLR start rule__State__StateContentAssignment_4
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1966:1: rule__State__StateContentAssignment_4 : ( ruleStateContent ) ;
    public final void rule__State__StateContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1970:1: ( ( ruleStateContent ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1971:1: ( ruleStateContent )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1971:1: ( ruleStateContent )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1972:1: ruleStateContent
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateContentStateContentParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleStateContent_in_rule__State__StateContentAssignment_43939);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1981:1: rule__StateContent__ExitActionsAssignment_1_0 : ( ruleExitAction ) ;
    public final void rule__StateContent__ExitActionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1985:1: ( ( ruleExitAction ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1986:1: ( ruleExitAction )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1986:1: ( ruleExitAction )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1987:1: ruleExitAction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getExitActionsExitActionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleExitAction_in_rule__StateContent__ExitActionsAssignment_1_03970);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1996:1: rule__StateContent__EntryActionsAssignment_1_1 : ( ruleEntryAction ) ;
    public final void rule__StateContent__EntryActionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2000:1: ( ( ruleEntryAction ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2001:1: ( ruleEntryAction )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2001:1: ( ruleEntryAction )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2002:1: ruleEntryAction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getEntryActionsEntryActionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEntryAction_in_rule__StateContent__EntryActionsAssignment_1_14001);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2011:1: rule__StateContent__InnerActionAssignment_1_2 : ( ruleInnerAction ) ;
    public final void rule__StateContent__InnerActionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2015:1: ( ( ruleInnerAction ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2016:1: ( ruleInnerAction )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2016:1: ( ruleInnerAction )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2017:1: ruleInnerAction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getInnerActionInnerActionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleInnerAction_in_rule__StateContent__InnerActionAssignment_1_24032);
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


    // $ANTLR start rule__InnerAction__InnerAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2026:1: rule__InnerAction__InnerAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InnerAction__InnerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2030:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2031:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2031:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2032:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getInnerSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InnerAction__InnerAssignment_14063); if (failed) return ;
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


    // $ANTLR start rule__EntryAction__EntryActionAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2041:1: rule__EntryAction__EntryActionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EntryAction__EntryActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2045:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2046:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2046:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2047:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getEntryActionSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EntryAction__EntryActionAssignment_14094); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2056:1: rule__ExitAction__ExitAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ExitAction__ExitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2060:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2061:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2061:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2062:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getExitSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExitAction__ExitAssignment_14125); if (failed) return ;
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


 

    public static final BitSet FOLLOW_ruleState_in_entryRuleState66 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateContent_in_entryRuleStateContent126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateContent133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Group__0_in_ruleStateContent160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerAction_in_entryRuleInnerAction186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerAction193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerAction__Group__0_in_ruleInnerAction220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_entryRuleEntryAction246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryAction253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryAction__Group__0_in_ruleEntryAction280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_entryRuleExitAction306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitAction313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExitAction__Group__0_in_ruleExitAction340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Alternatives_in_ruleStateType377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_0_in_rule__State__Alternatives_0412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_1_in_rule__State__Alternatives_0430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_2_in_rule__State__Alternatives_0448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_3__0_in_rule__State__Alternatives_0466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_4__0_in_rule__State__Alternatives_0484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_5__0_in_rule__State__Alternatives_0502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_6__0_in_rule__State__Alternatives_0520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_7__0_in_rule__State__Alternatives_0538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_8__0_in_rule__State__Alternatives_0556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__0_in_rule__State__Alternatives_0574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__0_in_rule__State__Alternatives_0592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__0_in_rule__State__Alternatives_0610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__0_in_rule__State__Alternatives_0628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__0_in_rule__State__Alternatives_0646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__0_in_rule__State__Alternatives_0664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__ExitActionsAssignment_1_0_in_rule__StateContent__Alternatives_1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__EntryActionsAssignment_1_1_in_rule__StateContent__Alternatives_1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__InnerActionAssignment_1_2_in_rule__StateContent__Alternatives_1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__StateType__Alternatives767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StateType__Alternatives788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StateType__Alternatives809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StateType__Alternatives830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Alternatives_0_in_rule__State__Group__0867 = new BitSet(new long[]{0x0000000000018032L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__0877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__State__Group__1907 = new BitSet(new long[]{0x0000000000010032L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateIDAssignment_2_in_rule__State__Group__2947 = new BitSet(new long[]{0x0000000000010022L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateLabelAssignment_3_in_rule__State__Group__3985 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateContentAssignment_4_in_rule__State__Group__41023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_3_0_in_rule__State__Group_0_3__01068 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__State__Group_0_3__1_in_rule__State__Group_0_3__01077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_3_1_in_rule__State__Group_0_3__11105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_4_0_in_rule__State__Group_0_4__01143 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_4__1_in_rule__State__Group_0_4__01152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_4_1_in_rule__State__Group_0_4__11180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_5_0_in_rule__State__Group_0_5__01218 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__State__Group_0_5__1_in_rule__State__Group_0_5__01227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_5_1_in_rule__State__Group_0_5__11255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_6_0_in_rule__State__Group_0_6__01293 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_6__1_in_rule__State__Group_0_6__01302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_6_1_in_rule__State__Group_0_6__11330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_7_0_in_rule__State__Group_0_7__01368 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__State__Group_0_7__1_in_rule__State__Group_0_7__01377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_7_1_in_rule__State__Group_0_7__11405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_8_0_in_rule__State__Group_0_8__01443 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__State__Group_0_8__1_in_rule__State__Group_0_8__01452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_8_1_in_rule__State__Group_0_8__11480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_9_0_in_rule__State__Group_0_9__01518 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__1_in_rule__State__Group_0_9__01527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_9_1_in_rule__State__Group_0_9__11555 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__2_in_rule__State__Group_0_9__11564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_9_2_in_rule__State__Group_0_9__21592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_10_0_in_rule__State__Group_0_10__01632 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__1_in_rule__State__Group_0_10__01641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_10_1_in_rule__State__Group_0_10__11669 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__2_in_rule__State__Group_0_10__11678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_10_2_in_rule__State__Group_0_10__21706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_11_0_in_rule__State__Group_0_11__01746 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__1_in_rule__State__Group_0_11__01755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_11_1_in_rule__State__Group_0_11__11783 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__2_in_rule__State__Group_0_11__11792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_11_2_in_rule__State__Group_0_11__21820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_12_0_in_rule__State__Group_0_12__01860 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__1_in_rule__State__Group_0_12__01869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_12_1_in_rule__State__Group_0_12__11897 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__2_in_rule__State__Group_0_12__11906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_12_2_in_rule__State__Group_0_12__21934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_13_0_in_rule__State__Group_0_13__01974 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__1_in_rule__State__Group_0_13__01983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_13_1_in_rule__State__Group_0_13__12011 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__2_in_rule__State__Group_0_13__12020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_13_2_in_rule__State__Group_0_13__22048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_14_0_in_rule__State__Group_0_14__02088 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__1_in_rule__State__Group_0_14__02097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_14_1_in_rule__State__Group_0_14__12125 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__2_in_rule__State__Group_0_14__12134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_14_2_in_rule__State__Group_0_14__22162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__StateContent__Group__02203 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__StateContent__Group__1_in_rule__StateContent__Group__02213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__12243 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__12255 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__StateContent__Group__2_in_rule__StateContent__Group__12267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StateContent__Group__22296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__InnerAction__Group__02338 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InnerAction__Group__1_in_rule__InnerAction__Group__02348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerAction__InnerAssignment_1_in_rule__InnerAction__Group__12376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EntryAction__Group__02415 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EntryAction__Group__1_in_rule__EntryAction__Group__02425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryAction__EntryActionAssignment_1_in_rule__EntryAction__Group__12453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ExitAction__Group__02492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExitAction__Group__1_in_rule__ExitAction__Group__02502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExitAction__ExitAssignment_1_in_rule__ExitAction__Group__12530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__IsInitialAssignment_0_02573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsFinalAssignment_0_12617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_22656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__IsInitialAssignment_0_3_02692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsFinalAssignment_0_3_12736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__IsInitialAssignment_0_4_02780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_4_12819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsFinalAssignment_0_5_02855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__IsInitialAssignment_0_5_12899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsFinalAssignment_0_6_02943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_6_12982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_7_03013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__IsInitialAssignment_0_7_13049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_8_03088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsFinalAssignment_0_8_13124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__IsInitialAssignment_0_9_03168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsFinalAssignment_0_9_13212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_9_23251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__IsInitialAssignment_0_10_03287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_10_13326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsFinalAssignment_0_10_23362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsFinalAssignment_0_11_03406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__IsInitialAssignment_0_11_13450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_11_23489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsFinalAssignment_0_12_03525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_12_13564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__IsInitialAssignment_0_12_23600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_13_03639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsFinalAssignment_0_13_13675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__IsInitialAssignment_0_13_23719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_14_03758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__IsInitialAssignment_0_14_13794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__IsFinalAssignment_0_14_23838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__StateIDAssignment_23877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__StateLabelAssignment_33908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateContent_in_rule__State__StateContentAssignment_43939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_rule__StateContent__ExitActionsAssignment_1_03970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_rule__StateContent__EntryActionsAssignment_1_14001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerAction_in_rule__StateContent__InnerActionAssignment_1_24032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InnerAction__InnerAssignment_14063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EntryAction__EntryActionAssignment_14094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExitAction__ExitAssignment_14125 = new BitSet(new long[]{0x0000000000000002L});

}