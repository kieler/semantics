package de.cau.cs.kieler.synccharts.labelparser.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.synccharts.labelparser.services.ActionLabelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class InternalActionLabelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?'", "'not'", "'pre'", "'or'", "'and'", "'/'", "'='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'mod'", "','", "'('", "')'", "':='", "'#'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=4;
    public static final int RULE_WS=11;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalActionLabelParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[229+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g"; }


     
     	private ActionLabelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ActionLabelGrammarAccess grammarAccess) {
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:61:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:62:1: ( ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:63:1: ruleAction EOF
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:70:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:74:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:75:1: ( ( rule__Action__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:75:1: ( ( rule__Action__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:76:1: ( rule__Action__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:77:1: ( rule__Action__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:77:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction101);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:89:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:90:1: ( ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:91:1: ruleEffect EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEffectRule()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect128);
            ruleEffect();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEffectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect135); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:98:1: ruleEffect : ( ( rule__Effect__Alternatives ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:102:2: ( ( ( rule__Effect__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:103:1: ( ( rule__Effect__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:103:1: ( ( rule__Effect__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:104:1: ( rule__Effect__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEffectAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:105:1: ( rule__Effect__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:105:2: rule__Effect__Alternatives
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:117:1: entryRuleEmission : ruleEmission EOF ;
    public final void entryRuleEmission() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:118:1: ( ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:119:1: ruleEmission EOF
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:126:1: ruleEmission : ( ( rule__Emission__Group__0 ) ) ;
    public final void ruleEmission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:130:2: ( ( ( rule__Emission__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:131:1: ( ( rule__Emission__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:131:1: ( ( rule__Emission__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:132:1: ( rule__Emission__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:133:1: ( rule__Emission__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:133:2: rule__Emission__Group__0
            {
            pushFollow(FOLLOW_rule__Emission__Group__0_in_ruleEmission223);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:145:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:146:1: ( ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:147:1: ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment250);
            ruleAssignment();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment257); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:154:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:158:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:159:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:159:1: ( ( rule__Assignment__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:160:1: ( rule__Assignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:161:1: ( rule__Assignment__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:161:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment284);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:173:1: entryRuleSignalReference : ruleSignalReference EOF ;
    public final void entryRuleSignalReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:174:1: ( ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:175:1: ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference311);
            ruleSignalReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference318); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:182:1: ruleSignalReference : ( ( rule__SignalReference__SignalAssignment ) ) ;
    public final void ruleSignalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:186:2: ( ( ( rule__SignalReference__SignalAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:187:1: ( ( rule__SignalReference__SignalAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:187:1: ( ( rule__SignalReference__SignalAssignment ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:188:1: ( rule__SignalReference__SignalAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:189:1: ( rule__SignalReference__SignalAssignment )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:189:2: rule__SignalReference__SignalAssignment
            {
            pushFollow(FOLLOW_rule__SignalReference__SignalAssignment_in_ruleSignalReference345);
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


    // $ANTLR start entryRuleVariableReference
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:201:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:202:1: ( ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:203:1: ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference372);
            ruleVariableReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference379); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:210:1: ruleVariableReference : ( ( rule__VariableReference__VariableAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:214:2: ( ( ( rule__VariableReference__VariableAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:215:1: ( ( rule__VariableReference__VariableAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:215:1: ( ( rule__VariableReference__VariableAssignment ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:216:1: ( rule__VariableReference__VariableAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:217:1: ( rule__VariableReference__VariableAssignment )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:217:2: rule__VariableReference__VariableAssignment
            {
            pushFollow(FOLLOW_rule__VariableReference__VariableAssignment_in_ruleVariableReference406);
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


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:233:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:234:1: ( ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:235:1: ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue437);
            ruleIntValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue444); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:242:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:246:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:247:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:247:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:248:1: ( rule__IntValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:249:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:249:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue471);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:261:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:262:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:263:1: ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue498);
            ruleFloatValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue505); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:270:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:274:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:275:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:275:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:276:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:277:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:277:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue532);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:289:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:290:1: ( ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:291:1: ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue559);
            ruleBooleanValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue566); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:298:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:302:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:303:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:303:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:304:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:305:1: ( rule__BooleanValue__ValueAssignment )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:305:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue593);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:319:1: entryRuleValOperation : ruleValOperation EOF ;
    public final void entryRuleValOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:320:1: ( ruleValOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:321:1: ruleValOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationRule()); 
            }
            pushFollow(FOLLOW_ruleValOperation_in_entryRuleValOperation622);
            ruleValOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValOperation629); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:328:1: ruleValOperation : ( ( rule__ValOperation__Group__0 ) ) ;
    public final void ruleValOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:332:2: ( ( ( rule__ValOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:333:1: ( ( rule__ValOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:333:1: ( ( rule__ValOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:334:1: ( rule__ValOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:335:1: ( rule__ValOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:335:2: rule__ValOperation__Group__0
            {
            pushFollow(FOLLOW_rule__ValOperation__Group__0_in_ruleValOperation656);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:347:1: entryRuleValueExpression : ruleValueExpression EOF ;
    public final void entryRuleValueExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:348:1: ( ruleValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:349:1: ruleValueExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_entryRuleValueExpression683);
            ruleValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValueExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpression690); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:356:1: ruleValueExpression : ( rulePlusOperation ) ;
    public final void ruleValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:360:2: ( ( rulePlusOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:361:1: ( rulePlusOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:361:1: ( rulePlusOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:362:1: rulePlusOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueExpressionAccess().getPlusOperationParserRuleCall()); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_ruleValueExpression717);
            rulePlusOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValueExpressionAccess().getPlusOperationParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start entryRuleParanthesedValueExpression
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:375:1: entryRuleParanthesedValueExpression : ruleParanthesedValueExpression EOF ;
    public final void entryRuleParanthesedValueExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:376:1: ( ruleParanthesedValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:377:1: ruleParanthesedValueExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParanthesedValueExpression_in_entryRuleParanthesedValueExpression743);
            ruleParanthesedValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedValueExpression750); if (failed) return ;

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
    // $ANTLR end entryRuleParanthesedValueExpression


    // $ANTLR start ruleParanthesedValueExpression
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:384:1: ruleParanthesedValueExpression : ( ( rule__ParanthesedValueExpression__Alternatives ) ) ;
    public final void ruleParanthesedValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:388:2: ( ( ( rule__ParanthesedValueExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:389:1: ( ( rule__ParanthesedValueExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:389:1: ( ( rule__ParanthesedValueExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:390:1: ( rule__ParanthesedValueExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:391:1: ( rule__ParanthesedValueExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:391:2: rule__ParanthesedValueExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Alternatives_in_ruleParanthesedValueExpression777);
            rule__ParanthesedValueExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleParanthesedValueExpression


    // $ANTLR start entryRulePlusOperation
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:403:1: entryRulePlusOperation : rulePlusOperation EOF ;
    public final void entryRulePlusOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:404:1: ( rulePlusOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:405:1: rulePlusOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationRule()); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_entryRulePlusOperation804);
            rulePlusOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOperation811); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:412:1: rulePlusOperation : ( ( rule__PlusOperation__Group__0 ) ) ;
    public final void rulePlusOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:416:2: ( ( ( rule__PlusOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:417:1: ( ( rule__PlusOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:417:1: ( ( rule__PlusOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:418:1: ( rule__PlusOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:419:1: ( rule__PlusOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:419:2: rule__PlusOperation__Group__0
            {
            pushFollow(FOLLOW_rule__PlusOperation__Group__0_in_rulePlusOperation838);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:431:1: entryRuleMultOrDivOperation : ruleMultOrDivOperation EOF ;
    public final void entryRuleMultOrDivOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:432:1: ( ruleMultOrDivOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:433:1: ruleMultOrDivOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationRule()); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation865);
            ruleMultOrDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOrDivOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOrDivOperation872); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:440:1: ruleMultOrDivOperation : ( ( rule__MultOrDivOperation__Alternatives ) ) ;
    public final void ruleMultOrDivOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:444:2: ( ( ( rule__MultOrDivOperation__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:445:1: ( ( rule__MultOrDivOperation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:445:1: ( ( rule__MultOrDivOperation__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:446:1: ( rule__MultOrDivOperation__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:447:1: ( rule__MultOrDivOperation__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:447:2: rule__MultOrDivOperation__Alternatives
            {
            pushFollow(FOLLOW_rule__MultOrDivOperation__Alternatives_in_ruleMultOrDivOperation899);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:459:1: entryRuleMultOperation : ruleMultOperation EOF ;
    public final void entryRuleMultOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:460:1: ( ruleMultOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:461:1: ruleMultOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationRule()); 
            }
            pushFollow(FOLLOW_ruleMultOperation_in_entryRuleMultOperation926);
            ruleMultOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOperation933); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:468:1: ruleMultOperation : ( ( rule__MultOperation__Group__0 ) ) ;
    public final void ruleMultOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:472:2: ( ( ( rule__MultOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:473:1: ( ( rule__MultOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:473:1: ( ( rule__MultOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:474:1: ( rule__MultOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:475:1: ( rule__MultOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:475:2: rule__MultOperation__Group__0
            {
            pushFollow(FOLLOW_rule__MultOperation__Group__0_in_ruleMultOperation960);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:487:1: entryRuleDivOperation : ruleDivOperation EOF ;
    public final void entryRuleDivOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:488:1: ( ruleDivOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:489:1: ruleDivOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationRule()); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_entryRuleDivOperation987);
            ruleDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivOperation994); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:496:1: ruleDivOperation : ( ( rule__DivOperation__Group__0 ) ) ;
    public final void ruleDivOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:500:2: ( ( ( rule__DivOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:501:1: ( ( rule__DivOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:501:1: ( ( rule__DivOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:502:1: ( rule__DivOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:503:1: ( rule__DivOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:503:2: rule__DivOperation__Group__0
            {
            pushFollow(FOLLOW_rule__DivOperation__Group__0_in_ruleDivOperation1021);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:515:1: entryRulePreArithmOperation : rulePreArithmOperation EOF ;
    public final void entryRulePreArithmOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:516:1: ( rulePreArithmOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:517:1: rulePreArithmOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationRule()); 
            }
            pushFollow(FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation1048);
            rulePreArithmOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreArithmOperation1055); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:524:1: rulePreArithmOperation : ( ( rule__PreArithmOperation__Group__0 ) ) ;
    public final void rulePreArithmOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:528:2: ( ( ( rule__PreArithmOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:529:1: ( ( rule__PreArithmOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:529:1: ( ( rule__PreArithmOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:530:1: ( rule__PreArithmOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:531:1: ( rule__PreArithmOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:531:2: rule__PreArithmOperation__Group__0
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__Group__0_in_rulePreArithmOperation1082);
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


    // $ANTLR start entryRulePreOrNormalValueExpression
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:543:1: entryRulePreOrNormalValueExpression : rulePreOrNormalValueExpression EOF ;
    public final void entryRulePreOrNormalValueExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:544:1: ( rulePreOrNormalValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:545:1: rulePreOrNormalValueExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreOrNormalValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_entryRulePreOrNormalValueExpression1109);
            rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreOrNormalValueExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreOrNormalValueExpression1116); if (failed) return ;

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
    // $ANTLR end entryRulePreOrNormalValueExpression


    // $ANTLR start rulePreOrNormalValueExpression
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:552:1: rulePreOrNormalValueExpression : ( ( rule__PreOrNormalValueExpression__Alternatives ) ) ;
    public final void rulePreOrNormalValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:556:2: ( ( ( rule__PreOrNormalValueExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:557:1: ( ( rule__PreOrNormalValueExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:557:1: ( ( rule__PreOrNormalValueExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:558:1: ( rule__PreOrNormalValueExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreOrNormalValueExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:559:1: ( rule__PreOrNormalValueExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:559:2: rule__PreOrNormalValueExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PreOrNormalValueExpression__Alternatives_in_rulePreOrNormalValueExpression1143);
            rule__PreOrNormalValueExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreOrNormalValueExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePreOrNormalValueExpression


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:571:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:572:1: ( ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:573:1: ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1170);
            ruleCompareOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation1177); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:580:1: ruleCompareOperation : ( ( rule__CompareOperation__Group__0 ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:584:2: ( ( ( rule__CompareOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:585:1: ( ( rule__CompareOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:585:1: ( ( rule__CompareOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:586:1: ( rule__CompareOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:587:1: ( rule__CompareOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:587:2: rule__CompareOperation__Group__0
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group__0_in_ruleCompareOperation1204);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:599:1: entryRuleUnaryOperation : ruleUnaryOperation EOF ;
    public final void entryRuleUnaryOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:600:1: ( ruleUnaryOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:601:1: ruleUnaryOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1231);
            ruleUnaryOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation1238); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:608:1: ruleUnaryOperation : ( ( rule__UnaryOperation__Group__0 ) ) ;
    public final void ruleUnaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:612:2: ( ( ( rule__UnaryOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:613:1: ( ( rule__UnaryOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:613:1: ( ( rule__UnaryOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:614:1: ( rule__UnaryOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:615:1: ( rule__UnaryOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:615:2: rule__UnaryOperation__Group__0
            {
            pushFollow(FOLLOW_rule__UnaryOperation__Group__0_in_ruleUnaryOperation1265);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:627:1: entryRuleUnaryParanthesedOperation : ruleUnaryParanthesedOperation EOF ;
    public final void entryRuleUnaryParanthesedOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:628:1: ( ruleUnaryParanthesedOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:629:1: ruleUnaryParanthesedOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation1292);
            ruleUnaryParanthesedOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation1299); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:636:1: ruleUnaryParanthesedOperation : ( ( rule__UnaryParanthesedOperation__Group__0 ) ) ;
    public final void ruleUnaryParanthesedOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:640:2: ( ( ( rule__UnaryParanthesedOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:641:1: ( ( rule__UnaryParanthesedOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:641:1: ( ( rule__UnaryParanthesedOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:642:1: ( rule__UnaryParanthesedOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:643:1: ( rule__UnaryParanthesedOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:643:2: rule__UnaryParanthesedOperation__Group__0
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__0_in_ruleUnaryParanthesedOperation1326);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:655:1: entryRuleUnaryOrNormalExpression : ruleUnaryOrNormalExpression EOF ;
    public final void entryRuleUnaryOrNormalExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:656:1: ( ruleUnaryOrNormalExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:657:1: ruleUnaryOrNormalExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOrNormalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression1353);
            ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOrNormalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression1360); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:664:1: ruleUnaryOrNormalExpression : ( ( rule__UnaryOrNormalExpression__Alternatives ) ) ;
    public final void ruleUnaryOrNormalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:668:2: ( ( ( rule__UnaryOrNormalExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:669:1: ( ( rule__UnaryOrNormalExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:669:1: ( ( rule__UnaryOrNormalExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:670:1: ( rule__UnaryOrNormalExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOrNormalExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:671:1: ( rule__UnaryOrNormalExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:671:2: rule__UnaryOrNormalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryOrNormalExpression__Alternatives_in_ruleUnaryOrNormalExpression1387);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:683:1: entryRuleAndOperation : ruleAndOperation EOF ;
    public final void entryRuleAndOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:684:1: ( ruleAndOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:685:1: ruleAndOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_entryRuleAndOperation1414);
            ruleAndOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperation1421); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:692:1: ruleAndOperation : ( ( rule__AndOperation__Group__0 ) ) ;
    public final void ruleAndOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:696:2: ( ( ( rule__AndOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:697:1: ( ( rule__AndOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:697:1: ( ( rule__AndOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:698:1: ( rule__AndOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:699:1: ( rule__AndOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:699:2: rule__AndOperation__Group__0
            {
            pushFollow(FOLLOW_rule__AndOperation__Group__0_in_ruleAndOperation1448);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:711:1: entryRuleOrOperation : ruleOrOperation EOF ;
    public final void entryRuleOrOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:712:1: ( ruleOrOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:713:1: ruleOrOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_entryRuleOrOperation1475);
            ruleOrOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperation1482); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:720:1: ruleOrOperation : ( ( rule__OrOperation__Group__0 ) ) ;
    public final void ruleOrOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:724:2: ( ( ( rule__OrOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:725:1: ( ( rule__OrOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:725:1: ( ( rule__OrOperation__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:726:1: ( rule__OrOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:727:1: ( rule__OrOperation__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:727:2: rule__OrOperation__Group__0
            {
            pushFollow(FOLLOW_rule__OrOperation__Group__0_in_ruleOrOperation1509);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:739:1: entryRuleParanthesedBooleanExpression : ruleParanthesedBooleanExpression EOF ;
    public final void entryRuleParanthesedBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:740:1: ( ruleParanthesedBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:741:1: ruleParanthesedBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression1536);
            ruleParanthesedBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression1543); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:748:1: ruleParanthesedBooleanExpression : ( ( rule__ParanthesedBooleanExpression__Alternatives ) ) ;
    public final void ruleParanthesedBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:752:2: ( ( ( rule__ParanthesedBooleanExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:753:1: ( ( rule__ParanthesedBooleanExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:753:1: ( ( rule__ParanthesedBooleanExpression__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:754:1: ( rule__ParanthesedBooleanExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:755:1: ( rule__ParanthesedBooleanExpression__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:755:2: rule__ParanthesedBooleanExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Alternatives_in_ruleParanthesedBooleanExpression1570);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:767:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:768:1: ( ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:769:1: ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression1597);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression1604); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:776:1: ruleBooleanExpression : ( ruleOrOperation ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:780:2: ( ( ruleOrOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:781:1: ( ruleOrOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:781:1: ( ruleOrOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:782:1: ruleOrOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_ruleBooleanExpression1631);
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


    // $ANTLR start entryRuleHostCode
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:795:1: entryRuleHostCode : ruleHostCode EOF ;
    public final void entryRuleHostCode() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:796:1: ( ruleHostCode EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:797:1: ruleHostCode EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeRule()); 
            }
            pushFollow(FOLLOW_ruleHostCode_in_entryRuleHostCode1657);
            ruleHostCode();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostCode1664); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:804:1: ruleHostCode : ( ( rule__HostCode__Group__0 ) ) ;
    public final void ruleHostCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:808:2: ( ( ( rule__HostCode__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:809:1: ( ( rule__HostCode__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:809:1: ( ( rule__HostCode__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:810:1: ( rule__HostCode__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:811:1: ( rule__HostCode__Group__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:811:2: rule__HostCode__Group__0
            {
            pushFollow(FOLLOW_rule__HostCode__Group__0_in_ruleHostCode1691);
            rule__HostCode__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start ruleValOperator
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:826:1: ruleValOperator : ( ( '?' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:830:1: ( ( ( '?' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:831:1: ( ( '?' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:831:1: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:832:1: ( '?' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:833:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:833:3: '?'
            {
            match(input,13,FOLLOW_13_in_ruleValOperator1731); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:846:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:850:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:851:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:851:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:852:1: ( rule__CompareOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:853:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:853:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1769);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:865:1: ruleUnaryOperator : ( ( 'not' ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:869:1: ( ( ( 'not' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:870:1: ( ( 'not' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:870:1: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:871:1: ( 'not' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:872:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:872:3: 'not'
            {
            match(input,14,FOLLOW_14_in_ruleUnaryOperator1806); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:885:1: ruleUnaryParanthesedOperator : ( ( 'pre' ) ) ;
    public final void ruleUnaryParanthesedOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:889:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:890:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:890:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:891:1: ( 'pre' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:892:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:892:3: 'pre'
            {
            match(input,15,FOLLOW_15_in_ruleUnaryParanthesedOperator1845); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:905:1: ruleOperatorOr : ( ( 'or' ) ) ;
    public final void ruleOperatorOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:909:1: ( ( ( 'or' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:910:1: ( ( 'or' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:910:1: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:911:1: ( 'or' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:912:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:912:3: 'or'
            {
            match(input,16,FOLLOW_16_in_ruleOperatorOr1884); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:925:1: ruleOperatorAnd : ( ( 'and' ) ) ;
    public final void ruleOperatorAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:929:1: ( ( ( 'and' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:930:1: ( ( 'and' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:930:1: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:931:1: ( 'and' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:932:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:932:3: 'and'
            {
            match(input,17,FOLLOW_17_in_ruleOperatorAnd1923); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:947:1: rulePlusOperator : ( ( rule__PlusOperator__Alternatives ) ) ;
    public final void rulePlusOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:951:1: ( ( ( rule__PlusOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:952:1: ( ( rule__PlusOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:952:1: ( ( rule__PlusOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:953:1: ( rule__PlusOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:954:1: ( rule__PlusOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:954:2: rule__PlusOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__PlusOperator__Alternatives_in_rulePlusOperator1963);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:966:1: ruleMultOperator : ( ( rule__MultOperator__Alternatives ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:970:1: ( ( ( rule__MultOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:971:1: ( ( rule__MultOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:971:1: ( ( rule__MultOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:972:1: ( rule__MultOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:973:1: ( rule__MultOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:973:2: rule__MultOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__MultOperator__Alternatives_in_ruleMultOperator1999);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:985:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:989:1: ( ( ( '/' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:990:1: ( ( '/' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:990:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:991:1: ( '/' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:992:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:992:3: '/'
            {
            match(input,18,FOLLOW_18_in_ruleDivOperator2036); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1004:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleHostCode ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1008:1: ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleHostCode ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==31) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||LA1_1==RULE_ID||LA1_1==RULE_STRING||(LA1_1>=28 && LA1_1<=29)) ) {
                    alt1=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1004:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleHostCode ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1004:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleHostCode ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1009:1: ( ruleEmission )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1009:1: ( ruleEmission )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1010:1: ruleEmission
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEmission_in_rule__Effect__Alternatives2073);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1015:6: ( ruleAssignment )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1015:6: ( ruleAssignment )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1016:1: ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2090);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1021:6: ( ruleHostCode )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1021:6: ( ruleHostCode )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1022:1: ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getHostCodeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_rule__Effect__Alternatives2107);
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


    // $ANTLR start rule__Emission__Alternatives_1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1032:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );
    public final void rule__Emission__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1036:1: ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
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
                        new NoViableAltException("1032:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1032:1: rule__Emission__Alternatives_1 : ( ( ( rule__Emission__Group_1_0__0 ) ) | ( ( rule__Emission__Group_1_1__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1037:1: ( ( rule__Emission__Group_1_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1037:1: ( ( rule__Emission__Group_1_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1038:1: ( rule__Emission__Group_1_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEmissionAccess().getGroup_1_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1039:1: ( rule__Emission__Group_1_0__0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1039:2: rule__Emission__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Emission__Group_1_0__0_in_rule__Emission__Alternatives_12139);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1043:6: ( ( rule__Emission__Group_1_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1043:6: ( ( rule__Emission__Group_1_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1044:1: ( rule__Emission__Group_1_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEmissionAccess().getGroup_1_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1045:1: ( rule__Emission__Group_1_1__0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1045:2: rule__Emission__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Emission__Group_1_1__0_in_rule__Emission__Alternatives_12157);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1054:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );
    public final void rule__Assignment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1058:1: ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) )
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
                        new NoViableAltException("1054:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 1, input);

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
                        new NoViableAltException("1054:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 2, input);

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
                        new NoViableAltException("1054:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 3, input);

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
                        new NoViableAltException("1054:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 4, input);

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
                        new NoViableAltException("1054:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 5, input);

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
                        new NoViableAltException("1054:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 6, input);

                    throw nvae;
                }
                }
                break;
            case 29:
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
                        new NoViableAltException("1054:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 7, input);

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
                    new NoViableAltException("1054:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) | ( ( rule__Assignment__ExpressionAssignment_2_1 ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1059:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1059:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1060:1: ( rule__Assignment__ExpressionAssignment_2_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1061:1: ( rule__Assignment__ExpressionAssignment_2_0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1061:2: rule__Assignment__ExpressionAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_rule__Assignment__Alternatives_22190);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1065:6: ( ( rule__Assignment__ExpressionAssignment_2_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1065:6: ( ( rule__Assignment__ExpressionAssignment_2_1 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1066:1: ( rule__Assignment__ExpressionAssignment_2_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1067:1: ( rule__Assignment__ExpressionAssignment_2_1 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1067:2: rule__Assignment__ExpressionAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_1_in_rule__Assignment__Alternatives_22208);
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


    // $ANTLR start rule__ParanthesedValueExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1077:1: rule__ParanthesedValueExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleHostCode ) | ( ( rule__ParanthesedValueExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValueExpression__Group_6__0 ) ) );
    public final void rule__ParanthesedValueExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1081:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleHostCode ) | ( ( rule__ParanthesedValueExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValueExpression__Group_6__0 ) ) )
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
            case 29:
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
                        new NoViableAltException("1077:1: rule__ParanthesedValueExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleHostCode ) | ( ( rule__ParanthesedValueExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValueExpression__Group_6__0 ) ) );", 4, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1077:1: rule__ParanthesedValueExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleValOperation ) | ( ruleVariableReference ) | ( ruleHostCode ) | ( ( rule__ParanthesedValueExpression__Group_5__0 ) ) | ( ( rule__ParanthesedValueExpression__Group_6__0 ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1082:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1082:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1083:1: ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValueExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__ParanthesedValueExpression__Alternatives2242);
                    ruleIntValue();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedValueExpressionAccess().getIntValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1088:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1088:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1089:1: ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValueExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__ParanthesedValueExpression__Alternatives2259);
                    ruleFloatValue();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedValueExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1094:6: ( ruleValOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1094:6: ( ruleValOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1095:1: ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValueExpressionAccess().getValOperationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_rule__ParanthesedValueExpression__Alternatives2276);
                    ruleValOperation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedValueExpressionAccess().getValOperationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1100:6: ( ruleVariableReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1100:6: ( ruleVariableReference )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1101:1: ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValueExpressionAccess().getVariableReferenceParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_rule__ParanthesedValueExpression__Alternatives2293);
                    ruleVariableReference();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedValueExpressionAccess().getVariableReferenceParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1106:6: ( ruleHostCode )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1106:6: ( ruleHostCode )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1107:1: ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValueExpressionAccess().getHostCodeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_rule__ParanthesedValueExpression__Alternatives2310);
                    ruleHostCode();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedValueExpressionAccess().getHostCodeParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1112:6: ( ( rule__ParanthesedValueExpression__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1112:6: ( ( rule__ParanthesedValueExpression__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1113:1: ( rule__ParanthesedValueExpression__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValueExpressionAccess().getGroup_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1114:1: ( rule__ParanthesedValueExpression__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1114:2: rule__ParanthesedValueExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_5__0_in_rule__ParanthesedValueExpression__Alternatives2327);
                    rule__ParanthesedValueExpression__Group_5__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedValueExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1118:6: ( ( rule__ParanthesedValueExpression__Group_6__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1118:6: ( ( rule__ParanthesedValueExpression__Group_6__0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1119:1: ( rule__ParanthesedValueExpression__Group_6__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedValueExpressionAccess().getGroup_6()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1120:1: ( rule__ParanthesedValueExpression__Group_6__0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1120:2: rule__ParanthesedValueExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_6__0_in_rule__ParanthesedValueExpression__Alternatives2345);
                    rule__ParanthesedValueExpression__Group_6__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedValueExpressionAccess().getGroup_6()); 
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
    // $ANTLR end rule__ParanthesedValueExpression__Alternatives


    // $ANTLR start rule__MultOrDivOperation__Alternatives
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1129:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );
    public final void rule__MultOrDivOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1133:1: ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_FLOAT)||LA5_0==RULE_STRING||LA5_0==13||LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
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
                        new NoViableAltException("1129:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );", 5, 7, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1129:1: rule__MultOrDivOperation__Alternatives : ( ( ruleMultOperation ) | ( ( rule__MultOrDivOperation__Group_1__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1134:1: ( ruleMultOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1134:1: ( ruleMultOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1135:1: ruleMultOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMultOperation_in_rule__MultOrDivOperation__Alternatives2378);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1140:6: ( ( rule__MultOrDivOperation__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1140:6: ( ( rule__MultOrDivOperation__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1141:1: ( rule__MultOrDivOperation__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOrDivOperationAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1142:1: ( rule__MultOrDivOperation__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1142:2: rule__MultOrDivOperation__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__0_in_rule__MultOrDivOperation__Alternatives2395);
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


    // $ANTLR start rule__PreOrNormalValueExpression__Alternatives
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1151:1: rule__PreOrNormalValueExpression__Alternatives : ( ( rulePreArithmOperation ) | ( ruleParanthesedValueExpression ) );
    public final void rule__PreOrNormalValueExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1155:1: ( ( rulePreArithmOperation ) | ( ruleParanthesedValueExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_FLOAT)||LA6_0==RULE_STRING||LA6_0==13||LA6_0==29) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1151:1: rule__PreOrNormalValueExpression__Alternatives : ( ( rulePreArithmOperation ) | ( ruleParanthesedValueExpression ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1156:1: ( rulePreArithmOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1156:1: ( rulePreArithmOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1157:1: rulePreArithmOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPreOrNormalValueExpressionAccess().getPreArithmOperationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePreArithmOperation_in_rule__PreOrNormalValueExpression__Alternatives2428);
                    rulePreArithmOperation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getPreOrNormalValueExpressionAccess().getPreArithmOperationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1162:6: ( ruleParanthesedValueExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1162:6: ( ruleParanthesedValueExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1163:1: ruleParanthesedValueExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPreOrNormalValueExpressionAccess().getParanthesedValueExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleParanthesedValueExpression_in_rule__PreOrNormalValueExpression__Alternatives2445);
                    ruleParanthesedValueExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getPreOrNormalValueExpressionAccess().getParanthesedValueExpressionParserRuleCall_1()); 
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
    // $ANTLR end rule__PreOrNormalValueExpression__Alternatives


    // $ANTLR start rule__UnaryOperation__SubExpressionsAlternatives_1_0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1173:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );
    public final void rule__UnaryOperation__SubExpressionsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1177:1: ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_STRING)||LA7_0==13||LA7_0==29) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==29) ) {
                    int LA7_3 = input.LA(3);

                    if ( ((LA7_3>=RULE_INT && LA7_3<=RULE_STRING)||(LA7_3>=14 && LA7_3<=15)||LA7_3==29) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==13) ) {
                        int LA7_5 = input.LA(4);

                        if ( (LA7_5==RULE_ID) ) {
                            int LA7_6 = input.LA(5);

                            if ( ((LA7_6>=16 && LA7_6<=17)||(LA7_6>=19 && LA7_6<=27)) ) {
                                alt7=2;
                            }
                            else if ( (LA7_6==30) ) {
                                int LA7_7 = input.LA(6);

                                if ( ((LA7_7>=19 && LA7_7<=27)) ) {
                                    alt7=1;
                                }
                                else if ( (LA7_7==EOF||LA7_7==RULE_ID||LA7_7==RULE_STRING||(LA7_7>=16 && LA7_7<=18)||LA7_7==28||LA7_7==30) ) {
                                    alt7=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1173:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 7, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1173:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1173:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1173:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1173:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1173:1: rule__UnaryOperation__SubExpressionsAlternatives_1_0 : ( ( ruleParanthesedBooleanExpression ) | ( ruleUnaryParanthesedOperation ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1178:1: ( ruleParanthesedBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1178:1: ( ruleParanthesedBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1179:1: ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02477);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1184:6: ( ruleUnaryParanthesedOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1184:6: ( ruleUnaryParanthesedOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1185:1: ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getSubExpressionsUnaryParanthesedOperationParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02494);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1195:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );
    public final void rule__UnaryOrNormalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1199:1: ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) )
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

                if ( (LA8_2==29) ) {
                    int LA8_4 = input.LA(3);

                    if ( ((LA8_4>=RULE_INT && LA8_4<=RULE_STRING)||(LA8_4>=14 && LA8_4<=15)||LA8_4==29) ) {
                        alt8=2;
                    }
                    else if ( (LA8_4==13) ) {
                        int LA8_6 = input.LA(4);

                        if ( (LA8_6==RULE_ID) ) {
                            int LA8_7 = input.LA(5);

                            if ( ((LA8_7>=16 && LA8_7<=17)||(LA8_7>=19 && LA8_7<=27)) ) {
                                alt8=2;
                            }
                            else if ( (LA8_7==30) ) {
                                int LA8_8 = input.LA(6);

                                if ( ((LA8_8>=19 && LA8_8<=27)) ) {
                                    alt8=3;
                                }
                                else if ( (LA8_8==EOF||LA8_8==RULE_ID||LA8_8==RULE_STRING||(LA8_8>=16 && LA8_8<=18)||LA8_8==28||LA8_8==30) ) {
                                    alt8=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1195:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 8, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1195:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1195:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1195:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1195:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case RULE_STRING:
            case 13:
            case 29:
                {
                alt8=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1195:1: rule__UnaryOrNormalExpression__Alternatives : ( ( ruleUnaryOperation ) | ( ruleUnaryParanthesedOperation ) | ( ruleParanthesedBooleanExpression ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1200:1: ( ruleUnaryOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1200:1: ( ruleUnaryOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1201:1: ruleUnaryOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryOperationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleUnaryOperation_in_rule__UnaryOrNormalExpression__Alternatives2526);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1206:6: ( ruleUnaryParanthesedOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1206:6: ( ruleUnaryParanthesedOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1207:1: ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOrNormalExpression__Alternatives2543);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1212:6: ( ruleParanthesedBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1212:6: ( ruleParanthesedBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1213:1: ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnaryOrNormalExpressionAccess().getParanthesedBooleanExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOrNormalExpression__Alternatives2560);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1223:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );
    public final void rule__ParanthesedBooleanExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1227:1: ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) )
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
                    int LA9_7 = input.LA(3);

                    if ( ((LA9_7>=19 && LA9_7<=27)) ) {
                        alt9=2;
                    }
                    else if ( (LA9_7==EOF||LA9_7==RULE_ID||LA9_7==RULE_STRING||(LA9_7>=16 && LA9_7<=18)||LA9_7==28||LA9_7==30) ) {
                        alt9=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1223:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1223:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==EOF||LA9_4==RULE_ID||LA9_4==RULE_STRING||(LA9_4>=16 && LA9_4<=18)||LA9_4==28||LA9_4==30) ) {
                    alt9=3;
                }
                else if ( ((LA9_4>=19 && LA9_4<=27)) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1223:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    int LA9_9 = input.LA(3);

                    if ( (LA9_9==RULE_ID) ) {
                        int LA9_13 = input.LA(4);

                        if ( (LA9_13==30) ) {
                            int LA9_14 = input.LA(5);

                            if ( (LA9_14==EOF||LA9_14==RULE_ID||LA9_14==RULE_STRING||(LA9_14>=16 && LA9_14<=18)||LA9_14==28||LA9_14==30) ) {
                                alt9=5;
                            }
                            else if ( ((LA9_14>=19 && LA9_14<=27)) ) {
                                alt9=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1223:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 14, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1223:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 13, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1223:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 9, input);

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
                    {
                    alt9=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 16:
                case 17:
                case 18:
                case 28:
                case 30:
                    {
                    alt9=5;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1223:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 5, input);

                    throw nvae;
                }

                }
                break;
            case 29:
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
                        new NoViableAltException("1223:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1223:1: rule__ParanthesedBooleanExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleCompareOperation ) | ( ruleSignalReference ) | ( ruleValOperation ) | ( ruleHostCode ) | ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1228:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1228:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1229:1: ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__ParanthesedBooleanExpression__Alternatives2592);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1234:6: ( ruleCompareOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1234:6: ( ruleCompareOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1235:1: ruleCompareOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCompareOperation_in_rule__ParanthesedBooleanExpression__Alternatives2609);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1240:6: ( ruleSignalReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1240:6: ( ruleSignalReference )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1241:1: ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_rule__ParanthesedBooleanExpression__Alternatives2626);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1246:6: ( ruleValOperation )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1246:6: ( ruleValOperation )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1247:1: ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getValOperationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_rule__ParanthesedBooleanExpression__Alternatives2643);
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
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1252:6: ( ruleHostCode )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1252:6: ( ruleHostCode )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1253:1: ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getHostCodeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_rule__ParanthesedBooleanExpression__Alternatives2660);
                    ruleHostCode();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getParanthesedBooleanExpressionAccess().getHostCodeParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1258:6: ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1258:6: ( ( rule__ParanthesedBooleanExpression__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1259:1: ( rule__ParanthesedBooleanExpression__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParanthesedBooleanExpressionAccess().getGroup_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1260:1: ( rule__ParanthesedBooleanExpression__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1260:2: rule__ParanthesedBooleanExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0_in_rule__ParanthesedBooleanExpression__Alternatives2677);
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


    // $ANTLR start rule__CompareOperator__Alternatives
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1270:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1274:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            case 22:
                {
                alt10=4;
                }
                break;
            case 23:
                {
                alt10=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1270:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1275:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1275:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1276:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1277:1: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1277:3: '='
                    {
                    match(input,19,FOLLOW_19_in_rule__CompareOperator__Alternatives2712); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1282:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1282:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1283:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1284:1: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1284:3: '<'
                    {
                    match(input,20,FOLLOW_20_in_rule__CompareOperator__Alternatives2733); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1289:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1289:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1290:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1291:1: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1291:3: '<='
                    {
                    match(input,21,FOLLOW_21_in_rule__CompareOperator__Alternatives2754); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1296:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1296:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1297:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1298:1: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1298:3: '>'
                    {
                    match(input,22,FOLLOW_22_in_rule__CompareOperator__Alternatives2775); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1303:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1303:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1304:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1305:1: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1305:3: '>='
                    {
                    match(input,23,FOLLOW_23_in_rule__CompareOperator__Alternatives2796); if (failed) return ;

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


    // $ANTLR start rule__PlusOperator__Alternatives
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1315:1: rule__PlusOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__PlusOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1319:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1315:1: rule__PlusOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1320:1: ( ( '+' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1320:1: ( ( '+' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1321:1: ( '+' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1322:1: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1322:3: '+'
                    {
                    match(input,24,FOLLOW_24_in_rule__PlusOperator__Alternatives2832); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1327:6: ( ( '-' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1327:6: ( ( '-' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1328:1: ( '-' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPlusOperatorAccess().getSUBEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1329:1: ( '-' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1329:3: '-'
                    {
                    match(input,25,FOLLOW_25_in_rule__PlusOperator__Alternatives2853); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1339:1: rule__MultOperator__Alternatives : ( ( ( '*' ) ) | ( ( 'mod' ) ) );
    public final void rule__MultOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1343:1: ( ( ( '*' ) ) | ( ( 'mod' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1339:1: rule__MultOperator__Alternatives : ( ( ( '*' ) ) | ( ( 'mod' ) ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1344:1: ( ( '*' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1344:1: ( ( '*' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1345:1: ( '*' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1346:1: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1346:3: '*'
                    {
                    match(input,26,FOLLOW_26_in_rule__MultOperator__Alternatives2889); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1351:6: ( ( 'mod' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1351:6: ( ( 'mod' ) )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1352:1: ( 'mod' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMultOperatorAccess().getMODEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1353:1: ( 'mod' )
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1353:3: 'mod'
                    {
                    match(input,27,FOLLOW_27_in_rule__MultOperator__Alternatives2910); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1365:1: rule__Action__Group__0 : ( ( rule__Action__IsImmediateAssignment_0 )? ) rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1369:1: ( ( ( rule__Action__IsImmediateAssignment_0 )? ) rule__Action__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1370:1: ( ( rule__Action__IsImmediateAssignment_0 )? ) rule__Action__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1370:1: ( ( rule__Action__IsImmediateAssignment_0 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1371:1: ( rule__Action__IsImmediateAssignment_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1372:1: ( rule__Action__IsImmediateAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1372:2: rule__Action__IsImmediateAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Action__IsImmediateAssignment_0_in_rule__Action__Group__02947);
                    rule__Action__IsImmediateAssignment_0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getIsImmediateAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__02957);
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


    // $ANTLR start rule__Action__Group__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1383:1: rule__Action__Group__1 : ( ( rule__Action__DelayAssignment_1 )? ) rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1387:1: ( ( ( rule__Action__DelayAssignment_1 )? ) rule__Action__Group__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1388:1: ( ( rule__Action__DelayAssignment_1 )? ) rule__Action__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1388:1: ( ( rule__Action__DelayAssignment_1 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1389:1: ( rule__Action__DelayAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDelayAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1390:1: ( rule__Action__DelayAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF||(LA14_1>=RULE_INT && LA14_1<=RULE_STRING)||(LA14_1>=13 && LA14_1<=15)||LA14_1==18||LA14_1==29) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1390:2: rule__Action__DelayAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Action__DelayAssignment_1_in_rule__Action__Group__12985);
                    rule__Action__DelayAssignment_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getDelayAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__12995);
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


    // $ANTLR start rule__Action__Group__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1401:1: rule__Action__Group__2 : ( ( rule__Action__TriggerAssignment_2 )? ) rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1405:1: ( ( ( rule__Action__TriggerAssignment_2 )? ) rule__Action__Group__3 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1406:1: ( ( rule__Action__TriggerAssignment_2 )? ) rule__Action__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1406:1: ( ( rule__Action__TriggerAssignment_2 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1407:1: ( rule__Action__TriggerAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTriggerAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1408:1: ( rule__Action__TriggerAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_INT && LA15_0<=RULE_STRING)||(LA15_0>=13 && LA15_0<=15)||LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1408:2: rule__Action__TriggerAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Action__TriggerAssignment_2_in_rule__Action__Group__23023);
                    rule__Action__TriggerAssignment_2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getTriggerAssignment_2()); 
            }

            }

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__23033);
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


    // $ANTLR start rule__Action__Group__3
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1419:1: rule__Action__Group__3 : ( ( rule__Action__Group_3__0 )? ) ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1423:1: ( ( ( rule__Action__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1424:1: ( ( rule__Action__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1424:1: ( ( rule__Action__Group_3__0 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1425:1: ( rule__Action__Group_3__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1426:1: ( rule__Action__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1426:2: rule__Action__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__33061);
                    rule__Action__Group_3__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getGroup_3()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__Action__Group_3__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1444:1: rule__Action__Group_3__0 : ( '/' ) rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1448:1: ( ( '/' ) rule__Action__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1449:1: ( '/' ) rule__Action__Group_3__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1449:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1450:1: '/'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getSolidusKeyword_3_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Action__Group_3__03105); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getSolidusKeyword_3_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__03115);
            rule__Action__Group_3__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_3__0


    // $ANTLR start rule__Action__Group_3__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1464:1: rule__Action__Group_3__1 : ( ( rule__Action__Group_3_1__0 )* ) ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1468:1: ( ( ( rule__Action__Group_3_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1469:1: ( ( rule__Action__Group_3_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1469:1: ( ( rule__Action__Group_3_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1470:1: ( rule__Action__Group_3_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_3_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1471:1: ( rule__Action__Group_3_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1471:2: rule__Action__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Action__Group_3_1__0_in_rule__Action__Group_3__13143);
            	    rule__Action__Group_3_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_3__1


    // $ANTLR start rule__Action__Group_3_1__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1485:1: rule__Action__Group_3_1__0 : ( ( rule__Action__EffectsAssignment_3_1_0 ) ) rule__Action__Group_3_1__1 ;
    public final void rule__Action__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1489:1: ( ( ( rule__Action__EffectsAssignment_3_1_0 ) ) rule__Action__Group_3_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1490:1: ( ( rule__Action__EffectsAssignment_3_1_0 ) ) rule__Action__Group_3_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1490:1: ( ( rule__Action__EffectsAssignment_3_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1491:1: ( rule__Action__EffectsAssignment_3_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getEffectsAssignment_3_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1492:1: ( rule__Action__EffectsAssignment_3_1_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1492:2: rule__Action__EffectsAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Action__EffectsAssignment_3_1_0_in_rule__Action__Group_3_1__03182);
            rule__Action__EffectsAssignment_3_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getEffectsAssignment_3_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Action__Group_3_1__1_in_rule__Action__Group_3_1__03191);
            rule__Action__Group_3_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_3_1__0


    // $ANTLR start rule__Action__Group_3_1__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1503:1: rule__Action__Group_3_1__1 : ( ( ',' )? ) ;
    public final void rule__Action__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1507:1: ( ( ( ',' )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1508:1: ( ( ',' )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1508:1: ( ( ',' )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1509:1: ( ',' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getCommaKeyword_3_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1510:1: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1511:2: ','
                    {
                    match(input,28,FOLLOW_28_in_rule__Action__Group_3_1__13221); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getCommaKeyword_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_3_1__1


    // $ANTLR start rule__Emission__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1526:1: rule__Emission__Group__0 : ( ( rule__Emission__SignalAssignment_0 ) ) rule__Emission__Group__1 ;
    public final void rule__Emission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1530:1: ( ( ( rule__Emission__SignalAssignment_0 ) ) rule__Emission__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1531:1: ( ( rule__Emission__SignalAssignment_0 ) ) rule__Emission__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1531:1: ( ( rule__Emission__SignalAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1532:1: ( rule__Emission__SignalAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1533:1: ( rule__Emission__SignalAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1533:2: rule__Emission__SignalAssignment_0
            {
            pushFollow(FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__03262);
            rule__Emission__SignalAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getSignalAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03271);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1544:1: rule__Emission__Group__1 : ( ( rule__Emission__Alternatives_1 )? ) ;
    public final void rule__Emission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1548:1: ( ( ( rule__Emission__Alternatives_1 )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1549:1: ( ( rule__Emission__Alternatives_1 )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1549:1: ( ( rule__Emission__Alternatives_1 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1550:1: ( rule__Emission__Alternatives_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1551:1: ( rule__Emission__Alternatives_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1551:2: rule__Emission__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Emission__Alternatives_1_in_rule__Emission__Group__13299);
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
    // $ANTLR end rule__Emission__Group__1


    // $ANTLR start rule__Emission__Group_1_0__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1565:1: rule__Emission__Group_1_0__0 : ( '(' ) rule__Emission__Group_1_0__1 ;
    public final void rule__Emission__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1569:1: ( ( '(' ) rule__Emission__Group_1_0__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1570:1: ( '(' ) rule__Emission__Group_1_0__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1570:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1571:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Emission__Group_1_0__03339); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Emission__Group_1_0__1_in_rule__Emission__Group_1_0__03349);
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


    // $ANTLR start rule__Emission__Group_1_0__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1585:1: rule__Emission__Group_1_0__1 : ( ( rule__Emission__NewValueAssignment_1_0_1 ) ) rule__Emission__Group_1_0__2 ;
    public final void rule__Emission__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1589:1: ( ( ( rule__Emission__NewValueAssignment_1_0_1 ) ) rule__Emission__Group_1_0__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1590:1: ( ( rule__Emission__NewValueAssignment_1_0_1 ) ) rule__Emission__Group_1_0__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1590:1: ( ( rule__Emission__NewValueAssignment_1_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1591:1: ( rule__Emission__NewValueAssignment_1_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_0_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1592:1: ( rule__Emission__NewValueAssignment_1_0_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1592:2: rule__Emission__NewValueAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_0_1_in_rule__Emission__Group_1_0__13377);
            rule__Emission__NewValueAssignment_1_0_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueAssignment_1_0_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Emission__Group_1_0__2_in_rule__Emission__Group_1_0__13386);
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


    // $ANTLR start rule__Emission__Group_1_0__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1603:1: rule__Emission__Group_1_0__2 : ( ')' ) ;
    public final void rule__Emission__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1607:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1608:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1608:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1609:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_0_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__Emission__Group_1_0__23415); if (failed) return ;
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
    // $ANTLR end rule__Emission__Group_1_0__2


    // $ANTLR start rule__Emission__Group_1_1__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1628:1: rule__Emission__Group_1_1__0 : ( '(' ) rule__Emission__Group_1_1__1 ;
    public final void rule__Emission__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1632:1: ( ( '(' ) rule__Emission__Group_1_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1633:1: ( '(' ) rule__Emission__Group_1_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1633:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1634:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Emission__Group_1_1__03457); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Emission__Group_1_1__1_in_rule__Emission__Group_1_1__03467);
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


    // $ANTLR start rule__Emission__Group_1_1__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1648:1: rule__Emission__Group_1_1__1 : ( ( rule__Emission__NewValueAssignment_1_1_1 ) ) rule__Emission__Group_1_1__2 ;
    public final void rule__Emission__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1652:1: ( ( ( rule__Emission__NewValueAssignment_1_1_1 ) ) rule__Emission__Group_1_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1653:1: ( ( rule__Emission__NewValueAssignment_1_1_1 ) ) rule__Emission__Group_1_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1653:1: ( ( rule__Emission__NewValueAssignment_1_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1654:1: ( rule__Emission__NewValueAssignment_1_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1655:1: ( rule__Emission__NewValueAssignment_1_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1655:2: rule__Emission__NewValueAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Emission__NewValueAssignment_1_1_1_in_rule__Emission__Group_1_1__13495);
            rule__Emission__NewValueAssignment_1_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Emission__Group_1_1__2_in_rule__Emission__Group_1_1__13504);
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


    // $ANTLR start rule__Emission__Group_1_1__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1666:1: rule__Emission__Group_1_1__2 : ( ')' ) ;
    public final void rule__Emission__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1670:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1671:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1671:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1672:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_1_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__Emission__Group_1_1__23533); if (failed) return ;
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
    // $ANTLR end rule__Emission__Group_1_1__2


    // $ANTLR start rule__Assignment__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1691:1: rule__Assignment__Group__0 : ( ( rule__Assignment__VariableAssignment_0 ) ) rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1695:1: ( ( ( rule__Assignment__VariableAssignment_0 ) ) rule__Assignment__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1696:1: ( ( rule__Assignment__VariableAssignment_0 ) ) rule__Assignment__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1696:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1697:1: ( rule__Assignment__VariableAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1698:1: ( rule__Assignment__VariableAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1698:2: rule__Assignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__03574);
            rule__Assignment__VariableAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03583);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1709:1: rule__Assignment__Group__1 : ( ':=' ) rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1713:1: ( ( ':=' ) rule__Assignment__Group__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1714:1: ( ':=' ) rule__Assignment__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1714:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1715:1: ':='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Assignment__Group__13612); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13622);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1729:1: rule__Assignment__Group__2 : ( ( rule__Assignment__Alternatives_2 ) ) ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1733:1: ( ( ( rule__Assignment__Alternatives_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1734:1: ( ( rule__Assignment__Alternatives_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1734:1: ( ( rule__Assignment__Alternatives_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1735:1: ( rule__Assignment__Alternatives_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1736:1: ( rule__Assignment__Alternatives_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1736:2: rule__Assignment__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Assignment__Alternatives_2_in_rule__Assignment__Group__23650);
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
    // $ANTLR end rule__Assignment__Group__2


    // $ANTLR start rule__ValOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1752:1: rule__ValOperation__Group__0 : ( ( rule__ValOperation__OperatorAssignment_0 ) ) rule__ValOperation__Group__1 ;
    public final void rule__ValOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1756:1: ( ( ( rule__ValOperation__OperatorAssignment_0 ) ) rule__ValOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1757:1: ( ( rule__ValOperation__OperatorAssignment_0 ) ) rule__ValOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1757:1: ( ( rule__ValOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1758:1: ( rule__ValOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1759:1: ( rule__ValOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1759:2: rule__ValOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__ValOperation__OperatorAssignment_0_in_rule__ValOperation__Group__03690);
            rule__ValOperation__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValOperationAccess().getOperatorAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ValOperation__Group__1_in_rule__ValOperation__Group__03699);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1770:1: rule__ValOperation__Group__1 : ( ( rule__ValOperation__SubExpressionsAssignment_1 ) ) ;
    public final void rule__ValOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1774:1: ( ( ( rule__ValOperation__SubExpressionsAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1775:1: ( ( rule__ValOperation__SubExpressionsAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1775:1: ( ( rule__ValOperation__SubExpressionsAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1776:1: ( rule__ValOperation__SubExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getSubExpressionsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1777:1: ( rule__ValOperation__SubExpressionsAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1777:2: rule__ValOperation__SubExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__ValOperation__SubExpressionsAssignment_1_in_rule__ValOperation__Group__13727);
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


    // $ANTLR start rule__ParanthesedValueExpression__Group_5__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1791:1: rule__ParanthesedValueExpression__Group_5__0 : ( '(' ) rule__ParanthesedValueExpression__Group_5__1 ;
    public final void rule__ParanthesedValueExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1795:1: ( ( '(' ) rule__ParanthesedValueExpression__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1796:1: ( '(' ) rule__ParanthesedValueExpression__Group_5__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1796:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1797:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__ParanthesedValueExpression__Group_5__03766); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_5__1_in_rule__ParanthesedValueExpression__Group_5__03776);
            rule__ParanthesedValueExpression__Group_5__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValueExpression__Group_5__0


    // $ANTLR start rule__ParanthesedValueExpression__Group_5__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1811:1: rule__ParanthesedValueExpression__Group_5__1 : ( rulePlusOperation ) rule__ParanthesedValueExpression__Group_5__2 ;
    public final void rule__ParanthesedValueExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1815:1: ( ( rulePlusOperation ) rule__ParanthesedValueExpression__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1816:1: ( rulePlusOperation ) rule__ParanthesedValueExpression__Group_5__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1816:1: ( rulePlusOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1817:1: rulePlusOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getPlusOperationParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_rule__ParanthesedValueExpression__Group_5__13804);
            rulePlusOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getPlusOperationParserRuleCall_5_1()); 
            }

            }

            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_5__2_in_rule__ParanthesedValueExpression__Group_5__13812);
            rule__ParanthesedValueExpression__Group_5__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValueExpression__Group_5__1


    // $ANTLR start rule__ParanthesedValueExpression__Group_5__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1829:1: rule__ParanthesedValueExpression__Group_5__2 : ( ')' ) ;
    public final void rule__ParanthesedValueExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1833:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1834:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1834:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1835:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParanthesedValueExpression__Group_5__23841); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValueExpression__Group_5__2


    // $ANTLR start rule__ParanthesedValueExpression__Group_6__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1854:1: rule__ParanthesedValueExpression__Group_6__0 : ( '(' ) rule__ParanthesedValueExpression__Group_6__1 ;
    public final void rule__ParanthesedValueExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1858:1: ( ( '(' ) rule__ParanthesedValueExpression__Group_6__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1859:1: ( '(' ) rule__ParanthesedValueExpression__Group_6__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1859:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1860:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__ParanthesedValueExpression__Group_6__03883); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_6__1_in_rule__ParanthesedValueExpression__Group_6__03893);
            rule__ParanthesedValueExpression__Group_6__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValueExpression__Group_6__0


    // $ANTLR start rule__ParanthesedValueExpression__Group_6__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1874:1: rule__ParanthesedValueExpression__Group_6__1 : ( ruleDivOperation ) rule__ParanthesedValueExpression__Group_6__2 ;
    public final void rule__ParanthesedValueExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1878:1: ( ( ruleDivOperation ) rule__ParanthesedValueExpression__Group_6__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1879:1: ( ruleDivOperation ) rule__ParanthesedValueExpression__Group_6__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1879:1: ( ruleDivOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1880:1: ruleDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getDivOperationParserRuleCall_6_1()); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_rule__ParanthesedValueExpression__Group_6__13921);
            ruleDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getDivOperationParserRuleCall_6_1()); 
            }

            }

            pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_6__2_in_rule__ParanthesedValueExpression__Group_6__13929);
            rule__ParanthesedValueExpression__Group_6__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValueExpression__Group_6__1


    // $ANTLR start rule__ParanthesedValueExpression__Group_6__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1892:1: rule__ParanthesedValueExpression__Group_6__2 : ( ')' ) ;
    public final void rule__ParanthesedValueExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1896:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1897:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1897:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1898:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedValueExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParanthesedValueExpression__Group_6__23958); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedValueExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ParanthesedValueExpression__Group_6__2


    // $ANTLR start rule__PlusOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1917:1: rule__PlusOperation__Group__0 : ( ruleMultOrDivOperation ) rule__PlusOperation__Group__1 ;
    public final void rule__PlusOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1921:1: ( ( ruleMultOrDivOperation ) rule__PlusOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1922:1: ( ruleMultOrDivOperation ) rule__PlusOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1922:1: ( ruleMultOrDivOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1923:1: ruleMultOrDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getMultOrDivOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__Group__03999);
            ruleMultOrDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationAccess().getMultOrDivOperationParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__PlusOperation__Group__1_in_rule__PlusOperation__Group__04007);
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


    // $ANTLR start rule__PlusOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1935:1: rule__PlusOperation__Group__1 : ( ( rule__PlusOperation__Group_1__0 )* ) ;
    public final void rule__PlusOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1939:1: ( ( ( rule__PlusOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1940:1: ( ( rule__PlusOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1940:1: ( ( rule__PlusOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1941:1: ( rule__PlusOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1942:1: ( rule__PlusOperation__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=24 && LA20_0<=25)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1942:2: rule__PlusOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOperation__Group_1__0_in_rule__PlusOperation__Group__14035);
            	    rule__PlusOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end rule__PlusOperation__Group__1


    // $ANTLR start rule__PlusOperation__Group_1__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1956:1: rule__PlusOperation__Group_1__0 : ( () ) rule__PlusOperation__Group_1__1 ;
    public final void rule__PlusOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1960:1: ( ( () ) rule__PlusOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1961:1: ( () ) rule__PlusOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1961:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1962:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1963:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1965:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__PlusOperation__Group_1__1_in_rule__PlusOperation__Group_1__04084);
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


    // $ANTLR start rule__PlusOperation__Group_1__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1976:1: rule__PlusOperation__Group_1__1 : ( ( rule__PlusOperation__OperatorAssignment_1_1 ) ) rule__PlusOperation__Group_1__2 ;
    public final void rule__PlusOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1980:1: ( ( ( rule__PlusOperation__OperatorAssignment_1_1 ) ) rule__PlusOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1981:1: ( ( rule__PlusOperation__OperatorAssignment_1_1 ) ) rule__PlusOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1981:1: ( ( rule__PlusOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1982:1: ( rule__PlusOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1983:1: ( rule__PlusOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1983:2: rule__PlusOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOperation__OperatorAssignment_1_1_in_rule__PlusOperation__Group_1__14112);
            rule__PlusOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPlusOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__PlusOperation__Group_1__2_in_rule__PlusOperation__Group_1__14121);
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


    // $ANTLR start rule__PlusOperation__Group_1__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1994:1: rule__PlusOperation__Group_1__2 : ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__PlusOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1998:1: ( ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1999:1: ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1999:1: ( ( rule__PlusOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2000:1: ( rule__PlusOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2001:1: ( rule__PlusOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2001:2: rule__PlusOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PlusOperation__SubExpressionsAssignment_1_2_in_rule__PlusOperation__Group_1__24149);
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
    // $ANTLR end rule__PlusOperation__Group_1__2


    // $ANTLR start rule__MultOrDivOperation__Group_1__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2017:1: rule__MultOrDivOperation__Group_1__0 : ( '(' ) rule__MultOrDivOperation__Group_1__1 ;
    public final void rule__MultOrDivOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2021:1: ( ( '(' ) rule__MultOrDivOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2022:1: ( '(' ) rule__MultOrDivOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2022:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2023:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__MultOrDivOperation__Group_1__04190); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOrDivOperationAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__1_in_rule__MultOrDivOperation__Group_1__04200);
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


    // $ANTLR start rule__MultOrDivOperation__Group_1__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2037:1: rule__MultOrDivOperation__Group_1__1 : ( ruleDivOperation ) rule__MultOrDivOperation__Group_1__2 ;
    public final void rule__MultOrDivOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2041:1: ( ( ruleDivOperation ) rule__MultOrDivOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2042:1: ( ruleDivOperation ) rule__MultOrDivOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2042:1: ( ruleDivOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2043:1: ruleDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getDivOperationParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_rule__MultOrDivOperation__Group_1__14228);
            ruleDivOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOrDivOperationAccess().getDivOperationParserRuleCall_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__MultOrDivOperation__Group_1__2_in_rule__MultOrDivOperation__Group_1__14236);
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


    // $ANTLR start rule__MultOrDivOperation__Group_1__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2055:1: rule__MultOrDivOperation__Group_1__2 : ( ')' ) ;
    public final void rule__MultOrDivOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2059:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2060:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2060:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2061:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOrDivOperationAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__MultOrDivOperation__Group_1__24265); if (failed) return ;
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
    // $ANTLR end rule__MultOrDivOperation__Group_1__2


    // $ANTLR start rule__MultOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2080:1: rule__MultOperation__Group__0 : ( rulePreOrNormalValueExpression ) rule__MultOperation__Group__1 ;
    public final void rule__MultOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2084:1: ( ( rulePreOrNormalValueExpression ) rule__MultOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2085:1: ( rulePreOrNormalValueExpression ) rule__MultOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2085:1: ( rulePreOrNormalValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2086:1: rulePreOrNormalValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_rule__MultOperation__Group__04306);
            rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__MultOperation__Group__1_in_rule__MultOperation__Group__04314);
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


    // $ANTLR start rule__MultOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2098:1: rule__MultOperation__Group__1 : ( ( rule__MultOperation__Group_1__0 )* ) ;
    public final void rule__MultOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2102:1: ( ( ( rule__MultOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2103:1: ( ( rule__MultOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2103:1: ( ( rule__MultOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2104:1: ( rule__MultOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2105:1: ( rule__MultOperation__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=26 && LA21_0<=27)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2105:2: rule__MultOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultOperation__Group_1__0_in_rule__MultOperation__Group__14342);
            	    rule__MultOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end rule__MultOperation__Group__1


    // $ANTLR start rule__MultOperation__Group_1__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2119:1: rule__MultOperation__Group_1__0 : ( () ) rule__MultOperation__Group_1__1 ;
    public final void rule__MultOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2123:1: ( ( () ) rule__MultOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2124:1: ( () ) rule__MultOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2124:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2125:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2126:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2128:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__MultOperation__Group_1__1_in_rule__MultOperation__Group_1__04391);
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


    // $ANTLR start rule__MultOperation__Group_1__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2139:1: rule__MultOperation__Group_1__1 : ( ( rule__MultOperation__OperatorAssignment_1_1 ) ) rule__MultOperation__Group_1__2 ;
    public final void rule__MultOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2143:1: ( ( ( rule__MultOperation__OperatorAssignment_1_1 ) ) rule__MultOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2144:1: ( ( rule__MultOperation__OperatorAssignment_1_1 ) ) rule__MultOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2144:1: ( ( rule__MultOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2145:1: ( rule__MultOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2146:1: ( rule__MultOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2146:2: rule__MultOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultOperation__OperatorAssignment_1_1_in_rule__MultOperation__Group_1__14419);
            rule__MultOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__MultOperation__Group_1__2_in_rule__MultOperation__Group_1__14428);
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


    // $ANTLR start rule__MultOperation__Group_1__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2157:1: rule__MultOperation__Group_1__2 : ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2161:1: ( ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2162:1: ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2162:1: ( ( rule__MultOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2163:1: ( rule__MultOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2164:1: ( rule__MultOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2164:2: rule__MultOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MultOperation__SubExpressionsAssignment_1_2_in_rule__MultOperation__Group_1__24456);
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
    // $ANTLR end rule__MultOperation__Group_1__2


    // $ANTLR start rule__DivOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2180:1: rule__DivOperation__Group__0 : ( rulePreOrNormalValueExpression ) rule__DivOperation__Group__1 ;
    public final void rule__DivOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2184:1: ( ( rulePreOrNormalValueExpression ) rule__DivOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2185:1: ( rulePreOrNormalValueExpression ) rule__DivOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2185:1: ( rulePreOrNormalValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2186:1: rulePreOrNormalValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_rule__DivOperation__Group__04496);
            rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__DivOperation__Group__1_in_rule__DivOperation__Group__04504);
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


    // $ANTLR start rule__DivOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2198:1: rule__DivOperation__Group__1 : ( ( rule__DivOperation__Group_1__0 )* ) ;
    public final void rule__DivOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2202:1: ( ( ( rule__DivOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2203:1: ( ( rule__DivOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2203:1: ( ( rule__DivOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2204:1: ( rule__DivOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2205:1: ( rule__DivOperation__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2205:2: rule__DivOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DivOperation__Group_1__0_in_rule__DivOperation__Group__14532);
            	    rule__DivOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end rule__DivOperation__Group__1


    // $ANTLR start rule__DivOperation__Group_1__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2219:1: rule__DivOperation__Group_1__0 : ( () ) rule__DivOperation__Group_1__1 ;
    public final void rule__DivOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2223:1: ( ( () ) rule__DivOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2224:1: ( () ) rule__DivOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2224:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2225:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2226:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2228:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__DivOperation__Group_1__1_in_rule__DivOperation__Group_1__04581);
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


    // $ANTLR start rule__DivOperation__Group_1__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2239:1: rule__DivOperation__Group_1__1 : ( ( rule__DivOperation__OperatorAssignment_1_1 ) ) rule__DivOperation__Group_1__2 ;
    public final void rule__DivOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2243:1: ( ( ( rule__DivOperation__OperatorAssignment_1_1 ) ) rule__DivOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2244:1: ( ( rule__DivOperation__OperatorAssignment_1_1 ) ) rule__DivOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2244:1: ( ( rule__DivOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2245:1: ( rule__DivOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2246:1: ( rule__DivOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2246:2: rule__DivOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DivOperation__OperatorAssignment_1_1_in_rule__DivOperation__Group_1__14609);
            rule__DivOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__DivOperation__Group_1__2_in_rule__DivOperation__Group_1__14618);
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


    // $ANTLR start rule__DivOperation__Group_1__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2257:1: rule__DivOperation__Group_1__2 : ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2261:1: ( ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2262:1: ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2262:1: ( ( rule__DivOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2263:1: ( rule__DivOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2264:1: ( rule__DivOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2264:2: rule__DivOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__DivOperation__SubExpressionsAssignment_1_2_in_rule__DivOperation__Group_1__24646);
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
    // $ANTLR end rule__DivOperation__Group_1__2


    // $ANTLR start rule__PreArithmOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2280:1: rule__PreArithmOperation__Group__0 : ( ( rule__PreArithmOperation__OperatorAssignment_0 ) ) rule__PreArithmOperation__Group__1 ;
    public final void rule__PreArithmOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2284:1: ( ( ( rule__PreArithmOperation__OperatorAssignment_0 ) ) rule__PreArithmOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2285:1: ( ( rule__PreArithmOperation__OperatorAssignment_0 ) ) rule__PreArithmOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2285:1: ( ( rule__PreArithmOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2286:1: ( rule__PreArithmOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2287:1: ( rule__PreArithmOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2287:2: rule__PreArithmOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__OperatorAssignment_0_in_rule__PreArithmOperation__Group__04686);
            rule__PreArithmOperation__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationAccess().getOperatorAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__PreArithmOperation__Group__1_in_rule__PreArithmOperation__Group__04695);
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


    // $ANTLR start rule__PreArithmOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2298:1: rule__PreArithmOperation__Group__1 : ( '(' ) rule__PreArithmOperation__Group__2 ;
    public final void rule__PreArithmOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2302:1: ( ( '(' ) rule__PreArithmOperation__Group__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2303:1: ( '(' ) rule__PreArithmOperation__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2303:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2304:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__PreArithmOperation__Group__14724); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationAccess().getLeftParenthesisKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__PreArithmOperation__Group__2_in_rule__PreArithmOperation__Group__14734);
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


    // $ANTLR start rule__PreArithmOperation__Group__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2318:1: rule__PreArithmOperation__Group__2 : ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) ) rule__PreArithmOperation__Group__3 ;
    public final void rule__PreArithmOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2322:1: ( ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) ) rule__PreArithmOperation__Group__3 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2323:1: ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) ) rule__PreArithmOperation__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2323:1: ( ( rule__PreArithmOperation__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2324:1: ( rule__PreArithmOperation__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2325:1: ( rule__PreArithmOperation__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2325:2: rule__PreArithmOperation__SubExpressionsAssignment_2
            {
            pushFollow(FOLLOW_rule__PreArithmOperation__SubExpressionsAssignment_2_in_rule__PreArithmOperation__Group__24762);
            rule__PreArithmOperation__SubExpressionsAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreArithmOperationAccess().getSubExpressionsAssignment_2()); 
            }

            }

            pushFollow(FOLLOW_rule__PreArithmOperation__Group__3_in_rule__PreArithmOperation__Group__24771);
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


    // $ANTLR start rule__PreArithmOperation__Group__3
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2336:1: rule__PreArithmOperation__Group__3 : ( ')' ) ;
    public final void rule__PreArithmOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2340:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2341:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2341:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2342:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FOLLOW_30_in_rule__PreArithmOperation__Group__34800); if (failed) return ;
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
    // $ANTLR end rule__PreArithmOperation__Group__3


    // $ANTLR start rule__CompareOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2363:1: rule__CompareOperation__Group__0 : ( ruleValueExpression ) rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2367:1: ( ( ruleValueExpression ) rule__CompareOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2368:1: ( ruleValueExpression ) rule__CompareOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2368:1: ( ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2369:1: ruleValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__CompareOperation__Group__04843);
            ruleValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__04851);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2381:1: rule__CompareOperation__Group__1 : ( ( rule__CompareOperation__Group_1__0 ) ) ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2385:1: ( ( ( rule__CompareOperation__Group_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2386:1: ( ( rule__CompareOperation__Group_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2386:1: ( ( rule__CompareOperation__Group_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2387:1: ( rule__CompareOperation__Group_1__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2388:1: ( rule__CompareOperation__Group_1__0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2388:2: rule__CompareOperation__Group_1__0
            {
            pushFollow(FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__14879);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2402:1: rule__CompareOperation__Group_1__0 : ( () ) rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2406:1: ( ( () ) rule__CompareOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2407:1: ( () ) rule__CompareOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2407:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2408:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2409:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2411:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__04927);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2422:1: rule__CompareOperation__Group_1__1 : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2426:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) rule__CompareOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2427:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) rule__CompareOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2427:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2428:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2429:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2429:2: rule__CompareOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__14955);
            rule__CompareOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__14964);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2440:1: rule__CompareOperation__Group_1__2 : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2444:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2445:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2445:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2446:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2447:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2447:2: rule__CompareOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__24992);
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


    // $ANTLR start rule__UnaryOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2463:1: rule__UnaryOperation__Group__0 : ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) rule__UnaryOperation__Group__1 ;
    public final void rule__UnaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2467:1: ( ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) rule__UnaryOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2468:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) rule__UnaryOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2468:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2469:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2470:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2470:2: rule__UnaryOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__05032);
            rule__UnaryOperation__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__05041);
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


    // $ANTLR start rule__UnaryOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2481:1: rule__UnaryOperation__Group__1 : ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) ) ;
    public final void rule__UnaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2485:1: ( ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2486:1: ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2486:1: ( ( rule__UnaryOperation__SubExpressionsAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2487:1: ( rule__UnaryOperation__SubExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getSubExpressionsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2488:1: ( rule__UnaryOperation__SubExpressionsAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2488:2: rule__UnaryOperation__SubExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__UnaryOperation__SubExpressionsAssignment_1_in_rule__UnaryOperation__Group__15069);
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
    // $ANTLR end rule__UnaryOperation__Group__1


    // $ANTLR start rule__UnaryParanthesedOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2502:1: rule__UnaryParanthesedOperation__Group__0 : ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) ) rule__UnaryParanthesedOperation__Group__1 ;
    public final void rule__UnaryParanthesedOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2506:1: ( ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) ) rule__UnaryParanthesedOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2507:1: ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) ) rule__UnaryParanthesedOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2507:1: ( ( rule__UnaryParanthesedOperation__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2508:1: ( rule__UnaryParanthesedOperation__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2509:1: ( rule__UnaryParanthesedOperation__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2509:2: rule__UnaryParanthesedOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__OperatorAssignment_0_in_rule__UnaryParanthesedOperation__Group__05107);
            rule__UnaryParanthesedOperation__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__1_in_rule__UnaryParanthesedOperation__Group__05116);
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


    // $ANTLR start rule__UnaryParanthesedOperation__Group__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2520:1: rule__UnaryParanthesedOperation__Group__1 : ( '(' ) rule__UnaryParanthesedOperation__Group__2 ;
    public final void rule__UnaryParanthesedOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2524:1: ( ( '(' ) rule__UnaryParanthesedOperation__Group__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2525:1: ( '(' ) rule__UnaryParanthesedOperation__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2525:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2526:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__UnaryParanthesedOperation__Group__15145); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationAccess().getLeftParenthesisKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__2_in_rule__UnaryParanthesedOperation__Group__15155);
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


    // $ANTLR start rule__UnaryParanthesedOperation__Group__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2540:1: rule__UnaryParanthesedOperation__Group__2 : ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) ) rule__UnaryParanthesedOperation__Group__3 ;
    public final void rule__UnaryParanthesedOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2544:1: ( ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) ) rule__UnaryParanthesedOperation__Group__3 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2545:1: ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) ) rule__UnaryParanthesedOperation__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2545:1: ( ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2546:1: ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2547:1: ( rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2547:2: rule__UnaryParanthesedOperation__SubExpressionsAssignment_2
            {
            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__SubExpressionsAssignment_2_in_rule__UnaryParanthesedOperation__Group__25183);
            rule__UnaryParanthesedOperation__SubExpressionsAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsAssignment_2()); 
            }

            }

            pushFollow(FOLLOW_rule__UnaryParanthesedOperation__Group__3_in_rule__UnaryParanthesedOperation__Group__25192);
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


    // $ANTLR start rule__UnaryParanthesedOperation__Group__3
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2558:1: rule__UnaryParanthesedOperation__Group__3 : ( ')' ) ;
    public final void rule__UnaryParanthesedOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2562:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2563:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2563:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2564:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FOLLOW_30_in_rule__UnaryParanthesedOperation__Group__35221); if (failed) return ;
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
    // $ANTLR end rule__UnaryParanthesedOperation__Group__3


    // $ANTLR start rule__AndOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2585:1: rule__AndOperation__Group__0 : ( ruleUnaryOrNormalExpression ) rule__AndOperation__Group__1 ;
    public final void rule__AndOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2589:1: ( ( ruleUnaryOrNormalExpression ) rule__AndOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2590:1: ( ruleUnaryOrNormalExpression ) rule__AndOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2590:1: ( ruleUnaryOrNormalExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2591:1: ruleUnaryOrNormalExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getUnaryOrNormalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__Group__05264);
            ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getUnaryOrNormalExpressionParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__AndOperation__Group__1_in_rule__AndOperation__Group__05272);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2603:1: rule__AndOperation__Group__1 : ( ( rule__AndOperation__Group_1__0 )* ) ;
    public final void rule__AndOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2607:1: ( ( ( rule__AndOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2608:1: ( ( rule__AndOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2608:1: ( ( rule__AndOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2609:1: ( rule__AndOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2610:1: ( rule__AndOperation__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2610:2: rule__AndOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndOperation__Group_1__0_in_rule__AndOperation__Group__15300);
            	    rule__AndOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2624:1: rule__AndOperation__Group_1__0 : ( () ) rule__AndOperation__Group_1__1 ;
    public final void rule__AndOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2628:1: ( ( () ) rule__AndOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2629:1: ( () ) rule__AndOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2629:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2630:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2631:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2633:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__AndOperation__Group_1__1_in_rule__AndOperation__Group_1__05349);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2644:1: rule__AndOperation__Group_1__1 : ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) rule__AndOperation__Group_1__2 ;
    public final void rule__AndOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2648:1: ( ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) rule__AndOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2649:1: ( ( rule__AndOperation__OperatorAssignment_1_1 ) ) rule__AndOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2649:1: ( ( rule__AndOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2650:1: ( rule__AndOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2651:1: ( rule__AndOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2651:2: rule__AndOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndOperation__OperatorAssignment_1_1_in_rule__AndOperation__Group_1__15377);
            rule__AndOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__AndOperation__Group_1__2_in_rule__AndOperation__Group_1__15386);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2662:1: rule__AndOperation__Group_1__2 : ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2666:1: ( ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2667:1: ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2667:1: ( ( rule__AndOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2668:1: ( rule__AndOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2669:1: ( rule__AndOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2669:2: rule__AndOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndOperation__SubExpressionsAssignment_1_2_in_rule__AndOperation__Group_1__25414);
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
    // $ANTLR end rule__AndOperation__Group_1__2


    // $ANTLR start rule__OrOperation__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2685:1: rule__OrOperation__Group__0 : ( ruleAndOperation ) rule__OrOperation__Group__1 ;
    public final void rule__OrOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2689:1: ( ( ruleAndOperation ) rule__OrOperation__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2690:1: ( ruleAndOperation ) rule__OrOperation__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2690:1: ( ruleAndOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2691:1: ruleAndOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_rule__OrOperation__Group__05454);
            ruleAndOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__OrOperation__Group__1_in_rule__OrOperation__Group__05462);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2703:1: rule__OrOperation__Group__1 : ( ( rule__OrOperation__Group_1__0 )* ) ;
    public final void rule__OrOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2707:1: ( ( ( rule__OrOperation__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2708:1: ( ( rule__OrOperation__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2708:1: ( ( rule__OrOperation__Group_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2709:1: ( rule__OrOperation__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2710:1: ( rule__OrOperation__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2710:2: rule__OrOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrOperation__Group_1__0_in_rule__OrOperation__Group__15490);
            	    rule__OrOperation__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2724:1: rule__OrOperation__Group_1__0 : ( () ) rule__OrOperation__Group_1__1 ;
    public final void rule__OrOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2728:1: ( ( () ) rule__OrOperation__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2729:1: ( () ) rule__OrOperation__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2729:1: ( () )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2730:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2731:1: ()
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2733:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getComplexExpressionSubExpressionsAction_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__OrOperation__Group_1__1_in_rule__OrOperation__Group_1__05539);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2744:1: rule__OrOperation__Group_1__1 : ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) rule__OrOperation__Group_1__2 ;
    public final void rule__OrOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2748:1: ( ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) rule__OrOperation__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2749:1: ( ( rule__OrOperation__OperatorAssignment_1_1 ) ) rule__OrOperation__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2749:1: ( ( rule__OrOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2750:1: ( rule__OrOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2751:1: ( rule__OrOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2751:2: rule__OrOperation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrOperation__OperatorAssignment_1_1_in_rule__OrOperation__Group_1__15567);
            rule__OrOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getOrOperationAccess().getOperatorAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__OrOperation__Group_1__2_in_rule__OrOperation__Group_1__15576);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2762:1: rule__OrOperation__Group_1__2 : ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2766:1: ( ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2767:1: ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2767:1: ( ( rule__OrOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2768:1: ( rule__OrOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2769:1: ( rule__OrOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2769:2: rule__OrOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrOperation__SubExpressionsAssignment_1_2_in_rule__OrOperation__Group_1__25604);
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


    // $ANTLR start rule__ParanthesedBooleanExpression__Group_5__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2785:1: rule__ParanthesedBooleanExpression__Group_5__0 : ( '(' ) rule__ParanthesedBooleanExpression__Group_5__1 ;
    public final void rule__ParanthesedBooleanExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2789:1: ( ( '(' ) rule__ParanthesedBooleanExpression__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2790:1: ( '(' ) rule__ParanthesedBooleanExpression__Group_5__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2790:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2791:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__ParanthesedBooleanExpression__Group_5__05645); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1_in_rule__ParanthesedBooleanExpression__Group_5__05655);
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


    // $ANTLR start rule__ParanthesedBooleanExpression__Group_5__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2805:1: rule__ParanthesedBooleanExpression__Group_5__1 : ( ruleOrOperation ) rule__ParanthesedBooleanExpression__Group_5__2 ;
    public final void rule__ParanthesedBooleanExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2809:1: ( ( ruleOrOperation ) rule__ParanthesedBooleanExpression__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2810:1: ( ruleOrOperation ) rule__ParanthesedBooleanExpression__Group_5__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2810:1: ( ruleOrOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2811:1: ruleOrOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_rule__ParanthesedBooleanExpression__Group_5__15683);
            ruleOrOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_5_1()); 
            }

            }

            pushFollow(FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2_in_rule__ParanthesedBooleanExpression__Group_5__15691);
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


    // $ANTLR start rule__ParanthesedBooleanExpression__Group_5__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2823:1: rule__ParanthesedBooleanExpression__Group_5__2 : ( ')' ) ;
    public final void rule__ParanthesedBooleanExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2827:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2828:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2828:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2829:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParanthesedBooleanExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParanthesedBooleanExpression__Group_5__25720); if (failed) return ;
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
    // $ANTLR end rule__ParanthesedBooleanExpression__Group_5__2


    // $ANTLR start rule__HostCode__Group__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2848:1: rule__HostCode__Group__0 : ( ( rule__HostCode__CodeAssignment_0 ) ) rule__HostCode__Group__1 ;
    public final void rule__HostCode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2852:1: ( ( ( rule__HostCode__CodeAssignment_0 ) ) rule__HostCode__Group__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2853:1: ( ( rule__HostCode__CodeAssignment_0 ) ) rule__HostCode__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2853:1: ( ( rule__HostCode__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2854:1: ( rule__HostCode__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2855:1: ( rule__HostCode__CodeAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2855:2: rule__HostCode__CodeAssignment_0
            {
            pushFollow(FOLLOW_rule__HostCode__CodeAssignment_0_in_rule__HostCode__Group__05761);
            rule__HostCode__CodeAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getCodeAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__HostCode__Group__1_in_rule__HostCode__Group__05770);
            rule__HostCode__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HostCode__Group__0


    // $ANTLR start rule__HostCode__Group__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2866:1: rule__HostCode__Group__1 : ( ( rule__HostCode__Group_1__0 )? ) ;
    public final void rule__HostCode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2870:1: ( ( ( rule__HostCode__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2871:1: ( ( rule__HostCode__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2871:1: ( ( rule__HostCode__Group_1__0 )? )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2872:1: ( rule__HostCode__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2873:1: ( rule__HostCode__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2873:2: rule__HostCode__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__HostCode__Group_1__0_in_rule__HostCode__Group__15798);
                    rule__HostCode__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HostCode__Group__1


    // $ANTLR start rule__HostCode__Group_1__0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2887:1: rule__HostCode__Group_1__0 : ( '(' ) rule__HostCode__Group_1__1 ;
    public final void rule__HostCode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2891:1: ( ( '(' ) rule__HostCode__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2892:1: ( '(' ) rule__HostCode__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2892:1: ( '(' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2893:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__HostCode__Group_1__05838); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__HostCode__Group_1__1_in_rule__HostCode__Group_1__05848);
            rule__HostCode__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HostCode__Group_1__0


    // $ANTLR start rule__HostCode__Group_1__1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2907:1: rule__HostCode__Group_1__1 : ( ( rule__HostCode__TypeAssignment_1_1 ) ) rule__HostCode__Group_1__2 ;
    public final void rule__HostCode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2911:1: ( ( ( rule__HostCode__TypeAssignment_1_1 ) ) rule__HostCode__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2912:1: ( ( rule__HostCode__TypeAssignment_1_1 ) ) rule__HostCode__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2912:1: ( ( rule__HostCode__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2913:1: ( rule__HostCode__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2914:1: ( rule__HostCode__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2914:2: rule__HostCode__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__HostCode__TypeAssignment_1_1_in_rule__HostCode__Group_1__15876);
            rule__HostCode__TypeAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getTypeAssignment_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__HostCode__Group_1__2_in_rule__HostCode__Group_1__15885);
            rule__HostCode__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HostCode__Group_1__1


    // $ANTLR start rule__HostCode__Group_1__2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2925:1: rule__HostCode__Group_1__2 : ( ')' ) ;
    public final void rule__HostCode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2929:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2930:1: ( ')' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2930:1: ( ')' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2931:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__HostCode__Group_1__25914); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HostCode__Group_1__2


    // $ANTLR start rule__Action__IsImmediateAssignment_0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2950:1: rule__Action__IsImmediateAssignment_0 : ( ( '#' ) ) ;
    public final void rule__Action__IsImmediateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2954:1: ( ( ( '#' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2955:1: ( ( '#' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2955:1: ( ( '#' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2956:1: ( '#' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2957:1: ( '#' )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2958:1: '#'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_0_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Action__IsImmediateAssignment_05960); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__IsImmediateAssignment_0


    // $ANTLR start rule__Action__DelayAssignment_1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2973:1: rule__Action__DelayAssignment_1 : ( RULE_INT ) ;
    public final void rule__Action__DelayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2977:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2978:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2978:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2979:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Action__DelayAssignment_15999); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__DelayAssignment_1


    // $ANTLR start rule__Action__TriggerAssignment_2
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2988:1: rule__Action__TriggerAssignment_2 : ( ruleBooleanExpression ) ;
    public final void rule__Action__TriggerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2992:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2993:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2993:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:2994:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Action__TriggerAssignment_26030);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__TriggerAssignment_2


    // $ANTLR start rule__Action__EffectsAssignment_3_1_0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3003:1: rule__Action__EffectsAssignment_3_1_0 : ( ruleEffect ) ;
    public final void rule__Action__EffectsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3007:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3008:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3008:1: ( ruleEffect )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3009:1: ruleEffect
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_rule__Action__EffectsAssignment_3_1_06061);
            ruleEffect();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__EffectsAssignment_3_1_0


    // $ANTLR start rule__Emission__SignalAssignment_0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3018:1: rule__Emission__SignalAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Emission__SignalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3022:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3023:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3023:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3024:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3025:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3026:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getSignalSignalIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_06096); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3037:1: rule__Emission__NewValueAssignment_1_0_1 : ( ruleValueExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3041:1: ( ( ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3042:1: ( ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3042:1: ( ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3043:1: ruleValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueValueExpressionParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__Emission__NewValueAssignment_1_0_16131);
            ruleValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueValueExpressionParserRuleCall_1_0_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3052:1: rule__Emission__NewValueAssignment_1_1_1 : ( ruleBooleanExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3056:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3057:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3057:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3058:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Emission__NewValueAssignment_1_1_16162);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3067:1: rule__Assignment__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3071:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3072:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3072:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3073:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3074:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3075:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_06197); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3086:1: rule__Assignment__ExpressionAssignment_2_0 : ( ruleValueExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3090:1: ( ( ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3091:1: ( ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3091:1: ( ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3092:1: ruleValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionValueExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__Assignment__ExpressionAssignment_2_06232);
            ruleValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExpressionValueExpressionParserRuleCall_2_0_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3101:1: rule__Assignment__ExpressionAssignment_2_1 : ( ruleBooleanExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3105:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3106:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3106:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3107:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Assignment__ExpressionAssignment_2_16263);
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


    // $ANTLR start rule__SignalReference__SignalAssignment
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3116:1: rule__SignalReference__SignalAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SignalReference__SignalAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3120:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3121:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3121:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3122:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3123:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3124:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SignalReference__SignalAssignment6298); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getSignalSignalIDTerminalRuleCall_0_1()); 
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


    // $ANTLR start rule__VariableReference__VariableAssignment
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3135:1: rule__VariableReference__VariableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3139:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3140:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3140:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3141:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3142:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3143:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment6337); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableVariableIDTerminalRuleCall_0_1()); 
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


    // $ANTLR start rule__IntValue__ValueAssignment
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3156:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3160:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3161:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3161:1: ( RULE_INT )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3162:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment6374); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3171:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3175:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3176:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3176:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3177:1: RULE_FLOAT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment6405); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3186:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3190:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3191:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3191:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3192:1: RULE_BOOLEAN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment6436); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3201:1: rule__ValOperation__OperatorAssignment_0 : ( ruleValOperator ) ;
    public final void rule__ValOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3205:1: ( ( ruleValOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3206:1: ( ruleValOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3206:1: ( ruleValOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3207:1: ruleValOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValOperator_in_rule__ValOperation__OperatorAssignment_06467);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3216:1: rule__ValOperation__SubExpressionsAssignment_1 : ( ruleSignalReference ) ;
    public final void rule__ValOperation__SubExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3220:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3221:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3221:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3222:1: ruleSignalReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_rule__ValOperation__SubExpressionsAssignment_16498);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3231:1: rule__PlusOperation__OperatorAssignment_1_1 : ( rulePlusOperator ) ;
    public final void rule__PlusOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3235:1: ( ( rulePlusOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3236:1: ( rulePlusOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3236:1: ( rulePlusOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3237:1: rulePlusOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getOperatorPlusOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePlusOperator_in_rule__PlusOperation__OperatorAssignment_1_16529);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3246:1: rule__PlusOperation__SubExpressionsAssignment_1_2 : ( ruleMultOrDivOperation ) ;
    public final void rule__PlusOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3250:1: ( ( ruleMultOrDivOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3251:1: ( ruleMultOrDivOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3251:1: ( ruleMultOrDivOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3252:1: ruleMultOrDivOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPlusOperationAccess().getSubExpressionsMultOrDivOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__SubExpressionsAssignment_1_26560);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3261:1: rule__MultOperation__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3265:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3266:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3266:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3267:1: ruleMultOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultOperator_in_rule__MultOperation__OperatorAssignment_1_16591);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3276:1: rule__MultOperation__SubExpressionsAssignment_1_2 : ( rulePreOrNormalValueExpression ) ;
    public final void rule__MultOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3280:1: ( ( rulePreOrNormalValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3281:1: ( rulePreOrNormalValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3281:1: ( rulePreOrNormalValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3282:1: rulePreOrNormalValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_rule__MultOperation__SubExpressionsAssignment_1_26622);
            rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3291:1: rule__DivOperation__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3295:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3296:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3296:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3297:1: ruleDivOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleDivOperator_in_rule__DivOperation__OperatorAssignment_1_16653);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3306:1: rule__DivOperation__SubExpressionsAssignment_1_2 : ( rulePreOrNormalValueExpression ) ;
    public final void rule__DivOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3310:1: ( ( rulePreOrNormalValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3311:1: ( rulePreOrNormalValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3311:1: ( rulePreOrNormalValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3312:1: rulePreOrNormalValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_rule__DivOperation__SubExpressionsAssignment_1_26684);
            rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3321:1: rule__PreArithmOperation__OperatorAssignment_0 : ( ruleUnaryParanthesedOperator ) ;
    public final void rule__PreArithmOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3325:1: ( ( ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3326:1: ( ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3326:1: ( ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3327:1: ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_rule__PreArithmOperation__OperatorAssignment_06715);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3336:1: rule__PreArithmOperation__SubExpressionsAssignment_2 : ( ruleValOperation ) ;
    public final void rule__PreArithmOperation__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3340:1: ( ( ruleValOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3341:1: ( ruleValOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3341:1: ( ruleValOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3342:1: ruleValOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreArithmOperationAccess().getSubExpressionsValOperationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValOperation_in_rule__PreArithmOperation__SubExpressionsAssignment_26746);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3351:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3355:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3356:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3356:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3357:1: ruleCompareOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_16777);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3366:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleValueExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3370:1: ( ( ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3371:1: ( ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3371:1: ( ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3372:1: ruleValueExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsValueExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_26808);
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


    // $ANTLR start rule__UnaryOperation__OperatorAssignment_0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3381:1: rule__UnaryOperation__OperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3385:1: ( ( ruleUnaryOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3386:1: ( ruleUnaryOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3386:1: ( ruleUnaryOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3387:1: ruleUnaryOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_06839);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3396:1: rule__UnaryOperation__SubExpressionsAssignment_1 : ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) ) ;
    public final void rule__UnaryOperation__SubExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3400:1: ( ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3401:1: ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3401:1: ( ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3402:1: ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getSubExpressionsAlternatives_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3403:1: ( rule__UnaryOperation__SubExpressionsAlternatives_1_0 )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3403:2: rule__UnaryOperation__SubExpressionsAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__UnaryOperation__SubExpressionsAlternatives_1_0_in_rule__UnaryOperation__SubExpressionsAssignment_16870);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3412:1: rule__UnaryParanthesedOperation__OperatorAssignment_0 : ( ruleUnaryParanthesedOperator ) ;
    public final void rule__UnaryParanthesedOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3416:1: ( ( ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3417:1: ( ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3417:1: ( ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3418:1: ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_rule__UnaryParanthesedOperation__OperatorAssignment_06903);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3427:1: rule__UnaryParanthesedOperation__SubExpressionsAssignment_2 : ( ruleBooleanExpression ) ;
    public final void rule__UnaryParanthesedOperation__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3431:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3432:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3432:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3433:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__UnaryParanthesedOperation__SubExpressionsAssignment_26934);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3442:1: rule__AndOperation__OperatorAssignment_1_1 : ( ruleOperatorAnd ) ;
    public final void rule__AndOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3446:1: ( ( ruleOperatorAnd ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3447:1: ( ruleOperatorAnd )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3447:1: ( ruleOperatorAnd )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3448:1: ruleOperatorAnd
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOperatorAnd_in_rule__AndOperation__OperatorAssignment_1_16965);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3457:1: rule__AndOperation__SubExpressionsAssignment_1_2 : ( ruleUnaryOrNormalExpression ) ;
    public final void rule__AndOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3461:1: ( ( ruleUnaryOrNormalExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3462:1: ( ruleUnaryOrNormalExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3462:1: ( ruleUnaryOrNormalExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3463:1: ruleUnaryOrNormalExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperationAccess().getSubExpressionsUnaryOrNormalExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__SubExpressionsAssignment_1_26996);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3472:1: rule__OrOperation__OperatorAssignment_1_1 : ( ruleOperatorOr ) ;
    public final void rule__OrOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3476:1: ( ( ruleOperatorOr ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3477:1: ( ruleOperatorOr )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3477:1: ( ruleOperatorOr )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3478:1: ruleOperatorOr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOperatorOr_in_rule__OrOperation__OperatorAssignment_1_17027);
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
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3487:1: rule__OrOperation__SubExpressionsAssignment_1_2 : ( ruleAndOperation ) ;
    public final void rule__OrOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3491:1: ( ( ruleAndOperation ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3492:1: ( ruleAndOperation )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3492:1: ( ruleAndOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3493:1: ruleAndOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_rule__OrOperation__SubExpressionsAssignment_1_27058);
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


    // $ANTLR start rule__HostCode__CodeAssignment_0
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3502:1: rule__HostCode__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__HostCode__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3506:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3507:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3507:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3508:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HostCode__CodeAssignment_07089); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HostCode__CodeAssignment_0


    // $ANTLR start rule__HostCode__TypeAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3517:1: rule__HostCode__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__HostCode__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3521:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3522:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3522:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:3523:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getHostCodeAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HostCode__TypeAssignment_1_17120); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getHostCodeAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HostCode__TypeAssignment_1_1

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1037:1: ( ( ( rule__Emission__Group_1_0__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1037:1: ( ( rule__Emission__Group_1_0__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1037:1: ( ( rule__Emission__Group_1_0__0 ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1038:1: ( rule__Emission__Group_1_0__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getEmissionAccess().getGroup_1_0()); 
        }
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1039:1: ( rule__Emission__Group_1_0__0 )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1039:2: rule__Emission__Group_1_0__0
        {
        pushFollow(FOLLOW_rule__Emission__Group_1_0__0_in_synpred32139);
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
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1059:1: ( ( ( rule__Assignment__ExpressionAssignment_2_0 ) ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1059:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1059:1: ( ( rule__Assignment__ExpressionAssignment_2_0 ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1060:1: ( rule__Assignment__ExpressionAssignment_2_0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2_0()); 
        }
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1061:1: ( rule__Assignment__ExpressionAssignment_2_0 )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1061:2: rule__Assignment__ExpressionAssignment_2_0
        {
        pushFollow(FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_synpred42190);
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
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1112:6: ( ( ( rule__ParanthesedValueExpression__Group_5__0 ) ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1112:6: ( ( rule__ParanthesedValueExpression__Group_5__0 ) )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1112:6: ( ( rule__ParanthesedValueExpression__Group_5__0 ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1113:1: ( rule__ParanthesedValueExpression__Group_5__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedValueExpressionAccess().getGroup_5()); 
        }
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1114:1: ( rule__ParanthesedValueExpression__Group_5__0 )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1114:2: rule__ParanthesedValueExpression__Group_5__0
        {
        pushFollow(FOLLOW_rule__ParanthesedValueExpression__Group_5__0_in_synpred102327);
        rule__ParanthesedValueExpression__Group_5__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1134:1: ( ( ruleMultOperation ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1134:1: ( ruleMultOperation )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1134:1: ( ruleMultOperation )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1135:1: ruleMultOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleMultOperation_in_synpred112378);
        ruleMultOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1234:6: ( ( ruleCompareOperation ) )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1234:6: ( ruleCompareOperation )
        {
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1234:6: ( ruleCompareOperation )
        // ../de.cau.cs.kieler.synccharts.labelparser.ui/src-gen/de/cau/cs/kieler/synccharts/labelparser/contentassist/antlr/internal/InternalActionLabel.g:1235:1: ruleCompareOperation
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleCompareOperation_in_synpred172609);
        ruleCompareOperation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred17

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
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Effect__Alternatives_in_ruleEffect162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__0_in_ruleEmission223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__SignalAssignment_in_ruleSignalReference345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_in_ruleVariableReference406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_entryRuleValOperation622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValOperation629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__Group__0_in_ruleValOperation656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_entryRuleValueExpression683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpression690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_ruleValueExpression717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValueExpression_in_entryRuleParanthesedValueExpression743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedValueExpression750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Alternatives_in_ruleParanthesedValueExpression777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_entryRulePlusOperation804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOperation811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group__0_in_rulePlusOperation838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOrDivOperation872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Alternatives_in_ruleMultOrDivOperation899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_entryRuleMultOperation926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOperation933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group__0_in_ruleMultOperation960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperation_in_entryRuleDivOperation987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivOperation994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group__0_in_ruleDivOperation1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation1048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreArithmOperation1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__0_in_rulePreArithmOperation1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_entryRulePreOrNormalValueExpression1109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreOrNormalValueExpression1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreOrNormalValueExpression__Alternatives_in_rulePreOrNormalValueExpression1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__0_in_ruleCompareOperation1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__Group__0_in_ruleUnaryOperation1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation1292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__0_in_ruleUnaryParanthesedOperation1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression1353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOrNormalExpression__Alternatives_in_ruleUnaryOrNormalExpression1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_entryRuleAndOperation1414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperation1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group__0_in_ruleAndOperation1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_entryRuleOrOperation1475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperation1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group__0_in_ruleOrOperation1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression1536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Alternatives_in_ruleParanthesedBooleanExpression1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression1597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleBooleanExpression1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_entryRuleHostCode1657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostCode1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__Group__0_in_ruleHostCode1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleValOperator1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleUnaryOperator1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUnaryParanthesedOperator1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOperatorOr1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOperatorAnd1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperator__Alternatives_in_rulePlusOperator1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperator__Alternatives_in_ruleMultOperator1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDivOperator2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_rule__Effect__Alternatives2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_rule__Effect__Alternatives2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0_in_rule__Emission__Alternatives_12139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__0_in_rule__Emission__Alternatives_12157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_rule__Assignment__Alternatives_22190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_1_in_rule__Assignment__Alternatives_22208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__ParanthesedValueExpression__Alternatives2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__ParanthesedValueExpression__Alternatives2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_rule__ParanthesedValueExpression__Alternatives2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rule__ParanthesedValueExpression__Alternatives2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_rule__ParanthesedValueExpression__Alternatives2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_5__0_in_rule__ParanthesedValueExpression__Alternatives2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_6__0_in_rule__ParanthesedValueExpression__Alternatives2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_rule__MultOrDivOperation__Alternatives2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__0_in_rule__MultOrDivOperation__Alternatives2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_rule__PreOrNormalValueExpression__Alternatives2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValueExpression_in_rule__PreOrNormalValueExpression__Alternatives2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOperation__SubExpressionsAlternatives_1_02494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_rule__UnaryOrNormalExpression__Alternatives2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_rule__UnaryOrNormalExpression__Alternatives2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_rule__UnaryOrNormalExpression__Alternatives2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__ParanthesedBooleanExpression__Alternatives2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_rule__ParanthesedBooleanExpression__Alternatives2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__ParanthesedBooleanExpression__Alternatives2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_rule__ParanthesedBooleanExpression__Alternatives2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_rule__ParanthesedBooleanExpression__Alternatives2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__0_in_rule__ParanthesedBooleanExpression__Alternatives2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CompareOperator__Alternatives2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CompareOperator__Alternatives2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CompareOperator__Alternatives2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CompareOperator__Alternatives2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CompareOperator__Alternatives2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PlusOperator__Alternatives2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PlusOperator__Alternatives2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MultOperator__Alternatives2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MultOperator__Alternatives2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__IsImmediateAssignment_0_in_rule__Action__Group__02947 = new BitSet(new long[]{0x000000002004E1F2L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__02957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DelayAssignment_1_in_rule__Action__Group__12985 = new BitSet(new long[]{0x000000002004E1F2L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__12995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TriggerAssignment_2_in_rule__Action__Group__23023 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__23033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__33061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Action__Group_3__03105 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__03115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3_1__0_in_rule__Action__Group_3__13143 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_rule__Action__EffectsAssignment_3_1_0_in_rule__Action__Group_3_1__03182 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3_1__1_in_rule__Action__Group_3_1__03191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Action__Group_3_1__13221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__SignalAssignment_0_in_rule__Emission__Group__03262 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__03271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Alternatives_1_in_rule__Emission__Group__13299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Emission__Group_1_0__03339 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__1_in_rule__Emission__Group_1_0__03349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_0_1_in_rule__Emission__Group_1_0__13377 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__2_in_rule__Emission__Group_1_0__13386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Emission__Group_1_0__23415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Emission__Group_1_1__03457 = new BitSet(new long[]{0x000000002000E1F0L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__1_in_rule__Emission__Group_1_1__03467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_1_1_in_rule__Emission__Group_1_1__13495 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_1__2_in_rule__Emission__Group_1_1__13504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Emission__Group_1_1__23533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_0_in_rule__Assignment__Group__03574 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__03583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Assignment__Group__13612 = new BitSet(new long[]{0x000000002000E1F0L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Alternatives_2_in_rule__Assignment__Group__23650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__OperatorAssignment_0_in_rule__ValOperation__Group__03690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ValOperation__Group__1_in_rule__ValOperation__Group__03699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValOperation__SubExpressionsAssignment_1_in_rule__ValOperation__Group__13727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ParanthesedValueExpression__Group_5__03766 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_5__1_in_rule__ParanthesedValueExpression__Group_5__03776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_rule__ParanthesedValueExpression__Group_5__13804 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_5__2_in_rule__ParanthesedValueExpression__Group_5__13812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParanthesedValueExpression__Group_5__23841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ParanthesedValueExpression__Group_6__03883 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_6__1_in_rule__ParanthesedValueExpression__Group_6__03893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperation_in_rule__ParanthesedValueExpression__Group_6__13921 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_6__2_in_rule__ParanthesedValueExpression__Group_6__13929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParanthesedValueExpression__Group_6__23958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__Group__03999 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group__1_in_rule__PlusOperation__Group__04007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__0_in_rule__PlusOperation__Group__14035 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__1_in_rule__PlusOperation__Group_1__04084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__OperatorAssignment_1_1_in_rule__PlusOperation__Group_1__14112 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__PlusOperation__Group_1__2_in_rule__PlusOperation__Group_1__14121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOperation__SubExpressionsAssignment_1_2_in_rule__PlusOperation__Group_1__24149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MultOrDivOperation__Group_1__04190 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__1_in_rule__MultOrDivOperation__Group_1__04200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperation_in_rule__MultOrDivOperation__Group_1__14228 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MultOrDivOperation__Group_1__2_in_rule__MultOrDivOperation__Group_1__14236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MultOrDivOperation__Group_1__24265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_rule__MultOperation__Group__04306 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group__1_in_rule__MultOperation__Group__04314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__0_in_rule__MultOperation__Group__14342 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__1_in_rule__MultOperation__Group_1__04391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__OperatorAssignment_1_1_in_rule__MultOperation__Group_1__14419 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__MultOperation__Group_1__2_in_rule__MultOperation__Group_1__14428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultOperation__SubExpressionsAssignment_1_2_in_rule__MultOperation__Group_1__24456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_rule__DivOperation__Group__04496 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group__1_in_rule__DivOperation__Group__04504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__0_in_rule__DivOperation__Group__14532 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__1_in_rule__DivOperation__Group_1__04581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__OperatorAssignment_1_1_in_rule__DivOperation__Group_1__14609 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__DivOperation__Group_1__2_in_rule__DivOperation__Group_1__14618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DivOperation__SubExpressionsAssignment_1_2_in_rule__DivOperation__Group_1__24646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__OperatorAssignment_0_in_rule__PreArithmOperation__Group__04686 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__1_in_rule__PreArithmOperation__Group__04695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PreArithmOperation__Group__14724 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__2_in_rule__PreArithmOperation__Group__14734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__SubExpressionsAssignment_2_in_rule__PreArithmOperation__Group__24762 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PreArithmOperation__Group__3_in_rule__PreArithmOperation__Group__24771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PreArithmOperation__Group__34800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__CompareOperation__Group__04843 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__04851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__14879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__04927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__14955 = new BitSet(new long[]{0x000000002000A170L});
    public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__14964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__24992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__05032 = new BitSet(new long[]{0x000000002000A1F0L});
    public static final BitSet FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__05041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__SubExpressionsAssignment_1_in_rule__UnaryOperation__Group__15069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__OperatorAssignment_0_in_rule__UnaryParanthesedOperation__Group__05107 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__1_in_rule__UnaryParanthesedOperation__Group__05116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__UnaryParanthesedOperation__Group__15145 = new BitSet(new long[]{0x000000002000E1F0L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__2_in_rule__UnaryParanthesedOperation__Group__15155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__SubExpressionsAssignment_2_in_rule__UnaryParanthesedOperation__Group__25183 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__UnaryParanthesedOperation__Group__3_in_rule__UnaryParanthesedOperation__Group__25192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__UnaryParanthesedOperation__Group__35221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__Group__05264 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group__1_in_rule__AndOperation__Group__05272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__0_in_rule__AndOperation__Group__15300 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__1_in_rule__AndOperation__Group_1__05349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__OperatorAssignment_1_1_in_rule__AndOperation__Group_1__15377 = new BitSet(new long[]{0x000000002000E1F0L});
    public static final BitSet FOLLOW_rule__AndOperation__Group_1__2_in_rule__AndOperation__Group_1__15386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndOperation__SubExpressionsAssignment_1_2_in_rule__AndOperation__Group_1__25414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_rule__OrOperation__Group__05454 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group__1_in_rule__OrOperation__Group__05462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__0_in_rule__OrOperation__Group__15490 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__1_in_rule__OrOperation__Group_1__05539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__OperatorAssignment_1_1_in_rule__OrOperation__Group_1__15567 = new BitSet(new long[]{0x000000002000E1F0L});
    public static final BitSet FOLLOW_rule__OrOperation__Group_1__2_in_rule__OrOperation__Group_1__15576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrOperation__SubExpressionsAssignment_1_2_in_rule__OrOperation__Group_1__25604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ParanthesedBooleanExpression__Group_5__05645 = new BitSet(new long[]{0x000000002000E1F0L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__1_in_rule__ParanthesedBooleanExpression__Group_5__05655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_rule__ParanthesedBooleanExpression__Group_5__15683 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ParanthesedBooleanExpression__Group_5__2_in_rule__ParanthesedBooleanExpression__Group_5__15691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParanthesedBooleanExpression__Group_5__25720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__CodeAssignment_0_in_rule__HostCode__Group__05761 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__HostCode__Group__1_in_rule__HostCode__Group__05770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__Group_1__0_in_rule__HostCode__Group__15798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__HostCode__Group_1__05838 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HostCode__Group_1__1_in_rule__HostCode__Group_1__05848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HostCode__TypeAssignment_1_1_in_rule__HostCode__Group_1__15876 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__HostCode__Group_1__2_in_rule__HostCode__Group_1__15885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__HostCode__Group_1__25914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Action__IsImmediateAssignment_05960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Action__DelayAssignment_15999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Action__TriggerAssignment_26030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_rule__Action__EffectsAssignment_3_1_06061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Emission__SignalAssignment_06096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Emission__NewValueAssignment_1_0_16131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Emission__NewValueAssignment_1_1_16162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__VariableAssignment_06197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__Assignment__ExpressionAssignment_2_06232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Assignment__ExpressionAssignment_2_16263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SignalReference__SignalAssignment6298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableReference__VariableAssignment6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment6436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperator_in_rule__ValOperation__OperatorAssignment_06467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__ValOperation__SubExpressionsAssignment_16498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperator_in_rule__PlusOperation__OperatorAssignment_1_16529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rule__PlusOperation__SubExpressionsAssignment_1_26560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultOperation__OperatorAssignment_1_16591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_rule__MultOperation__SubExpressionsAssignment_1_26622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivOperation__OperatorAssignment_1_16653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_rule__DivOperation__SubExpressionsAssignment_1_26684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rule__PreArithmOperation__OperatorAssignment_06715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_rule__PreArithmOperation__SubExpressionsAssignment_26746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_16777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_26808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_06839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperation__SubExpressionsAlternatives_1_0_in_rule__UnaryOperation__SubExpressionsAssignment_16870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rule__UnaryParanthesedOperation__OperatorAssignment_06903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__UnaryParanthesedOperation__SubExpressionsAssignment_26934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorAnd_in_rule__AndOperation__OperatorAssignment_1_16965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_rule__AndOperation__SubExpressionsAssignment_1_26996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorOr_in_rule__OrOperation__OperatorAssignment_1_17027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_rule__OrOperation__SubExpressionsAssignment_1_27058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HostCode__CodeAssignment_07089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HostCode__TypeAssignment_1_17120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emission__Group_1_0__0_in_synpred32139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_0_in_synpred42190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParanthesedValueExpression__Group_5__0_in_synpred102327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_synpred112378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_synpred172609 = new BitSet(new long[]{0x0000000000000002L});

}