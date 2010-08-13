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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_HOSTCODE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'/'", "'?'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "','", "'('", "')'", "':='", "'@'", "'#'"
    };
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_ID=5;
    public static final int RULE_WS=13;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_COMMENT_ANNOTATION=9;
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_HOSTCODE=10;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:854:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:855:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:856:1: ruleEString EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1753);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1760); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:863:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:867:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:868:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:868:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:869:1: ( rule__EString__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:870:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:870:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString1786);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:883:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:887:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:888:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:888:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:889:1: ( rule__CompareOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:890:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:890:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1823);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:902:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:906:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:907:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:907:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:908:1: ( 'pre' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:909:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:909:3: 'pre'
            {
            match(input,15,FOLLOW_15_in_rulePreOperator1860); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:922:1: ruleOrOperator : ( ( 'or' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:926:1: ( ( ( 'or' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:927:1: ( ( 'or' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:927:1: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:928:1: ( 'or' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:929:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:929:3: 'or'
            {
            match(input,16,FOLLOW_16_in_ruleOrOperator1899); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:942:1: ruleAndOperator : ( ( 'and' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:946:1: ( ( ( 'and' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:947:1: ( ( 'and' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:947:1: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:948:1: ( 'and' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:949:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:949:3: 'and'
            {
            match(input,17,FOLLOW_17_in_ruleAndOperator1938); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:962:1: ruleNotOperator : ( ( 'not' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:966:1: ( ( ( 'not' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:967:1: ( ( 'not' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:967:1: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:968:1: ( 'not' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:969:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:969:3: 'not'
            {
            match(input,18,FOLLOW_18_in_ruleNotOperator1977); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:982:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:986:1: ( ( ( '+' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:987:1: ( ( '+' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:987:1: ( ( '+' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:988:1: ( '+' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:989:1: ( '+' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:989:3: '+'
            {
            match(input,19,FOLLOW_19_in_ruleAddOperator2016); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1002:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1006:1: ( ( ( '-' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1007:1: ( ( '-' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1007:1: ( ( '-' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1008:1: ( '-' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1009:1: ( '-' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1009:3: '-'
            {
            match(input,20,FOLLOW_20_in_ruleSubOperator2055); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1022:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1026:1: ( ( ( '*' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1027:1: ( ( '*' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1027:1: ( ( '*' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1028:1: ( '*' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1029:1: ( '*' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1029:3: '*'
            {
            match(input,21,FOLLOW_21_in_ruleMultOperator2094); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1042:1: ruleModOperator : ( ( 'mod' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1046:1: ( ( ( 'mod' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1047:1: ( ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1047:1: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1048:1: ( 'mod' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1049:1: ( 'mod' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1049:3: 'mod'
            {
            match(input,22,FOLLOW_22_in_ruleModOperator2133); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1062:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1066:1: ( ( ( '/' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1067:1: ( ( '/' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1067:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1068:1: ( '/' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1069:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1069:3: '/'
            {
            match(input,23,FOLLOW_23_in_ruleDivOperator2172); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1082:1: ruleValueTestOperator : ( ( '?' ) ) ;
    public final void ruleValueTestOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1086:1: ( ( ( '?' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1087:1: ( ( '?' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1087:1: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1088:1: ( '?' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1089:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1089:3: '?'
            {
            match(input,24,FOLLOW_24_in_ruleValueTestOperator2211); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1105:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1109:1: ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==34) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||(LA1_1>=31 && LA1_1<=32)) ) {
                    alt1=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1105:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1105:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1110:1: ( ruleEmission )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1110:1: ( ruleEmission )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1111:1: ruleEmission
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEmission_in_rule__Effect__Alternatives2252);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1116:6: ( ruleAssignment )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1116:6: ( ruleAssignment )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1117:1: ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2269);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1122:6: ( ruleTextEffect )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1122:6: ( ruleTextEffect )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1123:1: ruleTextEffect
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleTextEffect_in_rule__Effect__Alternatives2286);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1133:1: rule__Expression__Alternatives : ( ( ruleBooleanExpression ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1137:1: ( ( ruleBooleanExpression ) | ( ruleValuedExpression ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1138:1: ( ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1138:1: ( ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1139:1: ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2318);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1144:6: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1144:6: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1145:1: ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2335);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1155:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );
    public final void rule__CompareOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1159:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt3=1;
                }
                break;
            case 32:
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
                        new NoViableAltException("1155:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA3_3 = input.LA(2);

                if ( ((LA3_3>=19 && LA3_3<=22)||(LA3_3>=25 && LA3_3<=30)) ) {
                    alt3=1;
                }
                else if ( (LA3_3==EOF||(LA3_3>=16 && LA3_3<=17)||LA3_3==23||LA3_3==31||LA3_3==33) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1155:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==32) ) {
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
                            new NoViableAltException("1155:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 11, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1155:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5==RULE_ID) ) {
                    int LA3_12 = input.LA(3);

                    if ( (LA3_12==EOF||(LA3_12>=16 && LA3_12<=17)||LA3_12==23||LA3_12==31||LA3_12==33) ) {
                        alt3=2;
                    }
                    else if ( ((LA3_12>=19 && LA3_12<=22)||(LA3_12>=25 && LA3_12<=30)) ) {
                        alt3=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1155:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 12, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1155:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA3_6 = input.LA(2);

                if ( ((LA3_6>=19 && LA3_6<=22)||(LA3_6>=25 && LA3_6<=30)) ) {
                    alt3=1;
                }
                else if ( (LA3_6==EOF||(LA3_6>=16 && LA3_6<=17)||LA3_6==23||LA3_6==31||LA3_6==33) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1155:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    int LA3_13 = input.LA(3);

                    if ( (LA3_13==RULE_ID) ) {
                        int LA3_14 = input.LA(4);

                        if ( (LA3_14==33) ) {
                            int LA3_15 = input.LA(5);

                            if ( ((LA3_15>=19 && LA3_15<=22)||(LA3_15>=25 && LA3_15<=30)) ) {
                                alt3=1;
                            }
                            else if ( (LA3_15==EOF||(LA3_15>=16 && LA3_15<=17)||LA3_15==23||LA3_15==31||LA3_15==33) ) {
                                alt3=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1155:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1155:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 14, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1155:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case 19:
                case 20:
                case 21:
                case 22:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                    {
                    alt3=1;
                    }
                    break;
                case EOF:
                case 16:
                case 17:
                case 23:
                case 31:
                case 33:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1155:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 7, input);

                    throw nvae;
                }

                }
                break;
            case 18:
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
                        new NoViableAltException("1155:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 8, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1155:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1161:1: ( rule__CompareOperation__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1162:1: ( rule__CompareOperation__Group_0__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1162:2: rule__CompareOperation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives2367);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1166:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1166:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1167:1: ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2385);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1177:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1181:1: ( ( ruleValuedExpression ) | ( ruleNotExpression ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt4=1;
                }
                break;
            case 32:
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
                        new NoViableAltException("1177:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 2, input);

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
                        new NoViableAltException("1177:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==32) ) {
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
                            new NoViableAltException("1177:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 9, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1177:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 24:
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
                            new NoViableAltException("1177:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 10, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1177:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 5, input);

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
                        new NoViableAltException("1177:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 6, input);

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
                        new NoViableAltException("1177:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 7, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1177:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1182:1: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1182:1: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1183:1: ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2417);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1188:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1188:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1189:1: ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2434);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1199:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1203:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||LA5_0==RULE_BOOLEAN||LA5_0==15||LA5_0==24||LA5_0==32) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1199:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1204:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1204:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1205:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1206:1: ( rule__NotExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1206:2: rule__NotExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2466);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1210:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1210:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1211:1: ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2484);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1221:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1225:1: ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
            case 15:
            case 24:
                {
                alt6=2;
                }
                break;
            case 32:
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
                    new NoViableAltException("1221:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1226:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1226:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1227:1: ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives2516);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1232:6: ( ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1232:6: ( ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1233:1: ruleValuedObjectTestExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives2533);
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
                    pushFollow(FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2550);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1244:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1244:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1245:1: ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives2568);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1255:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1259:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) )
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
            case 32:
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
                        new NoViableAltException("1255:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_BOOLEAN:
            case 15:
            case 24:
                {
                alt7=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1255:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1260:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1260:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1261:1: ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2600);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1266:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1266:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1267:1: ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2617);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1272:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1272:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1273:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1274:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1274:2: rule__AtomicValuedExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_rule__AtomicValuedExpression__Alternatives2634);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1279:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1280:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1280:2: rule__AtomicValuedExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_rule__AtomicValuedExpression__Alternatives2652);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1284:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1284:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1285:1: ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives2670);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1295:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1299:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 24:
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
                    new NoViableAltException("1295:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ( rule__ValuedObjectTestExpression__Group_1__0 ) ) | ( ruleValuedObjectReference ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1300:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1300:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1301:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1302:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1302:2: rule__ValuedObjectTestExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives2702);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1306:6: ( ( rule__ValuedObjectTestExpression__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1306:6: ( ( rule__ValuedObjectTestExpression__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1307:1: ( rule__ValuedObjectTestExpression__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1308:1: ( rule__ValuedObjectTestExpression__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1308:2: rule__ValuedObjectTestExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_1__0_in_rule__ValuedObjectTestExpression__Alternatives2720);
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
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1312:6: ( ruleValuedObjectReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1312:6: ( ruleValuedObjectReference )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1313:1: ruleValuedObjectReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives2738);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1325:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1329:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    new NoViableAltException("1325:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1330:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1330:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1331:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives2772); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1336:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1336:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1337:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives2789); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1347:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1351:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
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
                    new NoViableAltException("1347:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1352:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1352:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1353:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1354:1: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1354:3: '='
                    {
                    match(input,25,FOLLOW_25_in_rule__CompareOperator__Alternatives2822); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1359:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1359:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1360:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1361:1: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1361:3: '<'
                    {
                    match(input,26,FOLLOW_26_in_rule__CompareOperator__Alternatives2843); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1366:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1366:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1367:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1368:1: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1368:3: '<='
                    {
                    match(input,27,FOLLOW_27_in_rule__CompareOperator__Alternatives2864); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1373:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1373:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1374:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1375:1: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1375:3: '>'
                    {
                    match(input,28,FOLLOW_28_in_rule__CompareOperator__Alternatives2885); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1380:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1380:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1381:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1382:1: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1382:3: '>='
                    {
                    match(input,29,FOLLOW_29_in_rule__CompareOperator__Alternatives2906); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1387:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1387:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1388:1: ( '<>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1389:1: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1389:3: '<>'
                    {
                    match(input,30,FOLLOW_30_in_rule__CompareOperator__Alternatives2927); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1403:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1407:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1408:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02962);
            rule__Transition__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02965);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1415:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1419:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1420:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1420:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1421:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1422:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1424:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1434:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1438:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1439:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__13023);
            rule__Transition__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__13026);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1446:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__IsImmediateAssignment_1 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1450:1: ( ( ( rule__Transition__IsImmediateAssignment_1 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1451:1: ( ( rule__Transition__IsImmediateAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1451:1: ( ( rule__Transition__IsImmediateAssignment_1 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1452:1: ( rule__Transition__IsImmediateAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getIsImmediateAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1453:1: ( rule__Transition__IsImmediateAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1453:2: rule__Transition__IsImmediateAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Transition__IsImmediateAssignment_1_in_rule__Transition__Group__1__Impl3053);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1463:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1467:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1468:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23084);
            rule__Transition__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__23087);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1475:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__DelayAssignment_2 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1479:1: ( ( ( rule__Transition__DelayAssignment_2 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1480:1: ( ( rule__Transition__DelayAssignment_2 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1480:1: ( ( rule__Transition__DelayAssignment_2 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1481:1: ( rule__Transition__DelayAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getDelayAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1482:1: ( rule__Transition__DelayAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||(LA12_1>=RULE_STRING && LA12_1<=RULE_BOOLEAN)||LA12_1==15||LA12_1==18||(LA12_1>=23 && LA12_1<=24)||LA12_1==32) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1482:2: rule__Transition__DelayAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Transition__DelayAssignment_2_in_rule__Transition__Group__2__Impl3114);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1492:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1496:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1497:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__33145);
            rule__Transition__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__33148);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1504:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__TriggerAssignment_3 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1508:1: ( ( ( rule__Transition__TriggerAssignment_3 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1509:1: ( ( rule__Transition__TriggerAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1509:1: ( ( rule__Transition__TriggerAssignment_3 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1510:1: ( rule__Transition__TriggerAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTriggerAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1511:1: ( rule__Transition__TriggerAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_BOOLEAN)||LA13_0==15||LA13_0==18||LA13_0==24||LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1511:2: rule__Transition__TriggerAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Transition__TriggerAssignment_3_in_rule__Transition__Group__3__Impl3175);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1521:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1525:1: ( rule__Transition__Group__4__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1526:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__43206);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1532:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1536:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1537:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1537:1: ( ( rule__Transition__Group_4__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1538:1: ( rule__Transition__Group_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup_4()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1539:1: ( rule__Transition__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1539:2: rule__Transition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl3233);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1559:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1563:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1564:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__03274);
            rule__Transition__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__03277);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1571:1: rule__Transition__Group_4__0__Impl : ( '/' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1575:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1576:1: ( '/' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1576:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1577:1: '/'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getSolidusKeyword_4_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Transition__Group_4__0__Impl3305); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1590:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1594:1: ( rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1595:2: rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2
            {
            pushFollow(FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__13336);
            rule__Transition__Group_4__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group_4__2_in_rule__Transition__Group_4__13339);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1602:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__EffectsAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1606:1: ( ( ( rule__Transition__EffectsAssignment_4_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1607:1: ( ( rule__Transition__EffectsAssignment_4_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1607:1: ( ( rule__Transition__EffectsAssignment_4_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1608:1: ( rule__Transition__EffectsAssignment_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEffectsAssignment_4_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1609:1: ( rule__Transition__EffectsAssignment_4_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1609:2: rule__Transition__EffectsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Transition__EffectsAssignment_4_1_in_rule__Transition__Group_4__1__Impl3366);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1619:1: rule__Transition__Group_4__2 : rule__Transition__Group_4__2__Impl ;
    public final void rule__Transition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1623:1: ( rule__Transition__Group_4__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1624:2: rule__Transition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_4__2__Impl_in_rule__Transition__Group_4__23396);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1630:1: rule__Transition__Group_4__2__Impl : ( ( rule__Transition__Group_4_2__0 )* ) ;
    public final void rule__Transition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1634:1: ( ( ( rule__Transition__Group_4_2__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1635:1: ( ( rule__Transition__Group_4_2__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1635:1: ( ( rule__Transition__Group_4_2__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1636:1: ( rule__Transition__Group_4_2__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup_4_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1637:1: ( rule__Transition__Group_4_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1637:2: rule__Transition__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Transition__Group_4_2__0_in_rule__Transition__Group_4__2__Impl3423);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1653:1: rule__Transition__Group_4_2__0 : rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 ;
    public final void rule__Transition__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1657:1: ( rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1658:2: rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_4_2__0__Impl_in_rule__Transition__Group_4_2__03460);
            rule__Transition__Group_4_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group_4_2__1_in_rule__Transition__Group_4_2__03463);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1665:1: rule__Transition__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1669:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1670:1: ( ',' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1670:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1671:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Transition__Group_4_2__0__Impl3491); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1684:1: rule__Transition__Group_4_2__1 : rule__Transition__Group_4_2__1__Impl ;
    public final void rule__Transition__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1688:1: ( rule__Transition__Group_4_2__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1689:2: rule__Transition__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_4_2__1__Impl_in_rule__Transition__Group_4_2__13522);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1695:1: rule__Transition__Group_4_2__1__Impl : ( ( rule__Transition__EffectsAssignment_4_2_1 ) ) ;
    public final void rule__Transition__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1699:1: ( ( ( rule__Transition__EffectsAssignment_4_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1700:1: ( ( rule__Transition__EffectsAssignment_4_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1700:1: ( ( rule__Transition__EffectsAssignment_4_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1701:1: ( rule__Transition__EffectsAssignment_4_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEffectsAssignment_4_2_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1702:1: ( rule__Transition__EffectsAssignment_4_2_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1702:2: rule__Transition__EffectsAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Transition__EffectsAssignment_4_2_1_in_rule__Transition__Group_4_2__1__Impl3549);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1719:1: rule__Emission__Group__0 : rule__Emission__Group__0__Impl rule__Emission__Group__1 ;
    public final void rule__Emission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1723:1: ( rule__Emission__Group__0__Impl rule__Emission__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1724:2: rule__Emission__Group__0__Impl rule__Emission__Group__1
            {
            pushFollow(FOLLOW_rule__Emission__Group__0__Impl_in_rule__Emission__Group__03586);
            rule__Emission__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03589);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1731:1: rule__Emission__Group__0__Impl : ( ( rule__Emission__SignalAssignment_0 ) ) ;
    public final void rule__Emission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1735:1: ( ( ( rule__Emission__SignalAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1736:1: ( ( rule__Emission__SignalAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1736:1: ( ( rule__Emission__SignalAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1737:1: ( rule__Emission__SignalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1738:1: ( rule__Emission__SignalAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1738:2: rule__Emission__SignalAssignment_0
            {
            pushFollow(FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__0__Impl3616);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1748:1: rule__Emission__Group__1 : rule__Emission__Group__1__Impl ;
    public final void rule__Emission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1752:1: ( rule__Emission__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1753:2: rule__Emission__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group__1__Impl_in_rule__Emission__Group__13646);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1759:1: rule__Emission__Group__1__Impl : ( ( rule__Emission__Group_1__0 )? ) ;
    public final void rule__Emission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1763:1: ( ( ( rule__Emission__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1764:1: ( ( rule__Emission__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1764:1: ( ( rule__Emission__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1765:1: ( rule__Emission__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1766:1: ( rule__Emission__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1766:2: rule__Emission__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Emission__Group_1__0_in_rule__Emission__Group__1__Impl3673);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1780:1: rule__Emission__Group_1__0 : rule__Emission__Group_1__0__Impl rule__Emission__Group_1__1 ;
    public final void rule__Emission__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1784:1: ( rule__Emission__Group_1__0__Impl rule__Emission__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1785:2: rule__Emission__Group_1__0__Impl rule__Emission__Group_1__1
            {
            pushFollow(FOLLOW_rule__Emission__Group_1__0__Impl_in_rule__Emission__Group_1__03708);
            rule__Emission__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1__1_in_rule__Emission__Group_1__03711);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1792:1: rule__Emission__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Emission__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1796:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1797:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1797:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1798:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Emission__Group_1__0__Impl3739); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1811:1: rule__Emission__Group_1__1 : rule__Emission__Group_1__1__Impl rule__Emission__Group_1__2 ;
    public final void rule__Emission__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1815:1: ( rule__Emission__Group_1__1__Impl rule__Emission__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1816:2: rule__Emission__Group_1__1__Impl rule__Emission__Group_1__2
            {
            pushFollow(FOLLOW_rule__Emission__Group_1__1__Impl_in_rule__Emission__Group_1__13770);
            rule__Emission__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Emission__Group_1__2_in_rule__Emission__Group_1__13773);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1823:1: rule__Emission__Group_1__1__Impl : ( ( rule__Emission__NewValueAssignment_1_1 ) ) ;
    public final void rule__Emission__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1827:1: ( ( ( rule__Emission__NewValueAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1828:1: ( ( rule__Emission__NewValueAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1828:1: ( ( rule__Emission__NewValueAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1829:1: ( rule__Emission__NewValueAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1830:1: ( rule__Emission__NewValueAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1830:2: rule__Emission__NewValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_1_in_rule__Emission__Group_1__1__Impl3800);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1840:1: rule__Emission__Group_1__2 : rule__Emission__Group_1__2__Impl ;
    public final void rule__Emission__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1844:1: ( rule__Emission__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1845:2: rule__Emission__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Emission__Group_1__2__Impl_in_rule__Emission__Group_1__23830);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1851:1: rule__Emission__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Emission__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1855:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1856:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1856:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1857:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__Emission__Group_1__2__Impl3858); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1876:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1880:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1881:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__03895);
            rule__Assignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03898);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1888:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariableAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1892:1: ( ( ( rule__Assignment__VariableAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1893:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1893:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1894:1: ( rule__Assignment__VariableAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1895:1: ( rule__Assignment__VariableAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1895:2: rule__Assignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl3925);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1905:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1909:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1910:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__13955);
            rule__Assignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13958);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1917:1: rule__Assignment__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1921:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1922:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1922:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1923:1: ':='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Assignment__Group__1__Impl3986); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1936:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1940:1: ( rule__Assignment__Group__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1941:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24017);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1947:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1951:1: ( ( ( rule__Assignment__ExpressionAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1952:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1952:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1953:1: ( rule__Assignment__ExpressionAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1954:1: ( rule__Assignment__ExpressionAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1954:2: rule__Assignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_in_rule__Assignment__Group__2__Impl4044);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1970:1: rule__TextEffect__Group__0 : rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1 ;
    public final void rule__TextEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1974:1: ( rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1975:2: rule__TextEffect__Group__0__Impl rule__TextEffect__Group__1
            {
            pushFollow(FOLLOW_rule__TextEffect__Group__0__Impl_in_rule__TextEffect__Group__04080);
            rule__TextEffect__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group__1_in_rule__TextEffect__Group__04083);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1982:1: rule__TextEffect__Group__0__Impl : ( ( rule__TextEffect__CodeAssignment_0 ) ) ;
    public final void rule__TextEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1986:1: ( ( ( rule__TextEffect__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1987:1: ( ( rule__TextEffect__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1987:1: ( ( rule__TextEffect__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1988:1: ( rule__TextEffect__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1989:1: ( rule__TextEffect__CodeAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1989:2: rule__TextEffect__CodeAssignment_0
            {
            pushFollow(FOLLOW_rule__TextEffect__CodeAssignment_0_in_rule__TextEffect__Group__0__Impl4110);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1999:1: rule__TextEffect__Group__1 : rule__TextEffect__Group__1__Impl ;
    public final void rule__TextEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2003:1: ( rule__TextEffect__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2004:2: rule__TextEffect__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextEffect__Group__1__Impl_in_rule__TextEffect__Group__14140);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2010:1: rule__TextEffect__Group__1__Impl : ( ( rule__TextEffect__Group_1__0 )? ) ;
    public final void rule__TextEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2014:1: ( ( ( rule__TextEffect__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2015:1: ( ( rule__TextEffect__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2015:1: ( ( rule__TextEffect__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2016:1: ( rule__TextEffect__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2017:1: ( rule__TextEffect__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2017:2: rule__TextEffect__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextEffect__Group_1__0_in_rule__TextEffect__Group__1__Impl4167);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2031:1: rule__TextEffect__Group_1__0 : rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1 ;
    public final void rule__TextEffect__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2035:1: ( rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2036:2: rule__TextEffect__Group_1__0__Impl rule__TextEffect__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__0__Impl_in_rule__TextEffect__Group_1__04202);
            rule__TextEffect__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group_1__1_in_rule__TextEffect__Group_1__04205);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2043:1: rule__TextEffect__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextEffect__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2047:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2048:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2048:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2049:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__TextEffect__Group_1__0__Impl4233); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2062:1: rule__TextEffect__Group_1__1 : rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2 ;
    public final void rule__TextEffect__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2066:1: ( rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2067:2: rule__TextEffect__Group_1__1__Impl rule__TextEffect__Group_1__2
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__1__Impl_in_rule__TextEffect__Group_1__14264);
            rule__TextEffect__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextEffect__Group_1__2_in_rule__TextEffect__Group_1__14267);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2074:1: rule__TextEffect__Group_1__1__Impl : ( ( rule__TextEffect__TypeAssignment_1_1 ) ) ;
    public final void rule__TextEffect__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2078:1: ( ( ( rule__TextEffect__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2079:1: ( ( rule__TextEffect__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2079:1: ( ( rule__TextEffect__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2080:1: ( rule__TextEffect__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2081:1: ( rule__TextEffect__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2081:2: rule__TextEffect__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TextEffect__TypeAssignment_1_1_in_rule__TextEffect__Group_1__1__Impl4294);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2091:1: rule__TextEffect__Group_1__2 : rule__TextEffect__Group_1__2__Impl ;
    public final void rule__TextEffect__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2095:1: ( rule__TextEffect__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2096:2: rule__TextEffect__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TextEffect__Group_1__2__Impl_in_rule__TextEffect__Group_1__24324);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2102:1: rule__TextEffect__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextEffect__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2106:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2107:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2107:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2108:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__TextEffect__Group_1__2__Impl4352); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2127:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2131:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2132:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04389);
            rule__OrExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04392);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2139:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2143:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2144:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2144:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2145:1: ruleAndExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl4419);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2156:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2160:1: ( rule__OrExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2161:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14448);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2167:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2171:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2172:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2172:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2173:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2174:1: ( rule__OrExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2174:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4475);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2188:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2192:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2193:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04510);
            rule__OrExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04513);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2200:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2204:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2205:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2205:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2206:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2207:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2209:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2219:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2223:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2224:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14571);
            rule__OrExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__14574);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2231:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2235:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2236:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2236:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2237:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2238:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2238:2: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl4601);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2248:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2252:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2253:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__24631);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2259:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2263:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2264:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2264:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2265:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2266:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2266:2: rule__OrExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl4658);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2282:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2286:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2287:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__04694);
            rule__AndExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__04697);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2294:1: rule__AndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2298:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2299:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2299:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2300:1: ruleCompareOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl4724);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2311:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2315:1: ( rule__AndExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2316:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__14753);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2322:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2326:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2327:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2327:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2328:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2329:1: ( rule__AndExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==17) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2329:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl4780);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2343:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2347:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2348:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__04815);
            rule__AndExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__04818);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2355:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2359:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2360:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2360:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2361:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2362:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2364:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2374:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2378:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2379:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__14876);
            rule__AndExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__14879);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2386:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2390:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2391:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2391:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2392:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2393:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2393:2: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl4906);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2403:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2407:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2408:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__24936);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2414:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2418:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2419:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2419:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2420:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2421:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2421:2: rule__AndExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl4963);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2437:1: rule__CompareOperation__Group_0__0 : rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 ;
    public final void rule__CompareOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2441:1: ( rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2442:2: rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__04999);
            rule__CompareOperation__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__05002);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2449:1: rule__CompareOperation__Group_0__0__Impl : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2453:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2454:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2454:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2455:1: ruleNotOrValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl5029);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2466:1: rule__CompareOperation__Group_0__1 : rule__CompareOperation__Group_0__1__Impl ;
    public final void rule__CompareOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2470:1: ( rule__CompareOperation__Group_0__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2471:2: rule__CompareOperation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__15058);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2477:1: rule__CompareOperation__Group_0__1__Impl : ( ( rule__CompareOperation__Group_0_1__0 ) ) ;
    public final void rule__CompareOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2481:1: ( ( ( rule__CompareOperation__Group_0_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2482:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2482:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2483:1: ( rule__CompareOperation__Group_0_1__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2484:1: ( rule__CompareOperation__Group_0_1__0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2484:2: rule__CompareOperation__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl5085);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2498:1: rule__CompareOperation__Group_0_1__0 : rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 ;
    public final void rule__CompareOperation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2502:1: ( rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2503:2: rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__05119);
            rule__CompareOperation__Group_0_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__05122);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2510:1: rule__CompareOperation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2514:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2515:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2515:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2516:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2517:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2519:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2529:1: rule__CompareOperation__Group_0_1__1 : rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 ;
    public final void rule__CompareOperation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2533:1: ( rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2534:2: rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__15180);
            rule__CompareOperation__Group_0_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__15183);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2541:1: rule__CompareOperation__Group_0_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__CompareOperation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2545:1: ( ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2546:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2546:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2547:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2548:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2548:2: rule__CompareOperation__OperatorAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl5210);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2558:1: rule__CompareOperation__Group_0_1__2 : rule__CompareOperation__Group_0_1__2__Impl ;
    public final void rule__CompareOperation__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2562:1: ( rule__CompareOperation__Group_0_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2563:2: rule__CompareOperation__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__25240);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2569:1: rule__CompareOperation__Group_0_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) ;
    public final void rule__CompareOperation__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2573:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2574:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2574:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2575:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2576:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2576:2: rule__CompareOperation__SubExpressionsAssignment_0_1_2
            {
            pushFollow(FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl5267);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2592:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2596:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2597:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__05303);
            rule__AddExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__05306);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2604:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2608:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2609:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2609:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2610:1: ruleSubExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl5333);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2621:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2625:1: ( rule__AddExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2626:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__15362);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2632:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2636:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2637:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2637:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2638:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2639:1: ( rule__AddExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2639:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl5389);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2653:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2657:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2658:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__05424);
            rule__AddExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__05427);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2665:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2669:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2670:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2670:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2671:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2672:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2674:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2684:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2688:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2689:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__15485);
            rule__AddExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__15488);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2696:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2700:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2701:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2701:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2702:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2703:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2703:2: rule__AddExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl5515);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2713:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2717:1: ( rule__AddExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2718:2: rule__AddExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__25545);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2724:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2728:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2729:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2729:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2730:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2731:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2731:2: rule__AddExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl5572);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2747:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2751:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2752:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__05608);
            rule__SubExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__05611);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2759:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2763:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2764:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2764:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2765:1: ruleMultExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl5638);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2776:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2780:1: ( rule__SubExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2781:2: rule__SubExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__15667);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2787:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2791:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2792:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2792:1: ( ( rule__SubExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2793:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2794:1: ( rule__SubExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==20) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2794:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl5694);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2808:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2812:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2813:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__05729);
            rule__SubExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__05732);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2820:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2824:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2825:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2825:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2826:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2827:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2829:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2839:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2843:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2844:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__15790);
            rule__SubExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__15793);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2851:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2855:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2856:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2856:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2857:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2858:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2858:2: rule__SubExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl5820);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2868:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2872:1: ( rule__SubExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2873:2: rule__SubExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__25850);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2879:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2883:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2884:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2884:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2885:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2886:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2886:2: rule__SubExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5877);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2902:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2906:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2907:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05913);
            rule__MultExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05916);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2914:1: rule__MultExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2918:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2919:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2919:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2920:1: ruleModExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getModExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_rule__MultExpression__Group__0__Impl5943);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2931:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2935:1: ( rule__MultExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2936:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15972);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2942:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2946:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2947:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2947:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2948:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2949:1: ( rule__MultExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2949:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5999);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2963:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2967:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2968:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__06034);
            rule__MultExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__06037);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2975:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2979:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2980:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2980:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2981:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2982:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2984:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2994:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2998:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2999:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__16095);
            rule__MultExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__16098);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3006:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3010:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3011:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3011:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3012:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3013:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3013:2: rule__MultExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl6125);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3023:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3027:1: ( rule__MultExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3028:2: rule__MultExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__26155);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3034:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3038:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3039:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3039:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3040:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3041:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3041:2: rule__MultExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl6182);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3057:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3061:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3062:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__06218);
            rule__ModExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__06221);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3069:1: rule__ModExpression__Group__0__Impl : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3073:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3074:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3074:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3075:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__Group__0__Impl6248);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3086:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3090:1: ( rule__ModExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3091:2: rule__ModExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__16277);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3097:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3101:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3102:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3102:1: ( ( rule__ModExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3103:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3104:1: ( rule__ModExpression__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3104:2: rule__ModExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl6304);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3118:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3122:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3123:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__06339);
            rule__ModExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__06342);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3130:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3134:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3135:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3135:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3136:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3137:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3139:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3149:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3153:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3154:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__16400);
            rule__ModExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__16403);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3161:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3165:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3166:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3166:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3167:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3168:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3168:2: rule__ModExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl6430);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3178:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3182:1: ( rule__ModExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3183:2: rule__ModExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__26460);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3189:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3193:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3194:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3194:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3195:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3196:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3196:2: rule__ModExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl6487);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3212:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3216:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3217:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__06523);
            rule__NotExpression__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__06526);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3224:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3228:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3229:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3229:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3230:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3231:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3233:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3243:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3247:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3248:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__16584);
            rule__NotExpression__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__16587);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3255:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3259:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3260:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3260:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3261:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3262:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3262:2: rule__NotExpression__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl6614);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3272:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3276:1: ( rule__NotExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3277:2: rule__NotExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__26644);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3283:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3287:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3288:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3288:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3289:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3290:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3290:2: rule__NotExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl6671);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3306:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3310:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3311:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__06707);
            rule__AtomicExpression__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__06710);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3318:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3322:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3323:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3323:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3324:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicExpression__Group_2__0__Impl6738); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3337:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3341:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3342:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__16769);
            rule__AtomicExpression__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__16772);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3349:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3353:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3354:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3354:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3355:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_2__1__Impl6799);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3366:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3370:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3371:2: rule__AtomicExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__26828);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3377:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3381:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3382:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3382:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3383:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__AtomicExpression__Group_2__2__Impl6856); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3402:1: rule__AtomicValuedExpression__Group_2__0 : rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 ;
    public final void rule__AtomicValuedExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3406:1: ( rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3407:2: rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__06893);
            rule__AtomicValuedExpression__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__06896);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3414:1: rule__AtomicValuedExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3418:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3419:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3419:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3420:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicValuedExpression__Group_2__0__Impl6924); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3433:1: rule__AtomicValuedExpression__Group_2__1 : rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 ;
    public final void rule__AtomicValuedExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3437:1: ( rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3438:2: rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__16955);
            rule__AtomicValuedExpression__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__16958);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3445:1: rule__AtomicValuedExpression__Group_2__1__Impl : ( ruleDivExpression ) ;
    public final void rule__AtomicValuedExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3449:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3450:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3450:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3451:1: ruleDivExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getDivExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl6985);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3462:1: rule__AtomicValuedExpression__Group_2__2 : rule__AtomicValuedExpression__Group_2__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3466:1: ( rule__AtomicValuedExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3467:2: rule__AtomicValuedExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__27014);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3473:1: rule__AtomicValuedExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3477:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3478:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3478:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3479:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__AtomicValuedExpression__Group_2__2__Impl7042); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3498:1: rule__AtomicValuedExpression__Group_3__0 : rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 ;
    public final void rule__AtomicValuedExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3502:1: ( rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3503:2: rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_3__0__Impl_in_rule__AtomicValuedExpression__Group_3__07079);
            rule__AtomicValuedExpression__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_3__1_in_rule__AtomicValuedExpression__Group_3__07082);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3510:1: rule__AtomicValuedExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3514:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3515:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3515:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3516:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__AtomicValuedExpression__Group_3__0__Impl7110); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3529:1: rule__AtomicValuedExpression__Group_3__1 : rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 ;
    public final void rule__AtomicValuedExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3533:1: ( rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3534:2: rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_3__1__Impl_in_rule__AtomicValuedExpression__Group_3__17141);
            rule__AtomicValuedExpression__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_3__2_in_rule__AtomicValuedExpression__Group_3__17144);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3541:1: rule__AtomicValuedExpression__Group_3__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3545:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3546:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3546:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3547:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_3__1__Impl7171);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3558:1: rule__AtomicValuedExpression__Group_3__2 : rule__AtomicValuedExpression__Group_3__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3562:1: ( rule__AtomicValuedExpression__Group_3__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3563:2: rule__AtomicValuedExpression__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_3__2__Impl_in_rule__AtomicValuedExpression__Group_3__27200);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3569:1: rule__AtomicValuedExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3573:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3574:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3574:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3575:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__AtomicValuedExpression__Group_3__2__Impl7228); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3594:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3598:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3599:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__07265);
            rule__DivExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__07268);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3606:1: rule__DivExpression__Group__0__Impl : ( ruleAtomicValuedExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3610:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3611:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3611:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3612:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__Group__0__Impl7295);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3623:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2 ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3627:1: ( rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3628:2: rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__17324);
            rule__DivExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivExpression__Group__2_in_rule__DivExpression__Group__17327);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3635:1: rule__DivExpression__Group__1__Impl : ( () ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3639:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3640:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3640:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3641:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3642:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3644:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3654:1: rule__DivExpression__Group__2 : rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3 ;
    public final void rule__DivExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3658:1: ( rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3659:2: rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__2__Impl_in_rule__DivExpression__Group__27385);
            rule__DivExpression__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__DivExpression__Group__3_in_rule__DivExpression__Group__27388);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3666:1: rule__DivExpression__Group__2__Impl : ( ( rule__DivExpression__OperatorAssignment_2 ) ) ;
    public final void rule__DivExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3670:1: ( ( ( rule__DivExpression__OperatorAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3671:1: ( ( rule__DivExpression__OperatorAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3671:1: ( ( rule__DivExpression__OperatorAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3672:1: ( rule__DivExpression__OperatorAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3673:1: ( rule__DivExpression__OperatorAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3673:2: rule__DivExpression__OperatorAssignment_2
            {
            pushFollow(FOLLOW_rule__DivExpression__OperatorAssignment_2_in_rule__DivExpression__Group__2__Impl7415);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3683:1: rule__DivExpression__Group__3 : rule__DivExpression__Group__3__Impl ;
    public final void rule__DivExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3687:1: ( rule__DivExpression__Group__3__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3688:2: rule__DivExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DivExpression__Group__3__Impl_in_rule__DivExpression__Group__37445);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3694:1: rule__DivExpression__Group__3__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_3 ) ) ;
    public final void rule__DivExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3698:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3699:1: ( ( rule__DivExpression__SubExpressionsAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3699:1: ( ( rule__DivExpression__SubExpressionsAssignment_3 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3700:1: ( rule__DivExpression__SubExpressionsAssignment_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3701:1: ( rule__DivExpression__SubExpressionsAssignment_3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3701:2: rule__DivExpression__SubExpressionsAssignment_3
            {
            pushFollow(FOLLOW_rule__DivExpression__SubExpressionsAssignment_3_in_rule__DivExpression__Group__3__Impl7472);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3719:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3723:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3724:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__07510);
            rule__ValuedObjectTestExpression__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__07513);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3731:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3735:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3736:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3736:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3737:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3738:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3740:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3750:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3754:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3755:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__17571);
            rule__ValuedObjectTestExpression__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__17574);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3762:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3766:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3767:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3767:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3768:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3769:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3769:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl7601);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3779:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3783:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3784:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__27631);
            rule__ValuedObjectTestExpression__Group_0__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__27634);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3791:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3795:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3796:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3796:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3797:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__ValuedObjectTestExpression__Group_0__2__Impl7662); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3810:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3814:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3815:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__37693);
            rule__ValuedObjectTestExpression__Group_0__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__37696);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3822:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3826:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3827:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3827:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3828:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3829:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3829:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl7723);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3839:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3843:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3844:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__47753);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3850:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3854:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3855:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3855:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3856:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__ValuedObjectTestExpression__Group_0__4__Impl7781); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3879:1: rule__ValuedObjectTestExpression__Group_1__0 : rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 ;
    public final void rule__ValuedObjectTestExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3883:1: ( rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3884:2: rule__ValuedObjectTestExpression__Group_1__0__Impl rule__ValuedObjectTestExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_1__0__Impl_in_rule__ValuedObjectTestExpression__Group_1__07822);
            rule__ValuedObjectTestExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_1__1_in_rule__ValuedObjectTestExpression__Group_1__07825);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3891:1: rule__ValuedObjectTestExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3895:1: ( ( () ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3896:1: ( () )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3896:1: ( () )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3897:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3898:1: ()
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3900:1: 
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3910:1: rule__ValuedObjectTestExpression__Group_1__1 : rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 ;
    public final void rule__ValuedObjectTestExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3914:1: ( rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3915:2: rule__ValuedObjectTestExpression__Group_1__1__Impl rule__ValuedObjectTestExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_1__1__Impl_in_rule__ValuedObjectTestExpression__Group_1__17883);
            rule__ValuedObjectTestExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_1__2_in_rule__ValuedObjectTestExpression__Group_1__17886);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3922:1: rule__ValuedObjectTestExpression__Group_1__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3926:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3927:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3927:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3928:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3929:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3929:2: rule__ValuedObjectTestExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_1_1_in_rule__ValuedObjectTestExpression__Group_1__1__Impl7913);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3939:1: rule__ValuedObjectTestExpression__Group_1__2 : rule__ValuedObjectTestExpression__Group_1__2__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3943:1: ( rule__ValuedObjectTestExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3944:2: rule__ValuedObjectTestExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__Group_1__2__Impl_in_rule__ValuedObjectTestExpression__Group_1__27943);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3950:1: rule__ValuedObjectTestExpression__Group_1__2__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3954:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3955:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3955:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3956:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3957:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3957:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2_in_rule__ValuedObjectTestExpression__Group_1__2__Impl7970);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3973:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3977:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3978:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
            {
            pushFollow(FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__08006);
            rule__TextExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__08009);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3985:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3989:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3990:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3990:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3991:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3992:1: ( rule__TextExpression__CodeAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3992:2: rule__TextExpression__CodeAssignment_0
            {
            pushFollow(FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl8036);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4002:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4006:1: ( rule__TextExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4007:2: rule__TextExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__18066);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4013:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4017:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4018:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4018:1: ( ( rule__TextExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4019:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4020:1: ( rule__TextExpression__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4020:2: rule__TextExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl8093);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4034:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4038:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4039:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__08128);
            rule__TextExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__08131);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4046:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4050:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4051:1: ( '(' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4051:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4052:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__TextExpression__Group_1__0__Impl8159); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4065:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4069:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4070:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__18190);
            rule__TextExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__18193);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4077:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4081:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4082:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4082:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4083:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4084:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4084:2: rule__TextExpression__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl8220);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4094:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4098:1: ( rule__TextExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4099:2: rule__TextExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__28250);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4105:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4109:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4110:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4110:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4111:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__TextExpression__Group_1__2__Impl8278); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4130:1: rule__KeyValueAnnotation__Group__0 : rule__KeyValueAnnotation__Group__0__Impl rule__KeyValueAnnotation__Group__1 ;
    public final void rule__KeyValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4134:1: ( rule__KeyValueAnnotation__Group__0__Impl rule__KeyValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4135:2: rule__KeyValueAnnotation__Group__0__Impl rule__KeyValueAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__KeyValueAnnotation__Group__0__Impl_in_rule__KeyValueAnnotation__Group__08315);
            rule__KeyValueAnnotation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__KeyValueAnnotation__Group__1_in_rule__KeyValueAnnotation__Group__08318);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4142:1: rule__KeyValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4146:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4147:1: ( '@' )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4147:1: ( '@' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4148:1: '@'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__KeyValueAnnotation__Group__0__Impl8346); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4161:1: rule__KeyValueAnnotation__Group__1 : rule__KeyValueAnnotation__Group__1__Impl rule__KeyValueAnnotation__Group__2 ;
    public final void rule__KeyValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4165:1: ( rule__KeyValueAnnotation__Group__1__Impl rule__KeyValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4166:2: rule__KeyValueAnnotation__Group__1__Impl rule__KeyValueAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__KeyValueAnnotation__Group__1__Impl_in_rule__KeyValueAnnotation__Group__18377);
            rule__KeyValueAnnotation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__KeyValueAnnotation__Group__2_in_rule__KeyValueAnnotation__Group__18380);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4173:1: rule__KeyValueAnnotation__Group__1__Impl : ( ( rule__KeyValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4177:1: ( ( ( rule__KeyValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4178:1: ( ( rule__KeyValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4178:1: ( ( rule__KeyValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4179:1: ( rule__KeyValueAnnotation__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4180:1: ( rule__KeyValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4180:2: rule__KeyValueAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KeyValueAnnotation__NameAssignment_1_in_rule__KeyValueAnnotation__Group__1__Impl8407);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4190:1: rule__KeyValueAnnotation__Group__2 : rule__KeyValueAnnotation__Group__2__Impl ;
    public final void rule__KeyValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4194:1: ( rule__KeyValueAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4195:2: rule__KeyValueAnnotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__KeyValueAnnotation__Group__2__Impl_in_rule__KeyValueAnnotation__Group__28437);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4201:1: rule__KeyValueAnnotation__Group__2__Impl : ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4205:1: ( ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4206:1: ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4206:1: ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4207:1: ( rule__KeyValueAnnotation__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4208:1: ( rule__KeyValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4208:2: rule__KeyValueAnnotation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__KeyValueAnnotation__ValueAssignment_2_in_rule__KeyValueAnnotation__Group__2__Impl8464);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4226:1: rule__Transition__IsImmediateAssignment_1 : ( ( '#' ) ) ;
    public final void rule__Transition__IsImmediateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4230:1: ( ( ( '#' ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4231:1: ( ( '#' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4231:1: ( ( '#' ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4232:1: ( '#' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getIsImmediateNumberSignKeyword_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4233:1: ( '#' )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4234:1: '#'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getIsImmediateNumberSignKeyword_1_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Transition__IsImmediateAssignment_18511); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4249:1: rule__Transition__DelayAssignment_2 : ( RULE_INT ) ;
    public final void rule__Transition__DelayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4253:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4254:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4254:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4255:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Transition__DelayAssignment_28550); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4264:1: rule__Transition__TriggerAssignment_3 : ( ruleBooleanExpression ) ;
    public final void rule__Transition__TriggerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4268:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4269:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4269:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4270:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTriggerBooleanExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Transition__TriggerAssignment_38581);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4279:1: rule__Transition__EffectsAssignment_4_1 : ( ruleEffect ) ;
    public final void rule__Transition__EffectsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4283:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4284:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4284:1: ( ruleEffect )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4285:1: ruleEffect
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_rule__Transition__EffectsAssignment_4_18612);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4294:1: rule__Transition__EffectsAssignment_4_2_1 : ( ruleEffect ) ;
    public final void rule__Transition__EffectsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4298:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4299:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4299:1: ( ruleEffect )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4300:1: ruleEffect
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_rule__Transition__EffectsAssignment_4_2_18643);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4313:1: rule__Emission__SignalAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Emission__SignalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4317:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4318:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4318:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4319:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4320:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4321:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_08682); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4332:1: rule__Emission__NewValueAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4336:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4337:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4337:1: ( ruleExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4338:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Emission__NewValueAssignment_1_18717);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4347:1: rule__Assignment__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4351:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4352:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4352:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4353:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4354:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4355:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_08752); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4366:1: rule__Assignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4370:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4371:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4371:1: ( ruleExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4372:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Assignment__ExpressionAssignment_28787);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4381:1: rule__TextEffect__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextEffect__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4385:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4386:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4386:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4387:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextEffect__CodeAssignment_08818); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4396:1: rule__TextEffect__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextEffect__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4400:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4401:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4401:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4402:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextEffect__TypeAssignment_1_18849); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4411:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4415:1: ( ( ruleOrOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4416:1: ( ruleOrOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4416:1: ( ruleOrOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4417:1: ruleOrOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_18880);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4426:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4430:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4431:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4431:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4432:1: ruleAndExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_28911);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4441:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4445:1: ( ( ruleAndOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4446:1: ( ruleAndOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4446:1: ( ruleAndOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4447:1: ruleAndOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_18942);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4456:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4460:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4461:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4461:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4462:1: ruleCompareOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_28973);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4471:1: rule__CompareOperation__OperatorAssignment_0_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4475:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4476:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4476:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4477:1: ruleCompareOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_19004);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4486:1: rule__CompareOperation__SubExpressionsAssignment_0_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4490:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4491:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4491:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4492:1: ruleNotOrValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_29035);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4501:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4505:1: ( ( ruleAddOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4506:1: ( ruleAddOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4506:1: ( ruleAddOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4507:1: ruleAddOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_19066);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4516:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4520:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4521:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4521:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4522:1: ruleSubExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_29097);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4531:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4535:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4536:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4536:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4537:1: ruleSubOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_19128);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4546:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4550:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4551:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4551:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4552:1: ruleMultExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_29159);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4561:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4565:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4566:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4566:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4567:1: ruleMultOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_19190);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4576:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4580:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4581:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4581:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4582:1: ruleModExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_rule__MultExpression__SubExpressionsAssignment_1_29221);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4591:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4595:1: ( ( ruleModOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4596:1: ( ruleModOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4596:1: ( ruleModOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4597:1: ruleModOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_19252);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4606:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4610:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4611:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4611:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4612:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_29283);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4621:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4625:1: ( ( ruleNotOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4626:1: ( ruleNotOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4626:1: ( ruleNotOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4627:1: ruleNotOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_19314);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4636:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4640:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4641:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4641:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4642:1: ruleNotExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_29345);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4651:1: rule__DivExpression__OperatorAssignment_2 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4655:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4656:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4656:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4657:1: ruleDivOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_29376);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4666:1: rule__DivExpression__SubExpressionsAssignment_3 : ( ruleAtomicValuedExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4670:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4671:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4671:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4672:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__SubExpressionsAssignment_39407);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4681:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( rulePreOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4685:1: ( ( rulePreOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4686:1: ( rulePreOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4686:1: ( rulePreOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4687:1: rulePreOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_19438);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4696:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4700:1: ( ( ruleValuedObjectTestExpression ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4701:1: ( ruleValuedObjectTestExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4701:1: ( ruleValuedObjectTestExpression )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4702:1: ruleValuedObjectTestExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_39469);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4711:1: rule__ValuedObjectTestExpression__OperatorAssignment_1_1 : ( ruleValueTestOperator ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4715:1: ( ( ruleValueTestOperator ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4716:1: ( ruleValueTestOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4716:1: ( ruleValueTestOperator )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4717:1: ruleValueTestOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueTestOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_1_19500);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4726:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2 : ( ruleValuedObjectReference ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4730:1: ( ( ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4731:1: ( ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4731:1: ( ruleValuedObjectReference )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4732:1: ruleValuedObjectReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectReferenceParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_29531);
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4741:1: rule__ValuedObjectReference__ValuedObjectAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4745:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4746:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4746:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4747:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4748:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4749:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment9566); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4760:1: rule__TextExpression__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4764:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4765:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4765:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4766:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_09601); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4775:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4779:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4780:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4780:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4781:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_19632); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4790:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4794:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4795:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4795:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4796:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment9663); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4805:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4809:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4810:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4810:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4811:1: RULE_FLOAT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment9694); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4820:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4824:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4825:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4825:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4826:1: RULE_BOOLEAN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment9725); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4835:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4839:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4840:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4840:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4841:1: RULE_COMMENT_ANNOTATION
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment9756); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4850:1: rule__KeyValueAnnotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KeyValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4854:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4855:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4855:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4856:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KeyValueAnnotation__NameAssignment_19787); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4865:1: rule__KeyValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4869:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4870:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4870:1: ( ruleEString )
            // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4871:1: ruleEString
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__KeyValueAnnotation__ValueAssignment_29818);
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
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1138:1: ( ( ruleBooleanExpression ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1138:1: ( ruleBooleanExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1138:1: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1139:1: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleBooleanExpression_in_synpred32318);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:1: ( ( rule__CompareOperation__Group_0__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:1: ( ( rule__CompareOperation__Group_0__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1161:1: ( rule__CompareOperation__Group_0__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1162:1: ( rule__CompareOperation__Group_0__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1162:2: rule__CompareOperation__Group_0__0
        {
        pushFollow(FOLLOW_rule__CompareOperation__Group_0__0_in_synpred42367);
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
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1182:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1182:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1182:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1183:1: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred52417);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1272:6: ( ( ( rule__AtomicValuedExpression__Group_2__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1272:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1272:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1273:1: ( rule__AtomicValuedExpression__Group_2__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1274:1: ( rule__AtomicValuedExpression__Group_2__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1274:2: rule__AtomicValuedExpression__Group_2__0
        {
        pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred122634);
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
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:6: ( ( ( rule__AtomicValuedExpression__Group_3__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1279:1: ( rule__AtomicValuedExpression__Group_3__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
        }
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1280:1: ( rule__AtomicValuedExpression__Group_3__0 )
        // ../de.cau.cs.kieler.synccharts.text.ui/src-gen/de/cau/cs/kieler/synccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1280:2: rule__AtomicValuedExpression__Group_3__0
        {
        pushFollow(FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_synpred132652);
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
        "\1\4\2\23\2\0\1\40\1\5\2\0\1\uffff\4\4\1\uffff\2\0\2\23\1\0\1\23"+
        "\1\40\1\5\4\23\1\0\1\23\1\40\1\5\4\23\1\0\1\23\1\40\1\5\4\23\1\0"+
        "\1\23\1\40\1\5\2\23\1\0\1\23\1\5\1\4\1\0\1\23\1\5\2\4\1\0\1\23\1"+
        "\5\3\4\1\0\1\23\1\5\1\41\2\23\1\0\1\23\1\40\1\5\2\23\1\41\2\23\1"+
        "\0\1\23\1\40\1\5\4\23\1\0\1\23\1\40\1\5\2\23\1\41\2\23\1\0\1\23"+
        "\1\40\1\5\4\23\1\0\1\23\1\40\1\5\4\23\1\0\1\23\1\40\1\5\2\23\1\41"+
        "\1\23\1\0\1\23\1\5\1\23\1\0\1\23\1\5\1\4\1\0\1\23\1\5\1\23\1\0\1"+
        "\23\1\5\1\4\1\0\1\23\1\5\2\4\1\0\1\23\1\5\1\23\2\41\2\23\1\0\1\23"+
        "\1\40\1\5\2\23\2\41\2\23\1\0\1\23\1\40\1\5\2\23\1\41\2\23\1\0\1"+
        "\23\1\40\1\5\4\23\1\0\1\23\1\40\1\5\2\23\1\41\2\23\1\0\1\23\1\5"+
        "\2\23\1\0\1\23\1\5\1\23\1\0\1\23\1\5\1\4\1\0\1\23\1\5\1\23\3\41"+
        "\2\23\1\0\1\23\1\40\1\5\2\23\1\41\3\23\1\0\1\23\1\5\1\23\1\41\1"+
        "\23";
    static final String DFA2_maxS =
        "\1\40\2\41\2\0\1\40\1\5\2\0\1\uffff\4\40\1\uffff\2\0\2\41\1\0\1"+
        "\41\1\40\1\5\4\41\1\0\1\41\1\40\1\5\4\41\1\0\1\41\1\40\1\5\4\41"+
        "\1\0\1\41\1\40\1\5\2\41\1\0\1\41\1\5\1\40\1\0\1\41\1\5\2\40\1\0"+
        "\1\41\1\5\3\40\1\0\1\41\1\5\3\41\1\0\1\41\1\40\1\5\5\41\1\0\1\41"+
        "\1\40\1\5\4\41\1\0\1\41\1\40\1\5\5\41\1\0\1\41\1\40\1\5\4\41\1\0"+
        "\1\41\1\40\1\5\4\41\1\0\1\41\1\40\1\5\4\41\1\0\1\41\1\5\1\41\1\0"+
        "\1\41\1\5\1\40\1\0\1\41\1\5\1\41\1\0\1\41\1\5\1\40\1\0\1\41\1\5"+
        "\2\40\1\0\1\41\1\5\5\41\1\0\1\41\1\40\1\5\6\41\1\0\1\41\1\40\1\5"+
        "\5\41\1\0\1\41\1\40\1\5\4\41\1\0\1\41\1\40\1\5\5\41\1\0\1\41\1\5"+
        "\2\41\1\0\1\41\1\5\1\41\1\0\1\41\1\5\1\40\1\0\1\41\1\5\6\41\1\0"+
        "\1\41\1\40\1\5\6\41\1\0\1\41\1\5\3\41";
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
            "\1\10\1\7\1\1\1\2\1\4\6\uffff\1\5\2\uffff\1\11\5\uffff\1\6\7"+
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
            "\1\30\1\27\1\21\1\22\1\24\6\uffff\1\25\10\uffff\1\26\7\uffff"+
            "\1\23",
            "\1\40\1\37\1\31\1\32\1\34\6\uffff\1\35\10\uffff\1\36\7\uffff"+
            "\1\33",
            "\1\50\1\47\1\41\1\42\1\44\6\uffff\1\45\10\uffff\1\46\7\uffff"+
            "\1\43",
            "\1\60\1\57\1\51\1\52\1\54\6\uffff\1\55\10\uffff\1\56\7\uffff"+
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
            "\1\113\1\112\1\104\1\105\1\107\6\uffff\1\110\10\uffff\1\111"+
            "\7\uffff\1\106",
            "\1\uffff",
            "\1\15\1\14\1\13\1\64\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\114",
            "\1\124\1\123\1\115\1\116\1\120\6\uffff\1\121\10\uffff\1\122"+
            "\7\uffff\1\117",
            "\1\134\1\133\1\125\1\126\1\130\6\uffff\1\131\10\uffff\1\132"+
            "\7\uffff\1\127",
            "\1\uffff",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\135",
            "\1\145\1\144\1\136\1\137\1\141\6\uffff\1\142\10\uffff\1\143"+
            "\7\uffff\1\140",
            "\1\155\1\154\1\146\1\147\1\151\6\uffff\1\152\10\uffff\1\153"+
            "\7\uffff\1\150",
            "\1\165\1\164\1\156\1\157\1\161\6\uffff\1\162\10\uffff\1\163"+
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
            "\1\u009a\1\u0099\1\u0093\1\u0094\1\u0096\6\uffff\1\u0097\10"+
            "\uffff\1\u0098\7\uffff\1\u0095",
            "\1\uffff",
            "\1\15\1\14\1\71\1\177\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u009b",
            "\1\15\1\14\1\71\1\70\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\uffff",
            "\1\15\1\77\1\76\3\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u009c",
            "\1\u00a4\1\u00a3\1\u009d\1\u009e\1\u00a0\6\uffff\1\u00a1\10"+
            "\uffff\1\u00a2\7\uffff\1\u009f",
            "\1\uffff",
            "\1\15\1\77\1\76\1\u0087\2\uffff\6\11\1\16\1\uffff\1\16",
            "\1\u00a5",
            "\1\u00ad\1\u00ac\1\u00a6\1\u00a7\1\u00a9\6\uffff\1\u00aa\10"+
            "\uffff\1\u00ab\7\uffff\1\u00a8",
            "\1\u00b5\1\u00b4\1\u00ae\1\u00af\1\u00b1\6\uffff\1\u00b2\10"+
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
            "\1\u00d4\1\u00d3\1\u00cd\1\u00ce\1\u00d0\6\uffff\1\u00d1\10"+
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
            return "1133:1: rule__Expression__Alternatives : ( ( ruleBooleanExpression ) | ( ruleValuedExpression ) );";
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
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePreOperator1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOrOperator1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAndOperator1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNotOperator1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAddOperator2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSubOperator2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMultOperator2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleModOperator2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDivOperator2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleValueTestOperator2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_rule__Effect__Alternatives2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_rule__Effect__Alternatives2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_rule__AtomicValuedExpression__Alternatives2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_rule__AtomicValuedExpression__Alternatives2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__0_in_rule__ValuedObjectTestExpression__Alternatives2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CompareOperator__Alternatives2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompareOperator__Alternatives2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CompareOperator__Alternatives2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CompareOperator__Alternatives2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CompareOperator__Alternatives2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CompareOperator__Alternatives2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02962 = new BitSet(new long[]{0x00000011018481F2L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__13023 = new BitSet(new long[]{0x00000001018481F2L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__13026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__IsImmediateAssignment_1_in_rule__Transition__Group__1__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23084 = new BitSet(new long[]{0x00000001018481F2L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__23087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__DelayAssignment_2_in_rule__Transition__Group__2__Impl3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__33145 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__33148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TriggerAssignment_3_in_rule__Transition__Group__3__Impl3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__43206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__03274 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__03277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Transition__Group_4__0__Impl3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__13336 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__2_in_rule__Transition__Group_4__13339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EffectsAssignment_4_1_in_rule__Transition__Group_4__1__Impl3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__2__Impl_in_rule__Transition__Group_4__23396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4_2__0_in_rule__Transition__Group_4__2__Impl3423 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4_2__0__Impl_in_rule__Transition__Group_4_2__03460 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Transition__Group_4_2__1_in_rule__Transition__Group_4_2__03463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Transition__Group_4_2__0__Impl3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4_2__1__Impl_in_rule__Transition__Group_4_2__13522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EffectsAssignment_4_2_1_in_rule__Transition__Group_4_2__1__Impl3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__0__Impl_in_rule__Emission__Group__03586 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__0__Impl3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1__Impl_in_rule__Emission__Group__13646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__0_in_rule__Emission__Group__1__Impl3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__0__Impl_in_rule__Emission__Group_1__03708 = new BitSet(new long[]{0x00000001010481F0L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__1_in_rule__Emission__Group_1__03711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Emission__Group_1__0__Impl3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__1__Impl_in_rule__Emission__Group_1__13770 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__2_in_rule__Emission__Group_1__13773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_1_in_rule__Emission__Group_1__1__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1__2__Impl_in_rule__Emission__Group_1__23830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Emission__Group_1__2__Impl3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__03895 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__0__Impl3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__13955 = new BitSet(new long[]{0x00000001010481F0L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Assignment__Group__1__Impl3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_in_rule__Assignment__Group__2__Impl4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__0__Impl_in_rule__TextEffect__Group__04080 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__1_in_rule__TextEffect__Group__04083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__CodeAssignment_0_in_rule__TextEffect__Group__0__Impl4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group__1__Impl_in_rule__TextEffect__Group__14140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__0_in_rule__TextEffect__Group__1__Impl4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__0__Impl_in_rule__TextEffect__Group_1__04202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__1_in_rule__TextEffect__Group_1__04205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TextEffect__Group_1__0__Impl4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__1__Impl_in_rule__TextEffect__Group_1__14264 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__2_in_rule__TextEffect__Group_1__14267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__TypeAssignment_1_1_in_rule__TextEffect__Group_1__1__Impl4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextEffect__Group_1__2__Impl_in_rule__TextEffect__Group_1__24324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TextEffect__Group_1__2__Impl4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04389 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4475 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04510 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14571 = new BitSet(new long[]{0x00000001010481F0L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__14574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__24631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__04694 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__04697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__14753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl4780 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__04815 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__04818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__14876 = new BitSet(new long[]{0x00000001010481F0L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__14879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__24936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__04999 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__05002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__15058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__05119 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__05122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__15180 = new BitSet(new long[]{0x00000001010481F0L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__15183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__25240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__05303 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__05306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__15362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl5389 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__05424 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__05427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__15485 = new BitSet(new long[]{0x00000001010081F0L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__15488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__25545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__05608 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__05611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl5638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__15667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl5694 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__05729 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__05732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__15790 = new BitSet(new long[]{0x00000001010081F0L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__15793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__25850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05913 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_rule__MultExpression__Group__0__Impl5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5999 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__06034 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__06037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__16095 = new BitSet(new long[]{0x00000001010081F0L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__16098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__26155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__06218 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__06221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__Group__0__Impl6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__16277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__06339 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__06342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__16400 = new BitSet(new long[]{0x00000001010081F0L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__16403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__26460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__06523 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__06526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__16584 = new BitSet(new long[]{0x0000000101048130L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__16587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl6614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__26644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__06707 = new BitSet(new long[]{0x00000001010481F0L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__06710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicExpression__Group_2__0__Impl6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__16769 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__16772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_2__1__Impl6799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__26828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AtomicExpression__Group_2__2__Impl6856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__06893 = new BitSet(new long[]{0x00000001010081F0L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__06896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicValuedExpression__Group_2__0__Impl6924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__16955 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__16958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__27014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AtomicValuedExpression__Group_2__2__Impl7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0__Impl_in_rule__AtomicValuedExpression__Group_3__07079 = new BitSet(new long[]{0x00000001010081F0L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__1_in_rule__AtomicValuedExpression__Group_3__07082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AtomicValuedExpression__Group_3__0__Impl7110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__1__Impl_in_rule__AtomicValuedExpression__Group_3__17141 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__2_in_rule__AtomicValuedExpression__Group_3__17144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_3__1__Impl7171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__2__Impl_in_rule__AtomicValuedExpression__Group_3__27200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AtomicValuedExpression__Group_3__2__Impl7228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__07265 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__07268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__Group__0__Impl7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__17324 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__2_in_rule__DivExpression__Group__17327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__2__Impl_in_rule__DivExpression__Group__27385 = new BitSet(new long[]{0x00000001010081F0L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__3_in_rule__DivExpression__Group__27388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__OperatorAssignment_2_in_rule__DivExpression__Group__2__Impl7415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__Group__3__Impl_in_rule__DivExpression__Group__37445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivExpression__SubExpressionsAssignment_3_in_rule__DivExpression__Group__3__Impl7472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__07510 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__07513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__17571 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__17574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl7601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__27631 = new BitSet(new long[]{0x0000000001008020L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__27634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ValuedObjectTestExpression__Group_0__2__Impl7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__37693 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__37696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__47753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ValuedObjectTestExpression__Group_0__4__Impl7781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__0__Impl_in_rule__ValuedObjectTestExpression__Group_1__07822 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__1_in_rule__ValuedObjectTestExpression__Group_1__07825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__1__Impl_in_rule__ValuedObjectTestExpression__Group_1__17883 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__2_in_rule__ValuedObjectTestExpression__Group_1__17886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_1_1_in_rule__ValuedObjectTestExpression__Group_1__1__Impl7913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_1__2__Impl_in_rule__ValuedObjectTestExpression__Group_1__27943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_2_in_rule__ValuedObjectTestExpression__Group_1__2__Impl7970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__08006 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__08009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl8036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__18066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl8093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__08128 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__08131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TextExpression__Group_1__0__Impl8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__18190 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__18193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl8220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__28250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TextExpression__Group_1__2__Impl8278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__0__Impl_in_rule__KeyValueAnnotation__Group__08315 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__1_in_rule__KeyValueAnnotation__Group__08318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__KeyValueAnnotation__Group__0__Impl8346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__1__Impl_in_rule__KeyValueAnnotation__Group__18377 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__2_in_rule__KeyValueAnnotation__Group__18380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__NameAssignment_1_in_rule__KeyValueAnnotation__Group__1__Impl8407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__2__Impl_in_rule__KeyValueAnnotation__Group__28437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValueAnnotation__ValueAssignment_2_in_rule__KeyValueAnnotation__Group__2__Impl8464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Transition__IsImmediateAssignment_18511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Transition__DelayAssignment_28550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Transition__TriggerAssignment_38581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__Transition__EffectsAssignment_4_18612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__Transition__EffectsAssignment_4_2_18643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_08682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Emission__NewValueAssignment_1_18717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_08752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Assignment__ExpressionAssignment_28787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextEffect__CodeAssignment_08818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextEffect__TypeAssignment_1_18849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_18880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_28911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_18942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_28973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_19004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_29035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_19066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_29097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_19128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_29159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_19190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_rule__MultExpression__SubExpressionsAssignment_1_29221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_19252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_29283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_19314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_29345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_29376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__SubExpressionsAssignment_39407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_19438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_39469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestOperator_in_rule__ValuedObjectTestExpression__OperatorAssignment_1_19500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_1_29531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment9566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_09601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_19632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment9663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment9694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment9725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment9756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KeyValueAnnotation__NameAssignment_19787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__KeyValueAnnotation__ValueAssignment_29818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred32318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_synpred42367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred52417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred122634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_synpred132652 = new BitSet(new long[]{0x0000000000000002L});

}