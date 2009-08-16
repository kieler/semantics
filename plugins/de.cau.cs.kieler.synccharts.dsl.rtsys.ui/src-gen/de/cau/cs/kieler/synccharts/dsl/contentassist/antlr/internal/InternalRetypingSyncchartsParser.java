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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NORMAL'", "'cond'", "'reference'", "'textual'", "'NONE'", "'+'", "'*'", "'host'", "'PURE'", "'boolean'", "'unsigned'", "'integer'", "'double'", "'float'", "'state'", "'{'", "'}'", "'['", "']'", "'@'", "','", "'/'", "'onentry'", "'oninner'", "'onexit'", "'suspension'", "':='", "':'", "'combine'", "'with'", "'init'", "'final'", "'tick'", "'local'", "'input'", "'output'"
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
            ruleMemo = new HashMap[225+1];
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


    // $ANTLR start entryRuleSignalRenaming
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:115:1: entryRuleSignalRenaming : ruleSignalRenaming EOF ;
    public final void entryRuleSignalRenaming() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:115:25: ( ruleSignalRenaming EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:116:1: ruleSignalRenaming EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalRenamingRule()); 
            }
            pushFollow(FOLLOW_ruleSignalRenaming_in_entryRuleSignalRenaming186);
            ruleSignalRenaming();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalRenamingRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalRenaming193); if (failed) return ;

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
    // $ANTLR end entryRuleSignalRenaming


    // $ANTLR start ruleSignalRenaming
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:123:1: ruleSignalRenaming : ( ( rule__SignalRenaming__Group__0 ) ) ;
    public final void ruleSignalRenaming() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:127:2: ( ( ( rule__SignalRenaming__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:128:1: ( ( rule__SignalRenaming__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:128:1: ( ( rule__SignalRenaming__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:129:1: ( rule__SignalRenaming__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalRenamingAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:130:1: ( rule__SignalRenaming__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:130:2: rule__SignalRenaming__Group__0
            {
            pushFollow(FOLLOW_rule__SignalRenaming__Group__0_in_ruleSignalRenaming220);
            rule__SignalRenaming__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalRenamingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSignalRenaming


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


    // $ANTLR start entryRuleInnerAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:169:1: entryRuleInnerAction : ruleInnerAction EOF ;
    public final void entryRuleInnerAction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:169:22: ( ruleInnerAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:170:1: ruleInnerAction EOF
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:177:1: ruleInnerAction : ( ( rule__InnerAction__Group__0 ) ) ;
    public final void ruleInnerAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:181:2: ( ( ( rule__InnerAction__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:182:1: ( ( rule__InnerAction__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:182:1: ( ( rule__InnerAction__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:183:1: ( rule__InnerAction__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:184:1: ( rule__InnerAction__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:184:2: rule__InnerAction__Group__0
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


    // $ANTLR start entryRuleExitAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:196:1: entryRuleExitAction : ruleExitAction EOF ;
    public final void entryRuleExitAction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:196:21: ( ruleExitAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:197:1: ruleExitAction EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionRule()); 
            }
            pushFollow(FOLLOW_ruleExitAction_in_entryRuleExitAction366);
            ruleExitAction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitAction373); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:204:1: ruleExitAction : ( ( rule__ExitAction__Group__0 ) ) ;
    public final void ruleExitAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:208:2: ( ( ( rule__ExitAction__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:209:1: ( ( rule__ExitAction__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:209:1: ( ( rule__ExitAction__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:210:1: ( rule__ExitAction__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:211:1: ( rule__ExitAction__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:211:2: rule__ExitAction__Group__0
            {
            pushFollow(FOLLOW_rule__ExitAction__Group__0_in_ruleExitAction400);
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


    // $ANTLR start entryRuleSuspension
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:223:1: entryRuleSuspension : ruleSuspension EOF ;
    public final void entryRuleSuspension() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:223:21: ( ruleSuspension EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:224:1: ruleSuspension EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSuspensionRule()); 
            }
            pushFollow(FOLLOW_ruleSuspension_in_entryRuleSuspension426);
            ruleSuspension();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSuspensionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspension433); if (failed) return ;

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
    // $ANTLR end entryRuleSuspension


    // $ANTLR start ruleSuspension
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:231:1: ruleSuspension : ( ( rule__Suspension__Group__0 ) ) ;
    public final void ruleSuspension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:235:2: ( ( ( rule__Suspension__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:236:1: ( ( rule__Suspension__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:236:1: ( ( rule__Suspension__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:237:1: ( rule__Suspension__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSuspensionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:238:1: ( rule__Suspension__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:238:2: rule__Suspension__Group__0
            {
            pushFollow(FOLLOW_rule__Suspension__Group__0_in_ruleSuspension460);
            rule__Suspension__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSuspensionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSuspension


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:252:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:252:17: ( ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:253:1: ruleSignal EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalRule()); 
            }
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal488);
            ruleSignal();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal495); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:260:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:264:2: ( ( ( rule__Signal__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:265:1: ( ( rule__Signal__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:265:1: ( ( rule__Signal__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:266:1: ( rule__Signal__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:267:1: ( rule__Signal__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:267:2: rule__Signal__Alternatives
            {
            pushFollow(FOLLOW_rule__Signal__Alternatives_in_ruleSignal522);
            rule__Signal__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start entryRulePredefinedSignal
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:279:1: entryRulePredefinedSignal : rulePredefinedSignal EOF ;
    public final void entryRulePredefinedSignal() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:279:27: ( rulePredefinedSignal EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:280:1: rulePredefinedSignal EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPredefinedSignalRule()); 
            }
            pushFollow(FOLLOW_rulePredefinedSignal_in_entryRulePredefinedSignal548);
            rulePredefinedSignal();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPredefinedSignalRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredefinedSignal555); if (failed) return ;

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
    // $ANTLR end entryRulePredefinedSignal


    // $ANTLR start rulePredefinedSignal
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:287:1: rulePredefinedSignal : ( ( rule__PredefinedSignal__NameAssignment ) ) ;
    public final void rulePredefinedSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:291:2: ( ( ( rule__PredefinedSignal__NameAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:292:1: ( ( rule__PredefinedSignal__NameAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:292:1: ( ( rule__PredefinedSignal__NameAssignment ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:293:1: ( rule__PredefinedSignal__NameAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPredefinedSignalAccess().getNameAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:294:1: ( rule__PredefinedSignal__NameAssignment )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:294:2: rule__PredefinedSignal__NameAssignment
            {
            pushFollow(FOLLOW_rule__PredefinedSignal__NameAssignment_in_rulePredefinedSignal582);
            rule__PredefinedSignal__NameAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPredefinedSignalAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePredefinedSignal


    // $ANTLR start entryRuleUserDefinedSignal
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:306:1: entryRuleUserDefinedSignal : ruleUserDefinedSignal EOF ;
    public final void entryRuleUserDefinedSignal() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:306:28: ( ruleUserDefinedSignal EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:307:1: ruleUserDefinedSignal EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalRule()); 
            }
            pushFollow(FOLLOW_ruleUserDefinedSignal_in_entryRuleUserDefinedSignal608);
            ruleUserDefinedSignal();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserDefinedSignal615); if (failed) return ;

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
    // $ANTLR end entryRuleUserDefinedSignal


    // $ANTLR start ruleUserDefinedSignal
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:314:1: ruleUserDefinedSignal : ( ( rule__UserDefinedSignal__Group__0 ) ) ;
    public final void ruleUserDefinedSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:318:2: ( ( ( rule__UserDefinedSignal__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:319:1: ( ( rule__UserDefinedSignal__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:319:1: ( ( rule__UserDefinedSignal__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:320:1: ( rule__UserDefinedSignal__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:321:1: ( rule__UserDefinedSignal__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:321:2: rule__UserDefinedSignal__Group__0
            {
            pushFollow(FOLLOW_rule__UserDefinedSignal__Group__0_in_ruleUserDefinedSignal642);
            rule__UserDefinedSignal__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUserDefinedSignal


    // $ANTLR start entryRuleVariable
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:333:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:333:19: ( ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:334:1: ruleVariable EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable668);
            ruleVariable();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable675); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:341:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:345:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:346:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:346:1: ( ( rule__Variable__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:347:1: ( rule__Variable__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:348:1: ( rule__Variable__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:348:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable702);
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


    // $ANTLR start ruleStateType
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:361:1: ruleStateType : ( ( rule__StateType__Alternatives ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:365:1: ( ( ( rule__StateType__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:366:1: ( ( rule__StateType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:366:1: ( ( rule__StateType__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:367:1: ( rule__StateType__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateTypeAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:368:1: ( rule__StateType__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:368:2: rule__StateType__Alternatives
            {
            pushFollow(FOLLOW_rule__StateType__Alternatives_in_ruleStateType739);
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


    // $ANTLR start ruleCombineOperator
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:380:1: ruleCombineOperator : ( ( rule__CombineOperator__Alternatives ) ) ;
    public final void ruleCombineOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:384:1: ( ( ( rule__CombineOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:385:1: ( ( rule__CombineOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:385:1: ( ( rule__CombineOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:386:1: ( rule__CombineOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCombineOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:387:1: ( rule__CombineOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:387:2: rule__CombineOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CombineOperator__Alternatives_in_ruleCombineOperator775);
            rule__CombineOperator__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCombineOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCombineOperator


    // $ANTLR start ruleValueType
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:399:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:403:1: ( ( ( rule__ValueType__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:404:1: ( ( rule__ValueType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:404:1: ( ( rule__ValueType__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:405:1: ( rule__ValueType__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:406:1: ( rule__ValueType__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:406:2: rule__ValueType__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueType__Alternatives_in_ruleValueType811);
            rule__ValueType__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValueTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleValueType


    // $ANTLR start rule__State__Alternatives_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );
    public final void rule__State__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:421:1: ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) )
            int alt1=15;
            switch ( input.LA(1) ) {
            case 41:
                {
                switch ( input.LA(2) ) {
                case 11:
                    {
                    int LA1_7 = input.LA(3);

                    if ( (LA1_7==42) ) {
                        alt1=11;
                    }
                    else if ( (LA1_7==EOF||(LA1_7>=RULE_ID && LA1_7<=RULE_STRING)||(LA1_7>=25 && LA1_7<=26)) ) {
                        alt1=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA1_8 = input.LA(3);

                    if ( (LA1_8==42) ) {
                        alt1=11;
                    }
                    else if ( (LA1_8==EOF||(LA1_8>=RULE_ID && LA1_8<=RULE_STRING)||(LA1_8>=25 && LA1_8<=26)) ) {
                        alt1=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA1_9 = input.LA(3);

                    if ( (LA1_9==EOF||(LA1_9>=RULE_ID && LA1_9<=RULE_STRING)||(LA1_9>=25 && LA1_9<=26)) ) {
                        alt1=5;
                    }
                    else if ( (LA1_9==42) ) {
                        alt1=11;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_10 = input.LA(3);

                    if ( (LA1_10==42) ) {
                        alt1=11;
                    }
                    else if ( (LA1_10==EOF||(LA1_10>=RULE_ID && LA1_10<=RULE_STRING)||(LA1_10>=25 && LA1_10<=26)) ) {
                        alt1=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 25:
                case 26:
                    {
                    alt1=1;
                    }
                    break;
                case 42:
                    {
                    int LA1_12 = input.LA(3);

                    if ( ((LA1_12>=11 && LA1_12<=14)) ) {
                        alt1=10;
                    }
                    else if ( (LA1_12==EOF||(LA1_12>=RULE_ID && LA1_12<=RULE_STRING)||(LA1_12>=25 && LA1_12<=26)) ) {
                        alt1=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 12, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 42:
                {
                switch ( input.LA(2) ) {
                case 11:
                    {
                    int LA1_13 = input.LA(3);

                    if ( (LA1_13==EOF||(LA1_13>=RULE_ID && LA1_13<=RULE_STRING)||(LA1_13>=25 && LA1_13<=26)) ) {
                        alt1=7;
                    }
                    else if ( (LA1_13==41) ) {
                        alt1=13;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA1_14 = input.LA(3);

                    if ( (LA1_14==41) ) {
                        alt1=13;
                    }
                    else if ( (LA1_14==EOF||(LA1_14>=RULE_ID && LA1_14<=RULE_STRING)||(LA1_14>=25 && LA1_14<=26)) ) {
                        alt1=7;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA1_15 = input.LA(3);

                    if ( (LA1_15==EOF||(LA1_15>=RULE_ID && LA1_15<=RULE_STRING)||(LA1_15>=25 && LA1_15<=26)) ) {
                        alt1=7;
                    }
                    else if ( (LA1_15==41) ) {
                        alt1=13;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_16 = input.LA(3);

                    if ( (LA1_16==EOF||(LA1_16>=RULE_ID && LA1_16<=RULE_STRING)||(LA1_16>=25 && LA1_16<=26)) ) {
                        alt1=7;
                    }
                    else if ( (LA1_16==41) ) {
                        alt1=13;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 41:
                    {
                    int LA1_17 = input.LA(3);

                    if ( ((LA1_17>=11 && LA1_17<=14)) ) {
                        alt1=12;
                    }
                    else if ( (LA1_17==EOF||(LA1_17>=RULE_ID && LA1_17<=RULE_STRING)||(LA1_17>=25 && LA1_17<=26)) ) {
                        alt1=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 25:
                case 26:
                    {
                    alt1=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 2, input);

                    throw nvae;
                }

                }
                break;
            case 11:
                {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==42) ) {
                        alt1=15;
                    }
                    else if ( (LA1_19==EOF||(LA1_19>=RULE_ID && LA1_19<=RULE_STRING)||(LA1_19>=25 && LA1_19<=26)) ) {
                        alt1=8;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 42:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||(LA1_20>=25 && LA1_20<=26)) ) {
                        alt1=9;
                    }
                    else if ( (LA1_20==41) ) {
                        alt1=14;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 25:
                case 26:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 3, input);

                    throw nvae;
                }

                }
                break;
            case 12:
                {
                switch ( input.LA(2) ) {
                case 42:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||(LA1_20>=25 && LA1_20<=26)) ) {
                        alt1=9;
                    }
                    else if ( (LA1_20==41) ) {
                        alt1=14;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case 41:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==42) ) {
                        alt1=15;
                    }
                    else if ( (LA1_19==EOF||(LA1_19>=RULE_ID && LA1_19<=RULE_STRING)||(LA1_19>=25 && LA1_19<=26)) ) {
                        alt1=8;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 25:
                case 26:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 4, input);

                    throw nvae;
                }

                }
                break;
            case 13:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 25:
                case 26:
                    {
                    alt1=3;
                    }
                    break;
                case 41:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==42) ) {
                        alt1=15;
                    }
                    else if ( (LA1_19==EOF||(LA1_19>=RULE_ID && LA1_19<=RULE_STRING)||(LA1_19>=25 && LA1_19<=26)) ) {
                        alt1=8;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 42:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||(LA1_20>=25 && LA1_20<=26)) ) {
                        alt1=9;
                    }
                    else if ( (LA1_20==41) ) {
                        alt1=14;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 5, input);

                    throw nvae;
                }

                }
                break;
            case 14:
                {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==42) ) {
                        alt1=15;
                    }
                    else if ( (LA1_19==EOF||(LA1_19>=RULE_ID && LA1_19<=RULE_STRING)||(LA1_19>=25 && LA1_19<=26)) ) {
                        alt1=8;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 42:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||(LA1_20>=25 && LA1_20<=26)) ) {
                        alt1=9;
                    }
                    else if ( (LA1_20==41) ) {
                        alt1=14;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 25:
                case 26:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 6, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("417:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:422:1: ( ( rule__State__IsInitialAssignment_0_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:422:1: ( ( rule__State__IsInitialAssignment_0_0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:423:1: ( rule__State__IsInitialAssignment_0_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getIsInitialAssignment_0_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:424:1: ( rule__State__IsInitialAssignment_0_0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:424:2: rule__State__IsInitialAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_0_in_rule__State__Alternatives_0846);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:428:6: ( ( rule__State__IsFinalAssignment_0_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:428:6: ( ( rule__State__IsFinalAssignment_0_1 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:429:1: ( rule__State__IsFinalAssignment_0_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getIsFinalAssignment_0_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:430:1: ( rule__State__IsFinalAssignment_0_1 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:430:2: rule__State__IsFinalAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_1_in_rule__State__Alternatives_0864);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:434:6: ( ( rule__State__StateKindAssignment_0_2 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:434:6: ( ( rule__State__StateKindAssignment_0_2 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:435:1: ( rule__State__StateKindAssignment_0_2 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getStateKindAssignment_0_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:436:1: ( rule__State__StateKindAssignment_0_2 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:436:2: rule__State__StateKindAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__State__StateKindAssignment_0_2_in_rule__State__Alternatives_0882);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:440:6: ( ( rule__State__Group_0_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:440:6: ( ( rule__State__Group_0_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:441:1: ( rule__State__Group_0_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:442:1: ( rule__State__Group_0_3__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:442:2: rule__State__Group_0_3__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_3__0_in_rule__State__Alternatives_0900);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:446:6: ( ( rule__State__Group_0_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:446:6: ( ( rule__State__Group_0_4__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:447:1: ( rule__State__Group_0_4__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:448:1: ( rule__State__Group_0_4__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:448:2: rule__State__Group_0_4__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_4__0_in_rule__State__Alternatives_0918);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:452:6: ( ( rule__State__Group_0_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:452:6: ( ( rule__State__Group_0_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:453:1: ( rule__State__Group_0_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:454:1: ( rule__State__Group_0_5__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:454:2: rule__State__Group_0_5__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_5__0_in_rule__State__Alternatives_0936);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:458:6: ( ( rule__State__Group_0_6__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:458:6: ( ( rule__State__Group_0_6__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:459:1: ( rule__State__Group_0_6__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_6()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:460:1: ( rule__State__Group_0_6__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:460:2: rule__State__Group_0_6__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_6__0_in_rule__State__Alternatives_0954);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:464:6: ( ( rule__State__Group_0_7__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:464:6: ( ( rule__State__Group_0_7__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:465:1: ( rule__State__Group_0_7__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_7()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:466:1: ( rule__State__Group_0_7__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:466:2: rule__State__Group_0_7__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_7__0_in_rule__State__Alternatives_0972);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:470:6: ( ( rule__State__Group_0_8__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:470:6: ( ( rule__State__Group_0_8__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:471:1: ( rule__State__Group_0_8__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_8()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:472:1: ( rule__State__Group_0_8__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:472:2: rule__State__Group_0_8__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_8__0_in_rule__State__Alternatives_0990);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:476:6: ( ( rule__State__Group_0_9__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:476:6: ( ( rule__State__Group_0_9__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:477:1: ( rule__State__Group_0_9__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_9()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:478:1: ( rule__State__Group_0_9__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:478:2: rule__State__Group_0_9__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_9__0_in_rule__State__Alternatives_01008);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:482:6: ( ( rule__State__Group_0_10__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:482:6: ( ( rule__State__Group_0_10__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:483:1: ( rule__State__Group_0_10__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_10()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:484:1: ( rule__State__Group_0_10__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:484:2: rule__State__Group_0_10__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_10__0_in_rule__State__Alternatives_01026);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:488:6: ( ( rule__State__Group_0_11__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:488:6: ( ( rule__State__Group_0_11__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:489:1: ( rule__State__Group_0_11__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_11()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:490:1: ( rule__State__Group_0_11__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:490:2: rule__State__Group_0_11__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_11__0_in_rule__State__Alternatives_01044);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:494:6: ( ( rule__State__Group_0_12__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:494:6: ( ( rule__State__Group_0_12__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:495:1: ( rule__State__Group_0_12__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_12()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:496:1: ( rule__State__Group_0_12__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:496:2: rule__State__Group_0_12__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_12__0_in_rule__State__Alternatives_01062);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:500:6: ( ( rule__State__Group_0_13__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:500:6: ( ( rule__State__Group_0_13__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:501:1: ( rule__State__Group_0_13__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_13()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:502:1: ( rule__State__Group_0_13__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:502:2: rule__State__Group_0_13__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_13__0_in_rule__State__Alternatives_01080);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:506:6: ( ( rule__State__Group_0_14__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:506:6: ( ( rule__State__Group_0_14__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:507:1: ( rule__State__Group_0_14__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_14()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:508:1: ( rule__State__Group_0_14__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:508:2: rule__State__Group_0_14__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_14__0_in_rule__State__Alternatives_01098);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:517:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__EntryActionsAssignment_1_0 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_1 ) ) | ( ( rule__StateContent__ExitActionsAssignment_1_2 ) ) | ( ( rule__StateContent__SuspensionTriggerAssignment_1_3 ) ) | ( ( rule__StateContent__SignalsAssignment_1_4 )? ) );
    public final void rule__StateContent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:521:1: ( ( ( rule__StateContent__EntryActionsAssignment_1_0 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_1 ) ) | ( ( rule__StateContent__ExitActionsAssignment_1_2 ) ) | ( ( rule__StateContent__SuspensionTriggerAssignment_1_3 ) ) | ( ( rule__StateContent__SignalsAssignment_1_4 )? ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                int LA3_1 = input.LA(2);

                if ( (synpred15()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("517:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__EntryActionsAssignment_1_0 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_1 ) ) | ( ( rule__StateContent__ExitActionsAssignment_1_2 ) ) | ( ( rule__StateContent__SuspensionTriggerAssignment_1_3 ) ) | ( ( rule__StateContent__SignalsAssignment_1_4 )? ) );", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA3_2 = input.LA(2);

                if ( (synpred16()) ) {
                    alt3=2;
                }
                else if ( (true) ) {
                    alt3=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("517:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__EntryActionsAssignment_1_0 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_1 ) ) | ( ( rule__StateContent__ExitActionsAssignment_1_2 ) ) | ( ( rule__StateContent__SuspensionTriggerAssignment_1_3 ) ) | ( ( rule__StateContent__SignalsAssignment_1_4 )? ) );", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA3_3 = input.LA(2);

                if ( (synpred17()) ) {
                    alt3=3;
                }
                else if ( (true) ) {
                    alt3=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("517:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__EntryActionsAssignment_1_0 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_1 ) ) | ( ( rule__StateContent__ExitActionsAssignment_1_2 ) ) | ( ( rule__StateContent__SuspensionTriggerAssignment_1_3 ) ) | ( ( rule__StateContent__SignalsAssignment_1_4 )? ) );", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                int LA3_4 = input.LA(2);

                if ( (synpred18()) ) {
                    alt3=4;
                }
                else if ( (true) ) {
                    alt3=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("517:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__EntryActionsAssignment_1_0 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_1 ) ) | ( ( rule__StateContent__ExitActionsAssignment_1_2 ) ) | ( ( rule__StateContent__SuspensionTriggerAssignment_1_3 ) ) | ( ( rule__StateContent__SignalsAssignment_1_4 )? ) );", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case RULE_ID:
            case 27:
            case 43:
            case 44:
                {
                alt3=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("517:1: rule__StateContent__Alternatives_1 : ( ( ( rule__StateContent__EntryActionsAssignment_1_0 ) ) | ( ( rule__StateContent__InnerActionAssignment_1_1 ) ) | ( ( rule__StateContent__ExitActionsAssignment_1_2 ) ) | ( ( rule__StateContent__SuspensionTriggerAssignment_1_3 ) ) | ( ( rule__StateContent__SignalsAssignment_1_4 )? ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:522:1: ( ( rule__StateContent__EntryActionsAssignment_1_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:522:1: ( ( rule__StateContent__EntryActionsAssignment_1_0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:523:1: ( rule__StateContent__EntryActionsAssignment_1_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getEntryActionsAssignment_1_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:524:1: ( rule__StateContent__EntryActionsAssignment_1_0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:524:2: rule__StateContent__EntryActionsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__StateContent__EntryActionsAssignment_1_0_in_rule__StateContent__Alternatives_11131);
                    rule__StateContent__EntryActionsAssignment_1_0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateContentAccess().getEntryActionsAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:528:6: ( ( rule__StateContent__InnerActionAssignment_1_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:528:6: ( ( rule__StateContent__InnerActionAssignment_1_1 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:529:1: ( rule__StateContent__InnerActionAssignment_1_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getInnerActionAssignment_1_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:530:1: ( rule__StateContent__InnerActionAssignment_1_1 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:530:2: rule__StateContent__InnerActionAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__StateContent__InnerActionAssignment_1_1_in_rule__StateContent__Alternatives_11149);
                    rule__StateContent__InnerActionAssignment_1_1();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateContentAccess().getInnerActionAssignment_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:534:6: ( ( rule__StateContent__ExitActionsAssignment_1_2 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:534:6: ( ( rule__StateContent__ExitActionsAssignment_1_2 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:535:1: ( rule__StateContent__ExitActionsAssignment_1_2 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getExitActionsAssignment_1_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:536:1: ( rule__StateContent__ExitActionsAssignment_1_2 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:536:2: rule__StateContent__ExitActionsAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__StateContent__ExitActionsAssignment_1_2_in_rule__StateContent__Alternatives_11167);
                    rule__StateContent__ExitActionsAssignment_1_2();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateContentAccess().getExitActionsAssignment_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:540:6: ( ( rule__StateContent__SuspensionTriggerAssignment_1_3 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:540:6: ( ( rule__StateContent__SuspensionTriggerAssignment_1_3 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:541:1: ( rule__StateContent__SuspensionTriggerAssignment_1_3 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getSuspensionTriggerAssignment_1_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:542:1: ( rule__StateContent__SuspensionTriggerAssignment_1_3 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:542:2: rule__StateContent__SuspensionTriggerAssignment_1_3
                    {
                    pushFollow(FOLLOW_rule__StateContent__SuspensionTriggerAssignment_1_3_in_rule__StateContent__Alternatives_11185);
                    rule__StateContent__SuspensionTriggerAssignment_1_3();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateContentAccess().getSuspensionTriggerAssignment_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:546:6: ( ( rule__StateContent__SignalsAssignment_1_4 )? )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:546:6: ( ( rule__StateContent__SignalsAssignment_1_4 )? )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:547:1: ( rule__StateContent__SignalsAssignment_1_4 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateContentAccess().getSignalsAssignment_1_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:548:1: ( rule__StateContent__SignalsAssignment_1_4 )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==43) ) {
                        int LA2_1 = input.LA(2);

                        if ( (synpred19()) ) {
                            alt2=1;
                        }
                    }
                    else if ( (LA2_0==44) ) {
                        int LA2_2 = input.LA(2);

                        if ( (synpred19()) ) {
                            alt2=1;
                        }
                    }
                    switch (alt2) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:548:2: rule__StateContent__SignalsAssignment_1_4
                            {
                            pushFollow(FOLLOW_rule__StateContent__SignalsAssignment_1_4_in_rule__StateContent__Alternatives_11203);
                            rule__StateContent__SignalsAssignment_1_4();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateContentAccess().getSignalsAssignment_1_4()); 
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


    // $ANTLR start rule__Signal__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:558:1: rule__Signal__Alternatives : ( ( rulePredefinedSignal ) | ( ruleUserDefinedSignal ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:562:1: ( ( rulePredefinedSignal ) | ( ruleUserDefinedSignal ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==43) ) {
                alt4=1;
            }
            else if ( (LA4_0==44) ) {
                alt4=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("558:1: rule__Signal__Alternatives : ( ( rulePredefinedSignal ) | ( ruleUserDefinedSignal ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:563:1: ( rulePredefinedSignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:563:1: ( rulePredefinedSignal )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:564:1: rulePredefinedSignal
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSignalAccess().getPredefinedSignalParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePredefinedSignal_in_rule__Signal__Alternatives1238);
                    rulePredefinedSignal();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSignalAccess().getPredefinedSignalParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:569:6: ( ruleUserDefinedSignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:569:6: ( ruleUserDefinedSignal )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:570:1: ruleUserDefinedSignal
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSignalAccess().getUserDefinedSignalParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleUserDefinedSignal_in_rule__Signal__Alternatives1255);
                    ruleUserDefinedSignal();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSignalAccess().getUserDefinedSignalParserRuleCall_1()); 
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
    // $ANTLR end rule__Signal__Alternatives


    // $ANTLR start rule__StateType__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:580:1: rule__StateType__Alternatives : ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) );
    public final void rule__StateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:584:1: ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("580:1: rule__StateType__Alternatives : ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:585:1: ( ( 'NORMAL' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:585:1: ( ( 'NORMAL' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:586:1: ( 'NORMAL' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:587:1: ( 'NORMAL' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:587:3: 'NORMAL'
                    {
                    match(input,11,FOLLOW_11_in_rule__StateType__Alternatives1288); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:592:6: ( ( 'cond' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:592:6: ( ( 'cond' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:593:1: ( 'cond' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:594:1: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:594:3: 'cond'
                    {
                    match(input,12,FOLLOW_12_in_rule__StateType__Alternatives1309); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:599:6: ( ( 'reference' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:599:6: ( ( 'reference' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:600:1: ( 'reference' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:601:1: ( 'reference' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:601:3: 'reference'
                    {
                    match(input,13,FOLLOW_13_in_rule__StateType__Alternatives1330); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:606:6: ( ( 'textual' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:606:6: ( ( 'textual' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:607:1: ( 'textual' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:608:1: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:608:3: 'textual'
                    {
                    match(input,14,FOLLOW_14_in_rule__StateType__Alternatives1351); if (failed) return ;

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


    // $ANTLR start rule__CombineOperator__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:618:1: rule__CombineOperator__Alternatives : ( ( ( 'NONE' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'host' ) ) );
    public final void rule__CombineOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:622:1: ( ( ( 'NONE' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'host' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("618:1: rule__CombineOperator__Alternatives : ( ( ( 'NONE' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'host' ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:623:1: ( ( 'NONE' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:623:1: ( ( 'NONE' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:624:1: ( 'NONE' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:625:1: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:625:3: 'NONE'
                    {
                    match(input,15,FOLLOW_15_in_rule__CombineOperator__Alternatives1387); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:630:6: ( ( '+' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:630:6: ( ( '+' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:631:1: ( '+' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:632:1: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:632:3: '+'
                    {
                    match(input,16,FOLLOW_16_in_rule__CombineOperator__Alternatives1408); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:637:6: ( ( '*' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:637:6: ( ( '*' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:638:1: ( '*' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:639:1: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:639:3: '*'
                    {
                    match(input,17,FOLLOW_17_in_rule__CombineOperator__Alternatives1429); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:644:6: ( ( 'host' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:644:6: ( ( 'host' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:645:1: ( 'host' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:646:1: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:646:3: 'host'
                    {
                    match(input,18,FOLLOW_18_in_rule__CombineOperator__Alternatives1450); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_3()); 
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
    // $ANTLR end rule__CombineOperator__Alternatives


    // $ANTLR start rule__ValueType__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:656:1: rule__ValueType__Alternatives : ( ( ( 'PURE' ) ) | ( ( 'boolean' ) ) | ( ( 'unsigned' ) ) | ( ( 'integer' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'host' ) ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:660:1: ( ( ( 'PURE' ) ) | ( ( 'boolean' ) ) | ( ( 'unsigned' ) ) | ( ( 'integer' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'host' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            case 23:
                {
                alt7=5;
                }
                break;
            case 24:
                {
                alt7=6;
                }
                break;
            case 18:
                {
                alt7=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("656:1: rule__ValueType__Alternatives : ( ( ( 'PURE' ) ) | ( ( 'boolean' ) ) | ( ( 'unsigned' ) ) | ( ( 'integer' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'host' ) ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:661:1: ( ( 'PURE' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:661:1: ( ( 'PURE' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:662:1: ( 'PURE' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:663:1: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:663:3: 'PURE'
                    {
                    match(input,19,FOLLOW_19_in_rule__ValueType__Alternatives1486); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:668:6: ( ( 'boolean' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:668:6: ( ( 'boolean' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:669:1: ( 'boolean' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:670:1: ( 'boolean' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:670:3: 'boolean'
                    {
                    match(input,20,FOLLOW_20_in_rule__ValueType__Alternatives1507); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:675:6: ( ( 'unsigned' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:675:6: ( ( 'unsigned' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:676:1: ( 'unsigned' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:677:1: ( 'unsigned' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:677:3: 'unsigned'
                    {
                    match(input,21,FOLLOW_21_in_rule__ValueType__Alternatives1528); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:682:6: ( ( 'integer' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:682:6: ( ( 'integer' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:683:1: ( 'integer' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:684:1: ( 'integer' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:684:3: 'integer'
                    {
                    match(input,22,FOLLOW_22_in_rule__ValueType__Alternatives1549); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:689:6: ( ( 'double' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:689:6: ( ( 'double' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:690:1: ( 'double' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:691:1: ( 'double' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:691:3: 'double'
                    {
                    match(input,23,FOLLOW_23_in_rule__ValueType__Alternatives1570); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:696:6: ( ( 'float' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:696:6: ( ( 'float' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:697:1: ( 'float' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:698:1: ( 'float' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:698:3: 'float'
                    {
                    match(input,24,FOLLOW_24_in_rule__ValueType__Alternatives1591); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:703:6: ( ( 'host' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:703:6: ( ( 'host' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:704:1: ( 'host' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_6()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:705:1: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:705:3: 'host'
                    {
                    match(input,18,FOLLOW_18_in_rule__ValueType__Alternatives1612); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_6()); 
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
    // $ANTLR end rule__ValueType__Alternatives


    // $ANTLR start rule__State__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:717:1: rule__State__Group__0 : ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:721:1: ( ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:722:1: ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:722:1: ( ( rule__State__Alternatives_0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:723:1: ( rule__State__Alternatives_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:724:1: ( rule__State__Alternatives_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=14)||(LA8_0>=41 && LA8_0<=42)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:724:2: rule__State__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__State__Alternatives_0_in_rule__State__Group__01649);
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

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__01659);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:735:1: rule__State__Group__1 : ( ( 'state' )? ) rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:739:1: ( ( ( 'state' )? ) rule__State__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:740:1: ( ( 'state' )? ) rule__State__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:740:1: ( ( 'state' )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:741:1: ( 'state' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:742:1: ( 'state' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:743:2: 'state'
                    {
                    match(input,25,FOLLOW_25_in_rule__State__Group__11689); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__11701);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:755:1: rule__State__Group__2 : ( ( rule__State__Group_2__0 ) ) ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:759:1: ( ( ( rule__State__Group_2__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:760:1: ( ( rule__State__Group_2__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:760:1: ( ( rule__State__Group_2__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:761:1: ( rule__State__Group_2__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:762:1: ( rule__State__Group_2__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:762:2: rule__State__Group_2__0
            {
            pushFollow(FOLLOW_rule__State__Group_2__0_in_rule__State__Group__21729);
            rule__State__Group_2__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getGroup_2()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__State__Group_0_3__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:778:1: rule__State__Group_0_3__0 : ( ( rule__State__IsInitialAssignment_0_3_0 ) ) rule__State__Group_0_3__1 ;
    public final void rule__State__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:782:1: ( ( ( rule__State__IsInitialAssignment_0_3_0 ) ) rule__State__Group_0_3__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:783:1: ( ( rule__State__IsInitialAssignment_0_3_0 ) ) rule__State__Group_0_3__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:783:1: ( ( rule__State__IsInitialAssignment_0_3_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:784:1: ( rule__State__IsInitialAssignment_0_3_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_3_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:785:1: ( rule__State__IsInitialAssignment_0_3_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:785:2: rule__State__IsInitialAssignment_0_3_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_3_0_in_rule__State__Group_0_3__01769);
            rule__State__IsInitialAssignment_0_3_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_3_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_3__1_in_rule__State__Group_0_3__01778);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:796:1: rule__State__Group_0_3__1 : ( ( rule__State__IsFinalAssignment_0_3_1 ) ) ;
    public final void rule__State__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:800:1: ( ( ( rule__State__IsFinalAssignment_0_3_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:801:1: ( ( rule__State__IsFinalAssignment_0_3_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:801:1: ( ( rule__State__IsFinalAssignment_0_3_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:802:1: ( rule__State__IsFinalAssignment_0_3_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_3_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:803:1: ( rule__State__IsFinalAssignment_0_3_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:803:2: rule__State__IsFinalAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_3_1_in_rule__State__Group_0_3__11806);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:817:1: rule__State__Group_0_4__0 : ( ( rule__State__IsInitialAssignment_0_4_0 ) ) rule__State__Group_0_4__1 ;
    public final void rule__State__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:821:1: ( ( ( rule__State__IsInitialAssignment_0_4_0 ) ) rule__State__Group_0_4__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:822:1: ( ( rule__State__IsInitialAssignment_0_4_0 ) ) rule__State__Group_0_4__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:822:1: ( ( rule__State__IsInitialAssignment_0_4_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:823:1: ( rule__State__IsInitialAssignment_0_4_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_4_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:824:1: ( rule__State__IsInitialAssignment_0_4_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:824:2: rule__State__IsInitialAssignment_0_4_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_4_0_in_rule__State__Group_0_4__01844);
            rule__State__IsInitialAssignment_0_4_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_4_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_4__1_in_rule__State__Group_0_4__01853);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:835:1: rule__State__Group_0_4__1 : ( ( rule__State__StateKindAssignment_0_4_1 ) ) ;
    public final void rule__State__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:839:1: ( ( ( rule__State__StateKindAssignment_0_4_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:840:1: ( ( rule__State__StateKindAssignment_0_4_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:840:1: ( ( rule__State__StateKindAssignment_0_4_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:841:1: ( rule__State__StateKindAssignment_0_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_4_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:842:1: ( rule__State__StateKindAssignment_0_4_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:842:2: rule__State__StateKindAssignment_0_4_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_4_1_in_rule__State__Group_0_4__11881);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:856:1: rule__State__Group_0_5__0 : ( ( rule__State__IsFinalAssignment_0_5_0 ) ) rule__State__Group_0_5__1 ;
    public final void rule__State__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:860:1: ( ( ( rule__State__IsFinalAssignment_0_5_0 ) ) rule__State__Group_0_5__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:861:1: ( ( rule__State__IsFinalAssignment_0_5_0 ) ) rule__State__Group_0_5__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:861:1: ( ( rule__State__IsFinalAssignment_0_5_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:862:1: ( rule__State__IsFinalAssignment_0_5_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_5_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:863:1: ( rule__State__IsFinalAssignment_0_5_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:863:2: rule__State__IsFinalAssignment_0_5_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_5_0_in_rule__State__Group_0_5__01919);
            rule__State__IsFinalAssignment_0_5_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_5_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_5__1_in_rule__State__Group_0_5__01928);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:874:1: rule__State__Group_0_5__1 : ( ( rule__State__IsInitialAssignment_0_5_1 ) ) ;
    public final void rule__State__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:878:1: ( ( ( rule__State__IsInitialAssignment_0_5_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:879:1: ( ( rule__State__IsInitialAssignment_0_5_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:879:1: ( ( rule__State__IsInitialAssignment_0_5_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:880:1: ( rule__State__IsInitialAssignment_0_5_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_5_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:881:1: ( rule__State__IsInitialAssignment_0_5_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:881:2: rule__State__IsInitialAssignment_0_5_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_5_1_in_rule__State__Group_0_5__11956);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:895:1: rule__State__Group_0_6__0 : ( ( rule__State__IsFinalAssignment_0_6_0 ) ) rule__State__Group_0_6__1 ;
    public final void rule__State__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:899:1: ( ( ( rule__State__IsFinalAssignment_0_6_0 ) ) rule__State__Group_0_6__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:900:1: ( ( rule__State__IsFinalAssignment_0_6_0 ) ) rule__State__Group_0_6__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:900:1: ( ( rule__State__IsFinalAssignment_0_6_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:901:1: ( rule__State__IsFinalAssignment_0_6_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_6_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:902:1: ( rule__State__IsFinalAssignment_0_6_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:902:2: rule__State__IsFinalAssignment_0_6_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_6_0_in_rule__State__Group_0_6__01994);
            rule__State__IsFinalAssignment_0_6_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_6_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_6__1_in_rule__State__Group_0_6__02003);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:913:1: rule__State__Group_0_6__1 : ( ( rule__State__StateKindAssignment_0_6_1 ) ) ;
    public final void rule__State__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:917:1: ( ( ( rule__State__StateKindAssignment_0_6_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:918:1: ( ( rule__State__StateKindAssignment_0_6_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:918:1: ( ( rule__State__StateKindAssignment_0_6_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:919:1: ( rule__State__StateKindAssignment_0_6_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_6_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:920:1: ( rule__State__StateKindAssignment_0_6_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:920:2: rule__State__StateKindAssignment_0_6_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_6_1_in_rule__State__Group_0_6__12031);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:934:1: rule__State__Group_0_7__0 : ( ( rule__State__StateKindAssignment_0_7_0 ) ) rule__State__Group_0_7__1 ;
    public final void rule__State__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:938:1: ( ( ( rule__State__StateKindAssignment_0_7_0 ) ) rule__State__Group_0_7__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:939:1: ( ( rule__State__StateKindAssignment_0_7_0 ) ) rule__State__Group_0_7__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:939:1: ( ( rule__State__StateKindAssignment_0_7_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:940:1: ( rule__State__StateKindAssignment_0_7_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_7_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:941:1: ( rule__State__StateKindAssignment_0_7_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:941:2: rule__State__StateKindAssignment_0_7_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_7_0_in_rule__State__Group_0_7__02069);
            rule__State__StateKindAssignment_0_7_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_7_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_7__1_in_rule__State__Group_0_7__02078);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:952:1: rule__State__Group_0_7__1 : ( ( rule__State__IsInitialAssignment_0_7_1 ) ) ;
    public final void rule__State__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:956:1: ( ( ( rule__State__IsInitialAssignment_0_7_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:957:1: ( ( rule__State__IsInitialAssignment_0_7_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:957:1: ( ( rule__State__IsInitialAssignment_0_7_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:958:1: ( rule__State__IsInitialAssignment_0_7_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_7_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:959:1: ( rule__State__IsInitialAssignment_0_7_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:959:2: rule__State__IsInitialAssignment_0_7_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_7_1_in_rule__State__Group_0_7__12106);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:973:1: rule__State__Group_0_8__0 : ( ( rule__State__StateKindAssignment_0_8_0 ) ) rule__State__Group_0_8__1 ;
    public final void rule__State__Group_0_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:977:1: ( ( ( rule__State__StateKindAssignment_0_8_0 ) ) rule__State__Group_0_8__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:978:1: ( ( rule__State__StateKindAssignment_0_8_0 ) ) rule__State__Group_0_8__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:978:1: ( ( rule__State__StateKindAssignment_0_8_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:979:1: ( rule__State__StateKindAssignment_0_8_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_8_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:980:1: ( rule__State__StateKindAssignment_0_8_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:980:2: rule__State__StateKindAssignment_0_8_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_8_0_in_rule__State__Group_0_8__02144);
            rule__State__StateKindAssignment_0_8_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_8_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_8__1_in_rule__State__Group_0_8__02153);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:991:1: rule__State__Group_0_8__1 : ( ( rule__State__IsFinalAssignment_0_8_1 ) ) ;
    public final void rule__State__Group_0_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:995:1: ( ( ( rule__State__IsFinalAssignment_0_8_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:996:1: ( ( rule__State__IsFinalAssignment_0_8_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:996:1: ( ( rule__State__IsFinalAssignment_0_8_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:997:1: ( rule__State__IsFinalAssignment_0_8_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_8_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:998:1: ( rule__State__IsFinalAssignment_0_8_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:998:2: rule__State__IsFinalAssignment_0_8_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_8_1_in_rule__State__Group_0_8__12181);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1012:1: rule__State__Group_0_9__0 : ( ( rule__State__IsInitialAssignment_0_9_0 ) ) rule__State__Group_0_9__1 ;
    public final void rule__State__Group_0_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1016:1: ( ( ( rule__State__IsInitialAssignment_0_9_0 ) ) rule__State__Group_0_9__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1017:1: ( ( rule__State__IsInitialAssignment_0_9_0 ) ) rule__State__Group_0_9__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1017:1: ( ( rule__State__IsInitialAssignment_0_9_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1018:1: ( rule__State__IsInitialAssignment_0_9_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_9_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1019:1: ( rule__State__IsInitialAssignment_0_9_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1019:2: rule__State__IsInitialAssignment_0_9_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_9_0_in_rule__State__Group_0_9__02219);
            rule__State__IsInitialAssignment_0_9_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_9_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_9__1_in_rule__State__Group_0_9__02228);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1030:1: rule__State__Group_0_9__1 : ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2 ;
    public final void rule__State__Group_0_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1034:1: ( ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1035:1: ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1035:1: ( ( rule__State__IsFinalAssignment_0_9_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1036:1: ( rule__State__IsFinalAssignment_0_9_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_9_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1037:1: ( rule__State__IsFinalAssignment_0_9_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1037:2: rule__State__IsFinalAssignment_0_9_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_9_1_in_rule__State__Group_0_9__12256);
            rule__State__IsFinalAssignment_0_9_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_9_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_9__2_in_rule__State__Group_0_9__12265);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1048:1: rule__State__Group_0_9__2 : ( ( rule__State__StateKindAssignment_0_9_2 ) ) ;
    public final void rule__State__Group_0_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1052:1: ( ( ( rule__State__StateKindAssignment_0_9_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1053:1: ( ( rule__State__StateKindAssignment_0_9_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1053:1: ( ( rule__State__StateKindAssignment_0_9_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1054:1: ( rule__State__StateKindAssignment_0_9_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_9_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1055:1: ( rule__State__StateKindAssignment_0_9_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1055:2: rule__State__StateKindAssignment_0_9_2
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_9_2_in_rule__State__Group_0_9__22293);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1071:1: rule__State__Group_0_10__0 : ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1 ;
    public final void rule__State__Group_0_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1075:1: ( ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1076:1: ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1076:1: ( ( rule__State__IsInitialAssignment_0_10_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1077:1: ( rule__State__IsInitialAssignment_0_10_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_10_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1078:1: ( rule__State__IsInitialAssignment_0_10_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1078:2: rule__State__IsInitialAssignment_0_10_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_10_0_in_rule__State__Group_0_10__02333);
            rule__State__IsInitialAssignment_0_10_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_10_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_10__1_in_rule__State__Group_0_10__02342);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1089:1: rule__State__Group_0_10__1 : ( ( rule__State__StateKindAssignment_0_10_1 ) ) rule__State__Group_0_10__2 ;
    public final void rule__State__Group_0_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1093:1: ( ( ( rule__State__StateKindAssignment_0_10_1 ) ) rule__State__Group_0_10__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1094:1: ( ( rule__State__StateKindAssignment_0_10_1 ) ) rule__State__Group_0_10__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1094:1: ( ( rule__State__StateKindAssignment_0_10_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1095:1: ( rule__State__StateKindAssignment_0_10_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_10_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1096:1: ( rule__State__StateKindAssignment_0_10_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1096:2: rule__State__StateKindAssignment_0_10_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_10_1_in_rule__State__Group_0_10__12370);
            rule__State__StateKindAssignment_0_10_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_10_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_10__2_in_rule__State__Group_0_10__12379);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1107:1: rule__State__Group_0_10__2 : ( ( rule__State__IsFinalAssignment_0_10_2 ) ) ;
    public final void rule__State__Group_0_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1111:1: ( ( ( rule__State__IsFinalAssignment_0_10_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1112:1: ( ( rule__State__IsFinalAssignment_0_10_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1112:1: ( ( rule__State__IsFinalAssignment_0_10_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1113:1: ( rule__State__IsFinalAssignment_0_10_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_10_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1114:1: ( rule__State__IsFinalAssignment_0_10_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1114:2: rule__State__IsFinalAssignment_0_10_2
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_10_2_in_rule__State__Group_0_10__22407);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1130:1: rule__State__Group_0_11__0 : ( ( rule__State__IsFinalAssignment_0_11_0 ) ) rule__State__Group_0_11__1 ;
    public final void rule__State__Group_0_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1134:1: ( ( ( rule__State__IsFinalAssignment_0_11_0 ) ) rule__State__Group_0_11__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1135:1: ( ( rule__State__IsFinalAssignment_0_11_0 ) ) rule__State__Group_0_11__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1135:1: ( ( rule__State__IsFinalAssignment_0_11_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1136:1: ( rule__State__IsFinalAssignment_0_11_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_11_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1137:1: ( rule__State__IsFinalAssignment_0_11_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1137:2: rule__State__IsFinalAssignment_0_11_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_11_0_in_rule__State__Group_0_11__02447);
            rule__State__IsFinalAssignment_0_11_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_11_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_11__1_in_rule__State__Group_0_11__02456);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1148:1: rule__State__Group_0_11__1 : ( ( rule__State__IsInitialAssignment_0_11_1 ) ) rule__State__Group_0_11__2 ;
    public final void rule__State__Group_0_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1152:1: ( ( ( rule__State__IsInitialAssignment_0_11_1 ) ) rule__State__Group_0_11__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1153:1: ( ( rule__State__IsInitialAssignment_0_11_1 ) ) rule__State__Group_0_11__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1153:1: ( ( rule__State__IsInitialAssignment_0_11_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1154:1: ( rule__State__IsInitialAssignment_0_11_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_11_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1155:1: ( rule__State__IsInitialAssignment_0_11_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1155:2: rule__State__IsInitialAssignment_0_11_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_11_1_in_rule__State__Group_0_11__12484);
            rule__State__IsInitialAssignment_0_11_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_11_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_11__2_in_rule__State__Group_0_11__12493);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1166:1: rule__State__Group_0_11__2 : ( ( rule__State__StateKindAssignment_0_11_2 ) ) ;
    public final void rule__State__Group_0_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1170:1: ( ( ( rule__State__StateKindAssignment_0_11_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1171:1: ( ( rule__State__StateKindAssignment_0_11_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1171:1: ( ( rule__State__StateKindAssignment_0_11_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1172:1: ( rule__State__StateKindAssignment_0_11_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_11_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1173:1: ( rule__State__StateKindAssignment_0_11_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1173:2: rule__State__StateKindAssignment_0_11_2
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_11_2_in_rule__State__Group_0_11__22521);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1189:1: rule__State__Group_0_12__0 : ( ( rule__State__IsFinalAssignment_0_12_0 ) ) rule__State__Group_0_12__1 ;
    public final void rule__State__Group_0_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1193:1: ( ( ( rule__State__IsFinalAssignment_0_12_0 ) ) rule__State__Group_0_12__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1194:1: ( ( rule__State__IsFinalAssignment_0_12_0 ) ) rule__State__Group_0_12__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1194:1: ( ( rule__State__IsFinalAssignment_0_12_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1195:1: ( rule__State__IsFinalAssignment_0_12_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_12_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1196:1: ( rule__State__IsFinalAssignment_0_12_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1196:2: rule__State__IsFinalAssignment_0_12_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_12_0_in_rule__State__Group_0_12__02561);
            rule__State__IsFinalAssignment_0_12_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_12_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_12__1_in_rule__State__Group_0_12__02570);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1207:1: rule__State__Group_0_12__1 : ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2 ;
    public final void rule__State__Group_0_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1211:1: ( ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1212:1: ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1212:1: ( ( rule__State__StateKindAssignment_0_12_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1213:1: ( rule__State__StateKindAssignment_0_12_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_12_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1214:1: ( rule__State__StateKindAssignment_0_12_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1214:2: rule__State__StateKindAssignment_0_12_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_12_1_in_rule__State__Group_0_12__12598);
            rule__State__StateKindAssignment_0_12_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_12_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_12__2_in_rule__State__Group_0_12__12607);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1225:1: rule__State__Group_0_12__2 : ( ( rule__State__IsInitialAssignment_0_12_2 ) ) ;
    public final void rule__State__Group_0_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1229:1: ( ( ( rule__State__IsInitialAssignment_0_12_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1230:1: ( ( rule__State__IsInitialAssignment_0_12_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1230:1: ( ( rule__State__IsInitialAssignment_0_12_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1231:1: ( rule__State__IsInitialAssignment_0_12_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_12_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1232:1: ( rule__State__IsInitialAssignment_0_12_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1232:2: rule__State__IsInitialAssignment_0_12_2
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_12_2_in_rule__State__Group_0_12__22635);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1248:1: rule__State__Group_0_13__0 : ( ( rule__State__StateKindAssignment_0_13_0 ) ) rule__State__Group_0_13__1 ;
    public final void rule__State__Group_0_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1252:1: ( ( ( rule__State__StateKindAssignment_0_13_0 ) ) rule__State__Group_0_13__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1253:1: ( ( rule__State__StateKindAssignment_0_13_0 ) ) rule__State__Group_0_13__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1253:1: ( ( rule__State__StateKindAssignment_0_13_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1254:1: ( rule__State__StateKindAssignment_0_13_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_13_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1255:1: ( rule__State__StateKindAssignment_0_13_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1255:2: rule__State__StateKindAssignment_0_13_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_13_0_in_rule__State__Group_0_13__02675);
            rule__State__StateKindAssignment_0_13_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_13_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_13__1_in_rule__State__Group_0_13__02684);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1266:1: rule__State__Group_0_13__1 : ( ( rule__State__IsFinalAssignment_0_13_1 ) ) rule__State__Group_0_13__2 ;
    public final void rule__State__Group_0_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1270:1: ( ( ( rule__State__IsFinalAssignment_0_13_1 ) ) rule__State__Group_0_13__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1271:1: ( ( rule__State__IsFinalAssignment_0_13_1 ) ) rule__State__Group_0_13__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1271:1: ( ( rule__State__IsFinalAssignment_0_13_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1272:1: ( rule__State__IsFinalAssignment_0_13_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_13_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1273:1: ( rule__State__IsFinalAssignment_0_13_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1273:2: rule__State__IsFinalAssignment_0_13_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_13_1_in_rule__State__Group_0_13__12712);
            rule__State__IsFinalAssignment_0_13_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_13_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_13__2_in_rule__State__Group_0_13__12721);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1284:1: rule__State__Group_0_13__2 : ( ( rule__State__IsInitialAssignment_0_13_2 ) ) ;
    public final void rule__State__Group_0_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1288:1: ( ( ( rule__State__IsInitialAssignment_0_13_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1289:1: ( ( rule__State__IsInitialAssignment_0_13_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1289:1: ( ( rule__State__IsInitialAssignment_0_13_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1290:1: ( rule__State__IsInitialAssignment_0_13_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_13_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1291:1: ( rule__State__IsInitialAssignment_0_13_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1291:2: rule__State__IsInitialAssignment_0_13_2
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_13_2_in_rule__State__Group_0_13__22749);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1307:1: rule__State__Group_0_14__0 : ( ( rule__State__StateKindAssignment_0_14_0 ) ) rule__State__Group_0_14__1 ;
    public final void rule__State__Group_0_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1311:1: ( ( ( rule__State__StateKindAssignment_0_14_0 ) ) rule__State__Group_0_14__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1312:1: ( ( rule__State__StateKindAssignment_0_14_0 ) ) rule__State__Group_0_14__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1312:1: ( ( rule__State__StateKindAssignment_0_14_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1313:1: ( rule__State__StateKindAssignment_0_14_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_14_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1314:1: ( rule__State__StateKindAssignment_0_14_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1314:2: rule__State__StateKindAssignment_0_14_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_14_0_in_rule__State__Group_0_14__02789);
            rule__State__StateKindAssignment_0_14_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_14_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_14__1_in_rule__State__Group_0_14__02798);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1325:1: rule__State__Group_0_14__1 : ( ( rule__State__IsInitialAssignment_0_14_1 ) ) rule__State__Group_0_14__2 ;
    public final void rule__State__Group_0_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1329:1: ( ( ( rule__State__IsInitialAssignment_0_14_1 ) ) rule__State__Group_0_14__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1330:1: ( ( rule__State__IsInitialAssignment_0_14_1 ) ) rule__State__Group_0_14__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1330:1: ( ( rule__State__IsInitialAssignment_0_14_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1331:1: ( rule__State__IsInitialAssignment_0_14_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_14_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1332:1: ( rule__State__IsInitialAssignment_0_14_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1332:2: rule__State__IsInitialAssignment_0_14_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_14_1_in_rule__State__Group_0_14__12826);
            rule__State__IsInitialAssignment_0_14_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_14_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_14__2_in_rule__State__Group_0_14__12835);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1343:1: rule__State__Group_0_14__2 : ( ( rule__State__IsFinalAssignment_0_14_2 ) ) ;
    public final void rule__State__Group_0_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1347:1: ( ( ( rule__State__IsFinalAssignment_0_14_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1348:1: ( ( rule__State__IsFinalAssignment_0_14_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1348:1: ( ( rule__State__IsFinalAssignment_0_14_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1349:1: ( rule__State__IsFinalAssignment_0_14_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_14_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1350:1: ( rule__State__IsFinalAssignment_0_14_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1350:2: rule__State__IsFinalAssignment_0_14_2
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_14_2_in_rule__State__Group_0_14__22863);
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


    // $ANTLR start rule__State__Group_2__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1366:1: rule__State__Group_2__0 : ( ( rule__State__StateIDAssignment_2_0 )? ) rule__State__Group_2__1 ;
    public final void rule__State__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1370:1: ( ( ( rule__State__StateIDAssignment_2_0 )? ) rule__State__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1371:1: ( ( rule__State__StateIDAssignment_2_0 )? ) rule__State__Group_2__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1371:1: ( ( rule__State__StateIDAssignment_2_0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1372:1: ( rule__State__StateIDAssignment_2_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateIDAssignment_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1373:1: ( rule__State__StateIDAssignment_2_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1373:2: rule__State__StateIDAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__State__StateIDAssignment_2_0_in_rule__State__Group_2__02903);
                    rule__State__StateIDAssignment_2_0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateIDAssignment_2_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_2__1_in_rule__State__Group_2__02913);
            rule__State__Group_2__1();
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
    // $ANTLR end rule__State__Group_2__0


    // $ANTLR start rule__State__Group_2__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1384:1: rule__State__Group_2__1 : ( ( rule__State__StateLabelAssignment_2_1 )? ) rule__State__Group_2__2 ;
    public final void rule__State__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1388:1: ( ( ( rule__State__StateLabelAssignment_2_1 )? ) rule__State__Group_2__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1389:1: ( ( rule__State__StateLabelAssignment_2_1 )? ) rule__State__Group_2__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1389:1: ( ( rule__State__StateLabelAssignment_2_1 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1390:1: ( rule__State__StateLabelAssignment_2_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateLabelAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1391:1: ( rule__State__StateLabelAssignment_2_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred36()) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1391:2: rule__State__StateLabelAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__State__StateLabelAssignment_2_1_in_rule__State__Group_2__12941);
                    rule__State__StateLabelAssignment_2_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateLabelAssignment_2_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_2__2_in_rule__State__Group_2__12951);
            rule__State__Group_2__2();
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
    // $ANTLR end rule__State__Group_2__1


    // $ANTLR start rule__State__Group_2__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1402:1: rule__State__Group_2__2 : ( ( rule__State__BodyTextAssignment_2_2 )? ) rule__State__Group_2__3 ;
    public final void rule__State__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1406:1: ( ( ( rule__State__BodyTextAssignment_2_2 )? ) rule__State__Group_2__3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1407:1: ( ( rule__State__BodyTextAssignment_2_2 )? ) rule__State__Group_2__3
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1407:1: ( ( rule__State__BodyTextAssignment_2_2 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1408:1: ( rule__State__BodyTextAssignment_2_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getBodyTextAssignment_2_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1409:1: ( rule__State__BodyTextAssignment_2_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1409:2: rule__State__BodyTextAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__State__BodyTextAssignment_2_2_in_rule__State__Group_2__22979);
                    rule__State__BodyTextAssignment_2_2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getBodyTextAssignment_2_2()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_2__3_in_rule__State__Group_2__22989);
            rule__State__Group_2__3();
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
    // $ANTLR end rule__State__Group_2__2


    // $ANTLR start rule__State__Group_2__3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1420:1: rule__State__Group_2__3 : ( ( rule__State__StateContentAssignment_2_3 )? ) ;
    public final void rule__State__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1424:1: ( ( ( rule__State__StateContentAssignment_2_3 )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1425:1: ( ( rule__State__StateContentAssignment_2_3 )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1425:1: ( ( rule__State__StateContentAssignment_2_3 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1426:1: ( rule__State__StateContentAssignment_2_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateContentAssignment_2_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1427:1: ( rule__State__StateContentAssignment_2_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1427:2: rule__State__StateContentAssignment_2_3
                    {
                    pushFollow(FOLLOW_rule__State__StateContentAssignment_2_3_in_rule__State__Group_2__33017);
                    rule__State__StateContentAssignment_2_3();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateContentAssignment_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_2__3


    // $ANTLR start rule__StateContent__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1445:1: rule__StateContent__Group__0 : ( '{' ) rule__StateContent__Group__1 ;
    public final void rule__StateContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1449:1: ( ( '{' ) rule__StateContent__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1450:1: ( '{' ) rule__StateContent__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1450:1: ( '{' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1451:1: '{'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__StateContent__Group__03061); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group__1_in_rule__StateContent__Group__03071);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1465:1: rule__StateContent__Group__1 : ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) ) rule__StateContent__Group__2 ;
    public final void rule__StateContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1469:1: ( ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) ) rule__StateContent__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1470:1: ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) ) rule__StateContent__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1470:1: ( ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1471:1: ( ( rule__StateContent__Alternatives_1 ) ) ( ( rule__StateContent__Alternatives_1 )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1471:1: ( ( rule__StateContent__Alternatives_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1472:1: ( rule__StateContent__Alternatives_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1473:1: ( rule__StateContent__Alternatives_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1473:2: rule__StateContent__Alternatives_1
            {
            pushFollow(FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__13101);
            rule__StateContent__Alternatives_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1476:1: ( ( rule__StateContent__Alternatives_1 )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1477:1: ( rule__StateContent__Alternatives_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1478:1: ( rule__StateContent__Alternatives_1 )*
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA14_1 = input.LA(2);

                    if ( (synpred39()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred39()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 33:
                case 34:
                case 35:
                case 36:
                case 43:
                case 44:
                    {
                    alt14=1;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1478:2: rule__StateContent__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__13113);
            	    rule__StateContent__Alternatives_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getAlternatives_1()); 
            }

            }


            }

            pushFollow(FOLLOW_rule__StateContent__Group__2_in_rule__StateContent__Group__13125);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1490:1: rule__StateContent__Group__2 : ( ( rule__StateContent__Group_2__0 )? ) rule__StateContent__Group__3 ;
    public final void rule__StateContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1494:1: ( ( ( rule__StateContent__Group_2__0 )? ) rule__StateContent__Group__3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1495:1: ( ( rule__StateContent__Group_2__0 )? ) rule__StateContent__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1495:1: ( ( rule__StateContent__Group_2__0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1496:1: ( rule__StateContent__Group_2__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1497:1: ( rule__StateContent__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1497:2: rule__StateContent__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StateContent__Group_2__0_in_rule__StateContent__Group__23153);
                    rule__StateContent__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getGroup_2()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group__3_in_rule__StateContent__Group__23163);
            rule__StateContent__Group__3();
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
    // $ANTLR end rule__StateContent__Group__2


    // $ANTLR start rule__StateContent__Group__3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1508:1: rule__StateContent__Group__3 : ( '}' ) ;
    public final void rule__StateContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1512:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1513:1: ( '}' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1513:1: ( '}' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1514:1: '}'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__StateContent__Group__33192); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateContent__Group__3


    // $ANTLR start rule__StateContent__Group_2__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1535:1: rule__StateContent__Group_2__0 : ( ( rule__StateContent__Group_2_0__0 )? ) rule__StateContent__Group_2__1 ;
    public final void rule__StateContent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1539:1: ( ( ( rule__StateContent__Group_2_0__0 )? ) rule__StateContent__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1540:1: ( ( rule__StateContent__Group_2_0__0 )? ) rule__StateContent__Group_2__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1540:1: ( ( rule__StateContent__Group_2_0__0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1541:1: ( rule__StateContent__Group_2_0__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getGroup_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1542:1: ( rule__StateContent__Group_2_0__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==30) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1542:2: rule__StateContent__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__StateContent__Group_2_0__0_in_rule__StateContent__Group_2__03235);
                    rule__StateContent__Group_2_0__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getGroup_2_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group_2__1_in_rule__StateContent__Group_2__03245);
            rule__StateContent__Group_2__1();
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
    // $ANTLR end rule__StateContent__Group_2__0


    // $ANTLR start rule__StateContent__Group_2__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1553:1: rule__StateContent__Group_2__1 : ( ( rule__StateContent__ReferencedStateAssignment_2_1 ) ) rule__StateContent__Group_2__2 ;
    public final void rule__StateContent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1557:1: ( ( ( rule__StateContent__ReferencedStateAssignment_2_1 ) ) rule__StateContent__Group_2__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1558:1: ( ( rule__StateContent__ReferencedStateAssignment_2_1 ) ) rule__StateContent__Group_2__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1558:1: ( ( rule__StateContent__ReferencedStateAssignment_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1559:1: ( rule__StateContent__ReferencedStateAssignment_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getReferencedStateAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1560:1: ( rule__StateContent__ReferencedStateAssignment_2_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1560:2: rule__StateContent__ReferencedStateAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StateContent__ReferencedStateAssignment_2_1_in_rule__StateContent__Group_2__13273);
            rule__StateContent__ReferencedStateAssignment_2_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getReferencedStateAssignment_2_1()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group_2__2_in_rule__StateContent__Group_2__13282);
            rule__StateContent__Group_2__2();
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
    // $ANTLR end rule__StateContent__Group_2__1


    // $ANTLR start rule__StateContent__Group_2__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1571:1: rule__StateContent__Group_2__2 : ( '[' ) rule__StateContent__Group_2__3 ;
    public final void rule__StateContent__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1575:1: ( ( '[' ) rule__StateContent__Group_2__3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1576:1: ( '[' ) rule__StateContent__Group_2__3
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1576:1: ( '[' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1577:1: '['
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getLeftSquareBracketKeyword_2_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__StateContent__Group_2__23311); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getLeftSquareBracketKeyword_2_2()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group_2__3_in_rule__StateContent__Group_2__23321);
            rule__StateContent__Group_2__3();
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
    // $ANTLR end rule__StateContent__Group_2__2


    // $ANTLR start rule__StateContent__Group_2__3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1591:1: rule__StateContent__Group_2__3 : ( ( rule__StateContent__Group_2_3__0 )* ) rule__StateContent__Group_2__4 ;
    public final void rule__StateContent__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1595:1: ( ( ( rule__StateContent__Group_2_3__0 )* ) rule__StateContent__Group_2__4 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1596:1: ( ( rule__StateContent__Group_2_3__0 )* ) rule__StateContent__Group_2__4
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1596:1: ( ( rule__StateContent__Group_2_3__0 )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1597:1: ( rule__StateContent__Group_2_3__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getGroup_2_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1598:1: ( rule__StateContent__Group_2_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==32) ) {
                        int LA17_2 = input.LA(3);

                        if ( (LA17_2==RULE_ID) ) {
                            int LA17_3 = input.LA(4);

                            if ( (LA17_3==31) ) {
                                alt17=1;
                            }


                        }


                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1598:2: rule__StateContent__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_rule__StateContent__Group_2_3__0_in_rule__StateContent__Group_2__33349);
            	    rule__StateContent__Group_2_3__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getGroup_2_3()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group_2__4_in_rule__StateContent__Group_2__33359);
            rule__StateContent__Group_2__4();
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
    // $ANTLR end rule__StateContent__Group_2__3


    // $ANTLR start rule__StateContent__Group_2__4
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1609:1: rule__StateContent__Group_2__4 : ( ( rule__StateContent__SignalRenamingsAssignment_2_4 ) ) rule__StateContent__Group_2__5 ;
    public final void rule__StateContent__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1613:1: ( ( ( rule__StateContent__SignalRenamingsAssignment_2_4 ) ) rule__StateContent__Group_2__5 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1614:1: ( ( rule__StateContent__SignalRenamingsAssignment_2_4 ) ) rule__StateContent__Group_2__5
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1614:1: ( ( rule__StateContent__SignalRenamingsAssignment_2_4 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1615:1: ( rule__StateContent__SignalRenamingsAssignment_2_4 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getSignalRenamingsAssignment_2_4()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1616:1: ( rule__StateContent__SignalRenamingsAssignment_2_4 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1616:2: rule__StateContent__SignalRenamingsAssignment_2_4
            {
            pushFollow(FOLLOW_rule__StateContent__SignalRenamingsAssignment_2_4_in_rule__StateContent__Group_2__43387);
            rule__StateContent__SignalRenamingsAssignment_2_4();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getSignalRenamingsAssignment_2_4()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group_2__5_in_rule__StateContent__Group_2__43396);
            rule__StateContent__Group_2__5();
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
    // $ANTLR end rule__StateContent__Group_2__4


    // $ANTLR start rule__StateContent__Group_2__5
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1627:1: rule__StateContent__Group_2__5 : ( ']' ) ;
    public final void rule__StateContent__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1631:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1632:1: ( ']' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1632:1: ( ']' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1633:1: ']'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getRightSquareBracketKeyword_2_5()); 
            }
            match(input,29,FOLLOW_29_in_rule__StateContent__Group_2__53425); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getRightSquareBracketKeyword_2_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateContent__Group_2__5


    // $ANTLR start rule__StateContent__Group_2_0__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1658:1: rule__StateContent__Group_2_0__0 : ( ( rule__StateContent__NewStateIDAssignment_2_0_0 ) ) rule__StateContent__Group_2_0__1 ;
    public final void rule__StateContent__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1662:1: ( ( ( rule__StateContent__NewStateIDAssignment_2_0_0 ) ) rule__StateContent__Group_2_0__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1663:1: ( ( rule__StateContent__NewStateIDAssignment_2_0_0 ) ) rule__StateContent__Group_2_0__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1663:1: ( ( rule__StateContent__NewStateIDAssignment_2_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1664:1: ( rule__StateContent__NewStateIDAssignment_2_0_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getNewStateIDAssignment_2_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1665:1: ( rule__StateContent__NewStateIDAssignment_2_0_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1665:2: rule__StateContent__NewStateIDAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__StateContent__NewStateIDAssignment_2_0_0_in_rule__StateContent__Group_2_0__03472);
            rule__StateContent__NewStateIDAssignment_2_0_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getNewStateIDAssignment_2_0_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group_2_0__1_in_rule__StateContent__Group_2_0__03481);
            rule__StateContent__Group_2_0__1();
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
    // $ANTLR end rule__StateContent__Group_2_0__0


    // $ANTLR start rule__StateContent__Group_2_0__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1676:1: rule__StateContent__Group_2_0__1 : ( '@' ) ;
    public final void rule__StateContent__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1680:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1681:1: ( '@' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1681:1: ( '@' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1682:1: '@'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getCommercialAtKeyword_2_0_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__StateContent__Group_2_0__13510); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getCommercialAtKeyword_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateContent__Group_2_0__1


    // $ANTLR start rule__StateContent__Group_2_3__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1699:1: rule__StateContent__Group_2_3__0 : ( ( rule__StateContent__SignalRenamingsAssignment_2_3_0 ) ) rule__StateContent__Group_2_3__1 ;
    public final void rule__StateContent__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1703:1: ( ( ( rule__StateContent__SignalRenamingsAssignment_2_3_0 ) ) rule__StateContent__Group_2_3__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1704:1: ( ( rule__StateContent__SignalRenamingsAssignment_2_3_0 ) ) rule__StateContent__Group_2_3__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1704:1: ( ( rule__StateContent__SignalRenamingsAssignment_2_3_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1705:1: ( rule__StateContent__SignalRenamingsAssignment_2_3_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getSignalRenamingsAssignment_2_3_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1706:1: ( rule__StateContent__SignalRenamingsAssignment_2_3_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1706:2: rule__StateContent__SignalRenamingsAssignment_2_3_0
            {
            pushFollow(FOLLOW_rule__StateContent__SignalRenamingsAssignment_2_3_0_in_rule__StateContent__Group_2_3__03549);
            rule__StateContent__SignalRenamingsAssignment_2_3_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getSignalRenamingsAssignment_2_3_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StateContent__Group_2_3__1_in_rule__StateContent__Group_2_3__03558);
            rule__StateContent__Group_2_3__1();
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
    // $ANTLR end rule__StateContent__Group_2_3__0


    // $ANTLR start rule__StateContent__Group_2_3__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1717:1: rule__StateContent__Group_2_3__1 : ( ',' ) ;
    public final void rule__StateContent__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1721:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1722:1: ( ',' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1722:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1723:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getCommaKeyword_2_3_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__StateContent__Group_2_3__13587); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getCommaKeyword_2_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateContent__Group_2_3__1


    // $ANTLR start rule__SignalRenaming__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1740:1: rule__SignalRenaming__Group__0 : ( ( rule__SignalRenaming__OldSignalAssignment_0 ) ) rule__SignalRenaming__Group__1 ;
    public final void rule__SignalRenaming__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1744:1: ( ( ( rule__SignalRenaming__OldSignalAssignment_0 ) ) rule__SignalRenaming__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1745:1: ( ( rule__SignalRenaming__OldSignalAssignment_0 ) ) rule__SignalRenaming__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1745:1: ( ( rule__SignalRenaming__OldSignalAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1746:1: ( rule__SignalRenaming__OldSignalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalRenamingAccess().getOldSignalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1747:1: ( rule__SignalRenaming__OldSignalAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1747:2: rule__SignalRenaming__OldSignalAssignment_0
            {
            pushFollow(FOLLOW_rule__SignalRenaming__OldSignalAssignment_0_in_rule__SignalRenaming__Group__03626);
            rule__SignalRenaming__OldSignalAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalRenamingAccess().getOldSignalAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__SignalRenaming__Group__1_in_rule__SignalRenaming__Group__03635);
            rule__SignalRenaming__Group__1();
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
    // $ANTLR end rule__SignalRenaming__Group__0


    // $ANTLR start rule__SignalRenaming__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1758:1: rule__SignalRenaming__Group__1 : ( '/' ) rule__SignalRenaming__Group__2 ;
    public final void rule__SignalRenaming__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1762:1: ( ( '/' ) rule__SignalRenaming__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1763:1: ( '/' ) rule__SignalRenaming__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1763:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1764:1: '/'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalRenamingAccess().getSolidusKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__SignalRenaming__Group__13664); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalRenamingAccess().getSolidusKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__SignalRenaming__Group__2_in_rule__SignalRenaming__Group__13674);
            rule__SignalRenaming__Group__2();
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
    // $ANTLR end rule__SignalRenaming__Group__1


    // $ANTLR start rule__SignalRenaming__Group__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1778:1: rule__SignalRenaming__Group__2 : ( ( rule__SignalRenaming__NewSignalAssignment_2 ) ) ;
    public final void rule__SignalRenaming__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1782:1: ( ( ( rule__SignalRenaming__NewSignalAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1783:1: ( ( rule__SignalRenaming__NewSignalAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1783:1: ( ( rule__SignalRenaming__NewSignalAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1784:1: ( rule__SignalRenaming__NewSignalAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalRenamingAccess().getNewSignalAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1785:1: ( rule__SignalRenaming__NewSignalAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1785:2: rule__SignalRenaming__NewSignalAssignment_2
            {
            pushFollow(FOLLOW_rule__SignalRenaming__NewSignalAssignment_2_in_rule__SignalRenaming__Group__23702);
            rule__SignalRenaming__NewSignalAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalRenamingAccess().getNewSignalAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalRenaming__Group__2


    // $ANTLR start rule__EntryAction__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1801:1: rule__EntryAction__Group__0 : ( 'onentry' ) rule__EntryAction__Group__1 ;
    public final void rule__EntryAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1805:1: ( ( 'onentry' ) rule__EntryAction__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1806:1: ( 'onentry' ) rule__EntryAction__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1806:1: ( 'onentry' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1807:1: 'onentry'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getOnentryKeyword_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__EntryAction__Group__03743); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEntryActionAccess().getOnentryKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__EntryAction__Group__1_in_rule__EntryAction__Group__03753);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1821:1: rule__EntryAction__Group__1 : ( ( rule__EntryAction__EntryActionAssignment_1 ) ) ;
    public final void rule__EntryAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1825:1: ( ( ( rule__EntryAction__EntryActionAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1826:1: ( ( rule__EntryAction__EntryActionAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1826:1: ( ( rule__EntryAction__EntryActionAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1827:1: ( rule__EntryAction__EntryActionAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getEntryActionAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1828:1: ( rule__EntryAction__EntryActionAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1828:2: rule__EntryAction__EntryActionAssignment_1
            {
            pushFollow(FOLLOW_rule__EntryAction__EntryActionAssignment_1_in_rule__EntryAction__Group__13781);
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


    // $ANTLR start rule__InnerAction__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1842:1: rule__InnerAction__Group__0 : ( 'oninner' ) rule__InnerAction__Group__1 ;
    public final void rule__InnerAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1846:1: ( ( 'oninner' ) rule__InnerAction__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1847:1: ( 'oninner' ) rule__InnerAction__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1847:1: ( 'oninner' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1848:1: 'oninner'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getOninnerKeyword_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__InnerAction__Group__03820); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getOninnerKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__InnerAction__Group__1_in_rule__InnerAction__Group__03830);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1862:1: rule__InnerAction__Group__1 : ( ( rule__InnerAction__InnerActionAssignment_1 ) ) ;
    public final void rule__InnerAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1866:1: ( ( ( rule__InnerAction__InnerActionAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1867:1: ( ( rule__InnerAction__InnerActionAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1867:1: ( ( rule__InnerAction__InnerActionAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1868:1: ( rule__InnerAction__InnerActionAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getInnerActionAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1869:1: ( rule__InnerAction__InnerActionAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1869:2: rule__InnerAction__InnerActionAssignment_1
            {
            pushFollow(FOLLOW_rule__InnerAction__InnerActionAssignment_1_in_rule__InnerAction__Group__13858);
            rule__InnerAction__InnerActionAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getInnerActionAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__ExitAction__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1883:1: rule__ExitAction__Group__0 : ( 'onexit' ) rule__ExitAction__Group__1 ;
    public final void rule__ExitAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1887:1: ( ( 'onexit' ) rule__ExitAction__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1888:1: ( 'onexit' ) rule__ExitAction__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1888:1: ( 'onexit' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1889:1: 'onexit'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getOnexitKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__ExitAction__Group__03897); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getOnexitKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ExitAction__Group__1_in_rule__ExitAction__Group__03907);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1903:1: rule__ExitAction__Group__1 : ( ( rule__ExitAction__ExitActionAssignment_1 ) ) ;
    public final void rule__ExitAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1907:1: ( ( ( rule__ExitAction__ExitActionAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1908:1: ( ( rule__ExitAction__ExitActionAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1908:1: ( ( rule__ExitAction__ExitActionAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1909:1: ( rule__ExitAction__ExitActionAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getExitActionAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1910:1: ( rule__ExitAction__ExitActionAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1910:2: rule__ExitAction__ExitActionAssignment_1
            {
            pushFollow(FOLLOW_rule__ExitAction__ExitActionAssignment_1_in_rule__ExitAction__Group__13935);
            rule__ExitAction__ExitActionAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getExitActionAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__Suspension__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1924:1: rule__Suspension__Group__0 : ( 'suspension' ) rule__Suspension__Group__1 ;
    public final void rule__Suspension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1928:1: ( ( 'suspension' ) rule__Suspension__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1929:1: ( 'suspension' ) rule__Suspension__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1929:1: ( 'suspension' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1930:1: 'suspension'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSuspensionAccess().getSuspensionKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Suspension__Group__03974); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSuspensionAccess().getSuspensionKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Suspension__Group__1_in_rule__Suspension__Group__03984);
            rule__Suspension__Group__1();
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
    // $ANTLR end rule__Suspension__Group__0


    // $ANTLR start rule__Suspension__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1944:1: rule__Suspension__Group__1 : ( ( rule__Suspension__SuspensionTriggerAssignment_1 ) ) ;
    public final void rule__Suspension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1948:1: ( ( ( rule__Suspension__SuspensionTriggerAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1949:1: ( ( rule__Suspension__SuspensionTriggerAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1949:1: ( ( rule__Suspension__SuspensionTriggerAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1950:1: ( rule__Suspension__SuspensionTriggerAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSuspensionAccess().getSuspensionTriggerAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1951:1: ( rule__Suspension__SuspensionTriggerAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1951:2: rule__Suspension__SuspensionTriggerAssignment_1
            {
            pushFollow(FOLLOW_rule__Suspension__SuspensionTriggerAssignment_1_in_rule__Suspension__Group__14012);
            rule__Suspension__SuspensionTriggerAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSuspensionAccess().getSuspensionTriggerAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Suspension__Group__1


    // $ANTLR start rule__UserDefinedSignal__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1965:1: rule__UserDefinedSignal__Group__0 : ( ( rule__UserDefinedSignal__IsLocalAssignment_0 ) ) rule__UserDefinedSignal__Group__1 ;
    public final void rule__UserDefinedSignal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1969:1: ( ( ( rule__UserDefinedSignal__IsLocalAssignment_0 ) ) rule__UserDefinedSignal__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1970:1: ( ( rule__UserDefinedSignal__IsLocalAssignment_0 ) ) rule__UserDefinedSignal__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1970:1: ( ( rule__UserDefinedSignal__IsLocalAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1971:1: ( rule__UserDefinedSignal__IsLocalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getIsLocalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1972:1: ( rule__UserDefinedSignal__IsLocalAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1972:2: rule__UserDefinedSignal__IsLocalAssignment_0
            {
            pushFollow(FOLLOW_rule__UserDefinedSignal__IsLocalAssignment_0_in_rule__UserDefinedSignal__Group__04050);
            rule__UserDefinedSignal__IsLocalAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getIsLocalAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__UserDefinedSignal__Group__1_in_rule__UserDefinedSignal__Group__04059);
            rule__UserDefinedSignal__Group__1();
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
    // $ANTLR end rule__UserDefinedSignal__Group__0


    // $ANTLR start rule__UserDefinedSignal__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1983:1: rule__UserDefinedSignal__Group__1 : ( ( rule__UserDefinedSignal__IsInputAssignment_1 ) ) rule__UserDefinedSignal__Group__2 ;
    public final void rule__UserDefinedSignal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1987:1: ( ( ( rule__UserDefinedSignal__IsInputAssignment_1 ) ) rule__UserDefinedSignal__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1988:1: ( ( rule__UserDefinedSignal__IsInputAssignment_1 ) ) rule__UserDefinedSignal__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1988:1: ( ( rule__UserDefinedSignal__IsInputAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1989:1: ( rule__UserDefinedSignal__IsInputAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getIsInputAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1990:1: ( rule__UserDefinedSignal__IsInputAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1990:2: rule__UserDefinedSignal__IsInputAssignment_1
            {
            pushFollow(FOLLOW_rule__UserDefinedSignal__IsInputAssignment_1_in_rule__UserDefinedSignal__Group__14087);
            rule__UserDefinedSignal__IsInputAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getIsInputAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__UserDefinedSignal__Group__2_in_rule__UserDefinedSignal__Group__14096);
            rule__UserDefinedSignal__Group__2();
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
    // $ANTLR end rule__UserDefinedSignal__Group__1


    // $ANTLR start rule__UserDefinedSignal__Group__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2001:1: rule__UserDefinedSignal__Group__2 : ( ( rule__UserDefinedSignal__IsOutputAssignment_2 ) ) rule__UserDefinedSignal__Group__3 ;
    public final void rule__UserDefinedSignal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2005:1: ( ( ( rule__UserDefinedSignal__IsOutputAssignment_2 ) ) rule__UserDefinedSignal__Group__3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2006:1: ( ( rule__UserDefinedSignal__IsOutputAssignment_2 ) ) rule__UserDefinedSignal__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2006:1: ( ( rule__UserDefinedSignal__IsOutputAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2007:1: ( rule__UserDefinedSignal__IsOutputAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getIsOutputAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2008:1: ( rule__UserDefinedSignal__IsOutputAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2008:2: rule__UserDefinedSignal__IsOutputAssignment_2
            {
            pushFollow(FOLLOW_rule__UserDefinedSignal__IsOutputAssignment_2_in_rule__UserDefinedSignal__Group__24124);
            rule__UserDefinedSignal__IsOutputAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getIsOutputAssignment_2()); 
            }

            }

            pushFollow(FOLLOW_rule__UserDefinedSignal__Group__3_in_rule__UserDefinedSignal__Group__24133);
            rule__UserDefinedSignal__Group__3();
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
    // $ANTLR end rule__UserDefinedSignal__Group__2


    // $ANTLR start rule__UserDefinedSignal__Group__3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2019:1: rule__UserDefinedSignal__Group__3 : ( ( rule__UserDefinedSignal__NameAssignment_3 ) ) rule__UserDefinedSignal__Group__4 ;
    public final void rule__UserDefinedSignal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2023:1: ( ( ( rule__UserDefinedSignal__NameAssignment_3 ) ) rule__UserDefinedSignal__Group__4 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2024:1: ( ( rule__UserDefinedSignal__NameAssignment_3 ) ) rule__UserDefinedSignal__Group__4
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2024:1: ( ( rule__UserDefinedSignal__NameAssignment_3 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2025:1: ( rule__UserDefinedSignal__NameAssignment_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getNameAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2026:1: ( rule__UserDefinedSignal__NameAssignment_3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2026:2: rule__UserDefinedSignal__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__UserDefinedSignal__NameAssignment_3_in_rule__UserDefinedSignal__Group__34161);
            rule__UserDefinedSignal__NameAssignment_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getNameAssignment_3()); 
            }

            }

            pushFollow(FOLLOW_rule__UserDefinedSignal__Group__4_in_rule__UserDefinedSignal__Group__34170);
            rule__UserDefinedSignal__Group__4();
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
    // $ANTLR end rule__UserDefinedSignal__Group__3


    // $ANTLR start rule__UserDefinedSignal__Group__4
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2037:1: rule__UserDefinedSignal__Group__4 : ( ( rule__UserDefinedSignal__Group_4__0 )? ) rule__UserDefinedSignal__Group__5 ;
    public final void rule__UserDefinedSignal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2041:1: ( ( ( rule__UserDefinedSignal__Group_4__0 )? ) rule__UserDefinedSignal__Group__5 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2042:1: ( ( rule__UserDefinedSignal__Group_4__0 )? ) rule__UserDefinedSignal__Group__5
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2042:1: ( ( rule__UserDefinedSignal__Group_4__0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2043:1: ( rule__UserDefinedSignal__Group_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getGroup_4()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2044:1: ( rule__UserDefinedSignal__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2044:2: rule__UserDefinedSignal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__UserDefinedSignal__Group_4__0_in_rule__UserDefinedSignal__Group__44198);
                    rule__UserDefinedSignal__Group_4__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getGroup_4()); 
            }

            }

            pushFollow(FOLLOW_rule__UserDefinedSignal__Group__5_in_rule__UserDefinedSignal__Group__44208);
            rule__UserDefinedSignal__Group__5();
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
    // $ANTLR end rule__UserDefinedSignal__Group__4


    // $ANTLR start rule__UserDefinedSignal__Group__5
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2055:1: rule__UserDefinedSignal__Group__5 : ( ( rule__UserDefinedSignal__Group_5__0 )? ) rule__UserDefinedSignal__Group__6 ;
    public final void rule__UserDefinedSignal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2059:1: ( ( ( rule__UserDefinedSignal__Group_5__0 )? ) rule__UserDefinedSignal__Group__6 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2060:1: ( ( rule__UserDefinedSignal__Group_5__0 )? ) rule__UserDefinedSignal__Group__6
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2060:1: ( ( rule__UserDefinedSignal__Group_5__0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2061:1: ( rule__UserDefinedSignal__Group_5__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getGroup_5()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2062:1: ( rule__UserDefinedSignal__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2062:2: rule__UserDefinedSignal__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__UserDefinedSignal__Group_5__0_in_rule__UserDefinedSignal__Group__54236);
                    rule__UserDefinedSignal__Group_5__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getGroup_5()); 
            }

            }

            pushFollow(FOLLOW_rule__UserDefinedSignal__Group__6_in_rule__UserDefinedSignal__Group__54246);
            rule__UserDefinedSignal__Group__6();
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
    // $ANTLR end rule__UserDefinedSignal__Group__5


    // $ANTLR start rule__UserDefinedSignal__Group__6
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2073:1: rule__UserDefinedSignal__Group__6 : ( ( rule__UserDefinedSignal__HostCombineOperatorAssignment_6 )? ) ;
    public final void rule__UserDefinedSignal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2077:1: ( ( ( rule__UserDefinedSignal__HostCombineOperatorAssignment_6 )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2078:1: ( ( rule__UserDefinedSignal__HostCombineOperatorAssignment_6 )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2078:1: ( ( rule__UserDefinedSignal__HostCombineOperatorAssignment_6 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2079:1: ( rule__UserDefinedSignal__HostCombineOperatorAssignment_6 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getHostCombineOperatorAssignment_6()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2080:1: ( rule__UserDefinedSignal__HostCombineOperatorAssignment_6 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2080:2: rule__UserDefinedSignal__HostCombineOperatorAssignment_6
                    {
                    pushFollow(FOLLOW_rule__UserDefinedSignal__HostCombineOperatorAssignment_6_in_rule__UserDefinedSignal__Group__64274);
                    rule__UserDefinedSignal__HostCombineOperatorAssignment_6();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getHostCombineOperatorAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedSignal__Group__6


    // $ANTLR start rule__UserDefinedSignal__Group_4__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2104:1: rule__UserDefinedSignal__Group_4__0 : ( ':=' ) rule__UserDefinedSignal__Group_4__1 ;
    public final void rule__UserDefinedSignal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2108:1: ( ( ':=' ) rule__UserDefinedSignal__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2109:1: ( ':=' ) rule__UserDefinedSignal__Group_4__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2109:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2110:1: ':='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getColonEqualsSignKeyword_4_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__UserDefinedSignal__Group_4__04324); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getColonEqualsSignKeyword_4_0()); 
            }

            }

            pushFollow(FOLLOW_rule__UserDefinedSignal__Group_4__1_in_rule__UserDefinedSignal__Group_4__04334);
            rule__UserDefinedSignal__Group_4__1();
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
    // $ANTLR end rule__UserDefinedSignal__Group_4__0


    // $ANTLR start rule__UserDefinedSignal__Group_4__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2124:1: rule__UserDefinedSignal__Group_4__1 : ( ( rule__UserDefinedSignal__InitialValueAssignment_4_1 ) ) ;
    public final void rule__UserDefinedSignal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2128:1: ( ( ( rule__UserDefinedSignal__InitialValueAssignment_4_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2129:1: ( ( rule__UserDefinedSignal__InitialValueAssignment_4_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2129:1: ( ( rule__UserDefinedSignal__InitialValueAssignment_4_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2130:1: ( rule__UserDefinedSignal__InitialValueAssignment_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getInitialValueAssignment_4_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2131:1: ( rule__UserDefinedSignal__InitialValueAssignment_4_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2131:2: rule__UserDefinedSignal__InitialValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__UserDefinedSignal__InitialValueAssignment_4_1_in_rule__UserDefinedSignal__Group_4__14362);
            rule__UserDefinedSignal__InitialValueAssignment_4_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getInitialValueAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedSignal__Group_4__1


    // $ANTLR start rule__UserDefinedSignal__Group_5__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2145:1: rule__UserDefinedSignal__Group_5__0 : ( ':' ) rule__UserDefinedSignal__Group_5__1 ;
    public final void rule__UserDefinedSignal__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2149:1: ( ( ':' ) rule__UserDefinedSignal__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2150:1: ( ':' ) rule__UserDefinedSignal__Group_5__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2150:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2151:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getColonKeyword_5_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__UserDefinedSignal__Group_5__04401); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getColonKeyword_5_0()); 
            }

            }

            pushFollow(FOLLOW_rule__UserDefinedSignal__Group_5__1_in_rule__UserDefinedSignal__Group_5__04411);
            rule__UserDefinedSignal__Group_5__1();
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
    // $ANTLR end rule__UserDefinedSignal__Group_5__0


    // $ANTLR start rule__UserDefinedSignal__Group_5__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2165:1: rule__UserDefinedSignal__Group_5__1 : ( ( 'combine' )? ) rule__UserDefinedSignal__Group_5__2 ;
    public final void rule__UserDefinedSignal__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2169:1: ( ( ( 'combine' )? ) rule__UserDefinedSignal__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2170:1: ( ( 'combine' )? ) rule__UserDefinedSignal__Group_5__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2170:1: ( ( 'combine' )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2171:1: ( 'combine' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getCombineKeyword_5_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2172:1: ( 'combine' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2173:2: 'combine'
                    {
                    match(input,39,FOLLOW_39_in_rule__UserDefinedSignal__Group_5__14441); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getCombineKeyword_5_1()); 
            }

            }

            pushFollow(FOLLOW_rule__UserDefinedSignal__Group_5__2_in_rule__UserDefinedSignal__Group_5__14453);
            rule__UserDefinedSignal__Group_5__2();
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
    // $ANTLR end rule__UserDefinedSignal__Group_5__1


    // $ANTLR start rule__UserDefinedSignal__Group_5__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2185:1: rule__UserDefinedSignal__Group_5__2 : ( ( rule__UserDefinedSignal__TypeAssignment_5_2 ) ) rule__UserDefinedSignal__Group_5__3 ;
    public final void rule__UserDefinedSignal__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2189:1: ( ( ( rule__UserDefinedSignal__TypeAssignment_5_2 ) ) rule__UserDefinedSignal__Group_5__3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2190:1: ( ( rule__UserDefinedSignal__TypeAssignment_5_2 ) ) rule__UserDefinedSignal__Group_5__3
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2190:1: ( ( rule__UserDefinedSignal__TypeAssignment_5_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2191:1: ( rule__UserDefinedSignal__TypeAssignment_5_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getTypeAssignment_5_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2192:1: ( rule__UserDefinedSignal__TypeAssignment_5_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2192:2: rule__UserDefinedSignal__TypeAssignment_5_2
            {
            pushFollow(FOLLOW_rule__UserDefinedSignal__TypeAssignment_5_2_in_rule__UserDefinedSignal__Group_5__24481);
            rule__UserDefinedSignal__TypeAssignment_5_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getTypeAssignment_5_2()); 
            }

            }

            pushFollow(FOLLOW_rule__UserDefinedSignal__Group_5__3_in_rule__UserDefinedSignal__Group_5__24490);
            rule__UserDefinedSignal__Group_5__3();
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
    // $ANTLR end rule__UserDefinedSignal__Group_5__2


    // $ANTLR start rule__UserDefinedSignal__Group_5__3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2203:1: rule__UserDefinedSignal__Group_5__3 : ( ( rule__UserDefinedSignal__Group_5_3__0 )? ) ;
    public final void rule__UserDefinedSignal__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2207:1: ( ( ( rule__UserDefinedSignal__Group_5_3__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2208:1: ( ( rule__UserDefinedSignal__Group_5_3__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2208:1: ( ( rule__UserDefinedSignal__Group_5_3__0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2209:1: ( rule__UserDefinedSignal__Group_5_3__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getGroup_5_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2210:1: ( rule__UserDefinedSignal__Group_5_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2210:2: rule__UserDefinedSignal__Group_5_3__0
                    {
                    pushFollow(FOLLOW_rule__UserDefinedSignal__Group_5_3__0_in_rule__UserDefinedSignal__Group_5__34518);
                    rule__UserDefinedSignal__Group_5_3__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getGroup_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedSignal__Group_5__3


    // $ANTLR start rule__UserDefinedSignal__Group_5_3__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2228:1: rule__UserDefinedSignal__Group_5_3__0 : ( 'with' ) rule__UserDefinedSignal__Group_5_3__1 ;
    public final void rule__UserDefinedSignal__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2232:1: ( ( 'with' ) rule__UserDefinedSignal__Group_5_3__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2233:1: ( 'with' ) rule__UserDefinedSignal__Group_5_3__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2233:1: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2234:1: 'with'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getWithKeyword_5_3_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__UserDefinedSignal__Group_5_3__04562); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getWithKeyword_5_3_0()); 
            }

            }

            pushFollow(FOLLOW_rule__UserDefinedSignal__Group_5_3__1_in_rule__UserDefinedSignal__Group_5_3__04572);
            rule__UserDefinedSignal__Group_5_3__1();
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
    // $ANTLR end rule__UserDefinedSignal__Group_5_3__0


    // $ANTLR start rule__UserDefinedSignal__Group_5_3__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2248:1: rule__UserDefinedSignal__Group_5_3__1 : ( ( rule__UserDefinedSignal__CombineOperatorAssignment_5_3_1 ) ) ;
    public final void rule__UserDefinedSignal__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2252:1: ( ( ( rule__UserDefinedSignal__CombineOperatorAssignment_5_3_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2253:1: ( ( rule__UserDefinedSignal__CombineOperatorAssignment_5_3_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2253:1: ( ( rule__UserDefinedSignal__CombineOperatorAssignment_5_3_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2254:1: ( rule__UserDefinedSignal__CombineOperatorAssignment_5_3_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getCombineOperatorAssignment_5_3_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2255:1: ( rule__UserDefinedSignal__CombineOperatorAssignment_5_3_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2255:2: rule__UserDefinedSignal__CombineOperatorAssignment_5_3_1
            {
            pushFollow(FOLLOW_rule__UserDefinedSignal__CombineOperatorAssignment_5_3_1_in_rule__UserDefinedSignal__Group_5_3__14600);
            rule__UserDefinedSignal__CombineOperatorAssignment_5_3_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getCombineOperatorAssignment_5_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedSignal__Group_5_3__1


    // $ANTLR start rule__Variable__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2269:1: rule__Variable__Group__0 : ( ( rule__Variable__TypeAssignment_0 ) ) rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2273:1: ( ( ( rule__Variable__TypeAssignment_0 ) ) rule__Variable__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2274:1: ( ( rule__Variable__TypeAssignment_0 ) ) rule__Variable__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2274:1: ( ( rule__Variable__TypeAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2275:1: ( rule__Variable__TypeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2276:1: ( rule__Variable__TypeAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2276:2: rule__Variable__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable__TypeAssignment_0_in_rule__Variable__Group__04638);
            rule__Variable__TypeAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getTypeAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__04647);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2287:1: rule__Variable__Group__1 : ( ( rule__Variable__NameAssignment_1 ) ) rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2291:1: ( ( ( rule__Variable__NameAssignment_1 ) ) rule__Variable__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2292:1: ( ( rule__Variable__NameAssignment_1 ) ) rule__Variable__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2292:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2293:1: ( rule__Variable__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2294:1: ( rule__Variable__NameAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2294:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__14675);
            rule__Variable__NameAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__14684);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2305:1: rule__Variable__Group__2 : ( ( rule__Variable__Group_2__0 )? ) ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2309:1: ( ( ( rule__Variable__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2310:1: ( ( rule__Variable__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2310:1: ( ( rule__Variable__Group_2__0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2311:1: ( rule__Variable__Group_2__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2312:1: ( rule__Variable__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2312:2: rule__Variable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Group__24712);
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


            }

        }
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


    // $ANTLR start rule__Variable__Group_2__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2328:1: rule__Variable__Group_2__0 : ( ':=' ) rule__Variable__Group_2__1 ;
    public final void rule__Variable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2332:1: ( ( ':=' ) rule__Variable__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2333:1: ( ':=' ) rule__Variable__Group_2__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2333:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2334:1: ':='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Variable__Group_2__04754); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__04764);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2348:1: rule__Variable__Group_2__1 : ( ( rule__Variable__InitialValueAssignment_2_1 ) ) ;
    public final void rule__Variable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2352:1: ( ( ( rule__Variable__InitialValueAssignment_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2353:1: ( ( rule__Variable__InitialValueAssignment_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2353:1: ( ( rule__Variable__InitialValueAssignment_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2354:1: ( rule__Variable__InitialValueAssignment_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getInitialValueAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2355:1: ( rule__Variable__InitialValueAssignment_2_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2355:2: rule__Variable__InitialValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Variable__InitialValueAssignment_2_1_in_rule__Variable__Group_2__14792);
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


    // $ANTLR start rule__State__IsInitialAssignment_0_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2369:1: rule__State__IsInitialAssignment_0_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2373:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2374:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2374:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2375:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2376:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2377:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__State__IsInitialAssignment_0_04835); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2392:1: rule__State__IsFinalAssignment_0_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2396:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2397:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2397:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2398:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2399:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2400:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__State__IsFinalAssignment_0_14879); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2415:1: rule__State__StateKindAssignment_0_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2419:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2420:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2420:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2421:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_24918);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2430:1: rule__State__IsInitialAssignment_0_3_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2434:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2435:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2435:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2436:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_3_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2437:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2438:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_3_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__State__IsInitialAssignment_0_3_04954); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2453:1: rule__State__IsFinalAssignment_0_3_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2457:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2458:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2458:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2459:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_3_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2460:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2461:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_3_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__State__IsFinalAssignment_0_3_14998); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2476:1: rule__State__IsInitialAssignment_0_4_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2480:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2481:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2481:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2482:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2483:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2484:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__State__IsInitialAssignment_0_4_05042); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2499:1: rule__State__StateKindAssignment_0_4_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2503:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2504:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2504:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2505:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_4_15081);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2514:1: rule__State__IsFinalAssignment_0_5_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2518:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2519:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2519:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2520:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2521:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2522:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__State__IsFinalAssignment_0_5_05117); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2537:1: rule__State__IsInitialAssignment_0_5_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2541:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2542:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2542:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2543:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_5_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2544:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2545:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_5_1_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__State__IsInitialAssignment_0_5_15161); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2560:1: rule__State__IsFinalAssignment_0_6_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2564:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2565:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2565:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2566:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2567:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2568:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__State__IsFinalAssignment_0_6_05205); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2583:1: rule__State__StateKindAssignment_0_6_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2587:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2588:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2588:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2589:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_6_15244);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2598:1: rule__State__StateKindAssignment_0_7_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2602:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2603:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2603:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2604:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_7_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_7_05275);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2613:1: rule__State__IsInitialAssignment_0_7_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2617:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2618:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2618:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2619:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2620:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2621:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__State__IsInitialAssignment_0_7_15311); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2636:1: rule__State__StateKindAssignment_0_8_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2640:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2641:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2641:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2642:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_8_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_8_05350);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2651:1: rule__State__IsFinalAssignment_0_8_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2655:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2656:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2656:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2657:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2658:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2659:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__State__IsFinalAssignment_0_8_15386); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2674:1: rule__State__IsInitialAssignment_0_9_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2678:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2679:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2679:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2680:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2681:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2682:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__State__IsInitialAssignment_0_9_05430); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2697:1: rule__State__IsFinalAssignment_0_9_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2701:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2702:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2702:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2703:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2704:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2705:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__State__IsFinalAssignment_0_9_15474); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2720:1: rule__State__StateKindAssignment_0_9_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2724:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2725:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2725:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2726:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_9_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_9_25513);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2735:1: rule__State__IsInitialAssignment_0_10_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2739:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2740:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2740:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2741:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2742:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2743:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__State__IsInitialAssignment_0_10_05549); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2758:1: rule__State__StateKindAssignment_0_10_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2762:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2763:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2763:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2764:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_10_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_10_15588);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2773:1: rule__State__IsFinalAssignment_0_10_2 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2777:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2778:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2778:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2779:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2780:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2781:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_2_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__State__IsFinalAssignment_0_10_25624); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2796:1: rule__State__IsFinalAssignment_0_11_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2800:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2801:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2801:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2802:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2803:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2804:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__State__IsFinalAssignment_0_11_05668); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2819:1: rule__State__IsInitialAssignment_0_11_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2823:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2824:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2824:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2825:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2826:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2827:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_1_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__State__IsInitialAssignment_0_11_15712); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2842:1: rule__State__StateKindAssignment_0_11_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2846:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2847:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2847:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2848:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_11_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_11_25751);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2857:1: rule__State__IsFinalAssignment_0_12_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2861:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2862:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2862:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2863:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2864:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2865:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__State__IsFinalAssignment_0_12_05787); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2880:1: rule__State__StateKindAssignment_0_12_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2884:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2885:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2885:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2886:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_12_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_12_15826);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2895:1: rule__State__IsInitialAssignment_0_12_2 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2899:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2900:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2900:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2901:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2902:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2903:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_2_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__State__IsInitialAssignment_0_12_25862); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2918:1: rule__State__StateKindAssignment_0_13_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2922:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2923:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2923:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2924:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_13_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_13_05901);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2933:1: rule__State__IsFinalAssignment_0_13_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2937:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2938:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2938:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2939:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2940:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2941:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__State__IsFinalAssignment_0_13_15937); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2956:1: rule__State__IsInitialAssignment_0_13_2 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2960:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2961:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2961:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2962:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2963:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2964:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_2_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__State__IsInitialAssignment_0_13_25981); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2979:1: rule__State__StateKindAssignment_0_14_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2983:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2984:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2984:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2985:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_14_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_14_06020);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2994:1: rule__State__IsInitialAssignment_0_14_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2998:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2999:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:2999:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3000:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3001:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3002:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_1_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__State__IsInitialAssignment_0_14_16056); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3017:1: rule__State__IsFinalAssignment_0_14_2 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3021:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3022:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3022:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3023:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3024:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3025:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_2_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__State__IsFinalAssignment_0_14_26100); if (failed) return ;
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


    // $ANTLR start rule__State__StateIDAssignment_2_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3040:1: rule__State__StateIDAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__State__StateIDAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3044:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3045:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3045:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3046:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateIDIDTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__StateIDAssignment_2_06139); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateIDIDTerminalRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__StateIDAssignment_2_0


    // $ANTLR start rule__State__StateLabelAssignment_2_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3055:1: rule__State__StateLabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__State__StateLabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3059:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3060:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3060:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3061:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateLabelSTRINGTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__StateLabelAssignment_2_16170); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateLabelSTRINGTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__StateLabelAssignment_2_1


    // $ANTLR start rule__State__BodyTextAssignment_2_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3070:1: rule__State__BodyTextAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__State__BodyTextAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3074:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3075:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3075:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3076:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getBodyTextSTRINGTerminalRuleCall_2_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__BodyTextAssignment_2_26201); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getBodyTextSTRINGTerminalRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__BodyTextAssignment_2_2


    // $ANTLR start rule__State__StateContentAssignment_2_3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3085:1: rule__State__StateContentAssignment_2_3 : ( ruleStateContent ) ;
    public final void rule__State__StateContentAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3089:1: ( ( ruleStateContent ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3090:1: ( ruleStateContent )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3090:1: ( ruleStateContent )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3091:1: ruleStateContent
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateContentStateContentParserRuleCall_2_3_0()); 
            }
            pushFollow(FOLLOW_ruleStateContent_in_rule__State__StateContentAssignment_2_36232);
            ruleStateContent();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateContentStateContentParserRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__StateContentAssignment_2_3


    // $ANTLR start rule__StateContent__EntryActionsAssignment_1_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3100:1: rule__StateContent__EntryActionsAssignment_1_0 : ( ruleEntryAction ) ;
    public final void rule__StateContent__EntryActionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3104:1: ( ( ruleEntryAction ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3105:1: ( ruleEntryAction )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3105:1: ( ruleEntryAction )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3106:1: ruleEntryAction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getEntryActionsEntryActionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleEntryAction_in_rule__StateContent__EntryActionsAssignment_1_06263);
            ruleEntryAction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getEntryActionsEntryActionParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateContent__EntryActionsAssignment_1_0


    // $ANTLR start rule__StateContent__InnerActionAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3115:1: rule__StateContent__InnerActionAssignment_1_1 : ( ruleInnerAction ) ;
    public final void rule__StateContent__InnerActionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3119:1: ( ( ruleInnerAction ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3120:1: ( ruleInnerAction )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3120:1: ( ruleInnerAction )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3121:1: ruleInnerAction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getInnerActionInnerActionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleInnerAction_in_rule__StateContent__InnerActionAssignment_1_16294);
            ruleInnerAction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getInnerActionInnerActionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateContent__InnerActionAssignment_1_1


    // $ANTLR start rule__StateContent__ExitActionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3130:1: rule__StateContent__ExitActionsAssignment_1_2 : ( ruleExitAction ) ;
    public final void rule__StateContent__ExitActionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3134:1: ( ( ruleExitAction ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3135:1: ( ruleExitAction )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3135:1: ( ruleExitAction )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3136:1: ruleExitAction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getExitActionsExitActionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExitAction_in_rule__StateContent__ExitActionsAssignment_1_26325);
            ruleExitAction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getExitActionsExitActionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateContent__ExitActionsAssignment_1_2


    // $ANTLR start rule__StateContent__SuspensionTriggerAssignment_1_3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3145:1: rule__StateContent__SuspensionTriggerAssignment_1_3 : ( ruleSuspension ) ;
    public final void rule__StateContent__SuspensionTriggerAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3149:1: ( ( ruleSuspension ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3150:1: ( ruleSuspension )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3150:1: ( ruleSuspension )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3151:1: ruleSuspension
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getSuspensionTriggerSuspensionParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleSuspension_in_rule__StateContent__SuspensionTriggerAssignment_1_36356);
            ruleSuspension();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getSuspensionTriggerSuspensionParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateContent__SuspensionTriggerAssignment_1_3


    // $ANTLR start rule__StateContent__SignalsAssignment_1_4
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3160:1: rule__StateContent__SignalsAssignment_1_4 : ( ruleSignal ) ;
    public final void rule__StateContent__SignalsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3164:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3165:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3165:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3166:1: ruleSignal
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getSignalsSignalParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_ruleSignal_in_rule__StateContent__SignalsAssignment_1_46387);
            ruleSignal();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getSignalsSignalParserRuleCall_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateContent__SignalsAssignment_1_4


    // $ANTLR start rule__StateContent__NewStateIDAssignment_2_0_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3175:1: rule__StateContent__NewStateIDAssignment_2_0_0 : ( RULE_ID ) ;
    public final void rule__StateContent__NewStateIDAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3179:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3180:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3180:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3181:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getNewStateIDIDTerminalRuleCall_2_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateContent__NewStateIDAssignment_2_0_06418); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getNewStateIDIDTerminalRuleCall_2_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateContent__NewStateIDAssignment_2_0_0


    // $ANTLR start rule__StateContent__ReferencedStateAssignment_2_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3190:1: rule__StateContent__ReferencedStateAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__StateContent__ReferencedStateAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3194:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3195:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3195:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3196:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getReferencedStateIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateContent__ReferencedStateAssignment_2_16449); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getReferencedStateIDTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateContent__ReferencedStateAssignment_2_1


    // $ANTLR start rule__StateContent__SignalRenamingsAssignment_2_3_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3205:1: rule__StateContent__SignalRenamingsAssignment_2_3_0 : ( ruleSignalRenaming ) ;
    public final void rule__StateContent__SignalRenamingsAssignment_2_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3209:1: ( ( ruleSignalRenaming ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3210:1: ( ruleSignalRenaming )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3210:1: ( ruleSignalRenaming )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3211:1: ruleSignalRenaming
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getSignalRenamingsSignalRenamingParserRuleCall_2_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleSignalRenaming_in_rule__StateContent__SignalRenamingsAssignment_2_3_06480);
            ruleSignalRenaming();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getSignalRenamingsSignalRenamingParserRuleCall_2_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateContent__SignalRenamingsAssignment_2_3_0


    // $ANTLR start rule__StateContent__SignalRenamingsAssignment_2_4
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3220:1: rule__StateContent__SignalRenamingsAssignment_2_4 : ( ruleSignalRenaming ) ;
    public final void rule__StateContent__SignalRenamingsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3224:1: ( ( ruleSignalRenaming ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3225:1: ( ruleSignalRenaming )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3225:1: ( ruleSignalRenaming )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3226:1: ruleSignalRenaming
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateContentAccess().getSignalRenamingsSignalRenamingParserRuleCall_2_4_0()); 
            }
            pushFollow(FOLLOW_ruleSignalRenaming_in_rule__StateContent__SignalRenamingsAssignment_2_46511);
            ruleSignalRenaming();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateContentAccess().getSignalRenamingsSignalRenamingParserRuleCall_2_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateContent__SignalRenamingsAssignment_2_4


    // $ANTLR start rule__SignalRenaming__OldSignalAssignment_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3235:1: rule__SignalRenaming__OldSignalAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SignalRenaming__OldSignalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3239:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3240:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3240:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3241:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalRenamingAccess().getOldSignalSignalCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3242:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3243:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalRenamingAccess().getOldSignalSignalIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SignalRenaming__OldSignalAssignment_06546); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalRenamingAccess().getOldSignalSignalIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalRenamingAccess().getOldSignalSignalCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalRenaming__OldSignalAssignment_0


    // $ANTLR start rule__SignalRenaming__NewSignalAssignment_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3254:1: rule__SignalRenaming__NewSignalAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SignalRenaming__NewSignalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3258:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3259:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3259:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3260:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalRenamingAccess().getNewSignalSignalCrossReference_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3261:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3262:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalRenamingAccess().getNewSignalSignalIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SignalRenaming__NewSignalAssignment_26585); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalRenamingAccess().getNewSignalSignalIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalRenamingAccess().getNewSignalSignalCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalRenaming__NewSignalAssignment_2


    // $ANTLR start rule__EntryAction__EntryActionAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3273:1: rule__EntryAction__EntryActionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EntryAction__EntryActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3277:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3278:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3278:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3279:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEntryActionAccess().getEntryActionSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EntryAction__EntryActionAssignment_16620); if (failed) return ;
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


    // $ANTLR start rule__InnerAction__InnerActionAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3288:1: rule__InnerAction__InnerActionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InnerAction__InnerActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3292:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3293:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3293:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3294:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInnerActionAccess().getInnerActionSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InnerAction__InnerActionAssignment_16651); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInnerActionAccess().getInnerActionSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InnerAction__InnerActionAssignment_1


    // $ANTLR start rule__ExitAction__ExitActionAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3303:1: rule__ExitAction__ExitActionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ExitAction__ExitActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3307:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3308:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3308:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3309:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExitActionAccess().getExitActionSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExitAction__ExitActionAssignment_16682); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExitActionAccess().getExitActionSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExitAction__ExitActionAssignment_1


    // $ANTLR start rule__Suspension__SuspensionTriggerAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3318:1: rule__Suspension__SuspensionTriggerAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Suspension__SuspensionTriggerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3322:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3323:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3323:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3324:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSuspensionAccess().getSuspensionTriggerSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Suspension__SuspensionTriggerAssignment_16713); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSuspensionAccess().getSuspensionTriggerSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Suspension__SuspensionTriggerAssignment_1


    // $ANTLR start rule__PredefinedSignal__NameAssignment
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3333:1: rule__PredefinedSignal__NameAssignment : ( ( 'tick' ) ) ;
    public final void rule__PredefinedSignal__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3337:1: ( ( ( 'tick' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3338:1: ( ( 'tick' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3338:1: ( ( 'tick' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3339:1: ( 'tick' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPredefinedSignalAccess().getNameTickKeyword_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3340:1: ( 'tick' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3341:1: 'tick'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPredefinedSignalAccess().getNameTickKeyword_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__PredefinedSignal__NameAssignment6749); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPredefinedSignalAccess().getNameTickKeyword_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPredefinedSignalAccess().getNameTickKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PredefinedSignal__NameAssignment


    // $ANTLR start rule__UserDefinedSignal__IsLocalAssignment_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3356:1: rule__UserDefinedSignal__IsLocalAssignment_0 : ( ( 'local' ) ) ;
    public final void rule__UserDefinedSignal__IsLocalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3360:1: ( ( ( 'local' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3361:1: ( ( 'local' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3361:1: ( ( 'local' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3362:1: ( 'local' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getIsLocalLocalKeyword_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3363:1: ( 'local' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3364:1: 'local'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getIsLocalLocalKeyword_0_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__UserDefinedSignal__IsLocalAssignment_06793); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getIsLocalLocalKeyword_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getIsLocalLocalKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedSignal__IsLocalAssignment_0


    // $ANTLR start rule__UserDefinedSignal__IsInputAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3379:1: rule__UserDefinedSignal__IsInputAssignment_1 : ( ( 'input' ) ) ;
    public final void rule__UserDefinedSignal__IsInputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3383:1: ( ( ( 'input' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3384:1: ( ( 'input' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3384:1: ( ( 'input' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3385:1: ( 'input' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getIsInputInputKeyword_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3386:1: ( 'input' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3387:1: 'input'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getIsInputInputKeyword_1_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__UserDefinedSignal__IsInputAssignment_16837); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getIsInputInputKeyword_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getIsInputInputKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedSignal__IsInputAssignment_1


    // $ANTLR start rule__UserDefinedSignal__IsOutputAssignment_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3402:1: rule__UserDefinedSignal__IsOutputAssignment_2 : ( ( 'output' ) ) ;
    public final void rule__UserDefinedSignal__IsOutputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3406:1: ( ( ( 'output' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3407:1: ( ( 'output' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3407:1: ( ( 'output' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3408:1: ( 'output' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getIsOutputOutputKeyword_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3409:1: ( 'output' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3410:1: 'output'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getIsOutputOutputKeyword_2_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__UserDefinedSignal__IsOutputAssignment_26881); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getIsOutputOutputKeyword_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getIsOutputOutputKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedSignal__IsOutputAssignment_2


    // $ANTLR start rule__UserDefinedSignal__NameAssignment_3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3425:1: rule__UserDefinedSignal__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__UserDefinedSignal__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3429:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3430:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3430:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3431:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserDefinedSignal__NameAssignment_36920); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedSignal__NameAssignment_3


    // $ANTLR start rule__UserDefinedSignal__InitialValueAssignment_4_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3440:1: rule__UserDefinedSignal__InitialValueAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__UserDefinedSignal__InitialValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3444:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3445:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3445:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3446:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getInitialValueIDTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserDefinedSignal__InitialValueAssignment_4_16951); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getInitialValueIDTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedSignal__InitialValueAssignment_4_1


    // $ANTLR start rule__UserDefinedSignal__TypeAssignment_5_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3455:1: rule__UserDefinedSignal__TypeAssignment_5_2 : ( ruleValueType ) ;
    public final void rule__UserDefinedSignal__TypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3459:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3460:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3460:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3461:1: ruleValueType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getTypeValueTypeEnumRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueType_in_rule__UserDefinedSignal__TypeAssignment_5_26982);
            ruleValueType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getTypeValueTypeEnumRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedSignal__TypeAssignment_5_2


    // $ANTLR start rule__UserDefinedSignal__CombineOperatorAssignment_5_3_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3470:1: rule__UserDefinedSignal__CombineOperatorAssignment_5_3_1 : ( ruleCombineOperator ) ;
    public final void rule__UserDefinedSignal__CombineOperatorAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3474:1: ( ( ruleCombineOperator ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3475:1: ( ruleCombineOperator )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3475:1: ( ruleCombineOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3476:1: ruleCombineOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_5_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleCombineOperator_in_rule__UserDefinedSignal__CombineOperatorAssignment_5_3_17013);
            ruleCombineOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_5_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedSignal__CombineOperatorAssignment_5_3_1


    // $ANTLR start rule__UserDefinedSignal__HostCombineOperatorAssignment_6
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3485:1: rule__UserDefinedSignal__HostCombineOperatorAssignment_6 : ( RULE_STRING ) ;
    public final void rule__UserDefinedSignal__HostCombineOperatorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3489:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3490:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3490:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3491:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUserDefinedSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_6_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UserDefinedSignal__HostCombineOperatorAssignment_67044); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUserDefinedSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserDefinedSignal__HostCombineOperatorAssignment_6


    // $ANTLR start rule__Variable__TypeAssignment_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3500:1: rule__Variable__TypeAssignment_0 : ( ruleValueType ) ;
    public final void rule__Variable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3504:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3505:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3505:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3506:1: ruleValueType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValueType_in_rule__Variable__TypeAssignment_07075);
            ruleValueType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__TypeAssignment_0


    // $ANTLR start rule__Variable__NameAssignment_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3515:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3519:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3520:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3520:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3521:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_17106); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3530:1: rule__Variable__InitialValueAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Variable__InitialValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3534:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3535:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3535:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:3536:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getInitialValueIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__InitialValueAssignment_2_17137); if (failed) return ;
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

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:522:1: ( ( ( rule__StateContent__EntryActionsAssignment_1_0 ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:522:1: ( ( rule__StateContent__EntryActionsAssignment_1_0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:522:1: ( ( rule__StateContent__EntryActionsAssignment_1_0 ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:523:1: ( rule__StateContent__EntryActionsAssignment_1_0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStateContentAccess().getEntryActionsAssignment_1_0()); 
        }
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:524:1: ( rule__StateContent__EntryActionsAssignment_1_0 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:524:2: rule__StateContent__EntryActionsAssignment_1_0
        {
        pushFollow(FOLLOW_rule__StateContent__EntryActionsAssignment_1_0_in_synpred151131);
        rule__StateContent__EntryActionsAssignment_1_0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:528:6: ( ( ( rule__StateContent__InnerActionAssignment_1_1 ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:528:6: ( ( rule__StateContent__InnerActionAssignment_1_1 ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:528:6: ( ( rule__StateContent__InnerActionAssignment_1_1 ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:529:1: ( rule__StateContent__InnerActionAssignment_1_1 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStateContentAccess().getInnerActionAssignment_1_1()); 
        }
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:530:1: ( rule__StateContent__InnerActionAssignment_1_1 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:530:2: rule__StateContent__InnerActionAssignment_1_1
        {
        pushFollow(FOLLOW_rule__StateContent__InnerActionAssignment_1_1_in_synpred161149);
        rule__StateContent__InnerActionAssignment_1_1();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:534:6: ( ( ( rule__StateContent__ExitActionsAssignment_1_2 ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:534:6: ( ( rule__StateContent__ExitActionsAssignment_1_2 ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:534:6: ( ( rule__StateContent__ExitActionsAssignment_1_2 ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:535:1: ( rule__StateContent__ExitActionsAssignment_1_2 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStateContentAccess().getExitActionsAssignment_1_2()); 
        }
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:536:1: ( rule__StateContent__ExitActionsAssignment_1_2 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:536:2: rule__StateContent__ExitActionsAssignment_1_2
        {
        pushFollow(FOLLOW_rule__StateContent__ExitActionsAssignment_1_2_in_synpred171167);
        rule__StateContent__ExitActionsAssignment_1_2();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred18
    public final void synpred18_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:540:6: ( ( ( rule__StateContent__SuspensionTriggerAssignment_1_3 ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:540:6: ( ( rule__StateContent__SuspensionTriggerAssignment_1_3 ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:540:6: ( ( rule__StateContent__SuspensionTriggerAssignment_1_3 ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:541:1: ( rule__StateContent__SuspensionTriggerAssignment_1_3 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStateContentAccess().getSuspensionTriggerAssignment_1_3()); 
        }
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:542:1: ( rule__StateContent__SuspensionTriggerAssignment_1_3 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:542:2: rule__StateContent__SuspensionTriggerAssignment_1_3
        {
        pushFollow(FOLLOW_rule__StateContent__SuspensionTriggerAssignment_1_3_in_synpred181185);
        rule__StateContent__SuspensionTriggerAssignment_1_3();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:548:2: ( rule__StateContent__SignalsAssignment_1_4 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:548:2: rule__StateContent__SignalsAssignment_1_4
        {
        pushFollow(FOLLOW_rule__StateContent__SignalsAssignment_1_4_in_synpred191203);
        rule__StateContent__SignalsAssignment_1_4();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1391:2: ( rule__State__StateLabelAssignment_2_1 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1391:2: rule__State__StateLabelAssignment_2_1
        {
        pushFollow(FOLLOW_rule__State__StateLabelAssignment_2_1_in_synpred362941);
        rule__State__StateLabelAssignment_2_1();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1478:2: ( rule__StateContent__Alternatives_1 )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1478:2: rule__StateContent__Alternatives_1
        {
        pushFollow(FOLLOW_rule__StateContent__Alternatives_1_in_synpred393113);
        rule__StateContent__Alternatives_1();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred39

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
    public final boolean synpred19() {
        backtracking++;
        int start = input.mark();
        try {
            synpred19_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred18() {
        backtracking++;
        int start = input.mark();
        try {
            synpred18_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred36() {
        backtracking++;
        int start = input.mark();
        try {
            synpred36_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred15() {
        backtracking++;
        int start = input.mark();
        try {
            synpred15_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred16() {
        backtracking++;
        int start = input.mark();
        try {
            synpred16_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred17() {
        backtracking++;
        int start = input.mark();
        try {
            synpred17_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleSignalRenaming_in_entryRuleSignalRenaming186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalRenaming193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalRenaming__Group__0_in_ruleSignalRenaming220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_entryRuleEntryAction246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryAction253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryAction__Group__0_in_ruleEntryAction280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerAction_in_entryRuleInnerAction306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerAction313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerAction__Group__0_in_ruleInnerAction340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_entryRuleExitAction366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitAction373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExitAction__Group__0_in_ruleExitAction400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspension_in_entryRuleSuspension426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspension433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Suspension__Group__0_in_ruleSuspension460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Alternatives_in_ruleSignal522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefinedSignal_in_entryRulePredefinedSignal548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredefinedSignal555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredefinedSignal__NameAssignment_in_rulePredefinedSignal582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedSignal_in_entryRuleUserDefinedSignal608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserDefinedSignal615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group__0_in_ruleUserDefinedSignal642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Alternatives_in_ruleStateType739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CombineOperator__Alternatives_in_ruleCombineOperator775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueType__Alternatives_in_ruleValueType811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_0_in_rule__State__Alternatives_0846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_1_in_rule__State__Alternatives_0864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_2_in_rule__State__Alternatives_0882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_3__0_in_rule__State__Alternatives_0900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_4__0_in_rule__State__Alternatives_0918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_5__0_in_rule__State__Alternatives_0936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_6__0_in_rule__State__Alternatives_0954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_7__0_in_rule__State__Alternatives_0972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_8__0_in_rule__State__Alternatives_0990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__0_in_rule__State__Alternatives_01008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__0_in_rule__State__Alternatives_01026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__0_in_rule__State__Alternatives_01044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__0_in_rule__State__Alternatives_01062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__0_in_rule__State__Alternatives_01080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__0_in_rule__State__Alternatives_01098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__EntryActionsAssignment_1_0_in_rule__StateContent__Alternatives_11131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__InnerActionAssignment_1_1_in_rule__StateContent__Alternatives_11149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__ExitActionsAssignment_1_2_in_rule__StateContent__Alternatives_11167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__SuspensionTriggerAssignment_1_3_in_rule__StateContent__Alternatives_11185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__SignalsAssignment_1_4_in_rule__StateContent__Alternatives_11203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefinedSignal_in_rule__Signal__Alternatives1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDefinedSignal_in_rule__Signal__Alternatives1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__StateType__Alternatives1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StateType__Alternatives1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StateType__Alternatives1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StateType__Alternatives1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CombineOperator__Alternatives1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CombineOperator__Alternatives1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CombineOperator__Alternatives1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CombineOperator__Alternatives1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ValueType__Alternatives1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ValueType__Alternatives1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ValueType__Alternatives1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ValueType__Alternatives1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ValueType__Alternatives1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ValueType__Alternatives1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ValueType__Alternatives1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Alternatives_0_in_rule__State__Group__01649 = new BitSet(new long[]{0x0000000006000032L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__01659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__State__Group__11689 = new BitSet(new long[]{0x0000000004000032L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__11701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__0_in_rule__State__Group__21729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_3_0_in_rule__State__Group_0_3__01769 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__State__Group_0_3__1_in_rule__State__Group_0_3__01778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_3_1_in_rule__State__Group_0_3__11806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_4_0_in_rule__State__Group_0_4__01844 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_4__1_in_rule__State__Group_0_4__01853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_4_1_in_rule__State__Group_0_4__11881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_5_0_in_rule__State__Group_0_5__01919 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__State__Group_0_5__1_in_rule__State__Group_0_5__01928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_5_1_in_rule__State__Group_0_5__11956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_6_0_in_rule__State__Group_0_6__01994 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_6__1_in_rule__State__Group_0_6__02003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_6_1_in_rule__State__Group_0_6__12031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_7_0_in_rule__State__Group_0_7__02069 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__State__Group_0_7__1_in_rule__State__Group_0_7__02078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_7_1_in_rule__State__Group_0_7__12106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_8_0_in_rule__State__Group_0_8__02144 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__State__Group_0_8__1_in_rule__State__Group_0_8__02153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_8_1_in_rule__State__Group_0_8__12181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_9_0_in_rule__State__Group_0_9__02219 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__1_in_rule__State__Group_0_9__02228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_9_1_in_rule__State__Group_0_9__12256 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__2_in_rule__State__Group_0_9__12265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_9_2_in_rule__State__Group_0_9__22293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_10_0_in_rule__State__Group_0_10__02333 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__1_in_rule__State__Group_0_10__02342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_10_1_in_rule__State__Group_0_10__12370 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__2_in_rule__State__Group_0_10__12379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_10_2_in_rule__State__Group_0_10__22407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_11_0_in_rule__State__Group_0_11__02447 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__1_in_rule__State__Group_0_11__02456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_11_1_in_rule__State__Group_0_11__12484 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__2_in_rule__State__Group_0_11__12493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_11_2_in_rule__State__Group_0_11__22521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_12_0_in_rule__State__Group_0_12__02561 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__1_in_rule__State__Group_0_12__02570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_12_1_in_rule__State__Group_0_12__12598 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__2_in_rule__State__Group_0_12__12607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_12_2_in_rule__State__Group_0_12__22635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_13_0_in_rule__State__Group_0_13__02675 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__1_in_rule__State__Group_0_13__02684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_13_1_in_rule__State__Group_0_13__12712 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__2_in_rule__State__Group_0_13__12721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_13_2_in_rule__State__Group_0_13__22749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_14_0_in_rule__State__Group_0_14__02789 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__1_in_rule__State__Group_0_14__02798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_14_1_in_rule__State__Group_0_14__12826 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__2_in_rule__State__Group_0_14__12835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_14_2_in_rule__State__Group_0_14__22863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateIDAssignment_2_0_in_rule__State__Group_2__02903 = new BitSet(new long[]{0x0000000004000022L});
    public static final BitSet FOLLOW_rule__State__Group_2__1_in_rule__State__Group_2__02913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateLabelAssignment_2_1_in_rule__State__Group_2__12941 = new BitSet(new long[]{0x0000000004000022L});
    public static final BitSet FOLLOW_rule__State__Group_2__2_in_rule__State__Group_2__12951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__BodyTextAssignment_2_2_in_rule__State__Group_2__22979 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__3_in_rule__State__Group_2__22989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateContentAssignment_2_3_in_rule__State__Group_2__33017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StateContent__Group__03061 = new BitSet(new long[]{0x0000181E08000010L});
    public static final BitSet FOLLOW_rule__StateContent__Group__1_in_rule__StateContent__Group__03071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__13101 = new BitSet(new long[]{0x0000181E08000010L});
    public static final BitSet FOLLOW_rule__StateContent__Alternatives_1_in_rule__StateContent__Group__13113 = new BitSet(new long[]{0x0000181E08000010L});
    public static final BitSet FOLLOW_rule__StateContent__Group__2_in_rule__StateContent__Group__13125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Group_2__0_in_rule__StateContent__Group__23153 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__StateContent__Group__3_in_rule__StateContent__Group__23163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StateContent__Group__33192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Group_2_0__0_in_rule__StateContent__Group_2__03235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateContent__Group_2__1_in_rule__StateContent__Group_2__03245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__ReferencedStateAssignment_2_1_in_rule__StateContent__Group_2__13273 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__StateContent__Group_2__2_in_rule__StateContent__Group_2__13282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StateContent__Group_2__23311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateContent__Group_2__3_in_rule__StateContent__Group_2__23321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Group_2_3__0_in_rule__StateContent__Group_2__33349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateContent__Group_2__4_in_rule__StateContent__Group_2__33359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__SignalRenamingsAssignment_2_4_in_rule__StateContent__Group_2__43387 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__StateContent__Group_2__5_in_rule__StateContent__Group_2__43396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StateContent__Group_2__53425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__NewStateIDAssignment_2_0_0_in_rule__StateContent__Group_2_0__03472 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__StateContent__Group_2_0__1_in_rule__StateContent__Group_2_0__03481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StateContent__Group_2_0__13510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__SignalRenamingsAssignment_2_3_0_in_rule__StateContent__Group_2_3__03549 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__StateContent__Group_2_3__1_in_rule__StateContent__Group_2_3__03558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__StateContent__Group_2_3__13587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalRenaming__OldSignalAssignment_0_in_rule__SignalRenaming__Group__03626 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SignalRenaming__Group__1_in_rule__SignalRenaming__Group__03635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SignalRenaming__Group__13664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SignalRenaming__Group__2_in_rule__SignalRenaming__Group__13674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalRenaming__NewSignalAssignment_2_in_rule__SignalRenaming__Group__23702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EntryAction__Group__03743 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EntryAction__Group__1_in_rule__EntryAction__Group__03753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntryAction__EntryActionAssignment_1_in_rule__EntryAction__Group__13781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__InnerAction__Group__03820 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InnerAction__Group__1_in_rule__InnerAction__Group__03830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerAction__InnerActionAssignment_1_in_rule__InnerAction__Group__13858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ExitAction__Group__03897 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExitAction__Group__1_in_rule__ExitAction__Group__03907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExitAction__ExitActionAssignment_1_in_rule__ExitAction__Group__13935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Suspension__Group__03974 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Suspension__Group__1_in_rule__Suspension__Group__03984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Suspension__SuspensionTriggerAssignment_1_in_rule__Suspension__Group__14012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__IsLocalAssignment_0_in_rule__UserDefinedSignal__Group__04050 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group__1_in_rule__UserDefinedSignal__Group__04059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__IsInputAssignment_1_in_rule__UserDefinedSignal__Group__14087 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group__2_in_rule__UserDefinedSignal__Group__14096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__IsOutputAssignment_2_in_rule__UserDefinedSignal__Group__24124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group__3_in_rule__UserDefinedSignal__Group__24133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__NameAssignment_3_in_rule__UserDefinedSignal__Group__34161 = new BitSet(new long[]{0x0000006000000022L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group__4_in_rule__UserDefinedSignal__Group__34170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group_4__0_in_rule__UserDefinedSignal__Group__44198 = new BitSet(new long[]{0x0000004000000022L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group__5_in_rule__UserDefinedSignal__Group__44208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group_5__0_in_rule__UserDefinedSignal__Group__54236 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group__6_in_rule__UserDefinedSignal__Group__54246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__HostCombineOperatorAssignment_6_in_rule__UserDefinedSignal__Group__64274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__UserDefinedSignal__Group_4__04324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group_4__1_in_rule__UserDefinedSignal__Group_4__04334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__InitialValueAssignment_4_1_in_rule__UserDefinedSignal__Group_4__14362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__UserDefinedSignal__Group_5__04401 = new BitSet(new long[]{0x0000008001FC0000L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group_5__1_in_rule__UserDefinedSignal__Group_5__04411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__UserDefinedSignal__Group_5__14441 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group_5__2_in_rule__UserDefinedSignal__Group_5__14453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__TypeAssignment_5_2_in_rule__UserDefinedSignal__Group_5__24481 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group_5__3_in_rule__UserDefinedSignal__Group_5__24490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group_5_3__0_in_rule__UserDefinedSignal__Group_5__34518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__UserDefinedSignal__Group_5_3__04562 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__Group_5_3__1_in_rule__UserDefinedSignal__Group_5_3__04572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDefinedSignal__CombineOperatorAssignment_5_3_1_in_rule__UserDefinedSignal__Group_5_3__14600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__TypeAssignment_0_in_rule__Variable__Group__04638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__04647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__14675 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__14684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Group__24712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Variable__Group_2__04754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__04764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__InitialValueAssignment_2_1_in_rule__Variable__Group_2__14792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__State__IsInitialAssignment_0_04835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__State__IsFinalAssignment_0_14879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_24918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__State__IsInitialAssignment_0_3_04954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__State__IsFinalAssignment_0_3_14998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__State__IsInitialAssignment_0_4_05042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_4_15081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__State__IsFinalAssignment_0_5_05117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__State__IsInitialAssignment_0_5_15161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__State__IsFinalAssignment_0_6_05205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_6_15244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_7_05275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__State__IsInitialAssignment_0_7_15311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_8_05350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__State__IsFinalAssignment_0_8_15386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__State__IsInitialAssignment_0_9_05430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__State__IsFinalAssignment_0_9_15474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_9_25513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__State__IsInitialAssignment_0_10_05549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_10_15588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__State__IsFinalAssignment_0_10_25624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__State__IsFinalAssignment_0_11_05668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__State__IsInitialAssignment_0_11_15712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_11_25751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__State__IsFinalAssignment_0_12_05787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_12_15826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__State__IsInitialAssignment_0_12_25862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_13_05901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__State__IsFinalAssignment_0_13_15937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__State__IsInitialAssignment_0_13_25981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_14_06020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__State__IsInitialAssignment_0_14_16056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__State__IsFinalAssignment_0_14_26100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__StateIDAssignment_2_06139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__StateLabelAssignment_2_16170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__BodyTextAssignment_2_26201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateContent_in_rule__State__StateContentAssignment_2_36232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_rule__StateContent__EntryActionsAssignment_1_06263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerAction_in_rule__StateContent__InnerActionAssignment_1_16294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_rule__StateContent__ExitActionsAssignment_1_26325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspension_in_rule__StateContent__SuspensionTriggerAssignment_1_36356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__StateContent__SignalsAssignment_1_46387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateContent__NewStateIDAssignment_2_0_06418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateContent__ReferencedStateAssignment_2_16449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalRenaming_in_rule__StateContent__SignalRenamingsAssignment_2_3_06480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalRenaming_in_rule__StateContent__SignalRenamingsAssignment_2_46511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SignalRenaming__OldSignalAssignment_06546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SignalRenaming__NewSignalAssignment_26585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EntryAction__EntryActionAssignment_16620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InnerAction__InnerActionAssignment_16651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExitAction__ExitActionAssignment_16682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Suspension__SuspensionTriggerAssignment_16713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__PredefinedSignal__NameAssignment6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__UserDefinedSignal__IsLocalAssignment_06793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__UserDefinedSignal__IsInputAssignment_16837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__UserDefinedSignal__IsOutputAssignment_26881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserDefinedSignal__NameAssignment_36920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserDefinedSignal__InitialValueAssignment_4_16951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__UserDefinedSignal__TypeAssignment_5_26982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_rule__UserDefinedSignal__CombineOperatorAssignment_5_3_17013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UserDefinedSignal__HostCombineOperatorAssignment_67044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Variable__TypeAssignment_07075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_17106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__InitialValueAssignment_2_17137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__EntryActionsAssignment_1_0_in_synpred151131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__InnerActionAssignment_1_1_in_synpred161149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__ExitActionsAssignment_1_2_in_synpred171167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__SuspensionTriggerAssignment_1_3_in_synpred181185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__SignalsAssignment_1_4_in_synpred191203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateLabelAssignment_2_1_in_synpred362941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateContent__Alternatives_1_in_synpred393113 = new BitSet(new long[]{0x0000000000000002L});

}