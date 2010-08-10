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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'/'", "'?'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "','", "'('", "')'", "':='", "'@'", "'#'"
    };
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_ID=5;
    public static final int RULE_WS=12;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_COMMENT_ANNOTATION=9;
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=11;

        public InternalActionsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[336+1];
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




    // $ANTLR start entryRuleTransition
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:62:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:63:1: ( ruleTransition EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:64:1: ruleTransition EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition67);
            ruleTransition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition74); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:71:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:75:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:76:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:76:1: ( ( rule__Transition__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:77:1: ( rule__Transition__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:78:1: ( rule__Transition__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:78:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition100);
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


    // $ANTLR start entryRuleEffect
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:92:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:93:1: ( ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:94:1: ruleEffect EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEffectRule()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect129);
            ruleEffect();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEffectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect136); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:101:1: ruleEffect : ( ( rule__Effect__Alternatives ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:105:2: ( ( ( rule__Effect__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:106:1: ( ( rule__Effect__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:106:1: ( ( rule__Effect__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:107:1: ( rule__Effect__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEffectAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:108:1: ( rule__Effect__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:108:2: rule__Effect__Alternatives
            {
            pushFollow(FOLLOW_rule__Effect__Alternatives_in_ruleEffect162);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:120:1: entryRuleEmission : ruleEmission EOF ;
    public final void entryRuleEmission() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:121:1: ( ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:122:1: ruleEmission EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission189);
            ruleEmission();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission196); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:129:1: ruleEmission : ( ( rule__Emission__Group__0 ) ) ;
    public final void ruleEmission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:133:2: ( ( ( rule__Emission__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:134:1: ( ( rule__Emission__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:134:1: ( ( rule__Emission__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:135:1: ( rule__Emission__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:136:1: ( rule__Emission__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:136:2: rule__Emission__Group__0
            {
            pushFollow(FOLLOW_rule__Emission__Group__0_in_ruleEmission222);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:148:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:149:1: ( ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:150:1: ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment249);
            ruleAssignment();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment256); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:157:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:161:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:162:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:162:1: ( ( rule__Assignment__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:163:1: ( rule__Assignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:164:1: ( rule__Assignment__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:164:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment282);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:176:1: entryRuleTextEffect : ruleTextEffect EOF ;
    public final void entryRuleTextEffect() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:177:1: ( ruleTextEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:178:1: ruleTextEffect EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectRule()); 
            }
            pushFollow(FOLLOW_ruleTextEffect_in_entryRuleTextEffect309);
            ruleTextEffect();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextEffectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextEffect316); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:185:1: ruleTextEffect : ( ( rule__TextEffect__Group__0 ) ) ;
    public final void ruleTextEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:189:2: ( ( ( rule__TextEffect__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:190:1: ( ( rule__TextEffect__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:190:1: ( ( rule__TextEffect__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:191:1: ( rule__TextEffect__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:192:1: ( rule__TextEffect__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:192:2: rule__TextEffect__Group__0
            {
            pushFollow(FOLLOW_rule__TextEffect__Group__0_in_ruleTextEffect342);
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


    // $ANTLR start entryRuleExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:204:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:205:1: ( ruleExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:206:1: ruleExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression369);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression376); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:213:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:217:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:218:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:218:1: ( ( rule__Expression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:219:1: ( rule__Expression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:220:1: ( rule__Expression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:220:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression402);
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


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:232:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:233:1: ( ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:234:1: ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression429);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression436); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:241:1: ruleBooleanExpression : ( ruleOrExpression ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:245:2: ( ( ruleOrExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:246:1: ( ruleOrExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:246:1: ( ruleOrExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:247:1: ruleOrExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleBooleanExpression462);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:260:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:261:1: ( ruleOrExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:262:1: ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression488);
            ruleOrExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression495); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:269:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:273:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:274:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:274:1: ( ( rule__OrExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:275:1: ( rule__OrExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:276:1: ( rule__OrExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:276:2: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression521);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:288:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:289:1: ( ruleAndExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:290:1: ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression548);
            ruleAndExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression555); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:297:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:301:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:302:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:302:1: ( ( rule__AndExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:303:1: ( rule__AndExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:304:1: ( rule__AndExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:304:2: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression581);
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


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:316:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:317:1: ( ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:318:1: ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation608);
            ruleCompareOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation615); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:325:1: ruleCompareOperation : ( ( rule__CompareOperation__Alternatives ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:329:2: ( ( ( rule__CompareOperation__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:330:1: ( ( rule__CompareOperation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:330:1: ( ( rule__CompareOperation__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:331:1: ( rule__CompareOperation__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:332:1: ( rule__CompareOperation__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:332:2: rule__CompareOperation__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareOperation__Alternatives_in_ruleCompareOperation641);
            rule__CompareOperation__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start entryRuleNotOrValuedExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:344:1: entryRuleNotOrValuedExpression : ruleNotOrValuedExpression EOF ;
    public final void entryRuleNotOrValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:345:1: ( ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:346:1: ruleNotOrValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression668);
            ruleNotOrValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOrValuedExpression675); if (failed) return ;

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
    // $ANTLR end entryRuleNotOrValuedExpression


    // $ANTLR start ruleNotOrValuedExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:353:1: ruleNotOrValuedExpression : ( ( rule__NotOrValuedExpression__Alternatives ) ) ;
    public final void ruleNotOrValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:357:2: ( ( ( rule__NotOrValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:358:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:358:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:359:1: ( rule__NotOrValuedExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:360:1: ( rule__NotOrValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:360:2: rule__NotOrValuedExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__NotOrValuedExpression__Alternatives_in_ruleNotOrValuedExpression701);
            rule__NotOrValuedExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotOrValuedExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNotOrValuedExpression


    // $ANTLR start entryRuleValuedExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:372:1: entryRuleValuedExpression : ruleValuedExpression EOF ;
    public final void entryRuleValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:373:1: ( ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:374:1: ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression728);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedExpression735); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:381:1: ruleValuedExpression : ( ruleAddExpression ) ;
    public final void ruleValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:385:2: ( ( ruleAddExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:386:1: ( ruleAddExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:386:1: ( ruleAddExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:387:1: ruleAddExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_ruleValuedExpression761);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:400:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:401:1: ( ruleAddExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:402:1: ruleAddExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression787);
            ruleAddExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAddExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression794); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:409:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:413:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:414:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:414:1: ( ( rule__AddExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:415:1: ( rule__AddExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:416:1: ( rule__AddExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:416:2: rule__AddExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression820);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:428:1: entryRuleSubExpression : ruleSubExpression EOF ;
    public final void entryRuleSubExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:429:1: ( ruleSubExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:430:1: ruleSubExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_entryRuleSubExpression847);
            ruleSubExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSubExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubExpression854); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:437:1: ruleSubExpression : ( ( rule__SubExpression__Group__0 ) ) ;
    public final void ruleSubExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:441:2: ( ( ( rule__SubExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:442:1: ( ( rule__SubExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:442:1: ( ( rule__SubExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:443:1: ( rule__SubExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:444:1: ( rule__SubExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:444:2: rule__SubExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression880);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:456:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:457:1: ( ruleMultExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:458:1: ruleMultExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_entryRuleMultExpression907);
            ruleMultExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExpression914); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:465:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:469:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:470:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:470:1: ( ( rule__MultExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:471:1: ( rule__MultExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:472:1: ( rule__MultExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:472:2: rule__MultExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression940);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:484:1: entryRuleModExpression : ruleModExpression EOF ;
    public final void entryRuleModExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:485:1: ( ruleModExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:486:1: ruleModExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_entryRuleModExpression967);
            ruleModExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getModExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModExpression974); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:493:1: ruleModExpression : ( ( rule__ModExpression__Group__0 ) ) ;
    public final void ruleModExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:497:2: ( ( ( rule__ModExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:498:1: ( ( rule__ModExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:498:1: ( ( rule__ModExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:499:1: ( rule__ModExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:500:1: ( rule__ModExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:500:2: rule__ModExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression1000);
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


    // $ANTLR start entryRuleNotExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:512:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:513:1: ( ruleNotExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:514:1: ruleNotExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression1027);
            ruleNotExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression1034); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:521:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:525:2: ( ( ( rule__NotExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:526:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:526:1: ( ( rule__NotExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:527:1: ( rule__NotExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:528:1: ( rule__NotExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:528:2: rule__NotExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression1060);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:540:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:541:1: ( ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:542:1: ruleAtomicExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression1087);
            ruleAtomicExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression1094); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:549:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:553:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:554:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:554:1: ( ( rule__AtomicExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:555:1: ( rule__AtomicExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:556:1: ( rule__AtomicExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:556:2: rule__AtomicExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression1120);
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


    // $ANTLR start entryRuleAtomicValuedExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:568:1: entryRuleAtomicValuedExpression : ruleAtomicValuedExpression EOF ;
    public final void entryRuleAtomicValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:569:1: ( ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:570:1: ruleAtomicValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression1147);
            ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicValuedExpression1154); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:577:1: ruleAtomicValuedExpression : ( ( rule__AtomicValuedExpression__Alternatives ) ) ;
    public final void ruleAtomicValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:581:2: ( ( ( rule__AtomicValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:582:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:582:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:583:1: ( rule__AtomicValuedExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:584:1: ( rule__AtomicValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:584:2: rule__AtomicValuedExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression1180);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:596:1: entryRuleDivExpression : ruleDivExpression EOF ;
    public final void entryRuleDivExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:597:1: ( ruleDivExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:598:1: ruleDivExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_entryRuleDivExpression1207);
            ruleDivExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivExpression1214); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:605:1: ruleDivExpression : ( ( rule__DivExpression__Group__0 ) ) ;
    public final void ruleDivExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:609:2: ( ( ( rule__DivExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:610:1: ( ( rule__DivExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:610:1: ( ( rule__DivExpression__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:611:1: ( rule__DivExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:612:1: ( rule__DivExpression__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:612:2: rule__DivExpression__Group__0
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression1240);
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


    // $ANTLR start entryRuleValuedObjectTestExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:624:1: entryRuleValuedObjectTestExpression : ruleValuedObjectTestExpression EOF ;
    public final void entryRuleValuedObjectTestExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:625:1: ( ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:626:1: ruleValuedObjectTestExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression1267);
            ruleValuedObjectTestExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectTestExpression1274); if (failed) return ;

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
    // $ANTLR end entryRuleValuedObjectTestExpression


    // $ANTLR start ruleValuedObjectTestExpression
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:633:1: ruleValuedObjectTestExpression : ( ( rule__ValuedObjectTestExpression__Alternatives ) ) ;
    public final void ruleValuedObjectTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:637:2: ( ( ( rule__ValuedObjectTestExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:638:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:638:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:639:1: ( rule__ValuedObjectTestExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:640:1: ( rule__ValuedObjectTestExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:640:2: rule__ValuedObjectTestExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Alternatives_in_ruleValuedObjectTestExpression1300);
            rule__ValuedObjectTestExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleValuedObjectTestExpression


    // $ANTLR start entryRuleValuedObjectReference
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:652:1: entryRuleValuedObjectReference : ruleValuedObjectReference EOF ;
    public final void entryRuleValuedObjectReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:653:1: ( ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:654:1: ruleValuedObjectReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference1327);
            ruleValuedObjectReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectReference1334); if (failed) return ;

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
    // $ANTLR end entryRuleValuedObjectReference


    // $ANTLR start ruleValuedObjectReference
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:661:1: ruleValuedObjectReference : ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) ) ;
    public final void ruleValuedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:665:2: ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:666:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:666:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:667:1: ( rule__ValuedObjectReference__ValuedObjectAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:668:1: ( rule__ValuedObjectReference__ValuedObjectAssignment )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:668:2: rule__ValuedObjectReference__ValuedObjectAssignment
            {
            pushFollow(FOLLOW_rule__ValuedObjectReference__ValuedObjectAssignment_in_ruleValuedObjectReference1360);
            rule__ValuedObjectReference__ValuedObjectAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleValuedObjectReference


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


    // $ANTLR start entryRuleCommentAnnotation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:796:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:797:1: ( ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:798:1: ruleCommentAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1631);
            ruleCommentAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentAnnotation1638); if (failed) return ;

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
    // $ANTLR end entryRuleCommentAnnotation


    // $ANTLR start ruleCommentAnnotation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:805:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValueAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:809:2: ( ( ( rule__CommentAnnotation__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:810:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:810:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:811:1: ( rule__CommentAnnotation__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:812:1: ( rule__CommentAnnotation__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:812:2: rule__CommentAnnotation__ValueAssignment
            {
            pushFollow(FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1664);
            rule__CommentAnnotation__ValueAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCommentAnnotation


    // $ANTLR start entryRuleKeyValueAnnotation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:824:1: entryRuleKeyValueAnnotation : ruleKeyValueAnnotation EOF ;
    public final void entryRuleKeyValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:825:1: ( ruleKeyValueAnnotation EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:826:1: ruleKeyValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation1691);
            ruleKeyValueAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyValueAnnotation1698); if (failed) return ;

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
    // $ANTLR end entryRuleKeyValueAnnotation


    // $ANTLR start ruleKeyValueAnnotation
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:833:1: ruleKeyValueAnnotation : ( ( rule__KeyValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:837:2: ( ( ( rule__KeyValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:838:1: ( ( rule__KeyValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:838:1: ( ( rule__KeyValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:839:1: ( rule__KeyValueAnnotation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:840:1: ( rule__KeyValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:840:2: rule__KeyValueAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__KeyValueAnnotation__Group__0_in_ruleKeyValueAnnotation1724);
            rule__KeyValueAnnotation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleKeyValueAnnotation


    // $ANTLR start entryRuleEString
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:852:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:853:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:854:1: ruleEString EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1751);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1758); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:861:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:865:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:866:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:866:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:867:1: ( rule__EString__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:868:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:868:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString1784);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:881:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:885:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:886:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:886:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:887:1: ( rule__CompareOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:888:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:888:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1821);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:900:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:904:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:905:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:905:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:906:1: ( 'pre' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:907:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:907:3: 'pre'
            {
            match(input,14,FOLLOW_14_in_rulePreOperator1858); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:920:1: ruleOrOperator : ( ( 'or' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:924:1: ( ( ( 'or' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:925:1: ( ( 'or' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:925:1: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:926:1: ( 'or' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:927:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:927:3: 'or'
            {
            match(input,15,FOLLOW_15_in_ruleOrOperator1897); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:940:1: ruleAndOperator : ( ( 'and' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:944:1: ( ( ( 'and' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:945:1: ( ( 'and' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:945:1: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:946:1: ( 'and' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:947:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:947:3: 'and'
            {
            match(input,16,FOLLOW_16_in_ruleAndOperator1936); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:960:1: ruleNotOperator : ( ( 'not' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:964:1: ( ( ( 'not' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:965:1: ( ( 'not' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:965:1: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:966:1: ( 'not' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:967:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:967:3: 'not'
            {
            match(input,17,FOLLOW_17_in_ruleNotOperator1975); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:980:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:984:1: ( ( ( '+' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:985:1: ( ( '+' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:985:1: ( ( '+' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:986:1: ( '+' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:987:1: ( '+' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:987:3: '+'
            {
            match(input,18,FOLLOW_18_in_ruleAddOperator2014); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1000:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1004:1: ( ( ( '-' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1005:1: ( ( '-' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1005:1: ( ( '-' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1006:1: ( '-' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1007:1: ( '-' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1007:3: '-'
            {
            match(input,19,FOLLOW_19_in_ruleSubOperator2053); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1020:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1024:1: ( ( ( '*' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1025:1: ( ( '*' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1025:1: ( ( '*' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1026:1: ( '*' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1027:1: ( '*' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1027:3: '*'
            {
            match(input,20,FOLLOW_20_in_ruleMultOperator2092); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1040:1: ruleModOperator : ( ( 'mod' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1044:1: ( ( ( 'mod' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1045:1: ( ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1045:1: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1046:1: ( 'mod' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1047:1: ( 'mod' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1047:3: 'mod'
            {
            match(input,21,FOLLOW_21_in_ruleModOperator2131); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1060:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1064:1: ( ( ( '/' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1065:1: ( ( '/' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1065:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1066:1: ( '/' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1067:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1067:3: '/'
            {
            match(input,22,FOLLOW_22_in_ruleDivOperator2170); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1080:1: ruleValueTestOperator : ( ( '?' ) ) ;
    public final void ruleValueTestOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1084:1: ( ( ( '?' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1085:1: ( ( '?' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1085:1: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1086:1: ( '?' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1087:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1087:3: '?'
            {
            match(input,23,FOLLOW_23_in_ruleValueTestOperator2209); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1103:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1107:1: ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==33) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||(LA1_1>=30 && LA1_1<=31)) ) {
                    alt1=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1103:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1103:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1108:1: ( ruleEmission )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1108:1: ( ruleEmission )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1109:1: ruleEmission
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEmission_in_rule__Effect__Alternatives2250);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1114:6: ( ruleAssignment )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1114:6: ( ruleAssignment )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1115:1: ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2267);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1120:6: ( ruleTextEffect )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1120:6: ( ruleTextEffect )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1121:1: ruleTextEffect
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleTextEffect_in_rule__Effect__Alternatives2284);
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


    // $ANTLR start rule__Expression__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1131:1: rule__Expression__Alternatives : ( ( ruleBooleanExpression ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1135:1: ( ( ruleBooleanExpression ) | ( ruleValuedExpression ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1136:1: ( ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1136:1: ( ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1137:1: ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2316);
                    ruleBooleanExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1142:6: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1142:6: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1143:1: ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2333);
                    ruleValuedExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
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


    // $ANTLR start rule__CompareOperation__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1153:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );
    public final void rule__CompareOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1157:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt3=1;
                }
                break;
            case 31:
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
                        new NoViableAltException("1153:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA3_3 = input.LA(2);

                if ( ((LA3_3>=18 && LA3_3<=21)||(LA3_3>=24 && LA3_3<=29)) ) {
                    alt3=1;
                }
                else if ( (LA3_3==EOF||(LA3_3>=15 && LA3_3<=16)||LA3_3==22||LA3_3==30||LA3_3==32) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1153:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==31) ) {
                    int LA3_11 = input.LA(3);

                    if ( (synpred4()) ) {
                        alt3=1;
                    }
                    else if ( (true) ) {
                        alt3=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1153:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 11, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1153:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5==RULE_ID) ) {
                    int LA3_12 = input.LA(3);

                    if ( (LA3_12==EOF||(LA3_12>=15 && LA3_12<=16)||LA3_12==22||LA3_12==30||LA3_12==32) ) {
                        alt3=2;
                    }
                    else if ( ((LA3_12>=18 && LA3_12<=21)||(LA3_12>=24 && LA3_12<=29)) ) {
                        alt3=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1153:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 12, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1153:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA3_6 = input.LA(2);

                if ( ((LA3_6>=18 && LA3_6<=21)||(LA3_6>=24 && LA3_6<=29)) ) {
                    alt3=1;
                }
                else if ( (LA3_6==EOF||(LA3_6>=15 && LA3_6<=16)||LA3_6==22||LA3_6==30||LA3_6==32) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1153:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    int LA3_13 = input.LA(3);

                    if ( (LA3_13==RULE_ID) ) {
                        int LA3_14 = input.LA(4);

                        if ( (LA3_14==32) ) {
                            int LA3_15 = input.LA(5);

                            if ( ((LA3_15>=18 && LA3_15<=21)||(LA3_15>=24 && LA3_15<=29)) ) {
                                alt3=1;
                            }
                            else if ( (LA3_15==EOF||(LA3_15>=15 && LA3_15<=16)||LA3_15==22||LA3_15==30||LA3_15==32) ) {
                                alt3=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1153:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1153:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 14, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1153:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    {
                    alt3=1;
                    }
                    break;
                case EOF:
                case 15:
                case 16:
                case 22:
                case 30:
                case 32:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1153:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 7, input);

                    throw nvae;
                }

                }
                break;
            case 17:
                {
                int LA3_8 = input.LA(2);

                if ( (synpred4()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1153:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 8, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1153:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1158:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1158:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1159:1: ( rule__CompareOperation__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:1: ( rule__CompareOperation__Group_0__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:2: rule__CompareOperation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives2365);
                    rule__CompareOperation__Group_0__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1164:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1164:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1165:1: ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2383);
                    ruleNotExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
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
    // $ANTLR end rule__CompareOperation__Alternatives


    // $ANTLR start rule__NotOrValuedExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1175:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1179:1: ( ( ruleValuedExpression ) | ( ruleNotExpression ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt4=1;
                }
                break;
            case 31:
                {
                int LA4_2 = input.LA(2);

                if ( (synpred5()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1175:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA4_3 = input.LA(2);

                if ( (synpred5()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1175:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==31) ) {
                    int LA4_9 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt4=1;
                    }
                    else if ( (true) ) {
                        alt4=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1175:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 9, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1175:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==RULE_ID) ) {
                    int LA4_10 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt4=1;
                    }
                    else if ( (true) ) {
                        alt4=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1175:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 10, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1175:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA4_6 = input.LA(2);

                if ( (synpred5()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1175:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA4_7 = input.LA(2);

                if ( (synpred5()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1175:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 7, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1175:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1180:1: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1180:1: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1181:1: ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2415);
                    ruleValuedExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1186:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1186:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1187:1: ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2432);
                    ruleNotExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
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
    // $ANTLR end rule__NotOrValuedExpression__Alternatives


    // $ANTLR start rule__NotExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1197:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1201:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||LA5_0==RULE_BOOLEAN||LA5_0==14||LA5_0==23||LA5_0==31) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1197:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1202:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1202:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1203:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1204:1: ( rule__NotExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1204:2: rule__NotExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2464);
                    rule__NotExpression__Group_0__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1208:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1208:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1209:1: ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2482);
                    ruleAtomicExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1219:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1223:1: ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
            case 14:
            case 23:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            case RULE_STRING:
                {
                alt6=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1219:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1224:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1224:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1225:1: ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives2514);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1230:6: ( ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1230:6: ( ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1231:1: ruleValuedObjectTestExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives2531);
                    ruleValuedObjectTestExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1236:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1236:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1237:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1238:1: ( rule__AtomicExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1238:2: rule__AtomicExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2548);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1242:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1242:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1243:1: ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives2566);
                    ruleTextExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1253:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1257:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                int LA7_3 = input.LA(2);

                if ( (synpred12()) ) {
                    alt7=3;
                }
                else if ( (synpred13()) ) {
                    alt7=4;
                }
                else if ( (true) ) {
                    alt7=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1253:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_BOOLEAN:
            case 14:
            case 23:
                {
                alt7=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1253:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1258:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1258:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1259:1: ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2598);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1264:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1264:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1265:1: ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2615);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1270:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1270:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1271:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1272:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1272:2: rule__AtomicValuedExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_rule__AtomicValuedExpression__Alternatives2632);
                    rule__AtomicValuedExpression__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1276:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1276:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1277:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:2: rule__AtomicValuedExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_rule__AtomicValuedExpression__Alternatives2650);
                    rule__AtomicValuedExpression__Group_3__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1282:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1282:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1283:1: ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives2668);
                    ruleAtomicExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
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


    // $ANTLR start rule__ValuedObjectTestExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1293:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1297:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1293:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1298:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1298:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1299:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1300:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1300:2: rule__ValuedObjectTestExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives2700);
                    rule__ValuedObjectTestExpression__Group_0__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1304:6: ( ( rule__ValuedObjectTestExpression__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1304:6: ( ( rule__ValuedObjectTestExpression__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1305:1: ( rule__ValuedObjectTestExpression__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1306:1: ( rule__ValuedObjectTestExpression__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1306:2: rule__ValuedObjectTestExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_1__0_in_rule__ValuedObjectTestExpression__Alternatives2718);
                    rule__ValuedObjectTestExpression__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1310:6: ( ruleValuedObjectReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1310:6: ( ruleValuedObjectReference )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1311:1: ruleValuedObjectReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives2736);
                    ruleValuedObjectReference();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_2()); 
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
    // $ANTLR end rule__ValuedObjectTestExpression__Alternatives


    // $ANTLR start rule__EString__Alternatives
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1323:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1327:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    new NoViableAltException("1323:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1328:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1328:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1329:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives2770); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1334:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1334:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1335:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives2787); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1345:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1349:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            case 27:
                {
                alt10=4;
                }
                break;
            case 28:
                {
                alt10=5;
                }
                break;
            case 29:
                {
                alt10=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1345:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1350:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1350:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1351:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1352:1: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1352:3: '='
                    {
                    match(input,24,FOLLOW_24_in_rule__CompareOperator__Alternatives2820); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1357:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1357:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1358:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1359:1: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1359:3: '<'
                    {
                    match(input,25,FOLLOW_25_in_rule__CompareOperator__Alternatives2841); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1364:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1364:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1365:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1366:1: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1366:3: '<='
                    {
                    match(input,26,FOLLOW_26_in_rule__CompareOperator__Alternatives2862); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1371:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1371:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1372:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1373:1: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1373:3: '>'
                    {
                    match(input,27,FOLLOW_27_in_rule__CompareOperator__Alternatives2883); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1378:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1378:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1379:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1380:1: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1380:3: '>='
                    {
                    match(input,28,FOLLOW_28_in_rule__CompareOperator__Alternatives2904); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1385:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1385:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1386:1: ( '<>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1387:1: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1387:3: '<>'
                    {
                    match(input,29,FOLLOW_29_in_rule__CompareOperator__Alternatives2925); if (failed) return ;

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


    // $ANTLR start rule__Transition__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1401:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1405:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1406:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02960);
            rule__Transition__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02963);
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


    // $ANTLR start rule__Transition__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1413:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1417:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1418:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1418:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1419:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1420:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1422:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__0__Impl


    // $ANTLR start rule__Transition__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1432:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1436:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1437:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__13021);
            rule__Transition__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__13024);
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


    // $ANTLR start rule__Transition__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1444:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__IsImmediateAssignment_1 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1448:1: ( ( ( rule__Transition__IsImmediateAssignment_1 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1449:1: ( ( rule__Transition__IsImmediateAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1449:1: ( ( rule__Transition__IsImmediateAssignment_1 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1450:1: ( rule__Transition__IsImmediateAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getIsImmediateAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1451:1: ( rule__Transition__IsImmediateAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1451:2: rule__Transition__IsImmediateAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Transition__IsImmediateAssignment_1_in_rule__Transition__Group__1__Impl3051);
                    rule__Transition__IsImmediateAssignment_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getIsImmediateAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__1__Impl


    // $ANTLR start rule__Transition__Group__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1461:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1465:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1466:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23082);
            rule__Transition__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__23085);
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


    // $ANTLR start rule__Transition__Group__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1473:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__DelayAssignment_2 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1477:1: ( ( ( rule__Transition__DelayAssignment_2 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1478:1: ( ( rule__Transition__DelayAssignment_2 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1478:1: ( ( rule__Transition__DelayAssignment_2 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1479:1: ( rule__Transition__DelayAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getDelayAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1480:1: ( rule__Transition__DelayAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||(LA12_1>=RULE_STRING && LA12_1<=RULE_BOOLEAN)||LA12_1==14||LA12_1==17||(LA12_1>=22 && LA12_1<=23)||LA12_1==31) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1480:2: rule__Transition__DelayAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Transition__DelayAssignment_2_in_rule__Transition__Group__2__Impl3112);
                    rule__Transition__DelayAssignment_2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getDelayAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__2__Impl


    // $ANTLR start rule__Transition__Group__3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1490:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1494:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1495:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__33143);
            rule__Transition__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__33146);
            rule__Transition__Group__4();
            _fsp--;
            if (failed) return ;

            }

        }
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


    // $ANTLR start rule__Transition__Group__3__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1502:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__TriggerAssignment_3 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1506:1: ( ( ( rule__Transition__TriggerAssignment_3 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1507:1: ( ( rule__Transition__TriggerAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1507:1: ( ( rule__Transition__TriggerAssignment_3 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1508:1: ( rule__Transition__TriggerAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTriggerAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1509:1: ( rule__Transition__TriggerAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_BOOLEAN)||LA13_0==14||LA13_0==17||LA13_0==23||LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1509:2: rule__Transition__TriggerAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Transition__TriggerAssignment_3_in_rule__Transition__Group__3__Impl3173);
                    rule__Transition__TriggerAssignment_3();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTriggerAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__3__Impl


    // $ANTLR start rule__Transition__Group__4
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1519:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1523:1: ( rule__Transition__Group__4__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1524:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__43204);
            rule__Transition__Group__4__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__4


    // $ANTLR start rule__Transition__Group__4__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1530:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1534:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1535:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1535:1: ( ( rule__Transition__Group_4__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1536:1: ( rule__Transition__Group_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup_4()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1537:1: ( rule__Transition__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1537:2: rule__Transition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl3231);
                    rule__Transition__Group_4__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group__4__Impl


    // $ANTLR start rule__Transition__Group_4__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1557:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1561:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1562:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__03272);
            rule__Transition__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__03275);
            rule__Transition__Group_4__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_4__0


    // $ANTLR start rule__Transition__Group_4__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1569:1: rule__Transition__Group_4__0__Impl : ( '/' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1573:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1574:1: ( '/' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1574:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1575:1: '/'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getSolidusKeyword_4_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Transition__Group_4__0__Impl3303); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getSolidusKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_4__0__Impl


    // $ANTLR start rule__Transition__Group_4__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1588:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1592:1: ( rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1593:2: rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2
            {
            pushFollow(FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__13334);
            rule__Transition__Group_4__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group_4__2_in_rule__Transition__Group_4__13337);
            rule__Transition__Group_4__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_4__1


    // $ANTLR start rule__Transition__Group_4__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1600:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__EffectsAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1604:1: ( ( ( rule__Transition__EffectsAssignment_4_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1605:1: ( ( rule__Transition__EffectsAssignment_4_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1605:1: ( ( rule__Transition__EffectsAssignment_4_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1606:1: ( rule__Transition__EffectsAssignment_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEffectsAssignment_4_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1607:1: ( rule__Transition__EffectsAssignment_4_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1607:2: rule__Transition__EffectsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Transition__EffectsAssignment_4_1_in_rule__Transition__Group_4__1__Impl3364);
            rule__Transition__EffectsAssignment_4_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getEffectsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_4__1__Impl


    // $ANTLR start rule__Transition__Group_4__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1617:1: rule__Transition__Group_4__2 : rule__Transition__Group_4__2__Impl ;
    public final void rule__Transition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1621:1: ( rule__Transition__Group_4__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1622:2: rule__Transition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_4__2__Impl_in_rule__Transition__Group_4__23394);
            rule__Transition__Group_4__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_4__2


    // $ANTLR start rule__Transition__Group_4__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1628:1: rule__Transition__Group_4__2__Impl : ( ( rule__Transition__Group_4_2__0 )* ) ;
    public final void rule__Transition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1632:1: ( ( ( rule__Transition__Group_4_2__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1633:1: ( ( rule__Transition__Group_4_2__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1633:1: ( ( rule__Transition__Group_4_2__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1634:1: ( rule__Transition__Group_4_2__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup_4_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1635:1: ( rule__Transition__Group_4_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1635:2: rule__Transition__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Transition__Group_4_2__0_in_rule__Transition__Group_4__2__Impl3421);
            	    rule__Transition__Group_4_2__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_4__2__Impl


    // $ANTLR start rule__Transition__Group_4_2__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1651:1: rule__Transition__Group_4_2__0 : rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 ;
    public final void rule__Transition__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1655:1: ( rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1656:2: rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_4_2__0__Impl_in_rule__Transition__Group_4_2__03458);
            rule__Transition__Group_4_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group_4_2__1_in_rule__Transition__Group_4_2__03461);
            rule__Transition__Group_4_2__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_4_2__0


    // $ANTLR start rule__Transition__Group_4_2__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1663:1: rule__Transition__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1667:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1668:1: ( ',' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1668:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1669:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Transition__Group_4_2__0__Impl3489); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getCommaKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_4_2__0__Impl


    // $ANTLR start rule__Transition__Group_4_2__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1682:1: rule__Transition__Group_4_2__1 : rule__Transition__Group_4_2__1__Impl ;
    public final void rule__Transition__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1686:1: ( rule__Transition__Group_4_2__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1687:2: rule__Transition__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_4_2__1__Impl_in_rule__Transition__Group_4_2__13520);
            rule__Transition__Group_4_2__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_4_2__1


    // $ANTLR start rule__Transition__Group_4_2__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1693:1: rule__Transition__Group_4_2__1__Impl : ( ( rule__Transition__EffectsAssignment_4_2_1 ) ) ;
    public final void rule__Transition__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1697:1: ( ( ( rule__Transition__EffectsAssignment_4_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1698:1: ( ( rule__Transition__EffectsAssignment_4_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1698:1: ( ( rule__Transition__EffectsAssignment_4_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1699:1: ( rule__Transition__EffectsAssignment_4_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEffectsAssignment_4_2_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1700:1: ( rule__Transition__EffectsAssignment_4_2_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1700:2: rule__Transition__EffectsAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Transition__EffectsAssignment_4_2_1_in_rule__Transition__Group_4_2__1__Impl3547);
            rule__Transition__EffectsAssignment_4_2_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getEffectsAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__Group_4_2__1__Impl


    // $ANTLR start rule__Emission__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1717:1: rule__Emission__Group__0 : rule__Emission__Group__0__Impl rule__Emission__Group__1 ;
    public final void rule__Emission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1721:1: ( rule__Emission__Group__0__Impl rule__Emission__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1722:2: rule__Emission__Group__0__Impl rule__Emission__Group__1
            {
            pushFollow(FOLLOW_rule__Emission__Group__0__Impl_in_rule__Emission__Group__03584);
            rule__Emission__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03587);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1729:1: rule__Emission__Group__0__Impl : ( ( rule__Emission__SignalAssignment_0 ) ) ;
    public final void rule__Emission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1733:1: ( ( ( rule__Emission__SignalAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1734:1: ( ( rule__Emission__SignalAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1734:1: ( ( rule__Emission__SignalAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1735:1: ( rule__Emission__SignalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1736:1: ( rule__Emission__SignalAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1736:2: rule__Emission__SignalAssignment_0
            {
            pushFollow(FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__0__Impl3614);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1746:1: rule__Emission__Group__1 : rule__Emission__Group__1__Impl ;
    public final void rule__Emission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1750:1: ( rule__Emission__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1751:2: rule__Emission__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group__1__Impl_in_rule__Emission__Group__13644);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1757:1: rule__Emission__Group__1__Impl : ( ( rule__Emission__Group_1__0 )? ) ;
    public final void rule__Emission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1761:1: ( ( ( rule__Emission__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1762:1: ( ( rule__Emission__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1762:1: ( ( rule__Emission__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1763:1: ( rule__Emission__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1764:1: ( rule__Emission__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1764:2: rule__Emission__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Emission__Group_1__0_in_rule__Emission__Group__1__Impl3671);
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
    // $ANTLR end rule__Emission__Group__1__Impl


    // $ANTLR start rule__Emission__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1778:1: rule__Emission__Group_1__0 : rule__Emission__Group_1__0__Impl rule__Emission__Group_1__1 ;
    public final void rule__Emission__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1782:1: ( rule__Emission__Group_1__0__Impl rule__Emission__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1783:2: rule__Emission__Group_1__0__Impl rule__Emission__Group_1__1
            {
            pushFollow(FOLLOW_rule__Emission__Group_1__0__Impl_in_rule__Emission__Group_1__03706);
            rule__Emission__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1__1_in_rule__Emission__Group_1__03709);
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


    // $ANTLR start rule__Emission__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1790:1: rule__Emission__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Emission__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1794:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1795:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1795:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1796:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Emission__Group_1__0__Impl3737); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emission__Group_1__0__Impl


    // $ANTLR start rule__Emission__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1809:1: rule__Emission__Group_1__1 : rule__Emission__Group_1__1__Impl rule__Emission__Group_1__2 ;
    public final void rule__Emission__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1813:1: ( rule__Emission__Group_1__1__Impl rule__Emission__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1814:2: rule__Emission__Group_1__1__Impl rule__Emission__Group_1__2
            {
            pushFollow(FOLLOW_rule__Emission__Group_1__1__Impl_in_rule__Emission__Group_1__13768);
            rule__Emission__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1__2_in_rule__Emission__Group_1__13771);
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


    // $ANTLR start rule__Emission__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1821:1: rule__Emission__Group_1__1__Impl : ( ( rule__Emission__NewValueAssignment_1_1 ) ) ;
    public final void rule__Emission__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1825:1: ( ( ( rule__Emission__NewValueAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1826:1: ( ( rule__Emission__NewValueAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1826:1: ( ( rule__Emission__NewValueAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1827:1: ( rule__Emission__NewValueAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1828:1: ( rule__Emission__NewValueAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1828:2: rule__Emission__NewValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_1_in_rule__Emission__Group_1__1__Impl3798);
            rule__Emission__NewValueAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emission__Group_1__1__Impl


    // $ANTLR start rule__Emission__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1838:1: rule__Emission__Group_1__2 : rule__Emission__Group_1__2__Impl ;
    public final void rule__Emission__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1842:1: ( rule__Emission__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1843:2: rule__Emission__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group_1__2__Impl_in_rule__Emission__Group_1__23828);
            rule__Emission__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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


    // $ANTLR start rule__Emission__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1849:1: rule__Emission__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Emission__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1853:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1854:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1854:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1855:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__Emission__Group_1__2__Impl3856); if (failed) return ;
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
    // $ANTLR end rule__Emission__Group_1__2__Impl


    // $ANTLR start rule__Assignment__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1874:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1878:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1879:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__03893);
            rule__Assignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03896);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1886:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariableAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1890:1: ( ( ( rule__Assignment__VariableAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1891:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1891:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1892:1: ( rule__Assignment__VariableAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1893:1: ( rule__Assignment__VariableAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1893:2: rule__Assignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl3923);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1903:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1907:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1908:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__13953);
            rule__Assignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13956);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1915:1: rule__Assignment__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1919:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1920:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1920:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1921:1: ':='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Assignment__Group__1__Impl3984); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1934:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1938:1: ( rule__Assignment__Group__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1939:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24015);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1945:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1949:1: ( ( ( rule__Assignment__ExpressionAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1950:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1950:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1951:1: ( rule__Assignment__ExpressionAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1952:1: ( rule__Assignment__ExpressionAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1952:2: rule__Assignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_in_rule__Assignment__Group__2__Impl4042);
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
    // $ANTLR end rule__Assignment__Group__2__Impl


    // $ANTLR start rule__TextEffect__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1968:1: rule__TextEffect__Group__0 : rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1 ;
    public final void rule__TextEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1972:1: ( rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1973:2: rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1
            {
            pushFollow(FOLLOW_rule__TextEffect__Group__0__Impl_in_rule__TextEffect__Group__04078);
            rule__TextEffect__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group__1_in_rule__TextEffect__Group__04081);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1980:1: rule__TextEffect__Group__0__Impl : ( ( rule__TextEffect__CodeAssignment_0 ) ) ;
    public final void rule__TextEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1984:1: ( ( ( rule__TextEffect__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1985:1: ( ( rule__TextEffect__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1985:1: ( ( rule__TextEffect__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1986:1: ( rule__TextEffect__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1987:1: ( rule__TextEffect__CodeAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1987:2: rule__TextEffect__CodeAssignment_0
            {
            pushFollow(FOLLOW_rule__TextEffect__CodeAssignment_0_in_rule__TextEffect__Group__0__Impl4108);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1997:1: rule__TextEffect__Group__1 : rule__TextEffect__Group__1__Impl ;
    public final void rule__TextEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2001:1: ( rule__TextEffect__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2002:2: rule__TextEffect__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextEffect__Group__1__Impl_in_rule__TextEffect__Group__14138);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2008:1: rule__TextEffect__Group__1__Impl : ( ( rule__TextEffect__Group_1__0 )? ) ;
    public final void rule__TextEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2012:1: ( ( ( rule__TextEffect__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2013:1: ( ( rule__TextEffect__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2013:1: ( ( rule__TextEffect__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2014:1: ( rule__TextEffect__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2015:1: ( rule__TextEffect__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2015:2: rule__TextEffect__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextEffect__Group_1__0_in_rule__TextEffect__Group__1__Impl4165);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2029:1: rule__TextEffect__Group_1__0 : rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1 ;
    public final void rule__TextEffect__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2033:1: ( rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2034:2: rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__0__Impl_in_rule__TextEffect__Group_1__04200);
            rule__TextEffect__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group_1__1_in_rule__TextEffect__Group_1__04203);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2041:1: rule__TextEffect__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextEffect__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2045:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2046:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2046:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2047:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__TextEffect__Group_1__0__Impl4231); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2060:1: rule__TextEffect__Group_1__1 : rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2 ;
    public final void rule__TextEffect__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2064:1: ( rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2065:2: rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__1__Impl_in_rule__TextEffect__Group_1__14262);
            rule__TextEffect__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group_1__2_in_rule__TextEffect__Group_1__14265);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2072:1: rule__TextEffect__Group_1__1__Impl : ( ( rule__TextEffect__TypeAssignment_1_1 ) ) ;
    public final void rule__TextEffect__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2076:1: ( ( ( rule__TextEffect__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2077:1: ( ( rule__TextEffect__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2077:1: ( ( rule__TextEffect__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2078:1: ( rule__TextEffect__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2079:1: ( rule__TextEffect__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2079:2: rule__TextEffect__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TextEffect__TypeAssignment_1_1_in_rule__TextEffect__Group_1__1__Impl4292);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2089:1: rule__TextEffect__Group_1__2 : rule__TextEffect__Group_1__2__Impl ;
    public final void rule__TextEffect__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2093:1: ( rule__TextEffect__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2094:2: rule__TextEffect__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__2__Impl_in_rule__TextEffect__Group_1__24322);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2100:1: rule__TextEffect__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextEffect__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2104:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2105:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2105:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2106:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__TextEffect__Group_1__2__Impl4350); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2125:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2129:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2130:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04387);
            rule__OrExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04390);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2137:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2141:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2142:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2142:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2143:1: ruleAndExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl4417);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2154:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2158:1: ( rule__OrExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2159:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14446);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2165:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2169:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2170:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2170:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2171:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2172:1: ( rule__OrExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2172:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4473);
            	    rule__OrExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2186:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2190:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2191:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04508);
            rule__OrExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04511);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2198:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2202:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2203:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2203:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2204:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2205:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2207:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2217:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2221:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2222:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14569);
            rule__OrExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__14572);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2229:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2233:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2234:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2234:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2235:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2236:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2236:2: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl4599);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2246:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2250:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2251:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__24629);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2257:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2261:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2262:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2262:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2263:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2264:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2264:2: rule__OrExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl4656);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2280:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2284:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2285:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__04692);
            rule__AndExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__04695);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2292:1: rule__AndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2296:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2297:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2297:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2298:1: ruleCompareOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl4722);
            ruleCompareOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2309:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2313:1: ( rule__AndExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2314:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__14751);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2320:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2324:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2325:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2325:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2326:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2327:1: ( rule__AndExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2327:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl4778);
            	    rule__AndExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2341:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2345:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2346:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__04813);
            rule__AndExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__04816);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2353:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2357:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2358:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2358:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2359:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2360:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2362:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2372:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2376:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2377:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__14874);
            rule__AndExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__14877);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2384:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2388:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2389:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2389:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2390:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2391:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2391:2: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl4904);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2401:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2405:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2406:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__24934);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2412:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2416:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2417:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2417:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2418:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2419:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2419:2: rule__AndExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl4961);
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


    // $ANTLR start rule__CompareOperation__Group_0__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2435:1: rule__CompareOperation__Group_0__0 : rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 ;
    public final void rule__CompareOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2439:1: ( rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2440:2: rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__04997);
            rule__CompareOperation__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__05000);
            rule__CompareOperation__Group_0__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_0__0


    // $ANTLR start rule__CompareOperation__Group_0__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2447:1: rule__CompareOperation__Group_0__0__Impl : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2451:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2452:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2452:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2453:1: ruleNotOrValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl5027);
            ruleNotOrValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_0__0__Impl


    // $ANTLR start rule__CompareOperation__Group_0__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2464:1: rule__CompareOperation__Group_0__1 : rule__CompareOperation__Group_0__1__Impl ;
    public final void rule__CompareOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2468:1: ( rule__CompareOperation__Group_0__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2469:2: rule__CompareOperation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__15056);
            rule__CompareOperation__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_0__1


    // $ANTLR start rule__CompareOperation__Group_0__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2475:1: rule__CompareOperation__Group_0__1__Impl : ( ( rule__CompareOperation__Group_0_1__0 ) ) ;
    public final void rule__CompareOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2479:1: ( ( ( rule__CompareOperation__Group_0_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2480:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2480:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2481:1: ( rule__CompareOperation__Group_0_1__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2482:1: ( rule__CompareOperation__Group_0_1__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2482:2: rule__CompareOperation__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl5083);
            rule__CompareOperation__Group_0_1__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_0__1__Impl


    // $ANTLR start rule__CompareOperation__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2496:1: rule__CompareOperation__Group_0_1__0 : rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 ;
    public final void rule__CompareOperation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2500:1: ( rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2501:2: rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__05117);
            rule__CompareOperation__Group_0_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__05120);
            rule__CompareOperation__Group_0_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_0_1__0


    // $ANTLR start rule__CompareOperation__Group_0_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2508:1: rule__CompareOperation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2512:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2513:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2513:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2514:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2515:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2517:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_0_1__0__Impl


    // $ANTLR start rule__CompareOperation__Group_0_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2527:1: rule__CompareOperation__Group_0_1__1 : rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 ;
    public final void rule__CompareOperation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2531:1: ( rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2532:2: rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__15178);
            rule__CompareOperation__Group_0_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__15181);
            rule__CompareOperation__Group_0_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_0_1__1


    // $ANTLR start rule__CompareOperation__Group_0_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2539:1: rule__CompareOperation__Group_0_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__CompareOperation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2543:1: ( ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2544:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2544:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2545:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2546:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2546:2: rule__CompareOperation__OperatorAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl5208);
            rule__CompareOperation__OperatorAssignment_0_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_0_1__1__Impl


    // $ANTLR start rule__CompareOperation__Group_0_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2556:1: rule__CompareOperation__Group_0_1__2 : rule__CompareOperation__Group_0_1__2__Impl ;
    public final void rule__CompareOperation__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2560:1: ( rule__CompareOperation__Group_0_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2561:2: rule__CompareOperation__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__25238);
            rule__CompareOperation__Group_0_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_0_1__2


    // $ANTLR start rule__CompareOperation__Group_0_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2567:1: rule__CompareOperation__Group_0_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) ;
    public final void rule__CompareOperation__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2571:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2572:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2572:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2573:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2574:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2574:2: rule__CompareOperation__SubExpressionsAssignment_0_1_2
            {
            pushFollow(FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl5265);
            rule__CompareOperation__SubExpressionsAssignment_0_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_0_1__2__Impl


    // $ANTLR start rule__AddExpression__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2590:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2594:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2595:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__05301);
            rule__AddExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__05304);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2602:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2606:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2607:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2607:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2608:1: ruleSubExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl5331);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2619:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2623:1: ( rule__AddExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2624:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__15360);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2630:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2634:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2635:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2635:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2636:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2637:1: ( rule__AddExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2637:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl5387);
            	    rule__AddExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2651:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2655:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2656:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__05422);
            rule__AddExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__05425);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2663:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2667:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2668:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2668:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2669:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2670:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2672:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2682:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2686:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2687:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__15483);
            rule__AddExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__15486);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2694:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2698:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2699:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2699:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2700:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2701:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2701:2: rule__AddExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl5513);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2711:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2715:1: ( rule__AddExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2716:2: rule__AddExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__25543);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2722:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2726:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2727:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2727:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2728:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2729:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2729:2: rule__AddExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl5570);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2745:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2749:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2750:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__05606);
            rule__SubExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__05609);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2757:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2761:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2762:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2762:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2763:1: ruleMultExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl5636);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2774:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2778:1: ( rule__SubExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2779:2: rule__SubExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__15665);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2785:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2789:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2790:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2790:1: ( ( rule__SubExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2791:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2792:1: ( rule__SubExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2792:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl5692);
            	    rule__SubExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2806:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2810:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2811:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__05727);
            rule__SubExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__05730);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2818:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2822:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2823:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2823:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2824:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2825:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2827:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2837:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2841:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2842:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__15788);
            rule__SubExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__15791);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2849:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2853:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2854:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2854:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2855:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2856:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2856:2: rule__SubExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl5818);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2866:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2870:1: ( rule__SubExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2871:2: rule__SubExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__25848);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2877:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2881:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2882:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2882:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2883:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2884:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2884:2: rule__SubExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5875);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2900:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2904:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2905:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05911);
            rule__MultExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05914);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2912:1: rule__MultExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2916:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2917:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2917:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2918:1: ruleModExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getModExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_rule__MultExpression__Group__0__Impl5941);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2929:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2933:1: ( rule__MultExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2934:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15970);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2940:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2944:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2945:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2945:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2946:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2947:1: ( rule__MultExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2947:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5997);
            	    rule__MultExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2961:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2965:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2966:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__06032);
            rule__MultExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__06035);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2973:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2977:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2978:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2978:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2979:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2980:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2982:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2992:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2996:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2997:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__16093);
            rule__MultExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__16096);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3004:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3008:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3009:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3009:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3010:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3011:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3011:2: rule__MultExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl6123);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3021:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3025:1: ( rule__MultExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3026:2: rule__MultExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__26153);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3032:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3036:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3037:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3037:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3038:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3039:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3039:2: rule__MultExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl6180);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3055:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3059:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3060:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__06216);
            rule__ModExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__06219);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3067:1: rule__ModExpression__Group__0__Impl : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3071:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3072:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3072:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3073:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__Group__0__Impl6246);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3084:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3088:1: ( rule__ModExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3089:2: rule__ModExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__16275);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3095:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3099:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3100:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3100:1: ( ( rule__ModExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3101:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3102:1: ( rule__ModExpression__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3102:2: rule__ModExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl6302);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3116:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3120:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3121:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__06337);
            rule__ModExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__06340);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3128:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3132:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3133:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3133:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3134:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3135:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3137:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3147:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3151:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3152:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__16398);
            rule__ModExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__16401);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3159:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3163:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3164:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3164:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3165:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3166:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3166:2: rule__ModExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl6428);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3176:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3180:1: ( rule__ModExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3181:2: rule__ModExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__26458);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3187:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3191:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3192:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3192:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3193:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3194:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3194:2: rule__ModExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl6485);
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


    // $ANTLR start rule__NotExpression__Group_0__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3210:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3214:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3215:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__06521);
            rule__NotExpression__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__06524);
            rule__NotExpression__Group_0__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_0__0


    // $ANTLR start rule__NotExpression__Group_0__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3222:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3226:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3227:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3227:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3228:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3229:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3231:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_0__0__Impl


    // $ANTLR start rule__NotExpression__Group_0__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3241:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3245:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3246:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__16582);
            rule__NotExpression__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__16585);
            rule__NotExpression__Group_0__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_0__1


    // $ANTLR start rule__NotExpression__Group_0__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3253:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3257:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3258:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3258:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3259:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3260:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3260:2: rule__NotExpression__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl6612);
            rule__NotExpression__OperatorAssignment_0_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_0__1__Impl


    // $ANTLR start rule__NotExpression__Group_0__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3270:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3274:1: ( rule__NotExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3275:2: rule__NotExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__26642);
            rule__NotExpression__Group_0__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_0__2


    // $ANTLR start rule__NotExpression__Group_0__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3281:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3285:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3286:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3286:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3287:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3288:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3288:2: rule__NotExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl6669);
            rule__NotExpression__SubExpressionsAssignment_0_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_0__2__Impl


    // $ANTLR start rule__AtomicExpression__Group_2__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3304:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3308:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3309:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__06705);
            rule__AtomicExpression__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__06708);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3316:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3320:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3321:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3321:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3322:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__AtomicExpression__Group_2__0__Impl6736); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__0__Impl


    // $ANTLR start rule__AtomicExpression__Group_2__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3335:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3339:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3340:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__16767);
            rule__AtomicExpression__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__16770);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3347:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3351:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3352:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3352:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3353:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_2__1__Impl6797);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_2_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3364:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3368:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3369:2: rule__AtomicExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__26826);
            rule__AtomicExpression__Group_2__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3375:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3379:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3380:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3380:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3381:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicExpression__Group_2__2__Impl6854); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__AtomicValuedExpression__Group_2__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3400:1: rule__AtomicValuedExpression__Group_2__0 : rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 ;
    public final void rule__AtomicValuedExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3404:1: ( rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3405:2: rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__06891);
            rule__AtomicValuedExpression__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__06894);
            rule__AtomicValuedExpression__Group_2__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_2__0


    // $ANTLR start rule__AtomicValuedExpression__Group_2__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3412:1: rule__AtomicValuedExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3416:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3417:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3417:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3418:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__AtomicValuedExpression__Group_2__0__Impl6922); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_2__0__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_2__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3431:1: rule__AtomicValuedExpression__Group_2__1 : rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 ;
    public final void rule__AtomicValuedExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3435:1: ( rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3436:2: rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__16953);
            rule__AtomicValuedExpression__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__16956);
            rule__AtomicValuedExpression__Group_2__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_2__1


    // $ANTLR start rule__AtomicValuedExpression__Group_2__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3443:1: rule__AtomicValuedExpression__Group_2__1__Impl : ( ruleDivExpression ) ;
    public final void rule__AtomicValuedExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3447:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3448:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3448:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3449:1: ruleDivExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getDivExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl6983);
            ruleDivExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getDivExpressionParserRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_2__1__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_2__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3460:1: rule__AtomicValuedExpression__Group_2__2 : rule__AtomicValuedExpression__Group_2__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3464:1: ( rule__AtomicValuedExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3465:2: rule__AtomicValuedExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__27012);
            rule__AtomicValuedExpression__Group_2__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_2__2


    // $ANTLR start rule__AtomicValuedExpression__Group_2__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3471:1: rule__AtomicValuedExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3475:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3476:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3476:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3477:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicValuedExpression__Group_2__2__Impl7040); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_2__2__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_3__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3496:1: rule__AtomicValuedExpression__Group_3__0 : rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 ;
    public final void rule__AtomicValuedExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3500:1: ( rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3501:2: rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_3__0__Impl_in_rule__AtomicValuedExpression__Group_3__07077);
            rule__AtomicValuedExpression__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_3__1_in_rule__AtomicValuedExpression__Group_3__07080);
            rule__AtomicValuedExpression__Group_3__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_3__0


    // $ANTLR start rule__AtomicValuedExpression__Group_3__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3508:1: rule__AtomicValuedExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3512:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3513:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3513:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3514:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__AtomicValuedExpression__Group_3__0__Impl7108); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_3__0__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_3__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3527:1: rule__AtomicValuedExpression__Group_3__1 : rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 ;
    public final void rule__AtomicValuedExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3531:1: ( rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3532:2: rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_3__1__Impl_in_rule__AtomicValuedExpression__Group_3__17139);
            rule__AtomicValuedExpression__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_3__2_in_rule__AtomicValuedExpression__Group_3__17142);
            rule__AtomicValuedExpression__Group_3__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_3__1


    // $ANTLR start rule__AtomicValuedExpression__Group_3__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3539:1: rule__AtomicValuedExpression__Group_3__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3543:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3544:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3544:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3545:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_3__1__Impl7169);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_3__1__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_3__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3556:1: rule__AtomicValuedExpression__Group_3__2 : rule__AtomicValuedExpression__Group_3__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3560:1: ( rule__AtomicValuedExpression__Group_3__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3561:2: rule__AtomicValuedExpression__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_3__2__Impl_in_rule__AtomicValuedExpression__Group_3__27198);
            rule__AtomicValuedExpression__Group_3__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_3__2


    // $ANTLR start rule__AtomicValuedExpression__Group_3__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3567:1: rule__AtomicValuedExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3571:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3572:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3572:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3573:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicValuedExpression__Group_3__2__Impl7226); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_3__2__Impl


    // $ANTLR start rule__DivExpression__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3592:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3596:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3597:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__07263);
            rule__DivExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__07266);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3604:1: rule__DivExpression__Group__0__Impl : ( ruleAtomicValuedExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3608:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3609:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3609:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3610:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__Group__0__Impl7293);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3621:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2 ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3625:1: ( rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3626:2: rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__17322);
            rule__DivExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivExpression__Group__2_in_rule__DivExpression__Group__17325);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3633:1: rule__DivExpression__Group__1__Impl : ( () ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3637:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3638:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3638:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3639:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3640:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3642:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3652:1: rule__DivExpression__Group__2 : rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3 ;
    public final void rule__DivExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3656:1: ( rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3657:2: rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__2__Impl_in_rule__DivExpression__Group__27383);
            rule__DivExpression__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivExpression__Group__3_in_rule__DivExpression__Group__27386);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3664:1: rule__DivExpression__Group__2__Impl : ( ( rule__DivExpression__OperatorAssignment_2 ) ) ;
    public final void rule__DivExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3668:1: ( ( ( rule__DivExpression__OperatorAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3669:1: ( ( rule__DivExpression__OperatorAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3669:1: ( ( rule__DivExpression__OperatorAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3670:1: ( rule__DivExpression__OperatorAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3671:1: ( rule__DivExpression__OperatorAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3671:2: rule__DivExpression__OperatorAssignment_2
            {
            pushFollow(FOLLOW_rule__DivExpression__OperatorAssignment_2_in_rule__DivExpression__Group__2__Impl7413);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3681:1: rule__DivExpression__Group__3 : rule__DivExpression__Group__3__Impl ;
    public final void rule__DivExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3685:1: ( rule__DivExpression__Group__3__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3686:2: rule__DivExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__3__Impl_in_rule__DivExpression__Group__37443);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3692:1: rule__DivExpression__Group__3__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_3 ) ) ;
    public final void rule__DivExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3696:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3697:1: ( ( rule__DivExpression__SubExpressionsAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3697:1: ( ( rule__DivExpression__SubExpressionsAssignment_3 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3698:1: ( rule__DivExpression__SubExpressionsAssignment_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3699:1: ( rule__DivExpression__SubExpressionsAssignment_3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3699:2: rule__DivExpression__SubExpressionsAssignment_3
            {
            pushFollow(FOLLOW_rule__DivExpression__SubExpressionsAssignment_3_in_rule__DivExpression__Group__3__Impl7470);
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


    // $ANTLR start rule__ValuedObjectTestExpression__Group_0__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3717:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3721:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3722:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__07508);
            rule__ValuedObjectTestExpression__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__07511);
            rule__ValuedObjectTestExpression__Group_0__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_0__0


    // $ANTLR start rule__ValuedObjectTestExpression__Group_0__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3729:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3733:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3734:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3734:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3735:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3736:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3738:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_0__0__Impl


    // $ANTLR start rule__ValuedObjectTestExpression__Group_0__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3748:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3752:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3753:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__17569);
            rule__ValuedObjectTestExpression__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__17572);
            rule__ValuedObjectTestExpression__Group_0__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_0__1


    // $ANTLR start rule__ValuedObjectTestExpression__Group_0__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3760:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3764:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3765:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3765:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3766:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3767:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3767:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl7599);
            rule__ValuedObjectTestExpression__OperatorAssignment_0_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_0__1__Impl


    // $ANTLR start rule__ValuedObjectTestExpression__Group_0__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3777:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3781:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3782:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__27629);
            rule__ValuedObjectTestExpression__Group_0__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__27632);
            rule__ValuedObjectTestExpression__Group_0__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_0__2


    // $ANTLR start rule__ValuedObjectTestExpression__Group_0__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3789:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3793:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3794:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3794:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3795:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ValuedObjectTestExpression__Group_0__2__Impl7660); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_0__2__Impl


    // $ANTLR start rule__ValuedObjectTestExpression__Group_0__3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3808:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3812:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3813:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__37691);
            rule__ValuedObjectTestExpression__Group_0__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__37694);
            rule__ValuedObjectTestExpression__Group_0__4();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_0__3


    // $ANTLR start rule__ValuedObjectTestExpression__Group_0__3__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3820:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3824:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3825:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3825:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3826:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3827:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3827:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl7721);
            rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_0__3__Impl


    // $ANTLR start rule__ValuedObjectTestExpression__Group_0__4
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3837:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3841:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3842:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__47751);
            rule__ValuedObjectTestExpression__Group_0__4__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_0__4


    // $ANTLR start rule__ValuedObjectTestExpression__Group_0__4__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3848:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3852:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3853:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3853:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3854:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,32,FOLLOW_32_in_rule__ValuedObjectTestExpression__Group_0__4__Impl7779); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_0__4__Impl


    // $ANTLR start rule__ValuedObjectTestExpression__Group_1__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3877:1: rule__ValuedObjectTestExpression__Group_1__0 : rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 ;
    public final void rule__ValuedObjectTestExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3881:1: ( rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3882:2: rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_1__0__Impl_in_rule__ValuedObjectTestExpression__Group_1__07820);
            rule__ValuedObjectTestExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_1__1_in_rule__ValuedObjectTestExpression__Group_1__07823);
            rule__ValuedObjectTestExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_1__0


    // $ANTLR start rule__ValuedObjectTestExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3889:1: rule__ValuedObjectTestExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3893:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3894:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3894:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3895:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3896:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3898:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_1__0__Impl


    // $ANTLR start rule__ValuedObjectTestExpression__Group_1__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3908:1: rule__ValuedObjectTestExpression__Group_1__1 : rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 ;
    public final void rule__ValuedObjectTestExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3912:1: ( rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3913:2: rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_1__1__Impl_in_rule__ValuedObjectTestExpression__Group_1__17881);
            rule__ValuedObjectTestExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_1__2_in_rule__ValuedObjectTestExpression__Group_1__17884);
            rule__ValuedObjectTestExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_1__1


    // $ANTLR start rule__ValuedObjectTestExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3920:1: rule__ValuedObjectTestExpression__Group_1__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3924:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3925:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3925:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3926:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3927:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3927:2: rule__ValuedObjectTestExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_1_1_in_rule__ValuedObjectTestExpression__Group_1__1__Impl7911);
            rule__ValuedObjectTestExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_1__1__Impl


    // $ANTLR start rule__ValuedObjectTestExpression__Group_1__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3937:1: rule__ValuedObjectTestExpression__Group_1__2 : rule__ValuedObjectTestExpression__Group_1__2__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3941:1: ( rule__ValuedObjectTestExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3942:2: rule__ValuedObjectTestExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_1__2__Impl_in_rule__ValuedObjectTestExpression__Group_1__27941);
            rule__ValuedObjectTestExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_1__2


    // $ANTLR start rule__ValuedObjectTestExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3948:1: rule__ValuedObjectTestExpression__Group_1__2__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3952:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3953:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3953:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3954:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3955:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3955:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2_in_rule__ValuedObjectTestExpression__Group_1__2__Impl7968);
            rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__Group_1__2__Impl


    // $ANTLR start rule__TextExpression__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3971:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3975:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3976:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
            {
            pushFollow(FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__08004);
            rule__TextExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__08007);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3983:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3987:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3988:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3988:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3989:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3990:1: ( rule__TextExpression__CodeAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3990:2: rule__TextExpression__CodeAssignment_0
            {
            pushFollow(FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl8034);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4000:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4004:1: ( rule__TextExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4005:2: rule__TextExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__18064);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4011:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4015:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4016:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4016:1: ( ( rule__TextExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4017:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4018:1: ( rule__TextExpression__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4018:2: rule__TextExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl8091);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4032:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4036:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4037:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__08126);
            rule__TextExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__08129);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4044:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4048:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4049:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4049:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4050:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__TextExpression__Group_1__0__Impl8157); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4063:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4067:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4068:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__18188);
            rule__TextExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__18191);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4075:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4079:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4080:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4080:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4081:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4082:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4082:2: rule__TextExpression__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl8218);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4092:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4096:1: ( rule__TextExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4097:2: rule__TextExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__28248);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4103:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4107:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4108:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4108:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4109:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__TextExpression__Group_1__2__Impl8276); if (failed) return ;
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


    // $ANTLR start rule__KeyValueAnnotation__Group__0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4128:1: rule__KeyValueAnnotation__Group__0 : rule__KeyValueAnnotation__Group__0__Impl rule__KeyValueAnnotation__Group__1 ;
    public final void rule__KeyValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4132:1: ( rule__KeyValueAnnotation__Group__0__Impl rule__KeyValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4133:2: rule__KeyValueAnnotation__Group__0__Impl rule__KeyValueAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__KeyValueAnnotation__Group__0__Impl_in_rule__KeyValueAnnotation__Group__08313);
            rule__KeyValueAnnotation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__KeyValueAnnotation__Group__1_in_rule__KeyValueAnnotation__Group__08316);
            rule__KeyValueAnnotation__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyValueAnnotation__Group__0


    // $ANTLR start rule__KeyValueAnnotation__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4140:1: rule__KeyValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4144:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4145:1: ( '@' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4145:1: ( '@' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4146:1: '@'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__KeyValueAnnotation__Group__0__Impl8344); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyValueAnnotation__Group__0__Impl


    // $ANTLR start rule__KeyValueAnnotation__Group__1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4159:1: rule__KeyValueAnnotation__Group__1 : rule__KeyValueAnnotation__Group__1__Impl rule__KeyValueAnnotation__Group__2 ;
    public final void rule__KeyValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4163:1: ( rule__KeyValueAnnotation__Group__1__Impl rule__KeyValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4164:2: rule__KeyValueAnnotation__Group__1__Impl rule__KeyValueAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__KeyValueAnnotation__Group__1__Impl_in_rule__KeyValueAnnotation__Group__18375);
            rule__KeyValueAnnotation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__KeyValueAnnotation__Group__2_in_rule__KeyValueAnnotation__Group__18378);
            rule__KeyValueAnnotation__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyValueAnnotation__Group__1


    // $ANTLR start rule__KeyValueAnnotation__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4171:1: rule__KeyValueAnnotation__Group__1__Impl : ( ( rule__KeyValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4175:1: ( ( ( rule__KeyValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4176:1: ( ( rule__KeyValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4176:1: ( ( rule__KeyValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4177:1: ( rule__KeyValueAnnotation__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4178:1: ( rule__KeyValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4178:2: rule__KeyValueAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KeyValueAnnotation__NameAssignment_1_in_rule__KeyValueAnnotation__Group__1__Impl8405);
            rule__KeyValueAnnotation__NameAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyValueAnnotation__Group__1__Impl


    // $ANTLR start rule__KeyValueAnnotation__Group__2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4188:1: rule__KeyValueAnnotation__Group__2 : rule__KeyValueAnnotation__Group__2__Impl ;
    public final void rule__KeyValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4192:1: ( rule__KeyValueAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4193:2: rule__KeyValueAnnotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__KeyValueAnnotation__Group__2__Impl_in_rule__KeyValueAnnotation__Group__28435);
            rule__KeyValueAnnotation__Group__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyValueAnnotation__Group__2


    // $ANTLR start rule__KeyValueAnnotation__Group__2__Impl
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4199:1: rule__KeyValueAnnotation__Group__2__Impl : ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4203:1: ( ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4204:1: ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4204:1: ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4205:1: ( rule__KeyValueAnnotation__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4206:1: ( rule__KeyValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4206:2: rule__KeyValueAnnotation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__KeyValueAnnotation__ValueAssignment_2_in_rule__KeyValueAnnotation__Group__2__Impl8462);
            rule__KeyValueAnnotation__ValueAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyValueAnnotation__Group__2__Impl


    // $ANTLR start rule__Transition__IsImmediateAssignment_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4223:1: rule__Transition__IsImmediateAssignment_1 : ( ( '#' ) ) ;
    public final void rule__Transition__IsImmediateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4227:1: ( ( ( '#' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4228:1: ( ( '#' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4228:1: ( ( '#' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4229:1: ( '#' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getIsImmediateNumberSignKeyword_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4230:1: ( '#' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4231:1: '#'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getIsImmediateNumberSignKeyword_1_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Transition__IsImmediateAssignment_18508); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getIsImmediateNumberSignKeyword_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getIsImmediateNumberSignKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__IsImmediateAssignment_1


    // $ANTLR start rule__Transition__DelayAssignment_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4246:1: rule__Transition__DelayAssignment_2 : ( RULE_INT ) ;
    public final void rule__Transition__DelayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4250:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4251:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4251:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4252:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Transition__DelayAssignment_28547); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__DelayAssignment_2


    // $ANTLR start rule__Transition__TriggerAssignment_3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4261:1: rule__Transition__TriggerAssignment_3 : ( ruleBooleanExpression ) ;
    public final void rule__Transition__TriggerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4265:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4266:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4266:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4267:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTriggerBooleanExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Transition__TriggerAssignment_38578);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTriggerBooleanExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__TriggerAssignment_3


    // $ANTLR start rule__Transition__EffectsAssignment_4_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4276:1: rule__Transition__EffectsAssignment_4_1 : ( ruleEffect ) ;
    public final void rule__Transition__EffectsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4280:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4281:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4281:1: ( ruleEffect )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4282:1: ruleEffect
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_rule__Transition__EffectsAssignment_4_18609);
            ruleEffect();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__EffectsAssignment_4_1


    // $ANTLR start rule__Transition__EffectsAssignment_4_2_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4291:1: rule__Transition__EffectsAssignment_4_2_1 : ( ruleEffect ) ;
    public final void rule__Transition__EffectsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4295:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4296:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4296:1: ( ruleEffect )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4297:1: ruleEffect
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_rule__Transition__EffectsAssignment_4_2_18640);
            ruleEffect();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Transition__EffectsAssignment_4_2_1


    // $ANTLR start rule__Emission__SignalAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4310:1: rule__Emission__SignalAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Emission__SignalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4314:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4315:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4315:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4316:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4317:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4318:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_08679); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4329:1: rule__Emission__NewValueAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4333:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4334:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4334:1: ( ruleExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4335:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Emission__NewValueAssignment_1_18714);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4344:1: rule__Assignment__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4348:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4349:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4349:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4350:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4351:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4352:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_08749); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4363:1: rule__Assignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4367:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4368:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4368:1: ( ruleExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4369:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Assignment__ExpressionAssignment_28784);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__TextEffect__CodeAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4378:1: rule__TextEffect__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextEffect__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4382:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4383:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4383:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4384:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextEffect__CodeAssignment_08815); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4393:1: rule__TextEffect__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextEffect__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4397:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4398:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4398:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4399:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextEffect__TypeAssignment_1_18846); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4408:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4412:1: ( ( ruleOrOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4413:1: ( ruleOrOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4413:1: ( ruleOrOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4414:1: ruleOrOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_18877);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4423:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4427:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4428:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4428:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4429:1: ruleAndExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_28908);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4438:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4442:1: ( ( ruleAndOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4443:1: ( ruleAndOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4443:1: ( ruleAndOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4444:1: ruleAndOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_18939);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4453:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4457:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4458:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4458:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4459:1: ruleCompareOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_28970);
            ruleCompareOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__CompareOperation__OperatorAssignment_0_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4468:1: rule__CompareOperation__OperatorAssignment_0_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4472:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4473:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4473:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4474:1: ruleCompareOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_19001);
            ruleCompareOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__OperatorAssignment_0_1_1


    // $ANTLR start rule__CompareOperation__SubExpressionsAssignment_0_1_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4483:1: rule__CompareOperation__SubExpressionsAssignment_0_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4487:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4488:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4488:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4489:1: ruleNotOrValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_29032);
            ruleNotOrValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__SubExpressionsAssignment_0_1_2


    // $ANTLR start rule__AddExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4498:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4502:1: ( ( ruleAddOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4503:1: ( ruleAddOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4503:1: ( ruleAddOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4504:1: ruleAddOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_19063);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4513:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4517:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4518:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4518:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4519:1: ruleSubExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_29094);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4528:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4532:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4533:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4533:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4534:1: ruleSubOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_19125);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4543:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4547:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4548:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4548:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4549:1: ruleMultExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_29156);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4558:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4562:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4563:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4563:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4564:1: ruleMultOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_19187);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4573:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4577:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4578:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4578:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4579:1: ruleModExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_rule__MultExpression__SubExpressionsAssignment_1_29218);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4588:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4592:1: ( ( ruleModOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4593:1: ( ruleModOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4593:1: ( ruleModOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4594:1: ruleModOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_19249);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4603:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4607:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4608:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4608:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4609:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_29280);
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


    // $ANTLR start rule__NotExpression__OperatorAssignment_0_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4618:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4622:1: ( ( ruleNotOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4623:1: ( ruleNotOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4623:1: ( ruleNotOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4624:1: ruleNotOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_19311);
            ruleNotOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__OperatorAssignment_0_1


    // $ANTLR start rule__NotExpression__SubExpressionsAssignment_0_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4633:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4637:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4638:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4638:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4639:1: ruleNotExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_29342);
            ruleNotExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__SubExpressionsAssignment_0_2


    // $ANTLR start rule__DivExpression__OperatorAssignment_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4648:1: rule__DivExpression__OperatorAssignment_2 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4652:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4653:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4653:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4654:1: ruleDivOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_29373);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4663:1: rule__DivExpression__SubExpressionsAssignment_3 : ( ruleAtomicValuedExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4667:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4668:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4668:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4669:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__SubExpressionsAssignment_39404);
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


    // $ANTLR start rule__ValuedObjectTestExpression__OperatorAssignment_0_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4678:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( rulePreOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4682:1: ( ( rulePreOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4683:1: ( rulePreOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4683:1: ( rulePreOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4684:1: rulePreOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_19435);
            rulePreOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__OperatorAssignment_0_1


    // $ANTLR start rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4693:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4697:1: ( ( ruleValuedObjectTestExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4698:1: ( ruleValuedObjectTestExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4698:1: ( ruleValuedObjectTestExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4699:1: ruleValuedObjectTestExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_39466);
            ruleValuedObjectTestExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3


    // $ANTLR start rule__ValuedObjectTestExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4708:1: rule__ValuedObjectTestExpression__OperatorAssignment_1_1 : ( ruleValueTestOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4712:1: ( ( ruleValueTestOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4713:1: ( ruleValueTestOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4713:1: ( ruleValueTestOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4714:1: ruleValueTestOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueTestOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_1_19497);
            ruleValueTestOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__OperatorAssignment_1_1


    // $ANTLR start rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4723:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 : ( ruleValuedObjectReference ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4727:1: ( ( ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4728:1: ( ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4728:1: ( ruleValuedObjectReference )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4729:1: ruleValuedObjectReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectReferenceParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_29528);
            ruleValuedObjectReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectReferenceParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__ValuedObjectReference__ValuedObjectAssignment
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4738:1: rule__ValuedObjectReference__ValuedObjectAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4742:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4743:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4743:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4744:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4745:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4746:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment9563); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValuedObjectReference__ValuedObjectAssignment


    // $ANTLR start rule__TextExpression__CodeAssignment_0
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4757:1: rule__TextExpression__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4761:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4762:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4762:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4763:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_09598); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4772:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4776:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4777:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4777:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4778:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_19629); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4787:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4791:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4792:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4792:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4793:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment9660); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4802:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4806:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4807:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4807:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4808:1: RULE_FLOAT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment9691); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4817:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4821:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4822:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4822:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4823:1: RULE_BOOLEAN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment9722); if (failed) return ;
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


    // $ANTLR start rule__CommentAnnotation__ValueAssignment
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4832:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4836:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4837:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4837:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4838:1: RULE_COMMENT_ANNOTATION
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment9753); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CommentAnnotation__ValueAssignment


    // $ANTLR start rule__KeyValueAnnotation__NameAssignment_1
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4847:1: rule__KeyValueAnnotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KeyValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4851:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4852:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4852:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4853:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KeyValueAnnotation__NameAssignment_19784); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyValueAnnotation__NameAssignment_1


    // $ANTLR start rule__KeyValueAnnotation__ValueAssignment_2
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4862:1: rule__KeyValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4866:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4867:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4867:1: ( ruleEString )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4868:1: ruleEString
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__KeyValueAnnotation__ValueAssignment_29815);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyValueAnnotation__ValueAssignment_2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1136:1: ( ( ruleBooleanExpression ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1136:1: ( ruleBooleanExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1136:1: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1137:1: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleBooleanExpression_in_synpred32316);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1158:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1158:1: ( ( rule__CompareOperation__Group_0__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1158:1: ( ( rule__CompareOperation__Group_0__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1159:1: ( rule__CompareOperation__Group_0__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:1: ( rule__CompareOperation__Group_0__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:2: rule__CompareOperation__Group_0__0
        {
        pushFollow(FOLLOW_rule__CompareOperation__Group_0__0_in_synpred42365);
        rule__CompareOperation__Group_0__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1180:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1180:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1180:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1181:1: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred52415);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1270:6: ( ( ( rule__AtomicValuedExpression__Group_2__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1270:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1270:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1271:1: ( rule__AtomicValuedExpression__Group_2__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1272:1: ( rule__AtomicValuedExpression__Group_2__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1272:2: rule__AtomicValuedExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred122632);
        rule__AtomicValuedExpression__Group_2__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1276:6: ( ( ( rule__AtomicValuedExpression__Group_3__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1276:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1276:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1277:1: ( rule__AtomicValuedExpression__Group_3__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:1: ( rule__AtomicValuedExpression__Group_3__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:2: rule__AtomicValuedExpression__Group_3__0
        {
        pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_synpred132650);
        rule__AtomicValuedExpression__Group_3__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13

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
    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
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


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\u00df\uffff";
    static final String DFA2_eofS =
        "\1\uffff\2\16\16\uffff\2\16\1\uffff\1\16\2\uffff\4\16\1\uffff\1"+
        "\16\2\uffff\4\16\1\uffff\1\16\2\uffff\4\16\1\uffff\1\16\2\uffff"+
        "\2\16\1\uffff\1\16\3\uffff\1\16\4\uffff\1\16\5\uffff\1\16\2\uffff"+
        "\2\16\1\uffff\1\16\2\uffff\2\16\1\uffff\2\16\1\uffff\1\16\2\uffff"+
        "\4\16\1\uffff\1\16\2\uffff\2\16\1\uffff\2\16\1\uffff\1\16\2\uffff"+
        "\4\16\1\uffff\1\16\2\uffff\4\16\1\uffff\1\16\2\uffff\2\16\1\uffff"+
        "\1\16\1\uffff\1\16\1\uffff\1\16\1\uffff\1\16\3\uffff\1\16\1\uffff"+
        "\1\16\1\uffff\1\16\3\uffff\1\16\4\uffff\1\16\1\uffff\1\16\2\uffff"+
        "\2\16\1\uffff\1\16\2\uffff\2\16\2\uffff\2\16\1\uffff\1\16\2\uffff"+
        "\2\16\1\uffff\2\16\1\uffff\1\16\2\uffff\4\16\1\uffff\1\16\2\uffff"+
        "\2\16\1\uffff\2\16\1\uffff\1\16\1\uffff\2\16\1\uffff\1\16\1\uffff"+
        "\1\16\1\uffff\1\16\3\uffff\1\16\1\uffff\1\16\3\uffff\2\16\1\uffff"+
        "\1\16\2\uffff\2\16\1\uffff\3\16\1\uffff\1\16\1\uffff\1\16\1\uffff"+
        "\1\16";
    static final String DFA2_minS =
        "\1\4\2\22\2\0\1\37\1\5\2\0\1\uffff\4\4\1\uffff\2\0\2\22\1\0\1\22"+
        "\1\37\1\5\4\22\1\0\1\22\1\37\1\5\4\22\1\0\1\22\1\37\1\5\4\22\1\0"+
        "\1\22\1\37\1\5\2\22\1\0\1\22\1\5\1\4\1\0\1\22\1\5\2\4\1\0\1\22\1"+
        "\5\3\4\1\0\1\22\1\5\1\40\2\22\1\0\1\22\1\37\1\5\2\22\1\40\2\22\1"+
        "\0\1\22\1\37\1\5\4\22\1\0\1\22\1\37\1\5\2\22\1\40\2\22\1\0\1\22"+
        "\1\37\1\5\4\22\1\0\1\22\1\37\1\5\4\22\1\0\1\22\1\37\1\5\2\22\1\40"+
        "\1\22\1\0\1\22\1\5\1\22\1\0\1\22\1\5\1\4\1\0\1\22\1\5\1\22\1\0\1"+
        "\22\1\5\1\4\1\0\1\22\1\5\2\4\1\0\1\22\1\5\1\22\2\40\2\22\1\0\1\22"+
        "\1\37\1\5\2\22\2\40\2\22\1\0\1\22\1\37\1\5\2\22\1\40\2\22\1\0\1"+
        "\22\1\37\1\5\4\22\1\0\1\22\1\37\1\5\2\22\1\40\2\22\1\0\1\22\1\5"+
        "\2\22\1\0\1\22\1\5\1\22\1\0\1\22\1\5\1\4\1\0\1\22\1\5\1\22\3\40"+
        "\2\22\1\0\1\22\1\37\1\5\2\22\1\40\3\22\1\0\1\22\1\5\1\22\1\40\1"+
        "\22";
    static final String DFA2_maxS =
        "\1\37\2\40\2\0\1\37\1\5\2\0\1\uffff\4\37\1\uffff\2\0\2\40\1\0\1"+
        "\40\1\37\1\5\4\40\1\0\1\40\1\37\1\5\4\40\1\0\1\40\1\37\1\5\4\40"+
        "\1\0\1\40\1\37\1\5\2\40\1\0\1\40\1\5\1\37\1\0\1\40\1\5\2\37\1\0"+
        "\1\40\1\5\3\37\1\0\1\40\1\5\3\40\1\0\1\40\1\37\1\5\5\40\1\0\1\40"+
        "\1\37\1\5\4\40\1\0\1\40\1\37\1\5\5\40\1\0\1\40\1\37\1\5\4\40\1\0"+
        "\1\40\1\37\1\5\4\40\1\0\1\40\1\37\1\5\4\40\1\0\1\40\1\5\1\40\1\0"+
        "\1\40\1\5\1\37\1\0\1\40\1\5\1\40\1\0\1\40\1\5\1\37\1\0\1\40\1\5"+
        "\2\37\1\0\1\40\1\5\5\40\1\0\1\40\1\37\1\5\6\40\1\0\1\40\1\37\1\5"+
        "\5\40\1\0\1\40\1\37\1\5\4\40\1\0\1\40\1\37\1\5\5\40\1\0\1\40\1\5"+
        "\2\40\1\0\1\40\1\5\1\40\1\0\1\40\1\5\1\37\1\0\1\40\1\5\6\40\1\0"+
        "\1\40\1\37\1\5\6\40\1\0\1\40\1\5\3\40";
    static final String DFA2_acceptS =
        "\11\uffff\1\1\4\uffff\1\2\u00d0\uffff";
    static final String DFA2_specialS =
        "\3\uffff\1\32\1\36\2\uffff\1\33\1\0\6\uffff\1\34\1\35\2\uffff\1"+
        "\42\7\uffff\1\30\7\uffff\1\31\7\uffff\1\3\5\uffff\1\16\3\uffff\1"+
        "\37\4\uffff\1\15\5\uffff\1\14\5\uffff\1\2\10\uffff\1\27\7\uffff"+
        "\1\25\10\uffff\1\43\7\uffff\1\6\7\uffff\1\26\7\uffff\1\40\3\uffff"+
        "\1\17\3\uffff\1\20\3\uffff\1\21\3\uffff\1\22\4\uffff\1\23\7\uffff"+
        "\1\7\11\uffff\1\4\10\uffff\1\5\7\uffff\1\10\10\uffff\1\24\4\uffff"+
        "\1\41\3\uffff\1\13\3\uffff\1\12\10\uffff\1\1\11\uffff\1\11\5\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\10\1\7\1\1\1\2\1\4\5\uffff\1\5\2\uffff\1\11\5\uffff\1\6\7"+
            "\uffff\1\3",
            "\1\15\1\14\1\13\1\12\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\13\1\12\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\17",
            "\1\20",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\30\1\27\1\21\1\22\1\24\5\uffff\1\25\10\uffff\1\26\7\uffff"+
            "\1\23",
            "\1\40\1\37\1\31\1\32\1\34\5\uffff\1\35\10\uffff\1\36\7\uffff"+
            "\1\33",
            "\1\50\1\47\1\41\1\42\1\44\5\uffff\1\45\10\uffff\1\46\7\uffff"+
            "\1\43",
            "\1\60\1\57\1\51\1\52\1\54\5\uffff\1\55\10\uffff\1\56\7\uffff"+
            "\1\53",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\15\1\14\1\13\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\13\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\14\1\13\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\61",
            "\1\62",
            "\1\15\1\14\1\13\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\13\3\uffff\6\11\1\16\1\63\1\16",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\65",
            "\1\66",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11\1\16\1\67\1\16",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\72",
            "\1\73",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11\1\16\1\74\1\16",
            "\1\15\1\77\1\76\1\75\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\76\1\75\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\77\1\76\1\75\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\100",
            "\1\101",
            "\1\15\1\77\1\76\1\75\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\76\1\75\2\uffff\6\11\1\16\1\102\1\16",
            "\1\uffff",
            "\1\15\1\14\1\13\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\103",
            "\1\113\1\112\1\104\1\105\1\107\5\uffff\1\110\10\uffff\1\111"+
            "\7\uffff\1\106",
            "\1\uffff",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\114",
            "\1\124\1\123\1\115\1\116\1\120\5\uffff\1\121\10\uffff\1\122"+
            "\7\uffff\1\117",
            "\1\134\1\133\1\125\1\126\1\130\5\uffff\1\131\10\uffff\1\132"+
            "\7\uffff\1\127",
            "\1\uffff",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\135",
            "\1\145\1\144\1\136\1\137\1\141\5\uffff\1\142\10\uffff\1\143"+
            "\7\uffff\1\140",
            "\1\155\1\154\1\146\1\147\1\151\5\uffff\1\152\10\uffff\1\153"+
            "\7\uffff\1\150",
            "\1\165\1\164\1\156\1\157\1\161\5\uffff\1\162\10\uffff\1\163"+
            "\7\uffff\1\160",
            "\1\uffff",
            "\1\15\1\77\1\76\1\75\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\166",
            "\1\167",
            "\1\15\1\14\1\13\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\13\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\14\1\13\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\170",
            "\1\171",
            "\1\15\1\14\1\13\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\13\3\uffff\6\11\1\16\1\172\1\16",
            "\1\173",
            "\1\15\1\14\1\71\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\71\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\14\1\71\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\174",
            "\1\175",
            "\1\15\1\14\1\71\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\71\3\uffff\6\11\1\16\1\176\1\16",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u0080",
            "\1\u0081",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11\1\16\1\u0082\1\16",
            "\1\u0083",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u0084",
            "\1\u0085",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\u0086\1\16",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u0088",
            "\1\u0089",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11\1\16\1\u008a\1\16",
            "\1\15\1\77\1\u008c\1\u008b\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\u008c\1\u008b\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\77\1\u008c\1\u008b\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u008d",
            "\1\u008e",
            "\1\15\1\77\1\u008c\1\u008b\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\u008c\1\u008b\2\uffff\6\11\1\16\1\u008f\1\16",
            "\1\u0090",
            "\1\15\1\14\1\13\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\14\1\13\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u0091",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\14\1\71\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u0092",
            "\1\u009a\1\u0099\1\u0093\1\u0094\1\u0096\5\uffff\1\u0097\10"+
            "\uffff\1\u0098\7\uffff\1\u0095",
            "\1\uffff",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u009b",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u009c",
            "\1\u00a4\1\u00a3\1\u009d\1\u009e\1\u00a0\5\uffff\1\u00a1\10"+
            "\uffff\1\u00a2\7\uffff\1\u009f",
            "\1\uffff",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00a5",
            "\1\u00ad\1\u00ac\1\u00a6\1\u00a7\1\u00a9\5\uffff\1\u00aa\10"+
            "\uffff\1\u00ab\7\uffff\1\u00a8",
            "\1\u00b5\1\u00b4\1\u00ae\1\u00af\1\u00b1\5\uffff\1\u00b2\10"+
            "\uffff\1\u00b3\7\uffff\1\u00b0",
            "\1\uffff",
            "\1\15\1\77\1\u008c\1\u008b\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00b6",
            "\1\15\1\77\1\76\1\75\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00b7",
            "\1\u00b8",
            "\1\15\1\14\1\71\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\71\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\14\1\71\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00b9",
            "\1\u00ba",
            "\1\15\1\14\1\71\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\71\3\uffff\6\11\1\16\1\u00bb\1\16",
            "\1\u00bc",
            "\1\u00bd",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00be",
            "\1\u00bf",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\u00c0\1\16",
            "\1\u00c1",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00c2",
            "\1\u00c3",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\16\1\u00c4\1\16",
            "\1\15\1\77\1\u008c\1\u00c5\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\u008c\1\u00c5\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\77\1\u008c\1\u00c5\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00c6",
            "\1\u00c7",
            "\1\15\1\77\1\u008c\1\u00c5\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\u008c\1\u00c5\2\uffff\6\11\1\16\1\u00c8\1\16",
            "\1\u00c9",
            "\1\15\1\14\1\13\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\14\1\71\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\14\1\71\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00ca",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00cb",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00cc",
            "\1\u00d4\1\u00d3\1\u00cd\1\u00ce\1\u00d0\5\uffff\1\u00d1\10"+
            "\uffff\1\u00d2\7\uffff\1\u00cf",
            "\1\uffff",
            "\1\15\1\77\1\u008c\1\u00c5\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00d5",
            "\1\15\1\77\1\u008c\1\u008b\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00d9",
            "\1\u00da",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\16\1\u00db\1\16",
            "\1\u00dc",
            "\1\15\1\14\1\71\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00dd",
            "\1\15\1\77\1\u008c\1\u00c5\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00de",
            "\1\15\1\77\1\u008c\3\uffff\6\11\1\16\1\uffff\1\16"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1131:1: rule__Expression__Alternatives : ( ( ruleBooleanExpression ) | ( ruleValuedExpression ) );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_207 = input.LA(1);

                         
                        int index2_207 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_207);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_70 = input.LA(1);

                         
                        int index2_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_70);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_43 = input.LA(1);

                         
                        int index2_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_43);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_159 = input.LA(1);

                         
                        int index2_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_159);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_168 = input.LA(1);

                         
                        int index2_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_168);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_104 = input.LA(1);

                         
                        int index2_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_104);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_149 = input.LA(1);

                         
                        int index2_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_149);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_176 = input.LA(1);

                         
                        int index2_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_176);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA2_217 = input.LA(1);

                         
                        int index2_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_217);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA2_198 = input.LA(1);

                         
                        int index2_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_198);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA2_194 = input.LA(1);

                         
                        int index2_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_194);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA2_64 = input.LA(1);

                         
                        int index2_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_64);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA2_58 = input.LA(1);

                         
                        int index2_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_58);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA2_49 = input.LA(1);

                         
                        int index2_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_49);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA2_124 = input.LA(1);

                         
                        int index2_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_124);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA2_128 = input.LA(1);

                         
                        int index2_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_128);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA2_132 = input.LA(1);

                         
                        int index2_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_132);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA2_136 = input.LA(1);

                         
                        int index2_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_136);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA2_141 = input.LA(1);

                         
                        int index2_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_141);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA2_185 = input.LA(1);

                         
                        int index2_185 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_185);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA2_87 = input.LA(1);

                         
                        int index2_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_87);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA2_112 = input.LA(1);

                         
                        int index2_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_112);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA2_79 = input.LA(1);

                         
                        int index2_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_79);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA2_27 = input.LA(1);

                         
                        int index2_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_27);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA2_35 = input.LA(1);

                         
                        int index2_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_35);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA2_15 = input.LA(1);

                         
                        int index2_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_15);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA2_16 = input.LA(1);

                         
                        int index2_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_16);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA2_53 = input.LA(1);

                         
                        int index2_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_53);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA2_120 = input.LA(1);

                         
                        int index2_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_120);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA2_190 = input.LA(1);

                         
                        int index2_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_190);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA2_19 = input.LA(1);

                         
                        int index2_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_19);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA2_96 = input.LA(1);

                         
                        int index2_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index2_96);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Alternatives_in_ruleEffect162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__0_in_ruleEmission222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__0_in_ruleTextEffect342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleBooleanExpression462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Alternatives_in_ruleCompareOperation641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotOrValuedExpression__Alternatives_in_ruleNotOrValuedExpression701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModExpression974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Alternatives_in_ruleValuedObjectTestExpression1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectReference__ValuedObjectAssignment_in_ruleValuedObjectReference1360 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyValueAnnotation1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__0_in_ruleKeyValueAnnotation1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePreOperator1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOrOperator1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAndOperator1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleNotOperator1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAddOperator2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSubOperator2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMultOperator2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleModOperator2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDivOperator2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleValueTestOperator2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_rule__Effect__Alternatives2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_rule__Effect__Alternatives2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_rule__AtomicValuedExpression__Alternatives2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_rule__AtomicValuedExpression__Alternatives2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__0_in_rule__ValuedObjectTestExpression__Alternatives2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CompareOperator__Alternatives2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CompareOperator__Alternatives2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompareOperator__Alternatives2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CompareOperator__Alternatives2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CompareOperator__Alternatives2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CompareOperator__Alternatives2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02960 = new BitSet(new long[]{0x0000000880C241F2L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__13021 = new BitSet(new long[]{0x0000000080C241F2L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__13024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__IsImmediateAssignment_1_in_rule__Transition__Group__1__Impl3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23082 = new BitSet(new long[]{0x0000000080C241F2L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__23085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__DelayAssignment_2_in_rule__Transition__Group__2__Impl3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__33143 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__33146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TriggerAssignment_3_in_rule__Transition__Group__3__Impl3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__43204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__03272 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__03275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Transition__Group_4__0__Impl3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__13334 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__2_in_rule__Transition__Group_4__13337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EffectsAssignment_4_1_in_rule__Transition__Group_4__1__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__2__Impl_in_rule__Transition__Group_4__23394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4_2__0_in_rule__Transition__Group_4__2__Impl3421 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4_2__0__Impl_in_rule__Transition__Group_4_2__03458 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Transition__Group_4_2__1_in_rule__Transition__Group_4_2__03461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Transition__Group_4_2__0__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4_2__1__Impl_in_rule__Transition__Group_4_2__13520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EffectsAssignment_4_2_1_in_rule__Transition__Group_4_2__1__Impl3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__0__Impl_in_rule__Emission__Group__03584 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__0__Impl3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1__Impl_in_rule__Emission__Group__13644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__0_in_rule__Emission__Group__1__Impl3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__0__Impl_in_rule__Emission__Group_1__03706 = new BitSet(new long[]{0x00000000808241F0L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__1_in_rule__Emission__Group_1__03709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Emission__Group_1__0__Impl3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__1__Impl_in_rule__Emission__Group_1__13768 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__2_in_rule__Emission__Group_1__13771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_1_in_rule__Emission__Group_1__1__Impl3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__2__Impl_in_rule__Emission__Group_1__23828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Emission__Group_1__2__Impl3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__03893 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__13953 = new BitSet(new long[]{0x00000000808241F0L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Assignment__Group__1__Impl3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_in_rule__Assignment__Group__2__Impl4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__0__Impl_in_rule__TextEffect__Group__04078 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__1_in_rule__TextEffect__Group__04081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__CodeAssignment_0_in_rule__TextEffect__Group__0__Impl4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__1__Impl_in_rule__TextEffect__Group__14138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__0_in_rule__TextEffect__Group__1__Impl4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__0__Impl_in_rule__TextEffect__Group_1__04200 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__1_in_rule__TextEffect__Group_1__04203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TextEffect__Group_1__0__Impl4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__1__Impl_in_rule__TextEffect__Group_1__14262 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__2_in_rule__TextEffect__Group_1__14265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__TypeAssignment_1_1_in_rule__TextEffect__Group_1__1__Impl4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__2__Impl_in_rule__TextEffect__Group_1__24322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TextEffect__Group_1__2__Impl4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04387 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4473 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04508 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14569 = new BitSet(new long[]{0x00000000808241F0L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__14572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__24629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__04692 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__04695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__14751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl4778 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__04813 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__04816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__14874 = new BitSet(new long[]{0x00000000808241F0L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__14877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__24934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__04997 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__05000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__15056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__05117 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__05120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__15178 = new BitSet(new long[]{0x00000000808241F0L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__15181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__25238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__05301 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__05304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__15360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl5387 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__05422 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__05425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__15483 = new BitSet(new long[]{0x00000000808041F0L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__15486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__25543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__05606 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__05609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__15665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl5692 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__05727 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__05730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__15788 = new BitSet(new long[]{0x00000000808041F0L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__15791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl5818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__25848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05911 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_rule__MultExpression__Group__0__Impl5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5997 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__06032 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__06035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__16093 = new BitSet(new long[]{0x00000000808041F0L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__16096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__26153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl6180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__06216 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__06219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__Group__0__Impl6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__16275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__06337 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__06340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__16398 = new BitSet(new long[]{0x00000000808041F0L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__16401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__26458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__06521 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__06524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__16582 = new BitSet(new long[]{0x0000000080824130L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__16585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl6612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__26642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__06705 = new BitSet(new long[]{0x00000000808241F0L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__06708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AtomicExpression__Group_2__0__Impl6736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__16767 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__16770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_2__1__Impl6797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__26826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicExpression__Group_2__2__Impl6854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__06891 = new BitSet(new long[]{0x00000000808041F0L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__06894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AtomicValuedExpression__Group_2__0__Impl6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__16953 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__16956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__27012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicValuedExpression__Group_2__2__Impl7040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0__Impl_in_rule__AtomicValuedExpression__Group_3__07077 = new BitSet(new long[]{0x00000000808041F0L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__1_in_rule__AtomicValuedExpression__Group_3__07080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AtomicValuedExpression__Group_3__0__Impl7108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__1__Impl_in_rule__AtomicValuedExpression__Group_3__17139 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__2_in_rule__AtomicValuedExpression__Group_3__17142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_3__1__Impl7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__2__Impl_in_rule__AtomicValuedExpression__Group_3__27198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicValuedExpression__Group_3__2__Impl7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__07263 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__07266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__Group__0__Impl7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__17322 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__2_in_rule__DivExpression__Group__17325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__2__Impl_in_rule__DivExpression__Group__27383 = new BitSet(new long[]{0x00000000808041F0L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__3_in_rule__DivExpression__Group__27386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__OperatorAssignment_2_in_rule__DivExpression__Group__2__Impl7413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__3__Impl_in_rule__DivExpression__Group__37443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__SubExpressionsAssignment_3_in_rule__DivExpression__Group__3__Impl7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__07508 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__07511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__17569 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__17572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl7599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__27629 = new BitSet(new long[]{0x0000000000804020L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__27632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ValuedObjectTestExpression__Group_0__2__Impl7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__37691 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__37694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__47751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ValuedObjectTestExpression__Group_0__4__Impl7779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__0__Impl_in_rule__ValuedObjectTestExpression__Group_1__07820 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__1_in_rule__ValuedObjectTestExpression__Group_1__07823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__1__Impl_in_rule__ValuedObjectTestExpression__Group_1__17881 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__2_in_rule__ValuedObjectTestExpression__Group_1__17884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_1_1_in_rule__ValuedObjectTestExpression__Group_1__1__Impl7911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__2__Impl_in_rule__ValuedObjectTestExpression__Group_1__27941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2_in_rule__ValuedObjectTestExpression__Group_1__2__Impl7968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__08004 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__08007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl8034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__18064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl8091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__08126 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__08129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TextExpression__Group_1__0__Impl8157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__18188 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__18191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__28248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TextExpression__Group_1__2__Impl8276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__0__Impl_in_rule__KeyValueAnnotation__Group__08313 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__1_in_rule__KeyValueAnnotation__Group__08316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__KeyValueAnnotation__Group__0__Impl8344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__1__Impl_in_rule__KeyValueAnnotation__Group__18375 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__2_in_rule__KeyValueAnnotation__Group__18378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__NameAssignment_1_in_rule__KeyValueAnnotation__Group__1__Impl8405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__2__Impl_in_rule__KeyValueAnnotation__Group__28435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__ValueAssignment_2_in_rule__KeyValueAnnotation__Group__2__Impl8462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Transition__IsImmediateAssignment_18508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Transition__DelayAssignment_28547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Transition__TriggerAssignment_38578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__Transition__EffectsAssignment_4_18609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__Transition__EffectsAssignment_4_2_18640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_08679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Emission__NewValueAssignment_1_18714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_08749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Assignment__ExpressionAssignment_28784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextEffect__CodeAssignment_08815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextEffect__TypeAssignment_1_18846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_18877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_28908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_18939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_28970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_19001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_29032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_19063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_29094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_19125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_29156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_19187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_rule__MultExpression__SubExpressionsAssignment_1_29218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_19249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_29280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_19311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_29342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_29373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__SubExpressionsAssignment_39404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_19435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_39466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_1_19497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_29528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment9563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_09598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_19629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment9660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment9691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment9722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment9753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KeyValueAnnotation__NameAssignment_19784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__KeyValueAnnotation__ValueAssignment_29815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred32316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_synpred42365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred52415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred122632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_synpred132650 = new BitSet(new long[]{0x0000000000000002L});

}