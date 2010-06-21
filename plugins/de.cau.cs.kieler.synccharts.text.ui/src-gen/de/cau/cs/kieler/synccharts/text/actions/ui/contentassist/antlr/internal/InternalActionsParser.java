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
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1123:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1127:1: ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==34) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||(LA1_1>=RULE_STRING && LA1_1<=RULE_ID)||(LA1_1>=31 && LA1_1<=32)) ) {
                    alt1=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1123:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1123:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1128:1: ( ruleEmission )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1128:1: ( ruleEmission )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1129:1: ruleEmission
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEmission_in_rule__Effect__Alternatives2302);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1134:6: ( ruleAssignment )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1134:6: ( ruleAssignment )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1135:1: ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2319);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1140:6: ( ruleTextEffect )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1140:6: ( ruleTextEffect )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1141:1: ruleTextEffect
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleTextEffect_in_rule__Effect__Alternatives2336);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1151:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );
    public final void rule__Emission__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1155:1: ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) )
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
                                new NoViableAltException("1151:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 32:
                        {
                        alt2=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1151:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(3) ) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
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
                                new NoViableAltException("1151:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 8, input);

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
                            new NoViableAltException("1151:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                case 11:
                    {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==32) ) {
                        int LA2_9 = input.LA(4);

                        if ( ((LA2_9>=RULE_STRING && LA2_9<=RULE_ID)) ) {
                            alt2=2;
                        }
                        else if ( (LA2_9==20) ) {
                            alt2=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1151:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 9, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1151:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 5, input);

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
                            new NoViableAltException("1151:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 6, input);

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
                        new NoViableAltException("1151:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1151:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1156:1: ( ( rule__Emission__Group_1_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1156:1: ( ( rule__Emission__Group_1_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1157:1: ( rule__Emission__Group_1_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEmissionAccess().getGroup_1_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1158:1: ( rule__Emission__Group_1_0__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1158:2: rule__Emission__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Emission__Group_1_0__0_in_rule__Emission__Alternatives_12368);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1162:6: ( ( rule__Emission__Group_1_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1162:6: ( ( rule__Emission__Group_1_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1163:1: ( rule__Emission__Group_1_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEmissionAccess().getGroup_1_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1164:1: ( rule__Emission__Group_1_1__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1164:2: rule__Emission__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Emission__Group_1_1__0_in_rule__Emission__Alternatives_12386);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1173:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );
    public final void rule__Assignment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1177:1: ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) )
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
                        new NoViableAltException("1173:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 2, input);

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
                        new NoViableAltException("1173:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 3, input);

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
                            new NoViableAltException("1173:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1173:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 4, input);

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
                        new NoViableAltException("1173:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 5, input);

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
                    new NoViableAltException("1173:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1178:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1178:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1179:1: ( rule__Assignment__ExpressionAssignment_2_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1180:1: ( rule__Assignment__ExpressionAssignment_2_0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1180:2: rule__Assignment__ExpressionAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_rule__Assignment__Alternatives_22419);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1184:6: ( ( rule__Assignment__ExpressionAssignment_2_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1184:6: ( ( rule__Assignment__ExpressionAssignment_2_1 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1185:1: ( rule__Assignment__ExpressionAssignment_2_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1186:1: ( rule__Assignment__ExpressionAssignment_2_1 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1186:2: rule__Assignment__ExpressionAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_1_in_rule__Assignment__Alternatives_22437);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1195:1: rule__NotExpression__Alternatives : ( ( ruleAtomicExpression ) | ( ( rule__NotExpression__Group_1__0 ) ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1199:1: ( ( ruleAtomicExpression ) | ( ( rule__NotExpression__Group_1__0 ) ) )
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
                    new NoViableAltException("1195:1: rule__NotExpression__Alternatives : ( ( ruleAtomicExpression ) | ( ( rule__NotExpression__Group_1__0 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1200:1: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1200:1: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1201:1: ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2470);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1206:6: ( ( rule__NotExpression__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1206:6: ( ( rule__NotExpression__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1207:1: ( rule__NotExpression__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1208:1: ( rule__NotExpression__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1208:2: rule__NotExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NotExpression__Group_1__0_in_rule__NotExpression__Alternatives2487);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1217:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1221:1: ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) )
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

                    if ( ((LA5_6>=12 && LA5_6<=13)||LA5_6==33) ) {
                        alt5=5;
                    }
                    else if ( ((LA5_6>=15 && LA5_6<=18)||(LA5_6>=25 && LA5_6<=30)||LA5_6==32) ) {
                        alt5=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1217:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 5, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA5_7 = input.LA(3);

                    if ( ((LA5_7>=15 && LA5_7<=18)||(LA5_7>=25 && LA5_7<=30)) ) {
                        alt5=4;
                    }
                    else if ( ((LA5_7>=12 && LA5_7<=13)||LA5_7==33) ) {
                        alt5=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1217:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 5, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 11:
                    {
                    int LA5_8 = input.LA(3);

                    if ( (LA5_8==32) ) {
                        int LA5_11 = input.LA(4);

                        if ( (LA5_11==20) ) {
                            alt5=4;
                        }
                        else if ( ((LA5_11>=RULE_STRING && LA5_11<=RULE_ID)) ) {
                            alt5=5;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1217:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 5, 11, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1217:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 5, 8, input);

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
                            new NoViableAltException("1217:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 5, 9, input);

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
                        new NoViableAltException("1217:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 5, 4, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1217:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1222:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1222:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1223:1: ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives2520);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1228:6: ( ruleSignalReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1228:6: ( ruleSignalReference )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1229:1: ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getSignalReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_rule__AtomicExpression__Alternatives2537);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1234:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1234:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1235:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1236:1: ( rule__AtomicExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1236:2: rule__AtomicExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2554);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1240:6: ( ( rule__AtomicExpression__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1240:6: ( ( rule__AtomicExpression__Group_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1241:1: ( rule__AtomicExpression__Group_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1242:1: ( rule__AtomicExpression__Group_3__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1242:2: rule__AtomicExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpression__Group_3__0_in_rule__AtomicExpression__Alternatives2572);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1246:6: ( ( rule__AtomicExpression__Group_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1246:6: ( ( rule__AtomicExpression__Group_4__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1247:1: ( rule__AtomicExpression__Group_4__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1248:1: ( rule__AtomicExpression__Group_4__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1248:2: rule__AtomicExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpression__Group_4__0_in_rule__AtomicExpression__Alternatives2590);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1257:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1261:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) )
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
                            new NoViableAltException("1257:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 6, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==35) ) {
                    alt6=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1257:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 6, 1, input);

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
                        new NoViableAltException("1257:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 6, 2, input);

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
                        new NoViableAltException("1257:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 6, 4, input);

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
                        new NoViableAltException("1257:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 6, 8, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1257:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1262:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1262:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1263:1: ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2623);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1268:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1268:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1269:1: ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2640);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1274:6: ( ruleVariableReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1274:6: ( ruleVariableReference )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1275:1: ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getVariableReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_rule__AtomicValuedExpression__Alternatives2657);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1280:6: ( ruleValueTestExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1280:6: ( ruleValueTestExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1281:1: ruleValueTestExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getValueTestExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleValueTestExpression_in_rule__AtomicValuedExpression__Alternatives2674);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1286:6: ( rulePreValueTestExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1286:6: ( rulePreValueTestExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1287:1: rulePreValueTestExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getPreValueTestExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_rulePreValueTestExpression_in_rule__AtomicValuedExpression__Alternatives2691);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1292:6: ( ( rule__AtomicValuedExpression__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1292:6: ( ( rule__AtomicValuedExpression__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1293:1: ( rule__AtomicValuedExpression__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1294:1: ( rule__AtomicValuedExpression__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1294:2: rule__AtomicValuedExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_5__0_in_rule__AtomicValuedExpression__Alternatives2708);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1298:6: ( ( rule__AtomicValuedExpression__Group_6__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1298:6: ( ( rule__AtomicValuedExpression__Group_6__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1299:1: ( rule__AtomicValuedExpression__Group_6__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_6()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1300:1: ( rule__AtomicValuedExpression__Group_6__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1300:2: rule__AtomicValuedExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_6__0_in_rule__AtomicValuedExpression__Alternatives2726);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1304:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1304:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1305:1: ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getTextExpressionParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_rule__AtomicValuedExpression__Alternatives2744);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1315:1: rule__EFloatObject__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloatObject__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1319:1: ( ( 'E' ) | ( 'e' ) )
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
                    new NoViableAltException("1315:1: rule__EFloatObject__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1320:1: ( 'E' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1320:1: ( 'E' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1321:1: 'E'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__EFloatObject__Alternatives_4_02777); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1328:6: ( 'e' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1328:6: ( 'e' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1329:1: 'e'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__EFloatObject__Alternatives_4_02797); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1341:1: rule__EBooleanObject__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1345:1: ( ( 'true' ) | ( 'false' ) )
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
                    new NoViableAltException("1341:1: rule__EBooleanObject__Alternatives : ( ( 'true' ) | ( 'false' ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1346:1: ( 'true' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1346:1: ( 'true' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1347:1: 'true'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__EBooleanObject__Alternatives2832); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1354:6: ( 'false' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1354:6: ( 'false' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1355:1: 'false'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__EBooleanObject__Alternatives2852); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1367:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1371:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    new NoViableAltException("1367:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1372:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1372:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1373:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives2886); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1378:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1378:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1379:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives2903); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1389:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1393:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
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
                    new NoViableAltException("1389:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1394:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1394:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1395:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1396:1: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1396:3: '='
                    {
                    match(input,25,FOLLOW_25_in_rule__CompareOperator__Alternatives2936); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1401:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1401:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1402:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1403:1: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1403:3: '<'
                    {
                    match(input,26,FOLLOW_26_in_rule__CompareOperator__Alternatives2957); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1408:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1408:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1409:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1410:1: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1410:3: '<='
                    {
                    match(input,27,FOLLOW_27_in_rule__CompareOperator__Alternatives2978); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1415:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1415:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1416:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1417:1: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1417:3: '>'
                    {
                    match(input,28,FOLLOW_28_in_rule__CompareOperator__Alternatives2999); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1422:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1422:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1423:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1424:1: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1424:3: '>='
                    {
                    match(input,29,FOLLOW_29_in_rule__CompareOperator__Alternatives3020); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1429:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1429:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1430:1: ( '<>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1431:1: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1431:3: '<>'
                    {
                    match(input,30,FOLLOW_30_in_rule__CompareOperator__Alternatives3041); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1443:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1447:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1448:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__03074);
            rule__Action__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__03077);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1455:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1459:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1460:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1460:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1461:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getActionAction_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1462:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1464:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1474:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1478:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1479:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__13135);
            rule__Action__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__13138);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1486:1: rule__Action__Group__1__Impl : ( ( rule__Action__IsImmediateAssignment_1 )? ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1490:1: ( ( ( rule__Action__IsImmediateAssignment_1 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1491:1: ( ( rule__Action__IsImmediateAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1491:1: ( ( rule__Action__IsImmediateAssignment_1 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1492:1: ( rule__Action__IsImmediateAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1493:1: ( rule__Action__IsImmediateAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1493:2: rule__Action__IsImmediateAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Action__IsImmediateAssignment_1_in_rule__Action__Group__1__Impl3165);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1503:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1507:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1508:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__23196);
            rule__Action__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__23199);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1515:1: rule__Action__Group__2__Impl : ( ( rule__Action__DelayAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1519:1: ( ( ( rule__Action__DelayAssignment_2 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1520:1: ( ( rule__Action__DelayAssignment_2 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1520:1: ( ( rule__Action__DelayAssignment_2 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1521:1: ( rule__Action__DelayAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDelayAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1522:1: ( rule__Action__DelayAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1522:2: rule__Action__DelayAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Action__DelayAssignment_2_in_rule__Action__Group__2__Impl3226);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1532:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1536:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1537:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__33257);
            rule__Action__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__33260);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1544:1: rule__Action__Group__3__Impl : ( ( rule__Action__TriggerAssignment_3 )? ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1548:1: ( ( ( rule__Action__TriggerAssignment_3 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1549:1: ( ( rule__Action__TriggerAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1549:1: ( ( rule__Action__TriggerAssignment_3 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1550:1: ( rule__Action__TriggerAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTriggerAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1551:1: ( rule__Action__TriggerAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||LA13_0==11||LA13_0==14||(LA13_0>=23 && LA13_0<=24)||LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1551:2: rule__Action__TriggerAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Action__TriggerAssignment_3_in_rule__Action__Group__3__Impl3287);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1561:1: rule__Action__Group__4 : rule__Action__Group__4__Impl ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1565:1: ( rule__Action__Group__4__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1566:2: rule__Action__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__43318);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1572:1: rule__Action__Group__4__Impl : ( ( rule__Action__Group_4__0 )? ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1576:1: ( ( ( rule__Action__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1577:1: ( ( rule__Action__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1577:1: ( ( rule__Action__Group_4__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1578:1: ( rule__Action__Group_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_4()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1579:1: ( rule__Action__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1579:2: rule__Action__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_4__0_in_rule__Action__Group__4__Impl3345);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1599:1: rule__Action__Group_4__0 : rule__Action__Group_4__0__Impl rule__Action__Group_4__1 ;
    public final void rule__Action__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1603:1: ( rule__Action__Group_4__0__Impl rule__Action__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1604:2: rule__Action__Group_4__0__Impl rule__Action__Group_4__1
            {
            pushFollow(FOLLOW_rule__Action__Group_4__0__Impl_in_rule__Action__Group_4__03386);
            rule__Action__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_4__1_in_rule__Action__Group_4__03389);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1611:1: rule__Action__Group_4__0__Impl : ( '/' ) ;
    public final void rule__Action__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1615:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1616:1: ( '/' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1616:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1617:1: '/'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getSolidusKeyword_4_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Action__Group_4__0__Impl3417); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1630:1: rule__Action__Group_4__1 : rule__Action__Group_4__1__Impl ;
    public final void rule__Action__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1634:1: ( rule__Action__Group_4__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1635:2: rule__Action__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_4__1__Impl_in_rule__Action__Group_4__13448);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1641:1: rule__Action__Group_4__1__Impl : ( ( rule__Action__Group_4_1__0 )* ) ;
    public final void rule__Action__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1645:1: ( ( ( rule__Action__Group_4_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1646:1: ( ( rule__Action__Group_4_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1646:1: ( ( rule__Action__Group_4_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1647:1: ( rule__Action__Group_4_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_4_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1648:1: ( rule__Action__Group_4_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1648:2: rule__Action__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Action__Group_4_1__0_in_rule__Action__Group_4__1__Impl3475);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1662:1: rule__Action__Group_4_1__0 : rule__Action__Group_4_1__0__Impl rule__Action__Group_4_1__1 ;
    public final void rule__Action__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1666:1: ( rule__Action__Group_4_1__0__Impl rule__Action__Group_4_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1667:2: rule__Action__Group_4_1__0__Impl rule__Action__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Action__Group_4_1__0__Impl_in_rule__Action__Group_4_1__03510);
            rule__Action__Group_4_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_4_1__1_in_rule__Action__Group_4_1__03513);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1674:1: rule__Action__Group_4_1__0__Impl : ( ( rule__Action__EffectsAssignment_4_1_0 ) ) ;
    public final void rule__Action__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1678:1: ( ( ( rule__Action__EffectsAssignment_4_1_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1679:1: ( ( rule__Action__EffectsAssignment_4_1_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1679:1: ( ( rule__Action__EffectsAssignment_4_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1680:1: ( rule__Action__EffectsAssignment_4_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getEffectsAssignment_4_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1681:1: ( rule__Action__EffectsAssignment_4_1_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1681:2: rule__Action__EffectsAssignment_4_1_0
            {
            pushFollow(FOLLOW_rule__Action__EffectsAssignment_4_1_0_in_rule__Action__Group_4_1__0__Impl3540);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1691:1: rule__Action__Group_4_1__1 : rule__Action__Group_4_1__1__Impl ;
    public final void rule__Action__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1695:1: ( rule__Action__Group_4_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1696:2: rule__Action__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_4_1__1__Impl_in_rule__Action__Group_4_1__13570);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1702:1: rule__Action__Group_4_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__Action__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1706:1: ( ( ( ',' )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1707:1: ( ( ',' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1707:1: ( ( ',' )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1708:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getCommaKeyword_4_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1709:1: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1710:2: ','
                    {
                    match(input,31,FOLLOW_31_in_rule__Action__Group_4_1__1__Impl3599); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1725:1: rule__Emission__Group__0 : rule__Emission__Group__0__Impl rule__Emission__Group__1 ;
    public final void rule__Emission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1729:1: ( rule__Emission__Group__0__Impl rule__Emission__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1730:2: rule__Emission__Group__0__Impl rule__Emission__Group__1
            {
            pushFollow(FOLLOW_rule__Emission__Group__0__Impl_in_rule__Emission__Group__03636);
            rule__Emission__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03639);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1737:1: rule__Emission__Group__0__Impl : ( ( rule__Emission__SignalAssignment_0 ) ) ;
    public final void rule__Emission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1741:1: ( ( ( rule__Emission__SignalAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1742:1: ( ( rule__Emission__SignalAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1742:1: ( ( rule__Emission__SignalAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1743:1: ( rule__Emission__SignalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1744:1: ( rule__Emission__SignalAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1744:2: rule__Emission__SignalAssignment_0
            {
            pushFollow(FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__0__Impl3666);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1754:1: rule__Emission__Group__1 : rule__Emission__Group__1__Impl ;
    public final void rule__Emission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1758:1: ( rule__Emission__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1759:2: rule__Emission__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group__1__Impl_in_rule__Emission__Group__13696);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1765:1: rule__Emission__Group__1__Impl : ( ( rule__Emission__Alternatives_1 )? ) ;
    public final void rule__Emission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1769:1: ( ( ( rule__Emission__Alternatives_1 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1770:1: ( ( rule__Emission__Alternatives_1 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1770:1: ( ( rule__Emission__Alternatives_1 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1771:1: ( rule__Emission__Alternatives_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1772:1: ( rule__Emission__Alternatives_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1772:2: rule__Emission__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Emission__Alternatives_1_in_rule__Emission__Group__1__Impl3723);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1786:1: rule__Emission__Group_1_0__0 : rule__Emission__Group_1_0__0__Impl rule__Emission__Group_1_0__1 ;
    public final void rule__Emission__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1790:1: ( rule__Emission__Group_1_0__0__Impl rule__Emission__Group_1_0__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1791:2: rule__Emission__Group_1_0__0__Impl rule__Emission__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_0__0__Impl_in_rule__Emission__Group_1_0__03758);
            rule__Emission__Group_1_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_0__1_in_rule__Emission__Group_1_0__03761);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1798:1: rule__Emission__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__Emission__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1802:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1803:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1803:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1804:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Emission__Group_1_0__0__Impl3789); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1817:1: rule__Emission__Group_1_0__1 : rule__Emission__Group_1_0__1__Impl rule__Emission__Group_1_0__2 ;
    public final void rule__Emission__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1821:1: ( rule__Emission__Group_1_0__1__Impl rule__Emission__Group_1_0__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1822:2: rule__Emission__Group_1_0__1__Impl rule__Emission__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_0__1__Impl_in_rule__Emission__Group_1_0__13820);
            rule__Emission__Group_1_0__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_0__2_in_rule__Emission__Group_1_0__13823);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1829:1: rule__Emission__Group_1_0__1__Impl : ( ( rule__Emission__NewValueAssignment_1_0_1 ) ) ;
    public final void rule__Emission__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1833:1: ( ( ( rule__Emission__NewValueAssignment_1_0_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1834:1: ( ( rule__Emission__NewValueAssignment_1_0_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1834:1: ( ( rule__Emission__NewValueAssignment_1_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1835:1: ( rule__Emission__NewValueAssignment_1_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_0_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1836:1: ( rule__Emission__NewValueAssignment_1_0_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1836:2: rule__Emission__NewValueAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_0_1_in_rule__Emission__Group_1_0__1__Impl3850);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1846:1: rule__Emission__Group_1_0__2 : rule__Emission__Group_1_0__2__Impl ;
    public final void rule__Emission__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1850:1: ( rule__Emission__Group_1_0__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1851:2: rule__Emission__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_0__2__Impl_in_rule__Emission__Group_1_0__23880);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1857:1: rule__Emission__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__Emission__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1861:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1862:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1862:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1863:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_0_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__Emission__Group_1_0__2__Impl3908); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1882:1: rule__Emission__Group_1_1__0 : rule__Emission__Group_1_1__0__Impl rule__Emission__Group_1_1__1 ;
    public final void rule__Emission__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1886:1: ( rule__Emission__Group_1_1__0__Impl rule__Emission__Group_1_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1887:2: rule__Emission__Group_1_1__0__Impl rule__Emission__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_1__0__Impl_in_rule__Emission__Group_1_1__03945);
            rule__Emission__Group_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_1__1_in_rule__Emission__Group_1_1__03948);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1894:1: rule__Emission__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__Emission__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1898:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1899:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1899:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1900:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Emission__Group_1_1__0__Impl3976); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1913:1: rule__Emission__Group_1_1__1 : rule__Emission__Group_1_1__1__Impl rule__Emission__Group_1_1__2 ;
    public final void rule__Emission__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1917:1: ( rule__Emission__Group_1_1__1__Impl rule__Emission__Group_1_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1918:2: rule__Emission__Group_1_1__1__Impl rule__Emission__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_1__1__Impl_in_rule__Emission__Group_1_1__14007);
            rule__Emission__Group_1_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1_1__2_in_rule__Emission__Group_1_1__14010);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1925:1: rule__Emission__Group_1_1__1__Impl : ( ( rule__Emission__NewValueAssignment_1_1_1 ) ) ;
    public final void rule__Emission__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1929:1: ( ( ( rule__Emission__NewValueAssignment_1_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1930:1: ( ( rule__Emission__NewValueAssignment_1_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1930:1: ( ( rule__Emission__NewValueAssignment_1_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1931:1: ( rule__Emission__NewValueAssignment_1_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1932:1: ( rule__Emission__NewValueAssignment_1_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1932:2: rule__Emission__NewValueAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_1_1_in_rule__Emission__Group_1_1__1__Impl4037);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1942:1: rule__Emission__Group_1_1__2 : rule__Emission__Group_1_1__2__Impl ;
    public final void rule__Emission__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1946:1: ( rule__Emission__Group_1_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1947:2: rule__Emission__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group_1_1__2__Impl_in_rule__Emission__Group_1_1__24067);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1953:1: rule__Emission__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__Emission__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1957:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1958:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1958:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1959:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_1_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__Emission__Group_1_1__2__Impl4095); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1978:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1982:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1983:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04132);
            rule__Assignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04135);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1990:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariableAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1994:1: ( ( ( rule__Assignment__VariableAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1995:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1995:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1996:1: ( rule__Assignment__VariableAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1997:1: ( rule__Assignment__VariableAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1997:2: rule__Assignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl4162);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2007:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2011:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2012:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14192);
            rule__Assignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14195);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2019:1: rule__Assignment__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2023:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2024:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2024:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2025:1: ':='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Assignment__Group__1__Impl4223); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2038:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2042:1: ( rule__Assignment__Group__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2043:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24254);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2049:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__Alternatives_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2053:1: ( ( ( rule__Assignment__Alternatives_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2054:1: ( ( rule__Assignment__Alternatives_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2054:1: ( ( rule__Assignment__Alternatives_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2055:1: ( rule__Assignment__Alternatives_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2056:1: ( rule__Assignment__Alternatives_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2056:2: rule__Assignment__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Assignment__Alternatives_2_in_rule__Assignment__Group__2__Impl4281);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2072:1: rule__TextEffect__Group__0 : rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1 ;
    public final void rule__TextEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2076:1: ( rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2077:2: rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1
            {
            pushFollow(FOLLOW_rule__TextEffect__Group__0__Impl_in_rule__TextEffect__Group__04317);
            rule__TextEffect__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group__1_in_rule__TextEffect__Group__04320);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2084:1: rule__TextEffect__Group__0__Impl : ( ( rule__TextEffect__CodeAssignment_0 ) ) ;
    public final void rule__TextEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2088:1: ( ( ( rule__TextEffect__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2089:1: ( ( rule__TextEffect__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2089:1: ( ( rule__TextEffect__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2090:1: ( rule__TextEffect__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2091:1: ( rule__TextEffect__CodeAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2091:2: rule__TextEffect__CodeAssignment_0
            {
            pushFollow(FOLLOW_rule__TextEffect__CodeAssignment_0_in_rule__TextEffect__Group__0__Impl4347);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2101:1: rule__TextEffect__Group__1 : rule__TextEffect__Group__1__Impl ;
    public final void rule__TextEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2105:1: ( rule__TextEffect__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2106:2: rule__TextEffect__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextEffect__Group__1__Impl_in_rule__TextEffect__Group__14377);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2112:1: rule__TextEffect__Group__1__Impl : ( ( rule__TextEffect__Group_1__0 )? ) ;
    public final void rule__TextEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2116:1: ( ( ( rule__TextEffect__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2117:1: ( ( rule__TextEffect__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2117:1: ( ( rule__TextEffect__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2118:1: ( rule__TextEffect__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2119:1: ( rule__TextEffect__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2119:2: rule__TextEffect__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextEffect__Group_1__0_in_rule__TextEffect__Group__1__Impl4404);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2133:1: rule__TextEffect__Group_1__0 : rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1 ;
    public final void rule__TextEffect__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2137:1: ( rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2138:2: rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__0__Impl_in_rule__TextEffect__Group_1__04439);
            rule__TextEffect__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group_1__1_in_rule__TextEffect__Group_1__04442);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2145:1: rule__TextEffect__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextEffect__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2149:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2150:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2150:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2151:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__TextEffect__Group_1__0__Impl4470); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2164:1: rule__TextEffect__Group_1__1 : rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2 ;
    public final void rule__TextEffect__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2168:1: ( rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2169:2: rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__1__Impl_in_rule__TextEffect__Group_1__14501);
            rule__TextEffect__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group_1__2_in_rule__TextEffect__Group_1__14504);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2176:1: rule__TextEffect__Group_1__1__Impl : ( ( rule__TextEffect__TypeAssignment_1_1 ) ) ;
    public final void rule__TextEffect__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2180:1: ( ( ( rule__TextEffect__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2181:1: ( ( rule__TextEffect__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2181:1: ( ( rule__TextEffect__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2182:1: ( rule__TextEffect__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2183:1: ( rule__TextEffect__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2183:2: rule__TextEffect__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TextEffect__TypeAssignment_1_1_in_rule__TextEffect__Group_1__1__Impl4531);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2193:1: rule__TextEffect__Group_1__2 : rule__TextEffect__Group_1__2__Impl ;
    public final void rule__TextEffect__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2197:1: ( rule__TextEffect__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2198:2: rule__TextEffect__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__2__Impl_in_rule__TextEffect__Group_1__24561);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2204:1: rule__TextEffect__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextEffect__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2208:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2209:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2209:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2210:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__TextEffect__Group_1__2__Impl4589); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2229:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2233:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2234:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04626);
            rule__OrExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04629);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2241:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2245:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2246:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2246:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2247:1: ruleAndExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl4656);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2258:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2262:1: ( rule__OrExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2263:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14685);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2269:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2273:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2274:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2274:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2275:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2276:1: ( rule__OrExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==12) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2276:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4712);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2290:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2294:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2295:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04747);
            rule__OrExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04750);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2302:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2306:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2307:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2307:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2308:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2309:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2311:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2321:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2325:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2326:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14808);
            rule__OrExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__14811);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2333:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2337:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2338:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2338:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2339:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2340:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2340:2: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl4838);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2350:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2354:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2355:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__24868);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2361:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2365:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2366:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2366:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2367:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2368:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2368:2: rule__OrExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl4895);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2384:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2388:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2389:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__04931);
            rule__AndExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__04934);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2396:1: rule__AndExpression__Group__0__Impl : ( ruleNotExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2400:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2401:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2401:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2402:1: ruleNotExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getNotExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_rule__AndExpression__Group__0__Impl4961);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2413:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2417:1: ( rule__AndExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2418:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__14990);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2424:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2428:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2429:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2429:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2430:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2431:1: ( rule__AndExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2431:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl5017);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2445:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2449:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2450:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__05052);
            rule__AndExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__05055);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2457:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2461:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2462:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2462:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2463:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2464:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2466:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2476:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2480:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2481:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__15113);
            rule__AndExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__15116);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2488:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2492:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2493:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2493:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2494:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2495:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2495:2: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl5143);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2505:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2509:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2510:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__25173);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2516:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2520:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2521:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2521:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2522:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2523:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2523:2: rule__AndExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl5200);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2539:1: rule__NotExpression__Group_1__0 : rule__NotExpression__Group_1__0__Impl rule__NotExpression__Group_1__1 ;
    public final void rule__NotExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2543:1: ( rule__NotExpression__Group_1__0__Impl rule__NotExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2544:2: rule__NotExpression__Group_1__0__Impl rule__NotExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__NotExpression__Group_1__0__Impl_in_rule__NotExpression__Group_1__05236);
            rule__NotExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__NotExpression__Group_1__1_in_rule__NotExpression__Group_1__05239);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2551:1: rule__NotExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2555:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2556:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2556:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2557:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2558:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2560:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2570:1: rule__NotExpression__Group_1__1 : rule__NotExpression__Group_1__1__Impl rule__NotExpression__Group_1__2 ;
    public final void rule__NotExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2574:1: ( rule__NotExpression__Group_1__1__Impl rule__NotExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2575:2: rule__NotExpression__Group_1__1__Impl rule__NotExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__NotExpression__Group_1__1__Impl_in_rule__NotExpression__Group_1__15297);
            rule__NotExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__NotExpression__Group_1__2_in_rule__NotExpression__Group_1__15300);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2582:1: rule__NotExpression__Group_1__1__Impl : ( ( rule__NotExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__NotExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2586:1: ( ( ( rule__NotExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2587:1: ( ( rule__NotExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2587:1: ( ( rule__NotExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2588:1: ( rule__NotExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2589:1: ( rule__NotExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2589:2: rule__NotExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NotExpression__OperatorAssignment_1_1_in_rule__NotExpression__Group_1__1__Impl5327);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2599:1: rule__NotExpression__Group_1__2 : rule__NotExpression__Group_1__2__Impl ;
    public final void rule__NotExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2603:1: ( rule__NotExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2604:2: rule__NotExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NotExpression__Group_1__2__Impl_in_rule__NotExpression__Group_1__25357);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2610:1: rule__NotExpression__Group_1__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__NotExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2614:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2615:1: ( ( rule__NotExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2615:1: ( ( rule__NotExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2616:1: ( rule__NotExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2617:1: ( rule__NotExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2617:2: rule__NotExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__NotExpression__SubExpressionsAssignment_1_2_in_rule__NotExpression__Group_1__2__Impl5384);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2633:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2637:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2638:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__05420);
            rule__AtomicExpression__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__05423);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2645:1: rule__AtomicExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2649:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2650:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2650:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2651:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getOperatorExpressionAction_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2652:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2654:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2664:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2668:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2669:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__15481);
            rule__AtomicExpression__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__15484);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2676:1: rule__AtomicExpression__Group_2__1__Impl : ( ( rule__AtomicExpression__OperatorAssignment_2_1 ) ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2680:1: ( ( ( rule__AtomicExpression__OperatorAssignment_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2681:1: ( ( rule__AtomicExpression__OperatorAssignment_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2681:1: ( ( rule__AtomicExpression__OperatorAssignment_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2682:1: ( rule__AtomicExpression__OperatorAssignment_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getOperatorAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2683:1: ( rule__AtomicExpression__OperatorAssignment_2_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2683:2: rule__AtomicExpression__OperatorAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AtomicExpression__OperatorAssignment_2_1_in_rule__AtomicExpression__Group_2__1__Impl5511);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2693:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl rule__AtomicExpression__Group_2__3 ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2697:1: ( rule__AtomicExpression__Group_2__2__Impl rule__AtomicExpression__Group_2__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2698:2: rule__AtomicExpression__Group_2__2__Impl rule__AtomicExpression__Group_2__3
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__25541);
            rule__AtomicExpression__Group_2__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__3_in_rule__AtomicExpression__Group_2__25544);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2705:1: rule__AtomicExpression__Group_2__2__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2709:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2710:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2710:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2711:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicExpression__Group_2__2__Impl5572); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2724:1: rule__AtomicExpression__Group_2__3 : rule__AtomicExpression__Group_2__3__Impl rule__AtomicExpression__Group_2__4 ;
    public final void rule__AtomicExpression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2728:1: ( rule__AtomicExpression__Group_2__3__Impl rule__AtomicExpression__Group_2__4 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2729:2: rule__AtomicExpression__Group_2__3__Impl rule__AtomicExpression__Group_2__4
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__3__Impl_in_rule__AtomicExpression__Group_2__35603);
            rule__AtomicExpression__Group_2__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__4_in_rule__AtomicExpression__Group_2__35606);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2736:1: rule__AtomicExpression__Group_2__3__Impl : ( ( rule__AtomicExpression__SubExpressionsAssignment_2_3 ) ) ;
    public final void rule__AtomicExpression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2740:1: ( ( ( rule__AtomicExpression__SubExpressionsAssignment_2_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2741:1: ( ( rule__AtomicExpression__SubExpressionsAssignment_2_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2741:1: ( ( rule__AtomicExpression__SubExpressionsAssignment_2_3 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2742:1: ( rule__AtomicExpression__SubExpressionsAssignment_2_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getSubExpressionsAssignment_2_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2743:1: ( rule__AtomicExpression__SubExpressionsAssignment_2_3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2743:2: rule__AtomicExpression__SubExpressionsAssignment_2_3
            {
            pushFollow(FOLLOW_rule__AtomicExpression__SubExpressionsAssignment_2_3_in_rule__AtomicExpression__Group_2__3__Impl5633);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2753:1: rule__AtomicExpression__Group_2__4 : rule__AtomicExpression__Group_2__4__Impl ;
    public final void rule__AtomicExpression__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2757:1: ( rule__AtomicExpression__Group_2__4__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2758:2: rule__AtomicExpression__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__4__Impl_in_rule__AtomicExpression__Group_2__45663);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2764:1: rule__AtomicExpression__Group_2__4__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2768:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2769:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2769:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2770:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__AtomicExpression__Group_2__4__Impl5691); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2793:1: rule__AtomicExpression__Group_3__0 : rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 ;
    public final void rule__AtomicExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2797:1: ( rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2798:2: rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_3__0__Impl_in_rule__AtomicExpression__Group_3__05732);
            rule__AtomicExpression__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_3__1_in_rule__AtomicExpression__Group_3__05735);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2805:1: rule__AtomicExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2809:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2810:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2810:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2811:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicExpression__Group_3__0__Impl5763); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2824:1: rule__AtomicExpression__Group_3__1 : rule__AtomicExpression__Group_3__1__Impl rule__AtomicExpression__Group_3__2 ;
    public final void rule__AtomicExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2828:1: ( rule__AtomicExpression__Group_3__1__Impl rule__AtomicExpression__Group_3__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2829:2: rule__AtomicExpression__Group_3__1__Impl rule__AtomicExpression__Group_3__2
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_3__1__Impl_in_rule__AtomicExpression__Group_3__15794);
            rule__AtomicExpression__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_3__2_in_rule__AtomicExpression__Group_3__15797);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2836:1: rule__AtomicExpression__Group_3__1__Impl : ( ruleCompareOperation ) ;
    public final void rule__AtomicExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2840:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2841:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2841:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2842:1: ruleCompareOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getCompareOperationParserRuleCall_3_1()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_rule__AtomicExpression__Group_3__1__Impl5824);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2853:1: rule__AtomicExpression__Group_3__2 : rule__AtomicExpression__Group_3__2__Impl ;
    public final void rule__AtomicExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2857:1: ( rule__AtomicExpression__Group_3__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2858:2: rule__AtomicExpression__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_3__2__Impl_in_rule__AtomicExpression__Group_3__25853);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2864:1: rule__AtomicExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2868:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2869:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2869:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2870:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__AtomicExpression__Group_3__2__Impl5881); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2889:1: rule__AtomicExpression__Group_4__0 : rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1 ;
    public final void rule__AtomicExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2893:1: ( rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2894:2: rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_4__0__Impl_in_rule__AtomicExpression__Group_4__05918);
            rule__AtomicExpression__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_4__1_in_rule__AtomicExpression__Group_4__05921);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2901:1: rule__AtomicExpression__Group_4__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2905:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2906:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2906:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2907:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicExpression__Group_4__0__Impl5949); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2920:1: rule__AtomicExpression__Group_4__1 : rule__AtomicExpression__Group_4__1__Impl rule__AtomicExpression__Group_4__2 ;
    public final void rule__AtomicExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2924:1: ( rule__AtomicExpression__Group_4__1__Impl rule__AtomicExpression__Group_4__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2925:2: rule__AtomicExpression__Group_4__1__Impl rule__AtomicExpression__Group_4__2
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_4__1__Impl_in_rule__AtomicExpression__Group_4__15980);
            rule__AtomicExpression__Group_4__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_4__2_in_rule__AtomicExpression__Group_4__15983);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2932:1: rule__AtomicExpression__Group_4__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__AtomicExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2936:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2937:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2937:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2938:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_4_1()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_4__1__Impl6010);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2949:1: rule__AtomicExpression__Group_4__2 : rule__AtomicExpression__Group_4__2__Impl ;
    public final void rule__AtomicExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2953:1: ( rule__AtomicExpression__Group_4__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2954:2: rule__AtomicExpression__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_4__2__Impl_in_rule__AtomicExpression__Group_4__26039);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2960:1: rule__AtomicExpression__Group_4__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2964:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2965:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2965:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2966:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__AtomicExpression__Group_4__2__Impl6067); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2985:1: rule__CompareOperation__Group__0 : rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2989:1: ( rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2990:2: rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group__0__Impl_in_rule__CompareOperation__Group__06104);
            rule__CompareOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__06107);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2997:1: rule__CompareOperation__Group__0__Impl : ( ruleValuedExpression ) ;
    public final void rule__CompareOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3001:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3002:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3002:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3003:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__CompareOperation__Group__0__Impl6134);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3014:1: rule__CompareOperation__Group__1 : rule__CompareOperation__Group__1__Impl ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3018:1: ( rule__CompareOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3019:2: rule__CompareOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group__1__Impl_in_rule__CompareOperation__Group__16163);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3025:1: rule__CompareOperation__Group__1__Impl : ( ( rule__CompareOperation__Group_1__0 ) ) ;
    public final void rule__CompareOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3029:1: ( ( ( rule__CompareOperation__Group_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3030:1: ( ( rule__CompareOperation__Group_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3030:1: ( ( rule__CompareOperation__Group_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3031:1: ( rule__CompareOperation__Group_1__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3032:1: ( rule__CompareOperation__Group_1__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3032:2: rule__CompareOperation__Group_1__0
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__1__Impl6190);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3046:1: rule__CompareOperation__Group_1__0 : rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3050:1: ( rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3051:2: rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__0__Impl_in_rule__CompareOperation__Group_1__06224);
            rule__CompareOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__06227);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3058:1: rule__CompareOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3062:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3063:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3063:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3064:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3065:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3067:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3077:1: rule__CompareOperation__Group_1__1 : rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3081:1: ( rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3082:2: rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__1__Impl_in_rule__CompareOperation__Group_1__16285);
            rule__CompareOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__16288);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3089:1: rule__CompareOperation__Group_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompareOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3093:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3094:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3094:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3095:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3096:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3096:2: rule__CompareOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__1__Impl6315);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3106:1: rule__CompareOperation__Group_1__2 : rule__CompareOperation__Group_1__2__Impl ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3110:1: ( rule__CompareOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3111:2: rule__CompareOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__2__Impl_in_rule__CompareOperation__Group_1__26345);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3117:1: rule__CompareOperation__Group_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3121:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3122:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3122:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3123:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3124:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3124:2: rule__CompareOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__2__Impl6372);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3140:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3144:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3145:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__06408);
            rule__AddExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__06411);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3152:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3156:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3157:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3157:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3158:1: ruleSubExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl6438);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3169:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3173:1: ( rule__AddExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3174:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__16467);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3180:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3184:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3185:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3185:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3186:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3187:1: ( rule__AddExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3187:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl6494);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3201:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3205:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3206:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__06529);
            rule__AddExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__06532);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3213:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3217:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3218:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3218:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3219:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3220:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3222:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3232:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3236:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3237:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__16590);
            rule__AddExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__16593);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3244:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3248:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3249:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3249:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3250:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3251:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3251:2: rule__AddExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl6620);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3261:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3265:1: ( rule__AddExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3266:2: rule__AddExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__26650);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3272:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3276:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3277:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3277:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3278:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3279:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3279:2: rule__AddExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl6677);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3295:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3299:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3300:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__06713);
            rule__SubExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__06716);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3307:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3311:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3312:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3312:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3313:1: ruleMultExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl6743);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3324:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3328:1: ( rule__SubExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3329:2: rule__SubExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__16772);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3335:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3339:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3340:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3340:1: ( ( rule__SubExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3341:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3342:1: ( rule__SubExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3342:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl6799);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3356:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3360:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3361:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__06834);
            rule__SubExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__06837);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3368:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3372:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3373:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3373:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3374:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3375:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3377:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3387:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3391:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3392:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__16895);
            rule__SubExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__16898);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3399:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3403:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3404:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3404:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3405:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3406:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3406:2: rule__SubExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl6925);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3416:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3420:1: ( rule__SubExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3421:2: rule__SubExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__26955);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3427:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3431:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3432:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3432:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3433:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3434:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3434:2: rule__SubExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl6982);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3450:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3454:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3455:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__07018);
            rule__MultExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__07021);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3462:1: rule__MultExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3466:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3467:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3467:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3468:1: ruleModExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getModExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_rule__MultExpression__Group__0__Impl7048);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3479:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3483:1: ( rule__MultExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3484:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__17077);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3490:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3494:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3495:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3495:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3496:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3497:1: ( rule__MultExpression__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3497:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl7104);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3511:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3515:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3516:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__07139);
            rule__MultExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__07142);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3523:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3527:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3528:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3528:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3529:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3530:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3532:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3542:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3546:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3547:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__17200);
            rule__MultExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__17203);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3554:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3558:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3559:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3559:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3560:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3561:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3561:2: rule__MultExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl7230);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3571:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3575:1: ( rule__MultExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3576:2: rule__MultExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__27260);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3582:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3586:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3587:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3587:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3588:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3589:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3589:2: rule__MultExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl7287);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3605:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3609:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3610:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__07323);
            rule__ModExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__07326);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3617:1: rule__ModExpression__Group__0__Impl : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3621:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3622:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3622:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3623:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__Group__0__Impl7353);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3634:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3638:1: ( rule__ModExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3639:2: rule__ModExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__17382);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3645:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3649:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3650:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3650:1: ( ( rule__ModExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3651:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3652:1: ( rule__ModExpression__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3652:2: rule__ModExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl7409);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3666:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3670:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3671:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__07444);
            rule__ModExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__07447);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3678:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3682:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3683:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3683:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3684:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3685:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3687:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3697:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3701:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3702:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__17505);
            rule__ModExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__17508);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3709:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3713:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3714:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3714:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3715:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3716:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3716:2: rule__ModExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl7535);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3726:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3730:1: ( rule__ModExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3731:2: rule__ModExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__27565);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3737:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3741:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3742:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3742:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3743:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3744:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3744:2: rule__ModExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl7592);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3760:1: rule__AtomicValuedExpression__Group_5__0 : rule__AtomicValuedExpression__Group_5__0__Impl rule__AtomicValuedExpression__Group_5__1 ;
    public final void rule__AtomicValuedExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3764:1: ( rule__AtomicValuedExpression__Group_5__0__Impl rule__AtomicValuedExpression__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3765:2: rule__AtomicValuedExpression__Group_5__0__Impl rule__AtomicValuedExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_5__0__Impl_in_rule__AtomicValuedExpression__Group_5__07628);
            rule__AtomicValuedExpression__Group_5__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_5__1_in_rule__AtomicValuedExpression__Group_5__07631);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3772:1: rule__AtomicValuedExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3776:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3777:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3777:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3778:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicValuedExpression__Group_5__0__Impl7659); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3791:1: rule__AtomicValuedExpression__Group_5__1 : rule__AtomicValuedExpression__Group_5__1__Impl rule__AtomicValuedExpression__Group_5__2 ;
    public final void rule__AtomicValuedExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3795:1: ( rule__AtomicValuedExpression__Group_5__1__Impl rule__AtomicValuedExpression__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3796:2: rule__AtomicValuedExpression__Group_5__1__Impl rule__AtomicValuedExpression__Group_5__2
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_5__1__Impl_in_rule__AtomicValuedExpression__Group_5__17690);
            rule__AtomicValuedExpression__Group_5__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_5__2_in_rule__AtomicValuedExpression__Group_5__17693);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3803:1: rule__AtomicValuedExpression__Group_5__1__Impl : ( ruleDivExpression ) ;
    public final void rule__AtomicValuedExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3807:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3808:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3808:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3809:1: ruleDivExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getDivExpressionParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_rule__AtomicValuedExpression__Group_5__1__Impl7720);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3820:1: rule__AtomicValuedExpression__Group_5__2 : rule__AtomicValuedExpression__Group_5__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3824:1: ( rule__AtomicValuedExpression__Group_5__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3825:2: rule__AtomicValuedExpression__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_5__2__Impl_in_rule__AtomicValuedExpression__Group_5__27749);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3831:1: rule__AtomicValuedExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3835:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3836:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3836:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3837:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__AtomicValuedExpression__Group_5__2__Impl7777); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3856:1: rule__AtomicValuedExpression__Group_6__0 : rule__AtomicValuedExpression__Group_6__0__Impl rule__AtomicValuedExpression__Group_6__1 ;
    public final void rule__AtomicValuedExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3860:1: ( rule__AtomicValuedExpression__Group_6__0__Impl rule__AtomicValuedExpression__Group_6__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3861:2: rule__AtomicValuedExpression__Group_6__0__Impl rule__AtomicValuedExpression__Group_6__1
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_6__0__Impl_in_rule__AtomicValuedExpression__Group_6__07814);
            rule__AtomicValuedExpression__Group_6__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_6__1_in_rule__AtomicValuedExpression__Group_6__07817);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3868:1: rule__AtomicValuedExpression__Group_6__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3872:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3873:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3873:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3874:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicValuedExpression__Group_6__0__Impl7845); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3887:1: rule__AtomicValuedExpression__Group_6__1 : rule__AtomicValuedExpression__Group_6__1__Impl rule__AtomicValuedExpression__Group_6__2 ;
    public final void rule__AtomicValuedExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3891:1: ( rule__AtomicValuedExpression__Group_6__1__Impl rule__AtomicValuedExpression__Group_6__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3892:2: rule__AtomicValuedExpression__Group_6__1__Impl rule__AtomicValuedExpression__Group_6__2
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_6__1__Impl_in_rule__AtomicValuedExpression__Group_6__17876);
            rule__AtomicValuedExpression__Group_6__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_6__2_in_rule__AtomicValuedExpression__Group_6__17879);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3899:1: rule__AtomicValuedExpression__Group_6__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3903:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3904:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3904:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3905:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_6_1()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_6__1__Impl7906);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3916:1: rule__AtomicValuedExpression__Group_6__2 : rule__AtomicValuedExpression__Group_6__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3920:1: ( rule__AtomicValuedExpression__Group_6__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3921:2: rule__AtomicValuedExpression__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_6__2__Impl_in_rule__AtomicValuedExpression__Group_6__27935);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3927:1: rule__AtomicValuedExpression__Group_6__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3931:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3932:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3932:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3933:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__AtomicValuedExpression__Group_6__2__Impl7963); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3952:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3956:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3957:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__08000);
            rule__DivExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__08003);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3964:1: rule__DivExpression__Group__0__Impl : ( ruleAtomicValuedExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3968:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3969:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3969:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3970:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__Group__0__Impl8030);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3981:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2 ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3985:1: ( rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3986:2: rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__18059);
            rule__DivExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivExpression__Group__2_in_rule__DivExpression__Group__18062);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3993:1: rule__DivExpression__Group__1__Impl : ( () ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3997:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3998:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3998:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3999:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4000:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4002:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4012:1: rule__DivExpression__Group__2 : rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3 ;
    public final void rule__DivExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4016:1: ( rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4017:2: rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__2__Impl_in_rule__DivExpression__Group__28120);
            rule__DivExpression__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivExpression__Group__3_in_rule__DivExpression__Group__28123);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4024:1: rule__DivExpression__Group__2__Impl : ( ( rule__DivExpression__OperatorAssignment_2 ) ) ;
    public final void rule__DivExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4028:1: ( ( ( rule__DivExpression__OperatorAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4029:1: ( ( rule__DivExpression__OperatorAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4029:1: ( ( rule__DivExpression__OperatorAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4030:1: ( rule__DivExpression__OperatorAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4031:1: ( rule__DivExpression__OperatorAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4031:2: rule__DivExpression__OperatorAssignment_2
            {
            pushFollow(FOLLOW_rule__DivExpression__OperatorAssignment_2_in_rule__DivExpression__Group__2__Impl8150);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4041:1: rule__DivExpression__Group__3 : rule__DivExpression__Group__3__Impl ;
    public final void rule__DivExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4045:1: ( rule__DivExpression__Group__3__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4046:2: rule__DivExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__3__Impl_in_rule__DivExpression__Group__38180);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4052:1: rule__DivExpression__Group__3__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_3 ) ) ;
    public final void rule__DivExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4056:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4057:1: ( ( rule__DivExpression__SubExpressionsAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4057:1: ( ( rule__DivExpression__SubExpressionsAssignment_3 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4058:1: ( rule__DivExpression__SubExpressionsAssignment_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4059:1: ( rule__DivExpression__SubExpressionsAssignment_3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4059:2: rule__DivExpression__SubExpressionsAssignment_3
            {
            pushFollow(FOLLOW_rule__DivExpression__SubExpressionsAssignment_3_in_rule__DivExpression__Group__3__Impl8207);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4077:1: rule__ValueTestExpression__Group__0 : rule__ValueTestExpression__Group__0__Impl rule__ValueTestExpression__Group__1 ;
    public final void rule__ValueTestExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4081:1: ( rule__ValueTestExpression__Group__0__Impl rule__ValueTestExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4082:2: rule__ValueTestExpression__Group__0__Impl rule__ValueTestExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__0__Impl_in_rule__ValueTestExpression__Group__08245);
            rule__ValueTestExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__1_in_rule__ValueTestExpression__Group__08248);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4089:1: rule__ValueTestExpression__Group__0__Impl : ( ( rule__ValueTestExpression__OperatorAssignment_0 ) ) ;
    public final void rule__ValueTestExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4093:1: ( ( ( rule__ValueTestExpression__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4094:1: ( ( rule__ValueTestExpression__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4094:1: ( ( rule__ValueTestExpression__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4095:1: ( rule__ValueTestExpression__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4096:1: ( rule__ValueTestExpression__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4096:2: rule__ValueTestExpression__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__ValueTestExpression__OperatorAssignment_0_in_rule__ValueTestExpression__Group__0__Impl8275);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4106:1: rule__ValueTestExpression__Group__1 : rule__ValueTestExpression__Group__1__Impl rule__ValueTestExpression__Group__2 ;
    public final void rule__ValueTestExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4110:1: ( rule__ValueTestExpression__Group__1__Impl rule__ValueTestExpression__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4111:2: rule__ValueTestExpression__Group__1__Impl rule__ValueTestExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__1__Impl_in_rule__ValueTestExpression__Group__18305);
            rule__ValueTestExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__2_in_rule__ValueTestExpression__Group__18308);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4118:1: rule__ValueTestExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__ValueTestExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4122:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4123:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4123:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4124:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__ValueTestExpression__Group__1__Impl8336); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4137:1: rule__ValueTestExpression__Group__2 : rule__ValueTestExpression__Group__2__Impl rule__ValueTestExpression__Group__3 ;
    public final void rule__ValueTestExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4141:1: ( rule__ValueTestExpression__Group__2__Impl rule__ValueTestExpression__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4142:2: rule__ValueTestExpression__Group__2__Impl rule__ValueTestExpression__Group__3
            {
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__2__Impl_in_rule__ValueTestExpression__Group__28367);
            rule__ValueTestExpression__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__3_in_rule__ValueTestExpression__Group__28370);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4149:1: rule__ValueTestExpression__Group__2__Impl : ( ( rule__ValueTestExpression__SubExpressionsAssignment_2 ) ) ;
    public final void rule__ValueTestExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4153:1: ( ( ( rule__ValueTestExpression__SubExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4154:1: ( ( rule__ValueTestExpression__SubExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4154:1: ( ( rule__ValueTestExpression__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4155:1: ( rule__ValueTestExpression__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4156:1: ( rule__ValueTestExpression__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4156:2: rule__ValueTestExpression__SubExpressionsAssignment_2
            {
            pushFollow(FOLLOW_rule__ValueTestExpression__SubExpressionsAssignment_2_in_rule__ValueTestExpression__Group__2__Impl8397);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4166:1: rule__ValueTestExpression__Group__3 : rule__ValueTestExpression__Group__3__Impl ;
    public final void rule__ValueTestExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4170:1: ( rule__ValueTestExpression__Group__3__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4171:2: rule__ValueTestExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ValueTestExpression__Group__3__Impl_in_rule__ValueTestExpression__Group__38427);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4177:1: rule__ValueTestExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__ValueTestExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4181:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4182:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4182:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4183:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,33,FOLLOW_33_in_rule__ValueTestExpression__Group__3__Impl8455); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4204:1: rule__PreValueTestExpression__Group__0 : rule__PreValueTestExpression__Group__0__Impl rule__PreValueTestExpression__Group__1 ;
    public final void rule__PreValueTestExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4208:1: ( rule__PreValueTestExpression__Group__0__Impl rule__PreValueTestExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4209:2: rule__PreValueTestExpression__Group__0__Impl rule__PreValueTestExpression__Group__1
            {
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__0__Impl_in_rule__PreValueTestExpression__Group__08494);
            rule__PreValueTestExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__1_in_rule__PreValueTestExpression__Group__08497);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4216:1: rule__PreValueTestExpression__Group__0__Impl : ( ( rule__PreValueTestExpression__OperatorAssignment_0 ) ) ;
    public final void rule__PreValueTestExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4220:1: ( ( ( rule__PreValueTestExpression__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4221:1: ( ( rule__PreValueTestExpression__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4221:1: ( ( rule__PreValueTestExpression__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4222:1: ( rule__PreValueTestExpression__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4223:1: ( rule__PreValueTestExpression__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4223:2: rule__PreValueTestExpression__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__PreValueTestExpression__OperatorAssignment_0_in_rule__PreValueTestExpression__Group__0__Impl8524);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4233:1: rule__PreValueTestExpression__Group__1 : rule__PreValueTestExpression__Group__1__Impl rule__PreValueTestExpression__Group__2 ;
    public final void rule__PreValueTestExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4237:1: ( rule__PreValueTestExpression__Group__1__Impl rule__PreValueTestExpression__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4238:2: rule__PreValueTestExpression__Group__1__Impl rule__PreValueTestExpression__Group__2
            {
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__1__Impl_in_rule__PreValueTestExpression__Group__18554);
            rule__PreValueTestExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__2_in_rule__PreValueTestExpression__Group__18557);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4245:1: rule__PreValueTestExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__PreValueTestExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4249:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4250:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4250:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4251:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__PreValueTestExpression__Group__1__Impl8585); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4264:1: rule__PreValueTestExpression__Group__2 : rule__PreValueTestExpression__Group__2__Impl rule__PreValueTestExpression__Group__3 ;
    public final void rule__PreValueTestExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4268:1: ( rule__PreValueTestExpression__Group__2__Impl rule__PreValueTestExpression__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4269:2: rule__PreValueTestExpression__Group__2__Impl rule__PreValueTestExpression__Group__3
            {
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__2__Impl_in_rule__PreValueTestExpression__Group__28616);
            rule__PreValueTestExpression__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__3_in_rule__PreValueTestExpression__Group__28619);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4276:1: rule__PreValueTestExpression__Group__2__Impl : ( ( rule__PreValueTestExpression__SubExpressionsAssignment_2 ) ) ;
    public final void rule__PreValueTestExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4280:1: ( ( ( rule__PreValueTestExpression__SubExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4281:1: ( ( rule__PreValueTestExpression__SubExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4281:1: ( ( rule__PreValueTestExpression__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4282:1: ( rule__PreValueTestExpression__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4283:1: ( rule__PreValueTestExpression__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4283:2: rule__PreValueTestExpression__SubExpressionsAssignment_2
            {
            pushFollow(FOLLOW_rule__PreValueTestExpression__SubExpressionsAssignment_2_in_rule__PreValueTestExpression__Group__2__Impl8646);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4293:1: rule__PreValueTestExpression__Group__3 : rule__PreValueTestExpression__Group__3__Impl ;
    public final void rule__PreValueTestExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4297:1: ( rule__PreValueTestExpression__Group__3__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4298:2: rule__PreValueTestExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PreValueTestExpression__Group__3__Impl_in_rule__PreValueTestExpression__Group__38676);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4304:1: rule__PreValueTestExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__PreValueTestExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4308:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4309:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4309:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4310:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,33,FOLLOW_33_in_rule__PreValueTestExpression__Group__3__Impl8704); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4331:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4335:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4336:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
            {
            pushFollow(FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__08743);
            rule__TextExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__08746);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4343:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4347:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4348:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4348:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4349:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4350:1: ( rule__TextExpression__CodeAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4350:2: rule__TextExpression__CodeAssignment_0
            {
            pushFollow(FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl8773);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4360:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4364:1: ( rule__TextExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4365:2: rule__TextExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__18803);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4371:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4375:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4376:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4376:1: ( ( rule__TextExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4377:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4378:1: ( rule__TextExpression__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4378:2: rule__TextExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl8830);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4392:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4396:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4397:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__08865);
            rule__TextExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__08868);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4404:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4408:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4409:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4409:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4410:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__TextExpression__Group_1__0__Impl8896); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4423:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4427:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4428:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__18927);
            rule__TextExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__18930);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4435:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4439:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4440:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4440:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4441:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4442:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4442:2: rule__TextExpression__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl8957);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4452:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4456:1: ( rule__TextExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4457:2: rule__TextExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__28987);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4463:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4467:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4468:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4468:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4469:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__TextExpression__Group_1__2__Impl9015); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4488:1: rule__EIntegerObject__Group__0 : rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 ;
    public final void rule__EIntegerObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4492:1: ( rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4493:2: rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1
            {
            pushFollow(FOLLOW_rule__EIntegerObject__Group__0__Impl_in_rule__EIntegerObject__Group__09052);
            rule__EIntegerObject__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EIntegerObject__Group__1_in_rule__EIntegerObject__Group__09055);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4500:1: rule__EIntegerObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EIntegerObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4504:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4505:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4505:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4506:1: ( '-' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4507:1: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4508:2: '-'
                    {
                    match(input,16,FOLLOW_16_in_rule__EIntegerObject__Group__0__Impl9084); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4519:1: rule__EIntegerObject__Group__1 : rule__EIntegerObject__Group__1__Impl ;
    public final void rule__EIntegerObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4523:1: ( rule__EIntegerObject__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4524:2: rule__EIntegerObject__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EIntegerObject__Group__1__Impl_in_rule__EIntegerObject__Group__19117);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4530:1: rule__EIntegerObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EIntegerObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4534:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4535:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4535:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4536:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EIntegerObject__Group__1__Impl9144); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4551:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4555:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4556:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__09177);
            rule__EFloatObject__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__09180);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4563:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4567:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4568:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4568:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4569:1: ( '-' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4570:1: ( '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4571:2: '-'
                    {
                    match(input,16,FOLLOW_16_in_rule__EFloatObject__Group__0__Impl9209); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4582:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4586:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4587:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__19242);
            rule__EFloatObject__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__19245);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4594:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4598:1: ( ( ( RULE_INT )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4599:1: ( ( RULE_INT )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4599:1: ( ( RULE_INT )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4600:1: ( RULE_INT )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4601:1: ( RULE_INT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4601:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl9273); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4611:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4615:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4616:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__29304);
            rule__EFloatObject__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__29307);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4623:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4627:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4628:1: ( '.' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4628:1: ( '.' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4629:1: '.'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__EFloatObject__Group__2__Impl9335); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4642:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl rule__EFloatObject__Group__4 ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4646:1: ( rule__EFloatObject__Group__3__Impl rule__EFloatObject__Group__4 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4647:2: rule__EFloatObject__Group__3__Impl rule__EFloatObject__Group__4
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__39366);
            rule__EFloatObject__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EFloatObject__Group__4_in_rule__EFloatObject__Group__39369);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4654:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4658:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4659:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4659:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4660:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl9396); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4671:1: rule__EFloatObject__Group__4 : rule__EFloatObject__Group__4__Impl ;
    public final void rule__EFloatObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4675:1: ( rule__EFloatObject__Group__4__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4676:2: rule__EFloatObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group__4__Impl_in_rule__EFloatObject__Group__49425);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4682:1: rule__EFloatObject__Group__4__Impl : ( ( rule__EFloatObject__Group_4__0 )? ) ;
    public final void rule__EFloatObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4686:1: ( ( ( rule__EFloatObject__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4687:1: ( ( rule__EFloatObject__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4687:1: ( ( rule__EFloatObject__Group_4__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4688:1: ( rule__EFloatObject__Group_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getGroup_4()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4689:1: ( rule__EFloatObject__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=21 && LA29_0<=22)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4689:2: rule__EFloatObject__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__EFloatObject__Group_4__0_in_rule__EFloatObject__Group__4__Impl9452);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4709:1: rule__EFloatObject__Group_4__0 : rule__EFloatObject__Group_4__0__Impl rule__EFloatObject__Group_4__1 ;
    public final void rule__EFloatObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4713:1: ( rule__EFloatObject__Group_4__0__Impl rule__EFloatObject__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4714:2: rule__EFloatObject__Group_4__0__Impl rule__EFloatObject__Group_4__1
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group_4__0__Impl_in_rule__EFloatObject__Group_4__09493);
            rule__EFloatObject__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EFloatObject__Group_4__1_in_rule__EFloatObject__Group_4__09496);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4721:1: rule__EFloatObject__Group_4__0__Impl : ( ( rule__EFloatObject__Alternatives_4_0 ) ) ;
    public final void rule__EFloatObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4725:1: ( ( ( rule__EFloatObject__Alternatives_4_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4726:1: ( ( rule__EFloatObject__Alternatives_4_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4726:1: ( ( rule__EFloatObject__Alternatives_4_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4727:1: ( rule__EFloatObject__Alternatives_4_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getAlternatives_4_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4728:1: ( rule__EFloatObject__Alternatives_4_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4728:2: rule__EFloatObject__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__EFloatObject__Alternatives_4_0_in_rule__EFloatObject__Group_4__0__Impl9523);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4738:1: rule__EFloatObject__Group_4__1 : rule__EFloatObject__Group_4__1__Impl rule__EFloatObject__Group_4__2 ;
    public final void rule__EFloatObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4742:1: ( rule__EFloatObject__Group_4__1__Impl rule__EFloatObject__Group_4__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4743:2: rule__EFloatObject__Group_4__1__Impl rule__EFloatObject__Group_4__2
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group_4__1__Impl_in_rule__EFloatObject__Group_4__19553);
            rule__EFloatObject__Group_4__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EFloatObject__Group_4__2_in_rule__EFloatObject__Group_4__19556);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4750:1: rule__EFloatObject__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4754:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4755:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4755:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4756:1: ( '-' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_4_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4757:1: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4758:2: '-'
                    {
                    match(input,16,FOLLOW_16_in_rule__EFloatObject__Group_4__1__Impl9585); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4769:1: rule__EFloatObject__Group_4__2 : rule__EFloatObject__Group_4__2__Impl ;
    public final void rule__EFloatObject__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4773:1: ( rule__EFloatObject__Group_4__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4774:2: rule__EFloatObject__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__EFloatObject__Group_4__2__Impl_in_rule__EFloatObject__Group_4__29618);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4780:1: rule__EFloatObject__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4784:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4785:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4785:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4786:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_4_2()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EFloatObject__Group_4__2__Impl9645); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4804:1: rule__Action__IsImmediateAssignment_1 : ( ( '#' ) ) ;
    public final void rule__Action__IsImmediateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4808:1: ( ( ( '#' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4809:1: ( ( '#' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4809:1: ( ( '#' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4810:1: ( '#' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4811:1: ( '#' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4812:1: '#'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_1_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Action__IsImmediateAssignment_19690); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4827:1: rule__Action__DelayAssignment_2 : ( RULE_INT ) ;
    public final void rule__Action__DelayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4831:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4832:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4832:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4833:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Action__DelayAssignment_29729); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4842:1: rule__Action__TriggerAssignment_3 : ( ruleBooleanExpression ) ;
    public final void rule__Action__TriggerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4846:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4847:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4847:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4848:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Action__TriggerAssignment_39760);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4857:1: rule__Action__EffectsAssignment_4_1_0 : ( ruleEffect ) ;
    public final void rule__Action__EffectsAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4861:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4862:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4862:1: ( ruleEffect )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4863:1: ruleEffect
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_4_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_rule__Action__EffectsAssignment_4_1_09791);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4872:1: rule__Emission__SignalAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Emission__SignalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4876:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4877:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4877:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4878:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4879:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4880:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_09826); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4891:1: rule__Emission__NewValueAssignment_1_0_1 : ( ruleValuedExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4895:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4896:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4896:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4897:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueValuedExpressionParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__Emission__NewValueAssignment_1_0_19861);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4906:1: rule__Emission__NewValueAssignment_1_1_1 : ( ruleBooleanExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4910:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4911:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4911:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4912:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Emission__NewValueAssignment_1_1_19892);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4921:1: rule__Assignment__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4925:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4926:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4926:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4927:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4928:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4929:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_09927); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4940:1: rule__Assignment__ExpressionAssignment_2_0 : ( ruleValuedExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4944:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4945:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4945:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4946:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionValuedExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__Assignment__ExpressionAssignment_2_09962);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4955:1: rule__Assignment__ExpressionAssignment_2_1 : ( ruleBooleanExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4959:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4960:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4960:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4961:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Assignment__ExpressionAssignment_2_19993);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4970:1: rule__TextEffect__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextEffect__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4974:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4975:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4975:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4976:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextEffect__CodeAssignment_010024); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4985:1: rule__TextEffect__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextEffect__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4989:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4990:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4990:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4991:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextEffect__TypeAssignment_1_110055); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5000:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5004:1: ( ( ruleOrOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5005:1: ( ruleOrOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5005:1: ( ruleOrOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5006:1: ruleOrOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_110086);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5015:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5019:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5020:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5020:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5021:1: ruleAndExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_210117);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5030:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5034:1: ( ( ruleAndOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5035:1: ( ruleAndOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5035:1: ( ruleAndOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5036:1: ruleAndOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_110148);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5045:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleNotExpression ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5049:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5050:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5050:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5051:1: ruleNotExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_rule__AndExpression__SubExpressionsAssignment_1_210179);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5060:1: rule__NotExpression__OperatorAssignment_1_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5064:1: ( ( ruleNotOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5065:1: ( ruleNotOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5065:1: ( ruleNotOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5066:1: ruleNotOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_1_110210);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5075:1: rule__NotExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5079:1: ( ( ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5080:1: ( ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5080:1: ( ruleAtomicExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5081:1: ruleAtomicExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAtomicExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpression_in_rule__NotExpression__SubExpressionsAssignment_1_210241);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5090:1: rule__AtomicExpression__OperatorAssignment_2_1 : ( rulePreOperator ) ;
    public final void rule__AtomicExpression__OperatorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5094:1: ( ( rulePreOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5095:1: ( rulePreOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5095:1: ( rulePreOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5096:1: rulePreOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getOperatorPreOperatorEnumRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_rulePreOperator_in_rule__AtomicExpression__OperatorAssignment_2_110272);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5105:1: rule__AtomicExpression__SubExpressionsAssignment_2_3 : ( ruleSignalReference ) ;
    public final void rule__AtomicExpression__SubExpressionsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5109:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5110:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5110:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5111:1: ruleSignalReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_3_0()); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_rule__AtomicExpression__SubExpressionsAssignment_2_310303);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5120:1: rule__SignalReference__SignalAssignment : ( ( ruleEString ) ) ;
    public final void rule__SignalReference__SignalAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5124:1: ( ( ( ruleEString ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5125:1: ( ( ruleEString ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5125:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5126:1: ( ruleEString )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5127:1: ( ruleEString )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5128:1: ruleEString
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalEStringParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__SignalReference__SignalAssignment10338);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5139:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5143:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5144:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5144:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5145:1: ruleCompareOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_110373);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5154:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5158:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5159:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5159:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5160:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_210404);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5169:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5173:1: ( ( ruleAddOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5174:1: ( ruleAddOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5174:1: ( ruleAddOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5175:1: ruleAddOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_110435);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5184:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5188:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5189:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5189:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5190:1: ruleSubExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_210466);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5199:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5203:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5204:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5204:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5205:1: ruleSubOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_110497);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5214:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5218:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5219:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5219:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5220:1: ruleMultExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_210528);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5229:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5233:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5234:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5234:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5235:1: ruleMultOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_110559);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5244:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5248:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5249:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5249:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5250:1: ruleModExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_rule__MultExpression__SubExpressionsAssignment_1_210590);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5259:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5263:1: ( ( ruleModOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5264:1: ( ruleModOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5264:1: ( ruleModOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5265:1: ruleModOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_110621);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5274:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5278:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5279:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5279:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5280:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_210652);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5289:1: rule__DivExpression__OperatorAssignment_2 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5293:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5294:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5294:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5295:1: ruleDivOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_210683);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5304:1: rule__DivExpression__SubExpressionsAssignment_3 : ( ruleAtomicValuedExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5308:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5309:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5309:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5310:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__SubExpressionsAssignment_310714);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5319:1: rule__VariableReference__VariableAssignment : ( ( ruleEString ) ) ;
    public final void rule__VariableReference__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5323:1: ( ( ( ruleEString ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5324:1: ( ( ruleEString ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5324:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5325:1: ( ruleEString )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5326:1: ( ruleEString )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5327:1: ruleEString
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableEStringParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__VariableReference__VariableAssignment10749);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5338:1: rule__ValueTestExpression__OperatorAssignment_0 : ( ruleValueTestOperator ) ;
    public final void rule__ValueTestExpression__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5342:1: ( ( ruleValueTestOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5343:1: ( ruleValueTestOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5343:1: ( ruleValueTestOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5344:1: ruleValueTestOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValueTestOperator_in_rule__ValueTestExpression__OperatorAssignment_010784);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5353:1: rule__ValueTestExpression__SubExpressionsAssignment_2 : ( ruleSignalReference ) ;
    public final void rule__ValueTestExpression__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5357:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5358:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5358:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5359:1: ruleSignalReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_rule__ValueTestExpression__SubExpressionsAssignment_210815);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5368:1: rule__PreValueTestExpression__OperatorAssignment_0 : ( rulePreOperator ) ;
    public final void rule__PreValueTestExpression__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5372:1: ( ( rulePreOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5373:1: ( rulePreOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5373:1: ( rulePreOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5374:1: rulePreOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePreOperator_in_rule__PreValueTestExpression__OperatorAssignment_010846);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5383:1: rule__PreValueTestExpression__SubExpressionsAssignment_2 : ( ruleValueTestExpression ) ;
    public final void rule__PreValueTestExpression__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5387:1: ( ( ruleValueTestExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5388:1: ( ruleValueTestExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5388:1: ( ruleValueTestExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5389:1: ruleValueTestExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getSubExpressionsValueTestExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueTestExpression_in_rule__PreValueTestExpression__SubExpressionsAssignment_210877);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5398:1: rule__TextExpression__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5402:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5403:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5403:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5404:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_010908); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5413:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5417:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5418:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5418:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5419:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_110939); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5428:1: rule__IntValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5432:1: ( ( ruleEIntegerObject ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5433:1: ( ruleEIntegerObject )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5433:1: ( ruleEIntegerObject )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5434:1: ruleEIntegerObject
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleEIntegerObject_in_rule__IntValue__ValueAssignment10970);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5443:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5447:1: ( ( ruleEFloatObject ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5448:1: ( ruleEFloatObject )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5448:1: ( ruleEFloatObject )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5449:1: ruleEFloatObject
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment11001);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5458:1: rule__BooleanValue__ValueAssignment : ( ruleEBooleanObject ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5462:1: ( ( ruleEBooleanObject ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5463:1: ( ruleEBooleanObject )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5463:1: ( ruleEBooleanObject )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5464:1: ruleEBooleanObject
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueEBooleanObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleEBooleanObject_in_rule__BooleanValue__ValueAssignment11032);
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
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1156:1: ( ( ( rule__Emission__Group_1_0__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1156:1: ( ( rule__Emission__Group_1_0__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1156:1: ( ( rule__Emission__Group_1_0__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1157:1: ( rule__Emission__Group_1_0__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getEmissionAccess().getGroup_1_0()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1158:1: ( rule__Emission__Group_1_0__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1158:2: rule__Emission__Group_1_0__0
        {
        pushFollow(FOLLOW_rule__Emission__Group_1_0__0_in_synpred32368);
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
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1178:1: ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1178:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1178:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1179:1: ( rule__Assignment__ExpressionAssignment_2_0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_0()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1180:1: ( rule__Assignment__ExpressionAssignment_2_0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1180:2: rule__Assignment__ExpressionAssignment_2_0
        {
        pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_synpred42419);
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
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1240:6: ( ( ( rule__AtomicExpression__Group_3__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1240:6: ( ( rule__AtomicExpression__Group_3__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1240:6: ( ( rule__AtomicExpression__Group_3__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1241:1: ( rule__AtomicExpression__Group_3__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1242:1: ( rule__AtomicExpression__Group_3__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1242:2: rule__AtomicExpression__Group_3__0
        {
        pushFollow(FOLLOW_rule__AtomicExpression__Group_3__0_in_synpred92572);
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
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1274:6: ( ( ruleVariableReference ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1274:6: ( ruleVariableReference )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1274:6: ( ruleVariableReference )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1275:1: ruleVariableReference
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getVariableReferenceParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_ruleVariableReference_in_synpred122657);
        ruleVariableReference();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1292:6: ( ( ( rule__AtomicValuedExpression__Group_5__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1292:6: ( ( rule__AtomicValuedExpression__Group_5__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1292:6: ( ( rule__AtomicValuedExpression__Group_5__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1293:1: ( rule__AtomicValuedExpression__Group_5__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_5()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1294:1: ( rule__AtomicValuedExpression__Group_5__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1294:2: rule__AtomicValuedExpression__Group_5__0
        {
        pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_5__0_in_synpred152708);
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
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1298:6: ( ( ( rule__AtomicValuedExpression__Group_6__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1298:6: ( ( rule__AtomicValuedExpression__Group_6__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1298:6: ( ( rule__AtomicValuedExpression__Group_6__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1299:1: ( rule__AtomicValuedExpression__Group_6__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_6()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1300:1: ( rule__AtomicValuedExpression__Group_6__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1300:2: rule__AtomicValuedExpression__Group_6__0
        {
        pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_6__0_in_synpred162726);
        rule__AtomicValuedExpression__Group_6__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16

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
    public static final BitSet FOLLOW_ruleEmission_in_rule__Effect__Alternatives2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_rule__Effect__Alternatives2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0_in_rule__Emission__Alternatives_12368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__0_in_rule__Emission__Alternatives_12386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_rule__Assignment__Alternatives_22419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_1_in_rule__Assignment__Alternatives_22437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_1__0_in_rule__NotExpression__Alternatives2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__AtomicExpression__Alternatives2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__0_in_rule__AtomicExpression__Alternatives2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__0_in_rule__AtomicExpression__Alternatives2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rule__AtomicValuedExpression__Alternatives2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestExpression_in_rule__AtomicValuedExpression__Alternatives2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueTestExpression_in_rule__AtomicValuedExpression__Alternatives2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__0_in_rule__AtomicValuedExpression__Alternatives2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__0_in_rule__AtomicValuedExpression__Alternatives2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_rule__AtomicValuedExpression__Alternatives2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EFloatObject__Alternatives_4_02777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EFloatObject__Alternatives_4_02797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EBooleanObject__Alternatives2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EBooleanObject__Alternatives2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CompareOperator__Alternatives2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompareOperator__Alternatives2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CompareOperator__Alternatives2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CompareOperator__Alternatives2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CompareOperator__Alternatives3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CompareOperator__Alternatives3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__03074 = new BitSet(new long[]{0x0000001101884872L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__03077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__13135 = new BitSet(new long[]{0x0000000101884872L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__13138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__IsImmediateAssignment_1_in_rule__Action__Group__1__Impl3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__23196 = new BitSet(new long[]{0x0000000101884832L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__23199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DelayAssignment_2_in_rule__Action__Group__2__Impl3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__33257 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__33260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TriggerAssignment_3_in_rule__Action__Group__3__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__43318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__0_in_rule__Action__Group__4__Impl3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__0__Impl_in_rule__Action__Group_4__03386 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Action__Group_4__1_in_rule__Action__Group_4__03389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Action__Group_4__0__Impl3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4__1__Impl_in_rule__Action__Group_4__13448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4_1__0_in_rule__Action__Group_4__1__Impl3475 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Action__Group_4_1__0__Impl_in_rule__Action__Group_4_1__03510 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4_1__1_in_rule__Action__Group_4_1__03513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__EffectsAssignment_4_1_0_in_rule__Action__Group_4_1__0__Impl3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_4_1__1__Impl_in_rule__Action__Group_4_1__13570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Action__Group_4_1__1__Impl3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__0__Impl_in_rule__Emission__Group__03636 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__0__Impl3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1__Impl_in_rule__Emission__Group__13696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Alternatives_1_in_rule__Emission__Group__1__Impl3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0__Impl_in_rule__Emission__Group_1_0__03758 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__1_in_rule__Emission__Group_1_0__03761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Emission__Group_1_0__0__Impl3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__1__Impl_in_rule__Emission__Group_1_0__13820 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__2_in_rule__Emission__Group_1_0__13823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_0_1_in_rule__Emission__Group_1_0__1__Impl3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__2__Impl_in_rule__Emission__Group_1_0__23880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Emission__Group_1_0__2__Impl3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__0__Impl_in_rule__Emission__Group_1_1__03945 = new BitSet(new long[]{0x0000000101804830L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__1_in_rule__Emission__Group_1_1__03948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Emission__Group_1_1__0__Impl3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__1__Impl_in_rule__Emission__Group_1_1__14007 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__2_in_rule__Emission__Group_1_1__14010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_1_1_in_rule__Emission__Group_1_1__1__Impl4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__2__Impl_in_rule__Emission__Group_1_1__24067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Emission__Group_1_1__2__Impl4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04132 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14192 = new BitSet(new long[]{0x0000000901914870L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Assignment__Group__1__Impl4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Alternatives_2_in_rule__Assignment__Group__2__Impl4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__0__Impl_in_rule__TextEffect__Group__04317 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__1_in_rule__TextEffect__Group__04320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__CodeAssignment_0_in_rule__TextEffect__Group__0__Impl4347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__1__Impl_in_rule__TextEffect__Group__14377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__0_in_rule__TextEffect__Group__1__Impl4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__0__Impl_in_rule__TextEffect__Group_1__04439 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__1_in_rule__TextEffect__Group_1__04442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TextEffect__Group_1__0__Impl4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__1__Impl_in_rule__TextEffect__Group_1__14501 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__2_in_rule__TextEffect__Group_1__14504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__TypeAssignment_1_1_in_rule__TextEffect__Group_1__1__Impl4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__2__Impl_in_rule__TextEffect__Group_1__24561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TextEffect__Group_1__2__Impl4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04626 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4712 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04747 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14808 = new BitSet(new long[]{0x0000000101804830L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__14811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__24868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__04931 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__04934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_rule__AndExpression__Group__0__Impl4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__14990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl5017 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__05052 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__05055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__15113 = new BitSet(new long[]{0x0000000101804830L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__15116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__25173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_1__0__Impl_in_rule__NotExpression__Group_1__05236 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_1__1_in_rule__NotExpression__Group_1__05239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_1__1__Impl_in_rule__NotExpression__Group_1__15297 = new BitSet(new long[]{0x0000000101800830L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_1__2_in_rule__NotExpression__Group_1__15300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__OperatorAssignment_1_1_in_rule__NotExpression__Group_1__1__Impl5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_1__2__Impl_in_rule__NotExpression__Group_1__25357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__SubExpressionsAssignment_1_2_in_rule__NotExpression__Group_1__2__Impl5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__05420 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__05423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__15481 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__15484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__OperatorAssignment_2_1_in_rule__AtomicExpression__Group_2__1__Impl5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__25541 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__3_in_rule__AtomicExpression__Group_2__25544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicExpression__Group_2__2__Impl5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__3__Impl_in_rule__AtomicExpression__Group_2__35603 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__4_in_rule__AtomicExpression__Group_2__35606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__SubExpressionsAssignment_2_3_in_rule__AtomicExpression__Group_2__3__Impl5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__4__Impl_in_rule__AtomicExpression__Group_2__45663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AtomicExpression__Group_2__4__Impl5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__0__Impl_in_rule__AtomicExpression__Group_3__05732 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__1_in_rule__AtomicExpression__Group_3__05735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicExpression__Group_3__0__Impl5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__1__Impl_in_rule__AtomicExpression__Group_3__15794 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__2_in_rule__AtomicExpression__Group_3__15797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AtomicExpression__Group_3__1__Impl5824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__2__Impl_in_rule__AtomicExpression__Group_3__25853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AtomicExpression__Group_3__2__Impl5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__0__Impl_in_rule__AtomicExpression__Group_4__05918 = new BitSet(new long[]{0x0000000101804830L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__1_in_rule__AtomicExpression__Group_4__05921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicExpression__Group_4__0__Impl5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__1__Impl_in_rule__AtomicExpression__Group_4__15980 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__2_in_rule__AtomicExpression__Group_4__15983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_4__1__Impl6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__2__Impl_in_rule__AtomicExpression__Group_4__26039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AtomicExpression__Group_4__2__Impl6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__0__Impl_in_rule__CompareOperation__Group__06104 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__06107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__CompareOperation__Group__0__Impl6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__1__Impl_in_rule__CompareOperation__Group__16163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__1__Impl6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0__Impl_in_rule__CompareOperation__Group_1__06224 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__06227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1__Impl_in_rule__CompareOperation__Group_1__16285 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__16288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__1__Impl6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2__Impl_in_rule__CompareOperation__Group_1__26345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__2__Impl6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__06408 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__06411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__16467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl6494 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__06529 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__06532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__16590 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__16593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl6620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__26650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl6677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__06713 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__06716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__16772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl6799 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__06834 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__06837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__16895 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__16898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__26955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl6982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__07018 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__07021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_rule__MultExpression__Group__0__Impl7048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__17077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl7104 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__07139 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__07142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__17200 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__17203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__27260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__07323 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__07326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__Group__0__Impl7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__17382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__07444 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__07447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__17505 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__17508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl7535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__27565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__0__Impl_in_rule__AtomicValuedExpression__Group_5__07628 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__1_in_rule__AtomicValuedExpression__Group_5__07631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicValuedExpression__Group_5__0__Impl7659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__1__Impl_in_rule__AtomicValuedExpression__Group_5__17690 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__2_in_rule__AtomicValuedExpression__Group_5__17693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_rule__AtomicValuedExpression__Group_5__1__Impl7720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__2__Impl_in_rule__AtomicValuedExpression__Group_5__27749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AtomicValuedExpression__Group_5__2__Impl7777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__0__Impl_in_rule__AtomicValuedExpression__Group_6__07814 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__1_in_rule__AtomicValuedExpression__Group_6__07817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicValuedExpression__Group_6__0__Impl7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__1__Impl_in_rule__AtomicValuedExpression__Group_6__17876 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__2_in_rule__AtomicValuedExpression__Group_6__17879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_6__1__Impl7906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__2__Impl_in_rule__AtomicValuedExpression__Group_6__27935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AtomicValuedExpression__Group_6__2__Impl7963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__08000 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__08003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__Group__0__Impl8030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__18059 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__2_in_rule__DivExpression__Group__18062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__2__Impl_in_rule__DivExpression__Group__28120 = new BitSet(new long[]{0x0000000900110870L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__3_in_rule__DivExpression__Group__28123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__OperatorAssignment_2_in_rule__DivExpression__Group__2__Impl8150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__3__Impl_in_rule__DivExpression__Group__38180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__SubExpressionsAssignment_3_in_rule__DivExpression__Group__3__Impl8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__0__Impl_in_rule__ValueTestExpression__Group__08245 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__1_in_rule__ValueTestExpression__Group__08248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__OperatorAssignment_0_in_rule__ValueTestExpression__Group__0__Impl8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__1__Impl_in_rule__ValueTestExpression__Group__18305 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__2_in_rule__ValueTestExpression__Group__18308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ValueTestExpression__Group__1__Impl8336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__2__Impl_in_rule__ValueTestExpression__Group__28367 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__3_in_rule__ValueTestExpression__Group__28370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__SubExpressionsAssignment_2_in_rule__ValueTestExpression__Group__2__Impl8397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueTestExpression__Group__3__Impl_in_rule__ValueTestExpression__Group__38427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ValueTestExpression__Group__3__Impl8455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__0__Impl_in_rule__PreValueTestExpression__Group__08494 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__1_in_rule__PreValueTestExpression__Group__08497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__OperatorAssignment_0_in_rule__PreValueTestExpression__Group__0__Impl8524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__1__Impl_in_rule__PreValueTestExpression__Group__18554 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__2_in_rule__PreValueTestExpression__Group__18557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PreValueTestExpression__Group__1__Impl8585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__2__Impl_in_rule__PreValueTestExpression__Group__28616 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__3_in_rule__PreValueTestExpression__Group__28619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__SubExpressionsAssignment_2_in_rule__PreValueTestExpression__Group__2__Impl8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__3__Impl_in_rule__PreValueTestExpression__Group__38676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PreValueTestExpression__Group__3__Impl8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__08743 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__08746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl8773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__18803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__08865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__08868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TextExpression__Group_1__0__Impl8896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__18927 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__18930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl8957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__28987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TextExpression__Group_1__2__Impl9015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EIntegerObject__Group__0__Impl_in_rule__EIntegerObject__Group__09052 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EIntegerObject__Group__1_in_rule__EIntegerObject__Group__09055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EIntegerObject__Group__0__Impl9084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EIntegerObject__Group__1__Impl_in_rule__EIntegerObject__Group__19117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EIntegerObject__Group__1__Impl9144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__09177 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__09180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EFloatObject__Group__0__Impl9209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__19242 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__19245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl9273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__29304 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__29307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EFloatObject__Group__2__Impl9335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__39366 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__4_in_rule__EFloatObject__Group__39369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl9396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group__4__Impl_in_rule__EFloatObject__Group__49425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group_4__0_in_rule__EFloatObject__Group__4__Impl9452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group_4__0__Impl_in_rule__EFloatObject__Group_4__09493 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group_4__1_in_rule__EFloatObject__Group_4__09496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Alternatives_4_0_in_rule__EFloatObject__Group_4__0__Impl9523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group_4__1__Impl_in_rule__EFloatObject__Group_4__19553 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group_4__2_in_rule__EFloatObject__Group_4__19556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EFloatObject__Group_4__1__Impl9585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EFloatObject__Group_4__2__Impl_in_rule__EFloatObject__Group_4__29618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group_4__2__Impl9645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Action__IsImmediateAssignment_19690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Action__DelayAssignment_29729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Action__TriggerAssignment_39760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__Action__EffectsAssignment_4_1_09791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_09826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Emission__NewValueAssignment_1_0_19861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Emission__NewValueAssignment_1_1_19892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_09927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Assignment__ExpressionAssignment_2_09962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Assignment__ExpressionAssignment_2_19993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextEffect__CodeAssignment_010024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextEffect__TypeAssignment_1_110055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_110086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_210117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_110148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_rule__AndExpression__SubExpressionsAssignment_1_210179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_1_110210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__SubExpressionsAssignment_1_210241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_rule__AtomicExpression__OperatorAssignment_2_110272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__AtomicExpression__SubExpressionsAssignment_2_310303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__SignalReference__SignalAssignment10338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_110373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_210404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_110435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_210466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_110497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_210528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_110559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_rule__MultExpression__SubExpressionsAssignment_1_210590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_110621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_210652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_210683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__SubExpressionsAssignment_310714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__VariableReference__VariableAssignment10749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestOperator_in_rule__ValueTestExpression__OperatorAssignment_010784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__ValueTestExpression__SubExpressionsAssignment_210815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_rule__PreValueTestExpression__OperatorAssignment_010846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestExpression_in_rule__PreValueTestExpression__SubExpressionsAssignment_210877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_010908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_110939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntValue__ValueAssignment10970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment11001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBooleanObject_in_rule__BooleanValue__ValueAssignment11032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0_in_synpred32368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_synpred42419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__0_in_synpred92572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_synpred122657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__0_in_synpred152708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__0_in_synpred162726 = new BitSet(new long[]{0x0000000000000002L});

}