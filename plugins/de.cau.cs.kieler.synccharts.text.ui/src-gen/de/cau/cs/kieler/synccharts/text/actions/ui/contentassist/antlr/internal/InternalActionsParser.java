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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'/'", "'?'", "'E'", "'e'", "'true'", "'false'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "','", "'('", "')'", "':='", "'.'", "'#'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalActionsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[382+1];
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


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:204:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:205:1: ( ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:206:1: ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression369);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression376); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:213:1: ruleBooleanExpression : ( ruleOrExpression ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:217:2: ( ( ruleOrExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:218:1: ( ruleOrExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:218:1: ( ruleOrExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:219:1: ruleOrExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleBooleanExpression402);
            ruleOrExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start entryRuleOrExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:232:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:233:1: ( ruleOrExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:234:1: ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression428);
            ruleOrExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression435); if (failed) return ;

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
    // $ANTLR end entryRuleOrExpression


    // $ANTLR start ruleOrExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:241:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:245:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:246:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:246:1: ( ( rule__OrExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:247:1: ( rule__OrExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:248:1: ( rule__OrExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:248:2: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression461);
            rule__OrExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOrExpression


    // $ANTLR start entryRuleAndExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:260:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:261:1: ( ruleAndExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:262:1: ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression488);
            ruleAndExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression495); if (failed) return ;

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
    // $ANTLR end entryRuleAndExpression


    // $ANTLR start ruleAndExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:269:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:273:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:274:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:274:1: ( ( rule__AndExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:275:1: ( rule__AndExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:276:1: ( rule__AndExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:276:2: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression521);
            rule__AndExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAndExpression


    // $ANTLR start entryRuleNotExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:288:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:289:1: ( ruleNotExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:290:1: ruleNotExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression548);
            ruleNotExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression555); if (failed) return ;

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
    // $ANTLR end entryRuleNotExpression


    // $ANTLR start ruleNotExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:297:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:301:2: ( ( ( rule__NotExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:302:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:302:1: ( ( rule__NotExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:303:1: ( rule__NotExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:304:1: ( rule__NotExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:304:2: rule__NotExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression581);
            rule__NotExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNotExpression


    // $ANTLR start entryRuleAtomicExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:316:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:317:1: ( ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:318:1: ruleAtomicExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression608);
            ruleAtomicExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression615); if (failed) return ;

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
    // $ANTLR end entryRuleAtomicExpression


    // $ANTLR start ruleAtomicExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:325:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:329:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:330:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:330:1: ( ( rule__AtomicExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:331:1: ( rule__AtomicExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:332:1: ( rule__AtomicExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:332:2: rule__AtomicExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression641);
            rule__AtomicExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAtomicExpression


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:344:1: entryRuleSignalReference : ruleSignalReference EOF ;
    public final void entryRuleSignalReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:345:1: ( ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:346:1: ruleSignalReference EOF
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:353:1: ruleSignalReference : ( ( rule__SignalReference__SignalAssignment ) ) ;
    public final void ruleSignalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:357:2: ( ( ( rule__SignalReference__SignalAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:358:1: ( ( rule__SignalReference__SignalAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:358:1: ( ( rule__SignalReference__SignalAssignment ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:359:1: ( rule__SignalReference__SignalAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:360:1: ( rule__SignalReference__SignalAssignment )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:360:2: rule__SignalReference__SignalAssignment
            {
            pushFollow(FOLLOW_rule__SignalReference__SignalAssignment_in_ruleSignalReference701);
            rule__SignalReference__SignalAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getSignalAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:372:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:373:1: ( ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:374:1: ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation728);
            ruleCompareOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation735); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:381:1: ruleCompareOperation : ( ( rule__CompareOperation__Group__0 ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:385:2: ( ( ( rule__CompareOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:386:1: ( ( rule__CompareOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:386:1: ( ( rule__CompareOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:387:1: ( rule__CompareOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:388:1: ( rule__CompareOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:388:2: rule__CompareOperation__Group__0
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group__0_in_ruleCompareOperation761);
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


    // $ANTLR start entryRuleValuedExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:400:1: entryRuleValuedExpression : ruleValuedExpression EOF ;
    public final void entryRuleValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:401:1: ( ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:402:1: ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression788);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedExpression795); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:409:1: ruleValuedExpression : ( ruleAddExpression ) ;
    public final void ruleValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:413:2: ( ( ruleAddExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:414:1: ( ruleAddExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:414:1: ( ruleAddExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:415:1: ruleAddExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_ruleValuedExpression821);
            ruleAddExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start entryRuleAddExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:428:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:429:1: ( ruleAddExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:430:1: ruleAddExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression847);
            ruleAddExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAddExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression854); if (failed) return ;

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
    // $ANTLR end entryRuleAddExpression


    // $ANTLR start ruleAddExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:437:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:441:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:442:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:442:1: ( ( rule__AddExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:443:1: ( rule__AddExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:444:1: ( rule__AddExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:444:2: rule__AddExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression880);
            rule__AddExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAddExpression


    // $ANTLR start entryRuleSubExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:456:1: entryRuleSubExpression : ruleSubExpression EOF ;
    public final void entryRuleSubExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:457:1: ( ruleSubExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:458:1: ruleSubExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_entryRuleSubExpression907);
            ruleSubExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSubExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubExpression914); if (failed) return ;

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
    // $ANTLR end entryRuleSubExpression


    // $ANTLR start ruleSubExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:465:1: ruleSubExpression : ( ( rule__SubExpression__Group__0 ) ) ;
    public final void ruleSubExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:469:2: ( ( ( rule__SubExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:470:1: ( ( rule__SubExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:470:1: ( ( rule__SubExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:471:1: ( rule__SubExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:472:1: ( rule__SubExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:472:2: rule__SubExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression940);
            rule__SubExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSubExpression


    // $ANTLR start entryRuleMultExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:484:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:485:1: ( ruleMultExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:486:1: ruleMultExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_entryRuleMultExpression967);
            ruleMultExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExpression974); if (failed) return ;

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
    // $ANTLR end entryRuleMultExpression


    // $ANTLR start ruleMultExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:493:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:497:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:498:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:498:1: ( ( rule__MultExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:499:1: ( rule__MultExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:500:1: ( rule__MultExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:500:2: rule__MultExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression1000);
            rule__MultExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMultExpression


    // $ANTLR start entryRuleModExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:512:1: entryRuleModExpression : ruleModExpression EOF ;
    public final void entryRuleModExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:513:1: ( ruleModExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:514:1: ruleModExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_entryRuleModExpression1027);
            ruleModExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getModExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModExpression1034); if (failed) return ;

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
    // $ANTLR end entryRuleModExpression


    // $ANTLR start ruleModExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:521:1: ruleModExpression : ( ( rule__ModExpression__Group__0 ) ) ;
    public final void ruleModExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:525:2: ( ( ( rule__ModExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:526:1: ( ( rule__ModExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:526:1: ( ( rule__ModExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:527:1: ( rule__ModExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:528:1: ( rule__ModExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:528:2: rule__ModExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression1060);
            rule__ModExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModExpression


    // $ANTLR start entryRuleAtomicValuedExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:540:1: entryRuleAtomicValuedExpression : ruleAtomicValuedExpression EOF ;
    public final void entryRuleAtomicValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:541:1: ( ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:542:1: ruleAtomicValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression1087);
            ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicValuedExpression1094); if (failed) return ;

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
    // $ANTLR end entryRuleAtomicValuedExpression


    // $ANTLR start ruleAtomicValuedExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:549:1: ruleAtomicValuedExpression : ( ( rule__AtomicValuedExpression__Alternatives ) ) ;
    public final void ruleAtomicValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:553:2: ( ( ( rule__AtomicValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:554:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:554:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:555:1: ( rule__AtomicValuedExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:556:1: ( rule__AtomicValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:556:2: rule__AtomicValuedExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression1120);
            rule__AtomicValuedExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAtomicValuedExpression


    // $ANTLR start entryRuleDivExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:568:1: entryRuleDivExpression : ruleDivExpression EOF ;
    public final void entryRuleDivExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:569:1: ( ruleDivExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:570:1: ruleDivExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_entryRuleDivExpression1147);
            ruleDivExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivExpression1154); if (failed) return ;

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
    // $ANTLR end entryRuleDivExpression


    // $ANTLR start ruleDivExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:577:1: ruleDivExpression : ( ( rule__DivExpression__Group__0 ) ) ;
    public final void ruleDivExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:581:2: ( ( ( rule__DivExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:582:1: ( ( rule__DivExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:582:1: ( ( rule__DivExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:583:1: ( rule__DivExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:584:1: ( rule__DivExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:584:2: rule__DivExpression__Group__0
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression1180);
            rule__DivExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDivExpression


    // $ANTLR start entryRuleVariableReference
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:596:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:597:1: ( ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:598:1: ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference1207);
            ruleVariableReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference1214); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:605:1: ruleVariableReference : ( ( rule__VariableReference__VariableAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:609:2: ( ( ( rule__VariableReference__VariableAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:610:1: ( ( rule__VariableReference__VariableAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:610:1: ( ( rule__VariableReference__VariableAssignment ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:611:1: ( rule__VariableReference__VariableAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:612:1: ( rule__VariableReference__VariableAssignment )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:612:2: rule__VariableReference__VariableAssignment
            {
            pushFollow(FOLLOW_rule__VariableReference__VariableAssignment_in_ruleVariableReference1240);
            rule__VariableReference__VariableAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start entryRuleValueTestExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:624:1: entryRuleValueTestExpression : ruleValueTestExpression EOF ;
    public final void entryRuleValueTestExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:625:1: ( ruleValueTestExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:626:1: ruleValueTestExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValueTestExpression_in_entryRuleValueTestExpression1267);
            ruleValueTestExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueTestExpression1274); if (failed) return ;

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
    // $ANTLR end entryRuleValueTestExpression


    // $ANTLR start ruleValueTestExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:633:1: ruleValueTestExpression : ( ( rule__ValueTestExpression__Group__0 ) ) ;
    public final void ruleValueTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:637:2: ( ( ( rule__ValueTestExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:638:1: ( ( rule__ValueTestExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:638:1: ( ( rule__ValueTestExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:639:1: ( rule__ValueTestExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:640:1: ( rule__ValueTestExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:640:2: rule__ValueTestExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__0_in_ruleValueTestExpression1300);
            rule__ValueTestExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleValueTestExpression


    // $ANTLR start entryRulePreValueTestExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:652:1: entryRulePreValueTestExpression : rulePreValueTestExpression EOF ;
    public final void entryRulePreValueTestExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:653:1: ( rulePreValueTestExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:654:1: rulePreValueTestExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePreValueTestExpression_in_entryRulePreValueTestExpression1327);
            rulePreValueTestExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreValueTestExpression1334); if (failed) return ;

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
    // $ANTLR end entryRulePreValueTestExpression


    // $ANTLR start rulePreValueTestExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:661:1: rulePreValueTestExpression : ( ( rule__PreValueTestExpression__Group__0 ) ) ;
    public final void rulePreValueTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:665:2: ( ( ( rule__PreValueTestExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:666:1: ( ( rule__PreValueTestExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:666:1: ( ( rule__PreValueTestExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:667:1: ( rule__PreValueTestExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:668:1: ( rule__PreValueTestExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:668:2: rule__PreValueTestExpression__Group__0
            {
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__0_in_rulePreValueTestExpression1360);
            rule__PreValueTestExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePreValueTestExpression


    // $ANTLR start entryRuleTextExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:680:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:681:1: ( ruleTextExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:682:1: ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression1387);
            ruleTextExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression1394); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:689:1: ruleTextExpression : ( ( rule__TextExpression__Group__0 ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:693:2: ( ( ( rule__TextExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:694:1: ( ( rule__TextExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:694:1: ( ( rule__TextExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:695:1: ( rule__TextExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:696:1: ( rule__TextExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:696:2: rule__TextExpression__Group__0
            {
            pushFollow(FOLLOW_rule__TextExpression__Group__0_in_ruleTextExpression1420);
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


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:708:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:709:1: ( ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:710:1: ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue1447);
            ruleIntValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue1454); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:717:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:721:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:722:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:722:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:723:1: ( rule__IntValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:724:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:724:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1480);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:736:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:737:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:738:1: ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1507);
            ruleFloatValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1514); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:745:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:749:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:750:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:750:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:751:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:752:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:752:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1540);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:764:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:765:1: ( ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:766:1: ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1567);
            ruleBooleanValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1574); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:773:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:777:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:778:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:778:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:779:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:780:1: ( rule__BooleanValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:780:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1600);
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


    // $ANTLR start entryRuleEIntegerObject
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:792:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:793:1: ( ruleEIntegerObject EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:794:1: ruleEIntegerObject EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEIntegerObjectRule()); 
            }
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1627);
            ruleEIntegerObject();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEIntegerObjectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject1634); if (failed) return ;

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
    // $ANTLR end entryRuleEIntegerObject


    // $ANTLR start ruleEIntegerObject
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:801:1: ruleEIntegerObject : ( ( rule__EIntegerObject__Group__0 ) ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:805:2: ( ( ( rule__EIntegerObject__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:806:1: ( ( rule__EIntegerObject__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:806:1: ( ( rule__EIntegerObject__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:807:1: ( rule__EIntegerObject__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEIntegerObjectAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:808:1: ( rule__EIntegerObject__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:808:2: rule__EIntegerObject__Group__0
            {
            pushFollow(FOLLOW_rule__EIntegerObject__Group__0_in_ruleEIntegerObject1660);
            rule__EIntegerObject__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEIntegerObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEIntegerObject


    // $ANTLR start entryRuleEFloatObject
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:820:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:821:1: ( ruleEFloatObject EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:822:1: ruleEFloatObject EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectRule()); 
            }
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1687);
            ruleEFloatObject();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject1694); if (failed) return ;

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
    // $ANTLR end entryRuleEFloatObject


    // $ANTLR start ruleEFloatObject
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:829:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:833:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:834:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:834:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:835:1: ( rule__EFloatObject__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:836:1: ( rule__EFloatObject__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:836:2: rule__EFloatObject__Group__0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject1720);
            rule__EFloatObject__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEFloatObject


    // $ANTLR start entryRuleEBooleanObject
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:848:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:849:1: ( ruleEBooleanObject EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:850:1: ruleEBooleanObject EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEBooleanObjectRule()); 
            }
            pushFollow(FOLLOW_ruleEBooleanObject_in_entryRuleEBooleanObject1747);
            ruleEBooleanObject();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEBooleanObjectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBooleanObject1754); if (failed) return ;

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
    // $ANTLR end entryRuleEBooleanObject


    // $ANTLR start ruleEBooleanObject
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:857:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:861:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:862:1: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:862:1: ( ( rule__EBooleanObject__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:863:1: ( rule__EBooleanObject__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:864:1: ( rule__EBooleanObject__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:864:2: rule__EBooleanObject__Alternatives
            {
            pushFollow(FOLLOW_rule__EBooleanObject__Alternatives_in_ruleEBooleanObject1780);
            rule__EBooleanObject__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEBooleanObject


    // $ANTLR start entryRuleEString
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:876:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:877:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:878:1: ruleEString EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1807);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1814); if (failed) return ;

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
    // $ANTLR end entryRuleEString


    // $ANTLR start ruleEString
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:885:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:889:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:890:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:890:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:891:1: ( rule__EString__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:892:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:892:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString1840);
            rule__EString__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEString


    // $ANTLR start ruleCompareOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:905:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:909:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:910:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:910:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:911:1: ( rule__CompareOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:912:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:912:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1877);
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


    // $ANTLR start rulePreOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:924:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:928:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:929:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:929:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:930:1: ( 'pre' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:931:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:931:3: 'pre'
            {
            match(input,11,FOLLOW_11_in_rulePreOperator1914); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePreOperator


    // $ANTLR start ruleOrOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:944:1: ruleOrOperator : ( ( 'or' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:948:1: ( ( ( 'or' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:949:1: ( ( 'or' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:949:1: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:950:1: ( 'or' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:951:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:951:3: 'or'
            {
            match(input,12,FOLLOW_12_in_ruleOrOperator1953); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOrOperator


    // $ANTLR start ruleAndOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:964:1: ruleAndOperator : ( ( 'and' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:968:1: ( ( ( 'and' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:969:1: ( ( 'and' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:969:1: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:970:1: ( 'and' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:971:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:971:3: 'and'
            {
            match(input,13,FOLLOW_13_in_ruleAndOperator1992); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAndOperator


    // $ANTLR start ruleNotOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:984:1: ruleNotOperator : ( ( 'not' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:988:1: ( ( ( 'not' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:989:1: ( ( 'not' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:989:1: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:990:1: ( 'not' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:991:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:991:3: 'not'
            {
            match(input,14,FOLLOW_14_in_ruleNotOperator2031); if (failed) return ;

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


    // $ANTLR start ruleAddOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1004:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1008:1: ( ( ( '+' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1009:1: ( ( '+' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1009:1: ( ( '+' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1010:1: ( '+' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1011:1: ( '+' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1011:3: '+'
            {
            match(input,15,FOLLOW_15_in_ruleAddOperator2070); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAddOperator


    // $ANTLR start ruleSubOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1024:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1028:1: ( ( ( '-' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1029:1: ( ( '-' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1029:1: ( ( '-' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1030:1: ( '-' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1031:1: ( '-' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1031:3: '-'
            {
            match(input,16,FOLLOW_16_in_ruleSubOperator2109); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSubOperator


    // $ANTLR start ruleMultOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1044:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1048:1: ( ( ( '*' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1049:1: ( ( '*' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1049:1: ( ( '*' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1050:1: ( '*' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1051:1: ( '*' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1051:3: '*'
            {
            match(input,17,FOLLOW_17_in_ruleMultOperator2148); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }

            }


            }

        }
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


    // $ANTLR start ruleModOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1064:1: ruleModOperator : ( ( 'mod' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1068:1: ( ( ( 'mod' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1069:1: ( ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1069:1: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1070:1: ( 'mod' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1071:1: ( 'mod' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1071:3: 'mod'
            {
            match(input,18,FOLLOW_18_in_ruleModOperator2187); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModOperator


    // $ANTLR start ruleDivOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1084:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1088:1: ( ( ( '/' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1089:1: ( ( '/' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1089:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1090:1: ( '/' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1091:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1091:3: '/'
            {
            match(input,19,FOLLOW_19_in_ruleDivOperator2226); if (failed) return ;

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


    // $ANTLR start ruleValueTestOperator
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1104:1: ruleValueTestOperator : ( ( '?' ) ) ;
    public final void ruleValueTestOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1108:1: ( ( ( '?' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1109:1: ( ( '?' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1109:1: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1110:1: ( '?' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1111:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1111:3: '?'
            {
            match(input,20,FOLLOW_20_in_ruleValueTestOperator2265); if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleValueTestOperator


    // $ANTLR start rule__Effect__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1127:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1131:1: ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||(LA1_1>=RULE_STRING && LA1_1<=RULE_ID)||(LA1_1>=31 && LA1_1<=32)) ) {
                    alt1=1;
                }
                else if ( (LA1_1==34) ) {
                    alt1=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1127:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1127:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1132:1: ( ruleEmission )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1132:1: ( ruleEmission )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1133:1: ruleEmission
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEmission_in_rule__Effect__Alternatives2306);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1138:6: ( ruleAssignment )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1138:6: ( ruleAssignment )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1139:1: ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2323);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1144:6: ( ruleTextEffect )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1144:6: ( ruleTextEffect )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1145:1: ruleTextEffect
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleTextEffect_in_rule__Effect__Alternatives2340);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1155:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );
    public final void rule__Emission__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1159:1: ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
                switch ( input.LA(2) ) {
                case 14:
                case 23:
                case 24:
                    {
                    alt2=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    switch ( input.LA(3) ) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 32:
                        {
                        alt2=1;
                        }
                        break;
                    case 33:
                        {
                        int LA2_8 = input.LA(4);

                        if ( (synpred3()) ) {
                            alt2=1;
                        }
                        else if ( (true) ) {
                            alt2=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1155:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 12:
                    case 13:
                        {
                        alt2=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1155:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(3) ) {
                    case 12:
                    case 13:
                        {
                        alt2=2;
                        }
                        break;
                    case 33:
                        {
                        int LA2_8 = input.LA(4);

                        if ( (synpred3()) ) {
                            alt2=1;
                        }
                        else if ( (true) ) {
                            alt2=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1155:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        {
                        alt2=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1155:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                case 11:
                    {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==32) ) {
                        int LA2_9 = input.LA(4);

                        if ( (LA2_9==20) ) {
                            alt2=1;
                        }
                        else if ( ((LA2_9>=RULE_STRING && LA2_9<=RULE_ID)) ) {
                            alt2=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1155:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 9, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1155:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 32:
                    {
                    int LA2_6 = input.LA(3);

                    if ( (synpred3()) ) {
                        alt2=1;
                    }
                    else if ( (true) ) {
                        alt2=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1155:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                case 16:
                case 20:
                case 35:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1155:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1155:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:1: ( ( rule__Emission__Group_1_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:1: ( ( rule__Emission__Group_1_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1161:1: ( rule__Emission__Group_1_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEmissionAccess().getGroup_1_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1162:1: ( rule__Emission__Group_1_0__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1162:2: rule__Emission__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Emission__Group_1_0__0_in_rule__Emission__Alternatives_12372);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1166:6: ( ( rule__Emission__Group_1_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1166:6: ( ( rule__Emission__Group_1_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1167:1: ( rule__Emission__Group_1_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEmissionAccess().getGroup_1_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1168:1: ( rule__Emission__Group_1_1__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1168:2: rule__Emission__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Emission__Group_1_1__0_in_rule__Emission__Alternatives_12390);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1177:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );
    public final void rule__Assignment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1181:1: ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 16:
            case 20:
            case 35:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
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
                        new NoViableAltException("1177:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
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
                        new NoViableAltException("1177:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 11:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==32) ) {
                    int LA3_7 = input.LA(3);

                    if ( (LA3_7==20) ) {
                        alt3=1;
                    }
                    else if ( ((LA3_7>=RULE_STRING && LA3_7<=RULE_ID)) ) {
                        alt3=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1177:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1177:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 32:
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
                        new NoViableAltException("1177:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case 14:
            case 23:
            case 24:
                {
                alt3=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1177:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1182:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1182:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1183:1: ( rule__Assignment__ExpressionAssignment_2_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1184:1: ( rule__Assignment__ExpressionAssignment_2_0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1184:2: rule__Assignment__ExpressionAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_rule__Assignment__Alternatives_22423);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1188:6: ( ( rule__Assignment__ExpressionAssignment_2_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1188:6: ( ( rule__Assignment__ExpressionAssignment_2_1 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1189:1: ( rule__Assignment__ExpressionAssignment_2_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1190:1: ( rule__Assignment__ExpressionAssignment_2_1 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1190:2: rule__Assignment__ExpressionAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_1_in_rule__Assignment__Alternatives_22441);
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


    // $ANTLR start rule__NotExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1199:1: rule__NotExpression__Alternatives : ( ( ruleAtomicExpression ) | ( ( rule__NotExpression__Group_1__0 ) ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1203:1: ( ( ruleAtomicExpression ) | ( ( rule__NotExpression__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)||LA4_0==11||(LA4_0>=23 && LA4_0<=24)||LA4_0==32) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1199:1: rule__NotExpression__Alternatives : ( ( ruleAtomicExpression ) | ( ( rule__NotExpression__Group_1__0 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1204:1: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1204:1: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1205:1: ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2474);
                    ruleAtomicExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1210:6: ( ( rule__NotExpression__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1210:6: ( ( rule__NotExpression__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1211:1: ( rule__NotExpression__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1212:1: ( rule__NotExpression__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1212:2: rule__NotExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NotExpression__Group_1__0_in_rule__NotExpression__Alternatives2491);
                    rule__NotExpression__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getNotExpressionAccess().getGroup_1()); 
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
    // $ANTLR end rule__NotExpression__Alternatives


    // $ANTLR start rule__AtomicExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1221:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1225:1: ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 11:
                {
                alt5=3;
                }
                break;
            case 32:
                {
                switch ( input.LA(2) ) {
                case 14:
                case 23:
                case 24:
                    {
                    alt5=5;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA5_6 = input.LA(3);

                    if ( ((LA5_6>=15 && LA5_6<=18)||(LA5_6>=25 && LA5_6<=30)||LA5_6==32) ) {
                        alt5=4;
                    }
                    else if ( ((LA5_6>=12 && LA5_6<=13)||LA5_6==33) ) {
                        alt5=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1221:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 5, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA5_7 = input.LA(3);

                    if ( ((LA5_7>=12 && LA5_7<=13)||LA5_7==33) ) {
                        alt5=5;
                    }
                    else if ( ((LA5_7>=15 && LA5_7<=18)||(LA5_7>=25 && LA5_7<=30)) ) {
                        alt5=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1221:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 5, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 11:
                    {
                    int LA5_8 = input.LA(3);

                    if ( (LA5_8==32) ) {
                        int LA5_11 = input.LA(4);

                        if ( ((LA5_11>=RULE_STRING && LA5_11<=RULE_ID)) ) {
                            alt5=5;
                        }
                        else if ( (LA5_11==20) ) {
                            alt5=4;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1221:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 5, 11, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1221:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 5, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 32:
                    {
                    int LA5_9 = input.LA(3);

                    if ( (synpred9()) ) {
                        alt5=4;
                    }
                    else if ( (true) ) {
                        alt5=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1221:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 5, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                case 16:
                case 20:
                case 35:
                    {
                    alt5=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1221:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 5, 4, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1221:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1226:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1226:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1227:1: ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives2524);
                    ruleBooleanValue();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1232:6: ( ruleSignalReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1232:6: ( ruleSignalReference )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1233:1: ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getSignalReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_rule__AtomicExpression__Alternatives2541);
                    ruleSignalReference();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getSignalReferenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1238:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1238:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1239:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1240:1: ( rule__AtomicExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1240:2: rule__AtomicExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2558);
                    rule__AtomicExpression__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1244:6: ( ( rule__AtomicExpression__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1244:6: ( ( rule__AtomicExpression__Group_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1245:1: ( rule__AtomicExpression__Group_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1246:1: ( rule__AtomicExpression__Group_3__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1246:2: rule__AtomicExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpression__Group_3__0_in_rule__AtomicExpression__Alternatives2576);
                    rule__AtomicExpression__Group_3__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1250:6: ( ( rule__AtomicExpression__Group_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1250:6: ( ( rule__AtomicExpression__Group_4__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1251:1: ( rule__AtomicExpression__Group_4__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1252:1: ( rule__AtomicExpression__Group_4__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1252:2: rule__AtomicExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpression__Group_4__0_in_rule__AtomicExpression__Alternatives2594);
                    rule__AtomicExpression__Group_4__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getGroup_4()); 
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
    // $ANTLR end rule__AtomicExpression__Alternatives


    // $ANTLR start rule__AtomicValuedExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1261:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1265:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_INT) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==35) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==EOF||(LA6_2>=RULE_STRING && LA6_2<=RULE_ID)||(LA6_2>=15 && LA6_2<=19)||(LA6_2>=25 && LA6_2<=31)||LA6_2==33) ) {
                        alt6=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1261:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 6, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==35) ) {
                    alt6=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1261:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==35) ) {
                    alt6=2;
                }
                else if ( (LA6_2==EOF||(LA6_2>=RULE_STRING && LA6_2<=RULE_ID)||(LA6_2>=15 && LA6_2<=19)||(LA6_2>=25 && LA6_2<=31)||LA6_2==33) ) {
                    alt6=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1261:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                int LA6_4 = input.LA(2);

                if ( (synpred12()) ) {
                    alt6=3;
                }
                else if ( (true) ) {
                    alt6=8;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1261:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 11:
                {
                alt6=5;
                }
                break;
            case 32:
                {
                int LA6_8 = input.LA(2);

                if ( (synpred15()) ) {
                    alt6=6;
                }
                else if ( (synpred16()) ) {
                    alt6=7;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1261:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 6, 8, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1261:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1266:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1266:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1267:1: ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2627);
                    ruleIntValue();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1272:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1272:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1273:1: ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2644);
                    ruleFloatValue();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:6: ( ruleVariableReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:6: ( ruleVariableReference )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1279:1: ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getVariableReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_rule__AtomicValuedExpression__Alternatives2661);
                    ruleVariableReference();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getVariableReferenceParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1284:6: ( ruleValueTestExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1284:6: ( ruleValueTestExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1285:1: ruleValueTestExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getValueTestExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleValueTestExpression_in_rule__AtomicValuedExpression__Alternatives2678);
                    ruleValueTestExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getValueTestExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1290:6: ( rulePreValueTestExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1290:6: ( rulePreValueTestExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1291:1: rulePreValueTestExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getPreValueTestExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_rulePreValueTestExpression_in_rule__AtomicValuedExpression__Alternatives2695);
                    rulePreValueTestExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getPreValueTestExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1296:6: ( ( rule__AtomicValuedExpression__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1296:6: ( ( rule__AtomicValuedExpression__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1297:1: ( rule__AtomicValuedExpression__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1298:1: ( rule__AtomicValuedExpression__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1298:2: rule__AtomicValuedExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_5__0_in_rule__AtomicValuedExpression__Alternatives2712);
                    rule__AtomicValuedExpression__Group_5__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1302:6: ( ( rule__AtomicValuedExpression__Group_6__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1302:6: ( ( rule__AtomicValuedExpression__Group_6__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1303:1: ( rule__AtomicValuedExpression__Group_6__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_6()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1304:1: ( rule__AtomicValuedExpression__Group_6__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1304:2: rule__AtomicValuedExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_6__0_in_rule__AtomicValuedExpression__Alternatives2730);
                    rule__AtomicValuedExpression__Group_6__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1308:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1308:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1309:1: ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getTextExpressionParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_rule__AtomicValuedExpression__Alternatives2748);
                    ruleTextExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getTextExpressionParserRuleCall_7()); 
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
    // $ANTLR end rule__AtomicValuedExpression__Alternatives


    // $ANTLR start rule__EFloatObject__Alternatives_4_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1319:1: rule__EFloatObject__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloatObject__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1323:1: ( ( 'E' ) | ( 'e' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1319:1: rule__EFloatObject__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1324:1: ( 'E' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1324:1: ( 'E' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1325:1: 'E'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__EFloatObject__Alternatives_4_02781); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1332:6: ( 'e' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1332:6: ( 'e' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1333:1: 'e'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__EFloatObject__Alternatives_4_02801); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_1()); 
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
    // $ANTLR end rule__EFloatObject__Alternatives_4_0


    // $ANTLR start rule__EBooleanObject__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1345:1: rule__EBooleanObject__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1349:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1345:1: rule__EBooleanObject__Alternatives : ( ( 'true' ) | ( 'false' ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1350:1: ( 'true' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1350:1: ( 'true' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1351:1: 'true'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__EBooleanObject__Alternatives2836); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1358:6: ( 'false' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1358:6: ( 'false' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1359:1: 'false'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__EBooleanObject__Alternatives2856); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1()); 
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
    // $ANTLR end rule__EBooleanObject__Alternatives


    // $ANTLR start rule__EString__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1371:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1375:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1371:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1376:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1376:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1377:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives2890); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1382:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1382:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1383:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives2907); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
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
    // $ANTLR end rule__EString__Alternatives


    // $ANTLR start rule__CompareOperator__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1393:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1397:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            case 28:
                {
                alt10=4;
                }
                break;
            case 29:
                {
                alt10=5;
                }
                break;
            case 30:
                {
                alt10=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1393:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1398:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1398:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1399:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1400:1: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1400:3: '='
                    {
                    match(input,25,FOLLOW_25_in_rule__CompareOperator__Alternatives2940); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1405:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1405:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1406:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1407:1: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1407:3: '<'
                    {
                    match(input,26,FOLLOW_26_in_rule__CompareOperator__Alternatives2961); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1412:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1412:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1413:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1414:1: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1414:3: '<='
                    {
                    match(input,27,FOLLOW_27_in_rule__CompareOperator__Alternatives2982); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1419:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1419:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1420:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1421:1: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1421:3: '>'
                    {
                    match(input,28,FOLLOW_28_in_rule__CompareOperator__Alternatives3003); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1426:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1426:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1427:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1428:1: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1428:3: '>='
                    {
                    match(input,29,FOLLOW_29_in_rule__CompareOperator__Alternatives3024); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1433:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1433:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1434:1: ( '<>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1435:1: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1435:3: '<>'
                    {
                    match(input,30,FOLLOW_30_in_rule__CompareOperator__Alternatives3045); if (failed) return ;

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


    // $ANTLR start rule__Action__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1449:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1453:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1454:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__03080);
            rule__Action__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__03083);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1461:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1465:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1466:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1466:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1467:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getActionAction_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1468:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1470:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1480:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1484:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1485:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__13141);
            rule__Action__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__13144);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1492:1: rule__Action__Group__1__Impl : ( ( rule__Action__IsImmediateAssignment_1 )? ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1496:1: ( ( ( rule__Action__IsImmediateAssignment_1 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1497:1: ( ( rule__Action__IsImmediateAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1497:1: ( ( rule__Action__IsImmediateAssignment_1 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1498:1: ( rule__Action__IsImmediateAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1499:1: ( rule__Action__IsImmediateAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1499:2: rule__Action__IsImmediateAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Action__IsImmediateAssignment_1_in_rule__Action__Group__1__Impl3171);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1509:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1513:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1514:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__23202);
            rule__Action__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__23205);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1521:1: rule__Action__Group__2__Impl : ( ( rule__Action__DelayAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1525:1: ( ( ( rule__Action__DelayAssignment_2 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1526:1: ( ( rule__Action__DelayAssignment_2 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1526:1: ( ( rule__Action__DelayAssignment_2 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1527:1: ( rule__Action__DelayAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDelayAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1528:1: ( rule__Action__DelayAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1528:2: rule__Action__DelayAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Action__DelayAssignment_2_in_rule__Action__Group__2__Impl3232);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1538:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1542:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1543:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__33263);
            rule__Action__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__33266);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1550:1: rule__Action__Group__3__Impl : ( ( rule__Action__TriggerAssignment_3 )? ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1554:1: ( ( ( rule__Action__TriggerAssignment_3 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1555:1: ( ( rule__Action__TriggerAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1555:1: ( ( rule__Action__TriggerAssignment_3 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1556:1: ( rule__Action__TriggerAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTriggerAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1557:1: ( rule__Action__TriggerAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||LA13_0==11||LA13_0==14||(LA13_0>=23 && LA13_0<=24)||LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1557:2: rule__Action__TriggerAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Action__TriggerAssignment_3_in_rule__Action__Group__3__Impl3293);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1567:1: rule__Action__Group__4 : rule__Action__Group__4__Impl ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1571:1: ( rule__Action__Group__4__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1572:2: rule__Action__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__43324);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1578:1: rule__Action__Group__4__Impl : ( ( rule__Action__Group_4__0 )? ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1582:1: ( ( ( rule__Action__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1583:1: ( ( rule__Action__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1583:1: ( ( rule__Action__Group_4__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1584:1: ( rule__Action__Group_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_4()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1585:1: ( rule__Action__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1585:2: rule__Action__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_4__0_in_rule__Action__Group__4__Impl3351);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1605:1: rule__Action__Group_4__0 : rule__Action__Group_4__0__Impl rule__Action__Group_4__1 ;
    public final void rule__Action__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1609:1: ( rule__Action__Group_4__0__Impl rule__Action__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1610:2: rule__Action__Group_4__0__Impl rule__Action__Group_4__1
            {
            pushFollow(FOLLOW_rule__Action__Group_4__0__Impl_in_rule__Action__Group_4__03392);
            rule__Action__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_4__1_in_rule__Action__Group_4__03395);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1617:1: rule__Action__Group_4__0__Impl : ( '/' ) ;
    public final void rule__Action__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1621:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1622:1: ( '/' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1622:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1623:1: '/'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getSolidusKeyword_4_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Action__Group_4__0__Impl3423); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1636:1: rule__Action__Group_4__1 : rule__Action__Group_4__1__Impl ;
    public final void rule__Action__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1640:1: ( rule__Action__Group_4__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1641:2: rule__Action__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_4__1__Impl_in_rule__Action__Group_4__13454);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1647:1: rule__Action__Group_4__1__Impl : ( ( rule__Action__Group_4_1__0 )* ) ;
    public final void rule__Action__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1651:1: ( ( ( rule__Action__Group_4_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1652:1: ( ( rule__Action__Group_4_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1652:1: ( ( rule__Action__Group_4_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1653:1: ( rule__Action__Group_4_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_4_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1654:1: ( rule__Action__Group_4_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1654:2: rule__Action__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Action__Group_4_1__0_in_rule__Action__Group_4__1__Impl3481);
            	    rule__Action__Group_4_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1668:1: rule__Action__Group_4_1__0 : rule__Action__Group_4_1__0__Impl rule__Action__Group_4_1__1 ;
    public final void rule__Action__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1672:1: ( rule__Action__Group_4_1__0__Impl rule__Action__Group_4_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1673:2: rule__Action__Group_4_1__0__Impl rule__Action__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Action__Group_4_1__0__Impl_in_rule__Action__Group_4_1__03516);
            rule__Action__Group_4_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_4_1__1_in_rule__Action__Group_4_1__03519);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1680:1: rule__Action__Group_4_1__0__Impl : ( ( rule__Action__EffectsAssignment_4_1_0 ) ) ;
    public final void rule__Action__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1684:1: ( ( ( rule__Action__EffectsAssignment_4_1_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1685:1: ( ( rule__Action__EffectsAssignment_4_1_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1685:1: ( ( rule__Action__EffectsAssignment_4_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1686:1: ( rule__Action__EffectsAssignment_4_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getEffectsAssignment_4_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1687:1: ( rule__Action__EffectsAssignment_4_1_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1687:2: rule__Action__EffectsAssignment_4_1_0
            {
            pushFollow(FOLLOW_rule__Action__EffectsAssignment_4_1_0_in_rule__Action__Group_4_1__0__Impl3546);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1697:1: rule__Action__Group_4_1__1 : rule__Action__Group_4_1__1__Impl ;
    public final void rule__Action__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1701:1: ( rule__Action__Group_4_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1702:2: rule__Action__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_4_1__1__Impl_in_rule__Action__Group_4_1__13576);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1708:1: rule__Action__Group_4_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__Action__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1712:1: ( ( ( ',' )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1713:1: ( ( ',' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1713:1: ( ( ',' )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1714:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getCommaKeyword_4_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1715:1: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1716:2: ','
                    {
                    match(input,31,FOLLOW_31_in_rule__Action__Group_4_1__1__Impl3605); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1731:1: rule__Emission__Group__0 : rule__Emission__Group__0__Impl rule__Emission__Group__1 ;
    public final void rule__Emission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1735:1: ( rule__Emission__Group__0__Impl rule__Emission__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1736:2: rule__Emission__Group__0__Impl rule__Emission__Group__1
            {
            pushFollow(FOLLOW_rule__Emission__Group__0__Impl_in_rule__Emission__Group__03642);
            rule__Emission__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03645);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1743:1: rule__Emission__Group__0__Impl : ( ( rule__Emission__SignalAssignment_0 ) ) ;
    public final void rule__Emission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1747:1: ( ( ( rule__Emission__SignalAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1748:1: ( ( rule__Emission__SignalAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1748:1: ( ( rule__Emission__SignalAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1749:1: ( rule__Emission__SignalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1750:1: ( rule__Emission__SignalAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1750:2: rule__Emission__SignalAssignment_0
            {
            pushFollow(FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__0__Impl3672);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1760:1: rule__Emission__Group__1 : rule__Emission__Group__1__Impl ;
    public final void rule__Emission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1764:1: ( rule__Emission__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1765:2: rule__Emission__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group__1__Impl_in_rule__Emission__Group__13702);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1771:1: rule__Emission__Group__1__Impl : ( ( rule__Emission__Alternatives_1 )? ) ;
    public final void rule__Emission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1775:1: ( ( ( rule__Emission__Alternatives_1 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1776:1: ( ( rule__Emission__Alternatives_1 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1776:1: ( ( rule__Emission__Alternatives_1 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1777:1: ( rule__Emission__Alternatives_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1778:1: ( rule__Emission__Alternatives_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1778:2: rule__Emission__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Emission__Alternatives_1_in_rule__Emission__Group__1__Impl3729);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1792:1: rule__Emission__Group_1_0__0 : rule__Emission__Group_1_0__0__Impl rule__Emission__Group_1_0__1 ;
    public final void rule__Emission__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1796:1: ( rule__Emission__Group_1_0__0__Impl rule__Emission__Group_1_0__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1797:2: rule__Emission__Group_1_0__0__Impl rule__Emission__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_0__0__Impl_in_rule__Emission__Group_1_0__03764);
            rule__Emission__Group_1_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_0__1_in_rule__Emission__Group_1_0__03767);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1804:1: rule__Emission__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__Emission__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1808:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1809:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1809:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1810:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Emission__Group_1_0__0__Impl3795); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1823:1: rule__Emission__Group_1_0__1 : rule__Emission__Group_1_0__1__Impl rule__Emission__Group_1_0__2 ;
    public final void rule__Emission__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1827:1: ( rule__Emission__Group_1_0__1__Impl rule__Emission__Group_1_0__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1828:2: rule__Emission__Group_1_0__1__Impl rule__Emission__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_0__1__Impl_in_rule__Emission__Group_1_0__13826);
            rule__Emission__Group_1_0__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_0__2_in_rule__Emission__Group_1_0__13829);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1835:1: rule__Emission__Group_1_0__1__Impl : ( ( rule__Emission__NewValueAssignment_1_0_1 ) ) ;
    public final void rule__Emission__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1839:1: ( ( ( rule__Emission__NewValueAssignment_1_0_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1840:1: ( ( rule__Emission__NewValueAssignment_1_0_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1840:1: ( ( rule__Emission__NewValueAssignment_1_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1841:1: ( rule__Emission__NewValueAssignment_1_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_0_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1842:1: ( rule__Emission__NewValueAssignment_1_0_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1842:2: rule__Emission__NewValueAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_0_1_in_rule__Emission__Group_1_0__1__Impl3856);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1852:1: rule__Emission__Group_1_0__2 : rule__Emission__Group_1_0__2__Impl ;
    public final void rule__Emission__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1856:1: ( rule__Emission__Group_1_0__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1857:2: rule__Emission__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_0__2__Impl_in_rule__Emission__Group_1_0__23886);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1863:1: rule__Emission__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__Emission__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1867:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1868:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1868:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1869:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_0_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__Emission__Group_1_0__2__Impl3914); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1888:1: rule__Emission__Group_1_1__0 : rule__Emission__Group_1_1__0__Impl rule__Emission__Group_1_1__1 ;
    public final void rule__Emission__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1892:1: ( rule__Emission__Group_1_1__0__Impl rule__Emission__Group_1_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1893:2: rule__Emission__Group_1_1__0__Impl rule__Emission__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_1__0__Impl_in_rule__Emission__Group_1_1__03951);
            rule__Emission__Group_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_1__1_in_rule__Emission__Group_1_1__03954);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1900:1: rule__Emission__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__Emission__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1904:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1905:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1905:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1906:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Emission__Group_1_1__0__Impl3982); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1919:1: rule__Emission__Group_1_1__1 : rule__Emission__Group_1_1__1__Impl rule__Emission__Group_1_1__2 ;
    public final void rule__Emission__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1923:1: ( rule__Emission__Group_1_1__1__Impl rule__Emission__Group_1_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1924:2: rule__Emission__Group_1_1__1__Impl rule__Emission__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_1__1__Impl_in_rule__Emission__Group_1_1__14013);
            rule__Emission__Group_1_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_1__2_in_rule__Emission__Group_1_1__14016);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1931:1: rule__Emission__Group_1_1__1__Impl : ( ( rule__Emission__NewValueAssignment_1_1_1 ) ) ;
    public final void rule__Emission__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1935:1: ( ( ( rule__Emission__NewValueAssignment_1_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1936:1: ( ( rule__Emission__NewValueAssignment_1_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1936:1: ( ( rule__Emission__NewValueAssignment_1_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1937:1: ( rule__Emission__NewValueAssignment_1_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1938:1: ( rule__Emission__NewValueAssignment_1_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1938:2: rule__Emission__NewValueAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_1_1_in_rule__Emission__Group_1_1__1__Impl4043);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1948:1: rule__Emission__Group_1_1__2 : rule__Emission__Group_1_1__2__Impl ;
    public final void rule__Emission__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1952:1: ( rule__Emission__Group_1_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1953:2: rule__Emission__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_1__2__Impl_in_rule__Emission__Group_1_1__24073);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1959:1: rule__Emission__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__Emission__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1963:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1964:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1964:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1965:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_1_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__Emission__Group_1_1__2__Impl4101); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1984:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1988:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1989:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04138);
            rule__Assignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04141);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1996:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariableAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2000:1: ( ( ( rule__Assignment__VariableAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2001:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2001:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2002:1: ( rule__Assignment__VariableAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2003:1: ( rule__Assignment__VariableAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2003:2: rule__Assignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl4168);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2013:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2017:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2018:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14198);
            rule__Assignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14201);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2025:1: rule__Assignment__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2029:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2030:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2030:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2031:1: ':='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Assignment__Group__1__Impl4229); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2044:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2048:1: ( rule__Assignment__Group__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2049:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24260);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2055:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__Alternatives_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2059:1: ( ( ( rule__Assignment__Alternatives_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2060:1: ( ( rule__Assignment__Alternatives_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2060:1: ( ( rule__Assignment__Alternatives_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2061:1: ( rule__Assignment__Alternatives_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2062:1: ( rule__Assignment__Alternatives_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2062:2: rule__Assignment__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Assignment__Alternatives_2_in_rule__Assignment__Group__2__Impl4287);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2078:1: rule__TextEffect__Group__0 : rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1 ;
    public final void rule__TextEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2082:1: ( rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2083:2: rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1
            {
            pushFollow(FOLLOW_rule__TextEffect__Group__0__Impl_in_rule__TextEffect__Group__04323);
            rule__TextEffect__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group__1_in_rule__TextEffect__Group__04326);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2090:1: rule__TextEffect__Group__0__Impl : ( ( rule__TextEffect__CodeAssignment_0 ) ) ;
    public final void rule__TextEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2094:1: ( ( ( rule__TextEffect__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2095:1: ( ( rule__TextEffect__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2095:1: ( ( rule__TextEffect__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2096:1: ( rule__TextEffect__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2097:1: ( rule__TextEffect__CodeAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2097:2: rule__TextEffect__CodeAssignment_0
            {
            pushFollow(FOLLOW_rule__TextEffect__CodeAssignment_0_in_rule__TextEffect__Group__0__Impl4353);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2107:1: rule__TextEffect__Group__1 : rule__TextEffect__Group__1__Impl ;
    public final void rule__TextEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2111:1: ( rule__TextEffect__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2112:2: rule__TextEffect__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextEffect__Group__1__Impl_in_rule__TextEffect__Group__14383);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2118:1: rule__TextEffect__Group__1__Impl : ( ( rule__TextEffect__Group_1__0 )? ) ;
    public final void rule__TextEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2122:1: ( ( ( rule__TextEffect__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2123:1: ( ( rule__TextEffect__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2123:1: ( ( rule__TextEffect__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2124:1: ( rule__TextEffect__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2125:1: ( rule__TextEffect__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2125:2: rule__TextEffect__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextEffect__Group_1__0_in_rule__TextEffect__Group__1__Impl4410);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2139:1: rule__TextEffect__Group_1__0 : rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1 ;
    public final void rule__TextEffect__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2143:1: ( rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2144:2: rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__0__Impl_in_rule__TextEffect__Group_1__04445);
            rule__TextEffect__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group_1__1_in_rule__TextEffect__Group_1__04448);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2151:1: rule__TextEffect__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextEffect__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2155:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2156:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2156:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2157:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__TextEffect__Group_1__0__Impl4476); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2170:1: rule__TextEffect__Group_1__1 : rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2 ;
    public final void rule__TextEffect__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2174:1: ( rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2175:2: rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__1__Impl_in_rule__TextEffect__Group_1__14507);
            rule__TextEffect__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group_1__2_in_rule__TextEffect__Group_1__14510);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2182:1: rule__TextEffect__Group_1__1__Impl : ( ( rule__TextEffect__TypeAssignment_1_1 ) ) ;
    public final void rule__TextEffect__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2186:1: ( ( ( rule__TextEffect__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2187:1: ( ( rule__TextEffect__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2187:1: ( ( rule__TextEffect__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2188:1: ( rule__TextEffect__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2189:1: ( rule__TextEffect__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2189:2: rule__TextEffect__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TextEffect__TypeAssignment_1_1_in_rule__TextEffect__Group_1__1__Impl4537);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2199:1: rule__TextEffect__Group_1__2 : rule__TextEffect__Group_1__2__Impl ;
    public final void rule__TextEffect__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2203:1: ( rule__TextEffect__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2204:2: rule__TextEffect__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__2__Impl_in_rule__TextEffect__Group_1__24567);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2210:1: rule__TextEffect__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextEffect__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2214:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2215:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2215:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2216:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__TextEffect__Group_1__2__Impl4595); if (failed) return ;
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


    // $ANTLR start rule__OrExpression__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2235:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2239:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2240:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04632);
            rule__OrExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04635);
            rule__OrExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group__0


    // $ANTLR start rule__OrExpression__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2247:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2251:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2252:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2252:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2253:1: ruleAndExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl4662);
            ruleAndExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group__0__Impl


    // $ANTLR start rule__OrExpression__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2264:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2268:1: ( rule__OrExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2269:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14691);
            rule__OrExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group__1


    // $ANTLR start rule__OrExpression__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2275:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2279:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2280:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2280:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2281:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2282:1: ( rule__OrExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==12) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2282:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4718);
            	    rule__OrExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group__1__Impl


    // $ANTLR start rule__OrExpression__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2296:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2300:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2301:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04753);
            rule__OrExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04756);
            rule__OrExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group_1__0


    // $ANTLR start rule__OrExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2308:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2312:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2313:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2313:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2314:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2315:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2317:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group_1__0__Impl


    // $ANTLR start rule__OrExpression__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2327:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2331:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2332:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14814);
            rule__OrExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__14817);
            rule__OrExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group_1__1


    // $ANTLR start rule__OrExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2339:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2343:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2344:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2344:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2345:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2346:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2346:2: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl4844);
            rule__OrExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group_1__1__Impl


    // $ANTLR start rule__OrExpression__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2356:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2360:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2361:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__24874);
            rule__OrExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group_1__2


    // $ANTLR start rule__OrExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2367:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2371:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2372:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2372:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2373:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2374:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2374:2: rule__OrExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl4901);
            rule__OrExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group_1__2__Impl


    // $ANTLR start rule__AndExpression__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2390:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2394:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2395:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__04937);
            rule__AndExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__04940);
            rule__AndExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group__0


    // $ANTLR start rule__AndExpression__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2402:1: rule__AndExpression__Group__0__Impl : ( ruleNotExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2406:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2407:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2407:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2408:1: ruleNotExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getNotExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_rule__AndExpression__Group__0__Impl4967);
            ruleNotExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getNotExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group__0__Impl


    // $ANTLR start rule__AndExpression__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2419:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2423:1: ( rule__AndExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2424:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__14996);
            rule__AndExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group__1


    // $ANTLR start rule__AndExpression__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2430:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2434:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2435:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2435:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2436:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2437:1: ( rule__AndExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2437:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl5023);
            	    rule__AndExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group__1__Impl


    // $ANTLR start rule__AndExpression__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2451:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2455:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2456:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__05058);
            rule__AndExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__05061);
            rule__AndExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group_1__0


    // $ANTLR start rule__AndExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2463:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2467:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2468:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2468:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2469:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2470:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2472:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group_1__0__Impl


    // $ANTLR start rule__AndExpression__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2482:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2486:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2487:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__15119);
            rule__AndExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__15122);
            rule__AndExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group_1__1


    // $ANTLR start rule__AndExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2494:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2498:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2499:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2499:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2500:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2501:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2501:2: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl5149);
            rule__AndExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group_1__1__Impl


    // $ANTLR start rule__AndExpression__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2511:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2515:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2516:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__25179);
            rule__AndExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group_1__2


    // $ANTLR start rule__AndExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2522:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2526:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2527:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2527:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2528:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2529:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2529:2: rule__AndExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl5206);
            rule__AndExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group_1__2__Impl


    // $ANTLR start rule__NotExpression__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2545:1: rule__NotExpression__Group_1__0 : rule__NotExpression__Group_1__0__Impl rule__NotExpression__Group_1__1 ;
    public final void rule__NotExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2549:1: ( rule__NotExpression__Group_1__0__Impl rule__NotExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2550:2: rule__NotExpression__Group_1__0__Impl rule__NotExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__NotExpression__Group_1__0__Impl_in_rule__NotExpression__Group_1__05242);
            rule__NotExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__NotExpression__Group_1__1_in_rule__NotExpression__Group_1__05245);
            rule__NotExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_1__0


    // $ANTLR start rule__NotExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2557:1: rule__NotExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2561:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2562:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2562:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2563:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2564:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2566:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_1__0__Impl


    // $ANTLR start rule__NotExpression__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2576:1: rule__NotExpression__Group_1__1 : rule__NotExpression__Group_1__1__Impl rule__NotExpression__Group_1__2 ;
    public final void rule__NotExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2580:1: ( rule__NotExpression__Group_1__1__Impl rule__NotExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2581:2: rule__NotExpression__Group_1__1__Impl rule__NotExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__NotExpression__Group_1__1__Impl_in_rule__NotExpression__Group_1__15303);
            rule__NotExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__NotExpression__Group_1__2_in_rule__NotExpression__Group_1__15306);
            rule__NotExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_1__1


    // $ANTLR start rule__NotExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2588:1: rule__NotExpression__Group_1__1__Impl : ( ( rule__NotExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__NotExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2592:1: ( ( ( rule__NotExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2593:1: ( ( rule__NotExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2593:1: ( ( rule__NotExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2594:1: ( rule__NotExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2595:1: ( rule__NotExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2595:2: rule__NotExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NotExpression__OperatorAssignment_1_1_in_rule__NotExpression__Group_1__1__Impl5333);
            rule__NotExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_1__1__Impl


    // $ANTLR start rule__NotExpression__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2605:1: rule__NotExpression__Group_1__2 : rule__NotExpression__Group_1__2__Impl ;
    public final void rule__NotExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2609:1: ( rule__NotExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2610:2: rule__NotExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NotExpression__Group_1__2__Impl_in_rule__NotExpression__Group_1__25363);
            rule__NotExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_1__2


    // $ANTLR start rule__NotExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2616:1: rule__NotExpression__Group_1__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__NotExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2620:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2621:1: ( ( rule__NotExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2621:1: ( ( rule__NotExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2622:1: ( rule__NotExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2623:1: ( rule__NotExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2623:2: rule__NotExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__NotExpression__SubExpressionsAssignment_1_2_in_rule__NotExpression__Group_1__2__Impl5390);
            rule__NotExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_1__2__Impl


    // $ANTLR start rule__AtomicExpression__Group_2__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2639:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2643:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2644:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__05426);
            rule__AtomicExpression__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__05429);
            rule__AtomicExpression__Group_2__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__0


    // $ANTLR start rule__AtomicExpression__Group_2__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2651:1: rule__AtomicExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2655:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2656:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2656:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2657:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getOperatorExpressionAction_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2658:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2660:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getOperatorExpressionAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__0__Impl


    // $ANTLR start rule__AtomicExpression__Group_2__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2670:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2674:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2675:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__15487);
            rule__AtomicExpression__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__15490);
            rule__AtomicExpression__Group_2__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__1


    // $ANTLR start rule__AtomicExpression__Group_2__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2682:1: rule__AtomicExpression__Group_2__1__Impl : ( ( rule__AtomicExpression__OperatorAssignment_2_1 ) ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2686:1: ( ( ( rule__AtomicExpression__OperatorAssignment_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2687:1: ( ( rule__AtomicExpression__OperatorAssignment_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2687:1: ( ( rule__AtomicExpression__OperatorAssignment_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2688:1: ( rule__AtomicExpression__OperatorAssignment_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getOperatorAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2689:1: ( rule__AtomicExpression__OperatorAssignment_2_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2689:2: rule__AtomicExpression__OperatorAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AtomicExpression__OperatorAssignment_2_1_in_rule__AtomicExpression__Group_2__1__Impl5517);
            rule__AtomicExpression__OperatorAssignment_2_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getOperatorAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__1__Impl


    // $ANTLR start rule__AtomicExpression__Group_2__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2699:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl rule__AtomicExpression__Group_2__3 ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2703:1: ( rule__AtomicExpression__Group_2__2__Impl rule__AtomicExpression__Group_2__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2704:2: rule__AtomicExpression__Group_2__2__Impl rule__AtomicExpression__Group_2__3
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__25547);
            rule__AtomicExpression__Group_2__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__3_in_rule__AtomicExpression__Group_2__25550);
            rule__AtomicExpression__Group_2__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__2


    // $ANTLR start rule__AtomicExpression__Group_2__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2711:1: rule__AtomicExpression__Group_2__2__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2715:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2716:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2716:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2717:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicExpression__Group_2__2__Impl5578); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__2__Impl


    // $ANTLR start rule__AtomicExpression__Group_2__3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2730:1: rule__AtomicExpression__Group_2__3 : rule__AtomicExpression__Group_2__3__Impl rule__AtomicExpression__Group_2__4 ;
    public final void rule__AtomicExpression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2734:1: ( rule__AtomicExpression__Group_2__3__Impl rule__AtomicExpression__Group_2__4 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2735:2: rule__AtomicExpression__Group_2__3__Impl rule__AtomicExpression__Group_2__4
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__3__Impl_in_rule__AtomicExpression__Group_2__35609);
            rule__AtomicExpression__Group_2__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__4_in_rule__AtomicExpression__Group_2__35612);
            rule__AtomicExpression__Group_2__4();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__3


    // $ANTLR start rule__AtomicExpression__Group_2__3__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2742:1: rule__AtomicExpression__Group_2__3__Impl : ( ( rule__AtomicExpression__SubExpressionsAssignment_2_3 ) ) ;
    public final void rule__AtomicExpression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2746:1: ( ( ( rule__AtomicExpression__SubExpressionsAssignment_2_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2747:1: ( ( rule__AtomicExpression__SubExpressionsAssignment_2_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2747:1: ( ( rule__AtomicExpression__SubExpressionsAssignment_2_3 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2748:1: ( rule__AtomicExpression__SubExpressionsAssignment_2_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getSubExpressionsAssignment_2_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2749:1: ( rule__AtomicExpression__SubExpressionsAssignment_2_3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2749:2: rule__AtomicExpression__SubExpressionsAssignment_2_3
            {
            pushFollow(FOLLOW_rule__AtomicExpression__SubExpressionsAssignment_2_3_in_rule__AtomicExpression__Group_2__3__Impl5639);
            rule__AtomicExpression__SubExpressionsAssignment_2_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getSubExpressionsAssignment_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__3__Impl


    // $ANTLR start rule__AtomicExpression__Group_2__4
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2759:1: rule__AtomicExpression__Group_2__4 : rule__AtomicExpression__Group_2__4__Impl ;
    public final void rule__AtomicExpression__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2763:1: ( rule__AtomicExpression__Group_2__4__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2764:2: rule__AtomicExpression__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__4__Impl_in_rule__AtomicExpression__Group_2__45669);
            rule__AtomicExpression__Group_2__4__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__4


    // $ANTLR start rule__AtomicExpression__Group_2__4__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2770:1: rule__AtomicExpression__Group_2__4__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2774:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2775:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2775:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2776:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__AtomicExpression__Group_2__4__Impl5697); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__4__Impl


    // $ANTLR start rule__AtomicExpression__Group_3__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2799:1: rule__AtomicExpression__Group_3__0 : rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 ;
    public final void rule__AtomicExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2803:1: ( rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2804:2: rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_3__0__Impl_in_rule__AtomicExpression__Group_3__05738);
            rule__AtomicExpression__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_3__1_in_rule__AtomicExpression__Group_3__05741);
            rule__AtomicExpression__Group_3__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_3__0


    // $ANTLR start rule__AtomicExpression__Group_3__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2811:1: rule__AtomicExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2815:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2816:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2816:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2817:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicExpression__Group_3__0__Impl5769); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_3__0__Impl


    // $ANTLR start rule__AtomicExpression__Group_3__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2830:1: rule__AtomicExpression__Group_3__1 : rule__AtomicExpression__Group_3__1__Impl rule__AtomicExpression__Group_3__2 ;
    public final void rule__AtomicExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2834:1: ( rule__AtomicExpression__Group_3__1__Impl rule__AtomicExpression__Group_3__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2835:2: rule__AtomicExpression__Group_3__1__Impl rule__AtomicExpression__Group_3__2
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_3__1__Impl_in_rule__AtomicExpression__Group_3__15800);
            rule__AtomicExpression__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_3__2_in_rule__AtomicExpression__Group_3__15803);
            rule__AtomicExpression__Group_3__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_3__1


    // $ANTLR start rule__AtomicExpression__Group_3__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2842:1: rule__AtomicExpression__Group_3__1__Impl : ( ruleCompareOperation ) ;
    public final void rule__AtomicExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2846:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2847:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2847:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2848:1: ruleCompareOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getCompareOperationParserRuleCall_3_1()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_rule__AtomicExpression__Group_3__1__Impl5830);
            ruleCompareOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getCompareOperationParserRuleCall_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_3__1__Impl


    // $ANTLR start rule__AtomicExpression__Group_3__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2859:1: rule__AtomicExpression__Group_3__2 : rule__AtomicExpression__Group_3__2__Impl ;
    public final void rule__AtomicExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2863:1: ( rule__AtomicExpression__Group_3__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2864:2: rule__AtomicExpression__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_3__2__Impl_in_rule__AtomicExpression__Group_3__25859);
            rule__AtomicExpression__Group_3__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_3__2


    // $ANTLR start rule__AtomicExpression__Group_3__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2870:1: rule__AtomicExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2874:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2875:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2875:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2876:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__AtomicExpression__Group_3__2__Impl5887); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_3__2__Impl


    // $ANTLR start rule__AtomicExpression__Group_4__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2895:1: rule__AtomicExpression__Group_4__0 : rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1 ;
    public final void rule__AtomicExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2899:1: ( rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2900:2: rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_4__0__Impl_in_rule__AtomicExpression__Group_4__05924);
            rule__AtomicExpression__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_4__1_in_rule__AtomicExpression__Group_4__05927);
            rule__AtomicExpression__Group_4__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_4__0


    // $ANTLR start rule__AtomicExpression__Group_4__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2907:1: rule__AtomicExpression__Group_4__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2911:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2912:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2912:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2913:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicExpression__Group_4__0__Impl5955); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_4__0__Impl


    // $ANTLR start rule__AtomicExpression__Group_4__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2926:1: rule__AtomicExpression__Group_4__1 : rule__AtomicExpression__Group_4__1__Impl rule__AtomicExpression__Group_4__2 ;
    public final void rule__AtomicExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2930:1: ( rule__AtomicExpression__Group_4__1__Impl rule__AtomicExpression__Group_4__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2931:2: rule__AtomicExpression__Group_4__1__Impl rule__AtomicExpression__Group_4__2
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_4__1__Impl_in_rule__AtomicExpression__Group_4__15986);
            rule__AtomicExpression__Group_4__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_4__2_in_rule__AtomicExpression__Group_4__15989);
            rule__AtomicExpression__Group_4__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_4__1


    // $ANTLR start rule__AtomicExpression__Group_4__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2938:1: rule__AtomicExpression__Group_4__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__AtomicExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2942:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2943:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2943:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2944:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_4_1()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_4__1__Impl6016);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_4__1__Impl


    // $ANTLR start rule__AtomicExpression__Group_4__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2955:1: rule__AtomicExpression__Group_4__2 : rule__AtomicExpression__Group_4__2__Impl ;
    public final void rule__AtomicExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2959:1: ( rule__AtomicExpression__Group_4__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2960:2: rule__AtomicExpression__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_4__2__Impl_in_rule__AtomicExpression__Group_4__26045);
            rule__AtomicExpression__Group_4__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_4__2


    // $ANTLR start rule__AtomicExpression__Group_4__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2966:1: rule__AtomicExpression__Group_4__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2970:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2971:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2971:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2972:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__AtomicExpression__Group_4__2__Impl6073); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_4__2__Impl


    // $ANTLR start rule__CompareOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2991:1: rule__CompareOperation__Group__0 : rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2995:1: ( rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2996:2: rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group__0__Impl_in_rule__CompareOperation__Group__06110);
            rule__CompareOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__06113);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3003:1: rule__CompareOperation__Group__0__Impl : ( ruleValuedExpression ) ;
    public final void rule__CompareOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3007:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3008:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3008:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3009:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__CompareOperation__Group__0__Impl6140);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3020:1: rule__CompareOperation__Group__1 : rule__CompareOperation__Group__1__Impl ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3024:1: ( rule__CompareOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3025:2: rule__CompareOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group__1__Impl_in_rule__CompareOperation__Group__16169);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3031:1: rule__CompareOperation__Group__1__Impl : ( ( rule__CompareOperation__Group_1__0 ) ) ;
    public final void rule__CompareOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3035:1: ( ( ( rule__CompareOperation__Group_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3036:1: ( ( rule__CompareOperation__Group_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3036:1: ( ( rule__CompareOperation__Group_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3037:1: ( rule__CompareOperation__Group_1__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3038:1: ( rule__CompareOperation__Group_1__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3038:2: rule__CompareOperation__Group_1__0
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__1__Impl6196);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3052:1: rule__CompareOperation__Group_1__0 : rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3056:1: ( rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3057:2: rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__0__Impl_in_rule__CompareOperation__Group_1__06230);
            rule__CompareOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__06233);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3064:1: rule__CompareOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3068:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3069:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3069:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3070:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3071:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3073:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3083:1: rule__CompareOperation__Group_1__1 : rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3087:1: ( rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3088:2: rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__1__Impl_in_rule__CompareOperation__Group_1__16291);
            rule__CompareOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__16294);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3095:1: rule__CompareOperation__Group_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompareOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3099:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3100:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3100:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3101:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3102:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3102:2: rule__CompareOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__1__Impl6321);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3112:1: rule__CompareOperation__Group_1__2 : rule__CompareOperation__Group_1__2__Impl ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3116:1: ( rule__CompareOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3117:2: rule__CompareOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__2__Impl_in_rule__CompareOperation__Group_1__26351);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3123:1: rule__CompareOperation__Group_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3127:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3128:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3128:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3129:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3130:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3130:2: rule__CompareOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__2__Impl6378);
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


    // $ANTLR start rule__AddExpression__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3146:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3150:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3151:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__06414);
            rule__AddExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__06417);
            rule__AddExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group__0


    // $ANTLR start rule__AddExpression__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3158:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3162:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3163:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3163:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3164:1: ruleSubExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl6444);
            ruleSubExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group__0__Impl


    // $ANTLR start rule__AddExpression__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3175:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3179:1: ( rule__AddExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3180:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__16473);
            rule__AddExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group__1


    // $ANTLR start rule__AddExpression__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3186:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3190:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3191:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3191:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3192:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3193:1: ( rule__AddExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3193:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl6500);
            	    rule__AddExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group__1__Impl


    // $ANTLR start rule__AddExpression__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3207:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3211:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3212:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__06535);
            rule__AddExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__06538);
            rule__AddExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group_1__0


    // $ANTLR start rule__AddExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3219:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3223:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3224:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3224:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3225:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3226:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3228:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group_1__0__Impl


    // $ANTLR start rule__AddExpression__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3238:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3242:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3243:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__16596);
            rule__AddExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__16599);
            rule__AddExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group_1__1


    // $ANTLR start rule__AddExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3250:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3254:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3255:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3255:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3256:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3257:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3257:2: rule__AddExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl6626);
            rule__AddExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group_1__1__Impl


    // $ANTLR start rule__AddExpression__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3267:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3271:1: ( rule__AddExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3272:2: rule__AddExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__26656);
            rule__AddExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group_1__2


    // $ANTLR start rule__AddExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3278:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3282:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3283:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3283:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3284:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3285:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3285:2: rule__AddExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl6683);
            rule__AddExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group_1__2__Impl


    // $ANTLR start rule__SubExpression__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3301:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3305:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3306:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__06719);
            rule__SubExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__06722);
            rule__SubExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group__0


    // $ANTLR start rule__SubExpression__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3313:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3317:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3318:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3318:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3319:1: ruleMultExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl6749);
            ruleMultExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group__0__Impl


    // $ANTLR start rule__SubExpression__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3330:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3334:1: ( rule__SubExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3335:2: rule__SubExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__16778);
            rule__SubExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group__1


    // $ANTLR start rule__SubExpression__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3341:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3345:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3346:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3346:1: ( ( rule__SubExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3347:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3348:1: ( rule__SubExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3348:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl6805);
            	    rule__SubExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group__1__Impl


    // $ANTLR start rule__SubExpression__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3362:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3366:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3367:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__06840);
            rule__SubExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__06843);
            rule__SubExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group_1__0


    // $ANTLR start rule__SubExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3374:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3378:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3379:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3379:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3380:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3381:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3383:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group_1__0__Impl


    // $ANTLR start rule__SubExpression__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3393:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3397:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3398:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__16901);
            rule__SubExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__16904);
            rule__SubExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group_1__1


    // $ANTLR start rule__SubExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3405:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3409:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3410:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3410:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3411:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3412:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3412:2: rule__SubExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl6931);
            rule__SubExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group_1__1__Impl


    // $ANTLR start rule__SubExpression__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3422:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3426:1: ( rule__SubExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3427:2: rule__SubExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__26961);
            rule__SubExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group_1__2


    // $ANTLR start rule__SubExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3433:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3437:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3438:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3438:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3439:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3440:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3440:2: rule__SubExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl6988);
            rule__SubExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group_1__2__Impl


    // $ANTLR start rule__MultExpression__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3456:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3460:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3461:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__07024);
            rule__MultExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__07027);
            rule__MultExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group__0


    // $ANTLR start rule__MultExpression__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3468:1: rule__MultExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3472:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3473:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3473:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3474:1: ruleModExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getModExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_rule__MultExpression__Group__0__Impl7054);
            ruleModExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getModExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group__0__Impl


    // $ANTLR start rule__MultExpression__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3485:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3489:1: ( rule__MultExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3490:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__17083);
            rule__MultExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group__1


    // $ANTLR start rule__MultExpression__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3496:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3500:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3501:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3501:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3502:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3503:1: ( rule__MultExpression__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3503:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl7110);
            	    rule__MultExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group__1__Impl


    // $ANTLR start rule__MultExpression__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3517:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3521:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3522:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__07145);
            rule__MultExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__07148);
            rule__MultExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group_1__0


    // $ANTLR start rule__MultExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3529:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3533:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3534:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3534:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3535:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3536:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3538:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group_1__0__Impl


    // $ANTLR start rule__MultExpression__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3548:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3552:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3553:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__17206);
            rule__MultExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__17209);
            rule__MultExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group_1__1


    // $ANTLR start rule__MultExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3560:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3564:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3565:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3565:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3566:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3567:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3567:2: rule__MultExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl7236);
            rule__MultExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group_1__1__Impl


    // $ANTLR start rule__MultExpression__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3577:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3581:1: ( rule__MultExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3582:2: rule__MultExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__27266);
            rule__MultExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group_1__2


    // $ANTLR start rule__MultExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3588:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3592:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3593:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3593:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3594:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3595:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3595:2: rule__MultExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl7293);
            rule__MultExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group_1__2__Impl


    // $ANTLR start rule__ModExpression__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3611:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3615:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3616:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__07329);
            rule__ModExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__07332);
            rule__ModExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group__0


    // $ANTLR start rule__ModExpression__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3623:1: rule__ModExpression__Group__0__Impl : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3627:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3628:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3628:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3629:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__Group__0__Impl7359);
            ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group__0__Impl


    // $ANTLR start rule__ModExpression__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3640:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3644:1: ( rule__ModExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3645:2: rule__ModExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__17388);
            rule__ModExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group__1


    // $ANTLR start rule__ModExpression__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3651:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3655:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3656:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3656:1: ( ( rule__ModExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3657:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3658:1: ( rule__ModExpression__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3658:2: rule__ModExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl7415);
                    rule__ModExpression__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group__1__Impl


    // $ANTLR start rule__ModExpression__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3672:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3676:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3677:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__07450);
            rule__ModExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__07453);
            rule__ModExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group_1__0


    // $ANTLR start rule__ModExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3684:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3688:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3689:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3689:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3690:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3691:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3693:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group_1__0__Impl


    // $ANTLR start rule__ModExpression__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3703:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3707:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3708:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__17511);
            rule__ModExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__17514);
            rule__ModExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group_1__1


    // $ANTLR start rule__ModExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3715:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3719:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3720:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3720:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3721:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3722:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3722:2: rule__ModExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl7541);
            rule__ModExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group_1__1__Impl


    // $ANTLR start rule__ModExpression__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3732:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3736:1: ( rule__ModExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3737:2: rule__ModExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__27571);
            rule__ModExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group_1__2


    // $ANTLR start rule__ModExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3743:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3747:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3748:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3748:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3749:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3750:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3750:2: rule__ModExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl7598);
            rule__ModExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group_1__2__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_5__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3766:1: rule__AtomicValuedExpression__Group_5__0 : rule__AtomicValuedExpression__Group_5__0__Impl rule__AtomicValuedExpression__Group_5__1 ;
    public final void rule__AtomicValuedExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3770:1: ( rule__AtomicValuedExpression__Group_5__0__Impl rule__AtomicValuedExpression__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3771:2: rule__AtomicValuedExpression__Group_5__0__Impl rule__AtomicValuedExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_5__0__Impl_in_rule__AtomicValuedExpression__Group_5__07634);
            rule__AtomicValuedExpression__Group_5__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_5__1_in_rule__AtomicValuedExpression__Group_5__07637);
            rule__AtomicValuedExpression__Group_5__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_5__0


    // $ANTLR start rule__AtomicValuedExpression__Group_5__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3778:1: rule__AtomicValuedExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3782:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3783:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3783:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3784:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicValuedExpression__Group_5__0__Impl7665); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_5__0__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_5__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3797:1: rule__AtomicValuedExpression__Group_5__1 : rule__AtomicValuedExpression__Group_5__1__Impl rule__AtomicValuedExpression__Group_5__2 ;
    public final void rule__AtomicValuedExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3801:1: ( rule__AtomicValuedExpression__Group_5__1__Impl rule__AtomicValuedExpression__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3802:2: rule__AtomicValuedExpression__Group_5__1__Impl rule__AtomicValuedExpression__Group_5__2
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_5__1__Impl_in_rule__AtomicValuedExpression__Group_5__17696);
            rule__AtomicValuedExpression__Group_5__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_5__2_in_rule__AtomicValuedExpression__Group_5__17699);
            rule__AtomicValuedExpression__Group_5__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_5__1


    // $ANTLR start rule__AtomicValuedExpression__Group_5__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3809:1: rule__AtomicValuedExpression__Group_5__1__Impl : ( ruleDivExpression ) ;
    public final void rule__AtomicValuedExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3813:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3814:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3814:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3815:1: ruleDivExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getDivExpressionParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_rule__AtomicValuedExpression__Group_5__1__Impl7726);
            ruleDivExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getDivExpressionParserRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_5__1__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_5__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3826:1: rule__AtomicValuedExpression__Group_5__2 : rule__AtomicValuedExpression__Group_5__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3830:1: ( rule__AtomicValuedExpression__Group_5__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3831:2: rule__AtomicValuedExpression__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_5__2__Impl_in_rule__AtomicValuedExpression__Group_5__27755);
            rule__AtomicValuedExpression__Group_5__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_5__2


    // $ANTLR start rule__AtomicValuedExpression__Group_5__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3837:1: rule__AtomicValuedExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3841:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3842:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3842:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3843:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__AtomicValuedExpression__Group_5__2__Impl7783); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_5__2__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_6__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3862:1: rule__AtomicValuedExpression__Group_6__0 : rule__AtomicValuedExpression__Group_6__0__Impl rule__AtomicValuedExpression__Group_6__1 ;
    public final void rule__AtomicValuedExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3866:1: ( rule__AtomicValuedExpression__Group_6__0__Impl rule__AtomicValuedExpression__Group_6__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3867:2: rule__AtomicValuedExpression__Group_6__0__Impl rule__AtomicValuedExpression__Group_6__1
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_6__0__Impl_in_rule__AtomicValuedExpression__Group_6__07820);
            rule__AtomicValuedExpression__Group_6__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_6__1_in_rule__AtomicValuedExpression__Group_6__07823);
            rule__AtomicValuedExpression__Group_6__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_6__0


    // $ANTLR start rule__AtomicValuedExpression__Group_6__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3874:1: rule__AtomicValuedExpression__Group_6__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3878:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3879:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3879:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3880:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicValuedExpression__Group_6__0__Impl7851); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_6__0__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_6__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3893:1: rule__AtomicValuedExpression__Group_6__1 : rule__AtomicValuedExpression__Group_6__1__Impl rule__AtomicValuedExpression__Group_6__2 ;
    public final void rule__AtomicValuedExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3897:1: ( rule__AtomicValuedExpression__Group_6__1__Impl rule__AtomicValuedExpression__Group_6__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3898:2: rule__AtomicValuedExpression__Group_6__1__Impl rule__AtomicValuedExpression__Group_6__2
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_6__1__Impl_in_rule__AtomicValuedExpression__Group_6__17882);
            rule__AtomicValuedExpression__Group_6__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_6__2_in_rule__AtomicValuedExpression__Group_6__17885);
            rule__AtomicValuedExpression__Group_6__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_6__1


    // $ANTLR start rule__AtomicValuedExpression__Group_6__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3905:1: rule__AtomicValuedExpression__Group_6__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3909:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3910:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3910:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3911:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_6_1()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_6__1__Impl7912);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_6__1__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_6__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3922:1: rule__AtomicValuedExpression__Group_6__2 : rule__AtomicValuedExpression__Group_6__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3926:1: ( rule__AtomicValuedExpression__Group_6__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3927:2: rule__AtomicValuedExpression__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_6__2__Impl_in_rule__AtomicValuedExpression__Group_6__27941);
            rule__AtomicValuedExpression__Group_6__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_6__2


    // $ANTLR start rule__AtomicValuedExpression__Group_6__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3933:1: rule__AtomicValuedExpression__Group_6__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3937:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3938:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3938:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3939:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__AtomicValuedExpression__Group_6__2__Impl7969); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_6__2__Impl


    // $ANTLR start rule__DivExpression__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3958:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3962:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3963:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__08006);
            rule__DivExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__08009);
            rule__DivExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__0


    // $ANTLR start rule__DivExpression__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3970:1: rule__DivExpression__Group__0__Impl : ( ruleAtomicValuedExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3974:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3975:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3975:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3976:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__Group__0__Impl8036);
            ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__0__Impl


    // $ANTLR start rule__DivExpression__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3987:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2 ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3991:1: ( rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3992:2: rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__18065);
            rule__DivExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivExpression__Group__2_in_rule__DivExpression__Group__18068);
            rule__DivExpression__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__1


    // $ANTLR start rule__DivExpression__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3999:1: rule__DivExpression__Group__1__Impl : ( () ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4003:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4004:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4004:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4005:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4006:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4008:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__1__Impl


    // $ANTLR start rule__DivExpression__Group__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4018:1: rule__DivExpression__Group__2 : rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3 ;
    public final void rule__DivExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4022:1: ( rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4023:2: rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__2__Impl_in_rule__DivExpression__Group__28126);
            rule__DivExpression__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivExpression__Group__3_in_rule__DivExpression__Group__28129);
            rule__DivExpression__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__2


    // $ANTLR start rule__DivExpression__Group__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4030:1: rule__DivExpression__Group__2__Impl : ( ( rule__DivExpression__OperatorAssignment_2 ) ) ;
    public final void rule__DivExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4034:1: ( ( ( rule__DivExpression__OperatorAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4035:1: ( ( rule__DivExpression__OperatorAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4035:1: ( ( rule__DivExpression__OperatorAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4036:1: ( rule__DivExpression__OperatorAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4037:1: ( rule__DivExpression__OperatorAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4037:2: rule__DivExpression__OperatorAssignment_2
            {
            pushFollow(FOLLOW_rule__DivExpression__OperatorAssignment_2_in_rule__DivExpression__Group__2__Impl8156);
            rule__DivExpression__OperatorAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getOperatorAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__2__Impl


    // $ANTLR start rule__DivExpression__Group__3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4047:1: rule__DivExpression__Group__3 : rule__DivExpression__Group__3__Impl ;
    public final void rule__DivExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4051:1: ( rule__DivExpression__Group__3__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4052:2: rule__DivExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__3__Impl_in_rule__DivExpression__Group__38186);
            rule__DivExpression__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__3


    // $ANTLR start rule__DivExpression__Group__3__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4058:1: rule__DivExpression__Group__3__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_3 ) ) ;
    public final void rule__DivExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4062:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4063:1: ( ( rule__DivExpression__SubExpressionsAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4063:1: ( ( rule__DivExpression__SubExpressionsAssignment_3 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4064:1: ( rule__DivExpression__SubExpressionsAssignment_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4065:1: ( rule__DivExpression__SubExpressionsAssignment_3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4065:2: rule__DivExpression__SubExpressionsAssignment_3
            {
            pushFollow(FOLLOW_rule__DivExpression__SubExpressionsAssignment_3_in_rule__DivExpression__Group__3__Impl8213);
            rule__DivExpression__SubExpressionsAssignment_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__3__Impl


    // $ANTLR start rule__ValueTestExpression__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4083:1: rule__ValueTestExpression__Group__0 : rule__ValueTestExpression__Group__0__Impl rule__ValueTestExpression__Group__1 ;
    public final void rule__ValueTestExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4087:1: ( rule__ValueTestExpression__Group__0__Impl rule__ValueTestExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4088:2: rule__ValueTestExpression__Group__0__Impl rule__ValueTestExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__0__Impl_in_rule__ValueTestExpression__Group__08251);
            rule__ValueTestExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__1_in_rule__ValueTestExpression__Group__08254);
            rule__ValueTestExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__0


    // $ANTLR start rule__ValueTestExpression__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4095:1: rule__ValueTestExpression__Group__0__Impl : ( ( rule__ValueTestExpression__OperatorAssignment_0 ) ) ;
    public final void rule__ValueTestExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4099:1: ( ( ( rule__ValueTestExpression__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4100:1: ( ( rule__ValueTestExpression__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4100:1: ( ( rule__ValueTestExpression__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4101:1: ( rule__ValueTestExpression__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4102:1: ( rule__ValueTestExpression__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4102:2: rule__ValueTestExpression__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__ValueTestExpression__OperatorAssignment_0_in_rule__ValueTestExpression__Group__0__Impl8281);
            rule__ValueTestExpression__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionAccess().getOperatorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__0__Impl


    // $ANTLR start rule__ValueTestExpression__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4112:1: rule__ValueTestExpression__Group__1 : rule__ValueTestExpression__Group__1__Impl rule__ValueTestExpression__Group__2 ;
    public final void rule__ValueTestExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4116:1: ( rule__ValueTestExpression__Group__1__Impl rule__ValueTestExpression__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4117:2: rule__ValueTestExpression__Group__1__Impl rule__ValueTestExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__1__Impl_in_rule__ValueTestExpression__Group__18311);
            rule__ValueTestExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__2_in_rule__ValueTestExpression__Group__18314);
            rule__ValueTestExpression__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__1


    // $ANTLR start rule__ValueTestExpression__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4124:1: rule__ValueTestExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__ValueTestExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4128:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4129:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4129:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4130:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__ValueTestExpression__Group__1__Impl8342); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__1__Impl


    // $ANTLR start rule__ValueTestExpression__Group__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4143:1: rule__ValueTestExpression__Group__2 : rule__ValueTestExpression__Group__2__Impl rule__ValueTestExpression__Group__3 ;
    public final void rule__ValueTestExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4147:1: ( rule__ValueTestExpression__Group__2__Impl rule__ValueTestExpression__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4148:2: rule__ValueTestExpression__Group__2__Impl rule__ValueTestExpression__Group__3
            {
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__2__Impl_in_rule__ValueTestExpression__Group__28373);
            rule__ValueTestExpression__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__3_in_rule__ValueTestExpression__Group__28376);
            rule__ValueTestExpression__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__2


    // $ANTLR start rule__ValueTestExpression__Group__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4155:1: rule__ValueTestExpression__Group__2__Impl : ( ( rule__ValueTestExpression__SubExpressionsAssignment_2 ) ) ;
    public final void rule__ValueTestExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4159:1: ( ( ( rule__ValueTestExpression__SubExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4160:1: ( ( rule__ValueTestExpression__SubExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4160:1: ( ( rule__ValueTestExpression__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4161:1: ( rule__ValueTestExpression__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4162:1: ( rule__ValueTestExpression__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4162:2: rule__ValueTestExpression__SubExpressionsAssignment_2
            {
            pushFollow(FOLLOW_rule__ValueTestExpression__SubExpressionsAssignment_2_in_rule__ValueTestExpression__Group__2__Impl8403);
            rule__ValueTestExpression__SubExpressionsAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionAccess().getSubExpressionsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__2__Impl


    // $ANTLR start rule__ValueTestExpression__Group__3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4172:1: rule__ValueTestExpression__Group__3 : rule__ValueTestExpression__Group__3__Impl ;
    public final void rule__ValueTestExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4176:1: ( rule__ValueTestExpression__Group__3__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4177:2: rule__ValueTestExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__3__Impl_in_rule__ValueTestExpression__Group__38433);
            rule__ValueTestExpression__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__3


    // $ANTLR start rule__ValueTestExpression__Group__3__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4183:1: rule__ValueTestExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__ValueTestExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4187:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4188:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4188:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4189:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,33,FOLLOW_33_in_rule__ValueTestExpression__Group__3__Impl8461); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__3__Impl


    // $ANTLR start rule__PreValueTestExpression__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4210:1: rule__PreValueTestExpression__Group__0 : rule__PreValueTestExpression__Group__0__Impl rule__PreValueTestExpression__Group__1 ;
    public final void rule__PreValueTestExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4214:1: ( rule__PreValueTestExpression__Group__0__Impl rule__PreValueTestExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4215:2: rule__PreValueTestExpression__Group__0__Impl rule__PreValueTestExpression__Group__1
            {
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__0__Impl_in_rule__PreValueTestExpression__Group__08500);
            rule__PreValueTestExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__1_in_rule__PreValueTestExpression__Group__08503);
            rule__PreValueTestExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__0


    // $ANTLR start rule__PreValueTestExpression__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4222:1: rule__PreValueTestExpression__Group__0__Impl : ( ( rule__PreValueTestExpression__OperatorAssignment_0 ) ) ;
    public final void rule__PreValueTestExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4226:1: ( ( ( rule__PreValueTestExpression__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4227:1: ( ( rule__PreValueTestExpression__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4227:1: ( ( rule__PreValueTestExpression__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4228:1: ( rule__PreValueTestExpression__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4229:1: ( rule__PreValueTestExpression__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4229:2: rule__PreValueTestExpression__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__PreValueTestExpression__OperatorAssignment_0_in_rule__PreValueTestExpression__Group__0__Impl8530);
            rule__PreValueTestExpression__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionAccess().getOperatorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__0__Impl


    // $ANTLR start rule__PreValueTestExpression__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4239:1: rule__PreValueTestExpression__Group__1 : rule__PreValueTestExpression__Group__1__Impl rule__PreValueTestExpression__Group__2 ;
    public final void rule__PreValueTestExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4243:1: ( rule__PreValueTestExpression__Group__1__Impl rule__PreValueTestExpression__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4244:2: rule__PreValueTestExpression__Group__1__Impl rule__PreValueTestExpression__Group__2
            {
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__1__Impl_in_rule__PreValueTestExpression__Group__18560);
            rule__PreValueTestExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__2_in_rule__PreValueTestExpression__Group__18563);
            rule__PreValueTestExpression__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__1


    // $ANTLR start rule__PreValueTestExpression__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4251:1: rule__PreValueTestExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__PreValueTestExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4255:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4256:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4256:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4257:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__PreValueTestExpression__Group__1__Impl8591); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__1__Impl


    // $ANTLR start rule__PreValueTestExpression__Group__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4270:1: rule__PreValueTestExpression__Group__2 : rule__PreValueTestExpression__Group__2__Impl rule__PreValueTestExpression__Group__3 ;
    public final void rule__PreValueTestExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4274:1: ( rule__PreValueTestExpression__Group__2__Impl rule__PreValueTestExpression__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4275:2: rule__PreValueTestExpression__Group__2__Impl rule__PreValueTestExpression__Group__3
            {
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__2__Impl_in_rule__PreValueTestExpression__Group__28622);
            rule__PreValueTestExpression__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__3_in_rule__PreValueTestExpression__Group__28625);
            rule__PreValueTestExpression__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__2


    // $ANTLR start rule__PreValueTestExpression__Group__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4282:1: rule__PreValueTestExpression__Group__2__Impl : ( ( rule__PreValueTestExpression__SubExpressionsAssignment_2 ) ) ;
    public final void rule__PreValueTestExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4286:1: ( ( ( rule__PreValueTestExpression__SubExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4287:1: ( ( rule__PreValueTestExpression__SubExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4287:1: ( ( rule__PreValueTestExpression__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4288:1: ( rule__PreValueTestExpression__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4289:1: ( rule__PreValueTestExpression__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4289:2: rule__PreValueTestExpression__SubExpressionsAssignment_2
            {
            pushFollow(FOLLOW_rule__PreValueTestExpression__SubExpressionsAssignment_2_in_rule__PreValueTestExpression__Group__2__Impl8652);
            rule__PreValueTestExpression__SubExpressionsAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionAccess().getSubExpressionsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__2__Impl


    // $ANTLR start rule__PreValueTestExpression__Group__3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4299:1: rule__PreValueTestExpression__Group__3 : rule__PreValueTestExpression__Group__3__Impl ;
    public final void rule__PreValueTestExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4303:1: ( rule__PreValueTestExpression__Group__3__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4304:2: rule__PreValueTestExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__3__Impl_in_rule__PreValueTestExpression__Group__38682);
            rule__PreValueTestExpression__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__3


    // $ANTLR start rule__PreValueTestExpression__Group__3__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4310:1: rule__PreValueTestExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__PreValueTestExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4314:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4315:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4315:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4316:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,33,FOLLOW_33_in_rule__PreValueTestExpression__Group__3__Impl8710); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__3__Impl


    // $ANTLR start rule__TextExpression__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4337:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4341:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4342:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
            {
            pushFollow(FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__08749);
            rule__TextExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__08752);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4349:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4353:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4354:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4354:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4355:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4356:1: ( rule__TextExpression__CodeAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4356:2: rule__TextExpression__CodeAssignment_0
            {
            pushFollow(FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl8779);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4366:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4370:1: ( rule__TextExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4371:2: rule__TextExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__18809);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4377:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4381:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4382:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4382:1: ( ( rule__TextExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4383:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4384:1: ( rule__TextExpression__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4384:2: rule__TextExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl8836);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4398:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4402:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4403:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__08871);
            rule__TextExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__08874);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4410:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4414:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4415:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4415:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4416:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__TextExpression__Group_1__0__Impl8902); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4429:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4433:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4434:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__18933);
            rule__TextExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__18936);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4441:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4445:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4446:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4446:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4447:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4448:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4448:2: rule__TextExpression__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl8963);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4458:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4462:1: ( rule__TextExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4463:2: rule__TextExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__28993);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4469:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4473:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4474:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4474:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4475:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__TextExpression__Group_1__2__Impl9021); if (failed) return ;
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


    // $ANTLR start rule__EIntegerObject__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4494:1: rule__EIntegerObject__Group__0 : rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 ;
    public final void rule__EIntegerObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4498:1: ( rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4499:2: rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1
            {
            pushFollow(FOLLOW_rule__EIntegerObject__Group__0__Impl_in_rule__EIntegerObject__Group__09058);
            rule__EIntegerObject__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EIntegerObject__Group__1_in_rule__EIntegerObject__Group__09061);
            rule__EIntegerObject__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EIntegerObject__Group__0


    // $ANTLR start rule__EIntegerObject__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4506:1: rule__EIntegerObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EIntegerObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4510:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4511:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4511:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4512:1: ( '-' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4513:1: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4514:2: '-'
                    {
                    match(input,16,FOLLOW_16_in_rule__EIntegerObject__Group__0__Impl9090); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EIntegerObject__Group__0__Impl


    // $ANTLR start rule__EIntegerObject__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4525:1: rule__EIntegerObject__Group__1 : rule__EIntegerObject__Group__1__Impl ;
    public final void rule__EIntegerObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4529:1: ( rule__EIntegerObject__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4530:2: rule__EIntegerObject__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EIntegerObject__Group__1__Impl_in_rule__EIntegerObject__Group__19123);
            rule__EIntegerObject__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EIntegerObject__Group__1


    // $ANTLR start rule__EIntegerObject__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4536:1: rule__EIntegerObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EIntegerObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4540:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4541:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4541:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4542:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EIntegerObject__Group__1__Impl9150); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EIntegerObject__Group__1__Impl


    // $ANTLR start rule__EFloatObject__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4557:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4561:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4562:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__09183);
            rule__EFloatObject__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__09186);
            rule__EFloatObject__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__0


    // $ANTLR start rule__EFloatObject__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4569:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4573:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4574:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4574:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4575:1: ( '-' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4576:1: ( '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4577:2: '-'
                    {
                    match(input,16,FOLLOW_16_in_rule__EFloatObject__Group__0__Impl9215); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__0__Impl


    // $ANTLR start rule__EFloatObject__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4588:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4592:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4593:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__19248);
            rule__EFloatObject__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__19251);
            rule__EFloatObject__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__1


    // $ANTLR start rule__EFloatObject__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4600:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4604:1: ( ( ( RULE_INT )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4605:1: ( ( RULE_INT )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4605:1: ( ( RULE_INT )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4606:1: ( RULE_INT )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4607:1: ( RULE_INT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4607:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl9279); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__1__Impl


    // $ANTLR start rule__EFloatObject__Group__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4617:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4621:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4622:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__29310);
            rule__EFloatObject__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__29313);
            rule__EFloatObject__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__2


    // $ANTLR start rule__EFloatObject__Group__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4629:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4633:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4634:1: ( '.' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4634:1: ( '.' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4635:1: '.'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__EFloatObject__Group__2__Impl9341); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__2__Impl


    // $ANTLR start rule__EFloatObject__Group__3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4648:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl rule__EFloatObject__Group__4 ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4652:1: ( rule__EFloatObject__Group__3__Impl rule__EFloatObject__Group__4 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4653:2: rule__EFloatObject__Group__3__Impl rule__EFloatObject__Group__4
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__39372);
            rule__EFloatObject__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EFloatObject__Group__4_in_rule__EFloatObject__Group__39375);
            rule__EFloatObject__Group__4();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__3


    // $ANTLR start rule__EFloatObject__Group__3__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4660:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4664:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4665:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4665:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4666:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl9402); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__3__Impl


    // $ANTLR start rule__EFloatObject__Group__4
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4677:1: rule__EFloatObject__Group__4 : rule__EFloatObject__Group__4__Impl ;
    public final void rule__EFloatObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4681:1: ( rule__EFloatObject__Group__4__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4682:2: rule__EFloatObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__4__Impl_in_rule__EFloatObject__Group__49431);
            rule__EFloatObject__Group__4__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__4


    // $ANTLR start rule__EFloatObject__Group__4__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4688:1: rule__EFloatObject__Group__4__Impl : ( ( rule__EFloatObject__Group_4__0 )? ) ;
    public final void rule__EFloatObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4692:1: ( ( ( rule__EFloatObject__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4693:1: ( ( rule__EFloatObject__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4693:1: ( ( rule__EFloatObject__Group_4__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4694:1: ( rule__EFloatObject__Group_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getGroup_4()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4695:1: ( rule__EFloatObject__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=21 && LA29_0<=22)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4695:2: rule__EFloatObject__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__EFloatObject__Group_4__0_in_rule__EFloatObject__Group__4__Impl9458);
                    rule__EFloatObject__Group_4__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__4__Impl


    // $ANTLR start rule__EFloatObject__Group_4__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4715:1: rule__EFloatObject__Group_4__0 : rule__EFloatObject__Group_4__0__Impl rule__EFloatObject__Group_4__1 ;
    public final void rule__EFloatObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4719:1: ( rule__EFloatObject__Group_4__0__Impl rule__EFloatObject__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4720:2: rule__EFloatObject__Group_4__0__Impl rule__EFloatObject__Group_4__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group_4__0__Impl_in_rule__EFloatObject__Group_4__09499);
            rule__EFloatObject__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EFloatObject__Group_4__1_in_rule__EFloatObject__Group_4__09502);
            rule__EFloatObject__Group_4__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group_4__0


    // $ANTLR start rule__EFloatObject__Group_4__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4727:1: rule__EFloatObject__Group_4__0__Impl : ( ( rule__EFloatObject__Alternatives_4_0 ) ) ;
    public final void rule__EFloatObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4731:1: ( ( ( rule__EFloatObject__Alternatives_4_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4732:1: ( ( rule__EFloatObject__Alternatives_4_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4732:1: ( ( rule__EFloatObject__Alternatives_4_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4733:1: ( rule__EFloatObject__Alternatives_4_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getAlternatives_4_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4734:1: ( rule__EFloatObject__Alternatives_4_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4734:2: rule__EFloatObject__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Alternatives_4_0_in_rule__EFloatObject__Group_4__0__Impl9529);
            rule__EFloatObject__Alternatives_4_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getAlternatives_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group_4__0__Impl


    // $ANTLR start rule__EFloatObject__Group_4__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4744:1: rule__EFloatObject__Group_4__1 : rule__EFloatObject__Group_4__1__Impl rule__EFloatObject__Group_4__2 ;
    public final void rule__EFloatObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4748:1: ( rule__EFloatObject__Group_4__1__Impl rule__EFloatObject__Group_4__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4749:2: rule__EFloatObject__Group_4__1__Impl rule__EFloatObject__Group_4__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group_4__1__Impl_in_rule__EFloatObject__Group_4__19559);
            rule__EFloatObject__Group_4__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EFloatObject__Group_4__2_in_rule__EFloatObject__Group_4__19562);
            rule__EFloatObject__Group_4__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group_4__1


    // $ANTLR start rule__EFloatObject__Group_4__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4756:1: rule__EFloatObject__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4760:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4761:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4761:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4762:1: ( '-' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_4_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4763:1: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4764:2: '-'
                    {
                    match(input,16,FOLLOW_16_in_rule__EFloatObject__Group_4__1__Impl9591); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group_4__1__Impl


    // $ANTLR start rule__EFloatObject__Group_4__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4775:1: rule__EFloatObject__Group_4__2 : rule__EFloatObject__Group_4__2__Impl ;
    public final void rule__EFloatObject__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4779:1: ( rule__EFloatObject__Group_4__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4780:2: rule__EFloatObject__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group_4__2__Impl_in_rule__EFloatObject__Group_4__29624);
            rule__EFloatObject__Group_4__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group_4__2


    // $ANTLR start rule__EFloatObject__Group_4__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4786:1: rule__EFloatObject__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4790:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4791:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4791:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4792:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_4_2()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group_4__2__Impl9651); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group_4__2__Impl


    // $ANTLR start rule__Action__IsImmediateAssignment_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4810:1: rule__Action__IsImmediateAssignment_1 : ( ( '#' ) ) ;
    public final void rule__Action__IsImmediateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4814:1: ( ( ( '#' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4815:1: ( ( '#' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4815:1: ( ( '#' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4816:1: ( '#' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4817:1: ( '#' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4818:1: '#'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_1_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Action__IsImmediateAssignment_19696); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4833:1: rule__Action__DelayAssignment_2 : ( RULE_INT ) ;
    public final void rule__Action__DelayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4837:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4838:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4838:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4839:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Action__DelayAssignment_29735); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4848:1: rule__Action__TriggerAssignment_3 : ( ruleBooleanExpression ) ;
    public final void rule__Action__TriggerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4852:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4853:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4853:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4854:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Action__TriggerAssignment_39766);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4863:1: rule__Action__EffectsAssignment_4_1_0 : ( ruleEffect ) ;
    public final void rule__Action__EffectsAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4867:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4868:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4868:1: ( ruleEffect )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4869:1: ruleEffect
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_4_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_rule__Action__EffectsAssignment_4_1_09797);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4878:1: rule__Emission__SignalAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Emission__SignalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4882:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4883:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4883:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4884:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4885:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4886:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_09832); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4897:1: rule__Emission__NewValueAssignment_1_0_1 : ( ruleValuedExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4901:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4902:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4902:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4903:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueValuedExpressionParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__Emission__NewValueAssignment_1_0_19867);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4912:1: rule__Emission__NewValueAssignment_1_1_1 : ( ruleBooleanExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4916:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4917:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4917:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4918:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Emission__NewValueAssignment_1_1_19898);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4927:1: rule__Assignment__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4931:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4932:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4932:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4933:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4934:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4935:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_09933); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4946:1: rule__Assignment__ExpressionAssignment_2_0 : ( ruleValuedExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4950:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4951:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4951:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4952:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionValuedExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__Assignment__ExpressionAssignment_2_09968);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4961:1: rule__Assignment__ExpressionAssignment_2_1 : ( ruleBooleanExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4965:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4966:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4966:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4967:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Assignment__ExpressionAssignment_2_19999);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4976:1: rule__TextEffect__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextEffect__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4980:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4981:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4981:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4982:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextEffect__CodeAssignment_010030); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4991:1: rule__TextEffect__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextEffect__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4995:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4996:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4996:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4997:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextEffect__TypeAssignment_1_110061); if (failed) return ;
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


    // $ANTLR start rule__OrExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5006:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5010:1: ( ( ruleOrOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5011:1: ( ruleOrOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5011:1: ( ruleOrOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5012:1: ruleOrOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_110092);
            ruleOrOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__OperatorAssignment_1_1


    // $ANTLR start rule__OrExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5021:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5025:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5026:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5026:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5027:1: ruleAndExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_210123);
            ruleAndExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__AndExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5036:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5040:1: ( ( ruleAndOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5041:1: ( ruleAndOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5041:1: ( ruleAndOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5042:1: ruleAndOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_110154);
            ruleAndOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__OperatorAssignment_1_1


    // $ANTLR start rule__AndExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5051:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleNotExpression ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5055:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5056:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5056:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5057:1: ruleNotExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_rule__AndExpression__SubExpressionsAssignment_1_210185);
            ruleNotExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__NotExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5066:1: rule__NotExpression__OperatorAssignment_1_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5070:1: ( ( ruleNotOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5071:1: ( ruleNotOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5071:1: ( ruleNotOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5072:1: ruleNotOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_1_110216);
            ruleNotOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__OperatorAssignment_1_1


    // $ANTLR start rule__NotExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5081:1: rule__NotExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5085:1: ( ( ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5086:1: ( ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5086:1: ( ruleAtomicExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5087:1: ruleAtomicExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAtomicExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpression_in_rule__NotExpression__SubExpressionsAssignment_1_210247);
            ruleAtomicExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubExpressionsAtomicExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__AtomicExpression__OperatorAssignment_2_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5096:1: rule__AtomicExpression__OperatorAssignment_2_1 : ( rulePreOperator ) ;
    public final void rule__AtomicExpression__OperatorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5100:1: ( ( rulePreOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5101:1: ( rulePreOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5101:1: ( rulePreOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5102:1: rulePreOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getOperatorPreOperatorEnumRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_rulePreOperator_in_rule__AtomicExpression__OperatorAssignment_2_110278);
            rulePreOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getOperatorPreOperatorEnumRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__OperatorAssignment_2_1


    // $ANTLR start rule__AtomicExpression__SubExpressionsAssignment_2_3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5111:1: rule__AtomicExpression__SubExpressionsAssignment_2_3 : ( ruleSignalReference ) ;
    public final void rule__AtomicExpression__SubExpressionsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5115:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5116:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5116:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5117:1: ruleSignalReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_3_0()); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_rule__AtomicExpression__SubExpressionsAssignment_2_310309);
            ruleSignalReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__SubExpressionsAssignment_2_3


    // $ANTLR start rule__SignalReference__SignalAssignment
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5126:1: rule__SignalReference__SignalAssignment : ( ( ruleEString ) ) ;
    public final void rule__SignalReference__SignalAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5130:1: ( ( ( ruleEString ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5131:1: ( ( ruleEString ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5131:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5132:1: ( ruleEString )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5133:1: ( ruleEString )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5134:1: ruleEString
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalEStringParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__SignalReference__SignalAssignment10344);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getSignalSignalEStringParserRuleCall_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalReference__SignalAssignment


    // $ANTLR start rule__CompareOperation__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5145:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5149:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5150:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5150:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5151:1: ruleCompareOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_110379);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5160:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5164:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5165:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5165:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5166:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_210410);
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


    // $ANTLR start rule__AddExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5175:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5179:1: ( ( ruleAddOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5180:1: ( ruleAddOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5180:1: ( ruleAddOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5181:1: ruleAddOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_110441);
            ruleAddOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__OperatorAssignment_1_1


    // $ANTLR start rule__AddExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5190:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5194:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5195:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5195:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5196:1: ruleSubExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_210472);
            ruleSubExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__SubExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5205:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5209:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5210:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5210:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5211:1: ruleSubOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_110503);
            ruleSubOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__OperatorAssignment_1_1


    // $ANTLR start rule__SubExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5220:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5224:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5225:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5225:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5226:1: ruleMultExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_210534);
            ruleMultExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__MultExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5235:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5239:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5240:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5240:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5241:1: ruleMultOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_110565);
            ruleMultOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__OperatorAssignment_1_1


    // $ANTLR start rule__MultExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5250:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5254:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5255:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5255:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5256:1: ruleModExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_rule__MultExpression__SubExpressionsAssignment_1_210596);
            ruleModExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__ModExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5265:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5269:1: ( ( ruleModOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5270:1: ( ruleModOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5270:1: ( ruleModOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5271:1: ruleModOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_110627);
            ruleModOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__OperatorAssignment_1_1


    // $ANTLR start rule__ModExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5280:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5284:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5285:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5285:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5286:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_210658);
            ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__DivExpression__OperatorAssignment_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5295:1: rule__DivExpression__OperatorAssignment_2 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5299:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5300:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5300:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5301:1: ruleDivOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_210689);
            ruleDivOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__OperatorAssignment_2


    // $ANTLR start rule__DivExpression__SubExpressionsAssignment_3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5310:1: rule__DivExpression__SubExpressionsAssignment_3 : ( ruleAtomicValuedExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5314:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5315:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5315:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5316:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__SubExpressionsAssignment_310720);
            ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__SubExpressionsAssignment_3


    // $ANTLR start rule__VariableReference__VariableAssignment
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5325:1: rule__VariableReference__VariableAssignment : ( ( ruleEString ) ) ;
    public final void rule__VariableReference__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5329:1: ( ( ( ruleEString ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5330:1: ( ( ruleEString ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5330:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5331:1: ( ruleEString )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5332:1: ( ruleEString )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5333:1: ruleEString
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableEStringParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__VariableReference__VariableAssignment10755);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableVariableEStringParserRuleCall_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariableReference__VariableAssignment


    // $ANTLR start rule__ValueTestExpression__OperatorAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5344:1: rule__ValueTestExpression__OperatorAssignment_0 : ( ruleValueTestOperator ) ;
    public final void rule__ValueTestExpression__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5348:1: ( ( ruleValueTestOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5349:1: ( ruleValueTestOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5349:1: ( ruleValueTestOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5350:1: ruleValueTestOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValueTestOperator_in_rule__ValueTestExpression__OperatorAssignment_010790);
            ruleValueTestOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__OperatorAssignment_0


    // $ANTLR start rule__ValueTestExpression__SubExpressionsAssignment_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5359:1: rule__ValueTestExpression__SubExpressionsAssignment_2 : ( ruleSignalReference ) ;
    public final void rule__ValueTestExpression__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5363:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5364:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5364:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5365:1: ruleSignalReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_rule__ValueTestExpression__SubExpressionsAssignment_210821);
            ruleSignalReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__SubExpressionsAssignment_2


    // $ANTLR start rule__PreValueTestExpression__OperatorAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5374:1: rule__PreValueTestExpression__OperatorAssignment_0 : ( rulePreOperator ) ;
    public final void rule__PreValueTestExpression__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5378:1: ( ( rulePreOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5379:1: ( rulePreOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5379:1: ( rulePreOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5380:1: rulePreOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePreOperator_in_rule__PreValueTestExpression__OperatorAssignment_010852);
            rulePreOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__OperatorAssignment_0


    // $ANTLR start rule__PreValueTestExpression__SubExpressionsAssignment_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5389:1: rule__PreValueTestExpression__SubExpressionsAssignment_2 : ( ruleValueTestExpression ) ;
    public final void rule__PreValueTestExpression__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5393:1: ( ( ruleValueTestExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5394:1: ( ruleValueTestExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5394:1: ( ruleValueTestExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5395:1: ruleValueTestExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getSubExpressionsValueTestExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueTestExpression_in_rule__PreValueTestExpression__SubExpressionsAssignment_210883);
            ruleValueTestExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionAccess().getSubExpressionsValueTestExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__SubExpressionsAssignment_2


    // $ANTLR start rule__TextExpression__CodeAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5404:1: rule__TextExpression__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5408:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5409:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5409:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5410:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_010914); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5419:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5423:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5424:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5424:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5425:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_110945); if (failed) return ;
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


    // $ANTLR start rule__IntValue__ValueAssignment
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5434:1: rule__IntValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5438:1: ( ( ruleEIntegerObject ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5439:1: ( ruleEIntegerObject )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5439:1: ( ruleEIntegerObject )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5440:1: ruleEIntegerObject
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntValue__ValueAssignment10976);
            ruleEIntegerObject();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIntValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5449:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5453:1: ( ( ruleEFloatObject ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5454:1: ( ruleEFloatObject )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5454:1: ( ruleEFloatObject )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5455:1: ruleEFloatObject
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment11007);
            ruleEFloatObject();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5464:1: rule__BooleanValue__ValueAssignment : ( ruleEBooleanObject ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5468:1: ( ( ruleEBooleanObject ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5469:1: ( ruleEBooleanObject )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5469:1: ( ruleEBooleanObject )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5470:1: ruleEBooleanObject
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueEBooleanObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleEBooleanObject_in_rule__BooleanValue__ValueAssignment11038);
            ruleEBooleanObject();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueEBooleanObjectParserRuleCall_0()); 
            }

            }


            }

        }
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

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:1: ( ( ( rule__Emission__Group_1_0__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:1: ( ( rule__Emission__Group_1_0__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:1: ( ( rule__Emission__Group_1_0__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1161:1: ( rule__Emission__Group_1_0__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getEmissionAccess().getGroup_1_0()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1162:1: ( rule__Emission__Group_1_0__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1162:2: rule__Emission__Group_1_0__0
        {
        pushFollow(FOLLOW_rule__Emission__Group_1_0__0_in_synpred32372);
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
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1182:1: ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1182:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1182:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1183:1: ( rule__Assignment__ExpressionAssignment_2_0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_0()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1184:1: ( rule__Assignment__ExpressionAssignment_2_0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1184:2: rule__Assignment__ExpressionAssignment_2_0
        {
        pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_synpred42423);
        rule__Assignment__ExpressionAssignment_2_0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1244:6: ( ( ( rule__AtomicExpression__Group_3__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1244:6: ( ( rule__AtomicExpression__Group_3__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1244:6: ( ( rule__AtomicExpression__Group_3__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1245:1: ( rule__AtomicExpression__Group_3__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1246:1: ( rule__AtomicExpression__Group_3__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1246:2: rule__AtomicExpression__Group_3__0
        {
        pushFollow(FOLLOW_rule__AtomicExpression__Group_3__0_in_synpred92576);
        rule__AtomicExpression__Group_3__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:6: ( ( ruleVariableReference ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:6: ( ruleVariableReference )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:6: ( ruleVariableReference )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1279:1: ruleVariableReference
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getVariableReferenceParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_ruleVariableReference_in_synpred122661);
        ruleVariableReference();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1296:6: ( ( ( rule__AtomicValuedExpression__Group_5__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1296:6: ( ( rule__AtomicValuedExpression__Group_5__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1296:6: ( ( rule__AtomicValuedExpression__Group_5__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1297:1: ( rule__AtomicValuedExpression__Group_5__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_5()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1298:1: ( rule__AtomicValuedExpression__Group_5__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1298:2: rule__AtomicValuedExpression__Group_5__0
        {
        pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_5__0_in_synpred152712);
        rule__AtomicValuedExpression__Group_5__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1302:6: ( ( ( rule__AtomicValuedExpression__Group_6__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1302:6: ( ( rule__AtomicValuedExpression__Group_6__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1302:6: ( ( rule__AtomicValuedExpression__Group_6__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1303:1: ( rule__AtomicValuedExpression__Group_6__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_6()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1304:1: ( rule__AtomicValuedExpression__Group_6__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1304:2: rule__AtomicValuedExpression__Group_6__0
        {
        pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_6__0_in_synpred162730);
        rule__AtomicValuedExpression__Group_6__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16

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
    public final boolean synpred9() {
        backtracking++;
        int start = input.mark();
        try {
            synpred9_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleBooleanExpression402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__SignalAssignment_in_ruleSignalReference701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__0_in_ruleCompareOperation761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModExpression1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_in_ruleVariableReference1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestExpression_in_entryRuleValueTestExpression1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueTestExpression1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__0_in_ruleValueTestExpression1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueTestExpression_in_entryRulePreValueTestExpression1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreValueTestExpression1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__0_in_rulePreValueTestExpression1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__0_in_ruleTextExpression1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EIntegerObject__Group__0_in_ruleEIntegerObject1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBooleanObject_in_entryRuleEBooleanObject1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBooleanObject1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EBooleanObject__Alternatives_in_ruleEBooleanObject1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePreOperator1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleOrOperator1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAndOperator1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleNotOperator2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAddOperator2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSubOperator2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMultOperator2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleModOperator2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDivOperator2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleValueTestOperator2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_rule__Effect__Alternatives2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_rule__Effect__Alternatives2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0_in_rule__Emission__Alternatives_12372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__0_in_rule__Emission__Alternatives_12390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_rule__Assignment__Alternatives_22423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_1_in_rule__Assignment__Alternatives_22441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_1__0_in_rule__NotExpression__Alternatives2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__AtomicExpression__Alternatives2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__0_in_rule__AtomicExpression__Alternatives2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__0_in_rule__AtomicExpression__Alternatives2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rule__AtomicValuedExpression__Alternatives2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestExpression_in_rule__AtomicValuedExpression__Alternatives2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueTestExpression_in_rule__AtomicValuedExpression__Alternatives2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__0_in_rule__AtomicValuedExpression__Alternatives2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__0_in_rule__AtomicValuedExpression__Alternatives2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_rule__AtomicValuedExpression__Alternatives2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EFloatObject__Alternatives_4_02781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EFloatObject__Alternatives_4_02801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EBooleanObject__Alternatives2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EBooleanObject__Alternatives2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CompareOperator__Alternatives2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompareOperator__Alternatives2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CompareOperator__Alternatives2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CompareOperator__Alternatives3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CompareOperator__Alternatives3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CompareOperator__Alternatives3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__03080 = new BitSet(new long[]{0x0000001101884872L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__03083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__13141 = new BitSet(new long[]{0x0000000101884872L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__13144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__IsImmediateAssignment_1_in_rule__Action__Group__1__Impl3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__23202 = new BitSet(new long[]{0x0000000101884832L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__23205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DelayAssignment_2_in_rule__Action__Group__2__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__33263 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__33266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TriggerAssignment_3_in_rule__Action__Group__3__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__43324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__0_in_rule__Action__Group__4__Impl3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__0__Impl_in_rule__Action__Group_4__03392 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Action__Group_4__1_in_rule__Action__Group_4__03395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Action__Group_4__0__Impl3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__1__Impl_in_rule__Action__Group_4__13454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4_1__0_in_rule__Action__Group_4__1__Impl3481 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Action__Group_4_1__0__Impl_in_rule__Action__Group_4_1__03516 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4_1__1_in_rule__Action__Group_4_1__03519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__EffectsAssignment_4_1_0_in_rule__Action__Group_4_1__0__Impl3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4_1__1__Impl_in_rule__Action__Group_4_1__13576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Action__Group_4_1__1__Impl3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__0__Impl_in_rule__Emission__Group__03642 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__0__Impl3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1__Impl_in_rule__Emission__Group__13702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Alternatives_1_in_rule__Emission__Group__1__Impl3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0__Impl_in_rule__Emission__Group_1_0__03764 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__1_in_rule__Emission__Group_1_0__03767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Emission__Group_1_0__0__Impl3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__1__Impl_in_rule__Emission__Group_1_0__13826 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__2_in_rule__Emission__Group_1_0__13829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_0_1_in_rule__Emission__Group_1_0__1__Impl3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__2__Impl_in_rule__Emission__Group_1_0__23886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Emission__Group_1_0__2__Impl3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__0__Impl_in_rule__Emission__Group_1_1__03951 = new BitSet(new long[]{0x0000000101804830L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__1_in_rule__Emission__Group_1_1__03954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Emission__Group_1_1__0__Impl3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__1__Impl_in_rule__Emission__Group_1_1__14013 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__2_in_rule__Emission__Group_1_1__14016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_1_1_in_rule__Emission__Group_1_1__1__Impl4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__2__Impl_in_rule__Emission__Group_1_1__24073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Emission__Group_1_1__2__Impl4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04138 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14198 = new BitSet(new long[]{0x0000000901914870L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Assignment__Group__1__Impl4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Alternatives_2_in_rule__Assignment__Group__2__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__0__Impl_in_rule__TextEffect__Group__04323 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__1_in_rule__TextEffect__Group__04326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__CodeAssignment_0_in_rule__TextEffect__Group__0__Impl4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__1__Impl_in_rule__TextEffect__Group__14383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__0_in_rule__TextEffect__Group__1__Impl4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__0__Impl_in_rule__TextEffect__Group_1__04445 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__1_in_rule__TextEffect__Group_1__04448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TextEffect__Group_1__0__Impl4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__1__Impl_in_rule__TextEffect__Group_1__14507 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__2_in_rule__TextEffect__Group_1__14510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__TypeAssignment_1_1_in_rule__TextEffect__Group_1__1__Impl4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__2__Impl_in_rule__TextEffect__Group_1__24567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TextEffect__Group_1__2__Impl4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04632 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4718 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04753 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14814 = new BitSet(new long[]{0x0000000101804830L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__14817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__24874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__04937 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__04940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_rule__AndExpression__Group__0__Impl4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__14996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl5023 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__05058 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__05061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__15119 = new BitSet(new long[]{0x0000000101804830L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__15122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__25179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_1__0__Impl_in_rule__NotExpression__Group_1__05242 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_1__1_in_rule__NotExpression__Group_1__05245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_1__1__Impl_in_rule__NotExpression__Group_1__15303 = new BitSet(new long[]{0x0000000101800830L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_1__2_in_rule__NotExpression__Group_1__15306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__OperatorAssignment_1_1_in_rule__NotExpression__Group_1__1__Impl5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_1__2__Impl_in_rule__NotExpression__Group_1__25363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__SubExpressionsAssignment_1_2_in_rule__NotExpression__Group_1__2__Impl5390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__05426 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__05429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__15487 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__15490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__OperatorAssignment_2_1_in_rule__AtomicExpression__Group_2__1__Impl5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__25547 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__3_in_rule__AtomicExpression__Group_2__25550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicExpression__Group_2__2__Impl5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__3__Impl_in_rule__AtomicExpression__Group_2__35609 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__4_in_rule__AtomicExpression__Group_2__35612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__SubExpressionsAssignment_2_3_in_rule__AtomicExpression__Group_2__3__Impl5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__4__Impl_in_rule__AtomicExpression__Group_2__45669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AtomicExpression__Group_2__4__Impl5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__0__Impl_in_rule__AtomicExpression__Group_3__05738 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__1_in_rule__AtomicExpression__Group_3__05741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicExpression__Group_3__0__Impl5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__1__Impl_in_rule__AtomicExpression__Group_3__15800 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__2_in_rule__AtomicExpression__Group_3__15803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AtomicExpression__Group_3__1__Impl5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__2__Impl_in_rule__AtomicExpression__Group_3__25859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AtomicExpression__Group_3__2__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__0__Impl_in_rule__AtomicExpression__Group_4__05924 = new BitSet(new long[]{0x0000000101804830L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__1_in_rule__AtomicExpression__Group_4__05927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicExpression__Group_4__0__Impl5955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__1__Impl_in_rule__AtomicExpression__Group_4__15986 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__2_in_rule__AtomicExpression__Group_4__15989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_4__1__Impl6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__2__Impl_in_rule__AtomicExpression__Group_4__26045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AtomicExpression__Group_4__2__Impl6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__0__Impl_in_rule__CompareOperation__Group__06110 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__06113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__CompareOperation__Group__0__Impl6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__1__Impl_in_rule__CompareOperation__Group__16169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__1__Impl6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0__Impl_in_rule__CompareOperation__Group_1__06230 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__06233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1__Impl_in_rule__CompareOperation__Group_1__16291 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__16294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__1__Impl6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2__Impl_in_rule__CompareOperation__Group_1__26351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__2__Impl6378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__06414 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__06417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl6444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__16473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl6500 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__06535 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__06538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__16596 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__16599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__26656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl6683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__06719 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__06722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__16778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl6805 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__06840 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__06843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__16901 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__16904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__26961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__07024 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__07027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_rule__MultExpression__Group__0__Impl7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__17083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl7110 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__07145 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__07148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__17206 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__17209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__27266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__07329 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__07332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__Group__0__Impl7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__17388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl7415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__07450 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__07453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__17511 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__17514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl7541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__27571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__0__Impl_in_rule__AtomicValuedExpression__Group_5__07634 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__1_in_rule__AtomicValuedExpression__Group_5__07637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicValuedExpression__Group_5__0__Impl7665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__1__Impl_in_rule__AtomicValuedExpression__Group_5__17696 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__2_in_rule__AtomicValuedExpression__Group_5__17699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_rule__AtomicValuedExpression__Group_5__1__Impl7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__2__Impl_in_rule__AtomicValuedExpression__Group_5__27755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AtomicValuedExpression__Group_5__2__Impl7783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__0__Impl_in_rule__AtomicValuedExpression__Group_6__07820 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__1_in_rule__AtomicValuedExpression__Group_6__07823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicValuedExpression__Group_6__0__Impl7851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__1__Impl_in_rule__AtomicValuedExpression__Group_6__17882 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__2_in_rule__AtomicValuedExpression__Group_6__17885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_6__1__Impl7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__2__Impl_in_rule__AtomicValuedExpression__Group_6__27941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AtomicValuedExpression__Group_6__2__Impl7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__08006 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__08009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__Group__0__Impl8036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__18065 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__2_in_rule__DivExpression__Group__18068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__2__Impl_in_rule__DivExpression__Group__28126 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__3_in_rule__DivExpression__Group__28129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__OperatorAssignment_2_in_rule__DivExpression__Group__2__Impl8156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__3__Impl_in_rule__DivExpression__Group__38186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__SubExpressionsAssignment_3_in_rule__DivExpression__Group__3__Impl8213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__0__Impl_in_rule__ValueTestExpression__Group__08251 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__1_in_rule__ValueTestExpression__Group__08254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__OperatorAssignment_0_in_rule__ValueTestExpression__Group__0__Impl8281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__1__Impl_in_rule__ValueTestExpression__Group__18311 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__2_in_rule__ValueTestExpression__Group__18314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ValueTestExpression__Group__1__Impl8342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__2__Impl_in_rule__ValueTestExpression__Group__28373 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__3_in_rule__ValueTestExpression__Group__28376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__SubExpressionsAssignment_2_in_rule__ValueTestExpression__Group__2__Impl8403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__3__Impl_in_rule__ValueTestExpression__Group__38433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ValueTestExpression__Group__3__Impl8461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__0__Impl_in_rule__PreValueTestExpression__Group__08500 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__1_in_rule__PreValueTestExpression__Group__08503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__OperatorAssignment_0_in_rule__PreValueTestExpression__Group__0__Impl8530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__1__Impl_in_rule__PreValueTestExpression__Group__18560 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__2_in_rule__PreValueTestExpression__Group__18563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PreValueTestExpression__Group__1__Impl8591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__2__Impl_in_rule__PreValueTestExpression__Group__28622 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__3_in_rule__PreValueTestExpression__Group__28625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__SubExpressionsAssignment_2_in_rule__PreValueTestExpression__Group__2__Impl8652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__3__Impl_in_rule__PreValueTestExpression__Group__38682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PreValueTestExpression__Group__3__Impl8710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__08749 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__08752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl8779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__18809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl8836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__08871 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__08874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TextExpression__Group_1__0__Impl8902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__18933 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__18936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl8963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__28993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TextExpression__Group_1__2__Impl9021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EIntegerObject__Group__0__Impl_in_rule__EIntegerObject__Group__09058 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EIntegerObject__Group__1_in_rule__EIntegerObject__Group__09061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EIntegerObject__Group__0__Impl9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EIntegerObject__Group__1__Impl_in_rule__EIntegerObject__Group__19123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EIntegerObject__Group__1__Impl9150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__09183 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__09186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EFloatObject__Group__0__Impl9215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__19248 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__19251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl9279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__29310 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__29313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EFloatObject__Group__2__Impl9341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__39372 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__4_in_rule__EFloatObject__Group__39375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl9402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__4__Impl_in_rule__EFloatObject__Group__49431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group_4__0_in_rule__EFloatObject__Group__4__Impl9458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group_4__0__Impl_in_rule__EFloatObject__Group_4__09499 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group_4__1_in_rule__EFloatObject__Group_4__09502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Alternatives_4_0_in_rule__EFloatObject__Group_4__0__Impl9529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group_4__1__Impl_in_rule__EFloatObject__Group_4__19559 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group_4__2_in_rule__EFloatObject__Group_4__19562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EFloatObject__Group_4__1__Impl9591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group_4__2__Impl_in_rule__EFloatObject__Group_4__29624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group_4__2__Impl9651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Action__IsImmediateAssignment_19696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Action__DelayAssignment_29735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Action__TriggerAssignment_39766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__Action__EffectsAssignment_4_1_09797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_09832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Emission__NewValueAssignment_1_0_19867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Emission__NewValueAssignment_1_1_19898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_09933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Assignment__ExpressionAssignment_2_09968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Assignment__ExpressionAssignment_2_19999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextEffect__CodeAssignment_010030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextEffect__TypeAssignment_1_110061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_110092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_210123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_110154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_rule__AndExpression__SubExpressionsAssignment_1_210185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_1_110216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__SubExpressionsAssignment_1_210247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_rule__AtomicExpression__OperatorAssignment_2_110278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__AtomicExpression__SubExpressionsAssignment_2_310309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__SignalReference__SignalAssignment10344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_110379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_210410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_110441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_210472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_110503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_210534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_110565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_rule__MultExpression__SubExpressionsAssignment_1_210596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_110627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_210658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_210689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__SubExpressionsAssignment_310720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__VariableReference__VariableAssignment10755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestOperator_in_rule__ValueTestExpression__OperatorAssignment_010790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__ValueTestExpression__SubExpressionsAssignment_210821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_rule__PreValueTestExpression__OperatorAssignment_010852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestExpression_in_rule__PreValueTestExpression__SubExpressionsAssignment_210883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_010914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_110945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntValue__ValueAssignment10976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment11007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBooleanObject_in_rule__BooleanValue__ValueAssignment11038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0_in_synpred32372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_synpred42423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__0_in_synpred92576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_synpred122661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__0_in_synpred152712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__0_in_synpred162730 = new BitSet(new long[]{0x0000000000000002L});

}