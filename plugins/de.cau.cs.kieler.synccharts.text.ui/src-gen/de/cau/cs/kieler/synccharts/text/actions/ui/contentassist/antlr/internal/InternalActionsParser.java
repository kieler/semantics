package de.cau.cs.kieler.synccharts.text.actions.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.cau.cs.kieler.synccharts.text.actions.services.ActionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalActionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?'", "'not'", "'pre'", "'or'", "'and'", "'/'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'+'", "'-'", "'*'", "'mod'", "','", "'('", "')'", "':='", "'#'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=4;
    public static final int RULE_WS=11;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalActionsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[365+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g"; }


     
     	private ActionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ActionsGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleAction
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:62:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:63:1: ( ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:64:1: ruleAction EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction67);
            ruleAction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getActionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction74); if (failed) return ;

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
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:71:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:75:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:76:1: ( ( rule__Action__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:76:1: ( ( rule__Action__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:77:1: ( rule__Action__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:78:1: ( rule__Action__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:78:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction100);
            rule__Action__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleEffect
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:90:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:91:1: ( ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:92:1: ruleEffect EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEffectRule()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect127);
            ruleEffect();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEffectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect134); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:99:1: ruleEffect : ( ( rule__Effect__Alternatives ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:103:2: ( ( ( rule__Effect__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:104:1: ( ( rule__Effect__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:104:1: ( ( rule__Effect__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:105:1: ( rule__Effect__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEffectAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:106:1: ( rule__Effect__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:106:2: rule__Effect__Alternatives
            {
            pushFollow(FOLLOW_rule__Effect__Alternatives_in_ruleEffect160);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:118:1: entryRuleEmission : ruleEmission EOF ;
    public final void entryRuleEmission() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:119:1: ( ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:120:1: ruleEmission EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission187);
            ruleEmission();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission194); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:127:1: ruleEmission : ( ( rule__Emission__Group__0 ) ) ;
    public final void ruleEmission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:131:2: ( ( ( rule__Emission__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:132:1: ( ( rule__Emission__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:132:1: ( ( rule__Emission__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:133:1: ( rule__Emission__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:134:1: ( rule__Emission__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:134:2: rule__Emission__Group__0
            {
            pushFollow(FOLLOW_rule__Emission__Group__0_in_ruleEmission220);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:146:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:147:1: ( ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:148:1: ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment247);
            ruleAssignment();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment254); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:155:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:159:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:160:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:160:1: ( ( rule__Assignment__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:161:1: ( rule__Assignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:162:1: ( rule__Assignment__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:162:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment280);
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


    // $ANTLR start entryRuleTextEffect
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:174:1: entryRuleTextEffect : ruleTextEffect EOF ;
    public final void entryRuleTextEffect() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:175:1: ( ruleTextEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:176:1: ruleTextEffect EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectRule()); 
            }
            pushFollow(FOLLOW_ruleTextEffect_in_entryRuleTextEffect307);
            ruleTextEffect();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextEffectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextEffect314); if (failed) return ;

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
    // $ANTLR end entryRuleTextEffect


    // $ANTLR start ruleTextEffect
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:183:1: ruleTextEffect : ( ( rule__TextEffect__Group__0 ) ) ;
    public final void ruleTextEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:187:2: ( ( ( rule__TextEffect__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:188:1: ( ( rule__TextEffect__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:188:1: ( ( rule__TextEffect__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:189:1: ( rule__TextEffect__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:190:1: ( rule__TextEffect__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:190:2: rule__TextEffect__Group__0
            {
            pushFollow(FOLLOW_rule__TextEffect__Group__0_in_ruleTextEffect340);
            rule__TextEffect__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTextEffectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTextEffect


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:202:1: entryRuleSignalReference : ruleSignalReference EOF ;
    public final void entryRuleSignalReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:203:1: ( ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:204:1: ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference367);
            ruleSignalReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference374); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:211:1: ruleSignalReference : ( ( rule__SignalReference__Group__0 ) ) ;
    public final void ruleSignalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:215:2: ( ( ( rule__SignalReference__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:216:1: ( ( rule__SignalReference__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:216:1: ( ( rule__SignalReference__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:217:1: ( rule__SignalReference__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:218:1: ( rule__SignalReference__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:218:2: rule__SignalReference__Group__0
            {
            pushFollow(FOLLOW_rule__SignalReference__Group__0_in_ruleSignalReference400);
            rule__SignalReference__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:230:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:231:1: ( ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:232:1: ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference427);
            ruleVariableReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference434); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:239:1: ruleVariableReference : ( ( rule__VariableReference__Group__0 ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:243:2: ( ( ( rule__VariableReference__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:244:1: ( ( rule__VariableReference__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:244:1: ( ( rule__VariableReference__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:245:1: ( rule__VariableReference__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:246:1: ( rule__VariableReference__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:246:2: rule__VariableReference__Group__0
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference460);
            rule__VariableReference__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:262:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:263:1: ( ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:264:1: ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue491);
            ruleIntValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue498); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:271:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:275:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:276:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:276:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:277:1: ( rule__IntValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:278:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:278:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue524);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:290:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:291:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:292:1: ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue551);
            ruleFloatValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue558); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:299:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:303:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:304:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:304:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:305:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:306:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:306:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue584);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:318:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:319:1: ( ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:320:1: ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue611);
            ruleBooleanValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue618); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:327:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:331:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:332:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:332:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:333:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:334:1: ( rule__BooleanValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:334:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue644);
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


    // $ANTLR start entryRuleValOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:348:1: entryRuleValOperation : ruleValOperation EOF ;
    public final void entryRuleValOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:349:1: ( ruleValOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:350:1: ruleValOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationRule()); 
            }
            pushFollow(FOLLOW_ruleValOperation_in_entryRuleValOperation673);
            ruleValOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValOperation680); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:357:1: ruleValOperation : ( ( rule__ValOperation__Group__0 ) ) ;
    public final void ruleValOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:361:2: ( ( ( rule__ValOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:362:1: ( ( rule__ValOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:362:1: ( ( rule__ValOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:363:1: ( rule__ValOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:364:1: ( rule__ValOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:364:2: rule__ValOperation__Group__0
            {
            pushFollow(FOLLOW_rule__ValOperation__Group__0_in_ruleValOperation706);
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


    // $ANTLR start entryRuleValuedExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:376:1: entryRuleValuedExpression : ruleValuedExpression EOF ;
    public final void entryRuleValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:377:1: ( ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:378:1: ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression733);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedExpression740); if (failed) return ;

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
    // $ANTLR end entryRuleValuedExpression


    // $ANTLR start ruleValuedExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:385:1: ruleValuedExpression : ( rulePlusOperation ) ;
    public final void ruleValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:389:2: ( ( rulePlusOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:390:1: ( rulePlusOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:390:1: ( rulePlusOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:391:1: rulePlusOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedExpressionAccess().getPlusOperationParserRuleCall()); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_ruleValuedExpression766);
            rulePlusOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedExpressionAccess().getPlusOperationParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleValuedExpression


    // $ANTLR start entryRuleParanthesedValuedExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:404:1: entryRuleParanthesedValuedExpression : ruleParanthesedValuedExpression EOF ;
    public final void entryRuleParanthesedValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:405:1: ( ruleParanthesedValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:406:1: ruleParanthesedValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParanthesedValuedExpression_in_entryRuleParanthesedValuedExpression792);
            ruleParanthesedValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValuedExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedValuedExpression799); if (failed) return ;

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
    // $ANTLR end entryRuleParanthesedValuedExpression


    // $ANTLR start ruleParanthesedValuedExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:413:1: ruleParanthesedValuedExpression : ( ( rule__ParanthesedValuedExpression__Alternatives ) ) ;
    public final void ruleParanthesedValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:417:2: ( ( ( rule__ParanthesedValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:418:1: ( ( rule__ParanthesedValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:418:1: ( ( rule__ParanthesedValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:419:1: ( rule__ParanthesedValuedExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:420:1: ( rule__ParanthesedValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:420:2: rule__ParanthesedValuedExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ParanthesedValuedExpression__Alternatives_in_ruleParanthesedValuedExpression825);
            rule__ParanthesedValuedExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValuedExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleParanthesedValuedExpression


    // $ANTLR start entryRulePlusOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:432:1: entryRulePlusOperation : rulePlusOperation EOF ;
    public final void entryRulePlusOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:433:1: ( rulePlusOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:434:1: rulePlusOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationRule()); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_entryRulePlusOperation852);
            rulePlusOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOperation859); if (failed) return ;

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
    // $ANTLR end entryRulePlusOperation


    // $ANTLR start rulePlusOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:441:1: rulePlusOperation : ( ( rule__PlusOperation__Group__0 ) ) ;
    public final void rulePlusOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:445:2: ( ( ( rule__PlusOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:446:1: ( ( rule__PlusOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:446:1: ( ( rule__PlusOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:447:1: ( rule__PlusOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:448:1: ( rule__PlusOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:448:2: rule__PlusOperation__Group__0
            {
            pushFollow(FOLLOW_rule__PlusOperation__Group__0_in_rulePlusOperation885);
            rule__PlusOperation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePlusOperation


    // $ANTLR start entryRuleMultOrDivOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:460:1: entryRuleMultOrDivOperation : ruleMultOrDivOperation EOF ;
    public final void entryRuleMultOrDivOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:461:1: ( ruleMultOrDivOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:462:1: ruleMultOrDivOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationRule()); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation912);
            ruleMultOrDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOrDivOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOrDivOperation919); if (failed) return ;

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
    // $ANTLR end entryRuleMultOrDivOperation


    // $ANTLR start ruleMultOrDivOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:469:1: ruleMultOrDivOperation : ( ( rule__MultOrDivOperation__Alternatives ) ) ;
    public final void ruleMultOrDivOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:473:2: ( ( ( rule__MultOrDivOperation__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:474:1: ( ( rule__MultOrDivOperation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:474:1: ( ( rule__MultOrDivOperation__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:475:1: ( rule__MultOrDivOperation__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:476:1: ( rule__MultOrDivOperation__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:476:2: rule__MultOrDivOperation__Alternatives
            {
            pushFollow(FOLLOW_rule__MultOrDivOperation__Alternatives_in_ruleMultOrDivOperation945);
            rule__MultOrDivOperation__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultOrDivOperationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMultOrDivOperation


    // $ANTLR start entryRuleMultOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:488:1: entryRuleMultOperation : ruleMultOperation EOF ;
    public final void entryRuleMultOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:489:1: ( ruleMultOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:490:1: ruleMultOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationRule()); 
            }
            pushFollow(FOLLOW_ruleMultOperation_in_entryRuleMultOperation972);
            ruleMultOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOperation979); if (failed) return ;

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
    // $ANTLR end entryRuleMultOperation


    // $ANTLR start ruleMultOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:497:1: ruleMultOperation : ( ( rule__MultOperation__Group__0 ) ) ;
    public final void ruleMultOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:501:2: ( ( ( rule__MultOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:502:1: ( ( rule__MultOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:502:1: ( ( rule__MultOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:503:1: ( rule__MultOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:504:1: ( rule__MultOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:504:2: rule__MultOperation__Group__0
            {
            pushFollow(FOLLOW_rule__MultOperation__Group__0_in_ruleMultOperation1005);
            rule__MultOperation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMultOperation


    // $ANTLR start entryRuleDivOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:516:1: entryRuleDivOperation : ruleDivOperation EOF ;
    public final void entryRuleDivOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:517:1: ( ruleDivOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:518:1: ruleDivOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationRule()); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_entryRuleDivOperation1032);
            ruleDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivOperation1039); if (failed) return ;

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
    // $ANTLR end entryRuleDivOperation


    // $ANTLR start ruleDivOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:525:1: ruleDivOperation : ( ( rule__DivOperation__Group__0 ) ) ;
    public final void ruleDivOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:529:2: ( ( ( rule__DivOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:530:1: ( ( rule__DivOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:530:1: ( ( rule__DivOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:531:1: ( rule__DivOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:532:1: ( rule__DivOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:532:2: rule__DivOperation__Group__0
            {
            pushFollow(FOLLOW_rule__DivOperation__Group__0_in_ruleDivOperation1065);
            rule__DivOperation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDivOperation


    // $ANTLR start entryRulePreArithmOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:544:1: entryRulePreArithmOperation : rulePreArithmOperation EOF ;
    public final void entryRulePreArithmOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:545:1: ( rulePreArithmOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:546:1: rulePreArithmOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationRule()); 
            }
            pushFollow(FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation1092);
            rulePreArithmOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreArithmOperation1099); if (failed) return ;

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
    // $ANTLR end entryRulePreArithmOperation


    // $ANTLR start rulePreArithmOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:553:1: rulePreArithmOperation : ( ( rule__PreArithmOperation__Group__0 ) ) ;
    public final void rulePreArithmOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:557:2: ( ( ( rule__PreArithmOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:558:1: ( ( rule__PreArithmOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:558:1: ( ( rule__PreArithmOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:559:1: ( rule__PreArithmOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:560:1: ( rule__PreArithmOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:560:2: rule__PreArithmOperation__Group__0
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__0_in_rulePreArithmOperation1125);
            rule__PreArithmOperation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePreArithmOperation


    // $ANTLR start entryRulePreOrNormalValuedExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:572:1: entryRulePreOrNormalValuedExpression : rulePreOrNormalValuedExpression EOF ;
    public final void entryRulePreOrNormalValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:573:1: ( rulePreOrNormalValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:574:1: rulePreOrNormalValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreOrNormalValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValuedExpression_in_entryRulePreOrNormalValuedExpression1152);
            rulePreOrNormalValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreOrNormalValuedExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreOrNormalValuedExpression1159); if (failed) return ;

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
    // $ANTLR end entryRulePreOrNormalValuedExpression


    // $ANTLR start rulePreOrNormalValuedExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:581:1: rulePreOrNormalValuedExpression : ( ( rule__PreOrNormalValuedExpression__Alternatives ) ) ;
    public final void rulePreOrNormalValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:585:2: ( ( ( rule__PreOrNormalValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:586:1: ( ( rule__PreOrNormalValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:586:1: ( ( rule__PreOrNormalValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:587:1: ( rule__PreOrNormalValuedExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreOrNormalValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:588:1: ( rule__PreOrNormalValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:588:2: rule__PreOrNormalValuedExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PreOrNormalValuedExpression__Alternatives_in_rulePreOrNormalValuedExpression1185);
            rule__PreOrNormalValuedExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreOrNormalValuedExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePreOrNormalValuedExpression


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:600:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:601:1: ( ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:602:1: ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1212);
            ruleCompareOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation1219); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:609:1: ruleCompareOperation : ( ( rule__CompareOperation__Group__0 ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:613:2: ( ( ( rule__CompareOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:614:1: ( ( rule__CompareOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:614:1: ( ( rule__CompareOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:615:1: ( rule__CompareOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:616:1: ( rule__CompareOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:616:2: rule__CompareOperation__Group__0
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group__0_in_ruleCompareOperation1245);
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


    // $ANTLR start entryRuleUnaryOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:628:1: entryRuleUnaryOperation : ruleUnaryOperation EOF ;
    public final void entryRuleUnaryOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:629:1: ( ruleUnaryOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:630:1: ruleUnaryOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1272);
            ruleUnaryOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation1279); if (failed) return ;

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
    // $ANTLR end entryRuleUnaryOperation


    // $ANTLR start ruleUnaryOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:637:1: ruleUnaryOperation : ( ( rule__UnaryOperation__Group__0 ) ) ;
    public final void ruleUnaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:641:2: ( ( ( rule__UnaryOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:642:1: ( ( rule__UnaryOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:642:1: ( ( rule__UnaryOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:643:1: ( rule__UnaryOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:644:1: ( rule__UnaryOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:644:2: rule__UnaryOperation__Group__0
            {
            pushFollow(FOLLOW_rule__UnaryOperation__Group__0_in_ruleUnaryOperation1305);
            rule__UnaryOperation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnaryOperation


    // $ANTLR start entryRuleUnaryParanthesedOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:656:1: entryRuleUnaryParanthesedOperation : ruleUnaryParanthesedOperation EOF ;
    public final void entryRuleUnaryParanthesedOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:657:1: ( ruleUnaryParanthesedOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:658:1: ruleUnaryParanthesedOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation1332);
            ruleUnaryParanthesedOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation1339); if (failed) return ;

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
    // $ANTLR end entryRuleUnaryParanthesedOperation


    // $ANTLR start ruleUnaryParanthesedOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:665:1: ruleUnaryParanthesedOperation : ( ( rule__UnaryParanthesedOperation__Group__0 ) ) ;
    public final void ruleUnaryParanthesedOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:669:2: ( ( ( rule__UnaryParanthesedOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:670:1: ( ( rule__UnaryParanthesedOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:670:1: ( ( rule__UnaryParanthesedOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:671:1: ( rule__UnaryParanthesedOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:672:1: ( rule__UnaryParanthesedOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:672:2: rule__UnaryParanthesedOperation__Group__0
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__0_in_ruleUnaryParanthesedOperation1365);
            rule__UnaryParanthesedOperation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnaryParanthesedOperation


    // $ANTLR start entryRuleUnaryOrNormalExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:684:1: entryRuleUnaryOrNormalExpression : ruleUnaryOrNormalExpression EOF ;
    public final void entryRuleUnaryOrNormalExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:685:1: ( ruleUnaryOrNormalExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:686:1: ruleUnaryOrNormalExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOrNormalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression1392);
            ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOrNormalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression1399); if (failed) return ;

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
    // $ANTLR end entryRuleUnaryOrNormalExpression


    // $ANTLR start ruleUnaryOrNormalExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:693:1: ruleUnaryOrNormalExpression : ( ( rule__UnaryOrNormalExpression__Alternatives ) ) ;
    public final void ruleUnaryOrNormalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:697:2: ( ( ( rule__UnaryOrNormalExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:698:1: ( ( rule__UnaryOrNormalExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:698:1: ( ( rule__UnaryOrNormalExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:699:1: ( rule__UnaryOrNormalExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOrNormalExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:700:1: ( rule__UnaryOrNormalExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:700:2: rule__UnaryOrNormalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryOrNormalExpression__Alternatives_in_ruleUnaryOrNormalExpression1425);
            rule__UnaryOrNormalExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOrNormalExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnaryOrNormalExpression


    // $ANTLR start entryRuleAndOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:712:1: entryRuleAndOperation : ruleAndOperation EOF ;
    public final void entryRuleAndOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:713:1: ( ruleAndOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:714:1: ruleAndOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_entryRuleAndOperation1452);
            ruleAndOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperation1459); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:721:1: ruleAndOperation : ( ( rule__AndOperation__Group__0 ) ) ;
    public final void ruleAndOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:725:2: ( ( ( rule__AndOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:726:1: ( ( rule__AndOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:726:1: ( ( rule__AndOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:727:1: ( rule__AndOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:728:1: ( rule__AndOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:728:2: rule__AndOperation__Group__0
            {
            pushFollow(FOLLOW_rule__AndOperation__Group__0_in_ruleAndOperation1485);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:740:1: entryRuleOrOperation : ruleOrOperation EOF ;
    public final void entryRuleOrOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:741:1: ( ruleOrOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:742:1: ruleOrOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_entryRuleOrOperation1512);
            ruleOrOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperation1519); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:749:1: ruleOrOperation : ( ( rule__OrOperation__Group__0 ) ) ;
    public final void ruleOrOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:753:2: ( ( ( rule__OrOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:754:1: ( ( rule__OrOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:754:1: ( ( rule__OrOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:755:1: ( rule__OrOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:756:1: ( rule__OrOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:756:2: rule__OrOperation__Group__0
            {
            pushFollow(FOLLOW_rule__OrOperation__Group__0_in_ruleOrOperation1545);
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


    // $ANTLR start entryRuleParanthesedBooleanExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:768:1: entryRuleParanthesedBooleanExpression : ruleParanthesedBooleanExpression EOF ;
    public final void entryRuleParanthesedBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:769:1: ( ruleParanthesedBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:770:1: ruleParanthesedBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression1572);
            ruleParanthesedBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression1579); if (failed) return ;

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
    // $ANTLR end entryRuleParanthesedBooleanExpression


    // $ANTLR start ruleParanthesedBooleanExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:777:1: ruleParanthesedBooleanExpression : ( ( rule__ParanthesedBooleanExpression__Alternatives ) ) ;
    public final void ruleParanthesedBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:781:2: ( ( ( rule__ParanthesedBooleanExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:782:1: ( ( rule__ParanthesedBooleanExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:782:1: ( ( rule__ParanthesedBooleanExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:783:1: ( rule__ParanthesedBooleanExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:784:1: ( rule__ParanthesedBooleanExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:784:2: rule__ParanthesedBooleanExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Alternatives_in_ruleParanthesedBooleanExpression1605);
            rule__ParanthesedBooleanExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedBooleanExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleParanthesedBooleanExpression


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:796:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:797:1: ( ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:798:1: ruleBooleanExpression EOF
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:805:1: ruleBooleanExpression : ( ruleOrOperation ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:809:2: ( ( ruleOrOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:810:1: ( ruleOrOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:810:1: ( ruleOrOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:811:1: ruleOrOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_ruleBooleanExpression1665);
            ruleOrOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start entryRuleTextExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:824:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:825:1: ( ruleTextExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:826:1: ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression1691);
            ruleTextExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression1698); if (failed) return ;

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
    // $ANTLR end entryRuleTextExpression


    // $ANTLR start ruleTextExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:833:1: ruleTextExpression : ( ( rule__TextExpression__Group__0 ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:837:2: ( ( ( rule__TextExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:838:1: ( ( rule__TextExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:838:1: ( ( rule__TextExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:839:1: ( rule__TextExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:840:1: ( rule__TextExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:840:2: rule__TextExpression__Group__0
            {
            pushFollow(FOLLOW_rule__TextExpression__Group__0_in_ruleTextExpression1724);
            rule__TextExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTextExpression


    // $ANTLR start entryRuleExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:852:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:853:1: ( ruleExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:854:1: ruleExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1751);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1758); if (failed) return ;

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:861:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:865:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:866:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:866:1: ( ( rule__Expression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:867:1: ( rule__Expression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:868:1: ( rule__Expression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:868:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression1784);
            rule__Expression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start ruleValOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:883:1: ruleValOperator : ( ( '?' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:887:1: ( ( ( '?' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:888:1: ( ( '?' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:888:1: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:889:1: ( '?' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:890:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:890:3: '?'
            {
            match(input,13,FOLLOW_13_in_ruleValOperator1824); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:903:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:907:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:908:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:908:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:909:1: ( rule__CompareOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:910:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:910:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1862);
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


    // $ANTLR start ruleUnaryOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:922:1: ruleUnaryOperator : ( ( 'not' ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:926:1: ( ( ( 'not' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:927:1: ( ( 'not' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:927:1: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:928:1: ( 'not' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:929:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:929:3: 'not'
            {
            match(input,14,FOLLOW_14_in_ruleUnaryOperator1899); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnaryOperator


    // $ANTLR start ruleUnaryParanthesedOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:942:1: ruleUnaryParanthesedOperator : ( ( 'pre' ) ) ;
    public final void ruleUnaryParanthesedOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:946:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:947:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:947:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:948:1: ( 'pre' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:949:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:949:3: 'pre'
            {
            match(input,15,FOLLOW_15_in_ruleUnaryParanthesedOperator1938); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperatorAccess().getPREEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnaryParanthesedOperator


    // $ANTLR start ruleOperatorOr
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:962:1: ruleOperatorOr : ( ( 'or' ) ) ;
    public final void ruleOperatorOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:966:1: ( ( ( 'or' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:967:1: ( ( 'or' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:967:1: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:968:1: ( 'or' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:969:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:969:3: 'or'
            {
            match(input,16,FOLLOW_16_in_ruleOperatorOr1977); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:982:1: ruleOperatorAnd : ( ( 'and' ) ) ;
    public final void ruleOperatorAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:986:1: ( ( ( 'and' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:987:1: ( ( 'and' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:987:1: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:988:1: ( 'and' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:989:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:989:3: 'and'
            {
            match(input,17,FOLLOW_17_in_ruleOperatorAnd2016); if (failed) return ;

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


    // $ANTLR start rulePlusOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1004:1: rulePlusOperator : ( ( rule__PlusOperator__Alternatives ) ) ;
    public final void rulePlusOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1008:1: ( ( ( rule__PlusOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1009:1: ( ( rule__PlusOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1009:1: ( ( rule__PlusOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1010:1: ( rule__PlusOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1011:1: ( rule__PlusOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1011:2: rule__PlusOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__PlusOperator__Alternatives_in_rulePlusOperator2056);
            rule__PlusOperator__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePlusOperator


    // $ANTLR start ruleMultOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1023:1: ruleMultOperator : ( ( rule__MultOperator__Alternatives ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1027:1: ( ( ( rule__MultOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1028:1: ( ( rule__MultOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1028:1: ( ( rule__MultOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1029:1: ( rule__MultOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1030:1: ( rule__MultOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1030:2: rule__MultOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__MultOperator__Alternatives_in_ruleMultOperator2092);
            rule__MultOperator__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMultOperator


    // $ANTLR start ruleDivOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1042:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1046:1: ( ( ( '/' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1047:1: ( ( '/' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1047:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1048:1: ( '/' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1049:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1049:3: '/'
            {
            match(input,18,FOLLOW_18_in_ruleDivOperator2129); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDivOperator


    // $ANTLR start rule__Effect__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1065:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1069:1: ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||(LA1_1>=RULE_ID && LA1_1<=RULE_STRING)||(LA1_1>=29 && LA1_1<=30)) ) {
                    alt1=1;
                }
                else if ( (LA1_1==32) ) {
                    alt1=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1065:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1065:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1070:1: ( ruleEmission )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1070:1: ( ruleEmission )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1071:1: ruleEmission
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEmission_in_rule__Effect__Alternatives2170);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1076:6: ( ruleAssignment )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1076:6: ( ruleAssignment )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1077:1: ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2187);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1082:6: ( ruleTextEffect )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1082:6: ( ruleTextEffect )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1083:1: ruleTextEffect
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleTextEffect_in_rule__Effect__Alternatives2204);
                    ruleTextEffect();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2()); 
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


    // $ANTLR start rule__Emission__Alternatives_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1093:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );
    public final void rule__Emission__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1097:1: ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred3()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1093:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1093:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1098:1: ( ( rule__Emission__Group_1_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1098:1: ( ( rule__Emission__Group_1_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1099:1: ( rule__Emission__Group_1_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEmissionAccess().getGroup_1_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1100:1: ( rule__Emission__Group_1_0__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1100:2: rule__Emission__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Emission__Group_1_0__0_in_rule__Emission__Alternatives_12236);
                    rule__Emission__Group_1_0__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getEmissionAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1104:6: ( ( rule__Emission__Group_1_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1104:6: ( ( rule__Emission__Group_1_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1105:1: ( rule__Emission__Group_1_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEmissionAccess().getGroup_1_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1106:1: ( rule__Emission__Group_1_1__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1106:2: rule__Emission__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Emission__Group_1_1__0_in_rule__Emission__Alternatives_12254);
                    rule__Emission__Group_1_1__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getEmissionAccess().getGroup_1_1()); 
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
    // $ANTLR end rule__Emission__Alternatives_1


    // $ANTLR start rule__Assignment__Alternatives_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1115:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );
    public final void rule__Assignment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1119:1: ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA3_1 = input.LA(2);

                if ( (synpred4()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1115:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA3_2 = input.LA(2);

                if ( (synpred4()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1115:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA3_3 = input.LA(2);

                if ( (synpred4()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1115:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA3_4 = input.LA(2);

                if ( (synpred4()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1115:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA3_5 = input.LA(2);

                if ( (synpred4()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1115:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA3_6 = input.LA(2);

                if ( (synpred4()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1115:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 6, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                int LA3_7 = input.LA(2);

                if ( (synpred4()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1115:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 7, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
            case 14:
                {
                alt3=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1115:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1120:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1120:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1121:1: ( rule__Assignment__ExpressionAssignment_2_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1122:1: ( rule__Assignment__ExpressionAssignment_2_0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1122:2: rule__Assignment__ExpressionAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_rule__Assignment__Alternatives_22287);
                    rule__Assignment__ExpressionAssignment_2_0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1126:6: ( ( rule__Assignment__ExpressionAssignment_2_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1126:6: ( ( rule__Assignment__ExpressionAssignment_2_1 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1127:1: ( rule__Assignment__ExpressionAssignment_2_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1128:1: ( rule__Assignment__ExpressionAssignment_2_1 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1128:2: rule__Assignment__ExpressionAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_1_in_rule__Assignment__Alternatives_22305);
                    rule__Assignment__ExpressionAssignment_2_1();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_1()); 
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
    // $ANTLR end rule__Assignment__Alternatives_2


    // $ANTLR start rule__ParanthesedValuedExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1138:1: rule__ParanthesedValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleTextExpression ) | ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValuedExpression__Group_6__0 ) ) );
    public final void rule__ParanthesedValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1142:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleTextExpression ) | ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValuedExpression__Group_6__0 ) ) )
            int alt4=7;
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
            case 13:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            case RULE_STRING:
                {
                alt4=5;
                }
                break;
            case 30:
                {
                int LA4_6 = input.LA(2);

                if ( (synpred10()) ) {
                    alt4=6;
                }
                else if ( (true) ) {
                    alt4=7;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1138:1: rule__ParanthesedValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleTextExpression ) | ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValuedExpression__Group_6__0 ) ) );", 4, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1138:1: rule__ParanthesedValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleTextExpression ) | ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValuedExpression__Group_6__0 ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1143:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1143:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1144:1: ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__ParanthesedValuedExpression__Alternatives2339);
                    ruleIntValue();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1149:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1149:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1150:1: ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__ParanthesedValuedExpression__Alternatives2356);
                    ruleFloatValue();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1155:6: ( ruleValOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1155:6: ( ruleValOperation )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1156:1: ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getValOperationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_rule__ParanthesedValuedExpression__Alternatives2373);
                    ruleValOperation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedValuedExpressionAccess().getValOperationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1161:6: ( ruleVariableReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1161:6: ( ruleVariableReference )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1162:1: ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getVariableReferenceParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_rule__ParanthesedValuedExpression__Alternatives2390);
                    ruleVariableReference();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedValuedExpressionAccess().getVariableReferenceParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1167:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1167:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1168:1: ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getTextExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_rule__ParanthesedValuedExpression__Alternatives2407);
                    ruleTextExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedValuedExpressionAccess().getTextExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1173:6: ( ( rule__ParanthesedValuedExpression__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1173:6: ( ( rule__ParanthesedValuedExpression__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1174:1: ( rule__ParanthesedValuedExpression__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getGroup_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1175:1: ( rule__ParanthesedValuedExpression__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1175:2: rule__ParanthesedValuedExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ParanthesedValuedExpression__Group_5__0_in_rule__ParanthesedValuedExpression__Alternatives2424);
                    rule__ParanthesedValuedExpression__Group_5__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedValuedExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1179:6: ( ( rule__ParanthesedValuedExpression__Group_6__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1179:6: ( ( rule__ParanthesedValuedExpression__Group_6__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1180:1: ( rule__ParanthesedValuedExpression__Group_6__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValuedExpressionAccess().getGroup_6()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1181:1: ( rule__ParanthesedValuedExpression__Group_6__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1181:2: rule__ParanthesedValuedExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ParanthesedValuedExpression__Group_6__0_in_rule__ParanthesedValuedExpression__Alternatives2442);
                    rule__ParanthesedValuedExpression__Group_6__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedValuedExpressionAccess().getGroup_6()); 
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
    // $ANTLR end rule__ParanthesedValuedExpression__Alternatives


    // $ANTLR start rule__MultOrDivOperation__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1190:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );
    public final void rule__MultOrDivOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1194:1: ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_FLOAT)||LA5_0==13||LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
                int LA5_7 = input.LA(2);

                if ( (synpred11()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1190:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );", 5, 7, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1190:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1195:1: ( ruleMultOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1195:1: ( ruleMultOperation )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1196:1: ruleMultOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMultOperation_in_rule__MultOrDivOperation__Alternatives2475);
                    ruleMultOperation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1201:6: ( ( rule__MultOrDivOperation__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1201:6: ( ( rule__MultOrDivOperation__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1202:1: ( rule__MultOrDivOperation__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOrDivOperationAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1203:1: ( rule__MultOrDivOperation__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1203:2: rule__MultOrDivOperation__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__0_in_rule__MultOrDivOperation__Alternatives2492);
                    rule__MultOrDivOperation__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getMultOrDivOperationAccess().getGroup_1()); 
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
    // $ANTLR end rule__MultOrDivOperation__Alternatives


    // $ANTLR start rule__PreOrNormalValuedExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1212:1: rule__PreOrNormalValuedExpression__Alternatives : ( ( rulePreArithmOperation ) | ( ruleParanthesedValuedExpression ) );
    public final void rule__PreOrNormalValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1216:1: ( ( rulePreArithmOperation ) | ( ruleParanthesedValuedExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_FLOAT)||LA6_0==13||LA6_0==30) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1212:1: rule__PreOrNormalValuedExpression__Alternatives : ( ( rulePreArithmOperation ) | ( ruleParanthesedValuedExpression ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1217:1: ( rulePreArithmOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1217:1: ( rulePreArithmOperation )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1218:1: rulePreArithmOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPreOrNormalValuedExpressionAccess().getPreArithmOperationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePreArithmOperation_in_rule__PreOrNormalValuedExpression__Alternatives2525);
                    rulePreArithmOperation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getPreOrNormalValuedExpressionAccess().getPreArithmOperationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1223:6: ( ruleParanthesedValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1223:6: ( ruleParanthesedValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1224:1: ruleParanthesedValuedExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPreOrNormalValuedExpressionAccess().getParanthesedValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleParanthesedValuedExpression_in_rule__PreOrNormalValuedExpression__Alternatives2542);
                    ruleParanthesedValuedExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getPreOrNormalValuedExpressionAccess().getParanthesedValuedExpressionParserRuleCall_1()); 
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
    // $ANTLR end rule__PreOrNormalValuedExpression__Alternatives


    // $ANTLR start rule__UnaryOperation__SubExpressionsAlternatives_1_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1234:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );
    public final void rule__UnaryOperation__SubExpressionsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1238:1: ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_BOOLEAN)||LA7_0==13||LA7_0==30) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==30) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==13) ) {
                        int LA7_4 = input.LA(4);

                        if ( (LA7_4==RULE_ID) ) {
                            switch ( input.LA(5) ) {
                            case 30:
                                {
                                int LA7_7 = input.LA(6);

                                if ( (synpred13()) ) {
                                    alt7=1;
                                }
                                else if ( (true) ) {
                                    alt7=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1234:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 7, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 31:
                                {
                                int LA7_8 = input.LA(6);

                                if ( (LA7_8==EOF||(LA7_8>=RULE_INT && LA7_8<=RULE_BOOLEAN)||(LA7_8>=13 && LA7_8<=18)||(LA7_8>=29 && LA7_8<=31)) ) {
                                    alt7=2;
                                }
                                else if ( ((LA7_8>=19 && LA7_8<=28)) ) {
                                    alt7=1;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1234:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 8, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 16:
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                                {
                                alt7=2;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1234:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 6, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1234:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA7_3>=RULE_INT && LA7_3<=RULE_BOOLEAN)||(LA7_3>=14 && LA7_3<=15)||LA7_3==30) ) {
                        alt7=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1234:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1234:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1234:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1239:1: ( ruleParanthesedBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1239:1: ( ruleParanthesedBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1240:1: ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02574);
                    ruleParanthesedBooleanExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1245:6: ( ruleUnaryParanthesedOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1245:6: ( ruleUnaryParanthesedOperation )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1246:1: ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getSubExpressionsUnaryParanthesedOperationParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02591);
                    ruleUnaryParanthesedOperation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getUnaryOperationAccess().getSubExpressionsUnaryParanthesedOperationParserRuleCall_1_0_1()); 
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
    // $ANTLR end rule__UnaryOperation__SubExpressionsAlternatives_1_0


    // $ANTLR start rule__UnaryOrNormalExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1256:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );
    public final void rule__UnaryOrNormalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1260:1: ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==30) ) {
                    int LA8_4 = input.LA(3);

                    if ( ((LA8_4>=RULE_INT && LA8_4<=RULE_BOOLEAN)||(LA8_4>=14 && LA8_4<=15)||LA8_4==30) ) {
                        alt8=2;
                    }
                    else if ( (LA8_4==13) ) {
                        int LA8_6 = input.LA(4);

                        if ( (LA8_6==RULE_ID) ) {
                            switch ( input.LA(5) ) {
                            case 30:
                                {
                                int LA8_8 = input.LA(6);

                                if ( (synpred15()) ) {
                                    alt8=2;
                                }
                                else if ( (true) ) {
                                    alt8=3;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1256:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 8, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 31:
                                {
                                int LA8_9 = input.LA(6);

                                if ( ((LA8_9>=19 && LA8_9<=28)) ) {
                                    alt8=3;
                                }
                                else if ( (LA8_9==EOF||(LA8_9>=RULE_INT && LA8_9<=RULE_BOOLEAN)||(LA8_9>=13 && LA8_9<=18)||(LA8_9>=29 && LA8_9<=31)) ) {
                                    alt8=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1256:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 9, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 16:
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                                {
                                alt8=2;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1256:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 7, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1256:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1256:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1256:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case RULE_STRING:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case 13:
            case 30:
                {
                alt8=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1256:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1261:1: ( ruleUnaryOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1261:1: ( ruleUnaryOperation )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1262:1: ruleUnaryOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryOperationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleUnaryOperation_in_rule__UnaryOrNormalExpression__Alternatives2623);
                    ruleUnaryOperation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryOperationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1267:6: ( ruleUnaryParanthesedOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1267:6: ( ruleUnaryParanthesedOperation )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1268:1: ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOrNormalExpression__Alternatives2640);
                    ruleUnaryParanthesedOperation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1273:6: ( ruleParanthesedBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1273:6: ( ruleParanthesedBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1274:1: ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getParanthesedBooleanExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOrNormalExpression__Alternatives2657);
                    ruleParanthesedBooleanExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getUnaryOrNormalExpressionAccess().getParanthesedBooleanExpressionParserRuleCall_2()); 
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
    // $ANTLR end rule__UnaryOrNormalExpression__Alternatives


    // $ANTLR start rule__ParanthesedBooleanExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1284:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );
    public final void rule__ParanthesedBooleanExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1288:1: ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case 15:
                {
                alt9=2;
                }
                break;
            case 13:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 30:
                        {
                        int LA9_13 = input.LA(4);

                        if ( (synpred17()) ) {
                            alt9=2;
                        }
                        else if ( (synpred19()) ) {
                            alt9=4;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1284:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_INT:
                    case RULE_ID:
                    case RULE_STRING:
                    case RULE_FLOAT:
                    case RULE_BOOLEAN:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 29:
                    case 31:
                        {
                        alt9=4;
                        }
                        break;
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        {
                        alt9=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1284:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 7, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1284:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    int LA9_8 = input.LA(3);

                    if ( (synpred17()) ) {
                        alt9=2;
                    }
                    else if ( (synpred18()) ) {
                        alt9=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1284:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_INT:
                case RULE_ID:
                case RULE_STRING:
                case RULE_FLOAT:
                case RULE_BOOLEAN:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 29:
                case 31:
                    {
                    alt9=3;
                    }
                    break;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                    {
                    alt9=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1284:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 4, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    int LA9_10 = input.LA(3);

                    if ( (synpred17()) ) {
                        alt9=2;
                    }
                    else if ( (synpred20()) ) {
                        alt9=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1284:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                    {
                    alt9=2;
                    }
                    break;
                case EOF:
                case RULE_INT:
                case RULE_ID:
                case RULE_STRING:
                case RULE_FLOAT:
                case RULE_BOOLEAN:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 29:
                case 31:
                    {
                    alt9=5;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1284:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 5, input);

                    throw nvae;
                }

                }
                break;
            case 30:
                {
                int LA9_6 = input.LA(2);

                if ( (synpred17()) ) {
                    alt9=2;
                }
                else if ( (true) ) {
                    alt9=6;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1284:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1284:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleTextExpression ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1289:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1289:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1290:1: ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__ParanthesedBooleanExpression__Alternatives2689);
                    ruleBooleanValue();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedBooleanExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1295:6: ( ruleCompareOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1295:6: ( ruleCompareOperation )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1296:1: ruleCompareOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCompareOperation_in_rule__ParanthesedBooleanExpression__Alternatives2706);
                    ruleCompareOperation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1301:6: ( ruleSignalReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1301:6: ( ruleSignalReference )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1302:1: ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_rule__ParanthesedBooleanExpression__Alternatives2723);
                    ruleSignalReference();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1307:6: ( ruleValOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1307:6: ( ruleValOperation )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1308:1: ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getValOperationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_rule__ParanthesedBooleanExpression__Alternatives2740);
                    ruleValOperation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedBooleanExpressionAccess().getValOperationParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1313:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1313:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1314:1: ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getTextExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_rule__ParanthesedBooleanExpression__Alternatives2757);
                    ruleTextExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedBooleanExpressionAccess().getTextExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1319:6: ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1319:6: ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1320:1: ( rule__ParanthesedBooleanExpression__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getGroup_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1321:1: ( rule__ParanthesedBooleanExpression__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1321:2: rule__ParanthesedBooleanExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0_in_rule__ParanthesedBooleanExpression__Alternatives2774);
                    rule__ParanthesedBooleanExpression__Group_5__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedBooleanExpressionAccess().getGroup_5()); 
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
    // $ANTLR end rule__ParanthesedBooleanExpression__Alternatives


    // $ANTLR start rule__Expression__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1330:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1334:1: ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred21()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1330:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA10_2 = input.LA(2);

                if ( (synpred21()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1330:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA10_3 = input.LA(2);

                if ( (synpred21()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1330:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA10_4 = input.LA(2);

                if ( (synpred21()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1330:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA10_5 = input.LA(2);

                if ( (synpred21()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1330:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 10, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA10_6 = input.LA(2);

                if ( (synpred21()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1330:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 10, 6, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                int LA10_7 = input.LA(2);

                if ( (synpred21()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1330:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 10, 7, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
            case 14:
                {
                alt10=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1330:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBooleanExpression ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1335:1: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1335:1: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1336:1: ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2807);
                    ruleValuedExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1341:6: ( ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1341:6: ( ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1342:1: ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2824);
                    ruleBooleanExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_1()); 
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
    // $ANTLR end rule__Expression__Alternatives


    // $ANTLR start rule__CompareOperator__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1353:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1357:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            case 23:
                {
                alt11=5;
                }
                break;
            case 24:
                {
                alt11=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1353:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1358:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1358:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1359:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1360:1: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1360:3: '='
                    {
                    match(input,19,FOLLOW_19_in_rule__CompareOperator__Alternatives2858); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1365:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1365:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1366:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1367:1: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1367:3: '<'
                    {
                    match(input,20,FOLLOW_20_in_rule__CompareOperator__Alternatives2879); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1372:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1372:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1373:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1374:1: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1374:3: '<='
                    {
                    match(input,21,FOLLOW_21_in_rule__CompareOperator__Alternatives2900); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1379:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1379:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1380:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1381:1: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1381:3: '>'
                    {
                    match(input,22,FOLLOW_22_in_rule__CompareOperator__Alternatives2921); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1386:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1386:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1387:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1388:1: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1388:3: '>='
                    {
                    match(input,23,FOLLOW_23_in_rule__CompareOperator__Alternatives2942); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1393:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1393:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1394:1: ( '<>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1395:1: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1395:3: '<>'
                    {
                    match(input,24,FOLLOW_24_in_rule__CompareOperator__Alternatives2963); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
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


    // $ANTLR start rule__PlusOperator__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1405:1: rule__PlusOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__PlusOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1409:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1405:1: rule__PlusOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1410:1: ( ( '+' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1410:1: ( ( '+' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1411:1: ( '+' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1412:1: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1412:3: '+'
                    {
                    match(input,25,FOLLOW_25_in_rule__PlusOperator__Alternatives2999); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1417:6: ( ( '-' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1417:6: ( ( '-' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1418:1: ( '-' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPlusOperatorAccess().getSUBEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1419:1: ( '-' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1419:3: '-'
                    {
                    match(input,26,FOLLOW_26_in_rule__PlusOperator__Alternatives3020); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPlusOperatorAccess().getSUBEnumLiteralDeclaration_1()); 
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
    // $ANTLR end rule__PlusOperator__Alternatives


    // $ANTLR start rule__MultOperator__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1429:1: rule__MultOperator__Alternatives : ( ( ( '*' ) ) | ( ( 'mod' ) ) );
    public final void rule__MultOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1433:1: ( ( ( '*' ) ) | ( ( 'mod' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1429:1: rule__MultOperator__Alternatives : ( ( ( '*' ) ) | ( ( 'mod' ) ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1434:1: ( ( '*' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1434:1: ( ( '*' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1435:1: ( '*' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1436:1: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1436:3: '*'
                    {
                    match(input,27,FOLLOW_27_in_rule__MultOperator__Alternatives3056); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1441:6: ( ( 'mod' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1441:6: ( ( 'mod' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1442:1: ( 'mod' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOperatorAccess().getMODEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1443:1: ( 'mod' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1443:3: 'mod'
                    {
                    match(input,28,FOLLOW_28_in_rule__MultOperator__Alternatives3077); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getMultOperatorAccess().getMODEnumLiteralDeclaration_1()); 
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
    // $ANTLR end rule__MultOperator__Alternatives


    // $ANTLR start rule__Action__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1457:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1461:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1462:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__03112);
            rule__Action__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__03115);
            rule__Action__Group__1();
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
    // $ANTLR end rule__Action__Group__0


    // $ANTLR start rule__Action__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1469:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1473:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1474:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1474:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1475:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getActionAction_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1476:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1478:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getActionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__0__Impl


    // $ANTLR start rule__Action__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1488:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1492:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1493:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__13173);
            rule__Action__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__13176);
            rule__Action__Group__2();
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
    // $ANTLR end rule__Action__Group__1


    // $ANTLR start rule__Action__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1500:1: rule__Action__Group__1__Impl : ( ( rule__Action__IsImmediateAssignment_1 )? ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1504:1: ( ( ( rule__Action__IsImmediateAssignment_1 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1505:1: ( ( rule__Action__IsImmediateAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1505:1: ( ( rule__Action__IsImmediateAssignment_1 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1506:1: ( rule__Action__IsImmediateAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1507:1: ( rule__Action__IsImmediateAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1507:2: rule__Action__IsImmediateAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Action__IsImmediateAssignment_1_in_rule__Action__Group__1__Impl3203);
                    rule__Action__IsImmediateAssignment_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getIsImmediateAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__1__Impl


    // $ANTLR start rule__Action__Group__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1517:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1521:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1522:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__23234);
            rule__Action__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__23237);
            rule__Action__Group__3();
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
    // $ANTLR end rule__Action__Group__2


    // $ANTLR start rule__Action__Group__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1529:1: rule__Action__Group__2__Impl : ( ( rule__Action__DelayAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1533:1: ( ( ( rule__Action__DelayAssignment_2 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1534:1: ( ( rule__Action__DelayAssignment_2 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1534:1: ( ( rule__Action__DelayAssignment_2 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1535:1: ( rule__Action__DelayAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDelayAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1536:1: ( rule__Action__DelayAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||(LA15_1>=RULE_INT && LA15_1<=RULE_BOOLEAN)||(LA15_1>=13 && LA15_1<=15)||LA15_1==18||LA15_1==30) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1536:2: rule__Action__DelayAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Action__DelayAssignment_2_in_rule__Action__Group__2__Impl3264);
                    rule__Action__DelayAssignment_2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getDelayAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__2__Impl


    // $ANTLR start rule__Action__Group__3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1546:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1550:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1551:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__33295);
            rule__Action__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__33298);
            rule__Action__Group__4();
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
    // $ANTLR end rule__Action__Group__3


    // $ANTLR start rule__Action__Group__3__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1558:1: rule__Action__Group__3__Impl : ( ( rule__Action__TriggerAssignment_3 )? ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1562:1: ( ( ( rule__Action__TriggerAssignment_3 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1563:1: ( ( rule__Action__TriggerAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1563:1: ( ( rule__Action__TriggerAssignment_3 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1564:1: ( rule__Action__TriggerAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTriggerAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1565:1: ( rule__Action__TriggerAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_INT && LA16_0<=RULE_BOOLEAN)||(LA16_0>=13 && LA16_0<=15)||LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1565:2: rule__Action__TriggerAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Action__TriggerAssignment_3_in_rule__Action__Group__3__Impl3325);
                    rule__Action__TriggerAssignment_3();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getTriggerAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__3__Impl


    // $ANTLR start rule__Action__Group__4
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1575:1: rule__Action__Group__4 : rule__Action__Group__4__Impl ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1579:1: ( rule__Action__Group__4__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1580:2: rule__Action__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__43356);
            rule__Action__Group__4__Impl();
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
    // $ANTLR end rule__Action__Group__4


    // $ANTLR start rule__Action__Group__4__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1586:1: rule__Action__Group__4__Impl : ( ( rule__Action__Group_4__0 )? ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1590:1: ( ( ( rule__Action__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1591:1: ( ( rule__Action__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1591:1: ( ( rule__Action__Group_4__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1592:1: ( rule__Action__Group_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_4()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1593:1: ( rule__Action__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1593:2: rule__Action__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_4__0_in_rule__Action__Group__4__Impl3383);
                    rule__Action__Group_4__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__4__Impl


    // $ANTLR start rule__Action__Group_4__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1613:1: rule__Action__Group_4__0 : rule__Action__Group_4__0__Impl rule__Action__Group_4__1 ;
    public final void rule__Action__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1617:1: ( rule__Action__Group_4__0__Impl rule__Action__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1618:2: rule__Action__Group_4__0__Impl rule__Action__Group_4__1
            {
            pushFollow(FOLLOW_rule__Action__Group_4__0__Impl_in_rule__Action__Group_4__03424);
            rule__Action__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_4__1_in_rule__Action__Group_4__03427);
            rule__Action__Group_4__1();
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
    // $ANTLR end rule__Action__Group_4__0


    // $ANTLR start rule__Action__Group_4__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1625:1: rule__Action__Group_4__0__Impl : ( '/' ) ;
    public final void rule__Action__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1629:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1630:1: ( '/' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1630:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1631:1: '/'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getSolidusKeyword_4_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Action__Group_4__0__Impl3455); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getSolidusKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_4__0__Impl


    // $ANTLR start rule__Action__Group_4__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1644:1: rule__Action__Group_4__1 : rule__Action__Group_4__1__Impl ;
    public final void rule__Action__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1648:1: ( rule__Action__Group_4__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1649:2: rule__Action__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_4__1__Impl_in_rule__Action__Group_4__13486);
            rule__Action__Group_4__1__Impl();
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
    // $ANTLR end rule__Action__Group_4__1


    // $ANTLR start rule__Action__Group_4__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1655:1: rule__Action__Group_4__1__Impl : ( ( rule__Action__Group_4_1__0 )* ) ;
    public final void rule__Action__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1659:1: ( ( ( rule__Action__Group_4_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1660:1: ( ( rule__Action__Group_4_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1660:1: ( ( rule__Action__Group_4_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1661:1: ( rule__Action__Group_4_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_4_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1662:1: ( rule__Action__Group_4_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1662:2: rule__Action__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Action__Group_4_1__0_in_rule__Action__Group_4__1__Impl3513);
            	    rule__Action__Group_4_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getGroup_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_4__1__Impl


    // $ANTLR start rule__Action__Group_4_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1676:1: rule__Action__Group_4_1__0 : rule__Action__Group_4_1__0__Impl rule__Action__Group_4_1__1 ;
    public final void rule__Action__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1680:1: ( rule__Action__Group_4_1__0__Impl rule__Action__Group_4_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1681:2: rule__Action__Group_4_1__0__Impl rule__Action__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Action__Group_4_1__0__Impl_in_rule__Action__Group_4_1__03548);
            rule__Action__Group_4_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_4_1__1_in_rule__Action__Group_4_1__03551);
            rule__Action__Group_4_1__1();
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
    // $ANTLR end rule__Action__Group_4_1__0


    // $ANTLR start rule__Action__Group_4_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1688:1: rule__Action__Group_4_1__0__Impl : ( ( rule__Action__EffectsAssignment_4_1_0 ) ) ;
    public final void rule__Action__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1692:1: ( ( ( rule__Action__EffectsAssignment_4_1_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1693:1: ( ( rule__Action__EffectsAssignment_4_1_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1693:1: ( ( rule__Action__EffectsAssignment_4_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1694:1: ( rule__Action__EffectsAssignment_4_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getEffectsAssignment_4_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1695:1: ( rule__Action__EffectsAssignment_4_1_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1695:2: rule__Action__EffectsAssignment_4_1_0
            {
            pushFollow(FOLLOW_rule__Action__EffectsAssignment_4_1_0_in_rule__Action__Group_4_1__0__Impl3578);
            rule__Action__EffectsAssignment_4_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getEffectsAssignment_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_4_1__0__Impl


    // $ANTLR start rule__Action__Group_4_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1705:1: rule__Action__Group_4_1__1 : rule__Action__Group_4_1__1__Impl ;
    public final void rule__Action__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1709:1: ( rule__Action__Group_4_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1710:2: rule__Action__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_4_1__1__Impl_in_rule__Action__Group_4_1__13608);
            rule__Action__Group_4_1__1__Impl();
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
    // $ANTLR end rule__Action__Group_4_1__1


    // $ANTLR start rule__Action__Group_4_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1716:1: rule__Action__Group_4_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__Action__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1720:1: ( ( ( ',' )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1721:1: ( ( ',' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1721:1: ( ( ',' )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1722:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getCommaKeyword_4_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1723:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1724:2: ','
                    {
                    match(input,29,FOLLOW_29_in_rule__Action__Group_4_1__1__Impl3637); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getCommaKeyword_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_4_1__1__Impl


    // $ANTLR start rule__Emission__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1739:1: rule__Emission__Group__0 : rule__Emission__Group__0__Impl rule__Emission__Group__1 ;
    public final void rule__Emission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1743:1: ( rule__Emission__Group__0__Impl rule__Emission__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1744:2: rule__Emission__Group__0__Impl rule__Emission__Group__1
            {
            pushFollow(FOLLOW_rule__Emission__Group__0__Impl_in_rule__Emission__Group__03674);
            rule__Emission__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03677);
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


    // $ANTLR start rule__Emission__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1751:1: rule__Emission__Group__0__Impl : ( ( rule__Emission__SignalAssignment_0 ) ) ;
    public final void rule__Emission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1755:1: ( ( ( rule__Emission__SignalAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1756:1: ( ( rule__Emission__SignalAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1756:1: ( ( rule__Emission__SignalAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1757:1: ( rule__Emission__SignalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1758:1: ( rule__Emission__SignalAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1758:2: rule__Emission__SignalAssignment_0
            {
            pushFollow(FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__0__Impl3704);
            rule__Emission__SignalAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getSignalAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emission__Group__0__Impl


    // $ANTLR start rule__Emission__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1768:1: rule__Emission__Group__1 : rule__Emission__Group__1__Impl ;
    public final void rule__Emission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1772:1: ( rule__Emission__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1773:2: rule__Emission__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group__1__Impl_in_rule__Emission__Group__13734);
            rule__Emission__Group__1__Impl();
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
    // $ANTLR end rule__Emission__Group__1


    // $ANTLR start rule__Emission__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1779:1: rule__Emission__Group__1__Impl : ( ( rule__Emission__Alternatives_1 )? ) ;
    public final void rule__Emission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1783:1: ( ( ( rule__Emission__Alternatives_1 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1784:1: ( ( rule__Emission__Alternatives_1 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1784:1: ( ( rule__Emission__Alternatives_1 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1785:1: ( rule__Emission__Alternatives_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1786:1: ( rule__Emission__Alternatives_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1786:2: rule__Emission__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Emission__Alternatives_1_in_rule__Emission__Group__1__Impl3761);
                    rule__Emission__Alternatives_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emission__Group__1__Impl


    // $ANTLR start rule__Emission__Group_1_0__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1800:1: rule__Emission__Group_1_0__0 : rule__Emission__Group_1_0__0__Impl rule__Emission__Group_1_0__1 ;
    public final void rule__Emission__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1804:1: ( rule__Emission__Group_1_0__0__Impl rule__Emission__Group_1_0__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1805:2: rule__Emission__Group_1_0__0__Impl rule__Emission__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_0__0__Impl_in_rule__Emission__Group_1_0__03796);
            rule__Emission__Group_1_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_0__1_in_rule__Emission__Group_1_0__03799);
            rule__Emission__Group_1_0__1();
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
    // $ANTLR end rule__Emission__Group_1_0__0


    // $ANTLR start rule__Emission__Group_1_0__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1812:1: rule__Emission__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__Emission__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1816:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1817:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1817:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1818:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Emission__Group_1_0__0__Impl3827); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emission__Group_1_0__0__Impl


    // $ANTLR start rule__Emission__Group_1_0__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1831:1: rule__Emission__Group_1_0__1 : rule__Emission__Group_1_0__1__Impl rule__Emission__Group_1_0__2 ;
    public final void rule__Emission__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1835:1: ( rule__Emission__Group_1_0__1__Impl rule__Emission__Group_1_0__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1836:2: rule__Emission__Group_1_0__1__Impl rule__Emission__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_0__1__Impl_in_rule__Emission__Group_1_0__13858);
            rule__Emission__Group_1_0__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_0__2_in_rule__Emission__Group_1_0__13861);
            rule__Emission__Group_1_0__2();
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
    // $ANTLR end rule__Emission__Group_1_0__1


    // $ANTLR start rule__Emission__Group_1_0__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1843:1: rule__Emission__Group_1_0__1__Impl : ( ( rule__Emission__NewValueAssignment_1_0_1 ) ) ;
    public final void rule__Emission__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1847:1: ( ( ( rule__Emission__NewValueAssignment_1_0_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1848:1: ( ( rule__Emission__NewValueAssignment_1_0_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1848:1: ( ( rule__Emission__NewValueAssignment_1_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1849:1: ( rule__Emission__NewValueAssignment_1_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_0_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1850:1: ( rule__Emission__NewValueAssignment_1_0_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1850:2: rule__Emission__NewValueAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_0_1_in_rule__Emission__Group_1_0__1__Impl3888);
            rule__Emission__NewValueAssignment_1_0_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emission__Group_1_0__1__Impl


    // $ANTLR start rule__Emission__Group_1_0__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1860:1: rule__Emission__Group_1_0__2 : rule__Emission__Group_1_0__2__Impl ;
    public final void rule__Emission__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1864:1: ( rule__Emission__Group_1_0__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1865:2: rule__Emission__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_0__2__Impl_in_rule__Emission__Group_1_0__23918);
            rule__Emission__Group_1_0__2__Impl();
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
    // $ANTLR end rule__Emission__Group_1_0__2


    // $ANTLR start rule__Emission__Group_1_0__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1871:1: rule__Emission__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__Emission__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1875:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1876:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1876:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1877:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_0_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__Emission__Group_1_0__2__Impl3946); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emission__Group_1_0__2__Impl


    // $ANTLR start rule__Emission__Group_1_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1896:1: rule__Emission__Group_1_1__0 : rule__Emission__Group_1_1__0__Impl rule__Emission__Group_1_1__1 ;
    public final void rule__Emission__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1900:1: ( rule__Emission__Group_1_1__0__Impl rule__Emission__Group_1_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1901:2: rule__Emission__Group_1_1__0__Impl rule__Emission__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_1__0__Impl_in_rule__Emission__Group_1_1__03983);
            rule__Emission__Group_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_1__1_in_rule__Emission__Group_1_1__03986);
            rule__Emission__Group_1_1__1();
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
    // $ANTLR end rule__Emission__Group_1_1__0


    // $ANTLR start rule__Emission__Group_1_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1908:1: rule__Emission__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__Emission__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1912:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1913:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1913:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1914:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Emission__Group_1_1__0__Impl4014); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emission__Group_1_1__0__Impl


    // $ANTLR start rule__Emission__Group_1_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1927:1: rule__Emission__Group_1_1__1 : rule__Emission__Group_1_1__1__Impl rule__Emission__Group_1_1__2 ;
    public final void rule__Emission__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1931:1: ( rule__Emission__Group_1_1__1__Impl rule__Emission__Group_1_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1932:2: rule__Emission__Group_1_1__1__Impl rule__Emission__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_1__1__Impl_in_rule__Emission__Group_1_1__14045);
            rule__Emission__Group_1_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_1__2_in_rule__Emission__Group_1_1__14048);
            rule__Emission__Group_1_1__2();
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
    // $ANTLR end rule__Emission__Group_1_1__1


    // $ANTLR start rule__Emission__Group_1_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1939:1: rule__Emission__Group_1_1__1__Impl : ( ( rule__Emission__NewValueAssignment_1_1_1 ) ) ;
    public final void rule__Emission__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1943:1: ( ( ( rule__Emission__NewValueAssignment_1_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1944:1: ( ( rule__Emission__NewValueAssignment_1_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1944:1: ( ( rule__Emission__NewValueAssignment_1_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1945:1: ( rule__Emission__NewValueAssignment_1_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1946:1: ( rule__Emission__NewValueAssignment_1_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1946:2: rule__Emission__NewValueAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_1_1_in_rule__Emission__Group_1_1__1__Impl4075);
            rule__Emission__NewValueAssignment_1_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emission__Group_1_1__1__Impl


    // $ANTLR start rule__Emission__Group_1_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1956:1: rule__Emission__Group_1_1__2 : rule__Emission__Group_1_1__2__Impl ;
    public final void rule__Emission__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1960:1: ( rule__Emission__Group_1_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1961:2: rule__Emission__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_1__2__Impl_in_rule__Emission__Group_1_1__24105);
            rule__Emission__Group_1_1__2__Impl();
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
    // $ANTLR end rule__Emission__Group_1_1__2


    // $ANTLR start rule__Emission__Group_1_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1967:1: rule__Emission__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__Emission__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1971:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1972:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1972:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1973:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__Emission__Group_1_1__2__Impl4133); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emission__Group_1_1__2__Impl


    // $ANTLR start rule__Assignment__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1992:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1996:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1997:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04170);
            rule__Assignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04173);
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


    // $ANTLR start rule__Assignment__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2004:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariableAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2008:1: ( ( ( rule__Assignment__VariableAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2009:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2009:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2010:1: ( rule__Assignment__VariableAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2011:1: ( rule__Assignment__VariableAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2011:2: rule__Assignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl4200);
            rule__Assignment__VariableAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__Group__0__Impl


    // $ANTLR start rule__Assignment__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2021:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2025:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2026:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14230);
            rule__Assignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14233);
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


    // $ANTLR start rule__Assignment__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2033:1: rule__Assignment__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2037:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2038:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2038:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2039:1: ':='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Assignment__Group__1__Impl4261); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__Group__1__Impl


    // $ANTLR start rule__Assignment__Group__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2052:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2056:1: ( rule__Assignment__Group__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2057:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24292);
            rule__Assignment__Group__2__Impl();
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
    // $ANTLR end rule__Assignment__Group__2


    // $ANTLR start rule__Assignment__Group__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2063:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__Alternatives_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2067:1: ( ( ( rule__Assignment__Alternatives_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2068:1: ( ( rule__Assignment__Alternatives_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2068:1: ( ( rule__Assignment__Alternatives_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2069:1: ( rule__Assignment__Alternatives_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2070:1: ( rule__Assignment__Alternatives_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2070:2: rule__Assignment__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Assignment__Alternatives_2_in_rule__Assignment__Group__2__Impl4319);
            rule__Assignment__Alternatives_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__Group__2__Impl


    // $ANTLR start rule__TextEffect__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2086:1: rule__TextEffect__Group__0 : rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1 ;
    public final void rule__TextEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2090:1: ( rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2091:2: rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1
            {
            pushFollow(FOLLOW_rule__TextEffect__Group__0__Impl_in_rule__TextEffect__Group__04355);
            rule__TextEffect__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group__1_in_rule__TextEffect__Group__04358);
            rule__TextEffect__Group__1();
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
    // $ANTLR end rule__TextEffect__Group__0


    // $ANTLR start rule__TextEffect__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2098:1: rule__TextEffect__Group__0__Impl : ( ( rule__TextEffect__CodeAssignment_0 ) ) ;
    public final void rule__TextEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2102:1: ( ( ( rule__TextEffect__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2103:1: ( ( rule__TextEffect__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2103:1: ( ( rule__TextEffect__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2104:1: ( rule__TextEffect__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2105:1: ( rule__TextEffect__CodeAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2105:2: rule__TextEffect__CodeAssignment_0
            {
            pushFollow(FOLLOW_rule__TextEffect__CodeAssignment_0_in_rule__TextEffect__Group__0__Impl4385);
            rule__TextEffect__CodeAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTextEffectAccess().getCodeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextEffect__Group__0__Impl


    // $ANTLR start rule__TextEffect__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2115:1: rule__TextEffect__Group__1 : rule__TextEffect__Group__1__Impl ;
    public final void rule__TextEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2119:1: ( rule__TextEffect__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2120:2: rule__TextEffect__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextEffect__Group__1__Impl_in_rule__TextEffect__Group__14415);
            rule__TextEffect__Group__1__Impl();
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
    // $ANTLR end rule__TextEffect__Group__1


    // $ANTLR start rule__TextEffect__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2126:1: rule__TextEffect__Group__1__Impl : ( ( rule__TextEffect__Group_1__0 )? ) ;
    public final void rule__TextEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2130:1: ( ( ( rule__TextEffect__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2131:1: ( ( rule__TextEffect__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2131:1: ( ( rule__TextEffect__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2132:1: ( rule__TextEffect__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2133:1: ( rule__TextEffect__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2133:2: rule__TextEffect__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextEffect__Group_1__0_in_rule__TextEffect__Group__1__Impl4442);
                    rule__TextEffect__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTextEffectAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextEffect__Group__1__Impl


    // $ANTLR start rule__TextEffect__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2147:1: rule__TextEffect__Group_1__0 : rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1 ;
    public final void rule__TextEffect__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2151:1: ( rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2152:2: rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__0__Impl_in_rule__TextEffect__Group_1__04477);
            rule__TextEffect__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group_1__1_in_rule__TextEffect__Group_1__04480);
            rule__TextEffect__Group_1__1();
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
    // $ANTLR end rule__TextEffect__Group_1__0


    // $ANTLR start rule__TextEffect__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2159:1: rule__TextEffect__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextEffect__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2163:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2164:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2164:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2165:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__TextEffect__Group_1__0__Impl4508); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextEffectAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextEffect__Group_1__0__Impl


    // $ANTLR start rule__TextEffect__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2178:1: rule__TextEffect__Group_1__1 : rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2 ;
    public final void rule__TextEffect__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2182:1: ( rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2183:2: rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__1__Impl_in_rule__TextEffect__Group_1__14539);
            rule__TextEffect__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group_1__2_in_rule__TextEffect__Group_1__14542);
            rule__TextEffect__Group_1__2();
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
    // $ANTLR end rule__TextEffect__Group_1__1


    // $ANTLR start rule__TextEffect__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2190:1: rule__TextEffect__Group_1__1__Impl : ( ( rule__TextEffect__TypeAssignment_1_1 ) ) ;
    public final void rule__TextEffect__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2194:1: ( ( ( rule__TextEffect__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2195:1: ( ( rule__TextEffect__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2195:1: ( ( rule__TextEffect__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2196:1: ( rule__TextEffect__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2197:1: ( rule__TextEffect__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2197:2: rule__TextEffect__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TextEffect__TypeAssignment_1_1_in_rule__TextEffect__Group_1__1__Impl4569);
            rule__TextEffect__TypeAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTextEffectAccess().getTypeAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextEffect__Group_1__1__Impl


    // $ANTLR start rule__TextEffect__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2207:1: rule__TextEffect__Group_1__2 : rule__TextEffect__Group_1__2__Impl ;
    public final void rule__TextEffect__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2211:1: ( rule__TextEffect__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2212:2: rule__TextEffect__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__2__Impl_in_rule__TextEffect__Group_1__24599);
            rule__TextEffect__Group_1__2__Impl();
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
    // $ANTLR end rule__TextEffect__Group_1__2


    // $ANTLR start rule__TextEffect__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2218:1: rule__TextEffect__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextEffect__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2222:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2223:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2223:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2224:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__TextEffect__Group_1__2__Impl4627); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextEffectAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextEffect__Group_1__2__Impl


    // $ANTLR start rule__SignalReference__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2243:1: rule__SignalReference__Group__0 : rule__SignalReference__Group__0__Impl rule__SignalReference__Group__1 ;
    public final void rule__SignalReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2247:1: ( rule__SignalReference__Group__0__Impl rule__SignalReference__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2248:2: rule__SignalReference__Group__0__Impl rule__SignalReference__Group__1
            {
            pushFollow(FOLLOW_rule__SignalReference__Group__0__Impl_in_rule__SignalReference__Group__04664);
            rule__SignalReference__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SignalReference__Group__1_in_rule__SignalReference__Group__04667);
            rule__SignalReference__Group__1();
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
    // $ANTLR end rule__SignalReference__Group__0


    // $ANTLR start rule__SignalReference__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2255:1: rule__SignalReference__Group__0__Impl : ( ( rule__SignalReference__SignalAssignment_0 ) ) ;
    public final void rule__SignalReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2259:1: ( ( ( rule__SignalReference__SignalAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2260:1: ( ( rule__SignalReference__SignalAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2260:1: ( ( rule__SignalReference__SignalAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2261:1: ( rule__SignalReference__SignalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2262:1: ( rule__SignalReference__SignalAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2262:2: rule__SignalReference__SignalAssignment_0
            {
            pushFollow(FOLLOW_rule__SignalReference__SignalAssignment_0_in_rule__SignalReference__Group__0__Impl4694);
            rule__SignalReference__SignalAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getSignalAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalReference__Group__0__Impl


    // $ANTLR start rule__SignalReference__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2272:1: rule__SignalReference__Group__1 : rule__SignalReference__Group__1__Impl ;
    public final void rule__SignalReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2276:1: ( rule__SignalReference__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2277:2: rule__SignalReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignalReference__Group__1__Impl_in_rule__SignalReference__Group__14724);
            rule__SignalReference__Group__1__Impl();
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
    // $ANTLR end rule__SignalReference__Group__1


    // $ANTLR start rule__SignalReference__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2283:1: rule__SignalReference__Group__1__Impl : ( ( rule__SignalReference__Group_1__0 )? ) ;
    public final void rule__SignalReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2287:1: ( ( ( rule__SignalReference__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2288:1: ( ( rule__SignalReference__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2288:1: ( ( rule__SignalReference__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2289:1: ( rule__SignalReference__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2290:1: ( rule__SignalReference__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                int LA22_1 = input.LA(2);

                if ( (synpred37()) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2290:2: rule__SignalReference__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SignalReference__Group_1__0_in_rule__SignalReference__Group__1__Impl4751);
                    rule__SignalReference__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalReference__Group__1__Impl


    // $ANTLR start rule__SignalReference__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2304:1: rule__SignalReference__Group_1__0 : rule__SignalReference__Group_1__0__Impl rule__SignalReference__Group_1__1 ;
    public final void rule__SignalReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2308:1: ( rule__SignalReference__Group_1__0__Impl rule__SignalReference__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2309:2: rule__SignalReference__Group_1__0__Impl rule__SignalReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__SignalReference__Group_1__0__Impl_in_rule__SignalReference__Group_1__04786);
            rule__SignalReference__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SignalReference__Group_1__1_in_rule__SignalReference__Group_1__04789);
            rule__SignalReference__Group_1__1();
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
    // $ANTLR end rule__SignalReference__Group_1__0


    // $ANTLR start rule__SignalReference__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2316:1: rule__SignalReference__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SignalReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2320:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2321:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2321:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2322:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__SignalReference__Group_1__0__Impl4817); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalReference__Group_1__0__Impl


    // $ANTLR start rule__SignalReference__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2335:1: rule__SignalReference__Group_1__1 : rule__SignalReference__Group_1__1__Impl rule__SignalReference__Group_1__2 ;
    public final void rule__SignalReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2339:1: ( rule__SignalReference__Group_1__1__Impl rule__SignalReference__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2340:2: rule__SignalReference__Group_1__1__Impl rule__SignalReference__Group_1__2
            {
            pushFollow(FOLLOW_rule__SignalReference__Group_1__1__Impl_in_rule__SignalReference__Group_1__14848);
            rule__SignalReference__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SignalReference__Group_1__2_in_rule__SignalReference__Group_1__14851);
            rule__SignalReference__Group_1__2();
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
    // $ANTLR end rule__SignalReference__Group_1__1


    // $ANTLR start rule__SignalReference__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2347:1: rule__SignalReference__Group_1__1__Impl : ( ( rule__SignalReference__Group_1_1__0 )* ) ;
    public final void rule__SignalReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2351:1: ( ( ( rule__SignalReference__Group_1_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2352:1: ( ( rule__SignalReference__Group_1_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2352:1: ( ( rule__SignalReference__Group_1_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2353:1: ( rule__SignalReference__Group_1_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getGroup_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2354:1: ( rule__SignalReference__Group_1_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_INT && LA23_0<=RULE_BOOLEAN)||(LA23_0>=13 && LA23_0<=15)||LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2354:2: rule__SignalReference__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SignalReference__Group_1_1__0_in_rule__SignalReference__Group_1__1__Impl4878);
            	    rule__SignalReference__Group_1_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalReference__Group_1__1__Impl


    // $ANTLR start rule__SignalReference__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2364:1: rule__SignalReference__Group_1__2 : rule__SignalReference__Group_1__2__Impl ;
    public final void rule__SignalReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2368:1: ( rule__SignalReference__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2369:2: rule__SignalReference__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SignalReference__Group_1__2__Impl_in_rule__SignalReference__Group_1__24909);
            rule__SignalReference__Group_1__2__Impl();
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
    // $ANTLR end rule__SignalReference__Group_1__2


    // $ANTLR start rule__SignalReference__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2375:1: rule__SignalReference__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SignalReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2379:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2380:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2380:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2381:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__SignalReference__Group_1__2__Impl4937); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalReference__Group_1__2__Impl


    // $ANTLR start rule__SignalReference__Group_1_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2400:1: rule__SignalReference__Group_1_1__0 : rule__SignalReference__Group_1_1__0__Impl rule__SignalReference__Group_1_1__1 ;
    public final void rule__SignalReference__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2404:1: ( rule__SignalReference__Group_1_1__0__Impl rule__SignalReference__Group_1_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2405:2: rule__SignalReference__Group_1_1__0__Impl rule__SignalReference__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__SignalReference__Group_1_1__0__Impl_in_rule__SignalReference__Group_1_1__04974);
            rule__SignalReference__Group_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SignalReference__Group_1_1__1_in_rule__SignalReference__Group_1_1__04977);
            rule__SignalReference__Group_1_1__1();
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
    // $ANTLR end rule__SignalReference__Group_1_1__0


    // $ANTLR start rule__SignalReference__Group_1_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2412:1: rule__SignalReference__Group_1_1__0__Impl : ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) ) ;
    public final void rule__SignalReference__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2416:1: ( ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2417:1: ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2417:1: ( ( rule__SignalReference__SubExpressionsAssignment_1_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2418:1: ( rule__SignalReference__SubExpressionsAssignment_1_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSubExpressionsAssignment_1_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2419:1: ( rule__SignalReference__SubExpressionsAssignment_1_1_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2419:2: rule__SignalReference__SubExpressionsAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__SignalReference__SubExpressionsAssignment_1_1_0_in_rule__SignalReference__Group_1_1__0__Impl5004);
            rule__SignalReference__SubExpressionsAssignment_1_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getSubExpressionsAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalReference__Group_1_1__0__Impl


    // $ANTLR start rule__SignalReference__Group_1_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2429:1: rule__SignalReference__Group_1_1__1 : rule__SignalReference__Group_1_1__1__Impl ;
    public final void rule__SignalReference__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2433:1: ( rule__SignalReference__Group_1_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2434:2: rule__SignalReference__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SignalReference__Group_1_1__1__Impl_in_rule__SignalReference__Group_1_1__15034);
            rule__SignalReference__Group_1_1__1__Impl();
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
    // $ANTLR end rule__SignalReference__Group_1_1__1


    // $ANTLR start rule__SignalReference__Group_1_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2440:1: rule__SignalReference__Group_1_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__SignalReference__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2444:1: ( ( ( ',' )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2445:1: ( ( ',' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2445:1: ( ( ',' )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2446:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getCommaKeyword_1_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2447:1: ( ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2448:2: ','
                    {
                    match(input,29,FOLLOW_29_in_rule__SignalReference__Group_1_1__1__Impl5063); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getCommaKeyword_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalReference__Group_1_1__1__Impl


    // $ANTLR start rule__VariableReference__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2463:1: rule__VariableReference__Group__0 : rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 ;
    public final void rule__VariableReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2467:1: ( rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2468:2: rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__05100);
            rule__VariableReference__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__05103);
            rule__VariableReference__Group__1();
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
    // $ANTLR end rule__VariableReference__Group__0


    // $ANTLR start rule__VariableReference__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2475:1: rule__VariableReference__Group__0__Impl : ( ( rule__VariableReference__VariableAssignment_0 ) ) ;
    public final void rule__VariableReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2479:1: ( ( ( rule__VariableReference__VariableAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2480:1: ( ( rule__VariableReference__VariableAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2480:1: ( ( rule__VariableReference__VariableAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2481:1: ( rule__VariableReference__VariableAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2482:1: ( rule__VariableReference__VariableAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2482:2: rule__VariableReference__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableReference__VariableAssignment_0_in_rule__VariableReference__Group__0__Impl5130);
            rule__VariableReference__VariableAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariableReference__Group__0__Impl


    // $ANTLR start rule__VariableReference__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2492:1: rule__VariableReference__Group__1 : rule__VariableReference__Group__1__Impl ;
    public final void rule__VariableReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2496:1: ( rule__VariableReference__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2497:2: rule__VariableReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__15160);
            rule__VariableReference__Group__1__Impl();
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
    // $ANTLR end rule__VariableReference__Group__1


    // $ANTLR start rule__VariableReference__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2503:1: rule__VariableReference__Group__1__Impl : ( ( rule__VariableReference__Group_1__0 )? ) ;
    public final void rule__VariableReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2507:1: ( ( ( rule__VariableReference__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2508:1: ( ( rule__VariableReference__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2508:1: ( ( rule__VariableReference__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2509:1: ( rule__VariableReference__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2510:1: ( rule__VariableReference__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                int LA25_1 = input.LA(2);

                if ( (synpred40()) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2510:2: rule__VariableReference__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__VariableReference__Group_1__0_in_rule__VariableReference__Group__1__Impl5187);
                    rule__VariableReference__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariableReference__Group__1__Impl


    // $ANTLR start rule__VariableReference__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2524:1: rule__VariableReference__Group_1__0 : rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1 ;
    public final void rule__VariableReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2528:1: ( rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2529:2: rule__VariableReference__Group_1__0__Impl rule__VariableReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__0__Impl_in_rule__VariableReference__Group_1__05222);
            rule__VariableReference__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group_1__1_in_rule__VariableReference__Group_1__05225);
            rule__VariableReference__Group_1__1();
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
    // $ANTLR end rule__VariableReference__Group_1__0


    // $ANTLR start rule__VariableReference__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2536:1: rule__VariableReference__Group_1__0__Impl : ( '(' ) ;
    public final void rule__VariableReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2540:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2541:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2541:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2542:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__VariableReference__Group_1__0__Impl5253); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariableReference__Group_1__0__Impl


    // $ANTLR start rule__VariableReference__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2555:1: rule__VariableReference__Group_1__1 : rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2 ;
    public final void rule__VariableReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2559:1: ( rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2560:2: rule__VariableReference__Group_1__1__Impl rule__VariableReference__Group_1__2
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__1__Impl_in_rule__VariableReference__Group_1__15284);
            rule__VariableReference__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group_1__2_in_rule__VariableReference__Group_1__15287);
            rule__VariableReference__Group_1__2();
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
    // $ANTLR end rule__VariableReference__Group_1__1


    // $ANTLR start rule__VariableReference__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2567:1: rule__VariableReference__Group_1__1__Impl : ( ( rule__VariableReference__Group_1_1__0 )* ) ;
    public final void rule__VariableReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2571:1: ( ( ( rule__VariableReference__Group_1_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2572:1: ( ( rule__VariableReference__Group_1_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2572:1: ( ( rule__VariableReference__Group_1_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2573:1: ( rule__VariableReference__Group_1_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2574:1: ( rule__VariableReference__Group_1_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_INT && LA26_0<=RULE_BOOLEAN)||(LA26_0>=13 && LA26_0<=15)||LA26_0==30) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2574:2: rule__VariableReference__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableReference__Group_1_1__0_in_rule__VariableReference__Group_1__1__Impl5314);
            	    rule__VariableReference__Group_1_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariableReference__Group_1__1__Impl


    // $ANTLR start rule__VariableReference__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2584:1: rule__VariableReference__Group_1__2 : rule__VariableReference__Group_1__2__Impl ;
    public final void rule__VariableReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2588:1: ( rule__VariableReference__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2589:2: rule__VariableReference__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1__2__Impl_in_rule__VariableReference__Group_1__25345);
            rule__VariableReference__Group_1__2__Impl();
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
    // $ANTLR end rule__VariableReference__Group_1__2


    // $ANTLR start rule__VariableReference__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2595:1: rule__VariableReference__Group_1__2__Impl : ( ')' ) ;
    public final void rule__VariableReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2599:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2600:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2600:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2601:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__VariableReference__Group_1__2__Impl5373); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariableReference__Group_1__2__Impl


    // $ANTLR start rule__VariableReference__Group_1_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2620:1: rule__VariableReference__Group_1_1__0 : rule__VariableReference__Group_1_1__0__Impl rule__VariableReference__Group_1_1__1 ;
    public final void rule__VariableReference__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2624:1: ( rule__VariableReference__Group_1_1__0__Impl rule__VariableReference__Group_1_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2625:2: rule__VariableReference__Group_1_1__0__Impl rule__VariableReference__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1_1__0__Impl_in_rule__VariableReference__Group_1_1__05410);
            rule__VariableReference__Group_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__VariableReference__Group_1_1__1_in_rule__VariableReference__Group_1_1__05413);
            rule__VariableReference__Group_1_1__1();
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
    // $ANTLR end rule__VariableReference__Group_1_1__0


    // $ANTLR start rule__VariableReference__Group_1_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2632:1: rule__VariableReference__Group_1_1__0__Impl : ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) ) ;
    public final void rule__VariableReference__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2636:1: ( ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2637:1: ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2637:1: ( ( rule__VariableReference__SubExpressionsAssignment_1_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2638:1: ( rule__VariableReference__SubExpressionsAssignment_1_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getSubExpressionsAssignment_1_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2639:1: ( rule__VariableReference__SubExpressionsAssignment_1_1_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2639:2: rule__VariableReference__SubExpressionsAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__VariableReference__SubExpressionsAssignment_1_1_0_in_rule__VariableReference__Group_1_1__0__Impl5440);
            rule__VariableReference__SubExpressionsAssignment_1_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getSubExpressionsAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariableReference__Group_1_1__0__Impl


    // $ANTLR start rule__VariableReference__Group_1_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2649:1: rule__VariableReference__Group_1_1__1 : rule__VariableReference__Group_1_1__1__Impl ;
    public final void rule__VariableReference__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2653:1: ( rule__VariableReference__Group_1_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2654:2: rule__VariableReference__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableReference__Group_1_1__1__Impl_in_rule__VariableReference__Group_1_1__15470);
            rule__VariableReference__Group_1_1__1__Impl();
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
    // $ANTLR end rule__VariableReference__Group_1_1__1


    // $ANTLR start rule__VariableReference__Group_1_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2660:1: rule__VariableReference__Group_1_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__VariableReference__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2664:1: ( ( ( ',' )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2665:1: ( ( ',' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2665:1: ( ( ',' )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2666:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getCommaKeyword_1_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2667:1: ( ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2668:2: ','
                    {
                    match(input,29,FOLLOW_29_in_rule__VariableReference__Group_1_1__1__Impl5499); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getCommaKeyword_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariableReference__Group_1_1__1__Impl


    // $ANTLR start rule__ValOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2683:1: rule__ValOperation__Group__0 : rule__ValOperation__Group__0__Impl rule__ValOperation__Group__1 ;
    public final void rule__ValOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2687:1: ( rule__ValOperation__Group__0__Impl rule__ValOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2688:2: rule__ValOperation__Group__0__Impl rule__ValOperation__Group__1
            {
            pushFollow(FOLLOW_rule__ValOperation__Group__0__Impl_in_rule__ValOperation__Group__05536);
            rule__ValOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValOperation__Group__1_in_rule__ValOperation__Group__05539);
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


    // $ANTLR start rule__ValOperation__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2695:1: rule__ValOperation__Group__0__Impl : ( ( rule__ValOperation__OperatorAssignment_0 ) ) ;
    public final void rule__ValOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2699:1: ( ( ( rule__ValOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2700:1: ( ( rule__ValOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2700:1: ( ( rule__ValOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2701:1: ( rule__ValOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2702:1: ( rule__ValOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2702:2: rule__ValOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__ValOperation__OperatorAssignment_0_in_rule__ValOperation__Group__0__Impl5566);
            rule__ValOperation__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValOperationAccess().getOperatorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValOperation__Group__0__Impl


    // $ANTLR start rule__ValOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2712:1: rule__ValOperation__Group__1 : rule__ValOperation__Group__1__Impl ;
    public final void rule__ValOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2716:1: ( rule__ValOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2717:2: rule__ValOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ValOperation__Group__1__Impl_in_rule__ValOperation__Group__15596);
            rule__ValOperation__Group__1__Impl();
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
    // $ANTLR end rule__ValOperation__Group__1


    // $ANTLR start rule__ValOperation__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2723:1: rule__ValOperation__Group__1__Impl : ( ( rule__ValOperation__SubExpressionsAssignment_1 ) ) ;
    public final void rule__ValOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2727:1: ( ( ( rule__ValOperation__SubExpressionsAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2728:1: ( ( rule__ValOperation__SubExpressionsAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2728:1: ( ( rule__ValOperation__SubExpressionsAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2729:1: ( rule__ValOperation__SubExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getSubExpressionsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2730:1: ( rule__ValOperation__SubExpressionsAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2730:2: rule__ValOperation__SubExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__ValOperation__SubExpressionsAssignment_1_in_rule__ValOperation__Group__1__Impl5623);
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
    // $ANTLR end rule__ValOperation__Group__1__Impl


    // $ANTLR start rule__ParanthesedValuedExpression__Group_5__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2744:1: rule__ParanthesedValuedExpression__Group_5__0 : rule__ParanthesedValuedExpression__Group_5__0__Impl rule__ParanthesedValuedExpression__Group_5__1 ;
    public final void rule__ParanthesedValuedExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2748:1: ( rule__ParanthesedValuedExpression__Group_5__0__Impl rule__ParanthesedValuedExpression__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2749:2: rule__ParanthesedValuedExpression__Group_5__0__Impl rule__ParanthesedValuedExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__ParanthesedValuedExpression__Group_5__0__Impl_in_rule__ParanthesedValuedExpression__Group_5__05657);
            rule__ParanthesedValuedExpression__Group_5__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ParanthesedValuedExpression__Group_5__1_in_rule__ParanthesedValuedExpression__Group_5__05660);
            rule__ParanthesedValuedExpression__Group_5__1();
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
    // $ANTLR end rule__ParanthesedValuedExpression__Group_5__0


    // $ANTLR start rule__ParanthesedValuedExpression__Group_5__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2756:1: rule__ParanthesedValuedExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__ParanthesedValuedExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2760:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2761:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2761:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2762:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParanthesedValuedExpression__Group_5__0__Impl5688); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValuedExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValuedExpression__Group_5__0__Impl


    // $ANTLR start rule__ParanthesedValuedExpression__Group_5__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2775:1: rule__ParanthesedValuedExpression__Group_5__1 : rule__ParanthesedValuedExpression__Group_5__1__Impl rule__ParanthesedValuedExpression__Group_5__2 ;
    public final void rule__ParanthesedValuedExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2779:1: ( rule__ParanthesedValuedExpression__Group_5__1__Impl rule__ParanthesedValuedExpression__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2780:2: rule__ParanthesedValuedExpression__Group_5__1__Impl rule__ParanthesedValuedExpression__Group_5__2
            {
            pushFollow(FOLLOW_rule__ParanthesedValuedExpression__Group_5__1__Impl_in_rule__ParanthesedValuedExpression__Group_5__15719);
            rule__ParanthesedValuedExpression__Group_5__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ParanthesedValuedExpression__Group_5__2_in_rule__ParanthesedValuedExpression__Group_5__15722);
            rule__ParanthesedValuedExpression__Group_5__2();
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
    // $ANTLR end rule__ParanthesedValuedExpression__Group_5__1


    // $ANTLR start rule__ParanthesedValuedExpression__Group_5__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2787:1: rule__ParanthesedValuedExpression__Group_5__1__Impl : ( rulePlusOperation ) ;
    public final void rule__ParanthesedValuedExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2791:1: ( ( rulePlusOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2792:1: ( rulePlusOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2792:1: ( rulePlusOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2793:1: rulePlusOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getPlusOperationParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_rule__ParanthesedValuedExpression__Group_5__1__Impl5749);
            rulePlusOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValuedExpressionAccess().getPlusOperationParserRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValuedExpression__Group_5__1__Impl


    // $ANTLR start rule__ParanthesedValuedExpression__Group_5__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2804:1: rule__ParanthesedValuedExpression__Group_5__2 : rule__ParanthesedValuedExpression__Group_5__2__Impl ;
    public final void rule__ParanthesedValuedExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2808:1: ( rule__ParanthesedValuedExpression__Group_5__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2809:2: rule__ParanthesedValuedExpression__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ParanthesedValuedExpression__Group_5__2__Impl_in_rule__ParanthesedValuedExpression__Group_5__25778);
            rule__ParanthesedValuedExpression__Group_5__2__Impl();
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
    // $ANTLR end rule__ParanthesedValuedExpression__Group_5__2


    // $ANTLR start rule__ParanthesedValuedExpression__Group_5__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2815:1: rule__ParanthesedValuedExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__ParanthesedValuedExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2819:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2820:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2820:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2821:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ParanthesedValuedExpression__Group_5__2__Impl5806); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValuedExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValuedExpression__Group_5__2__Impl


    // $ANTLR start rule__ParanthesedValuedExpression__Group_6__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2840:1: rule__ParanthesedValuedExpression__Group_6__0 : rule__ParanthesedValuedExpression__Group_6__0__Impl rule__ParanthesedValuedExpression__Group_6__1 ;
    public final void rule__ParanthesedValuedExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2844:1: ( rule__ParanthesedValuedExpression__Group_6__0__Impl rule__ParanthesedValuedExpression__Group_6__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2845:2: rule__ParanthesedValuedExpression__Group_6__0__Impl rule__ParanthesedValuedExpression__Group_6__1
            {
            pushFollow(FOLLOW_rule__ParanthesedValuedExpression__Group_6__0__Impl_in_rule__ParanthesedValuedExpression__Group_6__05843);
            rule__ParanthesedValuedExpression__Group_6__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ParanthesedValuedExpression__Group_6__1_in_rule__ParanthesedValuedExpression__Group_6__05846);
            rule__ParanthesedValuedExpression__Group_6__1();
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
    // $ANTLR end rule__ParanthesedValuedExpression__Group_6__0


    // $ANTLR start rule__ParanthesedValuedExpression__Group_6__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2852:1: rule__ParanthesedValuedExpression__Group_6__0__Impl : ( '(' ) ;
    public final void rule__ParanthesedValuedExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2856:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2857:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2857:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2858:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParanthesedValuedExpression__Group_6__0__Impl5874); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValuedExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValuedExpression__Group_6__0__Impl


    // $ANTLR start rule__ParanthesedValuedExpression__Group_6__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2871:1: rule__ParanthesedValuedExpression__Group_6__1 : rule__ParanthesedValuedExpression__Group_6__1__Impl rule__ParanthesedValuedExpression__Group_6__2 ;
    public final void rule__ParanthesedValuedExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2875:1: ( rule__ParanthesedValuedExpression__Group_6__1__Impl rule__ParanthesedValuedExpression__Group_6__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2876:2: rule__ParanthesedValuedExpression__Group_6__1__Impl rule__ParanthesedValuedExpression__Group_6__2
            {
            pushFollow(FOLLOW_rule__ParanthesedValuedExpression__Group_6__1__Impl_in_rule__ParanthesedValuedExpression__Group_6__15905);
            rule__ParanthesedValuedExpression__Group_6__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ParanthesedValuedExpression__Group_6__2_in_rule__ParanthesedValuedExpression__Group_6__15908);
            rule__ParanthesedValuedExpression__Group_6__2();
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
    // $ANTLR end rule__ParanthesedValuedExpression__Group_6__1


    // $ANTLR start rule__ParanthesedValuedExpression__Group_6__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2883:1: rule__ParanthesedValuedExpression__Group_6__1__Impl : ( ruleDivOperation ) ;
    public final void rule__ParanthesedValuedExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2887:1: ( ( ruleDivOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2888:1: ( ruleDivOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2888:1: ( ruleDivOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2889:1: ruleDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getDivOperationParserRuleCall_6_1()); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_rule__ParanthesedValuedExpression__Group_6__1__Impl5935);
            ruleDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValuedExpressionAccess().getDivOperationParserRuleCall_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValuedExpression__Group_6__1__Impl


    // $ANTLR start rule__ParanthesedValuedExpression__Group_6__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2900:1: rule__ParanthesedValuedExpression__Group_6__2 : rule__ParanthesedValuedExpression__Group_6__2__Impl ;
    public final void rule__ParanthesedValuedExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2904:1: ( rule__ParanthesedValuedExpression__Group_6__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2905:2: rule__ParanthesedValuedExpression__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__ParanthesedValuedExpression__Group_6__2__Impl_in_rule__ParanthesedValuedExpression__Group_6__25964);
            rule__ParanthesedValuedExpression__Group_6__2__Impl();
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
    // $ANTLR end rule__ParanthesedValuedExpression__Group_6__2


    // $ANTLR start rule__ParanthesedValuedExpression__Group_6__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2911:1: rule__ParanthesedValuedExpression__Group_6__2__Impl : ( ')' ) ;
    public final void rule__ParanthesedValuedExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2915:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2916:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2916:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2917:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValuedExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ParanthesedValuedExpression__Group_6__2__Impl5992); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValuedExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValuedExpression__Group_6__2__Impl


    // $ANTLR start rule__PlusOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2936:1: rule__PlusOperation__Group__0 : rule__PlusOperation__Group__0__Impl rule__PlusOperation__Group__1 ;
    public final void rule__PlusOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2940:1: ( rule__PlusOperation__Group__0__Impl rule__PlusOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2941:2: rule__PlusOperation__Group__0__Impl rule__PlusOperation__Group__1
            {
            pushFollow(FOLLOW_rule__PlusOperation__Group__0__Impl_in_rule__PlusOperation__Group__06029);
            rule__PlusOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PlusOperation__Group__1_in_rule__PlusOperation__Group__06032);
            rule__PlusOperation__Group__1();
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
    // $ANTLR end rule__PlusOperation__Group__0


    // $ANTLR start rule__PlusOperation__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2948:1: rule__PlusOperation__Group__0__Impl : ( ruleMultOrDivOperation ) ;
    public final void rule__PlusOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2952:1: ( ( ruleMultOrDivOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2953:1: ( ruleMultOrDivOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2953:1: ( ruleMultOrDivOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2954:1: ruleMultOrDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getMultOrDivOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__Group__0__Impl6059);
            ruleMultOrDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationAccess().getMultOrDivOperationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PlusOperation__Group__0__Impl


    // $ANTLR start rule__PlusOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2965:1: rule__PlusOperation__Group__1 : rule__PlusOperation__Group__1__Impl ;
    public final void rule__PlusOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2969:1: ( rule__PlusOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2970:2: rule__PlusOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOperation__Group__1__Impl_in_rule__PlusOperation__Group__16088);
            rule__PlusOperation__Group__1__Impl();
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
    // $ANTLR end rule__PlusOperation__Group__1


    // $ANTLR start rule__PlusOperation__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2976:1: rule__PlusOperation__Group__1__Impl : ( ( rule__PlusOperation__Group_1__0 )* ) ;
    public final void rule__PlusOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2980:1: ( ( ( rule__PlusOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2981:1: ( ( rule__PlusOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2981:1: ( ( rule__PlusOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2982:1: ( rule__PlusOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2983:1: ( rule__PlusOperation__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=25 && LA28_0<=26)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2983:2: rule__PlusOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOperation__Group_1__0_in_rule__PlusOperation__Group__1__Impl6115);
            	    rule__PlusOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PlusOperation__Group__1__Impl


    // $ANTLR start rule__PlusOperation__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2997:1: rule__PlusOperation__Group_1__0 : rule__PlusOperation__Group_1__0__Impl rule__PlusOperation__Group_1__1 ;
    public final void rule__PlusOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3001:1: ( rule__PlusOperation__Group_1__0__Impl rule__PlusOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3002:2: rule__PlusOperation__Group_1__0__Impl rule__PlusOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__PlusOperation__Group_1__0__Impl_in_rule__PlusOperation__Group_1__06150);
            rule__PlusOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PlusOperation__Group_1__1_in_rule__PlusOperation__Group_1__06153);
            rule__PlusOperation__Group_1__1();
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
    // $ANTLR end rule__PlusOperation__Group_1__0


    // $ANTLR start rule__PlusOperation__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3009:1: rule__PlusOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__PlusOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3013:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3014:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3014:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3015:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3016:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3018:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PlusOperation__Group_1__0__Impl


    // $ANTLR start rule__PlusOperation__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3028:1: rule__PlusOperation__Group_1__1 : rule__PlusOperation__Group_1__1__Impl rule__PlusOperation__Group_1__2 ;
    public final void rule__PlusOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3032:1: ( rule__PlusOperation__Group_1__1__Impl rule__PlusOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3033:2: rule__PlusOperation__Group_1__1__Impl rule__PlusOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__PlusOperation__Group_1__1__Impl_in_rule__PlusOperation__Group_1__16211);
            rule__PlusOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PlusOperation__Group_1__2_in_rule__PlusOperation__Group_1__16214);
            rule__PlusOperation__Group_1__2();
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
    // $ANTLR end rule__PlusOperation__Group_1__1


    // $ANTLR start rule__PlusOperation__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3040:1: rule__PlusOperation__Group_1__1__Impl : ( ( rule__PlusOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__PlusOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3044:1: ( ( ( rule__PlusOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3045:1: ( ( rule__PlusOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3045:1: ( ( rule__PlusOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3046:1: ( rule__PlusOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3047:1: ( rule__PlusOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3047:2: rule__PlusOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOperation__OperatorAssignment_1_1_in_rule__PlusOperation__Group_1__1__Impl6241);
            rule__PlusOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PlusOperation__Group_1__1__Impl


    // $ANTLR start rule__PlusOperation__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3057:1: rule__PlusOperation__Group_1__2 : rule__PlusOperation__Group_1__2__Impl ;
    public final void rule__PlusOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3061:1: ( rule__PlusOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3062:2: rule__PlusOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PlusOperation__Group_1__2__Impl_in_rule__PlusOperation__Group_1__26271);
            rule__PlusOperation__Group_1__2__Impl();
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
    // $ANTLR end rule__PlusOperation__Group_1__2


    // $ANTLR start rule__PlusOperation__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3068:1: rule__PlusOperation__Group_1__2__Impl : ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__PlusOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3072:1: ( ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3073:1: ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3073:1: ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3074:1: ( rule__PlusOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3075:1: ( rule__PlusOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3075:2: rule__PlusOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PlusOperation__SubExpressionsAssignment_1_2_in_rule__PlusOperation__Group_1__2__Impl6298);
            rule__PlusOperation__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationAccess().getSubExpressionsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PlusOperation__Group_1__2__Impl


    // $ANTLR start rule__MultOrDivOperation__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3091:1: rule__MultOrDivOperation__Group_1__0 : rule__MultOrDivOperation__Group_1__0__Impl rule__MultOrDivOperation__Group_1__1 ;
    public final void rule__MultOrDivOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3095:1: ( rule__MultOrDivOperation__Group_1__0__Impl rule__MultOrDivOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3096:2: rule__MultOrDivOperation__Group_1__0__Impl rule__MultOrDivOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__0__Impl_in_rule__MultOrDivOperation__Group_1__06334);
            rule__MultOrDivOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__1_in_rule__MultOrDivOperation__Group_1__06337);
            rule__MultOrDivOperation__Group_1__1();
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
    // $ANTLR end rule__MultOrDivOperation__Group_1__0


    // $ANTLR start rule__MultOrDivOperation__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3103:1: rule__MultOrDivOperation__Group_1__0__Impl : ( '(' ) ;
    public final void rule__MultOrDivOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3107:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3108:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3108:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3109:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__MultOrDivOperation__Group_1__0__Impl6365); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOrDivOperationAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultOrDivOperation__Group_1__0__Impl


    // $ANTLR start rule__MultOrDivOperation__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3122:1: rule__MultOrDivOperation__Group_1__1 : rule__MultOrDivOperation__Group_1__1__Impl rule__MultOrDivOperation__Group_1__2 ;
    public final void rule__MultOrDivOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3126:1: ( rule__MultOrDivOperation__Group_1__1__Impl rule__MultOrDivOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3127:2: rule__MultOrDivOperation__Group_1__1__Impl rule__MultOrDivOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__1__Impl_in_rule__MultOrDivOperation__Group_1__16396);
            rule__MultOrDivOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__2_in_rule__MultOrDivOperation__Group_1__16399);
            rule__MultOrDivOperation__Group_1__2();
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
    // $ANTLR end rule__MultOrDivOperation__Group_1__1


    // $ANTLR start rule__MultOrDivOperation__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3134:1: rule__MultOrDivOperation__Group_1__1__Impl : ( ruleDivOperation ) ;
    public final void rule__MultOrDivOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3138:1: ( ( ruleDivOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3139:1: ( ruleDivOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3139:1: ( ruleDivOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3140:1: ruleDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getDivOperationParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_rule__MultOrDivOperation__Group_1__1__Impl6426);
            ruleDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOrDivOperationAccess().getDivOperationParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultOrDivOperation__Group_1__1__Impl


    // $ANTLR start rule__MultOrDivOperation__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3151:1: rule__MultOrDivOperation__Group_1__2 : rule__MultOrDivOperation__Group_1__2__Impl ;
    public final void rule__MultOrDivOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3155:1: ( rule__MultOrDivOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3156:2: rule__MultOrDivOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__2__Impl_in_rule__MultOrDivOperation__Group_1__26455);
            rule__MultOrDivOperation__Group_1__2__Impl();
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
    // $ANTLR end rule__MultOrDivOperation__Group_1__2


    // $ANTLR start rule__MultOrDivOperation__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3162:1: rule__MultOrDivOperation__Group_1__2__Impl : ( ')' ) ;
    public final void rule__MultOrDivOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3166:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3167:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3167:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3168:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__MultOrDivOperation__Group_1__2__Impl6483); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOrDivOperationAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultOrDivOperation__Group_1__2__Impl


    // $ANTLR start rule__MultOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3187:1: rule__MultOperation__Group__0 : rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1 ;
    public final void rule__MultOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3191:1: ( rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3192:2: rule__MultOperation__Group__0__Impl rule__MultOperation__Group__1
            {
            pushFollow(FOLLOW_rule__MultOperation__Group__0__Impl_in_rule__MultOperation__Group__06520);
            rule__MultOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultOperation__Group__1_in_rule__MultOperation__Group__06523);
            rule__MultOperation__Group__1();
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
    // $ANTLR end rule__MultOperation__Group__0


    // $ANTLR start rule__MultOperation__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3199:1: rule__MultOperation__Group__0__Impl : ( rulePreOrNormalValuedExpression ) ;
    public final void rule__MultOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3203:1: ( ( rulePreOrNormalValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3204:1: ( rulePreOrNormalValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3204:1: ( rulePreOrNormalValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3205:1: rulePreOrNormalValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getPreOrNormalValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValuedExpression_in_rule__MultOperation__Group__0__Impl6550);
            rulePreOrNormalValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getPreOrNormalValuedExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultOperation__Group__0__Impl


    // $ANTLR start rule__MultOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3216:1: rule__MultOperation__Group__1 : rule__MultOperation__Group__1__Impl ;
    public final void rule__MultOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3220:1: ( rule__MultOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3221:2: rule__MultOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultOperation__Group__1__Impl_in_rule__MultOperation__Group__16579);
            rule__MultOperation__Group__1__Impl();
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
    // $ANTLR end rule__MultOperation__Group__1


    // $ANTLR start rule__MultOperation__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3227:1: rule__MultOperation__Group__1__Impl : ( ( rule__MultOperation__Group_1__0 )* ) ;
    public final void rule__MultOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3231:1: ( ( ( rule__MultOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3232:1: ( ( rule__MultOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3232:1: ( ( rule__MultOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3233:1: ( rule__MultOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3234:1: ( rule__MultOperation__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=27 && LA29_0<=28)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3234:2: rule__MultOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultOperation__Group_1__0_in_rule__MultOperation__Group__1__Impl6606);
            	    rule__MultOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultOperation__Group__1__Impl


    // $ANTLR start rule__MultOperation__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3248:1: rule__MultOperation__Group_1__0 : rule__MultOperation__Group_1__0__Impl rule__MultOperation__Group_1__1 ;
    public final void rule__MultOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3252:1: ( rule__MultOperation__Group_1__0__Impl rule__MultOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3253:2: rule__MultOperation__Group_1__0__Impl rule__MultOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultOperation__Group_1__0__Impl_in_rule__MultOperation__Group_1__06641);
            rule__MultOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultOperation__Group_1__1_in_rule__MultOperation__Group_1__06644);
            rule__MultOperation__Group_1__1();
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
    // $ANTLR end rule__MultOperation__Group_1__0


    // $ANTLR start rule__MultOperation__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3260:1: rule__MultOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__MultOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3264:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3265:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3265:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3266:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3267:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3269:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultOperation__Group_1__0__Impl


    // $ANTLR start rule__MultOperation__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3279:1: rule__MultOperation__Group_1__1 : rule__MultOperation__Group_1__1__Impl rule__MultOperation__Group_1__2 ;
    public final void rule__MultOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3283:1: ( rule__MultOperation__Group_1__1__Impl rule__MultOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3284:2: rule__MultOperation__Group_1__1__Impl rule__MultOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultOperation__Group_1__1__Impl_in_rule__MultOperation__Group_1__16702);
            rule__MultOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultOperation__Group_1__2_in_rule__MultOperation__Group_1__16705);
            rule__MultOperation__Group_1__2();
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
    // $ANTLR end rule__MultOperation__Group_1__1


    // $ANTLR start rule__MultOperation__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3291:1: rule__MultOperation__Group_1__1__Impl : ( ( rule__MultOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3295:1: ( ( ( rule__MultOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3296:1: ( ( rule__MultOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3296:1: ( ( rule__MultOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3297:1: ( rule__MultOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3298:1: ( rule__MultOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3298:2: rule__MultOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultOperation__OperatorAssignment_1_1_in_rule__MultOperation__Group_1__1__Impl6732);
            rule__MultOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultOperation__Group_1__1__Impl


    // $ANTLR start rule__MultOperation__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3308:1: rule__MultOperation__Group_1__2 : rule__MultOperation__Group_1__2__Impl ;
    public final void rule__MultOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3312:1: ( rule__MultOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3313:2: rule__MultOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultOperation__Group_1__2__Impl_in_rule__MultOperation__Group_1__26762);
            rule__MultOperation__Group_1__2__Impl();
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
    // $ANTLR end rule__MultOperation__Group_1__2


    // $ANTLR start rule__MultOperation__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3319:1: rule__MultOperation__Group_1__2__Impl : ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3323:1: ( ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3324:1: ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3324:1: ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3325:1: ( rule__MultOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3326:1: ( rule__MultOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3326:2: rule__MultOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MultOperation__SubExpressionsAssignment_1_2_in_rule__MultOperation__Group_1__2__Impl6789);
            rule__MultOperation__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getSubExpressionsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultOperation__Group_1__2__Impl


    // $ANTLR start rule__DivOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3342:1: rule__DivOperation__Group__0 : rule__DivOperation__Group__0__Impl rule__DivOperation__Group__1 ;
    public final void rule__DivOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3346:1: ( rule__DivOperation__Group__0__Impl rule__DivOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3347:2: rule__DivOperation__Group__0__Impl rule__DivOperation__Group__1
            {
            pushFollow(FOLLOW_rule__DivOperation__Group__0__Impl_in_rule__DivOperation__Group__06825);
            rule__DivOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivOperation__Group__1_in_rule__DivOperation__Group__06828);
            rule__DivOperation__Group__1();
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
    // $ANTLR end rule__DivOperation__Group__0


    // $ANTLR start rule__DivOperation__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3354:1: rule__DivOperation__Group__0__Impl : ( rulePreOrNormalValuedExpression ) ;
    public final void rule__DivOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3358:1: ( ( rulePreOrNormalValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3359:1: ( rulePreOrNormalValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3359:1: ( rulePreOrNormalValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3360:1: rulePreOrNormalValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getPreOrNormalValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValuedExpression_in_rule__DivOperation__Group__0__Impl6855);
            rulePreOrNormalValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getPreOrNormalValuedExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivOperation__Group__0__Impl


    // $ANTLR start rule__DivOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3371:1: rule__DivOperation__Group__1 : rule__DivOperation__Group__1__Impl ;
    public final void rule__DivOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3375:1: ( rule__DivOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3376:2: rule__DivOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DivOperation__Group__1__Impl_in_rule__DivOperation__Group__16884);
            rule__DivOperation__Group__1__Impl();
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
    // $ANTLR end rule__DivOperation__Group__1


    // $ANTLR start rule__DivOperation__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3382:1: rule__DivOperation__Group__1__Impl : ( ( rule__DivOperation__Group_1__0 )* ) ;
    public final void rule__DivOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3386:1: ( ( ( rule__DivOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3387:1: ( ( rule__DivOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3387:1: ( ( rule__DivOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3388:1: ( rule__DivOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3389:1: ( rule__DivOperation__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==18) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3389:2: rule__DivOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DivOperation__Group_1__0_in_rule__DivOperation__Group__1__Impl6911);
            	    rule__DivOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivOperation__Group__1__Impl


    // $ANTLR start rule__DivOperation__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3403:1: rule__DivOperation__Group_1__0 : rule__DivOperation__Group_1__0__Impl rule__DivOperation__Group_1__1 ;
    public final void rule__DivOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3407:1: ( rule__DivOperation__Group_1__0__Impl rule__DivOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3408:2: rule__DivOperation__Group_1__0__Impl rule__DivOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__DivOperation__Group_1__0__Impl_in_rule__DivOperation__Group_1__06946);
            rule__DivOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivOperation__Group_1__1_in_rule__DivOperation__Group_1__06949);
            rule__DivOperation__Group_1__1();
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
    // $ANTLR end rule__DivOperation__Group_1__0


    // $ANTLR start rule__DivOperation__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3415:1: rule__DivOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__DivOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3419:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3420:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3420:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3421:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3422:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3424:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivOperation__Group_1__0__Impl


    // $ANTLR start rule__DivOperation__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3434:1: rule__DivOperation__Group_1__1 : rule__DivOperation__Group_1__1__Impl rule__DivOperation__Group_1__2 ;
    public final void rule__DivOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3438:1: ( rule__DivOperation__Group_1__1__Impl rule__DivOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3439:2: rule__DivOperation__Group_1__1__Impl rule__DivOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__DivOperation__Group_1__1__Impl_in_rule__DivOperation__Group_1__17007);
            rule__DivOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivOperation__Group_1__2_in_rule__DivOperation__Group_1__17010);
            rule__DivOperation__Group_1__2();
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
    // $ANTLR end rule__DivOperation__Group_1__1


    // $ANTLR start rule__DivOperation__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3446:1: rule__DivOperation__Group_1__1__Impl : ( ( rule__DivOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__DivOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3450:1: ( ( ( rule__DivOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3451:1: ( ( rule__DivOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3451:1: ( ( rule__DivOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3452:1: ( rule__DivOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3453:1: ( rule__DivOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3453:2: rule__DivOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DivOperation__OperatorAssignment_1_1_in_rule__DivOperation__Group_1__1__Impl7037);
            rule__DivOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivOperation__Group_1__1__Impl


    // $ANTLR start rule__DivOperation__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3463:1: rule__DivOperation__Group_1__2 : rule__DivOperation__Group_1__2__Impl ;
    public final void rule__DivOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3467:1: ( rule__DivOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3468:2: rule__DivOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__DivOperation__Group_1__2__Impl_in_rule__DivOperation__Group_1__27067);
            rule__DivOperation__Group_1__2__Impl();
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
    // $ANTLR end rule__DivOperation__Group_1__2


    // $ANTLR start rule__DivOperation__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3474:1: rule__DivOperation__Group_1__2__Impl : ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3478:1: ( ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3479:1: ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3479:1: ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3480:1: ( rule__DivOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3481:1: ( rule__DivOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3481:2: rule__DivOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__DivOperation__SubExpressionsAssignment_1_2_in_rule__DivOperation__Group_1__2__Impl7094);
            rule__DivOperation__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getSubExpressionsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivOperation__Group_1__2__Impl


    // $ANTLR start rule__PreArithmOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3497:1: rule__PreArithmOperation__Group__0 : rule__PreArithmOperation__Group__0__Impl rule__PreArithmOperation__Group__1 ;
    public final void rule__PreArithmOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3501:1: ( rule__PreArithmOperation__Group__0__Impl rule__PreArithmOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3502:2: rule__PreArithmOperation__Group__0__Impl rule__PreArithmOperation__Group__1
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__0__Impl_in_rule__PreArithmOperation__Group__07130);
            rule__PreArithmOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__1_in_rule__PreArithmOperation__Group__07133);
            rule__PreArithmOperation__Group__1();
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
    // $ANTLR end rule__PreArithmOperation__Group__0


    // $ANTLR start rule__PreArithmOperation__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3509:1: rule__PreArithmOperation__Group__0__Impl : ( ( rule__PreArithmOperation__OperatorAssignment_0 ) ) ;
    public final void rule__PreArithmOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3513:1: ( ( ( rule__PreArithmOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3514:1: ( ( rule__PreArithmOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3514:1: ( ( rule__PreArithmOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3515:1: ( rule__PreArithmOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3516:1: ( rule__PreArithmOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3516:2: rule__PreArithmOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__OperatorAssignment_0_in_rule__PreArithmOperation__Group__0__Impl7160);
            rule__PreArithmOperation__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationAccess().getOperatorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreArithmOperation__Group__0__Impl


    // $ANTLR start rule__PreArithmOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3526:1: rule__PreArithmOperation__Group__1 : rule__PreArithmOperation__Group__1__Impl rule__PreArithmOperation__Group__2 ;
    public final void rule__PreArithmOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3530:1: ( rule__PreArithmOperation__Group__1__Impl rule__PreArithmOperation__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3531:2: rule__PreArithmOperation__Group__1__Impl rule__PreArithmOperation__Group__2
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__1__Impl_in_rule__PreArithmOperation__Group__17190);
            rule__PreArithmOperation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__2_in_rule__PreArithmOperation__Group__17193);
            rule__PreArithmOperation__Group__2();
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
    // $ANTLR end rule__PreArithmOperation__Group__1


    // $ANTLR start rule__PreArithmOperation__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3538:1: rule__PreArithmOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__PreArithmOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3542:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3543:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3543:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3544:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__PreArithmOperation__Group__1__Impl7221); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreArithmOperation__Group__1__Impl


    // $ANTLR start rule__PreArithmOperation__Group__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3557:1: rule__PreArithmOperation__Group__2 : rule__PreArithmOperation__Group__2__Impl rule__PreArithmOperation__Group__3 ;
    public final void rule__PreArithmOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3561:1: ( rule__PreArithmOperation__Group__2__Impl rule__PreArithmOperation__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3562:2: rule__PreArithmOperation__Group__2__Impl rule__PreArithmOperation__Group__3
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__2__Impl_in_rule__PreArithmOperation__Group__27252);
            rule__PreArithmOperation__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__3_in_rule__PreArithmOperation__Group__27255);
            rule__PreArithmOperation__Group__3();
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
    // $ANTLR end rule__PreArithmOperation__Group__2


    // $ANTLR start rule__PreArithmOperation__Group__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3569:1: rule__PreArithmOperation__Group__2__Impl : ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) ) ;
    public final void rule__PreArithmOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3573:1: ( ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3574:1: ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3574:1: ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3575:1: ( rule__PreArithmOperation__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3576:1: ( rule__PreArithmOperation__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3576:2: rule__PreArithmOperation__SubExpressionsAssignment_2
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__SubExpressionsAssignment_2_in_rule__PreArithmOperation__Group__2__Impl7282);
            rule__PreArithmOperation__SubExpressionsAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationAccess().getSubExpressionsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreArithmOperation__Group__2__Impl


    // $ANTLR start rule__PreArithmOperation__Group__3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3586:1: rule__PreArithmOperation__Group__3 : rule__PreArithmOperation__Group__3__Impl ;
    public final void rule__PreArithmOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3590:1: ( rule__PreArithmOperation__Group__3__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3591:2: rule__PreArithmOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__3__Impl_in_rule__PreArithmOperation__Group__37312);
            rule__PreArithmOperation__Group__3__Impl();
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
    // $ANTLR end rule__PreArithmOperation__Group__3


    // $ANTLR start rule__PreArithmOperation__Group__3__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3597:1: rule__PreArithmOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__PreArithmOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3601:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3602:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3602:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3603:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,31,FOLLOW_31_in_rule__PreArithmOperation__Group__3__Impl7340); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreArithmOperation__Group__3__Impl


    // $ANTLR start rule__CompareOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3624:1: rule__CompareOperation__Group__0 : rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3628:1: ( rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3629:2: rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group__0__Impl_in_rule__CompareOperation__Group__07379);
            rule__CompareOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__07382);
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


    // $ANTLR start rule__CompareOperation__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3636:1: rule__CompareOperation__Group__0__Impl : ( ruleValuedExpression ) ;
    public final void rule__CompareOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3640:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3641:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3641:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3642:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__CompareOperation__Group__0__Impl7409);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getValuedExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group__0__Impl


    // $ANTLR start rule__CompareOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3653:1: rule__CompareOperation__Group__1 : rule__CompareOperation__Group__1__Impl ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3657:1: ( rule__CompareOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3658:2: rule__CompareOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group__1__Impl_in_rule__CompareOperation__Group__17438);
            rule__CompareOperation__Group__1__Impl();
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
    // $ANTLR end rule__CompareOperation__Group__1


    // $ANTLR start rule__CompareOperation__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3664:1: rule__CompareOperation__Group__1__Impl : ( ( rule__CompareOperation__Group_1__0 ) ) ;
    public final void rule__CompareOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3668:1: ( ( ( rule__CompareOperation__Group_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3669:1: ( ( rule__CompareOperation__Group_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3669:1: ( ( rule__CompareOperation__Group_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3670:1: ( rule__CompareOperation__Group_1__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3671:1: ( rule__CompareOperation__Group_1__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3671:2: rule__CompareOperation__Group_1__0
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__1__Impl7465);
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
    // $ANTLR end rule__CompareOperation__Group__1__Impl


    // $ANTLR start rule__CompareOperation__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3685:1: rule__CompareOperation__Group_1__0 : rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3689:1: ( rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3690:2: rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__0__Impl_in_rule__CompareOperation__Group_1__07499);
            rule__CompareOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__07502);
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


    // $ANTLR start rule__CompareOperation__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3697:1: rule__CompareOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3701:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3702:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3702:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3703:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3704:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3706:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_1__0__Impl


    // $ANTLR start rule__CompareOperation__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3716:1: rule__CompareOperation__Group_1__1 : rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3720:1: ( rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3721:2: rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__1__Impl_in_rule__CompareOperation__Group_1__17560);
            rule__CompareOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__17563);
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


    // $ANTLR start rule__CompareOperation__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3728:1: rule__CompareOperation__Group_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompareOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3732:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3733:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3733:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3734:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3735:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3735:2: rule__CompareOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__1__Impl7590);
            rule__CompareOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_1__1__Impl


    // $ANTLR start rule__CompareOperation__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3745:1: rule__CompareOperation__Group_1__2 : rule__CompareOperation__Group_1__2__Impl ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3749:1: ( rule__CompareOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3750:2: rule__CompareOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__2__Impl_in_rule__CompareOperation__Group_1__27620);
            rule__CompareOperation__Group_1__2__Impl();
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
    // $ANTLR end rule__CompareOperation__Group_1__2


    // $ANTLR start rule__CompareOperation__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3756:1: rule__CompareOperation__Group_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3760:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3761:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3761:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3762:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3763:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3763:2: rule__CompareOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__2__Impl7647);
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
    // $ANTLR end rule__CompareOperation__Group_1__2__Impl


    // $ANTLR start rule__UnaryOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3779:1: rule__UnaryOperation__Group__0 : rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 ;
    public final void rule__UnaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3783:1: ( rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3784:2: rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1
            {
            pushFollow(FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__07683);
            rule__UnaryOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__07686);
            rule__UnaryOperation__Group__1();
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
    // $ANTLR end rule__UnaryOperation__Group__0


    // $ANTLR start rule__UnaryOperation__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3791:1: rule__UnaryOperation__Group__0__Impl : ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) ;
    public final void rule__UnaryOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3795:1: ( ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3796:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3796:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3797:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3798:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3798:2: rule__UnaryOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl7713);
            rule__UnaryOperation__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryOperation__Group__0__Impl


    // $ANTLR start rule__UnaryOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3808:1: rule__UnaryOperation__Group__1 : rule__UnaryOperation__Group__1__Impl ;
    public final void rule__UnaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3812:1: ( rule__UnaryOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3813:2: rule__UnaryOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__17743);
            rule__UnaryOperation__Group__1__Impl();
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
    // $ANTLR end rule__UnaryOperation__Group__1


    // $ANTLR start rule__UnaryOperation__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3819:1: rule__UnaryOperation__Group__1__Impl : ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) ) ;
    public final void rule__UnaryOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3823:1: ( ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3824:1: ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3824:1: ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3825:1: ( rule__UnaryOperation__SubExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getSubExpressionsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3826:1: ( rule__UnaryOperation__SubExpressionsAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3826:2: rule__UnaryOperation__SubExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__UnaryOperation__SubExpressionsAssignment_1_in_rule__UnaryOperation__Group__1__Impl7770);
            rule__UnaryOperation__SubExpressionsAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getSubExpressionsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryOperation__Group__1__Impl


    // $ANTLR start rule__UnaryParanthesedOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3840:1: rule__UnaryParanthesedOperation__Group__0 : rule__UnaryParanthesedOperation__Group__0__Impl rule__UnaryParanthesedOperation__Group__1 ;
    public final void rule__UnaryParanthesedOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3844:1: ( rule__UnaryParanthesedOperation__Group__0__Impl rule__UnaryParanthesedOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3845:2: rule__UnaryParanthesedOperation__Group__0__Impl rule__UnaryParanthesedOperation__Group__1
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__0__Impl_in_rule__UnaryParanthesedOperation__Group__07804);
            rule__UnaryParanthesedOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__1_in_rule__UnaryParanthesedOperation__Group__07807);
            rule__UnaryParanthesedOperation__Group__1();
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
    // $ANTLR end rule__UnaryParanthesedOperation__Group__0


    // $ANTLR start rule__UnaryParanthesedOperation__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3852:1: rule__UnaryParanthesedOperation__Group__0__Impl : ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) ) ;
    public final void rule__UnaryParanthesedOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3856:1: ( ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3857:1: ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3857:1: ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3858:1: ( rule__UnaryParanthesedOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3859:1: ( rule__UnaryParanthesedOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3859:2: rule__UnaryParanthesedOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__OperatorAssignment_0_in_rule__UnaryParanthesedOperation__Group__0__Impl7834);
            rule__UnaryParanthesedOperation__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryParanthesedOperation__Group__0__Impl


    // $ANTLR start rule__UnaryParanthesedOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3869:1: rule__UnaryParanthesedOperation__Group__1 : rule__UnaryParanthesedOperation__Group__1__Impl rule__UnaryParanthesedOperation__Group__2 ;
    public final void rule__UnaryParanthesedOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3873:1: ( rule__UnaryParanthesedOperation__Group__1__Impl rule__UnaryParanthesedOperation__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3874:2: rule__UnaryParanthesedOperation__Group__1__Impl rule__UnaryParanthesedOperation__Group__2
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__1__Impl_in_rule__UnaryParanthesedOperation__Group__17864);
            rule__UnaryParanthesedOperation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__2_in_rule__UnaryParanthesedOperation__Group__17867);
            rule__UnaryParanthesedOperation__Group__2();
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
    // $ANTLR end rule__UnaryParanthesedOperation__Group__1


    // $ANTLR start rule__UnaryParanthesedOperation__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3881:1: rule__UnaryParanthesedOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__UnaryParanthesedOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3885:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3886:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3886:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3887:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__UnaryParanthesedOperation__Group__1__Impl7895); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryParanthesedOperation__Group__1__Impl


    // $ANTLR start rule__UnaryParanthesedOperation__Group__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3900:1: rule__UnaryParanthesedOperation__Group__2 : rule__UnaryParanthesedOperation__Group__2__Impl rule__UnaryParanthesedOperation__Group__3 ;
    public final void rule__UnaryParanthesedOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3904:1: ( rule__UnaryParanthesedOperation__Group__2__Impl rule__UnaryParanthesedOperation__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3905:2: rule__UnaryParanthesedOperation__Group__2__Impl rule__UnaryParanthesedOperation__Group__3
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__2__Impl_in_rule__UnaryParanthesedOperation__Group__27926);
            rule__UnaryParanthesedOperation__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__3_in_rule__UnaryParanthesedOperation__Group__27929);
            rule__UnaryParanthesedOperation__Group__3();
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
    // $ANTLR end rule__UnaryParanthesedOperation__Group__2


    // $ANTLR start rule__UnaryParanthesedOperation__Group__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3912:1: rule__UnaryParanthesedOperation__Group__2__Impl : ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) ) ;
    public final void rule__UnaryParanthesedOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3916:1: ( ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3917:1: ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3917:1: ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3918:1: ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3919:1: ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3919:2: rule__UnaryParanthesedOperation__SubExpressionsAssignment_2
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__SubExpressionsAssignment_2_in_rule__UnaryParanthesedOperation__Group__2__Impl7956);
            rule__UnaryParanthesedOperation__SubExpressionsAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryParanthesedOperation__Group__2__Impl


    // $ANTLR start rule__UnaryParanthesedOperation__Group__3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3929:1: rule__UnaryParanthesedOperation__Group__3 : rule__UnaryParanthesedOperation__Group__3__Impl ;
    public final void rule__UnaryParanthesedOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3933:1: ( rule__UnaryParanthesedOperation__Group__3__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3934:2: rule__UnaryParanthesedOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__3__Impl_in_rule__UnaryParanthesedOperation__Group__37986);
            rule__UnaryParanthesedOperation__Group__3__Impl();
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
    // $ANTLR end rule__UnaryParanthesedOperation__Group__3


    // $ANTLR start rule__UnaryParanthesedOperation__Group__3__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3940:1: rule__UnaryParanthesedOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__UnaryParanthesedOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3944:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3945:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3945:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3946:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,31,FOLLOW_31_in_rule__UnaryParanthesedOperation__Group__3__Impl8014); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryParanthesedOperation__Group__3__Impl


    // $ANTLR start rule__AndOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3967:1: rule__AndOperation__Group__0 : rule__AndOperation__Group__0__Impl rule__AndOperation__Group__1 ;
    public final void rule__AndOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3971:1: ( rule__AndOperation__Group__0__Impl rule__AndOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3972:2: rule__AndOperation__Group__0__Impl rule__AndOperation__Group__1
            {
            pushFollow(FOLLOW_rule__AndOperation__Group__0__Impl_in_rule__AndOperation__Group__08053);
            rule__AndOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndOperation__Group__1_in_rule__AndOperation__Group__08056);
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


    // $ANTLR start rule__AndOperation__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3979:1: rule__AndOperation__Group__0__Impl : ( ruleUnaryOrNormalExpression ) ;
    public final void rule__AndOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3983:1: ( ( ruleUnaryOrNormalExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3984:1: ( ruleUnaryOrNormalExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3984:1: ( ruleUnaryOrNormalExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3985:1: ruleUnaryOrNormalExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getUnaryOrNormalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__Group__0__Impl8083);
            ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getUnaryOrNormalExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndOperation__Group__0__Impl


    // $ANTLR start rule__AndOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3996:1: rule__AndOperation__Group__1 : rule__AndOperation__Group__1__Impl ;
    public final void rule__AndOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4000:1: ( rule__AndOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4001:2: rule__AndOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndOperation__Group__1__Impl_in_rule__AndOperation__Group__18112);
            rule__AndOperation__Group__1__Impl();
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
    // $ANTLR end rule__AndOperation__Group__1


    // $ANTLR start rule__AndOperation__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4007:1: rule__AndOperation__Group__1__Impl : ( ( rule__AndOperation__Group_1__0 )* ) ;
    public final void rule__AndOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4011:1: ( ( ( rule__AndOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4012:1: ( ( rule__AndOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4012:1: ( ( rule__AndOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4013:1: ( rule__AndOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4014:1: ( rule__AndOperation__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==17) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4014:2: rule__AndOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndOperation__Group_1__0_in_rule__AndOperation__Group__1__Impl8139);
            	    rule__AndOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end rule__AndOperation__Group__1__Impl


    // $ANTLR start rule__AndOperation__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4028:1: rule__AndOperation__Group_1__0 : rule__AndOperation__Group_1__0__Impl rule__AndOperation__Group_1__1 ;
    public final void rule__AndOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4032:1: ( rule__AndOperation__Group_1__0__Impl rule__AndOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4033:2: rule__AndOperation__Group_1__0__Impl rule__AndOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndOperation__Group_1__0__Impl_in_rule__AndOperation__Group_1__08174);
            rule__AndOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndOperation__Group_1__1_in_rule__AndOperation__Group_1__08177);
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


    // $ANTLR start rule__AndOperation__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4040:1: rule__AndOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__AndOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4044:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4045:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4045:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4046:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4047:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4049:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndOperation__Group_1__0__Impl


    // $ANTLR start rule__AndOperation__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4059:1: rule__AndOperation__Group_1__1 : rule__AndOperation__Group_1__1__Impl rule__AndOperation__Group_1__2 ;
    public final void rule__AndOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4063:1: ( rule__AndOperation__Group_1__1__Impl rule__AndOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4064:2: rule__AndOperation__Group_1__1__Impl rule__AndOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndOperation__Group_1__1__Impl_in_rule__AndOperation__Group_1__18235);
            rule__AndOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndOperation__Group_1__2_in_rule__AndOperation__Group_1__18238);
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


    // $ANTLR start rule__AndOperation__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4071:1: rule__AndOperation__Group_1__1__Impl : ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4075:1: ( ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4076:1: ( ( rule__AndOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4076:1: ( ( rule__AndOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4077:1: ( rule__AndOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4078:1: ( rule__AndOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4078:2: rule__AndOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndOperation__OperatorAssignment_1_1_in_rule__AndOperation__Group_1__1__Impl8265);
            rule__AndOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndOperation__Group_1__1__Impl


    // $ANTLR start rule__AndOperation__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4088:1: rule__AndOperation__Group_1__2 : rule__AndOperation__Group_1__2__Impl ;
    public final void rule__AndOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4092:1: ( rule__AndOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4093:2: rule__AndOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndOperation__Group_1__2__Impl_in_rule__AndOperation__Group_1__28295);
            rule__AndOperation__Group_1__2__Impl();
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
    // $ANTLR end rule__AndOperation__Group_1__2


    // $ANTLR start rule__AndOperation__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4099:1: rule__AndOperation__Group_1__2__Impl : ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4103:1: ( ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4104:1: ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4104:1: ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4105:1: ( rule__AndOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4106:1: ( rule__AndOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4106:2: rule__AndOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndOperation__SubExpressionsAssignment_1_2_in_rule__AndOperation__Group_1__2__Impl8322);
            rule__AndOperation__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getSubExpressionsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndOperation__Group_1__2__Impl


    // $ANTLR start rule__OrOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4122:1: rule__OrOperation__Group__0 : rule__OrOperation__Group__0__Impl rule__OrOperation__Group__1 ;
    public final void rule__OrOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4126:1: ( rule__OrOperation__Group__0__Impl rule__OrOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4127:2: rule__OrOperation__Group__0__Impl rule__OrOperation__Group__1
            {
            pushFollow(FOLLOW_rule__OrOperation__Group__0__Impl_in_rule__OrOperation__Group__08358);
            rule__OrOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrOperation__Group__1_in_rule__OrOperation__Group__08361);
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


    // $ANTLR start rule__OrOperation__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4134:1: rule__OrOperation__Group__0__Impl : ( ruleAndOperation ) ;
    public final void rule__OrOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4138:1: ( ( ruleAndOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4139:1: ( ruleAndOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4139:1: ( ruleAndOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4140:1: ruleAndOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_rule__OrOperation__Group__0__Impl8388);
            ruleAndOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrOperation__Group__0__Impl


    // $ANTLR start rule__OrOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4151:1: rule__OrOperation__Group__1 : rule__OrOperation__Group__1__Impl ;
    public final void rule__OrOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4155:1: ( rule__OrOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4156:2: rule__OrOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrOperation__Group__1__Impl_in_rule__OrOperation__Group__18417);
            rule__OrOperation__Group__1__Impl();
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
    // $ANTLR end rule__OrOperation__Group__1


    // $ANTLR start rule__OrOperation__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4162:1: rule__OrOperation__Group__1__Impl : ( ( rule__OrOperation__Group_1__0 )* ) ;
    public final void rule__OrOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4166:1: ( ( ( rule__OrOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4167:1: ( ( rule__OrOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4167:1: ( ( rule__OrOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4168:1: ( rule__OrOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4169:1: ( rule__OrOperation__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==16) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4169:2: rule__OrOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrOperation__Group_1__0_in_rule__OrOperation__Group__1__Impl8444);
            	    rule__OrOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // $ANTLR end rule__OrOperation__Group__1__Impl


    // $ANTLR start rule__OrOperation__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4183:1: rule__OrOperation__Group_1__0 : rule__OrOperation__Group_1__0__Impl rule__OrOperation__Group_1__1 ;
    public final void rule__OrOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4187:1: ( rule__OrOperation__Group_1__0__Impl rule__OrOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4188:2: rule__OrOperation__Group_1__0__Impl rule__OrOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrOperation__Group_1__0__Impl_in_rule__OrOperation__Group_1__08479);
            rule__OrOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrOperation__Group_1__1_in_rule__OrOperation__Group_1__08482);
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


    // $ANTLR start rule__OrOperation__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4195:1: rule__OrOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__OrOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4199:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4200:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4200:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4201:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4202:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4204:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrOperation__Group_1__0__Impl


    // $ANTLR start rule__OrOperation__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4214:1: rule__OrOperation__Group_1__1 : rule__OrOperation__Group_1__1__Impl rule__OrOperation__Group_1__2 ;
    public final void rule__OrOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4218:1: ( rule__OrOperation__Group_1__1__Impl rule__OrOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4219:2: rule__OrOperation__Group_1__1__Impl rule__OrOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrOperation__Group_1__1__Impl_in_rule__OrOperation__Group_1__18540);
            rule__OrOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrOperation__Group_1__2_in_rule__OrOperation__Group_1__18543);
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


    // $ANTLR start rule__OrOperation__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4226:1: rule__OrOperation__Group_1__1__Impl : ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4230:1: ( ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4231:1: ( ( rule__OrOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4231:1: ( ( rule__OrOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4232:1: ( rule__OrOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4233:1: ( rule__OrOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4233:2: rule__OrOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrOperation__OperatorAssignment_1_1_in_rule__OrOperation__Group_1__1__Impl8570);
            rule__OrOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrOperation__Group_1__1__Impl


    // $ANTLR start rule__OrOperation__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4243:1: rule__OrOperation__Group_1__2 : rule__OrOperation__Group_1__2__Impl ;
    public final void rule__OrOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4247:1: ( rule__OrOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4248:2: rule__OrOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrOperation__Group_1__2__Impl_in_rule__OrOperation__Group_1__28600);
            rule__OrOperation__Group_1__2__Impl();
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
    // $ANTLR end rule__OrOperation__Group_1__2


    // $ANTLR start rule__OrOperation__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4254:1: rule__OrOperation__Group_1__2__Impl : ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4258:1: ( ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4259:1: ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4259:1: ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4260:1: ( rule__OrOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4261:1: ( rule__OrOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4261:2: rule__OrOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrOperation__SubExpressionsAssignment_1_2_in_rule__OrOperation__Group_1__2__Impl8627);
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
    // $ANTLR end rule__OrOperation__Group_1__2__Impl


    // $ANTLR start rule__ParanthesedBooleanExpression__Group_5__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4277:1: rule__ParanthesedBooleanExpression__Group_5__0 : rule__ParanthesedBooleanExpression__Group_5__0__Impl rule__ParanthesedBooleanExpression__Group_5__1 ;
    public final void rule__ParanthesedBooleanExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4281:1: ( rule__ParanthesedBooleanExpression__Group_5__0__Impl rule__ParanthesedBooleanExpression__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4282:2: rule__ParanthesedBooleanExpression__Group_5__0__Impl rule__ParanthesedBooleanExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0__Impl_in_rule__ParanthesedBooleanExpression__Group_5__08663);
            rule__ParanthesedBooleanExpression__Group_5__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1_in_rule__ParanthesedBooleanExpression__Group_5__08666);
            rule__ParanthesedBooleanExpression__Group_5__1();
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
    // $ANTLR end rule__ParanthesedBooleanExpression__Group_5__0


    // $ANTLR start rule__ParanthesedBooleanExpression__Group_5__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4289:1: rule__ParanthesedBooleanExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__ParanthesedBooleanExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4293:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4294:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4294:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4295:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParanthesedBooleanExpression__Group_5__0__Impl8694); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedBooleanExpression__Group_5__0__Impl


    // $ANTLR start rule__ParanthesedBooleanExpression__Group_5__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4308:1: rule__ParanthesedBooleanExpression__Group_5__1 : rule__ParanthesedBooleanExpression__Group_5__1__Impl rule__ParanthesedBooleanExpression__Group_5__2 ;
    public final void rule__ParanthesedBooleanExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4312:1: ( rule__ParanthesedBooleanExpression__Group_5__1__Impl rule__ParanthesedBooleanExpression__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4313:2: rule__ParanthesedBooleanExpression__Group_5__1__Impl rule__ParanthesedBooleanExpression__Group_5__2
            {
            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1__Impl_in_rule__ParanthesedBooleanExpression__Group_5__18725);
            rule__ParanthesedBooleanExpression__Group_5__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2_in_rule__ParanthesedBooleanExpression__Group_5__18728);
            rule__ParanthesedBooleanExpression__Group_5__2();
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
    // $ANTLR end rule__ParanthesedBooleanExpression__Group_5__1


    // $ANTLR start rule__ParanthesedBooleanExpression__Group_5__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4320:1: rule__ParanthesedBooleanExpression__Group_5__1__Impl : ( ruleOrOperation ) ;
    public final void rule__ParanthesedBooleanExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4324:1: ( ( ruleOrOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4325:1: ( ruleOrOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4325:1: ( ruleOrOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4326:1: ruleOrOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_rule__ParanthesedBooleanExpression__Group_5__1__Impl8755);
            ruleOrOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedBooleanExpression__Group_5__1__Impl


    // $ANTLR start rule__ParanthesedBooleanExpression__Group_5__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4337:1: rule__ParanthesedBooleanExpression__Group_5__2 : rule__ParanthesedBooleanExpression__Group_5__2__Impl ;
    public final void rule__ParanthesedBooleanExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4341:1: ( rule__ParanthesedBooleanExpression__Group_5__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4342:2: rule__ParanthesedBooleanExpression__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2__Impl_in_rule__ParanthesedBooleanExpression__Group_5__28784);
            rule__ParanthesedBooleanExpression__Group_5__2__Impl();
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
    // $ANTLR end rule__ParanthesedBooleanExpression__Group_5__2


    // $ANTLR start rule__ParanthesedBooleanExpression__Group_5__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4348:1: rule__ParanthesedBooleanExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__ParanthesedBooleanExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4352:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4353:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4353:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4354:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ParanthesedBooleanExpression__Group_5__2__Impl8812); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedBooleanExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedBooleanExpression__Group_5__2__Impl


    // $ANTLR start rule__TextExpression__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4373:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4377:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4378:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
            {
            pushFollow(FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__08849);
            rule__TextExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__08852);
            rule__TextExpression__Group__1();
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
    // $ANTLR end rule__TextExpression__Group__0


    // $ANTLR start rule__TextExpression__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4385:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4389:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4390:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4390:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4391:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4392:1: ( rule__TextExpression__CodeAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4392:2: rule__TextExpression__CodeAssignment_0
            {
            pushFollow(FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl8879);
            rule__TextExpression__CodeAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextExpression__Group__0__Impl


    // $ANTLR start rule__TextExpression__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4402:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4406:1: ( rule__TextExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4407:2: rule__TextExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__18909);
            rule__TextExpression__Group__1__Impl();
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
    // $ANTLR end rule__TextExpression__Group__1


    // $ANTLR start rule__TextExpression__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4413:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4417:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4418:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4418:1: ( ( rule__TextExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4419:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4420:1: ( rule__TextExpression__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==RULE_ID) ) {
                    int LA33_3 = input.LA(3);

                    if ( (LA33_3==31) ) {
                        int LA33_4 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt33=1;
                        }
                    }
                }
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4420:2: rule__TextExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl8936);
                    rule__TextExpression__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextExpression__Group__1__Impl


    // $ANTLR start rule__TextExpression__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4434:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4438:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4439:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__08971);
            rule__TextExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__08974);
            rule__TextExpression__Group_1__1();
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
    // $ANTLR end rule__TextExpression__Group_1__0


    // $ANTLR start rule__TextExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4446:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4450:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4451:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4451:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4452:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__TextExpression__Group_1__0__Impl9002); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextExpression__Group_1__0__Impl


    // $ANTLR start rule__TextExpression__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4465:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4469:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4470:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__19033);
            rule__TextExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__19036);
            rule__TextExpression__Group_1__2();
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
    // $ANTLR end rule__TextExpression__Group_1__1


    // $ANTLR start rule__TextExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4477:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4481:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4482:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4482:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4483:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4484:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4484:2: rule__TextExpression__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl9063);
            rule__TextExpression__TypeAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextExpression__Group_1__1__Impl


    // $ANTLR start rule__TextExpression__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4494:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4498:1: ( rule__TextExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4499:2: rule__TextExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__29093);
            rule__TextExpression__Group_1__2__Impl();
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
    // $ANTLR end rule__TextExpression__Group_1__2


    // $ANTLR start rule__TextExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4505:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4509:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4510:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4510:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4511:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__TextExpression__Group_1__2__Impl9121); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextExpression__Group_1__2__Impl


    // $ANTLR start rule__Action__IsImmediateAssignment_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4531:1: rule__Action__IsImmediateAssignment_1 : ( ( '#' ) ) ;
    public final void rule__Action__IsImmediateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4535:1: ( ( ( '#' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4536:1: ( ( '#' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4536:1: ( ( '#' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4537:1: ( '#' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4538:1: ( '#' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4539:1: '#'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_1_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Action__IsImmediateAssignment_19168); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__IsImmediateAssignment_1


    // $ANTLR start rule__Action__DelayAssignment_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4554:1: rule__Action__DelayAssignment_2 : ( RULE_INT ) ;
    public final void rule__Action__DelayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4558:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4559:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4559:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4560:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Action__DelayAssignment_29207); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__DelayAssignment_2


    // $ANTLR start rule__Action__TriggerAssignment_3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4569:1: rule__Action__TriggerAssignment_3 : ( ruleBooleanExpression ) ;
    public final void rule__Action__TriggerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4573:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4574:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4574:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4575:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Action__TriggerAssignment_39238);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__TriggerAssignment_3


    // $ANTLR start rule__Action__EffectsAssignment_4_1_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4584:1: rule__Action__EffectsAssignment_4_1_0 : ( ruleEffect ) ;
    public final void rule__Action__EffectsAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4588:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4589:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4589:1: ( ruleEffect )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4590:1: ruleEffect
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_4_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_rule__Action__EffectsAssignment_4_1_09269);
            ruleEffect();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_4_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__EffectsAssignment_4_1_0


    // $ANTLR start rule__Emission__SignalAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4599:1: rule__Emission__SignalAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Emission__SignalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4603:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4604:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4604:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4605:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4606:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4607:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_09304); if (failed) return ;
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


    // $ANTLR start rule__Emission__NewValueAssignment_1_0_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4618:1: rule__Emission__NewValueAssignment_1_0_1 : ( ruleValuedExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4622:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4623:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4623:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4624:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueValuedExpressionParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__Emission__NewValueAssignment_1_0_19339);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueValuedExpressionParserRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emission__NewValueAssignment_1_0_1


    // $ANTLR start rule__Emission__NewValueAssignment_1_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4633:1: rule__Emission__NewValueAssignment_1_1_1 : ( ruleBooleanExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4637:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4638:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4638:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4639:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Emission__NewValueAssignment_1_1_19370);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emission__NewValueAssignment_1_1_1


    // $ANTLR start rule__Assignment__VariableAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4648:1: rule__Assignment__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4652:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4653:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4653:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4654:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4655:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4656:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_09405); if (failed) return ;
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


    // $ANTLR start rule__Assignment__ExpressionAssignment_2_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4667:1: rule__Assignment__ExpressionAssignment_2_0 : ( ruleValuedExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4671:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4672:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4672:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4673:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionValuedExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__Assignment__ExpressionAssignment_2_09440);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExpressionValuedExpressionParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__ExpressionAssignment_2_0


    // $ANTLR start rule__Assignment__ExpressionAssignment_2_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4682:1: rule__Assignment__ExpressionAssignment_2_1 : ( ruleBooleanExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4686:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4687:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4687:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4688:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Assignment__ExpressionAssignment_2_19471);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__ExpressionAssignment_2_1


    // $ANTLR start rule__TextEffect__CodeAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4697:1: rule__TextEffect__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextEffect__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4701:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4702:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4702:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4703:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextEffect__CodeAssignment_09502); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextEffectAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextEffect__CodeAssignment_0


    // $ANTLR start rule__TextEffect__TypeAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4712:1: rule__TextEffect__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextEffect__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4716:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4717:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4717:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4718:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextEffect__TypeAssignment_1_19533); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextEffectAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextEffect__TypeAssignment_1_1


    // $ANTLR start rule__SignalReference__SignalAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4727:1: rule__SignalReference__SignalAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SignalReference__SignalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4731:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4732:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4732:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4733:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4734:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4735:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SignalReference__SignalAssignment_09568); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalReference__SignalAssignment_0


    // $ANTLR start rule__SignalReference__SubExpressionsAssignment_1_1_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4746:1: rule__SignalReference__SubExpressionsAssignment_1_1_0 : ( ruleExpression ) ;
    public final void rule__SignalReference__SubExpressionsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4750:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4751:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4751:1: ( ruleExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4752:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSubExpressionsExpressionParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SignalReference__SubExpressionsAssignment_1_1_09603);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getSubExpressionsExpressionParserRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalReference__SubExpressionsAssignment_1_1_0


    // $ANTLR start rule__VariableReference__VariableAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4761:1: rule__VariableReference__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4765:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4766:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4766:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4767:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4768:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4769:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment_09638); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariableReference__VariableAssignment_0


    // $ANTLR start rule__VariableReference__SubExpressionsAssignment_1_1_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4780:1: rule__VariableReference__SubExpressionsAssignment_1_1_0 : ( ruleExpression ) ;
    public final void rule__VariableReference__SubExpressionsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4784:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4785:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4785:1: ( ruleExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4786:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getSubExpressionsExpressionParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableReference__SubExpressionsAssignment_1_1_09673);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getSubExpressionsExpressionParserRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariableReference__SubExpressionsAssignment_1_1_0


    // $ANTLR start rule__IntValue__ValueAssignment
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4797:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4801:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4802:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4802:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4803:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment9706); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4812:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4816:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4817:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4817:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4818:1: RULE_FLOAT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment9737); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4827:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4831:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4832:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4832:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4833:1: RULE_BOOLEAN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment9768); if (failed) return ;
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


    // $ANTLR start rule__ValOperation__OperatorAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4842:1: rule__ValOperation__OperatorAssignment_0 : ( ruleValOperator ) ;
    public final void rule__ValOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4846:1: ( ( ruleValOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4847:1: ( ruleValOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4847:1: ( ruleValOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4848:1: ruleValOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValOperator_in_rule__ValOperation__OperatorAssignment_09799);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4857:1: rule__ValOperation__SubExpressionsAssignment_1 : ( ruleSignalReference ) ;
    public final void rule__ValOperation__SubExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4861:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4862:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4862:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4863:1: ruleSignalReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_rule__ValOperation__SubExpressionsAssignment_19830);
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


    // $ANTLR start rule__PlusOperation__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4872:1: rule__PlusOperation__OperatorAssignment_1_1 : ( rulePlusOperator ) ;
    public final void rule__PlusOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4876:1: ( ( rulePlusOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4877:1: ( rulePlusOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4877:1: ( rulePlusOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4878:1: rulePlusOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorPlusOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePlusOperator_in_rule__PlusOperation__OperatorAssignment_1_19861);
            rulePlusOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationAccess().getOperatorPlusOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PlusOperation__OperatorAssignment_1_1


    // $ANTLR start rule__PlusOperation__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4887:1: rule__PlusOperation__SubExpressionsAssignment_1_2 : ( ruleMultOrDivOperation ) ;
    public final void rule__PlusOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4891:1: ( ( ruleMultOrDivOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4892:1: ( ruleMultOrDivOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4892:1: ( ruleMultOrDivOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4893:1: ruleMultOrDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getSubExpressionsMultOrDivOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__SubExpressionsAssignment_1_29892);
            ruleMultOrDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationAccess().getSubExpressionsMultOrDivOperationParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PlusOperation__SubExpressionsAssignment_1_2


    // $ANTLR start rule__MultOperation__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4902:1: rule__MultOperation__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4906:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4907:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4907:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4908:1: ruleMultOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultOperator_in_rule__MultOperation__OperatorAssignment_1_19923);
            ruleMultOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultOperation__OperatorAssignment_1_1


    // $ANTLR start rule__MultOperation__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4917:1: rule__MultOperation__SubExpressionsAssignment_1_2 : ( rulePreOrNormalValuedExpression ) ;
    public final void rule__MultOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4921:1: ( ( rulePreOrNormalValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4922:1: ( rulePreOrNormalValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4922:1: ( rulePreOrNormalValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4923:1: rulePreOrNormalValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getSubExpressionsPreOrNormalValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValuedExpression_in_rule__MultOperation__SubExpressionsAssignment_1_29954);
            rulePreOrNormalValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getSubExpressionsPreOrNormalValuedExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultOperation__SubExpressionsAssignment_1_2


    // $ANTLR start rule__DivOperation__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4932:1: rule__DivOperation__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4936:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4937:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4937:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4938:1: ruleDivOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleDivOperator_in_rule__DivOperation__OperatorAssignment_1_19985);
            ruleDivOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivOperation__OperatorAssignment_1_1


    // $ANTLR start rule__DivOperation__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4947:1: rule__DivOperation__SubExpressionsAssignment_1_2 : ( rulePreOrNormalValuedExpression ) ;
    public final void rule__DivOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4951:1: ( ( rulePreOrNormalValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4952:1: ( rulePreOrNormalValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4952:1: ( rulePreOrNormalValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4953:1: rulePreOrNormalValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getSubExpressionsPreOrNormalValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValuedExpression_in_rule__DivOperation__SubExpressionsAssignment_1_210016);
            rulePreOrNormalValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getSubExpressionsPreOrNormalValuedExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivOperation__SubExpressionsAssignment_1_2


    // $ANTLR start rule__PreArithmOperation__OperatorAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4962:1: rule__PreArithmOperation__OperatorAssignment_0 : ( ruleUnaryParanthesedOperator ) ;
    public final void rule__PreArithmOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4966:1: ( ( ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4967:1: ( ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4967:1: ( ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4968:1: ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_rule__PreArithmOperation__OperatorAssignment_010047);
            ruleUnaryParanthesedOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreArithmOperation__OperatorAssignment_0


    // $ANTLR start rule__PreArithmOperation__SubExpressionsAssignment_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4977:1: rule__PreArithmOperation__SubExpressionsAssignment_2 : ( ruleValOperation ) ;
    public final void rule__PreArithmOperation__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4981:1: ( ( ruleValOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4982:1: ( ruleValOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4982:1: ( ruleValOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4983:1: ruleValOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getSubExpressionsValOperationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValOperation_in_rule__PreArithmOperation__SubExpressionsAssignment_210078);
            ruleValOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationAccess().getSubExpressionsValOperationParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreArithmOperation__SubExpressionsAssignment_2


    // $ANTLR start rule__CompareOperation__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4992:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4996:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4997:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4997:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4998:1: ruleCompareOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_110109);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5007:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5011:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5012:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5012:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5013:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_210140);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getSubExpressionsValuedExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__UnaryOperation__OperatorAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5022:1: rule__UnaryOperation__OperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5026:1: ( ( ruleUnaryOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5027:1: ( ruleUnaryOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5027:1: ( ruleUnaryOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5028:1: ruleUnaryOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_010171);
            ruleUnaryOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryOperation__OperatorAssignment_0


    // $ANTLR start rule__UnaryOperation__SubExpressionsAssignment_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5037:1: rule__UnaryOperation__SubExpressionsAssignment_1 : ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) ) ;
    public final void rule__UnaryOperation__SubExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5041:1: ( ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5042:1: ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5042:1: ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5043:1: ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getSubExpressionsAlternatives_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5044:1: ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5044:2: rule__UnaryOperation__SubExpressionsAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__UnaryOperation__SubExpressionsAlternatives_1_0_in_rule__UnaryOperation__SubExpressionsAssignment_110202);
            rule__UnaryOperation__SubExpressionsAlternatives_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getSubExpressionsAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryOperation__SubExpressionsAssignment_1


    // $ANTLR start rule__UnaryParanthesedOperation__OperatorAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5053:1: rule__UnaryParanthesedOperation__OperatorAssignment_0 : ( ruleUnaryParanthesedOperator ) ;
    public final void rule__UnaryParanthesedOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5057:1: ( ( ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5058:1: ( ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5058:1: ( ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5059:1: ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_rule__UnaryParanthesedOperation__OperatorAssignment_010235);
            ruleUnaryParanthesedOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryParanthesedOperation__OperatorAssignment_0


    // $ANTLR start rule__UnaryParanthesedOperation__SubExpressionsAssignment_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5068:1: rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 : ( ruleBooleanExpression ) ;
    public final void rule__UnaryParanthesedOperation__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5072:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5073:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5073:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5074:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__UnaryParanthesedOperation__SubExpressionsAssignment_210266);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryParanthesedOperation__SubExpressionsAssignment_2


    // $ANTLR start rule__AndOperation__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5083:1: rule__AndOperation__OperatorAssignment_1_1 : ( ruleOperatorAnd ) ;
    public final void rule__AndOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5087:1: ( ( ruleOperatorAnd ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5088:1: ( ruleOperatorAnd )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5088:1: ( ruleOperatorAnd )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5089:1: ruleOperatorAnd
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOperatorAnd_in_rule__AndOperation__OperatorAssignment_1_110297);
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


    // $ANTLR start rule__AndOperation__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5098:1: rule__AndOperation__SubExpressionsAssignment_1_2 : ( ruleUnaryOrNormalExpression ) ;
    public final void rule__AndOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5102:1: ( ( ruleUnaryOrNormalExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5103:1: ( ruleUnaryOrNormalExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5103:1: ( ruleUnaryOrNormalExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5104:1: ruleUnaryOrNormalExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getSubExpressionsUnaryOrNormalExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__SubExpressionsAssignment_1_210328);
            ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getSubExpressionsUnaryOrNormalExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndOperation__SubExpressionsAssignment_1_2


    // $ANTLR start rule__OrOperation__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5113:1: rule__OrOperation__OperatorAssignment_1_1 : ( ruleOperatorOr ) ;
    public final void rule__OrOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5117:1: ( ( ruleOperatorOr ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5118:1: ( ruleOperatorOr )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5118:1: ( ruleOperatorOr )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5119:1: ruleOperatorOr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOperatorOr_in_rule__OrOperation__OperatorAssignment_1_110359);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5128:1: rule__OrOperation__SubExpressionsAssignment_1_2 : ( ruleAndOperation ) ;
    public final void rule__OrOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5132:1: ( ( ruleAndOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5133:1: ( ruleAndOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5133:1: ( ruleAndOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5134:1: ruleAndOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_rule__OrOperation__SubExpressionsAssignment_1_210390);
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


    // $ANTLR start rule__TextExpression__CodeAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5143:1: rule__TextExpression__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5147:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5148:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5148:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5149:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_010421); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextExpression__CodeAssignment_0


    // $ANTLR start rule__TextExpression__TypeAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5158:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5162:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5163:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5163:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5164:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_110452); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextExpression__TypeAssignment_1_1

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1098:1: ( ( ( rule__Emission__Group_1_0__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1098:1: ( ( rule__Emission__Group_1_0__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1098:1: ( ( rule__Emission__Group_1_0__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1099:1: ( rule__Emission__Group_1_0__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getEmissionAccess().getGroup_1_0()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1100:1: ( rule__Emission__Group_1_0__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1100:2: rule__Emission__Group_1_0__0
        {
        pushFollow(FOLLOW_rule__Emission__Group_1_0__0_in_synpred32236);
        rule__Emission__Group_1_0__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1120:1: ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1120:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1120:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1121:1: ( rule__Assignment__ExpressionAssignment_2_0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_0()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1122:1: ( rule__Assignment__ExpressionAssignment_2_0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1122:2: rule__Assignment__ExpressionAssignment_2_0
        {
        pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_synpred42287);
        rule__Assignment__ExpressionAssignment_2_0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1173:6: ( ( ( rule__ParanthesedValuedExpression__Group_5__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1173:6: ( ( rule__ParanthesedValuedExpression__Group_5__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1173:6: ( ( rule__ParanthesedValuedExpression__Group_5__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1174:1: ( rule__ParanthesedValuedExpression__Group_5__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedValuedExpressionAccess().getGroup_5()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1175:1: ( rule__ParanthesedValuedExpression__Group_5__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1175:2: rule__ParanthesedValuedExpression__Group_5__0
        {
        pushFollow(FOLLOW_rule__ParanthesedValuedExpression__Group_5__0_in_synpred102424);
        rule__ParanthesedValuedExpression__Group_5__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1195:1: ( ( ruleMultOperation ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1195:1: ( ruleMultOperation )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1195:1: ( ruleMultOperation )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1196:1: ruleMultOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleMultOperation_in_synpred112475);
        ruleMultOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1239:1: ( ( ruleParanthesedBooleanExpression ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1239:1: ( ruleParanthesedBooleanExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1239:1: ( ruleParanthesedBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1240:1: ruleParanthesedBooleanExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0_0()); 
        }
        pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_synpred132574);
        ruleParanthesedBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1267:6: ( ( ruleUnaryParanthesedOperation ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1267:6: ( ruleUnaryParanthesedOperation )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1267:6: ( ruleUnaryParanthesedOperation )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1268:1: ruleUnaryParanthesedOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_synpred152640);
        ruleUnaryParanthesedOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1295:6: ( ( ruleCompareOperation ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1295:6: ( ruleCompareOperation )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1295:6: ( ruleCompareOperation )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1296:1: ruleCompareOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleCompareOperation_in_synpred172706);
        ruleCompareOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred18
    public final void synpred18_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1301:6: ( ( ruleSignalReference ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1301:6: ( ruleSignalReference )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1301:6: ( ruleSignalReference )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1302:1: ruleSignalReference
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_ruleSignalReference_in_synpred182723);
        ruleSignalReference();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred18

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1307:6: ( ( ruleValOperation ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1307:6: ( ruleValOperation )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1307:6: ( ruleValOperation )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1308:1: ruleValOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getValOperationParserRuleCall_3()); 
        }
        pushFollow(FOLLOW_ruleValOperation_in_synpred192740);
        ruleValOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1313:6: ( ( ruleTextExpression ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1313:6: ( ruleTextExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1313:6: ( ruleTextExpression )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1314:1: ruleTextExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getTextExpressionParserRuleCall_4()); 
        }
        pushFollow(FOLLOW_ruleTextExpression_in_synpred202757);
        ruleTextExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1335:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1335:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1335:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1336:1: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred212807);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2290:2: ( rule__SignalReference__Group_1__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2290:2: rule__SignalReference__Group_1__0
        {
        pushFollow(FOLLOW_rule__SignalReference__Group_1__0_in_synpred374751);
        rule__SignalReference__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred40
    public final void synpred40_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2510:2: ( rule__VariableReference__Group_1__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2510:2: rule__VariableReference__Group_1__0
        {
        pushFollow(FOLLOW_rule__VariableReference__Group_1__0_in_synpred405187);
        rule__VariableReference__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred40

    // $ANTLR start synpred48
    public final void synpred48_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4420:2: ( rule__TextExpression__Group_1__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4420:2: rule__TextExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__TextExpression__Group_1__0_in_synpred488936);
        rule__TextExpression__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred48

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
    public final boolean synpred37() {
        backtracking++;
        int start = input.mark();
        try {
            synpred37_fragment(); // can never throw exception
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
    public final boolean synpred20() {
        backtracking++;
        int start = input.mark();
        try {
            synpred20_fragment(); // can never throw exception
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
    public final boolean synpred21() {
        backtracking++;
        int start = input.mark();
        try {
            synpred21_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred13() {
        backtracking++;
        int start = input.mark();
        try {
            synpred13_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Alternatives_in_ruleEffect160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__0_in_ruleEmission220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__0_in_ruleTextEffect340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group__0_in_ruleSignalReference400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__0_in_ruleVariableReference460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_entryRuleValOperation673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValOperation680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__Group__0_in_ruleValOperation706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_ruleValuedExpression766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValuedExpression_in_entryRuleParanthesedValuedExpression792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedValuedExpression799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Alternatives_in_ruleParanthesedValuedExpression825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_entryRulePlusOperation852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOperation859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group__0_in_rulePlusOperation885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOrDivOperation919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Alternatives_in_ruleMultOrDivOperation945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_entryRuleMultOperation972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOperation979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group__0_in_ruleMultOperation1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperation_in_entryRuleDivOperation1032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivOperation1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group__0_in_ruleDivOperation1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation1092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreArithmOperation1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__0_in_rulePreArithmOperation1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_entryRulePreOrNormalValuedExpression1152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreOrNormalValuedExpression1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreOrNormalValuedExpression__Alternatives_in_rulePreOrNormalValuedExpression1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__0_in_ruleCompareOperation1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__Group__0_in_ruleUnaryOperation1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation1332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__0_in_ruleUnaryParanthesedOperation1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression1392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOrNormalExpression__Alternatives_in_ruleUnaryOrNormalExpression1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_entryRuleAndOperation1452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperation1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group__0_in_ruleAndOperation1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_entryRuleOrOperation1512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperation1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group__0_in_ruleOrOperation1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression1572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Alternatives_in_ruleParanthesedBooleanExpression1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression1632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleBooleanExpression1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__0_in_ruleTextExpression1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleValOperator1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleUnaryOperator1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUnaryParanthesedOperator1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOperatorOr1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOperatorAnd2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperator__Alternatives_in_rulePlusOperator2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperator__Alternatives_in_ruleMultOperator2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDivOperator2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_rule__Effect__Alternatives2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_rule__Effect__Alternatives2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0_in_rule__Emission__Alternatives_12236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__0_in_rule__Emission__Alternatives_12254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_rule__Assignment__Alternatives_22287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_1_in_rule__Assignment__Alternatives_22305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__ParanthesedValuedExpression__Alternatives2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__ParanthesedValuedExpression__Alternatives2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_rule__ParanthesedValuedExpression__Alternatives2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rule__ParanthesedValuedExpression__Alternatives2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_rule__ParanthesedValuedExpression__Alternatives2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__0_in_rule__ParanthesedValuedExpression__Alternatives2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__0_in_rule__ParanthesedValuedExpression__Alternatives2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_rule__MultOrDivOperation__Alternatives2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__0_in_rule__MultOrDivOperation__Alternatives2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_rule__PreOrNormalValuedExpression__Alternatives2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValuedExpression_in_rule__PreOrNormalValuedExpression__Alternatives2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_rule__UnaryOrNormalExpression__Alternatives2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOrNormalExpression__Alternatives2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOrNormalExpression__Alternatives2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__ParanthesedBooleanExpression__Alternatives2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_rule__ParanthesedBooleanExpression__Alternatives2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__ParanthesedBooleanExpression__Alternatives2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_rule__ParanthesedBooleanExpression__Alternatives2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_rule__ParanthesedBooleanExpression__Alternatives2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0_in_rule__ParanthesedBooleanExpression__Alternatives2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CompareOperator__Alternatives2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CompareOperator__Alternatives2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CompareOperator__Alternatives2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CompareOperator__Alternatives2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CompareOperator__Alternatives2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CompareOperator__Alternatives2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PlusOperator__Alternatives2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PlusOperator__Alternatives3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MultOperator__Alternatives3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MultOperator__Alternatives3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__03112 = new BitSet(new long[]{0x000000024004E1F2L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__03115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__13173 = new BitSet(new long[]{0x000000004004E1F2L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__13176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__IsImmediateAssignment_1_in_rule__Action__Group__1__Impl3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__23234 = new BitSet(new long[]{0x000000004004E1F2L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__23237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DelayAssignment_2_in_rule__Action__Group__2__Impl3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__33295 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__33298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TriggerAssignment_3_in_rule__Action__Group__3__Impl3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__43356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__0_in_rule__Action__Group__4__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__0__Impl_in_rule__Action__Group_4__03424 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_rule__Action__Group_4__1_in_rule__Action__Group_4__03427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Action__Group_4__0__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__1__Impl_in_rule__Action__Group_4__13486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4_1__0_in_rule__Action__Group_4__1__Impl3513 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_rule__Action__Group_4_1__0__Impl_in_rule__Action__Group_4_1__03548 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4_1__1_in_rule__Action__Group_4_1__03551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__EffectsAssignment_4_1_0_in_rule__Action__Group_4_1__0__Impl3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4_1__1__Impl_in_rule__Action__Group_4_1__13608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Action__Group_4_1__1__Impl3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__0__Impl_in_rule__Emission__Group__03674 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__0__Impl3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1__Impl_in_rule__Emission__Group__13734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Alternatives_1_in_rule__Emission__Group__1__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0__Impl_in_rule__Emission__Group_1_0__03796 = new BitSet(new long[]{0x000000004000A0F0L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__1_in_rule__Emission__Group_1_0__03799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Emission__Group_1_0__0__Impl3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__1__Impl_in_rule__Emission__Group_1_0__13858 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__2_in_rule__Emission__Group_1_0__13861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_0_1_in_rule__Emission__Group_1_0__1__Impl3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__2__Impl_in_rule__Emission__Group_1_0__23918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Emission__Group_1_0__2__Impl3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__0__Impl_in_rule__Emission__Group_1_1__03983 = new BitSet(new long[]{0x000000004000E1F0L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__1_in_rule__Emission__Group_1_1__03986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Emission__Group_1_1__0__Impl4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__1__Impl_in_rule__Emission__Group_1_1__14045 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__2_in_rule__Emission__Group_1_1__14048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_1_1_in_rule__Emission__Group_1_1__1__Impl4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__2__Impl_in_rule__Emission__Group_1_1__24105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Emission__Group_1_1__2__Impl4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04170 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14230 = new BitSet(new long[]{0x000000004000E1F0L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Assignment__Group__1__Impl4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Alternatives_2_in_rule__Assignment__Group__2__Impl4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__0__Impl_in_rule__TextEffect__Group__04355 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__1_in_rule__TextEffect__Group__04358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__CodeAssignment_0_in_rule__TextEffect__Group__0__Impl4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__1__Impl_in_rule__TextEffect__Group__14415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__0_in_rule__TextEffect__Group__1__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__0__Impl_in_rule__TextEffect__Group_1__04477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__1_in_rule__TextEffect__Group_1__04480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TextEffect__Group_1__0__Impl4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__1__Impl_in_rule__TextEffect__Group_1__14539 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__2_in_rule__TextEffect__Group_1__14542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__TypeAssignment_1_1_in_rule__TextEffect__Group_1__1__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__2__Impl_in_rule__TextEffect__Group_1__24599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TextEffect__Group_1__2__Impl4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group__0__Impl_in_rule__SignalReference__Group__04664 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group__1_in_rule__SignalReference__Group__04667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__SignalAssignment_0_in_rule__SignalReference__Group__0__Impl4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group__1__Impl_in_rule__SignalReference__Group__14724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1__0_in_rule__SignalReference__Group__1__Impl4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1__0__Impl_in_rule__SignalReference__Group_1__04786 = new BitSet(new long[]{0x00000000C000E1F0L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1__1_in_rule__SignalReference__Group_1__04789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SignalReference__Group_1__0__Impl4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1__1__Impl_in_rule__SignalReference__Group_1__14848 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1__2_in_rule__SignalReference__Group_1__14851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__0_in_rule__SignalReference__Group_1__1__Impl4878 = new BitSet(new long[]{0x000000004000E1F2L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1__2__Impl_in_rule__SignalReference__Group_1__24909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SignalReference__Group_1__2__Impl4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__0__Impl_in_rule__SignalReference__Group_1_1__04974 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__1_in_rule__SignalReference__Group_1_1__04977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__SubExpressionsAssignment_1_1_0_in_rule__SignalReference__Group_1_1__0__Impl5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1_1__1__Impl_in_rule__SignalReference__Group_1_1__15034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SignalReference__Group_1_1__1__Impl5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__0__Impl_in_rule__VariableReference__Group__05100 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__1_in_rule__VariableReference__Group__05103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_0_in_rule__VariableReference__Group__0__Impl5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group__1__Impl_in_rule__VariableReference__Group__15160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__0_in_rule__VariableReference__Group__1__Impl5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__0__Impl_in_rule__VariableReference__Group_1__05222 = new BitSet(new long[]{0x00000000C000E1F0L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__1_in_rule__VariableReference__Group_1__05225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__VariableReference__Group_1__0__Impl5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__1__Impl_in_rule__VariableReference__Group_1__15284 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__2_in_rule__VariableReference__Group_1__15287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__0_in_rule__VariableReference__Group_1__1__Impl5314 = new BitSet(new long[]{0x000000004000E1F2L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__2__Impl_in_rule__VariableReference__Group_1__25345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VariableReference__Group_1__2__Impl5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__0__Impl_in_rule__VariableReference__Group_1_1__05410 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__1_in_rule__VariableReference__Group_1_1__05413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__SubExpressionsAssignment_1_1_0_in_rule__VariableReference__Group_1_1__0__Impl5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1_1__1__Impl_in_rule__VariableReference__Group_1_1__15470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VariableReference__Group_1_1__1__Impl5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__Group__0__Impl_in_rule__ValOperation__Group__05536 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ValOperation__Group__1_in_rule__ValOperation__Group__05539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__OperatorAssignment_0_in_rule__ValOperation__Group__0__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__Group__1__Impl_in_rule__ValOperation__Group__15596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__SubExpressionsAssignment_1_in_rule__ValOperation__Group__1__Impl5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__0__Impl_in_rule__ParanthesedValuedExpression__Group_5__05657 = new BitSet(new long[]{0x000000004000A0F0L});
    public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__1_in_rule__ParanthesedValuedExpression__Group_5__05660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParanthesedValuedExpression__Group_5__0__Impl5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__1__Impl_in_rule__ParanthesedValuedExpression__Group_5__15719 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__2_in_rule__ParanthesedValuedExpression__Group_5__15722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_rule__ParanthesedValuedExpression__Group_5__1__Impl5749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__2__Impl_in_rule__ParanthesedValuedExpression__Group_5__25778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ParanthesedValuedExpression__Group_5__2__Impl5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__0__Impl_in_rule__ParanthesedValuedExpression__Group_6__05843 = new BitSet(new long[]{0x000000004000A0F0L});
    public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__1_in_rule__ParanthesedValuedExpression__Group_6__05846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParanthesedValuedExpression__Group_6__0__Impl5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__1__Impl_in_rule__ParanthesedValuedExpression__Group_6__15905 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__2_in_rule__ParanthesedValuedExpression__Group_6__15908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperation_in_rule__ParanthesedValuedExpression__Group_6__1__Impl5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_6__2__Impl_in_rule__ParanthesedValuedExpression__Group_6__25964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ParanthesedValuedExpression__Group_6__2__Impl5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group__0__Impl_in_rule__PlusOperation__Group__06029 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group__1_in_rule__PlusOperation__Group__06032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__Group__0__Impl6059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group__1__Impl_in_rule__PlusOperation__Group__16088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__0_in_rule__PlusOperation__Group__1__Impl6115 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__0__Impl_in_rule__PlusOperation__Group_1__06150 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__1_in_rule__PlusOperation__Group_1__06153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__1__Impl_in_rule__PlusOperation__Group_1__16211 = new BitSet(new long[]{0x000000004000A0F0L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__2_in_rule__PlusOperation__Group_1__16214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__OperatorAssignment_1_1_in_rule__PlusOperation__Group_1__1__Impl6241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__2__Impl_in_rule__PlusOperation__Group_1__26271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__SubExpressionsAssignment_1_2_in_rule__PlusOperation__Group_1__2__Impl6298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__0__Impl_in_rule__MultOrDivOperation__Group_1__06334 = new BitSet(new long[]{0x000000004000A0F0L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__1_in_rule__MultOrDivOperation__Group_1__06337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MultOrDivOperation__Group_1__0__Impl6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__1__Impl_in_rule__MultOrDivOperation__Group_1__16396 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__2_in_rule__MultOrDivOperation__Group_1__16399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperation_in_rule__MultOrDivOperation__Group_1__1__Impl6426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__2__Impl_in_rule__MultOrDivOperation__Group_1__26455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MultOrDivOperation__Group_1__2__Impl6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group__0__Impl_in_rule__MultOperation__Group__06520 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group__1_in_rule__MultOperation__Group__06523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_rule__MultOperation__Group__0__Impl6550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group__1__Impl_in_rule__MultOperation__Group__16579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__0_in_rule__MultOperation__Group__1__Impl6606 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__0__Impl_in_rule__MultOperation__Group_1__06641 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__1_in_rule__MultOperation__Group_1__06644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__1__Impl_in_rule__MultOperation__Group_1__16702 = new BitSet(new long[]{0x000000004000A0F0L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__2_in_rule__MultOperation__Group_1__16705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__OperatorAssignment_1_1_in_rule__MultOperation__Group_1__1__Impl6732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__2__Impl_in_rule__MultOperation__Group_1__26762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__SubExpressionsAssignment_1_2_in_rule__MultOperation__Group_1__2__Impl6789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group__0__Impl_in_rule__DivOperation__Group__06825 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group__1_in_rule__DivOperation__Group__06828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_rule__DivOperation__Group__0__Impl6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group__1__Impl_in_rule__DivOperation__Group__16884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__0_in_rule__DivOperation__Group__1__Impl6911 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__0__Impl_in_rule__DivOperation__Group_1__06946 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__1_in_rule__DivOperation__Group_1__06949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__1__Impl_in_rule__DivOperation__Group_1__17007 = new BitSet(new long[]{0x000000004000A0F0L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__2_in_rule__DivOperation__Group_1__17010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__OperatorAssignment_1_1_in_rule__DivOperation__Group_1__1__Impl7037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__2__Impl_in_rule__DivOperation__Group_1__27067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__SubExpressionsAssignment_1_2_in_rule__DivOperation__Group_1__2__Impl7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__0__Impl_in_rule__PreArithmOperation__Group__07130 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__1_in_rule__PreArithmOperation__Group__07133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__OperatorAssignment_0_in_rule__PreArithmOperation__Group__0__Impl7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__1__Impl_in_rule__PreArithmOperation__Group__17190 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__2_in_rule__PreArithmOperation__Group__17193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PreArithmOperation__Group__1__Impl7221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__2__Impl_in_rule__PreArithmOperation__Group__27252 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__3_in_rule__PreArithmOperation__Group__27255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__SubExpressionsAssignment_2_in_rule__PreArithmOperation__Group__2__Impl7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__3__Impl_in_rule__PreArithmOperation__Group__37312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PreArithmOperation__Group__3__Impl7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__0__Impl_in_rule__CompareOperation__Group__07379 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__07382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__CompareOperation__Group__0__Impl7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__1__Impl_in_rule__CompareOperation__Group__17438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__1__Impl7465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0__Impl_in_rule__CompareOperation__Group_1__07499 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__07502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1__Impl_in_rule__CompareOperation__Group_1__17560 = new BitSet(new long[]{0x000000004000A0F0L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__17563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__1__Impl7590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2__Impl_in_rule__CompareOperation__Group_1__27620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__2__Impl7647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__07683 = new BitSet(new long[]{0x000000004000A1F0L});
    public static final BitSet FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__07686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__17743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__SubExpressionsAssignment_1_in_rule__UnaryOperation__Group__1__Impl7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__0__Impl_in_rule__UnaryParanthesedOperation__Group__07804 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__1_in_rule__UnaryParanthesedOperation__Group__07807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__OperatorAssignment_0_in_rule__UnaryParanthesedOperation__Group__0__Impl7834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__1__Impl_in_rule__UnaryParanthesedOperation__Group__17864 = new BitSet(new long[]{0x000000004000E1F0L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__2_in_rule__UnaryParanthesedOperation__Group__17867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__UnaryParanthesedOperation__Group__1__Impl7895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__2__Impl_in_rule__UnaryParanthesedOperation__Group__27926 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__3_in_rule__UnaryParanthesedOperation__Group__27929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__SubExpressionsAssignment_2_in_rule__UnaryParanthesedOperation__Group__2__Impl7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__3__Impl_in_rule__UnaryParanthesedOperation__Group__37986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__UnaryParanthesedOperation__Group__3__Impl8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group__0__Impl_in_rule__AndOperation__Group__08053 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group__1_in_rule__AndOperation__Group__08056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__Group__0__Impl8083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group__1__Impl_in_rule__AndOperation__Group__18112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__0_in_rule__AndOperation__Group__1__Impl8139 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__0__Impl_in_rule__AndOperation__Group_1__08174 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__1_in_rule__AndOperation__Group_1__08177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__1__Impl_in_rule__AndOperation__Group_1__18235 = new BitSet(new long[]{0x000000004000E1F0L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__2_in_rule__AndOperation__Group_1__18238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__OperatorAssignment_1_1_in_rule__AndOperation__Group_1__1__Impl8265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__2__Impl_in_rule__AndOperation__Group_1__28295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__SubExpressionsAssignment_1_2_in_rule__AndOperation__Group_1__2__Impl8322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group__0__Impl_in_rule__OrOperation__Group__08358 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group__1_in_rule__OrOperation__Group__08361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_rule__OrOperation__Group__0__Impl8388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group__1__Impl_in_rule__OrOperation__Group__18417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__0_in_rule__OrOperation__Group__1__Impl8444 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__0__Impl_in_rule__OrOperation__Group_1__08479 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__1_in_rule__OrOperation__Group_1__08482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__1__Impl_in_rule__OrOperation__Group_1__18540 = new BitSet(new long[]{0x000000004000E1F0L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__2_in_rule__OrOperation__Group_1__18543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__OperatorAssignment_1_1_in_rule__OrOperation__Group_1__1__Impl8570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__2__Impl_in_rule__OrOperation__Group_1__28600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__SubExpressionsAssignment_1_2_in_rule__OrOperation__Group_1__2__Impl8627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0__Impl_in_rule__ParanthesedBooleanExpression__Group_5__08663 = new BitSet(new long[]{0x000000004000E1F0L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1_in_rule__ParanthesedBooleanExpression__Group_5__08666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParanthesedBooleanExpression__Group_5__0__Impl8694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1__Impl_in_rule__ParanthesedBooleanExpression__Group_5__18725 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2_in_rule__ParanthesedBooleanExpression__Group_5__18728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_rule__ParanthesedBooleanExpression__Group_5__1__Impl8755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2__Impl_in_rule__ParanthesedBooleanExpression__Group_5__28784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ParanthesedBooleanExpression__Group_5__2__Impl8812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__08849 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__08852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl8879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__18909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl8936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__08971 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__08974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TextExpression__Group_1__0__Impl9002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__19033 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__19036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl9063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__29093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TextExpression__Group_1__2__Impl9121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Action__IsImmediateAssignment_19168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Action__DelayAssignment_29207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Action__TriggerAssignment_39238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__Action__EffectsAssignment_4_1_09269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_09304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Emission__NewValueAssignment_1_0_19339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Emission__NewValueAssignment_1_1_19370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_09405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Assignment__ExpressionAssignment_2_09440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Assignment__ExpressionAssignment_2_19471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextEffect__CodeAssignment_09502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextEffect__TypeAssignment_1_19533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SignalReference__SignalAssignment_09568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SignalReference__SubExpressionsAssignment_1_1_09603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment_09638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableReference__SubExpressionsAssignment_1_1_09673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment9706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment9737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment9768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperator_in_rule__ValOperation__OperatorAssignment_09799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__ValOperation__SubExpressionsAssignment_19830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperator_in_rule__PlusOperation__OperatorAssignment_1_19861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__SubExpressionsAssignment_1_29892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultOperation__OperatorAssignment_1_19923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_rule__MultOperation__SubExpressionsAssignment_1_29954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivOperation__OperatorAssignment_1_19985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_rule__DivOperation__SubExpressionsAssignment_1_210016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rule__PreArithmOperation__OperatorAssignment_010047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_rule__PreArithmOperation__SubExpressionsAssignment_210078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_110109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_210140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_010171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__SubExpressionsAlternatives_1_0_in_rule__UnaryOperation__SubExpressionsAssignment_110202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rule__UnaryParanthesedOperation__OperatorAssignment_010235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__UnaryParanthesedOperation__SubExpressionsAssignment_210266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorAnd_in_rule__AndOperation__OperatorAssignment_1_110297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__SubExpressionsAssignment_1_210328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorOr_in_rule__OrOperation__OperatorAssignment_1_110359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_rule__OrOperation__SubExpressionsAssignment_1_210390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_010421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_110452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0_in_synpred32236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_synpred42287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValuedExpression__Group_5__0_in_synpred102424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_synpred112475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_synpred132574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_synpred152640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_synpred172706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_synpred182723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_synpred192740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_synpred202757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred212807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__Group_1__0_in_synpred374751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__Group_1__0_in_synpred405187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__0_in_synpred488936 = new BitSet(new long[]{0x0000000000000002L});

}